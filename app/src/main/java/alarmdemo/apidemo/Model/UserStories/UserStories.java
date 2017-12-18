
package alarmdemo.apidemo.Model.UserStories;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserStories {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("storyData")
    @Expose
    private List<UserStoryDatum> storyData = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserStoryDatum> getStoryData() {
        return storyData;
    }

    public void setStoryData(List<UserStoryDatum> storyData) {
        this.storyData = storyData;
    }

}
