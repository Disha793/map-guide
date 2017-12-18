
package alarmdemo.apidemo.Model.PageLike;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PageLikeModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("PageLike")
    @Expose
    private PageLike pageLike;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PageLike getPageLike() {
        return pageLike;
    }

    public void setPageLike(PageLike pageLike) {
        this.pageLike = pageLike;
    }

}
