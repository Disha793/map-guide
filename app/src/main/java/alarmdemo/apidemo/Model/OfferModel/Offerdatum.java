
package alarmdemo.apidemo.Model.OfferModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Offerdatum {
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("aurl")
    @Expose
    private String aurl;

    @SerializedName("point")
    @Expose
    private Integer point;
    @SerializedName("dDate")
    @Expose
    private String dDate;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("isCompleted")
    @Expose
    private Integer isCompleted;


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


    public String getAUrl() {
        return aurl;
    }

    public void setAUrl(String aurl) {
        this.aurl = aurl;
    }


    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getDDate() {
        return dDate;
    }

    public void setDDate(String dDate) {
        this.dDate = dDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Integer isCompleted) {
        this.isCompleted = isCompleted;
    }
}
