
package alarmdemo.apidemo.Model.SearchUserModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalData {

    @SerializedName(value = "TotalData",alternate = {"Total"})
    @Expose
    private Integer totalData;

    public Integer getTotalData() {
        return totalData;
    }

    public void setTotalData(Integer totalData) {
        this.totalData = totalData;
    }

}
