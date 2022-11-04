package com.afollestad.materialdialogs.datetime.utils;

import android.os.Build;
import android.widget.TimePicker;
import androidx.viewpager.widget.ViewPager;
import com.afollestad.date.DatePicker;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.datetime.R;
import com.afollestad.viewpagerdots.DotsIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewExt.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003*\u00020\u0005H\u0000\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0005H\u0000\u001a\u0014\u0010\b\u001a\n \u0004*\u0004\u0018\u00010\t0\t*\u00020\u0005H\u0000\u001a\u0014\u0010\n\u001a\n \u0004*\u0004\u0018\u00010\u000b0\u000b*\u00020\u0005H\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000bH\u0000\u001a\u0014\u0010\f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rH\u0000\u001a\f\u0010\u0010\u001a\u00020\r*\u00020\u000bH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rH\u0000¨\u0006\u0011"}, d2 = {"isNougat", "", "getDatePicker", "Lcom/afollestad/date/DatePicker;", "kotlin.jvm.PlatformType", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getPageIndicator", "Lcom/afollestad/viewpagerdots/DotsIndicator;", "getPager", "Landroidx/viewpager/widget/ViewPager;", "getTimePicker", "Landroid/widget/TimePicker;", "hour", "", "", "value", "minute", "datetime"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class ViewExtKt {
    public static final int hour(TimePicker hour) {
        Intrinsics.checkParameterIsNotNull(hour, "$this$hour");
        if (isNougat()) {
            return hour.getHour();
        }
        Integer currentHour = hour.getCurrentHour();
        Intrinsics.checkExpressionValueIsNotNull(currentHour, "currentHour");
        return currentHour.intValue();
    }

    public static final int minute(TimePicker minute) {
        Intrinsics.checkParameterIsNotNull(minute, "$this$minute");
        if (isNougat()) {
            return minute.getMinute();
        }
        Integer currentMinute = minute.getCurrentMinute();
        Intrinsics.checkExpressionValueIsNotNull(currentMinute, "currentMinute");
        return currentMinute.intValue();
    }

    public static final void hour(TimePicker hour, int i) {
        Intrinsics.checkParameterIsNotNull(hour, "$this$hour");
        if (isNougat()) {
            hour.setHour(i);
        } else {
            hour.setCurrentHour(Integer.valueOf(i));
        }
    }

    public static final void minute(TimePicker minute, int i) {
        Intrinsics.checkParameterIsNotNull(minute, "$this$minute");
        if (isNougat()) {
            minute.setMinute(i);
        } else {
            minute.setCurrentMinute(Integer.valueOf(i));
        }
    }

    public static final DatePicker getDatePicker(MaterialDialog getDatePicker) {
        Intrinsics.checkParameterIsNotNull(getDatePicker, "$this$getDatePicker");
        return (DatePicker) getDatePicker.findViewById(R.id.datetimeDatePicker);
    }

    public static final TimePicker getTimePicker(MaterialDialog getTimePicker) {
        Intrinsics.checkParameterIsNotNull(getTimePicker, "$this$getTimePicker");
        return (TimePicker) getTimePicker.findViewById(R.id.datetimeTimePicker);
    }

    public static final ViewPager getPager(MaterialDialog getPager) {
        Intrinsics.checkParameterIsNotNull(getPager, "$this$getPager");
        return (ViewPager) getPager.findViewById(R.id.dateTimePickerPager);
    }

    public static final DotsIndicator getPageIndicator(MaterialDialog getPageIndicator) {
        Intrinsics.checkParameterIsNotNull(getPageIndicator, "$this$getPageIndicator");
        return (DotsIndicator) getPageIndicator.findViewById(R.id.datetimePickerPagerDots);
    }

    private static final boolean isNougat() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
