
package alarmdemo.apidemo.Model.AddDevice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddDeviceModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("userProfile")
    @Expose
    private List<UserProfile> userProfile = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserProfile> getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(List<UserProfile> userProfile) {
        this.userProfile = userProfile;
    }

}
