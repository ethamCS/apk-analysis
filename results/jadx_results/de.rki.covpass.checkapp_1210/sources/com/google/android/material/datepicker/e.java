package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
class e {
    public static String a(long j10) {
        return b(j10, Locale.getDefault());
    }

    static String b(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.b(locale).format(new Date(j10)) : s.f(locale).format(new Date(j10));
    }

    public static String c(long j10) {
        return DateUtils.formatDateTime(null, j10, 8228);
    }

    public static String d(long j10) {
        return e(j10, Locale.getDefault());
    }

    static String e(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.m(locale).format(new Date(j10)) : s.f(locale).format(new Date(j10));
    }
}
