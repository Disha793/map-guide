
package alarmdemo.apidemo.Model.PollVoteDetailsModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vote {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("poll_id")
    @Expose
    private String pollId;
    @SerializedName("option_id")
    @Expose
    private String optionId;
    @SerializedName("UserInformation")
    @Expose
    private UserInformation userInformation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPollId() {
        return pollId;
    }

    public void setPollId(String pollId) {
        this.pollId = pollId;
    }

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

}
