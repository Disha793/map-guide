
package alarmdemo.apidemo.Model.EditProfile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserProfile {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("sFullName")
    @Expose
    private String sFullName;
    @SerializedName("sEmail")
    @Expose
    private String sEmail;
    @SerializedName("dUpdatedDate")
    @Expose
    private String dUpdatedDate;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("sMobile")
    @Expose
    private String sMobile;
    @SerializedName("dDob")
    @Expose
    private String dDob;
    @SerializedName("sProfilePicture")
    @Expose
    private String sProfilePicture;
    @SerializedName("sCoverPhoto")
    @Expose
    private String sCoverPhoto;
    @SerializedName("eGender")
    @Expose
    private String eGender;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("sWebpageUrl")
    @Expose
    private String sWebpageUrl;
    @SerializedName("sAbout")
    @Expose
    private String sAbout;
    @SerializedName("sNickName")
    @Expose
    private String sNickName;
    @SerializedName("sAddress")
    @Expose
    private String sAddress;
    @SerializedName("sDesignation")
    @Expose
    private String sDesignation;

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

    public String getSEmail() {
        return sEmail;
    }

    public void setSEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getDUpdatedDate() {
        return dUpdatedDate;
    }

    public void setDUpdatedDate(String dUpdatedDate) {
        this.dUpdatedDate = dUpdatedDate;
    }

    public String getEStatus() {
        return eStatus;
    }

    public void setEStatus(String eStatus) {
        this.eStatus = eStatus;
    }

    public String getSMobile() {
        return sMobile;
    }

    public void setSMobile(String sMobile) {
        this.sMobile = sMobile;
    }

    public String getDDob() {
        return dDob;
    }

    public void setDDob(String dDob) {
        this.dDob = dDob;
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

    public String getEGender() {
        return eGender;
    }

    public void setEGender(String eGender) {
        this.eGender = eGender;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getSWebpageUrl() {
        return sWebpageUrl;
    }

    public void setSWebpageUrl(String sWebpageUrl) {
        this.sWebpageUrl = sWebpageUrl;
    }

    public String getSAbout() {
        return sAbout;
    }

    public void setSAbout(String sAbout) {
        this.sAbout = sAbout;
    }

    public String getSNickName() {
        return sNickName;
    }

    public void setSNickName(String sNickName) {
        this.sNickName = sNickName;
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getSDesignation() {
        return sDesignation;
    }

    public void setSDesignation(String sDesignation) {
        this.sDesignation = sDesignation;
    }

}
