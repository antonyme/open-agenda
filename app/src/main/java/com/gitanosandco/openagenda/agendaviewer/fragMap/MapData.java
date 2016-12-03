package com.gitanosandco.openagenda.agendaviewer.fragMap;

import com.gitanosandco.openagenda.agendaviewer.Config;
import com.google.android.gms.maps.model.MarkerOptions;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MapData implements Serializable {

    private List<MarkerOptions> eventMarks = new ArrayList<>();
    private List<PropertyChangeListener> listeners = new ArrayList<>();

    public MapData() {
    }

    public List<MarkerOptions> getEventMarks() {
        return eventMarks;
    }

    public void setEventMarks(List<MarkerOptions> eventMarks) {
        notifyListeners(this,
                Config.MAP_DATA,
                this.eventMarks,
                this.eventMarks = eventMarks);
    }

    private void notifyListeners(Object object, String property,
                                 List<MarkerOptions> oldValue,
                                 List<MarkerOptions> newValue) {
        for (PropertyChangeListener listener : listeners) {
            listener.propertyChange(new PropertyChangeEvent(object, property, oldValue, newValue));
        }
    }

    public void addChangeListener(PropertyChangeListener listener) {
        listeners.add(listener);
    }
}
