
package alarmdemo.apidemo.Model.AdListModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("_id")
    @Expose
    private String id;
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

    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("liked")
    @Expose
    private List<Liked> liked = null;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("cellType")
    @Expose
    private String cellType;
    @SerializedName("report_count")
    @Expose
    private Integer reportCount;
    @SerializedName("userReport")
    @Expose
    private Integer userReport;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
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

}
