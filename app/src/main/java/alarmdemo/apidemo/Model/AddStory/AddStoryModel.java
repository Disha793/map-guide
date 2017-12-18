
package alarmdemo.apidemo.Model.AddStory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddStoryModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("userStory")
    @Expose
    private UserStory userStory;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserStory getUserStory() {
        return userStory;
    }

    public void setUserStory(UserStory userStory) {
        this.userStory = userStory;
    }

}
