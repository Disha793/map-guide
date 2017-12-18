package alarmdemo.apidemo.Model.OfferHistory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yudizmacmini on 14/11/17.
 */

public class OfferHistoryTotalData {
    @SerializedName("TotalData")
    @Expose
    private Integer totalData;

    public Integer getTotalData() {
        return totalData;
    }

    public void setTotalData(Integer totalData) {
        this.totalData = totalData;
    }

}
