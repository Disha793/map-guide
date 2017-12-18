
package alarmdemo.apidemo.Model.PageDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PageDetailModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("pageDetail")
    @Expose
    private List<PageDetail> pageDetail = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<PageDetail> getPageDetail() {
        return pageDetail;
    }

    public void setPageDetail(List<PageDetail> pageDetail) {
        this.pageDetail = pageDetail;
    }

}
