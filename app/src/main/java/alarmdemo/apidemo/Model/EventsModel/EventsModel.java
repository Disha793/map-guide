
package alarmdemo.apidemo.Model.EventsModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EventsModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;

    @SerializedName("Data")
    @Expose
    private List<Event> Data = null;

    public List<Event> getData() {

        return Data;
    }

    public void setData(List<Event> data) {
        Data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

}
