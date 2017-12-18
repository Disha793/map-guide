
package alarmdemo.apidemo.Model.FriendList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FriendListModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("userData")
    @Expose
    private List<UserDatum> userData = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

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

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
