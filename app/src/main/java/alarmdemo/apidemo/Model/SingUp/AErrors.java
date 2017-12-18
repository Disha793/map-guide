package alarmdemo.apidemo.Model.SingUp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AErrors {
    @SerializedName("sEmail")
    @Expose
    private SEmail sEmail;
    @SerializedName("sFirstName")
    @Expose
    private SFirstName sFirstName;
    @SerializedName("sLastName")
    @Expose
    private SLastName sLastName;
    @SerializedName("sPassword")
    @Expose
    private SPassword sPassword;

    public SFirstName getSFirstName() {
        return this.sFirstName;
    }

    public void setSFirstName(SFirstName sFirstName) {
        this.sFirstName = sFirstName;
    }

    public SLastName getSLastName() {
        return this.sLastName;
    }

    public void setSLastName(SLastName sLastName) {
        this.sLastName = sLastName;
    }

    public SEmail getSEmail() {
        return this.sEmail;
    }

    public void setSEmail(SEmail sEmail) {
        this.sEmail = sEmail;
    }

    public SPassword getSPassword() {
        return this.sPassword;
    }

    public void setSPassword(SPassword sPassword) {
        this.sPassword = sPassword;
    }
}
