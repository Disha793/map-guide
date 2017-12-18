
package alarmdemo.apidemo.Model.PostDetailModel;

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
    private List<LikeFlag> likeFlag = null;
    @SerializedName("comment_count")
    @Expose
    private Integer comentCount;
    @SerializedName("medias")
    @Expose
    private List<Media> medias = null;
    @SerializedName("eTextType")
    @Expose
    private String eTextType;
    @SerializedName("UserInformation")
    @Expose
    private PostOwner postOwner;

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

    public List<LikeFlag> getLikeFlag() {
        return likeFlag;
    }

    public void setLikeFlag(List<LikeFlag> likeFlag) {
        this.likeFlag = likeFlag;
    }

    public Integer getComentCount() {
        return comentCount;
    }

    public void setComentCount(Integer comentCount) {
        this.comentCount = comentCount;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public String getETextType() {
        return eTextType;
    }

    public void setETextType(String eTextType) {
        this.eTextType = eTextType;
    }

    public PostOwner getPostOwner() {
        return postOwner;
    }

    public void setPostOwner(PostOwner postOwner) {
        this.postOwner = postOwner;
    }

}
