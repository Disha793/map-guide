
package alarmdemo.apidemo.Model.SearchSocial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchArray {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sNickName")
    @Expose
    private String sNickName;
    @SerializedName("sProfilePicture")
    @Expose
    private String sProfilePicture;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("sPageProfile")
    @Expose
    private String sPageProfile;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEStatus() {
        return eStatus;
    }

    public void setEStatus(String eStatus) {
        this.eStatus = eStatus;
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

}
