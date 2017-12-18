
package alarmdemo.apidemo.Model.PostList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Checkin {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("location")
    @Expose
    private Location location;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
