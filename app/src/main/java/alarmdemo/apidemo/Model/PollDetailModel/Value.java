
package alarmdemo.apidemo.Model.PollDetailModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("poll_id")
    @Expose
    private String pollId;
    @SerializedName("option_date")
    @Expose
    private String optionDate;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("availabel")
    @Expose
    private Integer availabel;
    @SerializedName("isVoted")
    @Expose
    private Integer isVoted;

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

    public String getOptionDate() {
        return optionDate;
    }

    public void setOptionDate(String optionDate) {
        this.optionDate = optionDate;
    }

    public String getDCreatedDate() {
        return dCreatedDate;
    }

    public void setDCreatedDate(String dCreatedDate) {
        this.dCreatedDate = dCreatedDate;
    }

    public String getDUpdateDate() {
        return dUpdateDate;
    }

    public void setDUpdateDate(String dUpdateDate) {
        this.dUpdateDate = dUpdateDate;
    }

    public String getEStatus() {
        return eStatus;
    }

    public void setEStatus(String eStatus) {
        this.eStatus = eStatus;
    }

    public Integer getAvailabel() {
        return availabel;
    }

    public void setAvailabel(Integer availabel) {
        this.availabel = availabel;
    }

    public Integer getIsVoted() {
        return isVoted;
    }

    public void setIsVoted(Integer isVoted) {
        this.isVoted = isVoted;
    }

}
