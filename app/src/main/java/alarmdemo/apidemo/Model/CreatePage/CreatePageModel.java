
package alarmdemo.apidemo.Model.CreatePage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreatePageModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("page")
    @Expose
    private Page page;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

}
