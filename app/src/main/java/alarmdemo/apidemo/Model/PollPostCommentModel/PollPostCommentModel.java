
package alarmdemo.apidemo.Model.PollPostCommentModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PollPostCommentModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("comment")
    @Expose
    private Comment comment;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

}
