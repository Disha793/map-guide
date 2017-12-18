
package alarmdemo.apidemo.Model.OfferLeaderBoard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OfferLeaderBoard {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("Leaderboardlist")
    @Expose
    private List<Leaderboard> leaderboard = null;
    @SerializedName("TotalData")
    @Expose
    private LeaderBoardTotalData totalData;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Leaderboard> getLeaderboard() {
        return leaderboard;
    }

    public void setLeaderboard(List<Leaderboard> leaderboard) {
        this.leaderboard = leaderboard;
    }


    public LeaderBoardTotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(LeaderBoardTotalData totalData) {
        this.totalData = totalData;
    }
}
