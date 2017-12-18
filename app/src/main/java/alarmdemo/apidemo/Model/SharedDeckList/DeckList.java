
package alarmdemo.apidemo.Model.SharedDeckList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeckList {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("deck_id")
    @Expose
    private String deckId;
    @SerializedName("deck_count")
    @Expose
    private Integer deckCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeckId() {
        return deckId;
    }

    public void setDeckId(String deckId) {
        this.deckId = deckId;
    }

    public Integer getDeckCount() {
        return deckCount;
    }

    public void setDeckCount(Integer deckCount) {
        this.deckCount = deckCount;
    }

}
