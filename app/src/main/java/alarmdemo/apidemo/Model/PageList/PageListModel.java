
package alarmdemo.apidemo.Model.PageList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PageListModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("pageList")
    @Expose
    private List<PageList> pageList = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<PageList> getPageList() {
        return pageList;
    }

    public void setPageList(List<PageList> pageList) {
        this.pageList = pageList;
    }

}
