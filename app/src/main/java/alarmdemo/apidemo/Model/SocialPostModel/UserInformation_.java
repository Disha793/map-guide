
package alarmdemo.apidemo.Model.SocialPostModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInformation_ {

    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("sFullName")
    @Expose
    private String sFullName;
    @SerializedName("sProfilePicture")
    @Expose
    private String sProfilePicture;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSFullName() {
        return sFullName;
    }

    public void setSFullName(String sFullName) {
        this.sFullName = sFullName;
    }

    public String getSProfilePicture() {
        return sProfilePicture;
    }

    public void setSProfilePicture(String sProfilePicture) {
        this.sProfilePicture = sProfilePicture;
    }

}
