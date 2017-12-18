
package alarmdemo.apidemo.Model.SendFollowReq;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SendFollowReqModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("FollowRequest")
    @Expose
    private FollowRequest followRequest;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FollowRequest getFollowRequest() {
        return followRequest;
    }

    public void setFollowRequest(FollowRequest followRequest) {
        this.followRequest = followRequest;
    }

}
