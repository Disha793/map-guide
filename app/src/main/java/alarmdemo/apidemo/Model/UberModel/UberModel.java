
package alarmdemo.apidemo.Model.UberModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UberModel {

    @SerializedName("prices")
    @Expose
    private List<Price> prices = null;

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

}
