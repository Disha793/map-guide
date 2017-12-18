package alarmdemo.apidemo.Model.Entertainment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelNetflixSearch {

@SerializedName("message")
@Expose
private String message;
@SerializedName("netflix_id")
@Expose
private String netflixId;

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public String getNetflixId() {
return netflixId;
}

public void setNetflixId(String netflixId) {
this.netflixId = netflixId;
}

}