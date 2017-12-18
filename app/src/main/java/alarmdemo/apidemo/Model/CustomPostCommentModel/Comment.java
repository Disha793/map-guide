
package alarmdemo.apidemo.Model.CustomPostCommentModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comment {

    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("movie_id")
    @Expose
    private String movieId;

    public String getNews_id() {
        return news_id;
    }

    public void setNews_id(String news_id) {
        this.news_id = news_id;
    }

    @SerializedName("news_id")
    @Expose
    private String news_id;

    public String getTvshow_id() {
        return tvshow_id;
    }

    public void setTvshow_id(String tvshow_id) {
        this.tvshow_id = tvshow_id;
    }

    public String getdUpdateDate() {
        return dUpdateDate;
    }

    public void setdUpdateDate(String dUpdateDate) {
        this.dUpdateDate = dUpdateDate;
    }

    public String geteStatus() {
        return eStatus;
    }

    public void seteStatus(String eStatus) {
        this.eStatus = eStatus;
    }

    @SerializedName("tvshow_id")
    @Expose
    private String tvshow_id;

    public String getAdvertise_id() {
        return advertise_id;
    }

    public void setAdvertise_id(String advertise_id) {
        this.advertise_id = advertise_id;
    }

    @SerializedName("advertise_id")
    @Expose
    private String advertise_id;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("parent")
    @Expose
    private String parent;

    @SerializedName("celebrity_id")
    @Expose
    private String celebrity_id;

    @SerializedName("music_id")
    @Expose
    private String music_id;

    @SerializedName("sport_id")
    @Expose
    private String sport_id;




    public String getCelebrity_id() {
        return celebrity_id;
    }

    public void setCelebrity_id(String celebrity_id) {
        this.celebrity_id = celebrity_id;
    }

    public String getMusic_id() {
        return music_id;
    }

    public void setMusic_id(String music_id) {
        this.music_id = music_id;
    }

    public String getSport_id() {
        return sport_id;
    }

    public void setSport_id(String sport_id) {
        this.sport_id = sport_id;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    @SerializedName("video_id")
    @Expose
    private String video_id;


    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

}
