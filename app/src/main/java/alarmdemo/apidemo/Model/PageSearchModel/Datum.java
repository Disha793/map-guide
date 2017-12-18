
package alarmdemo.apidemo.Model.PageSearchModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("sPageName")
    @Expose
    private String sPageName;
    @SerializedName("sPageProfile")
    @Expose
    private String sPageProfile;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("UserInformation")
    @Expose
    private UserInformation userInformation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEStatus() {
        return eStatus;
    }

    public void setEStatus(String eStatus) {
        this.eStatus = eStatus;
    }

    public String getSPageName() {
        return sPageName;
    }

    public void setSPageName(String sPageName) {
        this.sPageName = sPageName;
    }

    public String getSPageProfile() {
        return sPageProfile;
    }

    public void setSPageProfile(String sPageProfile) {
        this.sPageProfile = sPageProfile;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
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
