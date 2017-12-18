
package alarmdemo.apidemo.Model.Events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Events {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
