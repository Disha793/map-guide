package alarmdemo.apidemo.Model.DeckItemList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yudizsolutionspvtltd on 01/12/17.
 */

public class TotalData {
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
