package alarmdemo.apidemo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

import java.util.Set;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MyPreference {
	SharedPreferences myPrefs;
	SharedPreferences.Editor prefEditor;
	Context context;

	@SuppressWarnings("static-access")
	public MyPreference(Context context) {
		this.context = context;
		myPrefs = context.getSharedPreferences("user_detail", context.MODE_PRIVATE);
	}

	public void clearPrefs() {
		prefEditor = myPrefs.edit();
		prefEditor.clear();
		prefEditor.commit();
	}

	/*
	 * store and get String value
	 */
	public void setStringPrefrence(String name, String value) {
		prefEditor = myPrefs.edit();
		prefEditor.putString(name, value);
//		Utility.log("PREF  "+name+"   "+value);
		prefEditor.commit();
	}

	public String getStringPrefrence(String name) {

		return myPrefs.getString(name, "");
	}

	/*
	 * store and get Boolean value
	 */

	public void setBooleanPrefrence(String name, boolean value) {
		prefEditor = myPrefs.edit();
		prefEditor.putBoolean(name, value);
		prefEditor.commit();
	}

	public boolean getBooleanPrefrence(String name) {
		return myPrefs.getBoolean(name, false);
	}

	/*
	 * store and get Int value
	 */
	public void setIntPrefrence(String name, int value)

	{
		prefEditor = myPrefs.edit();
		prefEditor.putInt(name, value);
		prefEditor.commit();
	}

	public int getIntPrefrence(String name) {
		return myPrefs.getInt(name, 0);
	}

	/*
	 * store and get float value
	 */

	public void setFloatprefrence(String name, float value) {
		prefEditor = myPrefs.edit();
		prefEditor.putFloat(name, value);
		prefEditor.commit();
	}

	public float getFloatPrefrence(String name) {
		return myPrefs.getFloat(name, 0);
	}

	// /*
	// * store and get Double value
	// */
	//
	// public void setDoubleprefrence(String name, Double value) {
	// prefEditor = myPrefs.edit();
	// prefEditor.putd (name, value);
	// prefEditor.commit();
	// }
	//
	// public float getDoublePrefrence(String name) {
	// return myPrefs.getFloat(name, 0);
	// }

	/*
	 * store and get Long value
	 */
	public void setLongPrefrence(String name, long value)

	{
		prefEditor = myPrefs.edit();
		prefEditor.putLong(name, value);
		prefEditor.commit();
	}

	public long getLongPrefrence(String name) {
		return myPrefs.getLong(name, 0);
	}

	@SuppressLint("NewApi")
	public void setList(String name, Set<String> recentSet) {
		prefEditor = myPrefs.edit();
		prefEditor.putStringSet(name, recentSet);
		prefEditor.commit();
	}

	public Set<String> getList(String name) {
		return myPrefs.getStringSet(name, null);

	}

}
