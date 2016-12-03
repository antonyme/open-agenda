
package com.gitanosandco.openagenda.agendaviewer.model.agenda;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Event implements Serializable {

    @SerializedName("uid")
    @Expose
    private Integer uid;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("canonicalUrl")
    @Expose
    private String canonicalUrl;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("longDescription")
    @Expose
    private LongDescription longDescription;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("originalImage")
    @Expose
    private String originalImage;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("range")
    @Expose
    private Range range;
    @SerializedName("conditions")
    @Expose
    private Conditions conditions;
    @SerializedName("registrationUrl")
    @Expose
    private String registrationUrl;
    @SerializedName("locationName")
    @Expose
    private String locationName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("postalCode")
    @Expose
    private String postalCode;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("timings")
    @Expose
    private List<Timing> timings = new ArrayList<Timing>();
    @SerializedName("firstDate")
    @Expose
    private String firstDate;
    @SerializedName("firstTimeStart")
    @Expose
    private String firstTimeStart;
    @SerializedName("firstTimeEnd")
    @Expose
    private String firstTimeEnd;
    @SerializedName("category")
    @Expose
    private Category category;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Event() {
    }

    /**
     * 
     * @param uid
     * @param firstDate
     * @param range
     * @param timings
     * @param image
     * @param locationName
     * @param city
     * @param updatedAt
     * @param conditions
     * @param category
     * @param title
     * @param postalCode
     * @param thumbnail
     * @param originalImage
     * @param firstTimeEnd
     * @param address
     * @param canonicalUrl
     * @param description
     * @param longDescription
     * @param longitude
     * @param slug
     * @param firstTimeStart
     * @param latitude
     * @param registrationUrl
     */
    public Event(Integer uid, String slug, String canonicalUrl, Title title, Description description, LongDescription longDescription, String image, String thumbnail, String originalImage, String updatedAt, Range range, Conditions conditions, String registrationUrl, String locationName, String address, String postalCode, String city, Double latitude, Double longitude, List<Timing> timings, String firstDate, String firstTimeStart, String firstTimeEnd, Category category) {
        this.uid = uid;
        this.slug = slug;
        this.canonicalUrl = canonicalUrl;
        this.title = title;
        this.description = description;
        this.longDescription = longDescription;
        this.image = image;
        this.thumbnail = thumbnail;
        this.originalImage = originalImage;
        this.updatedAt = updatedAt;
        this.range = range;
        this.conditions = conditions;
        this.registrationUrl = registrationUrl;
        this.locationName = locationName;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timings = timings;
        this.firstDate = firstDate;
        this.firstTimeStart = firstTimeStart;
        this.firstTimeEnd = firstTimeEnd;
        this.category = category;
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
     *     The canonicalUrl
     */
    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    /**
     * 
     * @param canonicalUrl
     *     The canonicalUrl
     */
    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    /**
     * 
     * @return
     *     The title
     */
    public Title getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Description getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Description description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The longDescription
     */
    public LongDescription getLongDescription() {
        return longDescription;
    }

    /**
     * 
     * @param longDescription
     *     The longDescription
     */
    public void setLongDescription(LongDescription longDescription) {
        this.longDescription = longDescription;
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
     *     The thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 
     * @param thumbnail
     *     The thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 
     * @return
     *     The originalImage
     */
    public String getOriginalImage() {
        return originalImage;
    }

    /**
     * 
     * @param originalImage
     *     The originalImage
     */
    public void setOriginalImage(String originalImage) {
        this.originalImage = originalImage;
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

    /**
     * 
     * @return
     *     The range
     */
    public Range getRange() {
        return range;
    }

    /**
     * 
     * @param range
     *     The range
     */
    public void setRange(Range range) {
        this.range = range;
    }

    /**
     * 
     * @return
     *     The conditions
     */
    public Conditions getConditions() {
        return conditions;
    }

    /**
     * 
     * @param conditions
     *     The conditions
     */
    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * @return
     *     The registrationUrl
     */
    public String getRegistrationUrl() {
        return registrationUrl;
    }

    /**
     * 
     * @param registrationUrl
     *     The registrationUrl
     */
    public void setRegistrationUrl(String registrationUrl) {
        this.registrationUrl = registrationUrl;
    }

    /**
     * 
     * @return
     *     The locationName
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * 
     * @param locationName
     *     The locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The timings
     */
    public List<Timing> getTimings() {
        return timings;
    }

    /**
     * 
     * @param timings
     *     The timings
     */
    public void setTimings(List<Timing> timings) {
        this.timings = timings;
    }

    /**
     * 
     * @return
     *     The firstDate
     */
    public String getFirstDate() {
        return firstDate;
    }

    /**
     * 
     * @param firstDate
     *     The firstDate
     */
    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    /**
     * 
     * @return
     *     The firstTimeStart
     */
    public String getFirstTimeStart() {
        return firstTimeStart;
    }

    /**
     * 
     * @param firstTimeStart
     *     The firstTimeStart
     */
    public void setFirstTimeStart(String firstTimeStart) {
        this.firstTimeStart = firstTimeStart;
    }

    /**
     * 
     * @return
     *     The firstTimeEnd
     */
    public String getFirstTimeEnd() {
        return firstTimeEnd;
    }

    /**
     * 
     * @param firstTimeEnd
     *     The firstTimeEnd
     */
    public void setFirstTimeEnd(String firstTimeEnd) {
        this.firstTimeEnd = firstTimeEnd;
    }

    /**
     * 
     * @return
     *     The category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

}
