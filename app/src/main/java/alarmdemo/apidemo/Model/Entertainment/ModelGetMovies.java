package alarmdemo.apidemo.Model.Entertainment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelGetMovies {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName(value = "data", alternate = {"Data"})
    @Expose
    private List<Datum> data = null;
    @SerializedName("TotalData")
    @Expose
    private TotalData totalData;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public TotalData getTotalData() {
        return totalData;
    }

    public void setTotalData(TotalData totalData) {
        this.totalData = totalData;
    }

    public class TotalData {

        @SerializedName("TotalData")
        @Expose
        private Integer totalData;

        public Integer getTotalData() {
            return totalData;
        }

        public void setTotalData(Integer totalData) {
            this.totalData = totalData;
        }

    }

    public class Datum {
        @SerializedName("entertainment_type")
        @Expose
        private String entertainment_type;

        public String getEntertainment_type() {
            return entertainment_type;
        }

        public void setEntertainment_type(String entertainment_type) {
            this.entertainment_type = entertainment_type;
        }

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("original_title")
        @Expose
        private String originalTitle;
        @SerializedName("identifire")
        @Expose
        private String identifire;
        @SerializedName("original_language")
        @Expose
        private String originalLanguage;
        @SerializedName("vote_count")
        @Expose
        private Integer voteCount;
        @SerializedName("vote_average")
        @Expose
        private Double voteAverage;
        @SerializedName("popularity")
        @Expose
        private Double popularity;
        @SerializedName("overview")
        @Expose
        private String overview;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("release_date")
        @Expose
        private String releaseDate;
        @SerializedName("category_id")
        @Expose
        private String categoryId;
        @SerializedName("category")
        @Expose
        private String category;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("backdrop_path")
        @Expose
        private String backdropPath;
        @SerializedName("poster_path")
        @Expose
        private String posterPath;
        @SerializedName("default_image")
        @Expose
        private String default_image;
        @SerializedName("videoId")
        @Expose
        private String videoId;
        @SerializedName("likes_count")
        @Expose
        private Integer likesCount;
        @SerializedName("movieLiked")
        @Expose
        private List<Object> movieLiked = null;

        @SerializedName("tvshowLiked")
        @Expose
        private List<Object> tvshowLiked = null;

        @SerializedName("deck_count")
        @Expose
        private Integer deckCount;
        @SerializedName("decked")
        @Expose
        private List<Object> decked = null;
        @SerializedName("comment_count")
        @Expose
        private Integer commentCount;

        public String getVideoId() {
            return videoId;
        }

        public void setVideoId(String videoId) {
            this.videoId = videoId;
        }

        public String getDefault_image() {
            return default_image;
        }

        public void setDefault_image(String default_image) {
            this.default_image = default_image;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getOriginalTitle() {
            return originalTitle;
        }

        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        public String getIdentifire() {
            return identifire;
        }

        public void setIdentifire(String identifire) {
            this.identifire = identifire;
        }

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        public Integer getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(Integer voteCount) {
            this.voteCount = voteCount;
        }

        public Double getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(Double voteAverage) {
            this.voteAverage = voteAverage;
        }

        public Double getPopularity() {
            return popularity;
        }

        public void setPopularity(Double popularity) {
            this.popularity = popularity;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public Integer getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
        }

        public List<Object> getMovieLiked() {
            return movieLiked;
        }

        public void setMovieLiked(List<Object> movieLiked) {
            this.movieLiked = movieLiked;
        }

        public Integer getDeckCount() {
            return deckCount;
        }

        public void setDeckCount(Integer deckCount) {
            this.deckCount = deckCount;
        }

        public List<Object> getDecked() {
            return decked;
        }

        public void setDecked(List<Object> decked) {
            this.decked = decked;
        }

        public Integer getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(Integer commentCount) {
            this.commentCount = commentCount;
        }

        public List<Object> getTvshowLiked() {
            return tvshowLiked;
        }

        public void setTvshowLiked(List<Object> tvshowLiked) {
            this.tvshowLiked = tvshowLiked;
        }
    }

}