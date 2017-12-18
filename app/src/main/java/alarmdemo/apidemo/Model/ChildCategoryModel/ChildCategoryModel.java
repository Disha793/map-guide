
package alarmdemo.apidemo.Model.ChildCategoryModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChildCategoryModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("childrens")
    @Expose
    private List<Childs> childrens = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Childs> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Childs> childrens) {
        this.childrens = childrens;
    }

}
