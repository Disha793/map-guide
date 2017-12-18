
package alarmdemo.apidemo.Model.AdListModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Liked {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("advertise_id")
    @Expose
    private String advertiseId;
    @SerializedName("user_id")
    @Expose
    private String userId;
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

    public String getAdvertiseId() {
        return advertiseId;
    }

    public void setAdvertiseId(String advertiseId) {
        this.advertiseId = advertiseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
