
package alarmdemo.apidemo.Model.EtsyShoppingModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("smallImageUrl")
    @Expose
    private String smallImageUrl;
    @SerializedName("mediumImageUrl")
    @Expose
    private String mediumImageUrl;
    @SerializedName("largeImageUrl")
    @Expose
    private String largeImageUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

}
