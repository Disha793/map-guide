
package alarmdemo.apidemo.Model.RedeemInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RedeemInfoModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("lastAddedRedeem")
    @Expose
    private LastAddedRedeem lastAddedRedeem;
    @SerializedName("lastAddedRedeemHistory")
    @Expose
    private LastAddedRedeemHistory lastAddedRedeemHistory;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LastAddedRedeem getLastAddedRedeem() {
        return lastAddedRedeem;
    }

    public void setLastAddedRedeem(LastAddedRedeem lastAddedRedeem) {
        this.lastAddedRedeem = lastAddedRedeem;
    }

    public LastAddedRedeemHistory getLastAddedRedeemHistory() {
        return lastAddedRedeemHistory;
    }

    public void setLastAddedRedeemHistory(LastAddedRedeemHistory lastAddedRedeemHistory) {
        this.lastAddedRedeemHistory = lastAddedRedeemHistory;
    }

}
