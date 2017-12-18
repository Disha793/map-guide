package alarmdemo.apidemo.Model.OfferHistory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yudizmacmini on 14/11/17.
 */

public class RedeemHistoryDatum {
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("nEarn")
    @Expose
    private Integer nPoint;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNPoint() {
        return nPoint;
    }

    public void setNPoint(Integer nPoint) {
        this.nPoint = nPoint;
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

}
