
package alarmdemo.apidemo.Model.Comments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Comments {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<PostCommnetDatum> postCommnetData = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<PostCommnetDatum> getPostCommnetData() {
        return postCommnetData;
    }

    public void setPostCommnetData(List<PostCommnetDatum> postCommnetData) {
        this.postCommnetData = postCommnetData;
    }

}
