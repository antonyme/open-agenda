package com.gitanosandco.openagenda.agendaviewer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.gitanosandco.openagenda.agendaviewer.api.EventModel;

import java.util.List;

import static com.gitanosandco.openagenda.agendaviewer.Config.NB_TAB;

public class MyPagerAdapteur extends FragmentPagerAdapter {

    public MyPagerAdapteur(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ListFragment.newInstance();
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
