
package alarmdemo.apidemo.Model.CategoryModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("categoryInfo")
    @Expose
    private List<CategoryInfo> categoryInfo = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<CategoryInfo> getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(List<CategoryInfo> categoryInfo) {
        this.categoryInfo = categoryInfo;
    }

}
