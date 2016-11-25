package com.gitanosandco.openagenda.agendaviewer.fragEventList;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.gitanosandco.openagenda.agendaviewer.R;
import com.gitanosandco.openagenda.agendaviewer.api.RequestHolder;
import com.gitanosandco.openagenda.agendaviewer.model.Event;

import java.util.ArrayList;

public class ListViewEventAdapter extends ArrayAdapter<Event> implements Filterable {

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
        ImageLoader imageLoader = RequestHolder.getInstance().getImageLoader(getContext());

        EventViewHolder eventViewHolder = (EventViewHolder) convertView.getTag();
        if(eventViewHolder == null) {
            eventViewHolder = new EventViewHolder();
            eventViewHolder.image = (NetworkImageView) convertView.findViewById(R.id.img_details);
            eventViewHolder.title = (TextView) convertView.findViewById(R.id.f_list_row_title);
            eventViewHolder.location = (TextView) convertView.findViewById(R.id.f_list_row_loc);
            eventViewHolder.shortDesc = (TextView) convertView.findViewById(R.id.f_list_row_desc);
            eventViewHolder.date = (TextView) convertView.findViewById(R.id.f_list_row_date);
            convertView.setTag(eventViewHolder);
        }

        Event event = getItem(position);

        assert event != null;
        eventViewHolder.image.setDefaultImageResId(R.drawable.ic_loading_120dp);
        eventViewHolder.image.setErrorImageResId(R.drawable.ic_error_120dp);
        if(URLUtil.isValidUrl(event.getThumbnail())) {
            eventViewHolder.image.setImageUrl(event.getThumbnail(), imageLoader);
        }
        else {
            eventViewHolder.image.setImageResource(R.drawable.ic_image_120dp);
        }
        eventViewHolder.title.setText(event.getTitle().getFr());
        eventViewHolder.location.setText(event.getLocationName());
        eventViewHolder.shortDesc.setText(event.getDescription().getFr());
        eventViewHolder.date.setText(event.getFirstDate());

        return convertView;
    }

    public void setTextFilterEnabled(boolean textFilterEnabled) {
        this.textFilterEnabled = textFilterEnabled;
    }
}
