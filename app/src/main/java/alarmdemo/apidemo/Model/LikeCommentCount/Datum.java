
package alarmdemo.apidemo.Model.LikeCommentCount;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("liked")
    @Expose
    private List<Liked> liked = null;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public List<Liked> getLiked() {
        return liked;
    }

    public void setLiked(List<Liked> liked) {
        this.liked = liked;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

}
