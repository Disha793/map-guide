
package alarmdemo.apidemo.Model.PendingFriend;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserDatum {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("UserInformation")
    @Expose
    private UserInformation userInformation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

}
