
package alarmdemo.apidemo.Model.CheckFollowerOrNot;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckFollowerOrNotModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("follow_flg")
    @Expose
    private Integer followFlg;
    @SerializedName("follow_id")
    @Expose
    private String follow_id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getFollowFlg() {
        return followFlg;
    }

    public void setFollowFlg(Integer followFlg) {
        this.followFlg = followFlg;
    }

    public String getFollow_id() {
        return follow_id;
    }

    public void setFollow_id(String follow_id) {
        this.follow_id = follow_id;
    }
}
