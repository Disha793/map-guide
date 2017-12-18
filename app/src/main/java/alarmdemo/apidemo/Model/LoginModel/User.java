
package alarmdemo.apidemo.Model.LoginModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

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
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("news_preference")
    @Expose
    private String newsPreference;
    @SerializedName("tag_allow")
    @Expose
    private Boolean tagAllow;
    @SerializedName("notification_allow")
    @Expose
    private Boolean notificationAllow;
    @SerializedName("dUpdatedDate")
    @Expose
    private String dUpdatedDate;
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
    @SerializedName("nUserPost")
    @Expose
    private Integer nUserPost;
    @SerializedName("nUserFollower")
    @Expose
    private Integer nUserFollower;
    @SerializedName("nUserFriend")
    @Expose
    private Integer nUserFriend;
    @SerializedName("iQBId")
    @Expose
    private String iQBId;
    @SerializedName("sQBToken")
    @Expose
    private String sQBToken;
    @SerializedName("TotalPoint")
    @Expose
    private Integer totalPoint;

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

    public String getEStatus() {
        return eStatus;
    }

    public void setEStatus(String eStatus) {
        this.eStatus = eStatus;
    }

    public String getNewsPreference() {
        return newsPreference;
    }

    public void setNewsPreference(String newsPreference) {
        this.newsPreference = newsPreference;
    }

    public Boolean getTagAllow() {
        return tagAllow;
    }

    public void setTagAllow(Boolean tagAllow) {
        this.tagAllow = tagAllow;
    }

    public Boolean getNotificationAllow() {
        return notificationAllow;
    }

    public void setNotificationAllow(Boolean notificationAllow) {
        this.notificationAllow = notificationAllow;
    }

    public String getDUpdatedDate() {
        return dUpdatedDate;
    }

    public void setDUpdatedDate(String dUpdatedDate) {
        this.dUpdatedDate = dUpdatedDate;
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

    public Integer getNUserPost() {
        return nUserPost;
    }

    public void setNUserPost(Integer nUserPost) {
        this.nUserPost = nUserPost;
    }

    public Integer getNUserFollower() {
        return nUserFollower;
    }

    public void setNUserFollower(Integer nUserFollower) {
        this.nUserFollower = nUserFollower;
    }

    public Integer getNUserFriend() {
        return nUserFriend;
    }

    public void setNUserFriend(Integer nUserFriend) {
        this.nUserFriend = nUserFriend;
    }

    public String getIQBId() {
        return iQBId;
    }

    public void setIQBId(String iQBId) {
        this.iQBId = iQBId;
    }

    public String getSQBToken() {
        return sQBToken;
    }

    public void setSQBToken(String sQBToken) {
        this.sQBToken = sQBToken;
    }

    public Integer getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(Integer totalPoint) {
        this.totalPoint = totalPoint;
    }

}
