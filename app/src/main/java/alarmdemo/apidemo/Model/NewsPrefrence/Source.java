
package alarmdemo.apidemo.Model.NewsPrefrence;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Source {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("identifire")
    @Expose
    private String identifire;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("newPreferenced")
    @Expose
    private List<NewPreferenced> newPreferenced = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdentifire() {
        return identifire;
    }

    public void setIdentifire(String identifire) {
        this.identifire = identifire;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<NewPreferenced> getNewPreferenced() {
        return newPreferenced;
    }

    public void setNewPreferenced(List<NewPreferenced> newPreferenced) {
        this.newPreferenced = newPreferenced;
    }

}
