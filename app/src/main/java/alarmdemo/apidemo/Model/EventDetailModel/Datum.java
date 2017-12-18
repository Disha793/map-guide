
package alarmdemo.apidemo.Model.EventDetailModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("sAddress")
    @Expose
    private String sAddress;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("images")
    @Expose
    private String images;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("eventLiked")
    @Expose
    private List<EventLiked> eventLiked = null;
    @SerializedName("deck_count")
    @Expose
    private Integer deckCount;
    @SerializedName("eventDecked")
    @Expose
    private List<Object> eventDecked = null;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public List<EventLiked> getEventLiked() {
        return eventLiked;
    }

    public void setEventLiked(List<EventLiked> eventLiked) {
        this.eventLiked = eventLiked;
    }

    public Integer getDeckCount() {
        return deckCount;
    }

    public void setDeckCount(Integer deckCount) {
        this.deckCount = deckCount;
    }

    public List<Object> getEventDecked() {
        return eventDecked;
    }

    public void setEventDecked(List<Object> eventDecked) {
        this.eventDecked = eventDecked;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

}
