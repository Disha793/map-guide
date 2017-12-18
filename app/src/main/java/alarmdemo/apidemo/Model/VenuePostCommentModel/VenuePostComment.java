
package alarmdemo.apidemo.Model.VenuePostCommentModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VenuePostComment {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("venueComment")
    @Expose
    private VenueComment venueComment;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public VenueComment getVenueComment() {
        return venueComment;
    }

    public void setVenueComment(VenueComment venueComment) {
        this.venueComment = venueComment;
    }

}
