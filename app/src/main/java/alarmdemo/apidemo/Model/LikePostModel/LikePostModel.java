
package alarmdemo.apidemo.Model.LikePostModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LikePostModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("PostLike")
    @Expose
    private PostLike postLike;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PostLike getPostLike() {
        return postLike;
    }

    public void setPostLike(PostLike postLike) {
        this.postLike = postLike;
    }

}
