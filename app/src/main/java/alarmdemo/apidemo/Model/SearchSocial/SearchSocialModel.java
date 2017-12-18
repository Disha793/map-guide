
package alarmdemo.apidemo.Model.SearchSocial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchSocialModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("searchArray")
    @Expose
    private List<SearchArray> searchArray = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<SearchArray> getSearchArray() {
        return searchArray;
    }

    public void setSearchArray(List<SearchArray> searchArray) {
        this.searchArray = searchArray;
    }

}
