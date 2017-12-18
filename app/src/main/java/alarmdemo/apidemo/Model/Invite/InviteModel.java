
package alarmdemo.apidemo.Model.Invite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class InviteModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("Offerdata")
    @Expose
    private List<Offerdatum> offerdata = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Offerdatum> getOfferdata() {
        return offerdata;
    }

    public void setOfferdata(List<Offerdatum> offerdata) {
        this.offerdata = offerdata;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
