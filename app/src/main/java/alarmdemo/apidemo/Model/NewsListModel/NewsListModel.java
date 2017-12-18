
package alarmdemo.apidemo.Model.NewsListModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsListModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("news")
    @Expose
    private List<News> news = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

    public List<News> getData() {
        return Data;
    }

    public void setData(List<News> data) {
        Data = data;
    }

    @SerializedName("Data")

    @Expose
    private List<News> Data = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

}
