
package alarmdemo.apidemo.Model.DeckItemList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DeckList {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("itemData")
    @Expose
    private List<ItemDatum> itemData = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ItemDatum> getItemData() {
        return itemData;
    }

    public void setItemData(List<ItemDatum> itemData) {
        this.itemData = itemData;
    }

}
