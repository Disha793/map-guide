
package alarmdemo.apidemo.Model.BlockUnBlockModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BlockUnBlockModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("Blocked")
    @Expose
    private List<Blocked> blocked = null;
    @SerializedName("BlockBy")
    @Expose
    private List<BlockBy> blockBy = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Blocked> getBlocked() {
        return blocked;
    }

    public void setBlocked(List<Blocked> blocked) {
        this.blocked = blocked;
    }

    public List<BlockBy> getBlockBy() {
        return blockBy;
    }

    public void setBlockBy(List<BlockBy> blockBy) {
        this.blockBy = blockBy;
    }

}
