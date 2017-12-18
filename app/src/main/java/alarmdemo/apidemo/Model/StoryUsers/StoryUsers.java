
package alarmdemo.apidemo.Model.StoryUsers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StoryUsers {

    @SerializedName("storyData")
    @Expose
    private List<StoryDatum> storyData = null;

    public List<StoryDatum> getStoryData() {
        return storyData;
    }

    public void setStoryData(List<StoryDatum> storyData) {
        this.storyData = storyData;
    }

}
