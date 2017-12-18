package alarmdemo.apidemo.Retrofit;

import android.util.Log;

import java.io.File;
import java.util.ArrayList;

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
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Created by yudizsolutionspvtltd on 26/08/17.
 */

public class ApiTask {
    private static ApiTask apiTask;
    private final ApiCall apiCall;

    private ApiTask() {
        Retrofit retrofit = RetrofitApp.getRetrofit();
        if (retrofit == null)
            Log.e("Tag", "Retrofit not initialized, please call RetrofitApp.initRetrofit() in your application's onCreate()");
        assert retrofit != null;
        apiCall = retrofit.create(ApiCall.class);
    }

    public static ApiTask getInstance() {
        if (apiTask == null)
            apiTask = new ApiTask();
        return apiTask;
    }

    // sign up
    public Call<SingUpModel> callSignUp(String fname, String lName, String email, String pwd, retrofit2.Callback<SingUpModel> callbackSignUp) {
        Call<SingUpModel> call = apiCall.getSignUp(fname, lName, email, pwd);
        call.enqueue(callbackSignUp);
        return call;
    }

    // login
    public Call<LoginModel> callLogin(String email, String pwd, retrofit2.Callback<LoginModel> callback) {
        Call<LoginModel> call = apiCall.getLogin(email, pwd);
        call.enqueue(callback);
        return call;
    }

    // forgot password
    public Call<ForgotPwdModel> callForgotPassword(String email, retrofit2.Callback<ForgotPwdModel> callback) {
        Call<ForgotPwdModel> call = apiCall.getForgotPassword(email);
        call.enqueue(callback);
        return call;
    }

    // change password
    public Call<ChangePasswordModel> callChangePassword(String authorization, String cPass, String nPass, String rPass, retrofit2.Callback<ChangePasswordModel> callback) {
        Call<ChangePasswordModel> call = apiCall.getChangePassword(authorization, cPass, nPass, rPass);
        call.enqueue(callback);
        return call;
    }

    // Add Device
    public Call<AddDeviceModel> callAddDevice(String Authorization, String Token, String Type, String UserID, retrofit2.Callback<AddDeviceModel> callback) {
        Call<AddDeviceModel> call = apiCall.getAddDevice(Authorization, Token, Type, UserID);
        call.enqueue(callback);
        return call;
    }

    // Social Sign Up
    public Call<SocialSignUpModel> signUpModelCall(String fname, String lName, String email, String password, String socialType, String socialId, retrofit2.Callback<SocialSignUpModel> callback) {
        Call<SocialSignUpModel> call = apiCall.getSocialSignUp(fname, lName, email, password, socialType, socialId);
        call.enqueue(callback);
        return call;
    }

    // login social
    public Call<LoginModel> callLoginSocial(String socialType, String socialId, retrofit2.Callback<LoginModel> callback) {
        Call<LoginModel> call = apiCall.getSocialLogin(socialType, socialId);
        call.enqueue(callback);
        return call;
    }

    // update location

    public Call<UpdateLocationModel> callUpdateLocation(String authorization, Double lat, Double log, String address, retrofit2.Callback<UpdateLocationModel> callback) {
        Call<UpdateLocationModel> call = apiCall.getUpdateLocation(authorization, lat, log, address);
        call.enqueue(callback);
        return call;
    }

    // logout

    public Call<LogoutModel> callLogoutModel(String authorization, retrofit2.Callback<LogoutModel> callback) {
        Call<LogoutModel> call = apiCall.getLogout(authorization);
        call.enqueue(callback);
        return call;
    }

    // user search

    public Call<SearchSocialModel> callUserSearch(String authorization, String searchKey, int limit, int start, retrofit2.Callback<SearchSocialModel> callback) {
        Call<SearchSocialModel> call = apiCall.getUserSearch(authorization, searchKey, limit, start);
        call.enqueue(callback);
        return call;
    }


    // send friend request
    public Call<SendFriendReqModel> callSendFriendRequest(String authorization, String senderId, String receiverId, retrofit2.Callback<SendFriendReqModel> callback) {
        Call<SendFriendReqModel> call = apiCall.sendFriendRequest(authorization, senderId, receiverId);
        call.enqueue(callback);
        return call;
    }

    // pending friend request
    public Call<PendingFriendModel> callPendingFriend(String authorization, int start, int limit, retrofit2.Callback<PendingFriendModel> callback) {
        Call<PendingFriendModel> call = apiCall.getPendingFriendRequest(authorization, start, limit);
        call.enqueue(callback);
        return call;
    }

    // accept reject friend request
    public Call<AcceptRejectFriendRequestModel> callAcceptRejectFriendRequest(String authorization, String userId, String status, retrofit2.Callback<AcceptRejectFriendRequestModel> callback) {
        Call<AcceptRejectFriendRequestModel> call = apiCall.getAcceptRejectFriendRequest(authorization, userId, status);
        call.enqueue(callback);
        return call;
    }

    // friend list
    public Call<FriendListModel> callFriendList(String authorization, int start, int limit, String userId, retrofit2.Callback<FriendListModel> callback) {
        Call<FriendListModel> call = apiCall.getFriendList(authorization, start, limit, userId);
        call.enqueue(callback);
        return call;
    }

    // unfriend
    public Call<UnfriendModel> callUnfriend(String authorization, String id, retrofit2.Callback<UnfriendModel> callback) {
        Call<UnfriendModel> call = apiCall.getUnfriend(authorization, id);
        call.enqueue(callback);
        return call;
    }

    // user profile
    public Call<UserProfileModel> callUserProfile(String authorization, String id, retrofit2.Callback<UserProfileModel> callback) {
        Call<UserProfileModel> call = apiCall.getUserProfile(authorization, id);
        call.enqueue(callback);
        return call;
    }

    // edit profile
    public Call<EditProfileModel> callEditProfile(String authorization, String sFirstName, String sLastName, String dDob, String eGender, File sProfilePicture
            , File sCoverPhoto, String sAbout, String sWebpageUrl, String sNickName, String sDesignation, String sMobile, retrofit2.Callback<EditProfileModel> callback) {
        Call<EditProfileModel> call = apiCall.getEditProfile(authorization, getPart(sFirstName), getPart(sLastName), getPart(dDob), getPart(eGender), getImage("sProfilePicture", sProfilePicture), getImage("sCoverPhoto", sCoverPhoto),
                getPart(sAbout), getPart(sWebpageUrl), getPart(sNickName), getPart(sDesignation), getPart(sMobile));
        call.enqueue(callback);
        return call;
    }

    private RequestBody getPart(String value) {
        RequestBody requestFile = RequestBody.create(MediaType.parse("application/json"), value);
        return requestFile;
    }

    private MultipartBody.Part getImage(String fieldName, File file) {
        if (file != null) {
            RequestBody requestFile = RequestBody.create(MediaType.parse("image/jpeg"), file);
            MultipartBody.Part body = MultipartBody.Part.createFormData(fieldName, file.getName(), requestFile);
            return body;
        } else
            return null;
    }

    private MultipartBody.Part getVideo(String fieldName, File file) {
        if (file != null) {
            RequestBody requestFile = RequestBody.create(MediaType.parse("video/mp4"), file);
            MultipartBody.Part body = MultipartBody.Part.createFormData(fieldName, file.getName(), requestFile);
            return body;
        } else
            return null;
    }

    // cancel friend request

    public Call<CancelFriendReqModel> callCancelFriendRequest(String authorization, String userId, retrofit2.Callback<CancelFriendReqModel> callback) {
        Call<CancelFriendReqModel> call = apiCall.getCancelFriendRequest(authorization, userId);
        call.enqueue(callback);
        return call;
    }

    // followers
    public Call<FollowersModel> callFollowerList(String authorization, int start, int limit, String userId, retrofit2.Callback<FollowersModel> callback) {
        Call<FollowersModel> call = apiCall.getFollowersList(authorization, start, limit, userId);
        call.enqueue(callback);
        return call;
    }


    // following
    public Call<FollowingModel> callFollowingList(String authorization, int start, int limit, String userId, retrofit2.Callback<FollowingModel> callback) {
        Call<FollowingModel> call = apiCall.getFollowingList(authorization, start, limit, userId);
        call.enqueue(callback);
        return call;
    }

    //unfollow
    public Call<UnFollowModel> callunfollow(String authorization, String followId, retrofit2.Callback<UnFollowModel> callback) {
        Call<UnFollowModel> call = apiCall.getUnfollow(authorization, followId);
        call.enqueue(callback);
        return call;
    }

    //POST COMMENTS
    public Call<PostComment> postComment(String authorization, String post_id, String comment, retrofit2.Callback<PostComment> callback) {
        Call<PostComment> call = apiCall.postComment(authorization, post_id, comment);
        call.enqueue(callback);
        return call;
    }

    //POST DETAILS
    public Call<PostDetailModel> postDetail(String authorization, String post_id, retrofit2.Callback<PostDetailModel> callback) {
        Call<PostDetailModel> call = apiCall.postDetail(authorization, post_id);
        call.enqueue(callback);
        return call;
    }

    //TOP POST DETAILS
    public Call<TopPostModel> topPostDetail(String authorization, retrofit2.Callback<TopPostModel> callback) {
        Call<TopPostModel> call = apiCall.topPostDetail(authorization);
        call.enqueue(callback);
        return call;
    }

    //SOCIAL POST
    public Call<SocialPostModel> socialPostList(String authorization, int iStart, int iLimit, retrofit2.Callback<SocialPostModel> callback) {
        Call<SocialPostModel> call = apiCall.socialPostDetail(authorization, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    //Comment List
    public Call<Comments> getCommentList(String authorization, String postId, retrofit2.Callback<Comments> callback) {
        Call<Comments> call = apiCall.postCommentsList(authorization, postId);
        call.enqueue(callback);
        return call;
    }

    // create page
    public Call<CreatePageModel> callCreatePage(String authorization, String pageName, String aboutPage, String websiteUrl, File pageProfile, File pageCover, retrofit2.Callback<CreatePageModel> callback) {
        Call<CreatePageModel> call = apiCall.getCreatePage(authorization, getPart(pageName), getPart(aboutPage), getPart(websiteUrl), getImage("sPageProfile", pageProfile), getImage("sCoverPhoto", pageCover));
        call.enqueue(callback);
        return call;
    }

    //add media with video
    public Call<AddPostMediaModel> callAddPostMediaWithVideo(String authorization, String postId, File media, File thumbnail, retrofit2.Callback<AddPostMediaModel> callback) {
        Call<AddPostMediaModel> call = apiCall.addPostMediaWithVideo(authorization, getPart(postId), getVideo("media", media), getImage("thumbnail", thumbnail));
        call.enqueue(callback);
        return call;
    }

    //add media without video
    public Call<AddPostMediaModel> callAddPostMediaWithoutVideo(String authorization, String postId, File media, retrofit2.Callback<AddPostMediaModel> callback) {
        Call<AddPostMediaModel> call = apiCall.addPostMediaWithOutVideo(authorization, getPart(postId), getImage("media", media));
        call.enqueue(callback);
        return call;
    }

    // page list
    public Call<PageListModel> callPageList(String authorization, int start, int limit, String userId, retrofit2.Callback<PageListModel> callback) {
        Call<PageListModel> call = apiCall.getPageList(authorization, start, limit, userId);
        call.enqueue(callback);
        return call;
    }

    // check following status
    public Call<CheckFollowerOrNotModel> callFollowStatus(String authorization, String userId, retrofit2.Callback<CheckFollowerOrNotModel> callback) {
        Call<CheckFollowerOrNotModel> call = apiCall.getFollowerStatus(authorization, userId);
        call.enqueue(callback);
        return call;
    }

    // send follow request
    public Call<SendFollowReqModel> callSendFollowRequest(String authorization, String userId, retrofit2.Callback<SendFollowReqModel> callback) {
        Call<SendFollowReqModel> call = apiCall.getFollowRequest(authorization, userId);
        call.enqueue(callback);
        return call;
    }

    public Call<CreatePostModel> callCreatePost(String authorization, String description, String postType, String userId, String accessType, String tags, String emoji_type, String emoji_id, String activity_description, String address, Double lat, Double lon, retrofit2.Callback<CreatePostModel> callback) {
        Call<CreatePostModel> call = apiCall.createPost(authorization, description, postType, userId, accessType, tags, emoji_type, emoji_id, activity_description, address, lat, lon);
        call.enqueue(callback);
        return call;
    }

    public Call<CreatePostModel> callCreatePagePost(String authorization, String description, String postType, String pageId, String accessType, String tags, String emoji_type, String emoji_id, String activity_description, String address, Double lat, Double lon, retrofit2.Callback<CreatePostModel> callback) {
        Call<CreatePostModel> call = apiCall.createPagePost(authorization, description, postType, pageId, accessType, tags, emoji_type, emoji_id, activity_description, address, lat, lon);
        call.enqueue(callback);
        return call;
    }

    // FEELING ACTIVITY
    public Call<FeelingActivityModel> callFeelingActivity(String authorization, String type, retrofit2.Callback<FeelingActivityModel> callback) {
        Call<FeelingActivityModel> call = apiCall.callFeelingActivity(authorization, type);
        call.enqueue(callback);
        return call;
    }

    // post list
    public Call<PostListModel> callPostList(String authorization, String sPageIdorsUserId, String ePostType, int iLimit, int iStart, retrofit2.Callback<PostListModel> callback) {
        Call<PostListModel> call = apiCall.getPostList(authorization, sPageIdorsUserId, ePostType, iLimit, iStart);
        call.enqueue(callback);
        return call;
    }

    public Call<CheckInModel> callCheckIn(String url, retrofit2.Callback<CheckInModel> callback) {
        Call<CheckInModel> call = apiCall.getCheckIn(url);
        call.enqueue(callback);
        return call;
    }


    //call post list
    public Call<LikePostModel> callLikePost(String authorization, String postId, retrofit2.Callback<LikePostModel> callback) {
        Call<LikePostModel> call = apiCall.likePost(authorization, postId);
        call.enqueue(callback);
        return call;
    }

    //UNLIKE POST
    public Call<UnlikePostModel> callUnlikePost(String authorization, String postId, retrofit2.Callback<UnlikePostModel> callback) {
        Call<UnlikePostModel> call = apiCall.unlikePost(authorization, postId);
        call.enqueue(callback);
        return call;
    }

    //REMOVE POST
    public Call<RemovePostModel> callRemovePost(String authorization, String postId, retrofit2.Callback<RemovePostModel> callback) {
        Call<RemovePostModel> call = apiCall.removePost(authorization, postId);
        call.enqueue(callback);
        return call;
    }

    public Call<MediaListModel> callPostMediaList(String authorization, String sPageIdorsUserId, int iLimit, int iStart, retrofit2.Callback<MediaListModel> callback) {
        Call<MediaListModel> call = apiCall.getMediaList(authorization, sPageIdorsUserId, iLimit, iStart);
        call.enqueue(callback);
        return call;
    }

    // like page
    public Call<PageLikeModel> callPageLike(String authorization, String pageId, retrofit2.Callback<PageLikeModel> callback) {
        Call<PageLikeModel> call = apiCall.getPageLike(authorization, pageId);
        call.enqueue(callback);
        return call;
    }

    // Unlike page
    public Call<UnlikePageModel> callPageUnlike(String authorization, String pageId, retrofit2.Callback<UnlikePageModel> callback) {
        Call<UnlikePageModel> call = apiCall.getPageUnlike(authorization, pageId);
        call.enqueue(callback);
        return call;
    }

    // Remove page
    public Call<DeletePageModel> callRemovePage(String authorization, String pageId, retrofit2.Callback<DeletePageModel> callback) {
        Call<DeletePageModel> call = apiCall.getRemovePage(authorization, pageId);
        call.enqueue(callback);
        return call;
    }

    // page details
    public Call<PageDetailModel> callPageDetail(String authorization, String pageId, retrofit2.Callback<PageDetailModel> callback) {
        Call<PageDetailModel> call = apiCall.getPageDetails(authorization, pageId);
        call.enqueue(callback);
        return call;
    }

    // edit page
    public Call<EditPageModel> callEditpage(String authorization, String pageId, String pageName, String aboutPage, String websiteUrl, File pageProfile, File pageCover, retrofit2.Callback<EditPageModel> callback) {
        Call<EditPageModel> call = apiCall.getEditPage(authorization, getPart(pageId), getPart(pageName), getPart(aboutPage), getPart(websiteUrl), getImage("sPageProfile", pageProfile), getImage("sCoverPhoto", pageCover));
        call.enqueue(callback);
        return call;
    }

    // EventList
    public Call<Events> callEventLost(String authorization, int start, int limit, retrofit2.Callback<Events> callback) {
        Call<Events> call = apiCall.getEventList(authorization, start, limit);
        call.enqueue(callback);
        return call;
    }

    //EVENT DETAIL
    public Call<EventDetailModel> callEventDetail(String authorization, String start, retrofit2.Callback<EventDetailModel> callback) {
        Call<EventDetailModel> call = apiCall.getEventDetail(authorization, start);
        call.enqueue(callback);
        return call;
    }

    //EVENT LIKE
    public Call<LikeUnLikeModel> callEventLike(String authorization, String start, retrofit2.Callback<LikeUnLikeModel> callback) {
        Call<LikeUnLikeModel> call = apiCall.eventLike(authorization, start);
        call.enqueue(callback);
        return call;
    }

    //EVENT UNLIKE
    public Call<LikeUnLikeModel> callEventUnlike(String authorization, String start, retrofit2.Callback<LikeUnLikeModel> callback) {
        Call<LikeUnLikeModel> call = apiCall.eventUnlike(authorization, start);
        call.enqueue(callback);
        return call;
    }

    //EVENT COMMENT LIST
    public Call<CommentListEventModel> callEventCommentList(String authorization, String id, int iStart, int iLimit, retrofit2.Callback<CommentListEventModel> callback) {
        Call<CommentListEventModel> call = apiCall.eventCommentList(authorization, id, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    //EVENT POST COMMENT
    public Call<PostCommentEventModel> callEventCommentPost(String authorization, String id, String comment, retrofit2.Callback<PostCommentEventModel> callback) {
        Call<PostCommentEventModel> call = apiCall.eventPostComment(authorization, id, comment);
        call.enqueue(callback);
        return call;
    }

    //Category List
    public Call<CategoryModel> callGetCategory(String authorization, retrofit2.Callback<CategoryModel> callback) {
        Call<CategoryModel> call = apiCall.getCategoriesList(authorization);
        call.enqueue(callback);
        return call;
    }

    //Child Category List
    public Call<ChildCategoryModel> callGetChildCategory(String authorization, String parent_id, retrofit2.Callback<ChildCategoryModel> callback) {
        Call<ChildCategoryModel> call = apiCall.getChildCategoriesList(authorization, parent_id);
        call.enqueue(callback);
        return call;
    }


    //News list
    public Call<NewsListModel> callGetNewsList(String authorization, String category_id, int iStart, int iLimit, retrofit2.Callback<NewsListModel> callback) {
        Call<NewsListModel> call = apiCall.getNewsList(authorization, category_id, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    //SHOPPING LIST_GROUP_ON
    public Call<GroupOnModelModel> callGetShoppingListGroupOn(String authorization, String category_id, Double lat, Double lon, int iStart, int iLimit, retrofit2.Callback<GroupOnModelModel> callback) {
        Call<GroupOnModelModel> call = apiCall.getGroupOnShoppingList(authorization, category_id, lat, lon, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    //SHOPPING LIST_ETSY
    public Call<EtsyModelModel> callGetShoppingListEtsy(String authorization, String category_id, Double lat, Double lon, int iStart, int iLimit, retrofit2.Callback<EtsyModelModel> callback) {
        Call<EtsyModelModel> call = apiCall.getEtsyShoppingList(authorization, category_id, lat, lon, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    //SHOPPING LIST_EBAY
    public Call<EbayModelModel> callGetShoppingListEbay(String authorization, String category_id, Double lat, Double lon, int iStart, int iLimit, retrofit2.Callback<EbayModelModel> callback) {
        Call<EbayModelModel> call = apiCall.getEbayShoppingList(authorization, category_id, lat, lon, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    //SHOPPING LIST_AMEZONE
    public Call<AmezoneListModel> callGetShoppingListAmezone(String authorization, String category_id, Double lat, Double lon, int iStart, int iLimit, retrofit2.Callback<AmezoneListModel> callback) {
        Call<AmezoneListModel> call = apiCall.getAmezoneShoppingList(authorization, category_id, lat, lon, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    //Nearby list
    public Call<NearbyModel> callGetNearbyList(String authorization, String category_id, int iStart, int iLimit, int range, double lat, double lon, retrofit2.Callback<NearbyModel> callback) {
        Call<NearbyModel> call = apiCall.getNearbyList(authorization, category_id, iStart, iLimit, range, lat, lon);
        call.enqueue(callback);
        return call;
    }

    //EVENT LIST
    public Call<EventsModel> callGetEventsList(String authorization,
                                               String category_id,
                                               int page,
                                               int per_page,
                                               String range,
                                               double lat,
                                               double lon, retrofit2.Callback<EventsModel> callback) {
        Call<EventsModel> call = apiCall.getEventList(authorization, category_id, page, per_page, range, lat, lon);
        call.enqueue(callback);
        return call;
    }

    // Weather detail
    public Call<WeatherDetailsModel> callWeatherDetails(String url, Double lat, Double lng, String appId, retrofit2.Callback<WeatherDetailsModel> callback) {
        Call<WeatherDetailsModel> call = apiCall.getWeatherDetail(url, lat, lng, appId);
        call.enqueue(callback);
        return call;
    }

    // Venue like
    public Call<VenueLikeUnlike> callVenueLike(String auth, String venue_id, retrofit2.Callback<VenueLikeUnlike> callback) {
        Call<VenueLikeUnlike> call = apiCall.likeVenue(auth, venue_id);
        call.enqueue(callback);
        return call;
    }

    // create Deck
    public Call<CreateDeckModel> callCreateDeck(String authorization, String title, retrofit2.Callback<CreateDeckModel> callback) {
        Call<CreateDeckModel> call = apiCall.getCreateDeck(authorization, title);
        call.enqueue(callback);
        return call;
    }

    // Deck List
    public Call<DeckListModel> callDeckList(String authorization, String userId, retrofit2.Callback<DeckListModel> callback) {
        Call<DeckListModel> call = apiCall.getDeckList(authorization, userId);
        call.enqueue(callback);
        return call;
    }

    // Deck Item List
    public Call<DeckItemListModel> callDeckItemList(String authorization, String deckId, int iStart, int iLimit, retrofit2.Callback<DeckItemListModel> callback) {
        Call<DeckItemListModel> call = apiCall.getDeckItemList(authorization, deckId, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    // Remove Deck
    public Call<RemoveDeck> callRemoveDeck(String authorization, String deckId, retrofit2.Callback<RemoveDeck> callback) {
        Call<RemoveDeck> call = apiCall.getRemoveDeck(authorization, deckId);
        call.enqueue(callback);
        return call;
    }

    // Edit Deck
    public Call<EditDeckModel> callEditDeck(String authorization, String deckId, String title, retrofit2.Callback<EditDeckModel> callback) {
        Call<EditDeckModel> call = apiCall.getEditDeck(authorization, deckId, title);
        call.enqueue(callback);
        return call;
    }

    // remove Deck Item
    public Call<RemoveDeckItemModel> callRemoveDeckItem(String authorization, String deckItemId, retrofit2.Callback<RemoveDeckItemModel> callback) {
        Call<RemoveDeckItemModel> call = apiCall.getRemoveDeckItem(authorization, deckItemId);
        call.enqueue(callback);
        return call;
    }

    // shared deck list
    public Call<SharedDeckListModel> callSharedDeckList(String authorization, retrofit2.Callback<SharedDeckListModel> callback) {
        Call<SharedDeckListModel> call = apiCall.getSharedDeckList(authorization);
        call.enqueue(callback);
        return call;
    }

    // share deck
    public Call<ShareDeckList> callShareDeck(String authorization, String deckId, ArrayList<String> ids, retrofit2.Callback<ShareDeckList> callback) {
        Call<ShareDeckList> call = apiCall.getDeckShare(authorization, deckId, getFriendsIds(ids));
        call.enqueue(callback);
        return call;
    }

    // add deck item
    public Call<DeckItemModel> callDeckItem(String authorization, String deckId, String type, String itemId, retrofit2.Callback<DeckItemModel> callback) {
        Call<DeckItemModel> call = apiCall.getDeckItem(authorization, deckId, type, itemId);
        call.enqueue(callback);
        return call;

    }

    // Venue unlike
    public Call<VenueLikeUnlike> callVenueUnlike(String auth, String venue_id, Callback<VenueLikeUnlike> callback) {
        Call<VenueLikeUnlike> call = apiCall.unlikeVenue(auth, venue_id);
        call.enqueue(callback);
        return call;
    }


    //POLL LIST
    public Call<PollDetailModel> callPollList(String authorization, int iLimit, int iStart, retrofit2.Callback<PollDetailModel> callback) {
        Call<PollDetailModel> call = apiCall.getPollList(authorization, iLimit, iStart);
        call.enqueue(callback);
        return call;
    }

    //CREATE POLL
    public Call<CreatePollModel> callCreatePoll(String authorization, String title, String note, String address, Double lat, Double lon, String dates, String friend_ids, retrofit2.Callback<CreatePollModel> callback) {
        Call<CreatePollModel> call = apiCall.createPoll(authorization, title, note, address, lat, lon, dates, friend_ids);
        call.enqueue(callback);
        return call;
    }

    //CREATE POLL WITH MEDIA
    public Call<CreatePollModel> callCreatePollMedia(String authorization, String pollid, File media, retrofit2.Callback<CreatePollModel> callback) {
        Call<CreatePollModel> call = apiCall.createPollMedia(authorization, getPart(pollid), getImage("cover_image", media));
        call.enqueue(callback);
        return call;
    }

    //POLL DETAIL
    public Call<PollDetailModel> callPollDetail(String authorization, String poll_id, retrofit2.Callback<PollDetailModel> callback) {
        Call<PollDetailModel> call = apiCall.pollDetail(authorization, poll_id);
        call.enqueue(callback);
        return call;
    }

    //POLL SUBMIT
    public Call<PollSubmitModel> callPollSubmit(String authorization, String poll_id, String option_ids, retrofit2.Callback<PollSubmitModel> callback) {
        Call<PollSubmitModel> call = apiCall.pollSubmit(authorization, poll_id, option_ids);
        call.enqueue(callback);
        return call;
    }

    //POLL RESULT
    public Call<PollVoteDetailModel> callPollResult(String authorization, String poll_id, retrofit2.Callback<PollVoteDetailModel> callback) {
        Call<PollVoteDetailModel> call = apiCall.pollResult(authorization, poll_id);
        call.enqueue(callback);
        return call;
    }

    //POLL DELETE
    public Call<PollSubmitModel> callPollDelete(String authorization, String poll_id, retrofit2.Callback<PollSubmitModel> callback) {
        Call<PollSubmitModel> call = apiCall.pollDelete(authorization, poll_id);
        call.enqueue(callback);
        return call;
    }

    //POLL POST COMMENT
    public Call<PollPostCommentModel> callPollPostComment(String authorization, String poll_id, String comment, retrofit2.Callback<PollPostCommentModel> callback) {
        Call<PollPostCommentModel> call = apiCall.pollPostComment(authorization, poll_id, comment);
        call.enqueue(callback);
        return call;
    }

    //POLL COMMENT LIST
    public Call<PollCommentListModel> callPollCommentList(String authorization, String poll_id, int limit, int start, retrofit2.Callback<PollCommentListModel> callback) {
        Call<PollCommentListModel> call = apiCall.pollCommentList(authorization, poll_id, limit, start);
        call.enqueue(callback);
        return call;
    }

    // Venue Comment list
    public Call<VenueCommentsList> callVenueCommentsList(String auth, String venue_id, int limit, int start, Callback<VenueCommentsList> callback) {
        Call<VenueCommentsList> call = apiCall.getVenueCommentList(auth, venue_id, limit, start);
        call.enqueue(callback);
        return call;
    }

    // Venue Post comment
    public Call<VenuePostComment> callVenuePostComment(String auth, String venue_id, String comment, Callback<VenuePostComment> callback) {
        Call<VenuePostComment> call = apiCall.getVenuePostComment(auth, venue_id, comment);
        call.enqueue(callback);
        return call;
    }

    //OfferList
    public Call<OfferListModel> callGetOfferList(String authorization, int iStart, int iLimit, String eOfferType, retrofit2.Callback<OfferListModel> callback) {
        Call<OfferListModel> call = apiCall.getOfferList(authorization, eOfferType, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    //Add OfferPoint
    public Call<OfferAddpoint> callAddOfferPoint(String authorization, int nPoint, String offer_id, String eOfferType, retrofit2.Callback<OfferAddpoint> callback) {
        Call<OfferAddpoint> call = apiCall.getAddOfferPoint(authorization, nPoint, offer_id, eOfferType);
        call.enqueue(callback);
        return call;
    }

    //Get OfferHistory
    public Call<OfferHistory> callGetOfferHistory(String authorization, int iStart, int iLimit, int elisttype, retrofit2.Callback<OfferHistory> callback) {
        Call<OfferHistory> call = apiCall.getOfferHistory(authorization, iStart, iLimit, elisttype);
        call.enqueue(callback);
        return call;
    }

    //Get OfferLeaderBoard
    public Call<OfferLeaderBoard> callGetOfferLeaderBoard(String authorization, int iStart, int iLimit, int duration, retrofit2.Callback<OfferLeaderBoard> callback) {
        Call<OfferLeaderBoard> call = apiCall.getOfferLeaderBoard(authorization, iStart, iLimit, duration);
        call.enqueue(callback);

        return call;
    }

    //GetNewsPrefrence
    public Call<NewsPrefrenceMain> callGetNewsPrefrence(String authorization, retrofit2.Callback<NewsPrefrenceMain> callback) {
        Call<NewsPrefrenceMain> call = apiCall.getNewsPrefrence(authorization);
        call.enqueue(callback);
        return call;
    }

    //AddNewsPrefrence
    public Call<DeletePageModel> addNewsPrefrence(String authorization, ArrayList<String> ids, retrofit2.Callback<DeletePageModel> callback) {
//        Gson gson = new GsonBuilder().create();
//        JsonArray myCustomArray = gson.toJsonTree(ids).getAsJsonArray();
//
        Call<DeletePageModel> call = apiCall.addNewsPrefrence(authorization, getFriendsIds(ids));
        call.enqueue(callback);
        return call;
    }

    //Like Advt
    public Call<LikePostModel> callLikeAdvt(String authorization, String postId, retrofit2.Callback<LikePostModel> callback) {
        Call<LikePostModel> call = apiCall.likeAdvt(authorization, postId);
        call.enqueue(callback);
        return call;
    }

    //Unlike Advt
    public Call<UnlikePostModel> callUnlikeAdvt(String authorization, String postId, retrofit2.Callback<UnlikePostModel> callback) {
        Call<UnlikePostModel> call = apiCall.unlikeAdvt(authorization, postId);
        call.enqueue(callback);
        return call;
    }

    //AD LIST
    public Call<AdListModel> callAdList(String auth, retrofit2.Callback<AdListModel> callback) {
        Call<AdListModel> call = apiCall.getAdList(auth);
        call.enqueue(callback);
        return call;
    }

    private String getFriendsIds(ArrayList<String> frndIds) {
        String ids = "[";
        for (int i = 0; i < frndIds.size(); i++) {
            if (i == frndIds.size() - 1)
                ids += "\"" + frndIds.get(i) + "\"";
            else
                ids += "\"" + frndIds.get(i) + "\",";
        }
        ids += "]";
        Log.i("TAG", "getFriendsIds: " + ids);
        return ids;
    }

    //ENTERTAINMENT
    //getMovies
    public Call<ModelGetMovies> getMovies(String authorization, String url, int page, int per_page, String category_id, retrofit2.Callback<ModelGetMovies> callback) {
        Call<ModelGetMovies> call = apiCall.getMovies(authorization, url, String.valueOf(page), String.valueOf(per_page), category_id);
        call.enqueue(callback);
        return call;
    }

    //get Movie details
    public Call<ModelGetMovies> getMovieDetails(String authorization, String id, String url, retrofit2.Callback<ModelGetMovies> callback) {
        Call<ModelGetMovies> call = apiCall.getMovieDetails(authorization, id, url);
        call.enqueue(callback);
        return call;
    }

    //cast & crew
    public Call<ModelCastNCrew> getCastNCrew(String id, retrofit2.Callback<ModelCastNCrew> callback) {
        Call<ModelCastNCrew> call = apiCall.getCastNCrew(id);
        call.enqueue(callback);
        return call;
    }

    //get similar movie
    public Call<ModelGetSimilarMovie> getSimilarMovie(String id, retrofit2.Callback<ModelGetSimilarMovie> callback) {
        Call<ModelGetSimilarMovie> call = apiCall.getSimilarMovie(id);
        call.enqueue(callback);
        return call;
    }

    //get single movie details
    public Call<ModelSingleMovieDetail> getSingleMovieDetail(String id, retrofit2.Callback<ModelSingleMovieDetail> callback) {
        Call<ModelSingleMovieDetail> call = apiCall.getSingleMovieDetail(id);
        call.enqueue(callback);
        return call;
    }

    //get single person details
    public Call<ModelPersonDetail> getSinglePersonDetail(String id, retrofit2.Callback<ModelPersonDetail> callback) {
        Call<ModelPersonDetail> call = apiCall.getSinglePersonDetail(id);
        call.enqueue(callback);
        return call;
    }

    //addStory
    public Call<AddStoryModel> callAddStory(String authorization, File thumb, File video, retrofit2.Callback<AddStoryModel> callback) {
        Call<AddStoryModel> call = apiCall.addStory(authorization, getImage("thumbnail", thumb), getVideo("media", video));
        call.enqueue(callback);
        return call;
    }

    //storyUser
    public Call<StoryUsers> callGetStoryUsers(String authorization, String userid, retrofit2.Callback<StoryUsers> callback) {
        Call<StoryUsers> call = apiCall.getStoryUsers(authorization, userid);
        call.enqueue(callback);
        return call;
    }

    //UserStories
    public Call<UserStories> callGetUsersStories(String authorization, String userid, retrofit2.Callback<UserStories> callback) {
        Call<UserStories> call = apiCall.getUsersStories(authorization, userid);
        call.enqueue(callback);
        return call;
    }

    //Like News
    public Call<DeletePageModel> likeNews(String authorization, String url, String postId, retrofit2.Callback<DeletePageModel> callback) {
        Call<DeletePageModel> call = apiCall.likeNews(authorization, url, postId);
        call.enqueue(callback);
        return call;
    }

    //Unlike News
    public Call<DeletePageModel> unlikeNews(String authorization, String url, String postId, retrofit2.Callback<DeletePageModel> callback) {
        Call<DeletePageModel> call = apiCall.unlikeNews(authorization, url, postId);
        call.enqueue(callback);
        return call;
    }

    public Call<LikeCommentCount> callLikeCommentCount(String authorization, String id, String type, retrofit2.Callback<LikeCommentCount> callback) {
        Call<LikeCommentCount> call = apiCall.likeCommentCount(authorization, id, type);
        call.enqueue(callback);
        return call;
    }

    public Call<NewsCommentList> callNewsCommentList(String authorization, String id, int limit, int start, retrofit2.Callback<NewsCommentList> callback) {
        Call<NewsCommentList> call = apiCall.newsCommentList(authorization, id, limit, start);
        call.enqueue(callback);
        return call;
    }

    public Call<NewsComment> callNewsComment(String authorization, String id, String comment, retrofit2.Callback<NewsComment> callback) {
        Call<NewsComment> call = apiCall.newsComment(authorization, id, comment);
        call.enqueue(callback);
        return call;
    }

    public Call<FriendSearchModel> callSearchFriend(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<FriendSearchModel> callback) {
        Call<FriendSearchModel> call = apiCall.searchFriend(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    //Like Shopping
    public Call<DeletePageModel> likeShopping(String authorization, String url, String postId, String type, retrofit2.Callback<DeletePageModel> callback) {
        Call<DeletePageModel> call = apiCall.likeShopping(authorization, url, postId, type);
        call.enqueue(callback);
        return call;
    }

    //Unlike Shopping
    public Call<DeletePageModel> unlikeShopping(String authorization, String url, String postId, String type, retrofit2.Callback<DeletePageModel> callback) {
        Call<DeletePageModel> call = apiCall.unlikeShopping(authorization, url, postId, type);
        call.enqueue(callback);
        return call;
    }

    public Call<CustomCommentModel> callCustomCommentList(String authorization, String id, int iStart, int iLimit, String url, retrofit2.Callback<CustomCommentModel> callback) {
        Call<CustomCommentModel> call = apiCall.callCommentList(authorization, id, iStart, iLimit, url);
        call.enqueue(callback);
        return call;
    }

    public Call<CustomPostCommentModel> callCustomCommentPost(String authorization, String id, String comment, String url, retrofit2.Callback<CustomPostCommentModel> callback) {
        Call<CustomPostCommentModel> call = apiCall.callPostComment(authorization, id, comment, url);
        call.enqueue(callback);
        return call;
    }

    public Call<CustomCommentModel> callShoppingCommentList(String authorization, String id, String type, int iStart, int iLimit, String url, retrofit2.Callback<CustomCommentModel> callback) {
        Call<CustomCommentModel> call = apiCall.callShoppingCommentList(authorization, id, type, iStart, iLimit, url);
        call.enqueue(callback);
        return call;
    }

    public Call<CustomPostCommentModel> callShoppingCommentPost(String authorization, String id, String type, String comment, String url, retrofit2.Callback<CustomPostCommentModel> callback) {
        Call<CustomPostCommentModel> call = apiCall.callPostShoppingComment(authorization, id, type, comment, url);
        call.enqueue(callback);
        return call;
    }

    public Call<NewsListModel> callSearchNews(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<NewsListModel> callback) {
        Call<NewsListModel> call = apiCall.searchNews(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    public Call<NearbyModel> callSearchVenue(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<NearbyModel> callback) {
        Call<NearbyModel> call = apiCall.searchVenue(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    public Call<ModelGetMovies> callSearchMovies(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<ModelGetMovies> callback) {
        Call<ModelGetMovies> call = apiCall.searchMovies(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    public Call<EventsModel> callSearchEvents(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<EventsModel> callback) {
        Call<EventsModel> call = apiCall.searchEvents(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    public Call<GroupOnModelModel> callSearchGroupOn(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<GroupOnModelModel> callback) {
        Call<GroupOnModelModel> call = apiCall.searchGroupOn(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    public Call<EtsyModelModel> callSearchEtsy(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<EtsyModelModel> callback) {
        Call<EtsyModelModel> call = apiCall.searchEtsy(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    public Call<EbayModelModel> callSearchEbay(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<EbayModelModel> callback) {
        Call<EbayModelModel> call = apiCall.searchEbay(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    public Call<AmezoneListModel> callSearchEAmazon(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<AmezoneListModel> callback) {
        Call<AmezoneListModel> call = apiCall.searchAmazon(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }


    //Like Stories
    public Call<DeletePageModel> likeStories(String authorization, String url, String postId, retrofit2.Callback<DeletePageModel> callback) {
        Call<DeletePageModel> call = apiCall.likeStories(authorization, url, postId);
        call.enqueue(callback);
        return call;
    }

    //Unlike Stories
    public Call<DeletePageModel> unlikeStories(String authorization, String url, String postId, retrofit2.Callback<DeletePageModel> callback) {
        Call<DeletePageModel> call = apiCall.unlikeStories(authorization, url, postId);
        call.enqueue(callback);
        return call;
    }

    public Call<LikeUnLikeModel> callEntertainmentLike(String authorization, String id, String url, retrofit2.Callback<LikeUnLikeModel> callback) {
        Call<LikeUnLikeModel> call = apiCall.callLike(authorization, id, url);
        call.enqueue(callback);
        return call;
    }

    public Call<LikeUnLikeModel> callEntertainmentUnlike(String authorization, String id, String url, retrofit2.Callback<LikeUnLikeModel> callback) {
        Call<LikeUnLikeModel> call = apiCall.callUnlike(authorization, id, url);
        call.enqueue(callback);
        return call;
    }

    //netflix Search
    public Call<ModelNetflixSearch> netflixSearch(String authorization, String search, retrofit2.Callback<ModelNetflixSearch> callback) {
        Call<ModelNetflixSearch> call = apiCall.netflixSearch(authorization, search);
        call.enqueue(callback);
        return call;
    }

    public Call<NotificationModel> callUserNotification(String authorization, int iStart, int iLimit, retrofit2.Callback<NotificationModel> callback) {
        Call<NotificationModel> call = apiCall.userNotification(authorization, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    //BLOCKED USER LIST
    public Call<BlockUnBlockModel> callBlockedUserList(String authorization, retrofit2.Callback<BlockUnBlockModel> callback) {
        Call<BlockUnBlockModel> call = apiCall.getBlockedUserList(authorization);
        call.enqueue(callback);
        return call;
    }

    //BLOCK UNBLOCK USER
    public Call<BlockUnBlockModel> callBlockUnblockUser(String authorization, String userId, String type, retrofit2.Callback<BlockUnBlockModel> callback) {
        Call<BlockUnBlockModel> call = apiCall.callBlockUnblockUser(authorization, userId, type);
        call.enqueue(callback);
        return call;
    }

    // SEARCH USER
    public Call<SearchUserModel> callSearchUser(String authorization, String userId, String search_type_, String search, int start, int limit, retrofit2.Callback<SearchUserModel> callback) {
        Call<SearchUserModel> call = apiCall.getSearchUser(authorization, userId, search_type_, search, start, limit);
        call.enqueue(callback);
        return call;
    }


    //Report Content
    // SEARCH USER
    public Call<DeletePageModel> callReportContent(String authorization, String id, String type, retrofit2.Callback<DeletePageModel> callback) {
        Call<DeletePageModel> call = apiCall.reportContent(authorization, id, type);
        call.enqueue(callback);
        return call;
    }

    // Allow Status
    public Call<DeletePageModel> callAllowStatus(String authorization, boolean status, String type, retrofit2.Callback<DeletePageModel> callback) {
        Call<DeletePageModel> call = apiCall.getAllowStatus(authorization, status, type);
        call.enqueue(callback);
        return call;
    }

    // Redeem Code
    public Call<RedeemCodeModel> callRedeemCode(String authorization, String code, retrofit2.Callback<RedeemCodeModel> callback) {
        Call<RedeemCodeModel> call = apiCall.getRedeemCode(authorization, code);
        call.enqueue(callback);
        return call;
    }

    // Redeem info
    public Call<RedeemInfoModel> callRedeemInfo(String authorization, String fName, String lName, String age, String gender, String email
            , String mobile, String city, String state, String county, String about, String point, String earn, String paypalID, retrofit2.Callback<RedeemInfoModel> callback) {
        Call<RedeemInfoModel> call = apiCall.getRedeemInfo(authorization, fName, lName, age, gender, email, mobile, city
                , state, county, about, point, earn, paypalID);
        call.enqueue(callback);
        return call;
    }

    // coupon list
    public Call<CouponListModel> callCouponList(String authorization, int limit, int start, retrofit2.Callback<CouponListModel> callback) {
        Call<CouponListModel> call = apiCall.getCouponList(authorization, limit, start);
        call.enqueue(callback);
        return call;
    }

    // stock

    public Call<StockModel> callStock(String authirization, retrofit2.Callback<StockModel> callback) {
        Call<StockModel> call = apiCall.getStockDetail(authirization);
        call.enqueue(callback);
        return call;
    }

    // Movie Trailer
    public Call<MovieTrailerModel> callMovieTrailer(String url, retrofit2.Callback<MovieTrailerModel> callback) {
        Call<MovieTrailerModel> call = apiCall.getMovieTrailer(url);
        call.enqueue(callback);
        return call;
    }


    //TAG FRIENDS LIST
    public Call<FriendListModel> callTagFriendList(String authorization, int start, int limit, String userId, String type, retrofit2.Callback<FriendListModel> callback) {
        Call<FriendListModel> call = apiCall.getTagFriendList(authorization, start, limit, userId, type);
        call.enqueue(callback);
        return call;
    }

    // search Post
    public Call<SocialPostModel> callSearchPost(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<SocialPostModel> callback) {
        Call<SocialPostModel> call = apiCall.searchPost(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    // search People
    public Call<PeopleSearchModel> callSearchPeople(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<PeopleSearchModel> callback) {
        Call<PeopleSearchModel> call = apiCall.searchPeople(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    // search Page
    public Call<PageSearchModel> callSearchPage(String authorization, String search, String searchType, int limit, int start, retrofit2.Callback<PageSearchModel> callback) {
        Call<PageSearchModel> call = apiCall.searchPage(authorization, search, searchType, limit, start);
        call.enqueue(callback);
        return call;
    }

    // invite Offers
    public Call<InviteModel> callInviteOfferPoint(String authorization, int iStart, int iLimit, String eOfferType, retrofit2.Callback<InviteModel> callback) {
        Call<InviteModel> call = apiCall.getInviteOfferPoint(authorization, eOfferType, iStart, iLimit);
        call.enqueue(callback);
        return call;
    }

    // invite Email
    public Call<InviteEmailModel> callInviteEmails(String authorization, ArrayList<String> emails, retrofit2.Callback<InviteEmailModel> callback) {
        Call<InviteEmailModel> call = apiCall.getInviteEmail(authorization, getFriendsIds(emails));
        call.enqueue(callback);
        return call;
    }

}