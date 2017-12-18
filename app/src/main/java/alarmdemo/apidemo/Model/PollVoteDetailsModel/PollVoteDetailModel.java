
package alarmdemo.apidemo.Model.PollVoteDetailsModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PollVoteDetailModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("votesData")
    @Expose
    private List<VotesDatum> votesData = null;
    @SerializedName("totalVotes")
    @Expose
    private Integer totalVotes;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<VotesDatum> getVotesData() {
        return votesData;
    }

    public void setVotesData(List<VotesDatum> votesData) {
        this.votesData = votesData;
    }

    public Integer getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

}
