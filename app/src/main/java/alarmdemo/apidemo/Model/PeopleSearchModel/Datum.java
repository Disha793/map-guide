
package alarmdemo.apidemo.Model.PeopleSearchModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

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
