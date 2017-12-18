
package alarmdemo.apidemo.Model.Stock;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("change")
    @Expose
    private Double change;
    @SerializedName("percent")
    @Expose
    private Double percent;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

}
