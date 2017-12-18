package alarmdemo.apidemo.Model.PollDetailModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yudiz on 15/11/17.
 */

public class PollDetailFilterModel {
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @SerializedName("label")
    @Expose
    private String label;

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

    public String getdCreatedDate() {
        return dCreatedDate;
    }

    public void setdCreatedDate(String dCreatedDate) {
        this.dCreatedDate = dCreatedDate;
    }

    public String getdUpdateDate() {
        return dUpdateDate;
    }

    public void setdUpdateDate(String dUpdateDate) {
        this.dUpdateDate = dUpdateDate;
    }

    public String geteStatus() {
        return eStatus;
    }

    public void seteStatus(String eStatus) {
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
