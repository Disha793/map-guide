
package alarmdemo.apidemo.Model.NotificationModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("UserInformation")
    @Expose
    private UserInformation userInformation;
    @SerializedName("notification")
    @Expose
    private Notification notification;

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

}
