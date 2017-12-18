
package alarmdemo.apidemo.Model.MediaListModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostMedia {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("post_id")
    @Expose
    private String postId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDCreatedDate() {
        return dCreatedDate;
    }

    public void setDCreatedDate(String dCreatedDate) {
        this.dCreatedDate = dCreatedDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
