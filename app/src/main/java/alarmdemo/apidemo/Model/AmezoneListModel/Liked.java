
package alarmdemo.apidemo.Model.AmezoneListModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Liked {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("amazone_id")
    @Expose
    private String amazoneId;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("__v")
    @Expose
    private Integer v;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmazoneId() {
        return amazoneId;
    }

    public void setAmazoneId(String amazoneId) {
        this.amazoneId = amazoneId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}
