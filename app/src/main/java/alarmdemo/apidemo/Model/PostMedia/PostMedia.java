
package alarmdemo.apidemo.Model.PostMedia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostMedia {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("postMedias")
    @Expose
    private List<PostMedia_> postMedias = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<PostMedia_> getPostMedias() {
        return postMedias;
    }

    public void setPostMedias(List<PostMedia_> postMedias) {
        this.postMedias = postMedias;
    }

}
