package alarmdemo.apidemo.Retrofit;

import android.util.Log;
import android.widget.Toast;

import alarmdemo.apidemo.DemoApp;
import retrofit2.Call;
import retrofit2.Response;

public class Callback<T> implements retrofit2.Callback<T> {
    public static final int RESPONSE_CODE_CREATE = 201;
    public static final int RESPONSE_CODE_INTERNAL_SERVER_ERROR = 500;
    public static final int RESPONSE_CODE_OK = 200;
    private static final int RESPONSE_CODE_UNAUTHORISED = 401;
    public static final int RESPONSE_CODE_UNKNOWN = -1;
    private retrofit2.Callback<T> myCallback;
    private Toast toast;

    public Callback() {
    }


    public Callback(retrofit2.Callback<T> myCallback) {
        this.myCallback = myCallback;

    }

    public void onResponse(Call<T> call, Response<T> response) {

        if (DemoApp.getContext() != null) {
            if (response == null) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
//                    myCallback.onFailure(call, new Exception(DemoApp.getContext().getString(R.string.unknown_error)));
                    myCallback.onFailure(call, new Exception("Unknown Error"));
                }
            } else if (response.code() == RESPONSE_CODE_UNAUTHORISED) {
                Log.d("TAG", "onResponse: Session Expired!");
//                if (toast == null && !GlobalClass.isShowToast) {
//                    toast = Toast.makeText(DemoApp.getContext(), DemoApp.getContext().getString(R.string.session_timeout_message), Toast.LENGTH_LONG);
//                    toast.show();
////                    MyPreference.getInstance(DemoApp.getContext()).resetPreference();
////                    DemoApp.getContext().startActivity(new Intent(DemoApp.getContext(), SignInActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
//
//                }
            } else if (response.isSuccessful()) {
                myCallback.onResponse(call, response);
            } else {
                myCallback.onFailure(call, new Exception(ErrorUtils.parseError(response).message()));
            }
        } else {
            myCallback.onFailure(call, new Exception("Something went wrong"));
        }
    }

    public void onFailure(Call<T> call, Throwable t) {
        myCallback.onFailure(call, t);
    }

//    private class QBLogout extends AsyncTask {
//
//        @Override
//        protected Object doInBackground(Object[] objects) {
//            try {
//                QBChatService.getInstance().logout();
//                QBChatService.getInstance().destroy();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return null;
//        }
//
//    }
}
