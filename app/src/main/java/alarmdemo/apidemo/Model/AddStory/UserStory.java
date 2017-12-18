
package alarmdemo.apidemo.Model.AddStory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserStory {

    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("sUserid")
    @Expose
    private String sUserid;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getSUserid() {
        return sUserid;
    }

    public void setSUserid(String sUserid) {
        this.sUserid = sUserid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDUpdateDate() {
        return dUpdateDate;
    }

    public void setDUpdateDate(String dUpdateDate) {
        this.dUpdateDate = dUpdateDate;
    }

    public String getDCreatedDate() {
        return dCreatedDate;
    }

    public void setDCreatedDate(String dCreatedDate) {
        this.dCreatedDate = dCreatedDate;
    }

}
