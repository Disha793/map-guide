package alarmdemo.apidemo.Retrofit;

/**
 * Created by yudizsolutionspvtltd on 26/08/17.
 */

public class Api {
    public static final String IMAGE_BASE_URL = "http://52.91.92.12:3000/";
    //    public static final String BASE_URL = "http://192.168.10.128:3000/";  // local
//    public static final String BASE_URL = "http://192.168.10.128:3000/api/v1/";  // local
    public static final String BASE_URL = " http://52.91.92.12:3000/api/v1/"; // Live
    //Advt
    public static final String ADVT_LIST = "advertise/list";
    public static final String LIKE_ADVT = "advertise/like";
    public static final String UNLIKE_ADVT = "advertise/unlike";


    public static final String MAP_URL = "http://maps.google.com/maps?q="; // MAP REDIRECTION ON LAT LNG
    //Entertainment
    public static final String GET_MOVIES = "movie/get-movies";
    public static final String GET_CELE_NEWS = "celebrity/get-news";
    public static final String GET_VIDEOS = "video/get-videos";
    public static final String GET_TV_SHOWS = "tv/get-shows";
    public static final String GET_SPORTS = "sport/get-sports";
    public static final String GET_MUSIC = "music/get-musics";
    public static final String BASE_YOUTUBE_URL = "https://www.youtube.com/watch?v=";
    public static final String MOVIE_DETAILS = "movie/detail";
    public static final String CAST_CREW_BASE_IMG_URL = "https://image.tmdb.org/t/p/w500";
    public static final String MOVIE_API_KEY = "2fa89e61b05eea13b93c2ef67a7a7257";
    public static final String GET_CAST_N_CREW = "https://api.themoviedb.org/3/movie/{id}/credits?api_key=" + MOVIE_API_KEY;
    public static final String GET_SIMILAR_MOVIE = "https://api.themoviedb.org/3/movie/{id}/similar?api_key=" + MOVIE_API_KEY + "&language=en-US";
    public static final String GET_SINGLE_MOVIE = "https://api.themoviedb.org/3/movie/{id}?api_key=" + MOVIE_API_KEY + "&language=en-US";
    public static final String GET_SINGLE_PERSON = "https://api.themoviedb.org/3/person/{id}?api_key=" + MOVIE_API_KEY + "&language=en-US";
    // login
    static final String LOGIN = "user/login";
    static final String LOGIN_SOCIAL = "user/sociallogin";
    static final String FORGOT_PASSWORD = "user/resetpassword";
    static final String LOGOUT = "user/logout";
    static final String SIGN_UP = "user/register";
    static final String SIGN_UP_SOCIAL = "user/socialregister";
    static final String UPDATE_LOCATION = "user/updateLocation";
    static final String CHANGE_PASSWORD = "user/changepassword";
    static final String ADD_DEVICE = "user/add-device";


    // user
    static final String SEARCH_USER = "user/searchuser";
    static final String USER_PROFILE = "user/getuserprofile";
    static final String EDIT_PROFILE = "user/editprofile";


    // friend
    static final String SEND_FRIEND_REQUEST = "friend/sendFriendRequest";
    static final String PENDING_FRIEND_REQUEST = "friend/pendingList";
    static final String ACCEPT_REJECT_REQUEST = "friend/acceptRejectFriend";
    static final String FRIEND_LIST = "friend/friendList";
    static final String UNFRIEND = "friend/unfriend";
    static final String CANCEL_FRIEND_REQUEST = "friend/cancelfriend";

    // events
    static final String EVENT_LIST = "event/get-list";
    static final String EVENT_DETAIL = "event/detail";
    static final String EVENT_LIKE = "event/like";
    static final String EVENT_UNLIKE = "event/unlike";
    static final String EVENT_COMMENT_LIST = "event/comment-list";
    static final String EVENT_POST_COMMENT = "event/comment";

    // followers
    static final String FOLLOWERS_LIST = "follower/followerList";
    static final String FOLLOWING_LIST = "follower/followingList";
    static final String UNFOLLOW = "follower/unfollowFriend";
    static final String SEND_FOLLOW_REQUEST = "follower/sendFollowerRequest";
    static final String CHECK_FOLLOW_OR_NOT = "follower/checkFollowUnfollow";


    // post
    static final String REMOVE_POST = "post/removePost";
    static final String POST_LIST = "post/postList";
    static final String EDIT_POST = "post/editPost";
    static final String POST_ADD_MEDIA = "post/addMedia";
    static final String POST_REMOVE_MEDIA = "post/removePostMedia";
    static final String POST_MEDIA_LIST = "post/postMediaList";
    static final String LIKE_POST = "post/like";
    static final String UNLIKE_POST = "post/unlike";
    static final String POST_COMMENT_LIST = "post/comment-list";
    static final String POST_COMMENT = "post/comment";
    static final String POST_DETAIL = "post/detail";
    static final String TOP_POST_DETAIL = "post/top-post";
    static final String SOCIAL_POST = "post/social";
    // page
    static final String PAGE_CREATE = "page/createPage";
    static final String PAGE_REMOVE = "page/removePage";
    static final String PAGE_LIST = "page/pageList";
    static final String PAGE_EDIT = "page/editPage";
    static final String PAGE_LIKE = "page/like";
    static final String PAGE_UNLIKE = "page/unlike";
    static final String PAGE_DETAIL = "page/detail";
    //Categories
    static final String CATEGORIES = "categories";
    static final String CHILD_CATEGORIES = "category/children";
    static final String EVENTS_LIST = "event/get-nearby-events";
    static final String NEWS_LIST = "category/news";
    static final String SHOPPING_LIST_GROUPON = "groupon/deals";
    static final String SHOPPING_LIST_ETSY = "etsy/products";
    static final String SHOPPING_LIST_EBAY = "ebay/products";
    static final String SHOPPING_LIST_AMAZONE = "amazone/products";
    static final String NEARBY_LIST = "venue/get-nearby-venues";

    // Deck
    static final String CREATE_DECK = "deck/create";
    static final String EDIT_DECK = "deck/edit";
    static final String REMOVE_DECK = "deck/remove";
    static final String DECK_LIST = "deck/list";
    static final String DECK_ITEM = "deck/item";
    static final String DECK_SHARE = "deck/share";
    static final String DECK_ITEM_LIST = "deck/item-list";
    static final String DECK_ITEM_REMOVE = "deck/item-remove";
    static final String SHARED_DECK_LIST = "deck/share-list";
    //Venue
    static final String VENUE_LIKE = "venue/like";
    static final String VENUE_UNLIKE = "venue/unlike";
    static final String VENUE_COMMENT_LIST = "venue/comment-list";
    static final String VENUE_POST_COMMENT = "venue/comment";
    //POLL
    static final String POLL_LIST = "poll/poll-list";
    static final String CREATE_POLL = "poll/create";
    static final String CREATE_POLL_MEDIA = "poll/cover-image-update";
    static final String POLL_DETAIL = "poll/poll-detail";
    static final String POLL_SUBMIT = "poll/submit";
    static final String POLL_RESULT = "poll/result";
    static final String POLL_DELETE = "poll/delete";
    static final String POLL_POST_COMMENT = "poll/comment";
    static final String POLL_COMMENT_LIST = "poll/comment-list";
    //Offer
    static final String OFFER_LIST = "offer/offerlist";
    static final String OFFER_ADD_LIST = "offer/addpoint";
    static final String OFFER_HISTORY_LIST = "offer/historylist";
    static final String OFFER_LEADERBOARD_LIST = "offer/leaderboard";
    static final String OFFER_REDEEMINFO = "offer/addredeeminfo";
    //News Prefrence
    static final String NEWS_PREFRENCE_LIST = "news/source-list";
    static final String SET_NEWS_PREFRENCE = "news/preference";

    //Stories
    static final String ADD_STORY = "storypost/addStory";
    static final String USER_STORY = "storypost/getStoryUsers";
    static final String USER_STORIES = "storypost/getuserStory";

    // notifcation

    static final String USER_NOTIFICATION = "user/notification";

//    //Advt
//    public static final String LIKE_ADVT = "advertise/like";
//    public static final String UNLIKE_ADVT = "advertise/unlike";

    //News Like
    public static final String NEWS_LIKE = "news/like";
    public static final String NEWS_UNLIKE = "news/unlike";

    static final String LIKE_COMMENT_COUNT = "item/count";


    static final String COMMON_SEARCH = "search/list";

    public static final String SHOPPING_LIKE = "shopping/like";
    public static final String SHOPPING_UNLIKE = "shopping/unlike";

//    public static final String MOVIE_LIKE = "movie/like";
//    public static final String MOVIE_UNLIKE = "movie/unlike";

//    public static final String TVSHOW_LIKE = "tvshow/like";
//    public static final String TVSHOW_UNLIKE = "tvshow/unlike";

    public static final String SPORT_LIKE = "sport/like";
    public static final String SPORT_UNLIKE = "sport/unlike";

    public static final String VIDEO_LIKE = "video/like";
    public static final String VIDEO_UNLIKE = "video/unlike";

    public static final String MUSIC_LIKE = "music/like";
    public static final String MUSIC_UNLIKE = "music/unlike";

    public static final String CELEBRITY_NEWS_LIKE = "celebrity-news/like";
    public static final String CELEBRITY_NEWS_UNLIKE = "celebrity-news/unlike";

    public static final String CELEBRITY_NEWS_COMMENTLIST = "celebrity-news/comment-list";
    public static final String CELEBRITY_NEWS_COMMENT = "celebrity-news/comment";

    public static final String SPORT_COMMENTLIST = "sport/comment-list";
    public static final String SPORT_COMMENT = "sport/comment";

    public static final String VIDEO_COMMENTLIST = "video/comment-list";
    public static final String VIDEO_COMMENT = "video/comment";

    public static final String MUSIC_COMMENTLIST = "music/comment-list";
    public static final String MUSIC_COMMENT = "music/comment";

    public static final String ADVT_COMMENTLIST = "advertise/comment-list";
    public static final String ADVT_COMMENT = "advertise/comment";

    public static final String NEWS_COMMENTLIST = "news/comment-list";
    public static final String NEWS_COMMENT = "news/comment";

    public static final String SHOPPING_COMMENTLIST = "shopping/comment-list";
    public static final String SHOPPING_COMMENT = "shopping/comment";

    public static final String STORY_LIKE = "story/like";
    public static final String STORY_UNLIKE = "story/unlike";

    public static final String STORY_COMMENTLIST = "story/comment-list";
    public static final String STORY_COMMENT = "story/comment";


    //hardik
    public static final String ENTERTAINMENT_LIKE_MOVIE = "movie/like";
    public static final String ENTERTAINMENT_LIKE_TV = "tvshow/like";
    public static final String ENTERTAINMENT_LIKE_CELEBRITY = "celebrity-news/like";
    public static final String ENTERTAINMENT_LIKE_VIDEO = "video/like";
    public static final String ENTERTAINMENT_LIKE_SPORT = "sport/like";
    public static final String ENTERTAINMENT_LIKE_MUSIC = "music/like";

    public static final String ENTERTAINMENT_UNLIKE_MOVIE = "movie/unlike";
    public static final String ENTERTAINMENT_UNLIKE_TV = "tvshow/unlike";
    public static final String ENTERTAINMENT_UNLIKE_CELEBRITY = "celebrity-news/unlike";
    public static final String ENTERTAINMENT_UNLIKE_VIDEO = "video/unlike";
    public static final String ENTERTAINMENT_UNLIKE_SPORT = "sport/unlike";
    public static final String ENTERTAINMENT_UNLIKE_MUSIC = "music/unlike";

    public static final String ENTERTAINMENT_COMMENT_MOVIE = "movie/comment";
    public static final String ENTERTAINMENT_COMMENT_TV = "tvshow/comment";
    public static final String ENTERTAINMENT_COMMENT_CELEBRITY = "celebrity-news/comment";
    public static final String ENTERTAINMENT_COMMENT_VIDEO = "video/comment";
    public static final String ENTERTAINMENT_COMMENT_SPORT = "sport/comment";
    public static final String ENTERTAINMENT_COMMENT_MUSIC = "music/comment";

    public static final String ENTERTAINMENT_COMMENT_LIST_MOVIE = "movie/comment-list";
    public static final String ENTERTAINMENT_COMMENT_LIST_TV = "tvshow/comment-list";


    public static final String BOOK_TICKET = "https://www.google.co.in/search?q=";//https://www.google.co.in/search?q=MovieName+showtimes
    public static final String WATCH_ONLINE = " https://www.netflix.com/watch/";// https://www.netflix.com/watch/{showID}
    public static final String NETFLIX_SEARCH = "netflix/search";

//    public static final String ALLOW_STATUS = "user/allow-status";
    public static final String REPORT_CONTENT = "report/content";

    // coupon
    public static final String REDEEM_CODE = "coupon/redeem-code";
    public static final String COUPON_LIST = "coupon/couponlist";

    public static final String ALLOW_STATUS = "user/allow-status";
    public static final String REDEEM_INFO = "offer/addredeeminfo";

    //Stock
    public static final String STOCK = "stock-market";

    public static final String USER_SEARCH = "search/user";
    public static final String UBER_API = "v1.2/estimates/price";

    public static final String CREATE_POST = "post/createPost";
    public static final String FEELING_ACTIVITY = "emojis";

    public static final String BLOCKED_USER_LIST = "user/block-list";
    public static final String BLOCK_UNBLOCK_USER = "user/block-unblock";
    public static final String COUPON_INVITE = "coupon/invite";
}
