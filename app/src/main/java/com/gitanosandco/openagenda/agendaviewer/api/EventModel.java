package com.gitanosandco.openagenda.agendaviewer.api;

public class EventModel {
    private final int uid;

    public EventModel(int uid) {
        this.uid = uid;
    }

    public int getUid() {
        return uid;
    }
}
