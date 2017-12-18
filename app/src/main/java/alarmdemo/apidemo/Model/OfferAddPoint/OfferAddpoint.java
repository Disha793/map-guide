
package alarmdemo.apidemo.Model.OfferAddPoint;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfferAddpoint {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("lastAddedPoint")
    @Expose
    private LastAddedPoint lastAddedPoint;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LastAddedPoint getLastAddedPoint() {
        return lastAddedPoint;
    }

    public void setLastAddedPoint(LastAddedPoint lastAddedPoint) {
        this.lastAddedPoint = lastAddedPoint;
    }

}
