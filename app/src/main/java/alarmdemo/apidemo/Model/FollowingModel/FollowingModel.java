
package alarmdemo.apidemo.Model.FollowingModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FollowingModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("UserInformation")
    @Expose
    private List<UserInformation> userInformation = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserInformation> getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(List<UserInformation> userInformation) {
        this.userInformation = userInformation;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
