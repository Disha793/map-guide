
package alarmdemo.apidemo.Model.OfferAddPoint;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastAddedPoint {

    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("nPoint")
    @Expose
    private Integer nPoint;
    @SerializedName("offer_id")
    @Expose
    private String offerId;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("eOfferType")
    @Expose
    private String eOfferType;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Integer getNPoint() {
        return nPoint;
    }

    public void setNPoint(Integer nPoint) {
        this.nPoint = nPoint;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getEOfferType() {
        return eOfferType;
    }

    public void setEOfferType(String eOfferType) {
        this.eOfferType = eOfferType;
    }

    public String getEStatus() {
        return eStatus;
    }

    public void setEStatus(String eStatus) {
        this.eStatus = eStatus;
    }

}
