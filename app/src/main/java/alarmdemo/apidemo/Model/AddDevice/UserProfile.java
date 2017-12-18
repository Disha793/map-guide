
package alarmdemo.apidemo.Model.AddDevice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserProfile {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("sFullName")
    @Expose
    private String sFullName;
    @SerializedName("sEmail")
    @Expose
    private String sEmail;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("myDevices")
    @Expose
    private List<MyDevice> myDevices = null;
    @SerializedName("sOriginalProfilePicture")
    @Expose
    private String sOriginalProfilePicture;
    @SerializedName("sThumbProfilePicture")
    @Expose
    private String sThumbProfilePicture;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSFullName() {
        return sFullName;
    }

    public void setSFullName(String sFullName) {
        this.sFullName = sFullName;
    }

    public String getSEmail() {
        return sEmail;
    }

    public void setSEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getEStatus() {
        return eStatus;
    }

    public void setEStatus(String eStatus) {
        this.eStatus = eStatus;
    }

    public List<MyDevice> getMyDevices() {
        return myDevices;
    }

    public void setMyDevices(List<MyDevice> myDevices) {
        this.myDevices = myDevices;
    }

    public String getSOriginalProfilePicture() {
        return sOriginalProfilePicture;
    }

    public void setSOriginalProfilePicture(String sOriginalProfilePicture) {
        this.sOriginalProfilePicture = sOriginalProfilePicture;
    }

    public String getSThumbProfilePicture() {
        return sThumbProfilePicture;
    }

    public void setSThumbProfilePicture(String sThumbProfilePicture) {
        this.sThumbProfilePicture = sThumbProfilePicture;
    }

}
