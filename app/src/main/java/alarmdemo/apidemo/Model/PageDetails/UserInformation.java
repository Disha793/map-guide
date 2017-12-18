
package alarmdemo.apidemo.Model.PageDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInformation {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("sProfilePicture")
    @Expose
    private String sProfilePicture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSProfilePicture() {
        return sProfilePicture;
    }

    public void setSProfilePicture(String sProfilePicture) {
        this.sProfilePicture = sProfilePicture;
    }

}
