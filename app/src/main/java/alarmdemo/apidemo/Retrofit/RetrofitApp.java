package alarmdemo.apidemo.Retrofit;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient.Builder;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApp {
    private static Context context;
    private static Retrofit retrofit;

    public static Context getContext() {
        return context;
    }

    public static Retrofit initRetrofit(Context applicationContext) {
        context = applicationContext;
        if (retrofit == null) {
            Builder httpClient = new Builder();
            httpClient.readTimeout(10, TimeUnit.MINUTES);
            httpClient.connectTimeout(10, TimeUnit.MINUTES);
            httpClient.writeTimeout(10, TimeUnit.MINUTES);
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(Level.BODY);
            httpClient.addInterceptor(interceptor);
            httpClient.retryOnConnectionFailure(true);
            retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL).client(httpClient.build()).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

    public static void resetRetrofitInstance() {
        retrofit = null;
    }

    public static Retrofit getRetrofit() {
        return retrofit;
    }


}
