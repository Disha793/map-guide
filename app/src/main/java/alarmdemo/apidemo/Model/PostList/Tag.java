
package alarmdemo.apidemo.Model.PostList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tag {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("post_id")
    @Expose
    private String postId;
    @SerializedName("UserInformation")
    @Expose
    private UserInformation_ userInformation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public UserInformation_ getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation_ userInformation) {
        this.userInformation = userInformation;
    }

}
