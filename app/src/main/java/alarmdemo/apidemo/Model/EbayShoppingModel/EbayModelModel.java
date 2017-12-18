
package alarmdemo.apidemo.Model.EbayShoppingModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EbayModelModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("products")
    @Expose
    private List<Product> products = null;

    @SerializedName("Data")
    @Expose
    private List<Product> Data = null;

    public List<Product> getData() {
        return Data;
    }

    public void setData(List<Product> data) {
        Data = data;
    }

    @SerializedName("TotalData")
    @Expose

    private TotalData totalData;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
