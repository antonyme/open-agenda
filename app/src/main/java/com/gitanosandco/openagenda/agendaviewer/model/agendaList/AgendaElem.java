
package com.gitanosandco.openagenda.agendaviewer.model.agendaList;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AgendaElem {

    @SerializedName("uid")
    @Expose
    private Integer uid;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("publishedEvents")
    @Expose
    private Integer publishedEvents;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("official")
    @Expose
    private Integer official;
    @SerializedName("upcomingPublishedEvents")
    @Expose
    private Integer upcomingPublishedEvents;
    @SerializedName("hasUpcomingPublished")
    @Expose
    private Boolean hasUpcomingPublished;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AgendaElem() {
    }

    /**
     * 
     * @param updatedAt
     * @param id
     * @param uid
     * @param title
     * @param upcomingPublishedEvents
     * @param hasUpcomingPublished
     * @param description
     * @param createdAt
     * @param publishedEvents
     * @param official
     * @param image
     * @param slug
     */
    public AgendaElem(Integer uid, String image, String createdAt, Integer publishedEvents, String description, Integer official, Integer upcomingPublishedEvents, Boolean hasUpcomingPublished, Integer id, String title, String slug, String updatedAt) {
        this.uid = uid;
        this.image = image;
        this.createdAt = createdAt;
        this.publishedEvents = publishedEvents;
        this.description = description;
        this.official = official;
        this.upcomingPublishedEvents = upcomingPublishedEvents;
        this.hasUpcomingPublished = hasUpcomingPublished;
        this.id = id;
        this.title = title;
        this.slug = slug;
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * @return
     *     The uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 
     * @param uid
     *     The uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 
     * @return
     *     The image
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The publishedEvents
     */
    public Integer getPublishedEvents() {
        return publishedEvents;
    }

    /**
     * 
     * @param publishedEvents
     *     The publishedEvents
     */
    public void setPublishedEvents(Integer publishedEvents) {
        this.publishedEvents = publishedEvents;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The official
     */
    public Integer getOfficial() {
        return official;
    }

    /**
     * 
     * @param official
     *     The official
     */
    public void setOfficial(Integer official) {
        this.official = official;
    }

    /**
     * 
     * @return
     *     The upcomingPublishedEvents
     */
    public Integer getUpcomingPublishedEvents() {
        return upcomingPublishedEvents;
    }

    /**
     * 
     * @param upcomingPublishedEvents
     *     The upcomingPublishedEvents
     */
    public void setUpcomingPublishedEvents(Integer upcomingPublishedEvents) {
        this.upcomingPublishedEvents = upcomingPublishedEvents;
    }

    /**
     * 
     * @return
     *     The hasUpcomingPublished
     */
    public Boolean getHasUpcomingPublished() {
        return hasUpcomingPublished;
    }

    /**
     * 
     * @param hasUpcomingPublished
     *     The hasUpcomingPublished
     */
    public void setHasUpcomingPublished(Boolean hasUpcomingPublished) {
        this.hasUpcomingPublished = hasUpcomingPublished;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updatedAt
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
