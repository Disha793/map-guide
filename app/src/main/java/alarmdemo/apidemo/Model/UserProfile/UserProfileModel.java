
package alarmdemo.apidemo.Model.UserProfile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserProfileModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("userInfo")
    @Expose
    private List<UserInfo> userInfo = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserInfo> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<UserInfo> userInfo) {
        this.userInfo = userInfo;
    }

}
