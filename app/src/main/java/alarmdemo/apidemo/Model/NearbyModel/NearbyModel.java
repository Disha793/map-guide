
package alarmdemo.apidemo.Model.NearbyModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class NearbyModel implements Serializable {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("venues")
    @Expose
    private List<Venue> venues = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;


    @SerializedName("Data")
    @Expose
    private List<Venue> Data = null;


    public List<Venue> getData() {
        return Data;
    }

    public void setData(List<Venue> data) {
        Data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Venue> getVenues() {
        return venues;
    }

    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
