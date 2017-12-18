
package alarmdemo.apidemo.Model.PendingFriend;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInformation {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("sFullName")
    @Expose
    private String sFullName;
    @SerializedName("sNickName")
    @Expose
    private String sNickName;
    @SerializedName("sProfilePicture")
    @Expose
    private String sProfilePicture;
    @SerializedName("sCoverPhoto")
    @Expose
    private String sCoverPhoto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSFullName() {
        return sFullName;
    }

    public void setSFullName(String sFullName) {
        this.sFullName = sFullName;
    }

    public String getSNickName() {
        return sNickName;
    }

    public void setSNickName(String sNickName) {
        this.sNickName = sNickName;
    }

    public String getSProfilePicture() {
        return sProfilePicture;
    }

    public void setSProfilePicture(String sProfilePicture) {
        this.sProfilePicture = sProfilePicture;
    }

    public String getSCoverPhoto() {
        return sCoverPhoto;
    }

    public void setSCoverPhoto(String sCoverPhoto) {
        this.sCoverPhoto = sCoverPhoto;
    }

}
