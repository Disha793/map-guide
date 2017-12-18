
package alarmdemo.apidemo.Model.SearchFriendModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("UserInformation")
    @Expose
    private UserInformation userInformation;

    @SerializedName("sPageName")
    @Expose
    private String sPageName;

    @SerializedName("sPageProfile")
    @Expose
    private String sPageProfile;

    @SerializedName("likes_count")
    @Expose
    private Integer likes_count;

    @SerializedName("type")
    @Expose
    private String type;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    @SerializedName("_id")
    @Expose
    private String _id;

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

    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public String getsFullName() {
        return sFullName;
    }

    public void setsFullName(String sFullName) {
        this.sFullName = sFullName;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsNickName() {
        return sNickName;
    }

    public void setsNickName(String sNickName) {
        this.sNickName = sNickName;
    }

    public String getsProfilePicture() {
        return sProfilePicture;
    }

    public void setsProfilePicture(String sProfilePicture) {
        this.sProfilePicture = sProfilePicture;
    }

    public String getsCoverPhoto() {
        return sCoverPhoto;
    }

    public void setsCoverPhoto(String sCoverPhoto) {
        this.sCoverPhoto = sCoverPhoto;
    }

    @SerializedName("sCoverPhoto")
    @Expose
    private String sCoverPhoto;


    public String getsPageName() {
        return sPageName;
    }

    public void setsPageName(String sPageName) {
        this.sPageName = sPageName;
    }

    public String getsPageProfile() {
        return sPageProfile;
    }

    public void setsPageProfile(String sPageProfile) {
        this.sPageProfile = sPageProfile;
    }

    public Integer getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(Integer likes_count) {
        this.likes_count = likes_count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

}
