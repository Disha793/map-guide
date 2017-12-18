
package alarmdemo.apidemo.Model.NewsListModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import alarmdemo.apidemo.Model.LikedDisliked.LikedDisliked;

public class News {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("other")
    @Expose
    private String other;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("deck_count")
    @Expose
    private Integer deckCount;
    @SerializedName("newsDecked")
    @Expose
    private List<NewsDecked> newsDecked = null;
    @SerializedName("newsSource")
    @Expose
    private List<NewsSource> newsSource = null;

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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getDeckCount() {
        return deckCount;
    }

    public void setDeckCount(Integer deckCount) {
        this.deckCount = deckCount;
    }

    public List<NewsDecked> getNewsDecked() {
        return newsDecked;
    }

    public void setNewsDecked(List<NewsDecked> newsDecked) {
        this.newsDecked = newsDecked;
    }

    public List<NewsSource> getNewsSource() {
        return newsSource;
    }

    public void setNewsSource(List<NewsSource> newsSource) {
        this.newsSource = newsSource;
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
