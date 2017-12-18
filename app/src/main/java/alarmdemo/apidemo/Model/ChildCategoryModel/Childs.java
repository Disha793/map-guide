
package alarmdemo.apidemo.Model.ChildCategoryModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Childs {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("eStatus")
    @Expose
    private String eStatus;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("parent")
    @Expose
    private String parent;
    @SerializedName("childCount")
    @Expose
    private Integer childCount;
    @SerializedName("hasChildren")
    @Expose
    private Boolean hasChildren;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEStatus() {
        return eStatus;
    }

    public void setEStatus(String eStatus) {
        this.eStatus = eStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Integer getChildCount() {
        return childCount;
    }

    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

}
