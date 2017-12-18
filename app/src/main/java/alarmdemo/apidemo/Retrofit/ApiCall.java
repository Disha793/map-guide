package alarmdemo.apidemo.Retrofit;


import alarmdemo.apidemo.Model.AcceptRejectFriendRequest.AcceptRejectFriendRequestModel;
import alarmdemo.apidemo.Model.AdListModel.AdListModel;
import alarmdemo.apidemo.Model.AddDevice.AddDeviceModel;
import alarmdemo.apidemo.Model.AddPostMedia.AddPostMediaModel;
import alarmdemo.apidemo.Model.AddStory.AddStoryModel;
import alarmdemo.apidemo.Model.AmezoneListModel.AmezoneListModel;
import alarmdemo.apidemo.Model.BlockUnBlockModel.BlockUnBlockModel;
import alarmdemo.apidemo.Model.CancelFriendRequest.CancelFriendReqModel;
import alarmdemo.apidemo.Model.CategoryModel.CategoryModel;
import alarmdemo.apidemo.Model.ChangePassword.ChangePasswordModel;
import alarmdemo.apidemo.Model.CheckFollowerOrNot.CheckFollowerOrNotModel;
import alarmdemo.apidemo.Model.CheckInModel.CheckInModel;
import alarmdemo.apidemo.Model.ChildCategoryModel.ChildCategoryModel;
import alarmdemo.apidemo.Model.CommentListEventModel.CommentListEventModel;
import alarmdemo.apidemo.Model.Comments.Comments;
import alarmdemo.apidemo.Model.CouponList.CouponListModel;
import alarmdemo.apidemo.Model.CreateDeck.CreateDeckModel;
import alarmdemo.apidemo.Model.CreatePage.CreatePageModel;
import alarmdemo.apidemo.Model.CreatePollModel.CreatePollModel;
import alarmdemo.apidemo.Model.CreatePost.CreatePostModel;
import alarmdemo.apidemo.Model.CustomCommentModel.CustomCommentModel;
import alarmdemo.apidemo.Model.CustomPostCommentModel.CustomPostCommentModel;
import alarmdemo.apidemo.Model.DeckItem.DeckItemModel;
import alarmdemo.apidemo.Model.DeckItemList.DeckItemListModel;
import alarmdemo.apidemo.Model.DeckList.DeckListModel;
import alarmdemo.apidemo.Model.DeletePage.DeletePageModel;
import alarmdemo.apidemo.Model.EbayShoppingModel.EbayModelModel;
import alarmdemo.apidemo.Model.EditDeck.EditDeckModel;
import alarmdemo.apidemo.Model.EditPage.EditPageModel;
import alarmdemo.apidemo.Model.EditProfile.EditProfileModel;
import alarmdemo.apidemo.Model.Entertainment.ModelCastNCrew;
import alarmdemo.apidemo.Model.Entertainment.ModelGetMovies;
import alarmdemo.apidemo.Model.Entertainment.ModelGetSimilarMovie;
import alarmdemo.apidemo.Model.Entertainment.ModelNetflixSearch;
import alarmdemo.apidemo.Model.Entertainment.ModelPersonDetail;
import alarmdemo.apidemo.Model.Entertainment.ModelSingleMovieDetail;
import alarmdemo.apidemo.Model.EtsyShoppingModel.EtsyModelModel;
import alarmdemo.apidemo.Model.EventDetailModel.EventDetailModel;
import alarmdemo.apidemo.Model.Events.Events;
import alarmdemo.apidemo.Model.EventsModel.EventsModel;
import alarmdemo.apidemo.Model.FeelingActivityModel.FeelingActivityModel;
import alarmdemo.apidemo.Model.Followers.FollowersModel;
import alarmdemo.apidemo.Model.FollowingModel.FollowingModel;
import alarmdemo.apidemo.Model.ForgotPassword.ForgotPwdModel;
import alarmdemo.apidemo.Model.FriendList.FriendListModel;
import alarmdemo.apidemo.Model.GroupOnShoppingModel.GroupOnModelModel;
import alarmdemo.apidemo.Model.Invite.InviteModel;
import alarmdemo.apidemo.Model.InviteEmail.InviteEmailModel;
import alarmdemo.apidemo.Model.LikeCommentCount.LikeCommentCount;
import alarmdemo.apidemo.Model.LikePostModel.LikePostModel;
import alarmdemo.apidemo.Model.LikeUnlikeModel.LikeUnLikeModel;
import alarmdemo.apidemo.Model.LoginModel.LoginModel;
import alarmdemo.apidemo.Model.LogoutModel.LogoutModel;
import alarmdemo.apidemo.Model.MediaListModel.MediaListModel;
import alarmdemo.apidemo.Model.MovieTrailer.MovieTrailerModel;
import alarmdemo.apidemo.Model.NearbyModel.NearbyModel;
import alarmdemo.apidemo.Model.NewsComment.NewsComment;
import alarmdemo.apidemo.Model.NewsCommentList.NewsCommentList;
import alarmdemo.apidemo.Model.NewsListModel.NewsListModel;
import alarmdemo.apidemo.Model.NewsPrefrence.NewsPrefrenceMain;
import alarmdemo.apidemo.Model.NotificationModel.NotificationModel;
import alarmdemo.apidemo.Model.OfferAddPoint.OfferAddpoint;
import alarmdemo.apidemo.Model.OfferHistory.OfferHistory;
import alarmdemo.apidemo.Model.OfferLeaderBoard.OfferLeaderBoard;
import alarmdemo.apidemo.Model.OfferModel.OfferListModel;
import alarmdemo.apidemo.Model.PageDetails.PageDetailModel;
import alarmdemo.apidemo.Model.PageLike.PageLikeModel;
import alarmdemo.apidemo.Model.PageList.PageListModel;
import alarmdemo.apidemo.Model.PageSearchModel.PageSearchModel;
import alarmdemo.apidemo.Model.PendingFriend.PendingFriendModel;
import alarmdemo.apidemo.Model.PeopleSearchModel.PeopleSearchModel;
import alarmdemo.apidemo.Model.PollCommentListModel.PollCommentListModel;
import alarmdemo.apidemo.Model.PollDetailModel.PollDetailModel;
import alarmdemo.apidemo.Model.PollPostCommentModel.PollPostCommentModel;
import alarmdemo.apidemo.Model.PollSubmitModel.PollSubmitModel;
import alarmdemo.apidemo.Model.PollVoteDetailsModel.PollVoteDetailModel;
import alarmdemo.apidemo.Model.PostComment.PostComment;
import alarmdemo.apidemo.Model.PostCommentEventModel.PostCommentEventModel;
import alarmdemo.apidemo.Model.PostDetailModel.PostDetailModel;
import alarmdemo.apidemo.Model.PostList.PostListModel;
import alarmdemo.apidemo.Model.RedeemCode.RedeemCodeModel;
import alarmdemo.apidemo.Model.RedeemInfo.RedeemInfoModel;
import alarmdemo.apidemo.Model.RemoveDeck.RemoveDeck;
import alarmdemo.apidemo.Model.RemoveDeckItem.RemoveDeckItemModel;
import alarmdemo.apidemo.Model.RemovePostModel.RemovePostModel;
import alarmdemo.apidemo.Model.SearchFriendModel.FriendSearchModel;
import alarmdemo.apidemo.Model.SearchSocial.SearchSocialModel;
import alarmdemo.apidemo.Model.SearchUserModel.SearchUserModel;
import alarmdemo.apidemo.Model.SendFollowReq.SendFollowReqModel;
import alarmdemo.apidemo.Model.SendFriendRequest.SendFriendReqModel;
import alarmdemo.apidemo.Model.ShareDeck.ShareDeckList;
import alarmdemo.apidemo.Model.SharedDeckList.SharedDeckListModel;
import alarmdemo.apidemo.Model.SingUp.SingUpModel;
import alarmdemo.apidemo.Model.SocialPostModel.SocialPostModel;
import alarmdemo.apidemo.Model.SocialSignUp.SocialSignUpModel;
import alarmdemo.apidemo.Model.Stock.StockModel;
import alarmdemo.apidemo.Model.StoryUsers.StoryUsers;
import alarmdemo.apidemo.Model.TopPostModel.TopPostModel;
import alarmdemo.apidemo.Model.UberModel.UberModel;
import alarmdemo.apidemo.Model.UnFollow.UnFollowModel;
import alarmdemo.apidemo.Model.Unfriend.UnfriendModel;
import alarmdemo.apidemo.Model.UnlikePage.UnlikePageModel;
import alarmdemo.apidemo.Model.UnlikePostModel.UnlikePostModel;
import alarmdemo.apidemo.Model.UpdateLocation.UpdateLocationModel;
import alarmdemo.apidemo.Model.UserProfile.UserProfileModel;
import alarmdemo.apidemo.Model.UserStories.UserStories;
import alarmdemo.apidemo.Model.VenueCommentsList.VenueCommentsList;
import alarmdemo.apidemo.Model.VenueLikeUnlike.VenueLikeUnlike;
import alarmdemo.apidemo.Model.VenuePostCommentModel.VenuePostComment;
import alarmdemo.apidemo.Model.WeatherDetail.WeatherDetailsModel;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by yudizsolutionspvtltd on 26/08/17.
 */

public interface ApiCall {

    // sign_up simple
    @FormUrlEncoded
    @POST(Api.SIGN_UP)
    Call<SingUpModel> getSignUp(@Field("sFirstName") String FirstName, @Field("sLastName") String LastName, @Field("sEmail") String Email, @Field("sPassword") String Password);

    // Login Simple
    @FormUrlEncoded
    @POST(Api.LOGIN)
    Call<LoginModel> getLogin(@Field("sEmail") String email, @Field("sPassword") String pwd);

    // Forgot Password

    @FormUrlEncoded
    @POST(Api.FORGOT_PASSWORD)
    Call<ForgotPwdModel> getForgotPassword(@Field("sEmail") String email);


    @FormUrlEncoded
    @POST(Api.ADD_DEVICE)
    Call<AddDeviceModel> getAddDevice(@Header("Authorization") String Authorization, @Field("sDeviceToken") String Token, @Field("eDeviceType") String type, @Field("user_id") String UserId);


    @FormUrlEncoded
    @POST(Api.SIGN_UP_SOCIAL)
    Call<SocialSignUpModel> getSocialSignUp(@Field("sFirstName") String fName, @Field("sLastName") String lName, @Field("sEmail") String email, @Field("sPassword") String password, @Field("social_type") String socialType, @Field("social_id") String socialId);

    // Login Social
    @FormUrlEncoded
    @POST(Api.LOGIN_SOCIAL)
    Call<LoginModel> getSocialLogin(@Field("social_type") String socialType, @Field("social_id") String socialId);


    // Update Location
    @FormUrlEncoded
    @POST(Api.UPDATE_LOCATION)
    Call<UpdateLocationModel> getUpdateLocation(@Header("Authorization") String Authorization, @Field("lat") Double lat, @Field("long") Double log, @Field("sAddress") String address);

    // Change Password
    @FormUrlEncoded
    @POST(Api.CHANGE_PASSWORD)
    Call<ChangePasswordModel> getChangePassword(@Header("Authorization") String Authorization, @Field("sCurrentPassword") String cPass, @Field("sNewPassword") String nPass, @Field("sRePassword") String rPass);

    // logout
    @GET(Api.LOGOUT)
    Call<LogoutModel> getLogout(@Header("Authorization") String Authorization);


    // user search
    @FormUrlEncoded
    @POST(Api.SEARCH_USER)
    Call<SearchSocialModel> getUserSearch(@Header("Authorization") String Authorization, @Field("vSearch") String SearchKey, @Field("iLimit") int limit, @Field("iStart") int start);


    // send friend request
    @FormUrlEncoded
    @POST(Api.SEND_FRIEND_REQUEST)
    Call<SendFriendReqModel> sendFriendRequest(@Header("Authorization") String Authorization, @Field("sSender_id") String senderId, @Field("sReceiver_id") String receiverId);


    // pending friend request
    @FormUrlEncoded
    @POST(Api.PENDING_FRIEND_REQUEST)
    Call<PendingFriendModel> getPendingFriendRequest(@Header("Authorization") String Authorization, @Field("iStart") int start, @Field("iLimit") int limit);

    // accept reject friend request
    @FormUrlEncoded
    @POST(Api.ACCEPT_REJECT_REQUEST)
    Call<AcceptRejectFriendRequestModel> getAcceptRejectFriendRequest(@Header("Authorization") String Authorization, @Field("_id") String userId, @Field("eRequestStatus") String status);


    @FormUrlEncoded
    @POST(Api.EVENT_LIST)
    Call<Events> getEventList(@Header("Authorization") String Authorization, @Field("iStart") int start, @Field("iLimit") int limit);

    //EVENT DETAIL
    @FormUrlEncoded
    @POST(Api.EVENT_DETAIL)
    Call<EventDetailModel> getEventDetail(
            @Header("Authorization") String Authorization,
            @Field("id") String id);

    //EVENT LIKE
    @FormUrlEncoded
    @POST(Api.EVENT_LIKE)
    Call<LikeUnLikeModel> eventLike(
            @Header("Authorization") String Authorization,
            @Field("id") String id);

    //EVENT UNLIKE
    @FormUrlEncoded
    @POST(Api.EVENT_UNLIKE)
    Call<LikeUnLikeModel> eventUnlike(
            @Header("Authorization") String Authorization,
            @Field("id") String id);

    //EVENT COMMENT LIST
    @FormUrlEncoded
    @POST(Api.EVENT_COMMENT_LIST)
    Call<CommentListEventModel> eventCommentList(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);

    //EVENT POST COMMENT
    @FormUrlEncoded
    @POST(Api.EVENT_POST_COMMENT)
    Call<PostCommentEventModel> eventPostComment(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("comment") String comment);

    //friend list
    @FormUrlEncoded
    @POST(Api.FRIEND_LIST)
    Call<FriendListModel> getFriendList(@Header("Authorization") String Authorization, @Field("iStart") int start, @Field("iLimit") int limit, @Field("user_id") String userId);


    // Unfriend
    @FormUrlEncoded
    @POST(Api.UNFRIEND)
    Call<UnfriendModel> getUnfriend(@Header("Authorization") String Authorization, @Field("friend_pid") String friendId);


    // User Profile
    @FormUrlEncoded
    @POST(Api.USER_PROFILE)
    Call<UserProfileModel> getUserProfile(@Header("Authorization") String Authorization, @Field("user_id") String userId);


    // Edit Profile
    @Multipart
    @POST(Api.EDIT_PROFILE)
    Call<EditProfileModel> getEditProfile(@Header("Authorization") String Authorization, @Part("sFirstName") RequestBody sFirstName, @Part("sLastName") RequestBody sLastName, @Part("dDob") RequestBody dDob,
                                          @Part("eGender") RequestBody eGender, @Part MultipartBody.Part sProfilePicture, @Part MultipartBody.Part sCoverPhoto, @Part("sAbout") RequestBody sAbout,
                                          @Part("sWebpageUrl") RequestBody sWebpageUrl, @Part("sNickName") RequestBody sNickName, @Part("sDesignation") RequestBody sDesignation, @Part("sMobile") RequestBody sMobile);


    // Cancel Friend Request
    @FormUrlEncoded
    @POST(Api.CANCEL_FRIEND_REQUEST)
    Call<CancelFriendReqModel> getCancelFriendRequest(@Header("Authorization") String Authorization, @Field("friend_pid") String userId);


    // Followers list
    @FormUrlEncoded
    @POST(Api.FOLLOWERS_LIST)
    Call<FollowersModel> getFollowersList(@Header("Authorization") String Authorization, @Field("iStart") int start, @Field("iLimit") int limit, @Field("user_id") String userId);


    // Following list
    @FormUrlEncoded
    @POST(Api.FOLLOWING_LIST)
    Call<FollowingModel> getFollowingList(@Header("Authorization") String Authorization, @Field("iStart") int start, @Field("iLimit") int limit, @Field("user_id") String userId);

    // UnFollow
    @FormUrlEncoded
    @POST(Api.UNFOLLOW)
    Call<UnFollowModel> getUnfollow(@Header("Authorization") String Authorization, @Field("follow_id") String followId);

    // PostComments
    @FormUrlEncoded
    @POST(Api.POST_COMMENT)
    Call<PostComment> postComment(
            @Header("Authorization") String Authorization,
            @Field("id") String post_id,
            @Field("comment") String comment);


    //POST DETAIL
    @FormUrlEncoded
    @POST(Api.POST_DETAIL)
    Call<PostDetailModel> postDetail(
            @Header("Authorization") String Authorization,
            @Field("id") String post_id);

    //TOP POST DETAIL
    @GET(Api.TOP_POST_DETAIL)
    Call<TopPostModel> topPostDetail(
            @Header("Authorization") String Authorization);

    //SOCIAL POST DETAIL
    @FormUrlEncoded
    @POST(Api.SOCIAL_POST)
    Call<SocialPostModel> socialPostDetail(
            @Header("Authorization") String Authorization,
            @Field("iStart") int iStart,
            @Field("iLimit") int iLimit);

    // create page
    @Multipart
    @POST(Api.PAGE_CREATE)
    Call<CreatePageModel> getCreatePage(@Header("Authorization") String Authorization, @Part("sPageName") RequestBody pageName, @Part("sAboutPage") RequestBody aboutPage
            , @Part("sWebsiteUrl") RequestBody websiteUrl, @Part MultipartBody.Part sCoverPhoto, @Part MultipartBody.Part sPageProfile);

    // Page List
    @FormUrlEncoded
    @POST(Api.PAGE_LIST)
    Call<PageListModel> getPageList(@Header("Authorization") String Authorization, @Field("iStart") int start, @Field("iLimit") int limit, @Field("user_id") String userId);

    // Check follower or not
    @FormUrlEncoded
    @POST(Api.CHECK_FOLLOW_OR_NOT)
    Call<CheckFollowerOrNotModel> getFollowerStatus(@Header("Authorization") String Authorization, @Field("sReceiver_id") String userId);


    // send follow request
    @FormUrlEncoded
    @POST(Api.SEND_FOLLOW_REQUEST)
    Call<SendFollowReqModel> getFollowRequest(@Header("Authorization") String Authorization, @Field("sReceiver_id") String userId);


    //Create user post
    @FormUrlEncoded
    @POST(Api.CREATE_POST)
    Call<CreatePostModel> createPost(
            @Header("Authorization") String Authorization,
            @Field("sDescription") String description,
            @Field("ePostType") String postType,
            @Field("sUserId") String userId,
            @Field("access_type") String accessType,
            @Field("tags") String tags,
            @Field("emoji_type") String emoji_type,
            @Field("emoji_id") String emoji_id,
            @Field("activity_description") String activity_description,
            @Field("address") String address,
            @Field("lat") Double lat,
            @Field("lon") Double lon);

    //Create user post
    @FormUrlEncoded
    @POST(Api.CREATE_POST)
    Call<CreatePostModel> createPagePost(
            @Header("Authorization") String Authorization,
            @Field("sDescription") String description,
            @Field("ePostType") String postType,
            @Field("sPageId") String pageId,
            @Field("access_type") String accessType,
            @Field("tags") String tags,
            @Field("emoji_type") String emoji_type,
            @Field("emoji_id") String emoji_id,
            @Field("activity_description") String activity_description,
            @Field("address") String address,
            @Field("lat") Double lat,
            @Field("lon") Double lon);


    @GET()
    Call<CheckInModel> getCheckIn(@Url String url);

    //FEELING ACTIVITY
    @FormUrlEncoded
    @POST(Api.FEELING_ACTIVITY)
    Call<FeelingActivityModel> callFeelingActivity(
            @Header("Authorization") String auth,
            @Field("type") String type);

    //Add media
    @Multipart
    @POST(Api.POST_ADD_MEDIA)
    Call<AddPostMediaModel> addPostMediaWithVideo(
            @Header("Authorization") String Authorization,
            @Part("id") RequestBody postId,
            @Part MultipartBody.Part media,
            @Part MultipartBody.Part thumbnail);

    //Add media
    @Multipart
    @POST(Api.POST_ADD_MEDIA)
    Call<AddPostMediaModel> addPostMediaWithOutVideo(
            @Header("Authorization") String Authorization,
            @Part("id") RequestBody postId,
            @Part MultipartBody.Part media);

    //Media List
    @FormUrlEncoded
    @POST(Api.POST_MEDIA_LIST)
    Call<MediaListModel> getMediaList(
            @Header("Authorization") String Authorization,
            @Field("sPageIdorsUserId") String sPageIdorsUserId,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);

    // post comments list
    @FormUrlEncoded
    @POST(Api.POST_COMMENT_LIST)
    Call<Comments> postCommentsList(
            @Header("Authorization") String Authorization,
            @Field("id") String post_id);

    //Get post list
    @FormUrlEncoded
    @POST(Api.POST_LIST)
    Call<PostListModel> getPostList(
            @Header("Authorization") String Authorization,
            @Field("sPageIdorsUserId") String sPageIdorsUserId,
            @Field("ePostType") String ePostType,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);


    //like post
    @FormUrlEncoded
    @POST(Api.LIKE_POST)
    Call<LikePostModel> likePost(@Header("Authorization") String Authorization, @Field("id") String post_id);

    //UNLIKE POST
    @FormUrlEncoded
    @POST(Api.UNLIKE_POST)
    Call<UnlikePostModel> unlikePost(@Header("Authorization") String Authorization, @Field("id") String post_id);

    //REMOVE POST
    @FormUrlEncoded
    @POST(Api.REMOVE_POST)
    Call<RemovePostModel> removePost(@Header("Authorization") String Authorization, @Field("id") String post_id);

    // Like page
    @FormUrlEncoded
    @POST(Api.PAGE_LIKE)
    Call<PageLikeModel> getPageLike(@Header("Authorization") String Authorization, @Field("page_id") String pageId);

    // Unlike page
    @FormUrlEncoded
    @POST(Api.PAGE_UNLIKE)
    Call<UnlikePageModel> getPageUnlike(@Header("Authorization") String Authorization, @Field("page_id") String pageId);

    // remove page
    @FormUrlEncoded
    @POST(Api.PAGE_REMOVE)
    Call<DeletePageModel> getRemovePage(@Header("Authorization") String Authorization, @Field("page_id") String pageId);

    // page details
    @FormUrlEncoded
    @POST(Api.PAGE_DETAIL)
    Call<PageDetailModel> getPageDetails(@Header("Authorization") String Authorization, @Field("page_id") String pageId);

    // edit page
    @Multipart
    @POST(Api.PAGE_EDIT)
    Call<EditPageModel> getEditPage(@Header("Authorization") String Authorization, @Part("page_id") RequestBody pageId, @Part("sPageName") RequestBody pageName, @Part("sAboutPage") RequestBody aboutPage
            , @Part("sWebsiteUrl") RequestBody websiteUrl, @Part MultipartBody.Part sCoverPhoto, @Part MultipartBody.Part sPageProfile);

    //Get Categories
    @GET(Api.CATEGORIES)
    Call<CategoryModel> getCategoriesList(@Header("Authorization") String Authorization);

    //Get Child Categories
    @FormUrlEncoded
    @POST(Api.CHILD_CATEGORIES)
    Call<ChildCategoryModel> getChildCategoriesList(@Header("Authorization") String Authorization, @Field("parent_id") String parent_id);


    //Get News List
    @FormUrlEncoded
    @POST(Api.NEWS_LIST)
    Call<NewsListModel> getNewsList(@Header("Authorization") String Authorization, @Field("category_id") String category_id, @Field("iStart") int iStart, @Field("iLimit") int iLimit);

    // Venue Comment list
    @FormUrlEncoded
    @POST(Api.VENUE_COMMENT_LIST)
    Call<VenueCommentsList> getVenueCommentList(@Header("Authorization") String auth, @Field("id") String venue_id, @Field("iLimit") int iLimit, @Field("iStart") int iStart);

    // Venue Post comment
    @FormUrlEncoded
    @POST(Api.VENUE_POST_COMMENT)
    Call<VenuePostComment> getVenuePostComment(@Header("Authorization") String auth, @Field("id") String venue_id, @Field("comment") String comment);

    //SHOPPING LIST GROPU ON
    @FormUrlEncoded
    @POST(Api.SHOPPING_LIST_GROUPON)
    Call<GroupOnModelModel> getGroupOnShoppingList(
            @Header("Authorization") String Authorization,
            @Field("category_id") String category_id,
            @Field("lat") Double lat,
            @Field("lon") Double lon,
            @Field("iStart") int iStart,
            @Field("iLimit") int iLimit);

    //SHOPPING LIST GROPU ON
    @FormUrlEncoded
    @POST(Api.SHOPPING_LIST_ETSY)
    Call<EtsyModelModel> getEtsyShoppingList(
            @Header("Authorization") String Authorization,
            @Field("category_id") String category_id,
            @Field("lat") Double lat,
            @Field("lon") Double lon,
            @Field("iStart") int iStart,
            @Field("iLimit") int iLimit);


    //SHOPPING LIST GROUPON
    @FormUrlEncoded
    @POST(Api.SHOPPING_LIST_EBAY)
    Call<EbayModelModel> getEbayShoppingList(
            @Header("Authorization") String Authorization,
            @Field("category_id") String category_id,
            @Field("lat") Double lat,
            @Field("lon") Double lon,
            @Field("iStart") int iStart,
            @Field("iLimit") int iLimit);

    //    SHOPPING LIST AMEZONE
    @FormUrlEncoded
    @POST(Api.SHOPPING_LIST_AMAZONE)
    Call<AmezoneListModel> getAmezoneShoppingList(
            @Header("Authorization") String Authorization,
            @Field("category_id") String category_id,
            @Field("lat") Double lat,
            @Field("lon") Double lon,
            @Field("iStart") int iStart,
            @Field("iLimit") int iLimit);

    //Get Nearby List
    @FormUrlEncoded
    @POST(Api.NEARBY_LIST)
    Call<NearbyModel> getNearbyList(
            @Header("Authorization") String Authorization,
            @Field("category_id") String category_id,
            @Field("iStart") int iStart,
            @Field("iLimit") int iLimit,
            @Field("range") int range,
            @Field("lat") double lat,
            @Field("lon") double lon);

    //GET EVENTS LIST
    @FormUrlEncoded
    @POST(Api.EVENTS_LIST)
    Call<EventsModel> getEventList(
            @Header("Authorization") String Authorization,
            @Field("category_id") String category_id,
            @Field("page") int page,
            @Field("per_page") int per_page,
            @Field("range") String range,
            @Field("lat") double lat,
            @Field("lon") double lon);

    // Weather
    @GET
    Call<WeatherDetailsModel> getWeatherDetail(@Url String url, @Query("lat") Double lat, @Query("lon") Double lng, @Query("appid") String appId);


    // Create Deck
    @FormUrlEncoded
    @POST(Api.CREATE_DECK)
    Call<CreateDeckModel> getCreateDeck(@Header("Authorization") String Authorization, @Field("title") String title);

    // Deck List
    @FormUrlEncoded
    @POST(Api.DECK_LIST)
    Call<DeckListModel> getDeckList(@Header("Authorization") String Authorization, @Field("user_id") String userId);

    //Deck Item List
    @FormUrlEncoded
    @POST(Api.DECK_ITEM_LIST)
    Call<DeckItemListModel> getDeckItemList(@Header("Authorization") String Authorization, @Field("deck_id") String deckId, @Field("iStart") int iStart, @Field("iLimit") int iLimit);

    // Remove Deck
    @FormUrlEncoded
    @POST(Api.REMOVE_DECK)
    Call<RemoveDeck> getRemoveDeck(@Header("Authorization") String Authorization, @Field("deck_id") String deckId);

    // Edit Deck
    @FormUrlEncoded
    @POST(Api.EDIT_DECK)
    Call<EditDeckModel> getEditDeck(@Header("Authorization") String Authorization, @Field("deck_id") String deckId, @Field("title") String title);


    // remove deck item
    @FormUrlEncoded
    @POST(Api.DECK_ITEM_REMOVE)
    Call<RemoveDeckItemModel> getRemoveDeckItem(@Header("Authorization") String Authorization, @Field("deck_item_id") String deckItemId);


    // shared deck list
    @GET(Api.SHARED_DECK_LIST)
    Call<SharedDeckListModel> getSharedDeckList(@Header("Authorization") String Authorization);

    @FormUrlEncoded
    @POST(Api.DECK_SHARE)
    Call<ShareDeckList> getDeckShare(@Header("Authorization") String Authorization, @Field("deck_id") String deckId, @Field("friend_ids") String friendList);

    // add deck item
    @FormUrlEncoded
    @POST(Api.DECK_ITEM)
    Call<DeckItemModel> getDeckItem(@Header("Authorization") String Authorization, @Field("deck_id") String deckId, @Field("type") String type, @Field("item_id") String itemId);

    // Venue Like
    @FormUrlEncoded
    @POST(Api.VENUE_LIKE)
    Call<VenueLikeUnlike> likeVenue(@Header("Authorization") String auth, @Field("id") String venue_id);

    // Venue Unlike
    @FormUrlEncoded
    @POST(Api.VENUE_UNLIKE)
    Call<VenueLikeUnlike> unlikeVenue(@Header("Authorization") String auth, @Field("id") String venue_id);


    //POLL LIST
    @FormUrlEncoded
    @POST(Api.POLL_LIST)
    Call<PollDetailModel> getPollList(
            @Header("Authorization") String Authorization,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);

    //POLL CREATE
    @FormUrlEncoded
    @POST(Api.CREATE_POLL)
    Call<CreatePollModel> createPoll(
            @Header("Authorization") String Authorization,
            @Field("title") String title,
            @Field("note") String note,
            @Field("address") String address,
            @Field("lat") Double lat,
            @Field("lon") Double lon,
            @Field("dates") String dates,
            @Field("friend_ids") String friend_ids);

    //POLL COVER UPDATE
    @Multipart
    @POST(Api.CREATE_POLL_MEDIA)
    Call<CreatePollModel> createPollMedia(
            @Header("Authorization") String Authorization,
            @Part("id") RequestBody poll_id,
            @Part MultipartBody.Part media);


    //POLL DETAIL
    @FormUrlEncoded
    @POST(Api.POLL_DETAIL)
    Call<PollDetailModel> pollDetail(
            @Header("Authorization") String Authorization,
            @Field("id") String poll_id);

    //POLL SUBMIT
    @FormUrlEncoded
    @POST(Api.POLL_SUBMIT)
    Call<PollSubmitModel> pollSubmit(
            @Header("Authorization") String Authorization,
            @Field("id") String poll_id,
            @Field("option_ids") String option_ids);

    //POLL RESULT
    @FormUrlEncoded
    @POST(Api.POLL_RESULT)
    Call<PollVoteDetailModel> pollResult(
            @Header("Authorization") String Authorization,
            @Field("id") String poll_id);

    //POLL DELETE
    @FormUrlEncoded
    @POST(Api.POLL_DELETE)
    Call<PollSubmitModel> pollDelete(
            @Header("Authorization") String Authorization,
            @Field("id") String poll_id);

    //POLL COMMENT LIST
    @FormUrlEncoded
    @POST(Api.POLL_COMMENT_LIST)
    Call<PollCommentListModel> pollCommentList(
            @Header("Authorization") String Authorization,
            @Field("id") String poll_id,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);

    //POLL POST COMMENT
    @FormUrlEncoded
    @POST(Api.POLL_POST_COMMENT)
    Call<PollPostCommentModel> pollPostComment(
            @Header("Authorization") String Authorization,
            @Field("id") String poll_id,
            @Field("comment") String comment);

    //Get OfferList
    @FormUrlEncoded
    @POST(Api.OFFER_LIST)
    Call<OfferListModel> getOfferList(@Header("Authorization") String Authorization, @Field("eOfferType") String eOfferType, @Field("iStart") int iStart, @Field("iLimit") int iLimit);

    //Get AddOfferList
    @FormUrlEncoded
    @POST(Api.OFFER_ADD_LIST)
    Call<OfferAddpoint> getAddOfferPoint(@Header("Authorization") String Authorization, @Field("nPoint") int nPoint, @Field("offer_id") String offer_id, @Field("eOfferType") String eOfferType);


    //Get OfferHistory
    @FormUrlEncoded
    @POST(Api.OFFER_HISTORY_LIST)
    Call<OfferHistory> getOfferHistory(@Header("Authorization") String Authorization, @Field("iStart") int iStart, @Field("iLimit") int iLimit, @Field("elisttype") int elisttype);

    //Get OfferLeaderBoardlist
    @FormUrlEncoded
    @POST(Api.OFFER_LEADERBOARD_LIST)
    Call<OfferLeaderBoard> getOfferLeaderBoard(@Header("Authorization") String Authorization, @Field("iStart") int iStart, @Field("iLimit") int iLimit, @Field("duration") int duration);

    //Get NewsPrefrenceList
    @GET(Api.NEWS_PREFRENCE_LIST)
    Call<NewsPrefrenceMain> getNewsPrefrence(@Header("Authorization") String Authorization);

    //Add NewsPrefrence
    @FormUrlEncoded
    @POST(Api.SET_NEWS_PREFRENCE)
    Call<DeletePageModel> addNewsPrefrence(@Header("Authorization") String Authorization, @Field("source_ids") String source_ids);

    //UNLIKE ADVT
    @FormUrlEncoded
    @POST(Api.UNLIKE_ADVT)
    Call<UnlikePostModel> unlikeAdvt(@Header("Authorization") String Authorization, @Field("id") String post_id);

    //LIKE ADVT
    @FormUrlEncoded
    @POST(Api.LIKE_ADVT)
    Call<LikePostModel> likeAdvt(@Header("Authorization") String Authorization, @Field("id") String post_id);


    @GET(Api.ADVT_LIST)
    Call<AdListModel> getAdList(@Header("Authorization") String Authorization);

    @FormUrlEncoded
    @POST()
    Call<ModelGetMovies> getMovies(@Header("Authorization") String Authorization,
                                   @Url String url,
                                   @Field("page") String page,
                                   @Field("per_page") String per_page,
                                   @Field("category_id") String category_id
    );


    //ENTERTAINMENT
    //movie details
    @FormUrlEncoded
    @POST()
    Call<ModelGetMovies> getMovieDetails(@Header("Authorization") String Authorization,
                                         @Field("id") String id,
                                         @Url String url
    );

    //get Cast N crew deatils
    @GET(Api.GET_CAST_N_CREW)
    Call<ModelCastNCrew> getCastNCrew(@Path("id") String id);

    //get similar movie deatils
    @GET(Api.GET_SIMILAR_MOVIE)
    Call<ModelGetSimilarMovie> getSimilarMovie(@Path("id") String id);

    //get single movie deatils
    @GET(Api.GET_SINGLE_MOVIE)
    Call<ModelSingleMovieDetail> getSingleMovieDetail(@Path("id") String id);

    //get single person deatils
    @GET(Api.GET_SINGLE_PERSON)
    Call<ModelPersonDetail> getSinglePersonDetail(@Path("id") String id);

    //StoryUsers
    @FormUrlEncoded
    @POST(Api.USER_STORY)
    Call<StoryUsers> getStoryUsers(@Header("Authorization") String Authorization, @Field("sUserid") String sUserid);


    //UsersStories
    @FormUrlEncoded
    @POST(Api.USER_STORIES)
    Call<UserStories> getUsersStories(@Header("Authorization") String Authorization, @Field("sUserid") String sUserid);


    // News Like
    @FormUrlEncoded
    @POST()
    Call<DeletePageModel> likeNews(@Header("Authorization") String auth, @Url String Url, @Field("id") String id);

    // News Unlike
    @FormUrlEncoded
    @POST()
    Call<DeletePageModel> unlikeNews(@Header("Authorization") String auth, @Url String Url, @Field("id") String id);

    //LikeCommentCount
    @FormUrlEncoded
    @POST(Api.LIKE_COMMENT_COUNT)
    Call<LikeCommentCount> likeCommentCount(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("type") String type);

    //NewsComment List
    @FormUrlEncoded
    @POST(Api.NEWS_COMMENTLIST)
    Call<NewsCommentList> newsCommentList(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);


    //News Comment
    @FormUrlEncoded
    @POST(Api.NEWS_COMMENT)
    Call<NewsComment> newsComment(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("comment") String comment);


    //addStories
    @Multipart
    @POST(Api.ADD_STORY)
    Call<AddStoryModel> addStory(
            @Header("Authorization") String Authorization,
            @Part MultipartBody.Part thumbnail,
            @Part MultipartBody.Part media);

    // Shopping Like
    @FormUrlEncoded
    @POST()
    Call<DeletePageModel> likeShopping(@Header("Authorization") String auth, @Url String url, @Field("id") String id, @Field("type") String type);

    // Shopping Unlike
    @FormUrlEncoded
    @POST()
    Call<DeletePageModel> unlikeShopping(@Header("Authorization") String auth, @Url String url, @Field("id") String id, @Field("type") String type);

    //API CALL

    //Shopping Comment

    @FormUrlEncoded
    @POST()
    Call<CustomCommentModel> callShoppingCommentList(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("type") String type,
            @Field("iStart") int iStart,
            @Field("iLimit") int iLimit,
            @Url String url);

    @FormUrlEncoded
    @POST()
    Call<CustomPostCommentModel> callPostShoppingComment(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("type") String type,
            @Field("comment") String comment,
            @Url String url);


//CUSTOM COMMENT

    @FormUrlEncoded
    @POST()
    Call<CustomCommentModel> callCommentList(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("iStart") int iStart,
            @Field("iLimit") int iLimit,
            @Url String url);

    @FormUrlEncoded
    @POST()
    Call<CustomPostCommentModel> callPostComment(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("comment") String comment,
            @Url String url);

    //Search People and pages
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<FriendSearchModel> searchFriend(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);


    //Search News
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<NewsListModel> searchNews(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);


    //Search venue
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<NearbyModel> searchVenue(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);


    //Search Movies
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<ModelGetMovies> searchMovies(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);

    //Search Events
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<EventsModel> searchEvents(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);

    //Search GroupOn
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<GroupOnModelModel> searchGroupOn(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);


    //Search Etsy
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<EtsyModelModel> searchEtsy(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);

    //Search Ebay
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<EbayModelModel> searchEbay(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);

    //Search Amazon
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<AmezoneListModel> searchAmazon(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);


    // Stories Like
    @FormUrlEncoded
    @POST()
    Call<DeletePageModel> likeStories(@Header("Authorization") String auth, @Url String url, @Field("id") String id);

    // Stories Unlike
    @FormUrlEncoded
    @POST()
    Call<DeletePageModel> unlikeStories(@Header("Authorization") String auth, @Url String url, @Field("id") String id);

    @FormUrlEncoded
    @POST()
    Call<LikeUnLikeModel> callUnlike(@Header("Authorization") String Authorization,
                                     @Field("id") String id,
                                     @Url String url
    );

    @FormUrlEncoded
    @POST()
    Call<LikeUnLikeModel> callLike(@Header("Authorization") String Authorization,
                                   @Field("id") String id,
                                   @Url String url
    );


    //netflix search
    @FormUrlEncoded
    @POST(Api.NETFLIX_SEARCH)
    Call<ModelNetflixSearch> netflixSearch(@Header("Authorization") String Authorization,
                                           @Field("search") String search);


    @FormUrlEncoded
    @POST(Api.USER_NOTIFICATION)
    Call<NotificationModel> userNotification(
            @Header("Authorization") String Authorization,
            @Field("iStart") int iStart,
            @Field("iLimit") int iLimit);

    //SEARCH USER
    @FormUrlEncoded
    @POST(Api.USER_SEARCH)
    Call<SearchUserModel> getSearchUser(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("search_type") String search_type,
            @Field("search") String search,
            @Field("iStart") int start,
            @Field("iLimit") int limit);

    //Allow Status
    @FormUrlEncoded
    @POST(Api.ALLOW_STATUS)
    Call<DeletePageModel> getAllowStatus(
            @Header("Authorization") String Authorization,
            @Field("status") boolean status,
            @Field("type") String type);

    //Allow Status
    @FormUrlEncoded
    @POST(Api.REPORT_CONTENT)
    Call<DeletePageModel> reportContent(
            @Header("Authorization") String Authorization,
            @Field("id") String id,
            @Field("type") String type);

    // Movie Trailer
    @GET()
    Call<MovieTrailerModel> getMovieTrailer(@Url String url);

    @FormUrlEncoded
    @POST(Api.FRIEND_LIST)
    Call<FriendListModel> getTagFriendList(
            @Header("Authorization") String Authorization,
            @Field("iStart") int start,
            @Field("iLimit") int limit,
            @Field("user_id") String userId,
            @Field("type") String type
    );

    @GET(Api.STOCK)
    Call<StockModel> getStockDetail(@Header("Authorization") String Authorization);


    // redeem code
    @FormUrlEncoded
    @POST(Api.REDEEM_CODE)
    Call<RedeemCodeModel> getRedeemCode(
            @Header("Authorization") String Authorization,
            @Field("code") String code);

    @FormUrlEncoded
    @POST(Api.REDEEM_INFO)
    Call<RedeemInfoModel> getRedeemInfo(
            @Header("Authorization") String Authorization,
            @Field("sFirstName") String fName,
            @Field("sLastName") String lName,
            @Field("nAge") String age,
            @Field("eGender") String gender,
            @Field("sEmail") String email,
            @Field("sMobile") String mobile,
            @Field("sCity") String city,
            @Field("sState") String state,
            @Field("sCountry") String country,
            @Field("sAbout") String about,
            @Field("nPoint") String point,
            @Field("nEarn") String earn,
            @Field("sPaypalEmail") String paypalId);

    // Coupon list
    @FormUrlEncoded
    @POST(Api.COUPON_LIST)
    Call<CouponListModel> getCouponList(
            @Header("Authorization") String Authorization,
            @Field("iLimit") int limit,
            @Field("iStart") int start);


    // Uber price
    @GET(Api.UBER_API)
    Call<UberModel> uberDetails(@Header("Authorization") String auth, @Query("start_latitude") String start_latitude, @Query("start_longitude") String start_longitude, @Query("end_latitude") String end_latitude, @Query("end_longitude") String end_longitude);


    // BLOCKED USER LIST
    @GET(Api.BLOCKED_USER_LIST)
    Call<BlockUnBlockModel> getBlockedUserList(@Header("Authorization") String Authorization);

    // BLOCK UNBLOCK USER
    @FormUrlEncoded
    @POST(Api.BLOCK_UNBLOCK_USER)
    Call<BlockUnBlockModel> callBlockUnblockUser(
            @Header("Authorization") String Authorization,
            @Field("user_id") String user_id,
            @Field("type") String type);

    //Get OfferList
    @FormUrlEncoded
    @POST(Api.OFFER_LIST)
    Call<InviteModel> getInviteOfferPoint(@Header("Authorization") String Authorization, @Field("eOfferType") String eOfferType, @Field("iStart") int iStart, @Field("iLimit") int iLimit);

    // Invite Email
    @FormUrlEncoded
    @POST(Api.COUPON_INVITE)
    Call<InviteEmailModel> getInviteEmail(@Header("Authorization") String Authorization, @Field("email") String emailAddress);

    //Search Post
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<SocialPostModel> searchPost(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);

    //Search People
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<PeopleSearchModel> searchPeople(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);

    //Search Page
    @FormUrlEncoded
    @POST(Api.COMMON_SEARCH)
    Call<PageSearchModel> searchPage(
            @Header("Authorization") String Authorization,
            @Field("search") String search,
            @Field("search_type") String search_type,
            @Field("iLimit") int iLimit,
            @Field("iStart") int iStart);
}



