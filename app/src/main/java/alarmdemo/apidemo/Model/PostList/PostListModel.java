
package alarmdemo.apidemo.Model.PostList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostListModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("postData")
    @Expose
    private List<PostDatum> postData = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

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

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
