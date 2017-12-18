package alarmdemo.apidemo.Model.UserProfile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yudizsolutionspvtltd on 05/10/17.
 */

public class Friend {
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("sSender_id")
    @Expose
    private String sSenderId;
    @SerializedName("sReceiver_id")
    @Expose
    private String sReceiverId;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("eRequestStatus")
    @Expose
    private String eRequestStatus;
    @SerializedName("__v")
    @Expose
    private Integer v;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSSenderId() {
        return sSenderId;
    }

    public void setSSenderId(String sSenderId) {
        this.sSenderId = sSenderId;
    }

    public String getSReceiverId() {
        return sReceiverId;
    }

    public void setSReceiverId(String sReceiverId) {
        this.sReceiverId = sReceiverId;
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

    public String getERequestStatus() {
        return eRequestStatus;
    }

    public void setERequestStatus(String eRequestStatus) {
        this.eRequestStatus = eRequestStatus;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }
}
