package com.gitanosandco.openagenda.agendaviewer.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EventListModel {
    @SerializedName("events")
    private final List<EventModel> events;

    public EventListModel(List<EventModel> events) {
        this.events = events;
    }

    public List<EventModel> getEvents() {
        return events;
    }
}
