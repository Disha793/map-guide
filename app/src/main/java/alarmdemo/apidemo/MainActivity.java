package alarmdemo.apidemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import alarmdemo.apidemo.Model.LoginModel.LoginModel;
import alarmdemo.apidemo.Retrofit.ApiTask;
import alarmdemo.apidemo.Retrofit.ErrorUtils;
import alarmdemo.apidemo.databinding.ActivityMainBinding;
import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private ApiTask apiTask;
    private Realm realm;
    private AlarmDb alarmDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //for dialog
        //mBinding = DataBindingUtil.inflate(inflater, R.layout.dialog_entries, container, false);
        mBinding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        apiTask = ApiTask.getInstance();
        realm = DemoApp.realm;
        mBinding.actMainRvMain.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                addRealmdata();
            }
        }, 500);
        mBinding.actMainBtnApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apiTask.callLogin("rich.rubins@gmail.com", "00000000", callbackLogin);

            }
        });
    }

    private void addRealmdata() {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                alarmDb = realm.createObject(AlarmDb.class);
                long id = System.currentTimeMillis();
//                String dt = tvDate.getText().toString();
//                String tm = tvTime.getText().toString();
//
//                Calendar c = Calendar.getInstance();
//                c.set(Calendar.MONTH, month);
//                c.set(Calendar.YEAR, year);
//                c.set(Calendar.DAY_OF_MONTH, day);
//                c.set(Calendar.HOUR_OF_DAY, hours);
//                c.set(Calendar.MINUTE, minute);
//                c.set(Calendar.MILLISECOND, 0);
//                c.set(Calendar.SECOND, 0);
////                if (AM_PM.contains("AM"))
////                    c.set(Calendar.AM_PM, Calendar.AM);
////                else
////                    c.set(Calendar.AM_PM, Calendar.PM);
//
//                long timeInMillis = c.getTimeInMillis();

                alarmDb.setReminderId(id);
                alarmDb.setReminderTitle("title1");
//                alarmDb.setReminderDate(dt);
//                alarmDb.setReminderTime(tm);
//                alarmDb.setMiliSecond(timeInMillis);


//                Log.d("TAG", "------ NEW ALARM ---------");
//                Log.d("TAG", "ID           -> " + id);
//                Log.d("TAG", "Title        -> " + title);
//                Log.d("TAG", "Date         -> " + dt);
//                Log.d("TAG", "Time         -> " + tm);
//                Log.d("TAG", "TimeInMillis -> " + timeInMillis);
//                Log.d("TAG", "----------------------------");

//                onScheduleAlarms(id, timeInMillis, title, "");


            }

        });setRv();
    }

    private void setRv() {
        RecyclerAdapter mAdapter = new RecyclerAdapter(MainActivity.this);
        mBinding.actMainRvMain.setAdapter(mAdapter);

        if (mAdapter.getItemCount() == 0) {
            mBinding.actMainRvMain.setVisibility(View.GONE);
        } else {
            mBinding.actMainRvMain.setVisibility(View.VISIBLE);

        }
    }

    private Callback<LoginModel> callbackLogin = new Callback<LoginModel>() {
        @Override
        public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {

            if (response.isSuccessful()) {
                Log.e("TAG", "Login Success");
            } else {
                try {
                    String error = ErrorUtils.parseError(response).message();
//                    GlobalClass.showSnackBar(SignInActivity.this, etEmail, error, Snackbar.LENGTH_LONG);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

        @Override
        public void onFailure(Call<LoginModel> call, Throwable t) {

//            llProgressBar.setVisibility(View.GONE);
//            Log.d(TAG, "onFailure: " + t.getLocalizedMessage());
//            GlobalClass.showSnackBar(SignInActivity.this, etEmail, t.getMessage(), Snackbar.LENGTH_LONG);
        }
    };

    //For Multipart
//    private void updateProfile() {
//        llPb.setVisibility(View.VISIBLE);
//        ApiTask apiTask = ApiTask.getInstance();
//
//        String auth = MyPreference.getInstance(getActivity()).getString("Authorization");
//        String fName = editFName.getText().toString().trim();
//        String lName = editLName.getText().toString().trim();
//        String dob = tvBirthDate.getText().toString().trim();
//
//        String website = editwebsite.getText().toString().trim();
//        String designation = editDesignation.getText().toString().trim();
//        String desc = editDesc.getText().toString().trim();
//        String phone = editPhone.getText().toString().trim();
//        String nickName = editNickName.getText().toString().trim();
//        String gen = tvGender.getText().toString().trim();
//
//        apiTask.callEditProfile(auth, fName, lName, dob, gen, profileImageFile, coverImageFile, desc, website, nickName, designation, phone, callback);
//    }
}
