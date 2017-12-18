
package alarmdemo.apidemo.Model.NewsPrefrence;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsPrefrenceMain {

    @SerializedName("sources")
    @Expose
    private List<Source> sources = null;

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

}
