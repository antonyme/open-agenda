
package com.gitanosandco.openagenda.agendaviewer.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Agenda implements Serializable {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("events")
    @Expose
    private List<Event> events = new ArrayList<Event>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Agenda() {
    }

    /**
     * 
     * @param limit
     * @param total
     * @param events
     * @param offset
     */
    public Agenda(Integer total, Integer offset, Integer limit, List<Event> events) {
        this.total = total;
        this.offset = offset;
        this.limit = limit;
        this.events = events;
    }

    /**
     * 
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * 
     * @param offset
     *     The offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * 
     * @return
     *     The limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * 
     * @param limit
     *     The limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * 
     * @return
     *     The events
     */
    public List<Event> getEvents() {
        return events;
    }

    /**
     * 
     * @param events
     *     The events
     */
    public void setEvents(List<Event> events) {
        this.events = events;
    }

}
