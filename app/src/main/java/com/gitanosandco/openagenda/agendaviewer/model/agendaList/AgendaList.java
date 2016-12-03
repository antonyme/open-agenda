
package com.gitanosandco.openagenda.agendaviewer.model.agendaList;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AgendaList {

    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("agendas")
    @Expose
    private List<AgendaElem> agendaElems = new ArrayList<AgendaElem>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AgendaList() {
    }

    /**
     * 
     * @param total
     * @param limit
     * @param agendaElems
     * @param offset
     */
    public AgendaList(Integer offset, Integer limit, Integer total, List<AgendaElem> agendaElems) {
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.agendaElems = agendaElems;
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
     *     The agendaElems
     */
    public List<AgendaElem> getAgendaElems() {
        return agendaElems;
    }

    /**
     * 
     * @param agendaElems
     *     The agendaElems
     */
    public void setAgendaElems(List<AgendaElem> agendaElems) {
        this.agendaElems = agendaElems;
    }

}
