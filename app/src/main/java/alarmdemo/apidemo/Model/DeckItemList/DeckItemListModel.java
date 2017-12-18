
package alarmdemo.apidemo.Model.DeckItemList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DeckItemListModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("deckList")
    @Expose
    private List<DeckList> deckList = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DeckList> getDeckList() {
        return deckList;
    }

    public void setDeckList(List<DeckList> deckList) {
        this.deckList = deckList;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
