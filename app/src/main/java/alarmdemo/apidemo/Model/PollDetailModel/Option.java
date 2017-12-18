
package alarmdemo.apidemo.Model.PollDetailModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Option {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("values")
    @Expose
    private List<Value> values = null;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

}
