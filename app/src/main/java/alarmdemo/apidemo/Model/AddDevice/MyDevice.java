
package alarmdemo.apidemo.Model.AddDevice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyDevice {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("sDeviceToken")
    @Expose
    private String sDeviceToken;
    @SerializedName("sUserId")
    @Expose
    private String sUserId;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("eDeviceType")
    @Expose
    private String eDeviceType;
    @SerializedName("__v")
    @Expose
    private Integer v;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSDeviceToken() {
        return sDeviceToken;
    }

    public void setSDeviceToken(String sDeviceToken) {
        this.sDeviceToken = sDeviceToken;
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

    public String getEStatus() {
        return eStatus;
    }

    public void setEStatus(String eStatus) {
        this.eStatus = eStatus;
    }

    public String getEDeviceType() {
        return eDeviceType;
    }

    public void setEDeviceType(String eDeviceType) {
        this.eDeviceType = eDeviceType;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}
