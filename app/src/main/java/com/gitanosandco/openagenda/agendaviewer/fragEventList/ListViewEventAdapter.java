package com.gitanosandco.openagenda.agendaviewer.fragEventList;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.gitanosandco.openagenda.agendaviewer.R;
import com.gitanosandco.openagenda.agendaviewer.model.Event;

import java.util.ArrayList;

public class ListViewEventAdapter extends ArrayAdapter<Event> {

    public ListViewEventAdapter(Context context) {
        super(context, 0, new ArrayList<Event>());
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_layout,
                    parent, false);
        }

        EventViewHolder eventViewHolder = (EventViewHolder) convertView.getTag();
        if(eventViewHolder == null) {
            eventViewHolder = new EventViewHolder();
            eventViewHolder.title = (TextView) convertView.findViewById(R.id.a_main_txtv_lv);
            convertView.setTag(eventViewHolder);
        }

        Event event = getItem(position);

        assert event != null;
        eventViewHolder.title.setText(String.valueOf(event.getUid()));

        return convertView;
    }
}
