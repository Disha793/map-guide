
package alarmdemo.apidemo.Model.CreatePollModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CreatePollModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("polls")
    @Expose
    private List<Poll> polls = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Poll> getPolls() {
        return polls;
    }

    public void setPolls(List<Poll> polls) {
        this.polls = polls;
    }

}
