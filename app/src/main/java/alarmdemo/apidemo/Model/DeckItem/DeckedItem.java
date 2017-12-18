
package alarmdemo.apidemo.Model.DeckItem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeckedItem {

    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("user_deck")
    @Expose
    private String userDeck;
    @SerializedName("tvshow_id")
    @Expose
    private String tvshowId;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("dCreatedDate")
    @Expose
    private String dCreatedDate;
    @SerializedName("dUpdateDate")
    @Expose
    private String dUpdateDate;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserDeck() {
        return userDeck;
    }

    public void setUserDeck(String userDeck) {
        this.userDeck = userDeck;
    }

    public String getTvshowId() {
        return tvshowId;
    }

    public void setTvshowId(String tvshowId) {
        this.tvshowId = tvshowId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

}
