//package alarmdemo.apidemo;
//
//import android.annotation.SuppressLint;
//import android.app.Activity;
//import android.content.Context;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.graphics.Bitmap;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.location.Address;
//import android.location.Geocoder;
//import android.location.Location;
//import android.location.LocationManager;
//import android.net.ConnectivityManager;
//import android.net.NetworkInfo;
//import android.os.Build;
//import android.provider.Settings;
//import android.support.design.widget.Snackbar;
//import android.support.v4.app.ActivityOptionsCompat;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.content.ContextCompat;
//import android.support.v4.util.Pair;
//import android.support.v7.app.AlertDialog;
//import android.util.DisplayMetrics;
//import android.util.Log;
//import android.view.View;
//import android.view.WindowManager;
//import android.view.inputmethod.InputMethodManager;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.rey.material.app.DatePickerDialog;
//import com.rey.material.app.DialogFragment;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import java.util.Locale;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import yudiz.divey.R;
//import yudiz.divey.date.CustomDate;
//import yudiz.divey.interfaces.OnDateDialogListener;
//
///**
// * Created by Yudiz on 17/11/16.
// */
//public class Utility {
//
//
//    private static DialogFragment dateDialogFragment;
//    public static long doubleTap = 0;
//
//    public final static int CLICK_INTERVAL = 2000;
//
//    public static String DEVICE_TYPE = "Android";
//
//    public static String registerID;
//
//    public static String SENDER_ID = "418453715110";
//
//    final static String reg = "(?:youtube(?:-nocookie)?\\.com\\/(?:[^\\/\\n\\s]+\\/\\S+\\/|(?:v|e(?:mbed)?)\\/|\\S*?[?&]v=)|youtu\\.be\\/)([a-zA-Z0-9_-]{11})";
//
//    public static void navigationIntent(Context context, Class<?> classname) {
//        Intent intent = new Intent(context, classname);
//        context.startActivity(intent);
//    }
//
//    public static void navigationIntentWithValue(Context context, Intent intent) {
//        context.startActivity(intent);
//    }
//
//    public static void navigationIntentWithFinishAll(Context context, Class<?> classname) {
//        Intent intent = new Intent(context, classname);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
//        context.startActivity(intent);
//    }
//
//
//    public static void navigationIntentWithTransitionEffect(Context context, Class<?> classname, View... view) {
//        Intent intent = new Intent(context, classname);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Pair<View, String> pair[] = new Pair[view.length];
//            for (int i = 0; i < view.length; i++) {
//                pair[i] = new Pair<>(view[i], view[i].getTransitionName());
//            }
//            ActivityOptionsCompat options = ActivityOptionsCompat.
//                    makeSceneTransitionAnimation((Activity) context, pair);
//            context.startActivity(intent, options.toBundle());
//        } else {
//            context.startActivity(intent);
//        }
//    }
//
//    public static Calendar getFormatedDate(String dateString, String dateFormat) {
//        Calendar calendar = Calendar.getInstance(Locale.getDefault());
//        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
//        try {
//            calendar.setTime(sdf.parse(dateString));
//            return calendar;
//
//        } catch (Exception e) {
////            e.printStackTrace();
//            return calendar;
//
//        }
//    }
//
//    @SuppressLint("SimpleDateFormat")
//    public static String getFormatedDate(String dateString,
//                                         String formatSource, String formatDestination) {
//        SimpleDateFormat sdf = new SimpleDateFormat(formatSource);// "yyyy-MM-dd'T'HH:mm:ssz"
//        // sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
//        try {
//            Date date = sdf.parse(dateString);
//            String formated = new SimpleDateFormat(formatDestination)
//                    .format(date);
//            return formated;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "";
//        }
//    }
//
//    public static boolean hasConnection(final Context context) {
//        ConnectivityManager cManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
//        if (cManager == null)
//            return false;
//        else {
//            NetworkInfo[] nis = cManager.getAllNetworkInfo();
//            if (nis != null) {
//                for (NetworkInfo ni : nis) {
//                    if (ni.getState() == NetworkInfo.State.CONNECTED)
//                        return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static String getTodayDate() {
//        Calendar calendar = Calendar.getInstance(Locale.getDefault());
//        SimpleDateFormat sdf = new SimpleDateFormat(CustomDate.DATE_FORMAT);
//        return sdf.format(calendar.getTime());
//    }
//
//    public static void hideKeyboared(Activity activity) {
//        if (activity == null)
//            return;
//
//        InputMethodManager imm = (InputMethodManager) activity.getApplication().getSystemService(Context.INPUT_METHOD_SERVICE);
//        View view = activity.getCurrentFocus();
//        if (view != null)
//            imm.hideSoftInputFromWindow(view.getWindowToken(),
//                    WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
//    }
//
//    public static boolean isValidEmaillId(String email) {
//
//        return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
//                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
//                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
//                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
//                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
//                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(email).matches();
//    }
//
//    public static void log(String msg) {
//        Log.i("Divey App", msg);
//    }
//
//    public static void toast(Context context, String msg) {
//        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
//    }
//
//    public static void showDateDialog(FragmentManager fm, int minDay, int minMonth, int minYear, int maxDay, int maxMonth, int maxYear, final OnDateDialogListener listener, int selectedYear, int selectedMonth, int selectedDay) {
//        if (dateDialogFragment == null || !dateDialogFragment.isVisible()) {
//            DatePickerDialog.Builder builder = new DatePickerDialog.Builder(minDay, minMonth, minYear, maxDay, maxMonth, maxYear, selectedDay, selectedMonth, selectedYear) {
//                @Override
//                public void onPositiveActionClicked(DialogFragment fragment) {
//                    DatePickerDialog dialog = (DatePickerDialog) fragment.getDialog();
//                    listener.onPositiveActionClicked(dialog);
//                    super.onPositiveActionClicked(fragment);
//                }
//
//                @Override
//                public void onNegativeActionClicked(DialogFragment fragment) {
//                    super.onNegativeActionClicked(fragment);
//                }
//            };
//            builder.positiveAction("OK").negativeAction("CANCEL");
//            dateDialogFragment = DialogFragment.newInstance(builder);
//            dateDialogFragment.show(fm, "datePicker");
//        }
//    }
//
//    /**
//     * Checks if is GPS enable.
//     *
//     * @param context the context
//     * @return true, if is GPS enable
//     */
//    public static boolean isGPSEnable(Context context) {
//        @SuppressWarnings("static-access")
//        LocationManager manager = (LocationManager) context
//                .getSystemService(context.LOCATION_SERVICE);
//        if (!manager.isProviderEnabled(LocationManager.GPS_PROVIDER))
//            return false;
//        else
//            return true;
//    }
//
//
//    public static void GpsEnableDialog(final Context context) {
//        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
//                context);
//        alertDialogBuilder.setTitle(context.getString(R.string.app_alert_text));
//        final String action = Settings.ACTION_LOCATION_SOURCE_SETTINGS;
//
//        alertDialogBuilder
//                .setMessage(context.getString(R.string.enable_gps))
//                .setCancelable(false)
//                .setPositiveButton(context.getString(R.string.yes_text),
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                context.startActivity(new Intent(action));
//                                dialog.dismiss();
//                            }
//                        })
//                .setNegativeButton(context.getString(R.string.no_text),
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                dialog.dismiss();
//                            }
//                        });
//
//        AlertDialog alertDialog = alertDialogBuilder.create();
//        alertDialog.show();
//    }
//
//    public static String getCompleteAddressString(Context context, double LATITUDE, double LONGITUDE) {
//        String strAdd = "";
//        try {
//            Geocoder geocoder = new Geocoder(context, Locale.getDefault());
//            try {
//                List<Address> addresses = geocoder.getFromLocation(LATITUDE, LONGITUDE, 1);
//                if (addresses != null) {
//                    Address returnedAddress = addresses.get(0);
//                    StringBuilder strReturnedAddress = new StringBuilder("");
//
//                    for (int i = 0; i < returnedAddress.getMaxAddressLineIndex(); i++) {
//                        strReturnedAddress.append(returnedAddress.getAddressLine(i)).append("\n");
//                    }
//                    strAdd = strReturnedAddress.toString();
//                    Log.w("My Current loction address", "" + strReturnedAddress.toString());
//                } else {
//                    Log.w("My Current loction address", "No Address returned!");
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//                Log.w("My Current loction address", "Canont get Address!");
//            }
//
//        } catch (Exception ae) {
//            ae.printStackTrace();
//        }
//        return strAdd;
//
//    }
//
//
//    /**
//     * Gets the location.
//     *
//     * @param context the context
//     * @return the location
//     */
//    public static Location getLocation(Context context) {
//        boolean gps_enabled = false;
//        boolean network_enabled = false;
//
//        LocationManager lm = (LocationManager) context
//                .getSystemService(Context.LOCATION_SERVICE);
//
//        gps_enabled = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);
//        network_enabled = lm
//                .isProviderEnabled(LocationManager.NETWORK_PROVIDER);
//
//        Location net_loc = null, gps_loc = null, finalLoc = null;
//
//        if (gps_enabled)
//            gps_loc = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
//        if (network_enabled)
//            net_loc = lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
//
//        if (gps_loc != null) {
//            finalLoc = gps_loc;
//        } else if (net_loc != null) {
//            finalLoc = net_loc;
//        }
//
//        return finalLoc;
//    }
//
//    public static Bitmap createDrawableFromView(Context context, View view) {
//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        view.setLayoutParams(new WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT));
//        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
//        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
//        view.buildDrawingCache();
//        Bitmap bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
//
//        Canvas canvas = new Canvas(bitmap);
//        view.draw(canvas);
//
//        return bitmap;
//    }
//
//    public static void customSnackbarToast(View view, String msg) {
//        Snackbar snackbar = Snackbar
//                .make(view, msg, Snackbar.LENGTH_LONG);
//        View sbView = snackbar.getView();
//        sbView.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.drawer_item));
//        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
//        textView.setTextColor(Color.WHITE);
//        snackbar.show();
//    }
//
//    public static void customErrorSnackbarToast(View view, String msg) {
//        Snackbar snackbar = Snackbar
//                .make(view, msg, Snackbar.LENGTH_LONG);
//        View sbView = snackbar.getView();
//        sbView.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.red_btn));
//        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
//        textView.setTextColor(Color.WHITE);
//        snackbar.show();
//    }
//
//    public static void AppExitDialog(final Activity activity) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
//        builder.setMessage("Are you sure you want to exit?")
//                .setCancelable(false)
//                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        activity.finish();
//                    }
//                })
//                .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        dialog.cancel();
//                    }
//                });
//        AlertDialog alert = builder.create();
//        alert.show();
//    }
//
//    public static long getMillisFromDate(String dateString, String formatSource) {
//        SimpleDateFormat sdf = new SimpleDateFormat(formatSource);
////        sdf.setTimeZone(TimeZone.getD);
//        try {
//            Date date = sdf.parse(dateString);
//            return date.getTime();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return 0;
//        }
//    }
//
//    public static String getVideoId(String videoUrl) {
//        if (videoUrl == null || videoUrl.trim().length() <= 0)
//            return null;
//
//        Pattern pattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(videoUrl);
//
//        if (matcher.find())
//            return matcher.group(1);
//        return null;
//    }
//}
