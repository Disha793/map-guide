
package alarmdemo.apidemo.Model.OfferHistory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OfferHistory {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("Offerhistory")
    @Expose
    private List<HistoryDatum> historyData = null;


    @SerializedName("TotalData")
    @Expose
    private OfferHistoryTotalData totalData;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<HistoryDatum> getHistoryData() {
        return historyData;
    }

    public void setHistoryData(List<HistoryDatum> historyData) {
        this.historyData = historyData;
    }


    public OfferHistoryTotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(OfferHistoryTotalData totalData) {
        this.totalData = totalData;
    }
}
