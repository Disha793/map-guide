
package alarmdemo.apidemo.Model.TopPostModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TopPostModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("postData")
    @Expose
    private List<PostDatum> postData = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<PostDatum> getPostData() {
        return postData;
    }

    public void setPostData(List<PostDatum> postData) {
        this.postData = postData;
    }

}
