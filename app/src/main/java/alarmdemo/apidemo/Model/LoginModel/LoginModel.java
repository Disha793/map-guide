
package alarmdemo.apidemo.Model.LoginModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("authorization")
    @Expose
    private String authorization;
    @SerializedName("user")
    @Expose
    private List<User> user = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

}
