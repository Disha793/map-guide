package alarmdemo.apidemo.Model.LogoutModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yudizsolutionspvtltd on 01/09/17.
 */

public class LogoutModel
{
    @SerializedName("error")
    @Expose
    private String error;

    @SerializedName("message")
    @Expose
    private String message;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
