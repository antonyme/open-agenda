
package com.gitanosandco.openagenda.agendaviewer.model.agenda;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
public class Timing implements Serializable {

    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("end")
    @Expose
    private String end;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Timing() {
    }

    /**
     * 
     * @param start
     * @param end
     */
    public Timing(String start, String end) {
        this.start = start;
        this.end = end;
    }

    /**
     * 
     * @return
     *     The start
     */
    public String getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * 
     * @return
     *     The end
     */
    public String getEnd() {
        return end;
    }

    /**
     * 
     * @param end
     *     The end
     */
    public void setEnd(String end) {
        this.end = end;
    }

}
