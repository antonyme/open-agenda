package com.gitanosandco.openagenda.agendaviewer;

import com.gitanosandco.openagenda.agendaviewer.api.EventModel;

import java.util.ArrayList;
import java.util.List;

//Singleton holding the event list data
public enum EventListHolder {
    INSTANCE;
    private List<EventModel> eventList = new ArrayList<>();

    public void setEventList(List<EventModel> eventList) {
        this.eventList = eventList;
    }

    public List<EventModel> getEventList() {
        return eventList;
    }
}
