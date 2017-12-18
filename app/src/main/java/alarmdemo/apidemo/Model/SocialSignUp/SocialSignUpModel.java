package alarmdemo.apidemo.Model.SocialSignUp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yudizsolutionspvtltd on 31/08/17.
 */

public class SocialSignUpModel {

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("error")
    @Expose
    private String error;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
