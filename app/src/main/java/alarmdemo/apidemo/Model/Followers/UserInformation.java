
package alarmdemo.apidemo.Model.Followers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInformation {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("userDetails")
    @Expose
    private UserDetails userDetails;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

}
