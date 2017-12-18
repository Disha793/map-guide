
package alarmdemo.apidemo.Model.PollSubmitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PollSubmitModel {

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
