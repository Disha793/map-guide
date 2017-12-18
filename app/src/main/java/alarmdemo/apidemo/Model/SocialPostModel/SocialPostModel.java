
package alarmdemo.apidemo.Model.SocialPostModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SocialPostModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName(value = "data", alternate = {"Data"})
    @Expose
    private List<Datum> data = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
