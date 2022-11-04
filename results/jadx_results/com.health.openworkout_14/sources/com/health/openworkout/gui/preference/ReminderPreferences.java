package com.health.openworkout.gui.preference;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.g;
import com.health.openworkout.R;
import com.health.openworkout.core.alarm.ReminderBootReceiver;
import com.health.openworkout.core.alarm.c;
/* loaded from: classes.dex */
public class ReminderPreferences extends g implements SharedPreferences.OnSharedPreferenceChangeListener {
    private SwitchPreferenceCompat g0;

    /* loaded from: classes.dex */
    class a implements Preference.g<MultiSelectListPreference> {
        a(ReminderPreferences reminderPreferences) {
        }

        /* renamed from: b */
        public CharSequence a(MultiSelectListPreference multiSelectListPreference) {
            return multiSelectListPreference.O0().toString();
        }
    }

    private void R1() {
        ComponentName componentName = new ComponentName(m().getApplicationContext(), ReminderBootReceiver.class);
        PackageManager packageManager = m().getApplicationContext().getPackageManager();
        c cVar = new c();
        if (this.g0.G0()) {
            cVar.f(m());
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
            return;
        }
        cVar.a(m());
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
    }

    @Override // androidx.fragment.app.Fragment
    public void D0() {
        super.D0();
        C1().l().registerOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.preference.g
    public void H1(Bundle bundle, String str) {
        P1(R.xml.reminder_preferences, str);
        ((MultiSelectListPreference) g("reminderDays")).x0(new a(this));
        this.g0 = (SwitchPreferenceCompat) g("reminderEnable");
    }

    @Override // androidx.preference.g, androidx.preference.j.a
    public void b(Preference preference) {
        b Q1 = preference instanceof TimePreference ? b.Q1(preference.p()) : null;
        if (Q1 == null) {
            super.b(preference);
            return;
        }
        Q1.v1(this, 0);
        Q1.I1(F(), "timePreferenceDialog");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        R1();
    }

    @Override // androidx.fragment.app.Fragment
    public void y0() {
        C1().l().unregisterOnSharedPreferenceChangeListener(this);
        super.y0();
    }
}
