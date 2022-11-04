package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.conscrypt.BuildConfig;
/* loaded from: classes2.dex */
class B {

    /* renamed from: a */
    private static final ConcurrentHashMap f13025a = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: b */
    private static final Comparator f13026b = new C0487c();

    /* renamed from: c */
    public static final /* synthetic */ int f13027c = 0;

    private Object b(TemporalField temporalField, Locale locale) {
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        V v10 = f13025a.get(simpleImmutableEntry);
        if (v10 == 0) {
            HashMap hashMap = new HashMap();
            int i10 = 0;
            if (temporalField == ChronoField.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                while (i10 < eras.length) {
                    if (!eras[i10].isEmpty()) {
                        long j10 = i10;
                        hashMap2.put(Long.valueOf(j10), eras[i10]);
                        hashMap3.put(Long.valueOf(j10), c(eras[i10]));
                    }
                    i10++;
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.put(E.FULL, hashMap2);
                    hashMap.put(E.SHORT, hashMap2);
                    hashMap.put(E.NARROW, hashMap3);
                }
                obj = new A(hashMap);
            } else if (temporalField == ChronoField.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                String[] months = dateFormatSymbols2.getMonths();
                for (int i11 = 0; i11 < months.length; i11++) {
                    if (!months[i11].isEmpty()) {
                        long j11 = i11 + 1;
                        hashMap4.put(Long.valueOf(j11), months[i11]);
                        hashMap5.put(Long.valueOf(j11), c(months[i11]));
                    }
                }
                if (!hashMap4.isEmpty()) {
                    hashMap.put(E.FULL, hashMap4);
                    hashMap.put(E.NARROW, hashMap5);
                }
                HashMap hashMap6 = new HashMap();
                String[] shortMonths = dateFormatSymbols2.getShortMonths();
                while (i10 < shortMonths.length) {
                    if (!shortMonths[i10].isEmpty()) {
                        hashMap6.put(Long.valueOf(i10 + 1), shortMonths[i10]);
                    }
                    i10++;
                }
                if (!hashMap6.isEmpty()) {
                    hashMap.put(E.SHORT, hashMap6);
                }
                obj = new A(hashMap);
            } else if (temporalField == ChronoField.DAY_OF_WEEK) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap7 = new HashMap();
                String[] weekdays = dateFormatSymbols3.getWeekdays();
                hashMap7.put(1L, weekdays[2]);
                hashMap7.put(2L, weekdays[3]);
                hashMap7.put(3L, weekdays[4]);
                hashMap7.put(4L, weekdays[5]);
                hashMap7.put(5L, weekdays[6]);
                hashMap7.put(6L, weekdays[7]);
                hashMap7.put(7L, weekdays[1]);
                hashMap.put(E.FULL, hashMap7);
                HashMap hashMap8 = new HashMap();
                hashMap8.put(1L, c(weekdays[2]));
                hashMap8.put(2L, c(weekdays[3]));
                hashMap8.put(3L, c(weekdays[4]));
                hashMap8.put(4L, c(weekdays[5]));
                hashMap8.put(5L, c(weekdays[6]));
                hashMap8.put(6L, c(weekdays[7]));
                hashMap8.put(7L, c(weekdays[1]));
                hashMap.put(E.NARROW, hashMap8);
                HashMap hashMap9 = new HashMap();
                String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
                hashMap9.put(1L, shortWeekdays[2]);
                hashMap9.put(2L, shortWeekdays[3]);
                hashMap9.put(3L, shortWeekdays[4]);
                hashMap9.put(4L, shortWeekdays[5]);
                hashMap9.put(5L, shortWeekdays[6]);
                hashMap9.put(6L, shortWeekdays[7]);
                hashMap9.put(7L, shortWeekdays[1]);
                hashMap.put(E.SHORT, hashMap9);
                obj = new A(hashMap);
            } else if (temporalField == ChronoField.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap10 = new HashMap();
                HashMap hashMap11 = new HashMap();
                String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
                while (i10 < amPmStrings.length) {
                    if (!amPmStrings[i10].isEmpty()) {
                        long j12 = i10;
                        hashMap10.put(Long.valueOf(j12), amPmStrings[i10]);
                        hashMap11.put(Long.valueOf(j12), c(amPmStrings[i10]));
                    }
                    i10++;
                }
                if (!hashMap10.isEmpty()) {
                    hashMap.put(E.FULL, hashMap10);
                    hashMap.put(E.SHORT, hashMap10);
                    hashMap.put(E.NARROW, hashMap11);
                }
                obj = new A(hashMap);
            } else {
                obj = BuildConfig.FLAVOR;
            }
            ConcurrentHashMap concurrentHashMap = f13025a;
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            return concurrentHashMap.get(simpleImmutableEntry);
        }
        return v10;
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    public String d(TemporalField temporalField, long j10, E e10, Locale locale) {
        Object b10 = b(temporalField, locale);
        if (b10 instanceof A) {
            return ((A) b10).a(j10, e10);
        }
        return null;
    }

    public Iterator e(TemporalField temporalField, E e10, Locale locale) {
        Object b10 = b(temporalField, locale);
        if (b10 instanceof A) {
            return ((A) b10).b(e10);
        }
        return null;
    }
}
