
package alarmdemo.apidemo.Model.CreatePost;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreatePostModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("lastAddedPost")
    @Expose
    private LastAddedPost lastAddedPost;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LastAddedPost getLastAddedPost() {
        return lastAddedPost;
    }

    public void setLastAddedPost(LastAddedPost lastAddedPost) {
        this.lastAddedPost = lastAddedPost;
    }

}
