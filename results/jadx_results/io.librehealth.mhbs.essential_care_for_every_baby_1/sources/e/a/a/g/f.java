package e.a.a.g;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    public static TimeZone f840a = TimeZone.getTimeZone("UTC");

    /* renamed from: b */
    public static TimeZone f841b = TimeZone.getDefault();

    public static String a(Date date, String str) {
        TimeZone timeZone = TimeZone.getTimeZone(str);
        if (timeZone != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.format(date);
        }
        throw new e.a.a.e.f.a("Invalid time zone");
    }

    public static Date b(String str) {
        TimeZone timeZone = str == null ? f841b : TimeZone.getTimeZone(str);
        if (timeZone != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(timeZone);
            return calendar.getTime();
        }
        throw new e.a.a.e.f.a("Invalid time zone");
    }

    public static String c() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(f840a);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(f840a);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static Date d() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(f840a);
        return calendar.getTime();
    }

    public static Date e(String str, String str2) {
        try {
            TimeZone timeZone = TimeZone.getTimeZone(str2);
            if (timeZone == null) {
                throw new e.a.a.e.f.a("Invalid time zone");
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.parse(str);
        } catch (ParseException e2) {
            e2.printStackTrace();
            throw new e.a.a.e.f.a("Invalid date");
        }
    }
}
