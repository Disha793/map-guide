
package alarmdemo.apidemo.Model.PageList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class PageList implements Serializable {

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
    @SerializedName("owner")
    @Expose
    private Owner owner;
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
    @SerializedName("pageLiked")
    @Expose
    private List<PageLiked> pageLiked = null;

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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
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

    public List<PageLiked> getPageLiked() {
        return pageLiked;
    }

    public void setPageLiked(List<PageLiked> pageLiked) {
        this.pageLiked = pageLiked;
    }

}
