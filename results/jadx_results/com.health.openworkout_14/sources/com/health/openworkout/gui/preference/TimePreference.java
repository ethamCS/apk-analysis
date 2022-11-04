package com.health.openworkout.gui.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import com.health.openworkout.R;
import java.util.Calendar;
/* loaded from: classes.dex */
public class TimePreference extends DialogPreference {
    private long W;

    public TimePreference(Context context) {
        this(context, null);
    }

    public TimePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.i_res_0x7f040297);
    }

    public TimePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, i);
    }

    public TimePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public CharSequence B() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.W);
        return DateFormat.getTimeFormat(i()).format(calendar.getTime());
    }

    @Override // androidx.preference.DialogPreference
    public int H0() {
        return R.layout.preference_timepicker;
    }

    public long M0() {
        return this.W;
    }

    public void N0(long j) {
        this.W = j;
        g0(j);
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 16);
        calendar.set(12, 0);
        return Long.valueOf(calendar.getTimeInMillis());
    }

    @Override // androidx.preference.Preference
    protected void b0(boolean z, Object obj) {
        N0(z ? v(this.W) : ((Long) obj).longValue());
    }
}
