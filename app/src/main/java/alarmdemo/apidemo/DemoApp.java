package alarmdemo.apidemo;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import alarmdemo.apidemo.Retrofit.RetrofitApp;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by yudizmacmini on 18/12/17.
 */

public class DemoApp extends MultiDexApplication {

    //    public static ImageLoader il;
//    public static DisplayImageOptions options;
    private static Context context;
    public static Realm realm;
//    public static String MIXPANEL_TOKEN;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
        RetrofitApp.initRetrofit(DemoApp.this);
        MultiDex.install(DemoApp.this);
        Realm.init(DemoApp.this);
        RealmConfiguration configuration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        realm = Realm.getInstance(configuration);

//        new setupApp().execute();


    }

//    private void quickbloxSetup() {
//        String APP_ID = "57128";
//        String AUTH_KEY = "Yp5MtH9UM8dt6mp";
//        String AUTH_SECRET = "un8mmgknXXYERA3";
//        String ACCOUNT_KEY = "SwiRixhJPUme14RB2fSL";
//
//
//    }

//    private void initUniversalLoader() {
//        il = ImageLoader.getInstance();
//        il.init(ImageLoaderConfiguration.createDefault(getApplicationContext()));
//        options = new DisplayImageOptions.Builder().showImageForEmptyUri(R.drawable.ic_default_placeholder).showStubImage(R.drawable.ic_default_placeholder).cacheInMemory(true).build();
//    }

    public static Context getContext() {
        return context;
    }

    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    private class setupApp extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {



//            initUniversalLoader();

//            quickbloxSetup();

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);



//            initUniversalLoader();

//            quickbloxSetup();
        }
    }


}
