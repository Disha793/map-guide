
package alarmdemo.apidemo.Model.CreatePage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Page {

    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("sPageName")
    @Expose
    private String sPageName;
    @SerializedName("sAboutPage")
    @Expose
    private String sAboutPage;
    @SerializedName("sWebsiteUrl")
    @Expose
    private String sWebsiteUrl;
    @SerializedName("sUserId")
    @Expose
    private String sUserId;
    @SerializedName("sCoverPhoto")
    @Expose
    private String sCoverPhoto;
    @SerializedName("sPageProfile")
    @Expose
    private String sPageProfile;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getSPageName() {
        return sPageName;
    }

    public void setSPageName(String sPageName) {
        this.sPageName = sPageName;
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

    public String getSUserId() {
        return sUserId;
    }

    public void setSUserId(String sUserId) {
        this.sUserId = sUserId;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEStatus() {
        return eStatus;
    }

    public void setEStatus(String eStatus) {
        this.eStatus = eStatus;
    }

}
