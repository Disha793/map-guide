
package alarmdemo.apidemo.Model.VenueLikeUnlike;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VenueLikeUnlike {

    @SerializedName("message")
    @Expose
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
