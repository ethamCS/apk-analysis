package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
class e {
    public static String a(long j) {
        return a(j, Locale.getDefault());
    }

    static String a(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? o.a(locale).format(new Date(j)) : o.b(locale).format(new Date(j));
    }

    public static String b(long j) {
        return b(j, Locale.getDefault());
    }

    static String b(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? o.c(locale).format(new Date(j)) : o.b(locale).format(new Date(j));
    }
}
