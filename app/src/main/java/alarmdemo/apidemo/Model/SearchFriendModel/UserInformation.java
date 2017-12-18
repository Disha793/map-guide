
package alarmdemo.apidemo.Model.SearchFriendModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInformation {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("sFirstName")
    @Expose
    private String sFirstName;
    @SerializedName("sLastName")
    @Expose
    private String sLastName;
    @SerializedName("sFullName")
    @Expose
    private String sFullName;
    @SerializedName("sEmail")
    @Expose
    private String sEmail;

    @SerializedName("sProfilePicture")
    @Expose
    private String sProfilePicture;

    @SerializedName("sCoverPhoto")
    @Expose
    private String sCoverPhoto;

    @SerializedName("sNickName")
    @Expose
    private String sNickName;

    @SerializedName("name")
    @Expose
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsNickName() {
        return sNickName;
    }

    public void setsNickName(String sNickName) {
        this.sNickName = sNickName;
    }

    public String getsCoverPhoto() {
        return sCoverPhoto;
    }

    public void setsCoverPhoto(String sCoverPhoto) {
        this.sCoverPhoto = sCoverPhoto;
    }

    public String getsProfilePicture() {
        return sProfilePicture;
    }

    public void setsProfilePicture(String sProfilePicture) {
        this.sProfilePicture = sProfilePicture;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSFirstName() {
        return sFirstName;
    }

    public void setSFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getSLastName() {
        return sLastName;
    }

    public void setSLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public String getSFullName() {
        return sFullName;
    }

    public void setSFullName(String sFullName) {
        this.sFullName = sFullName;
    }

    public String getSEmail() {
        return sEmail;
    }

    public void setSEmail(String sEmail) {
        this.sEmail = sEmail;
    }

}
