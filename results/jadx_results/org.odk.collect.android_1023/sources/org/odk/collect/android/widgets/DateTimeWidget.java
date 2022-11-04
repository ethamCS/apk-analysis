package org.odk.collect.android.widgets;

import android.content.Context;
import android.provider.Settings;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.TimePicker;
import java.util.Calendar;
import java.util.Date;
import org.javarosa.core.model.data.DateTimeData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.form.api.FormEntryPrompt;
import org.joda.time.DateTime;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class DateTimeWidget extends QuestionWidget {
    private DatePicker.OnDateChangedListener mDateListener;
    private DatePicker mDatePicker = new DatePicker(getContext());
    private TimePicker mTimePicker;

    public DateTimeWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        this.mDatePicker.setId(QuestionWidget.newUniqueId());
        this.mDatePicker.setFocusable(!prompt.isReadOnly());
        this.mDatePicker.setEnabled(!prompt.isReadOnly());
        this.mTimePicker = new TimePicker(getContext());
        this.mTimePicker.setId(QuestionWidget.newUniqueId());
        this.mTimePicker.setFocusable(!prompt.isReadOnly());
        this.mTimePicker.setEnabled(!prompt.isReadOnly());
        this.mTimePicker.setPadding(0, 20, 0, 0);
        String clockType = Settings.System.getString(context.getContentResolver(), "time_12_24");
        if (clockType == null || clockType.equalsIgnoreCase("24")) {
            this.mTimePicker.setIs24HourView(true);
        }
        setAnswer();
        this.mDateListener = new DatePicker.OnDateChangedListener() { // from class: org.odk.collect.android.widgets.DateTimeWidget.1
            @Override // android.widget.DatePicker.OnDateChangedListener
            public void onDateChanged(DatePicker view, int year, int month, int day) {
                if (DateTimeWidget.this.mPrompt.isReadOnly()) {
                    DateTimeWidget.this.setAnswer();
                    return;
                }
                Calendar c = Calendar.getInstance();
                c.set(year, month, 1);
                int max = c.getActualMaximum(5);
                if (day > max) {
                    if (DateTimeWidget.this.mDatePicker.getDayOfMonth() != day || DateTimeWidget.this.mDatePicker.getMonth() != month || DateTimeWidget.this.mDatePicker.getYear() != year) {
                        Collect.getInstance().getActivityLogger().logInstanceAction(DateTimeWidget.this, "onDateChanged", String.format("%1$04d-%2$02d-%3$02d", Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(max)), DateTimeWidget.this.mPrompt.getIndex());
                        DateTimeWidget.this.mDatePicker.updateDate(year, month, max);
                    }
                } else if (DateTimeWidget.this.mDatePicker.getDayOfMonth() != day || DateTimeWidget.this.mDatePicker.getMonth() != month || DateTimeWidget.this.mDatePicker.getYear() != year) {
                    Collect.getInstance().getActivityLogger().logInstanceAction(DateTimeWidget.this, "onDateChanged", String.format("%1$04d-%2$02d-%3$02d", Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day)), DateTimeWidget.this.mPrompt.getIndex());
                    DateTimeWidget.this.mDatePicker.updateDate(year, month, day);
                }
            }
        };
        this.mTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { // from class: org.odk.collect.android.widgets.DateTimeWidget.2
            @Override // android.widget.TimePicker.OnTimeChangedListener
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Collect.getInstance().getActivityLogger().logInstanceAction(DateTimeWidget.this, "onTimeChanged", String.format("%1$02d:%2$02d", Integer.valueOf(hourOfDay), Integer.valueOf(minute)), DateTimeWidget.this.mPrompt.getIndex());
            }
        });
        setGravity(3);
        addView(this.mDatePicker);
        addView(this.mTimePicker);
    }

    public void setAnswer() {
        if (this.mPrompt.getAnswerValue() != null) {
            DateTime ldt = new DateTime(((Date) ((DateTimeData) this.mPrompt.getAnswerValue()).getValue()).getTime());
            this.mDatePicker.init(ldt.getYear(), ldt.getMonthOfYear() - 1, ldt.getDayOfMonth(), this.mDateListener);
            this.mTimePicker.setCurrentHour(Integer.valueOf(ldt.getHourOfDay()));
            this.mTimePicker.setCurrentMinute(Integer.valueOf(ldt.getMinuteOfHour()));
            return;
        }
        clearAnswer();
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        DateTime ldt = new DateTime();
        this.mDatePicker.init(ldt.getYear(), ldt.getMonthOfYear() - 1, ldt.getDayOfMonth(), this.mDateListener);
        this.mTimePicker.setCurrentHour(Integer.valueOf(ldt.getHourOfDay()));
        this.mTimePicker.setCurrentMinute(Integer.valueOf(ldt.getMinuteOfHour()));
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        clearFocus();
        DateTime ldt = new DateTime(this.mDatePicker.getYear(), this.mDatePicker.getMonth() + 1, this.mDatePicker.getDayOfMonth(), this.mTimePicker.getCurrentHour().intValue(), this.mTimePicker.getCurrentMinute().intValue(), 0);
        return new DateTimeData(ldt.toDate());
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.mDatePicker.setOnLongClickListener(l);
        this.mTimePicker.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mDatePicker.cancelLongPress();
        this.mTimePicker.cancelLongPress();
    }
}
