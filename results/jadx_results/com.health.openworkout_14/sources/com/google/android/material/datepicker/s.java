package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
class s {

    /* renamed from: a */
    static AtomicReference<r> f3103a = new AtomicReference<>();

    public static long a(long j) {
        Calendar l = l();
        l.setTimeInMillis(j);
        return d(l).getTimeInMillis();
    }

    @TargetApi(24)
    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    @TargetApi(24)
    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(k());
        return instanceForSkeleton;
    }

    public static Calendar d(Calendar calendar) {
        Calendar m = m(calendar);
        Calendar l = l();
        l.set(m.get(1), m.get(2), m.get(5));
        return l;
    }

    private static java.text.DateFormat e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(i());
        return dateInstance;
    }

    public static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    private static SimpleDateFormat g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(i());
        return simpleDateFormat;
    }

    static r h() {
        r rVar = f3103a.get();
        return rVar == null ? r.c() : rVar;
    }

    private static TimeZone i() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar j() {
        Calendar a2 = h().a();
        a2.set(11, 0);
        a2.set(12, 0);
        a2.set(13, 0);
        a2.set(14, 0);
        a2.setTimeZone(i());
        return a2;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone k() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar l() {
        return m(null);
    }

    static Calendar m(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(i());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat n(Locale locale) {
        return c("yMMMEd", locale);
    }

    public static SimpleDateFormat o() {
        return p(Locale.getDefault());
    }

    private static SimpleDateFormat p(Locale locale) {
        return g("LLLL, yyyy", locale);
    }
}
