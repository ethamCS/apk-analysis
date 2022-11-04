package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
class e {
    public static String a(long j) {
        return b(j, Locale.getDefault());
    }

    static String b(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.b(locale).format(new Date(j)) : s.f(locale).format(new Date(j));
    }

    public static String c(long j) {
        return d(j, Locale.getDefault());
    }

    static String d(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.n(locale).format(new Date(j)) : s.f(locale).format(new Date(j));
    }
}
