
package alarmdemo.apidemo.Model.VenueCommentsList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VenueCommentsList {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<VenueCommnetDatum> venueCommnetData = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<VenueCommnetDatum> getVenueCommnetData() {
        return venueCommnetData;
    }

    public void setVenueCommnetData(List<VenueCommnetDatum> venueCommnetData) {
        this.venueCommnetData = venueCommnetData;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
