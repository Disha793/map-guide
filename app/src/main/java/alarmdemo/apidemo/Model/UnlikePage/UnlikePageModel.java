package alarmdemo.apidemo.Model.UnlikePage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yudizsolutionspvtltd on 02/10/17.
 */

public class UnlikePageModel {

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
