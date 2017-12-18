
package alarmdemo.apidemo.Model.BlockUnBlockModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlockBy {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("UserInformation")
    @Expose
    private UserInformation_ userInformation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserInformation_ getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation_ userInformation) {
        this.userInformation = userInformation;
    }

}
