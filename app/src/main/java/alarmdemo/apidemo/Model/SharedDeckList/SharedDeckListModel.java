
package alarmdemo.apidemo.Model.SharedDeckList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SharedDeckListModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("deckList")
    @Expose
    private List<DeckList> deckList = null;

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

}
