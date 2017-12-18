
package alarmdemo.apidemo.Model.GroupOnShoppingModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GroupOnModelModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("deals")
    @Expose
    private List<Deal> deals = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

    public List<Deal> getData() {
        return Data;
    }

    public void setData(List<Deal> data) {
        Data = data;
    }

    @SerializedName("Data")
    @Expose
    private List<Deal> Data = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
