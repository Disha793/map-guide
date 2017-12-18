
package alarmdemo.apidemo.Model.LikeUnlikeModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LikeUnLikeModel {

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
