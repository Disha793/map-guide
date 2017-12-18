
package alarmdemo.apidemo.Model.NotificationModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Notification {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("dUpdatedDate")
    @Expose
    private String dUpdatedDate;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("post_id")
    @Expose
    private String postId;


    @SerializedName("story_id")
    @Expose
    private String storyId;

    public String getStoryId() {
        return storyId;
    }

    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDUpdatedDate() {
        return dUpdatedDate;
    }

    public void setDUpdatedDate(String dUpdatedDate) {
        this.dUpdatedDate = dUpdatedDate;
    }

    public String getDCreatedDate() {
        return dCreatedDate;
    }

    public void setDCreatedDate(String dCreatedDate) {
        this.dCreatedDate = dCreatedDate;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

}
