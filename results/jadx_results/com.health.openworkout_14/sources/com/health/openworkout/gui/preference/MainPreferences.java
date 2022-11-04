package com.health.openworkout.gui.preference;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.navigation.t;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.g;
import com.health.openworkout.R;
import h.a.a;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public class MainPreferences extends g {
    private com.health.openworkout.gui.utils.a g0;

    /* loaded from: classes.dex */
    class a implements Preference.d {

        /* renamed from: a */
        final /* synthetic */ SwitchPreferenceCompat f3450a;

        a(MainPreferences mainPreferences, SwitchPreferenceCompat switchPreferenceCompat) {
            this.f3450a = switchPreferenceCompat;
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference, Object obj) {
            if (!this.f3450a.G0()) {
                androidx.appcompat.app.f.G(2);
            } else {
                androidx.appcompat.app.f.G(1);
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements Preference.e {
        b() {
            MainPreferences.this = r1;
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            t.a(MainPreferences.this.m(), R.id.nav_host_fragment).r(com.health.openworkout.gui.preference.a.b());
            return true;
        }
    }

    /* loaded from: classes.dex */
    class c implements Preference.e {
        c() {
            MainPreferences.this = r1;
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            t.a(MainPreferences.this.m(), R.id.nav_host_fragment).r(com.health.openworkout.gui.preference.a.c());
            return true;
        }
    }

    /* loaded from: classes.dex */
    class d implements Preference.d {

        /* renamed from: a */
        final /* synthetic */ SwitchPreferenceCompat f3453a;

        d(SwitchPreferenceCompat switchPreferenceCompat) {
            MainPreferences.this = r1;
            this.f3453a = switchPreferenceCompat;
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference, Object obj) {
            if (!this.f3453a.G0()) {
                MainPreferences.this.g0.e(String.format("openWorkout_%s.txt", new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(new Date())));
            } else {
                f T1 = MainPreferences.this.T1();
                if (T1 != null) {
                    h.a.a.a("Debug log disabled", new Object[0]);
                    h.a.a.g(T1);
                    T1.m();
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    class e implements Preference.e {
        e() {
            MainPreferences.this = r1;
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            t.a(MainPreferences.this.m(), R.id.nav_host_fragment).r(com.health.openworkout.gui.preference.a.a());
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class f extends a.b {

        /* renamed from: c */
        PrintWriter f3456c;

        /* renamed from: d */
        DateFormat f3457d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        f(MainPreferences mainPreferences, OutputStream outputStream) {
            this.f3456c = new PrintWriter(outputStream, true);
        }

        private String n(int i) {
            switch (i) {
                case 2:
                    return "Verbose";
                case 3:
                    return "Debug";
                case 4:
                    return "Info";
                case 5:
                    return "Warning";
                case 6:
                    return "Error";
                case 7:
                    return "Assert";
                default:
                    return String.format("Unknown (%d)", Integer.valueOf(i));
            }
        }

        @Override // h.a.a.b, h.a.a.c
        protected synchronized void j(int i, String str, String str2, Throwable th) {
            this.f3456c.printf("%s %s [%d] %s: %s\r\n", this.f3457d.format(new Date()), n(i), Long.valueOf(Thread.currentThread().getId()), str, str2);
        }

        void m() {
            this.f3456c.close();
        }
    }

    public f T1() {
        for (a.c cVar : h.a.a.e()) {
            if (cVar instanceof f) {
                return (f) cVar;
            }
        }
        return null;
    }

    private void U1(Uri uri) {
        try {
            h.a.a.f(new f(this, m().getContentResolver().openOutputStream(uri)));
            h.a.a.a("Debug log enabled, %s v%s (%d), SDK %d, %s %s", H().getString(R.string.app_name), "1.3.1", 14, Integer.valueOf(Build.VERSION.SDK_INT), Build.MANUFACTURER, Build.MODEL);
        } catch (IOException e2) {
            h.a.a.d(e2, "Failed to open debug log %s", uri.toString());
        }
    }

    private static void V1(Preference preference, int i) {
        if (!(preference instanceof PreferenceGroup)) {
            Drawable m = preference.m();
            if (m == null) {
                return;
            }
            androidx.core.graphics.drawable.a.n(m, i);
            return;
        }
        PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
        for (int i2 = 0; i2 < preferenceGroup.M0(); i2++) {
            V1(preferenceGroup.L0(i2), i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void C0(int i, String[] strArr, int[] iArr) {
        this.g0.d(i, strArr, iArr);
    }

    @Override // androidx.preference.g
    public void H1(Bundle bundle, String str) {
        P1(R.xml.main_preferences, str);
        TypedValue typedValue = new TypedValue();
        boolean z = true;
        t().getTheme().resolveAttribute(R.attr.w_res_0x7f0400b6, typedValue, true);
        V1(D1(), b.g.d.a.b(t(), typedValue.resourceId));
        this.g0 = new com.health.openworkout.gui.utils.a(this);
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) g("darkTheme");
        switchPreferenceCompat.t0(new a(this, switchPreferenceCompat));
        g("reminder").u0(new b());
        g("sound").u0(new c());
        SwitchPreferenceCompat switchPreferenceCompat2 = (SwitchPreferenceCompat) g("debugLogging");
        if (T1() == null) {
            z = false;
        }
        switchPreferenceCompat2.H0(z);
        switchPreferenceCompat2.t0(new d(switchPreferenceCompat2));
        Preference g2 = g("removeAd");
        g2.u0(new e());
        g2.A0(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void d0(int i, int i2, Intent intent) {
        super.d0(i, i2, intent);
        if (this.g0.c(i, i2, intent)) {
            U1(intent.getData());
        }
    }
}
