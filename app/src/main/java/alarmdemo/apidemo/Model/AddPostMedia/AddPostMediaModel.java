
package alarmdemo.apidemo.Model.AddPostMedia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddPostMediaModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("postMedia")
    @Expose
    private PostMedia postMedia;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PostMedia getPostMedia() {
        return postMedia;
    }

    public void setPostMedia(PostMedia postMedia) {
        this.postMedia = postMedia;
    }

}
