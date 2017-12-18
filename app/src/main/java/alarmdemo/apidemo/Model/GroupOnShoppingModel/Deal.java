
package alarmdemo.apidemo.Model.GroupOnShoppingModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import alarmdemo.apidemo.Model.LikedDisliked.LikedDisliked;

public class Deal {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("identifire")
    @Expose
    private String identifire;
    @SerializedName("finePrint")
    @Expose
    private String finePrint;
    @SerializedName("highlightsHtml")
    @Expose
    private String highlightsHtml;
    @SerializedName("pitchHtml")
    @Expose
    private String pitchHtml;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("options")
    @Expose
    private List<Option> options = null;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("sidebarImageUrl")
    @Expose
    private String sidebarImageUrl;
    @SerializedName("smallImageUrl")
    @Expose
    private String smallImageUrl;
    @SerializedName("mediumImageUrl")
    @Expose
    private String mediumImageUrl;
    @SerializedName("largeImageUrl")
    @Expose
    private String largeImageUrl;
    @SerializedName("grid6ImageUrl")
    @Expose
    private String grid6ImageUrl;
    @SerializedName("grid4ImageUrl")
    @Expose
    private String grid4ImageUrl;
    @SerializedName("placeholderUrl")
    @Expose
    private String placeholderUrl;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("Liked")
    @Expose
    private List<LikedDisliked> liked = null;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIdentifire() {
        return identifire;
    }

    public void setIdentifire(String identifire) {
        this.identifire = identifire;
    }

    public String getFinePrint() {
        return finePrint;
    }

    public void setFinePrint(String finePrint) {
        this.finePrint = finePrint;
    }

    public String getHighlightsHtml() {
        return highlightsHtml;
    }

    public void setHighlightsHtml(String highlightsHtml) {
        this.highlightsHtml = highlightsHtml;
    }

    public String getPitchHtml() {
        return pitchHtml;
    }

    public void setPitchHtml(String pitchHtml) {
        this.pitchHtml = pitchHtml;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getSidebarImageUrl() {
        return sidebarImageUrl;
    }

    public void setSidebarImageUrl(String sidebarImageUrl) {
        this.sidebarImageUrl = sidebarImageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getGrid6ImageUrl() {
        return grid6ImageUrl;
    }

    public void setGrid6ImageUrl(String grid6ImageUrl) {
        this.grid6ImageUrl = grid6ImageUrl;
    }

    public String getGrid4ImageUrl() {
        return grid4ImageUrl;
    }

    public void setGrid4ImageUrl(String grid4ImageUrl) {
        this.grid4ImageUrl = grid4ImageUrl;
    }

    public String getPlaceholderUrl() {
        return placeholderUrl;
    }

    public void setPlaceholderUrl(String placeholderUrl) {
        this.placeholderUrl = placeholderUrl;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public List<LikedDisliked> getLiked() {
        return liked;
    }

    public void setLiked(List<LikedDisliked> liked) {
        this.liked = liked;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

}
