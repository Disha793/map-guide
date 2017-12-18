package alarmdemo.apidemo.Model.SingUp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SFirstName {
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("param")
    @Expose
    private String param;
    @SerializedName("value")
    @Expose
    private String value;

    public String getParam() {
        return this.param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
