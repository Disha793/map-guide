package alarmdemo.apidemo;

import io.realm.RealmObject;

/**
 * Created by yudizsolutionspvtltd on 22/11/17.
 */

public class AlarmDb extends RealmObject {

    private long reminderId;
    private String reminderTitle;
    private String reminderTime;
    private String reminderDate;
    private long miliSecond;


    public long getReminderId() {
        return reminderId;
    }

    public void setReminderId(long reminderId) {
        this.reminderId = reminderId;
    }

    public String getReminderTitle() {
        return reminderTitle;
    }

    public void setReminderTitle(String reminderTitle) {
        this.reminderTitle = reminderTitle;
    }


    public String getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(String reminderTime) {
        this.reminderTime = reminderTime;
    }

    public String getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(String reminderDate) {
        this.reminderDate = reminderDate;
    }

    public long getMiliSecond() {
        return miliSecond;
    }

    public void setMiliSecond(long miliSecond) {
        this.miliSecond = miliSecond;
    }
}
