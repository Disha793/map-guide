
package alarmdemo.apidemo.Model.SendFriendRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SendFriendReqModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("FriendRequest")
    @Expose
    private FriendRequest friendRequest;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FriendRequest getFriendRequest() {
        return friendRequest;
    }

    public void setFriendRequest(FriendRequest friendRequest) {
        this.friendRequest = friendRequest;
    }

}
