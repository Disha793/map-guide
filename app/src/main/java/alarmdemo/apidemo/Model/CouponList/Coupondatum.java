
package alarmdemo.apidemo.Model.CouponList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coupondatum {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
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
    @SerializedName("eCodeType")
    @Expose
    private String eCodeType;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("totalCode")
    @Expose
    private Integer totalCode;

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

    public String getECodeType() {
        return eCodeType;
    }

    public void setECodeType(String eCodeType) {
        this.eCodeType = eCodeType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getTotalCode() {
        return totalCode;
    }

    public void setTotalCode(Integer totalCode) {
        this.totalCode = totalCode;
    }

}
