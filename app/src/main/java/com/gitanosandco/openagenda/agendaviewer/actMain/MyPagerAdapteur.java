package com.gitanosandco.openagenda.agendaviewer.actMain;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ListAdapter;

import com.gitanosandco.openagenda.agendaviewer.fragInfo.InfoFragment;
import com.gitanosandco.openagenda.agendaviewer.fragEventList.EventListFragment;
import com.gitanosandco.openagenda.agendaviewer.fragMap.MapFragment;

import static com.gitanosandco.openagenda.agendaviewer.Config.NB_TAB;

public class MyPagerAdapteur extends FragmentPagerAdapter {
    ListAdapter lvAdapter;

    public MyPagerAdapteur(FragmentManager fm, ListAdapter lvAdapter) {
        super(fm);
        this.lvAdapter = lvAdapter;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                EventListFragment eventListFragment = new EventListFragment();

                eventListFragment.setListAdapter(lvAdapter);

                return eventListFragment;
            case 1:
                return MapFragment.newInstance();
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
                return "List";
            case 1:
                return "Map";
            case 2:
                return "Info";
            default:
                return null;
        }
    }
}
