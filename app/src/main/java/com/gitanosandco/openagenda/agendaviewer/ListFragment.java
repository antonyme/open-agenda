package com.gitanosandco.openagenda.agendaviewer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.gitanosandco.openagenda.agendaviewer.api.EventModel;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {
    ListView listView;
    ListViewEventAdapter lvAdapteur;

    public ListFragment() {
    }

    public static ListFragment newInstance() {
        ListFragment fragment = new ListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list, container, false);
        listView = (ListView) v.findViewById(R.id.f_list_lv);
        lvAdapteur = new ListViewEventAdapter(
                getContext(), EventListHolder.INSTANCE.getEventList());
            listView.setAdapter(lvAdapteur);
        return v;
    }

    public void updateEventList(List<EventModel> newList) {
        if(lvAdapteur != null) {
            lvAdapteur.clear();
            lvAdapteur.addAll(newList);
            lvAdapteur.notifyDataSetChanged();
        }
    }
}
