
package alarmdemo.apidemo.Model.CreatePost;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastAddedPost {

    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("sDescription")
    @Expose
    private String sDescription;
    @SerializedName("ePostType")
    @Expose
    private String ePostType;
    @SerializedName("sUserId")
    @Expose
    private String sUserId;
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
