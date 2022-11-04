package org.odk.collect.android.widgets;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;
import org.javarosa.core.model.data.DateData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.form.api.FormEntryPrompt;
import org.joda.time.DateTime;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class DateWidget extends QuestionWidget {
    private DatePicker.OnDateChangedListener mDateListener;
    private boolean hideDay = false;
    private boolean hideMonth = false;
    private DatePicker mDatePicker = new DatePicker(getContext());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        boolean z = true;
        this.mDatePicker.setId(QuestionWidget.newUniqueId());
        this.mDatePicker.setFocusable(!prompt.isReadOnly());
        this.mDatePicker.setEnabled(prompt.isReadOnly() ? false : z);
        hideDayFieldIfNotInFormat(prompt);
        setAnswer();
        this.mDateListener = new DatePicker.OnDateChangedListener() { // from class: org.odk.collect.android.widgets.DateWidget.1
            @Override // android.widget.DatePicker.OnDateChangedListener
            public void onDateChanged(DatePicker view, int year, int month, int day) {
                if (DateWidget.this.mPrompt.isReadOnly()) {
                    DateWidget.this.setAnswer();
                    return;
                }
                Calendar c = Calendar.getInstance();
                c.set(year, month, 1);
                int max = c.getActualMaximum(5);
                if (day > max) {
                    if (DateWidget.this.mDatePicker.getDayOfMonth() != day || DateWidget.this.mDatePicker.getMonth() != month || DateWidget.this.mDatePicker.getYear() != year) {
                        Collect.getInstance().getActivityLogger().logInstanceAction(DateWidget.this, "onDateChanged", String.format("%1$04d-%2$02d-%3$02d", Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(max)), DateWidget.this.mPrompt.getIndex());
                        DateWidget.this.mDatePicker.updateDate(year, month, max);
                    }
                } else if (DateWidget.this.mDatePicker.getDayOfMonth() != day || DateWidget.this.mDatePicker.getMonth() != month || DateWidget.this.mDatePicker.getYear() != year) {
                    Collect.getInstance().getActivityLogger().logInstanceAction(DateWidget.this, "onDateChanged", String.format("%1$04d-%2$02d-%3$02d", Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day)), DateWidget.this.mPrompt.getIndex());
                    DateWidget.this.mDatePicker.updateDate(year, month, day);
                }
            }
        };
        setGravity(3);
        addView(this.mDatePicker);
    }

    private void hideDayFieldIfNotInFormat(FormEntryPrompt prompt) {
        String appearance = prompt.getQuestion().getAppearanceAttr();
        if (appearance != null) {
            if ("month-year".equals(appearance)) {
                this.hideDay = true;
            } else if ("year".equals(appearance)) {
                this.hideMonth = true;
            }
            if (this.hideMonth || this.hideDay) {
                Field[] arr$ = this.mDatePicker.getClass().getDeclaredFields();
                for (Field datePickerDialogField : arr$) {
                    if ("mDayPicker".equals(datePickerDialogField.getName()) || "mDaySpinner".equals(datePickerDialogField.getName())) {
                        datePickerDialogField.setAccessible(true);
                        Object dayPicker = new Object();
                        try {
                            dayPicker = datePickerDialogField.get(this.mDatePicker);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        ((View) dayPicker).setVisibility(8);
                    }
                    if (this.hideMonth && ("mMonthPicker".equals(datePickerDialogField.getName()) || "mMonthSpinner".equals(datePickerDialogField.getName()))) {
                        datePickerDialogField.setAccessible(true);
                        Object monthPicker = new Object();
                        try {
                            monthPicker = datePickerDialogField.get(this.mDatePicker);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        ((View) monthPicker).setVisibility(8);
                    }
                }
            }
        }
    }

    public void setAnswer() {
        if (this.mPrompt.getAnswerValue() != null) {
            DateTime ldt = new DateTime(((Date) ((DateData) this.mPrompt.getAnswerValue()).getValue()).getTime());
            this.mDatePicker.init(ldt.getYear(), ldt.getMonthOfYear() - 1, ldt.getDayOfMonth(), this.mDateListener);
            return;
        }
        clearAnswer();
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        DateTime ldt = new DateTime();
        this.mDatePicker.init(ldt.getYear(), ldt.getMonthOfYear() - 1, ldt.getDayOfMonth(), this.mDateListener);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        int i = 1;
        clearFocus();
        int year = this.mDatePicker.getYear();
        int month = this.hideMonth ? 1 : this.mDatePicker.getMonth() + 1;
        if (!this.hideMonth && !this.hideDay) {
            i = this.mDatePicker.getDayOfMonth();
        }
        DateTime ldt = new DateTime(year, month, i, 0, 0);
        return new DateData(ldt.toDate());
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.mDatePicker.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mDatePicker.cancelLongPress();
    }
}
