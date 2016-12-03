package com.gitanosandco.openagenda.agendaviewer.actMain;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.gitanosandco.openagenda.agendaviewer.Config;
import com.gitanosandco.openagenda.agendaviewer.R;
import com.gitanosandco.openagenda.agendaviewer.actDetail.DetailActivity;
import com.gitanosandco.openagenda.agendaviewer.fragEventList.EventListFragment;
import com.gitanosandco.openagenda.agendaviewer.fragMap.MapData;
import com.gitanosandco.openagenda.agendaviewer.model.agenda.Agenda;
import com.gitanosandco.openagenda.agendaviewer.api.RequestHolder;
import com.gitanosandco.openagenda.agendaviewer.fragEventList.ListViewEventAdapter;
import com.gitanosandco.openagenda.agendaviewer.model.agenda.Event;
import com.gitanosandco.openagenda.agendaviewer.model.agendaList.AgendaElem;
import com.gitanosandco.openagenda.agendaviewer.model.agendaList.AgendaList;
import com.gitanosandco.openagenda.agendaviewer.util.Util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements EventListFragment.ListFragmentItemClickListener {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ListViewEventAdapter lvAdapter;
    private MapData mapData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.a_main_toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.a_main_tpager);
        viewPager = (ViewPager) findViewById(R.id.a_main_vpager);

        setupViewPager();

        loadEventList(Config.DEFAULT_AGENDA_UID, Config.DEFAULT_AGENDA_TITLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_refresh:
                loadNewAgendaRandom();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Creates empty elements, ready to receive data, of the viewPager.
     */
    private void setupViewPager() {
        //eventList
        lvAdapter = new ListViewEventAdapter(MainActivity.this);

        //map
        mapData = new MapData();

        //viewPager
        MyPagerAdapteur pagerAdapteur =
                new MyPagerAdapteur(getSupportFragmentManager(), lvAdapter, mapData);
        viewPager.setAdapter(pagerAdapteur);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void loadNewAgendaRandom() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                Config.URL_AGENDAS,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new GsonBuilder().create();
                        List<AgendaElem> result = gson.fromJson(response, AgendaList.class).getAgendaElems();
                        AgendaElem chosen = result.get(new Random().nextInt(result.size()));
                        loadEventList(chosen.getUid(), chosen.getTitle());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("network", "API - agenda list call failed : " + error.getMessage());
                    }
                }
        );
        RequestHolder.getInstance().getRequestQueue(MainActivity.this).add(stringRequest);
    }

    /**
     * Send a request to get the events of the agenda.
     * onResponse : fill the list view and the map
     */
    private void loadEventList(final int agendaUid, final String agendaTitle) {
        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                Config.URL_EVENTS_BASE + agendaUid + Config.URL_EVENTS_END,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new GsonBuilder().create();
                        List<Event> events = gson.fromJson(response, Agenda.class).getEvents();

                        lvAdapter.clear();
                        lvAdapter.addAll(events);
                        lvAdapter.notifyDataSetChanged();

                        mapData.setEventMarks(Util.EventsToMarkerOption(events));
                        setTitle(agendaTitle);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("network", "API - event list call failed : " + error.getMessage());
                    }
                }
        );
        RequestHolder.getInstance().getRequestQueue(MainActivity.this).add(stringRequest);
    }

    /**
     * Launch the DetailActivity to give details on the event
     * @param event Details about the clicked event
     */
    @Override
    public void onListFragmentItemClick(Event event) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("event", event);
        this.startActivity(intent);
    }
}
