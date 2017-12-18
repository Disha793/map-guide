
package alarmdemo.apidemo.Model.InviteEmail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class InviteEmailModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("alreadyInvited")
    @Expose
    private List<String> alreadyInvited = null;
    @SerializedName("alreadyExists")
    @Expose
    private List<String> alreadyExists = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getAlreadyInvited() {
        return alreadyInvited;
    }

    public void setAlreadyInvited(List<String> alreadyInvited) {
        this.alreadyInvited = alreadyInvited;
    }

    public List<String> getAlreadyExists() {
        return alreadyExists;
    }

    public void setAlreadyExists(List<String> alreadyExists) {
        this.alreadyExists = alreadyExists;
    }

}
