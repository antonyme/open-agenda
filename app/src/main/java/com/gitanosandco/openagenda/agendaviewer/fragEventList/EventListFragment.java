package com.gitanosandco.openagenda.agendaviewer.fragEventList;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.gitanosandco.openagenda.agendaviewer.R;
import com.gitanosandco.openagenda.agendaviewer.model.Event;

import java.util.Collections;
import java.util.Comparator;

/**
 * A simple {@link ListFragment} subclass.
 */
public class EventListFragment extends ListFragment {
    private ListFragmentItemClickListener listener;

    public EventListFragment() {
    }

    public interface ListFragmentItemClickListener {
        public void onListFragmentItemClick(Event event);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState, ListViewEventAdapter lvAdapter) {

        return inflater.inflate(R.layout.fragment_list, container, false);
        lvAdapter.setTextFilterEnabled(true);
        setupSearchView();


    }
    private void setupSearchView()
    {
        mSearchView.setIconifiedByDefault(false);
        mSearchView.setOnQueryTextListener(this);
        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setQueryHint("Search Here");
    }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (ListFragmentItemClickListener) context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        listener.onListFragmentItemClick((Event) l.getAdapter().getItem(position));
    }
}
