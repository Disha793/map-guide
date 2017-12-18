
package alarmdemo.apidemo.Model.PollVoteDetailsModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VotesDatum {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("option_date")
    @Expose
    private String optionDate;
    @SerializedName("votes")
    @Expose
    private List<Vote> votes = null;
    @SerializedName("totalOptionVotes")
    @Expose
    private Integer totalOptionVotes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOptionDate() {
        return optionDate;
    }

    public void setOptionDate(String optionDate) {
        this.optionDate = optionDate;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public Integer getTotalOptionVotes() {
        return totalOptionVotes;
    }

    public void setTotalOptionVotes(Integer totalOptionVotes) {
        this.totalOptionVotes = totalOptionVotes;
    }

}
