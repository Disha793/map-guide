
package alarmdemo.apidemo.Model.CouponList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CouponListModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("Coupondata")
    @Expose
    private List<Coupondatum> coupondata = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Coupondatum> getCoupondata() {
        return coupondata;
    }

    public void setCoupondata(List<Coupondatum> coupondata) {
        this.coupondata = coupondata;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
