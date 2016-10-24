package com.gitanosandco.openagenda.agendaviewer;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link ListFragment} subclass.
 * Use the {@link EventListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventListFragment extends ListFragment {

    public EventListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
}
