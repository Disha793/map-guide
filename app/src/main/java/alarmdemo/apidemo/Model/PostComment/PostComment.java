
package alarmdemo.apidemo.Model.PostComment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostComment {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("PostComment")
    @Expose
    private PostComment_ postComment;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PostComment_ getPostComment() {
        return postComment;
    }

    public void setPostComment(PostComment_ postComment) {
        this.postComment = postComment;
    }

}
