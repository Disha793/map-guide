package alarmdemo.apidemo.Model.CustomCommentsModel;


public class CustomCommentsModel {
    private String id, comment, created_at;
    private CustomUserInformationModel userInformationModel;

    public CustomUserInformationModel getUserInformationModel() {
        return userInformationModel;
    }

    public void setUserInformationModel(CustomUserInformationModel userInformationModel) {
        this.userInformationModel = userInformationModel;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
