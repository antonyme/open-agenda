package com.gitanosandco.openagenda.agendaviewer;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ListFragment;
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
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ListFragment eventListFragment;
    private ListViewEventAdapter lvAdapteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.a_main_tpager);
        viewPager = (ViewPager) findViewById(R.id.a_main_vpager);
        eventListFragment = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.f_list);

        initEventList();
    }

    @Override
    protected void onStart() {
        super.onStart();

        setupViewPager();
    }

    private void setupViewPager() {
        //eventList
        lvAdapteur = new ListViewEventAdapter(MainActivity.this);

        //viewPager
        MyPagerAdapteur pagerAdapteur = new MyPagerAdapteur(getSupportFragmentManager(), lvAdapteur);
        viewPager.setAdapter(pagerAdapteur);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initEventList() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                Config.URL_AGENDA,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new GsonBuilder().create();
                        lvAdapteur.clear();
                        lvAdapteur.addAll(
                                gson.fromJson(response, EventListModel.class).getEvents());
                        lvAdapteur.notifyDataSetChanged();

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
