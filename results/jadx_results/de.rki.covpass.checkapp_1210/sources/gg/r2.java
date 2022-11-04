package gg;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes3.dex */
class r2 {

    /* renamed from: a */
    private static Long f10882a = c(0);

    /* renamed from: b */
    private static final Map f10883b = new HashMap();

    /* renamed from: c */
    static Locale f10884c = b();

    public static Date a(Date date) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = f10883b;
        synchronized (map) {
            Long l10 = (Long) map.get(locale);
            if (l10 == null) {
                long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                l10 = time == 0 ? f10882a : c(time);
                map.put(locale, l10);
            }
            if (l10 == f10882a) {
                return date;
            }
            return new Date(date.getTime() - l10.longValue());
        }
    }

    private static Locale b() {
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return Locale.getDefault();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i10 = 0; i10 != availableLocales.length; i10++) {
            if ("en".equalsIgnoreCase(availableLocales[i10].getLanguage())) {
                return availableLocales[i10];
            }
        }
        return Locale.getDefault();
    }

    private static Long c(long j10) {
        return Long.valueOf(j10);
    }
}
