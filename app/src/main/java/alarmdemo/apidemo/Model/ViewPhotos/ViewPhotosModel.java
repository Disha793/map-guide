package alarmdemo.apidemo.Model.ViewPhotos;

/**
 * Created by yudiz on 23/10/17.
 */

public class ViewPhotosModel {

    private String path;
    private boolean isVideo;
    private String videoPath;

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }
}