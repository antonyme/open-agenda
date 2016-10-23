package com.gitanosandco.openagenda.agendaviewer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.gitanosandco.openagenda.agendaviewer.api.EventModel;

import java.util.List;

import static com.gitanosandco.openagenda.agendaviewer.Config.NB_TAB;

public class MyPagerAdapteur extends FragmentPagerAdapter {
    private ListFragment listFragment;
    private MapFragment mapFragment;
    private InfoFragment infoFragment;

    public MyPagerAdapteur(FragmentManager fm) {
        super(fm);
        listFragment = ListFragment.newInstance();
        mapFragment = MapFragment.newInstance();
        infoFragment = InfoFragment.newInstance();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return listFragment;
            case 1:
                return mapFragment;
            case 2:
                return infoFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NB_TAB;
    }

    public void updateListFragmentData(List<EventModel> newData) {
        if(listFragment != null){
            listFragment.updateEventList(newData);
        }
    }
}
