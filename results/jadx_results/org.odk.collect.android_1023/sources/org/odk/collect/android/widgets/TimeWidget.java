package org.odk.collect.android.widgets;

import android.content.Context;
import android.provider.Settings;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TimePicker;
import java.util.Date;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.TimeData;
import org.javarosa.form.api.FormEntryPrompt;
import org.joda.time.DateTime;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class TimeWidget extends QuestionWidget {
    private TimePicker mTimePicker = new TimePicker(getContext());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        boolean z = false;
        this.mTimePicker.setId(QuestionWidget.newUniqueId());
        this.mTimePicker.setFocusable(!prompt.isReadOnly());
        this.mTimePicker.setEnabled(!prompt.isReadOnly() ? true : z);
        String clockType = Settings.System.getString(context.getContentResolver(), "time_12_24");
        if (clockType == null || clockType.equalsIgnoreCase("24")) {
            this.mTimePicker.setIs24HourView(true);
        }
        if (prompt.getAnswerValue() != null) {
            DateTime ldt = new DateTime(((Date) ((TimeData) prompt.getAnswerValue()).getValue()).getTime());
            System.out.println("retrieving:" + ldt);
            this.mTimePicker.setCurrentHour(Integer.valueOf(ldt.getHourOfDay()));
            this.mTimePicker.setCurrentMinute(Integer.valueOf(ldt.getMinuteOfHour()));
        } else {
            clearAnswer();
        }
        this.mTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { // from class: org.odk.collect.android.widgets.TimeWidget.1
            @Override // android.widget.TimePicker.OnTimeChangedListener
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Collect.getInstance().getActivityLogger().logInstanceAction(TimeWidget.this, "onTimeChanged", String.format("%1$02d:%2$02d", Integer.valueOf(hourOfDay), Integer.valueOf(minute)), TimeWidget.this.mPrompt.getIndex());
            }
        });
        setGravity(3);
        addView(this.mTimePicker);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        DateTime ldt = new DateTime();
        this.mTimePicker.setCurrentHour(Integer.valueOf(ldt.getHourOfDay()));
        this.mTimePicker.setCurrentMinute(Integer.valueOf(ldt.getMinuteOfHour()));
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        clearFocus();
        DateTime ldt = new DateTime().withTime(this.mTimePicker.getCurrentHour().intValue(), this.mTimePicker.getCurrentMinute().intValue(), 0, 0);
        System.out.println("storing:" + ldt);
        return new TimeData(ldt.toDate());
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.mTimePicker.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mTimePicker.cancelLongPress();
    }
}
