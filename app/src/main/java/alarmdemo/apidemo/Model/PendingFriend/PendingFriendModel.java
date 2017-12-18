
package alarmdemo.apidemo.Model.PendingFriend;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PendingFriendModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("userData")
    @Expose
    private List<UserDatum> userData = null;
    @SerializedName("Totaldata")
    @Expose
    private Totaldata totaldata;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserDatum> getUserData() {
        return userData;
    }

    public void setUserData(List<UserDatum> userData) {
        this.userData = userData;
    }

    public Totaldata getTotaldata() {
        return totaldata;
    }

    public void setTotaldata(Totaldata totaldata) {
        this.totaldata = totaldata;
    }

}
