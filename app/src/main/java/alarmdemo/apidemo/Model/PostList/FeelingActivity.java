
package alarmdemo.apidemo.Model.PostList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeelingActivity {

    @SerializedName("emoji")
    @Expose
    private Emoji emoji;
    @SerializedName("emoji_type")
    @Expose
    private String emojiType;
    @SerializedName("activity_description")
    @Expose
    private String activityDescription;

    public Emoji getEmoji() {
        return emoji;
    }

    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
    }

    public String getEmojiType() {
        return emojiType;
    }

    public void setEmojiType(String emojiType) {
        this.emojiType = emojiType;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

}
