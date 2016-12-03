package com.gitanosandco.openagenda.agendaviewer.util;

import com.gitanosandco.openagenda.agendaviewer.model.agenda.Event;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<MarkerOptions> EventsToMarkerOption(List<Event> events) {
        List<MarkerOptions> markers = new ArrayList<>();
        for (Event event : events) {
            MarkerOptions marker = new MarkerOptions()
                    .position(new LatLng(event.getLatitude(), event.getLongitude()))
                    .title(event.getTitle().getFr());
            markers.add(marker);
        }
        return markers;
    }
}
