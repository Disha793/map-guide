
package alarmdemo.apidemo.Model.PageDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PageDetail {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("sPageName")
    @Expose
    private String sPageName;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("sAboutPage")
    @Expose
    private String sAboutPage;
    @SerializedName("sWebsiteUrl")
    @Expose
    private String sWebsiteUrl;
    @SerializedName("sCoverPhoto")
    @Expose
    private String sCoverPhoto;
    @SerializedName("sPageProfile")
    @Expose
    private String sPageProfile;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("post_count")
    @Expose
    private Integer postCount;
    @SerializedName("pageLiked")
    @Expose
    private List<PageLiked> pageLiked = null;
    @SerializedName("UserInformation")
    @Expose
    private UserInformation userInformation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSPageName() {
        return sPageName;
    }

    public void setSPageName(String sPageName) {
        this.sPageName = sPageName;
    }

    public String getDCreatedDate() {
        return dCreatedDate;
    }

    public void setDCreatedDate(String dCreatedDate) {
        this.dCreatedDate = dCreatedDate;
    }

    public String getDUpdateDate() {
        return dUpdateDate;
    }

    public void setDUpdateDate(String dUpdateDate) {
        this.dUpdateDate = dUpdateDate;
    }

    public String getSAboutPage() {
        return sAboutPage;
    }

    public void setSAboutPage(String sAboutPage) {
        this.sAboutPage = sAboutPage;
    }

    public String getSWebsiteUrl() {
        return sWebsiteUrl;
    }

    public void setSWebsiteUrl(String sWebsiteUrl) {
        this.sWebsiteUrl = sWebsiteUrl;
    }

    public String getSCoverPhoto() {
        return sCoverPhoto;
    }

    public void setSCoverPhoto(String sCoverPhoto) {
        this.sCoverPhoto = sCoverPhoto;
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

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public List<PageLiked> getPageLiked() {
        return pageLiked;
    }

    public void setPageLiked(List<PageLiked> pageLiked) {
        this.pageLiked = pageLiked;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

}
