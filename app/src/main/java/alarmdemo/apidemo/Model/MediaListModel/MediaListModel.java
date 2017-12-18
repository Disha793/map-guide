
package alarmdemo.apidemo.Model.MediaListModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaListModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("postMedias")
    @Expose
    private List<PostMedia> postMedias = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<PostMedia> getPostMedias() {
        return postMedias;
    }

    public void setPostMedias(List<PostMedia> postMedias) {
        this.postMedias = postMedias;
    }

}
