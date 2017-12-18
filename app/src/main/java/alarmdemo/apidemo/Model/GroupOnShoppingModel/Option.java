
package alarmdemo.apidemo.Model.GroupOnShoppingModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Option {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("discount")
    @Expose
    private String discount;
    @SerializedName("buyUrl")
    @Expose
    private String buyUrl;
    @SerializedName("_id")
    @Expose
    private String id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getBuyUrl() {
        return buyUrl;
    }

    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
