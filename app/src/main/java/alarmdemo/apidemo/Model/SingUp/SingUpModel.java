package alarmdemo.apidemo.Model.SingUp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SingUpModel {
    @SerializedName("aErrors")
    @Expose
    private AErrors aErrors;
    @SerializedName("error")
    @Expose
    private String error;
    @SerializedName("message")
    @Expose
    private String message;

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AErrors getAErrors() {
        return this.aErrors;
    }

    public void setAErrors(AErrors aErrors) {
        this.aErrors = aErrors;
    }
}
