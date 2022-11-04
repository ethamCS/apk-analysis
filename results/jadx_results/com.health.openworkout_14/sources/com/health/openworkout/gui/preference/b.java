package com.health.openworkout.gui.preference;

import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TimePicker;
import androidx.preference.DialogPreference;
import androidx.preference.f;
import com.health.openworkout.R;
import java.util.Calendar;
/* loaded from: classes.dex */
public class b extends f {
    private Calendar t0;
    private TimePicker u0;

    public static b Q1(String str) {
        b bVar = new b();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        bVar.o1(bundle);
        return bVar;
    }

    @Override // androidx.preference.f
    public void L1(View view) {
        super.L1(view);
        this.u0 = (TimePicker) view.findViewById(R.id.timePicker);
        this.t0 = Calendar.getInstance();
        DialogPreference J1 = J1();
        Long valueOf = J1 instanceof TimePreference ? Long.valueOf(((TimePreference) J1).M0()) : null;
        if (valueOf != null) {
            this.t0.setTimeInMillis(valueOf.longValue());
            this.u0.setIs24HourView(Boolean.valueOf(DateFormat.is24HourFormat(t())));
            this.u0.setCurrentHour(Integer.valueOf(this.t0.get(11)));
            this.u0.setCurrentMinute(Integer.valueOf(this.t0.get(12)));
        }
    }

    @Override // androidx.preference.f
    public void N1(boolean z) {
        int i;
        int i2;
        if (z) {
            if (Build.VERSION.SDK_INT >= 23) {
                i = this.u0.getHour();
                i2 = this.u0.getMinute();
            } else {
                i = this.u0.getCurrentHour().intValue();
                i2 = this.u0.getCurrentMinute().intValue();
            }
            this.t0.set(11, i);
            this.t0.set(12, i2);
            long timeInMillis = this.t0.getTimeInMillis();
            DialogPreference J1 = J1();
            if (!(J1 instanceof TimePreference)) {
                return;
            }
            TimePreference timePreference = (TimePreference) J1;
            if (!timePreference.b(Long.valueOf(timeInMillis))) {
                return;
            }
            timePreference.N0(timeInMillis);
            timePreference.w0(DateFormat.getTimeFormat(t()).format(this.t0.getTime()));
        }
    }
}
