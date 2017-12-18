
package alarmdemo.apidemo.Model.UserStories;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import alarmdemo.apidemo.Model.LikedDisliked.LikedDisliked;

public class UserStoryDatum {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("sUserid")
    @Expose
    private String sUserid;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("storyLiked")
    @Expose
    private List<LikedDisliked> storyLiked = null;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSUserid() {
        return sUserid;
    }

    public void setSUserid(String sUserid) {
        this.sUserid = sUserid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDUpdateDate() {
        return dUpdateDate;
    }

    public void setDUpdateDate(String dUpdateDate) {
        this.dUpdateDate = dUpdateDate;
    }

    public String getDCreatedDate() {
        return dCreatedDate;
    }

    public void setDCreatedDate(String dCreatedDate) {
        this.dCreatedDate = dCreatedDate;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public List<LikedDisliked> getStoryLiked() {
        return storyLiked;
    }

    public void setStoryLiked(List<LikedDisliked> storyLiked) {
        this.storyLiked = storyLiked;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

}
