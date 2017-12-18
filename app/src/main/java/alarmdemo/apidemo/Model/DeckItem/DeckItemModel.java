
package alarmdemo.apidemo.Model.DeckItem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeckItemModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("deckedItem")
    @Expose
    private DeckedItem deckedItem;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DeckedItem getDeckedItem() {
        return deckedItem;
    }

    public void setDeckedItem(DeckedItem deckedItem) {
        this.deckedItem = deckedItem;
    }

}
