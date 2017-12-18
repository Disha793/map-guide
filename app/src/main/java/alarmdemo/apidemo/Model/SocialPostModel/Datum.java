
package alarmdemo.apidemo.Model.SocialPostModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("sDescription")
    @Expose
    private String sDescription;
    @SerializedName("ePostType")
    @Expose
    private String ePostType;
    @SerializedName("sUserId")
    @Expose
    private String sUserId;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("access_type")
    @Expose
    private String accessType;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("liked")
    @Expose
    private List<Liked> liked = null;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("medias")
    @Expose
    private List<Media> medias = null;
    @SerializedName("cellType")
    @Expose
    private String cellType;
    @SerializedName("eTextType")
    @Expose
    private String eTextType;
    @SerializedName("UserInformation")
    @Expose
    private UserInformation userInformation;
    @SerializedName("report_count")
    @Expose
    private Integer reportCount;
    @SerializedName("userReport")
    @Expose
    private Integer userReport;
    @SerializedName("feeling_activity")
    @Expose
    private FeelingActivity feelingActivity;
    @SerializedName("checkin")
    @Expose
    private Checkin checkin;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("point")
    @Expose
    private Integer point;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image")
    @Expose
    private List<Image> image = null;
    @SerializedName("sPageId")
    @Expose
    private String sPageId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSDescription() {
        return sDescription;
    }

    public void setSDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    public String getEPostType() {
        return ePostType;
    }

    public void setEPostType(String ePostType) {
        this.ePostType = ePostType;
    }

    public String getSUserId() {
        return sUserId;
    }

    public void setSUserId(String sUserId) {
        this.sUserId = sUserId;
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

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public List<Liked> getLiked() {
        return liked;
    }

    public void setLiked(List<Liked> liked) {
        this.liked = liked;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
    }

    public String getETextType() {
        return eTextType;
    }

    public void setETextType(String eTextType) {
        this.eTextType = eTextType;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public Integer getReportCount() {
        return reportCount;
    }

    public void setReportCount(Integer reportCount) {
        this.reportCount = reportCount;
    }

    public Integer getUserReport() {
        return userReport;
    }

    public void setUserReport(Integer userReport) {
        this.userReport = userReport;
    }

    public FeelingActivity getFeelingActivity() {
        return feelingActivity;
    }

    public void setFeelingActivity(FeelingActivity feelingActivity) {
        this.feelingActivity = feelingActivity;
    }

    public Checkin getCheckin() {
        return checkin;
    }

    public void setCheckin(Checkin checkin) {
        this.checkin = checkin;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public String getSPageId() {
        return sPageId;
    }

    public void setSPageId(String sPageId) {
        this.sPageId = sPageId;
    }

}
