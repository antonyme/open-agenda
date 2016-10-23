package com.gitanosandco.openagenda.agendaviewer;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.gitanosandco.openagenda.agendaviewer.api.EventListModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private MyPagerAdapteur pagerAdapteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initEventList();

        pagerAdapteur = new MyPagerAdapteur(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.a_main_vpager);
        viewPager.setAdapter(pagerAdapteur);
    }

    private void initEventList() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                Config.URL_AGENDA,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new GsonBuilder().create();
                        EventListHolder.INSTANCE.setEventList(
                                gson.fromJson(response, EventListModel.class).getEvents());
                        ListView lv = (ListView) findViewById(R.id.f_list_lv);
                        ListViewEventAdapter lvAdapteur = new ListViewEventAdapter(
                                MainActivity.this, EventListHolder.INSTANCE.getEventList());
                        lv.setAdapter(lvAdapteur);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("network", "API call failed");
                    }
                }
        );
        RequestHolder.getInstance().getRequestQueue(MainActivity.this).add(stringRequest);
    }

}
