package com.gitanosandco.openagenda.agendaviewer.actMain;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ListAdapter;

import com.gitanosandco.openagenda.agendaviewer.Config;
import com.gitanosandco.openagenda.agendaviewer.fragInfo.InfoFragment;
import com.gitanosandco.openagenda.agendaviewer.fragEventList.EventListFragment;
import com.gitanosandco.openagenda.agendaviewer.fragMap.MapData;
import com.gitanosandco.openagenda.agendaviewer.fragMap.MapFragment;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import static com.gitanosandco.openagenda.agendaviewer.Config.NB_TAB;

/**
 * Class taking care of the transitions between fragments of different tabs.
 * It also listens to changes in mapData to update mapFragment.
 */
class MyPagerAdapteur extends FragmentPagerAdapter implements PropertyChangeListener {
    private ListAdapter lvAdapter;
    private MapData mapData;
    private MapFragment mapFragment;

    MyPagerAdapteur(FragmentManager fm, ListAdapter lvAdapter, MapData mapData) {
        super(fm);
        this.lvAdapter = lvAdapter;
        this.mapData = mapData;
        mapData.addChangeListener(this);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                EventListFragment eventListFragment = new EventListFragment();
                eventListFragment.setListAdapter(lvAdapter);
                return eventListFragment;
            case 1:
                mapFragment = MapFragment.newInstance();
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("key",
                        (ArrayList<? extends Parcelable>) mapData.getEventMarks());
                mapFragment.setArguments(bundle);
                return mapFragment;
            case 2:
                return InfoFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NB_TAB;
    }

    @Override
    public String getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Liste";
            case 1:
                return "Carte";
            case 2:
                return "Info";
            default:
                return null;
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        if(event.getPropertyName().equals(Config.MAP_DATA)) {
            if(mapFragment != null) {
                mapFragment.getArguments().putParcelableArrayList("key",
                        (ArrayList<? extends Parcelable>) mapData.getEventMarks());
                mapFragment.updateMap();
            }
        }
    }
}
