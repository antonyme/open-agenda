
package com.gitanosandco.openagenda.agendaviewer.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
public class Range implements Serializable {

    @SerializedName("fr")
    @Expose
    private String fr;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Range() {
    }

    /**
     * 
     * @param fr
     */
    public Range(String fr) {
        this.fr = fr;
    }

    /**
     * 
     * @return
     *     The fr
     */
    public String getFr() {
        return fr;
    }

    /**
     * 
     * @param fr
     *     The fr
     */
    public void setFr(String fr) {
        this.fr = fr;
    }

}
