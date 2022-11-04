package e.a.a.g;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class e {
    public static Date a(Date date, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.setTime(date);
        calendar.set(14, calendar.get(14) - 999);
        return calendar.getTime();
    }

    public static Calendar b(String str, String str2, Date date, TimeZone timeZone) {
        if (!m.c(str).booleanValue() || !m.c(str2).booleanValue()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(timeZone);
            if (date == null) {
                date = f.d();
            }
            Date e2 = str == null ? date : f.e(str, timeZone.getID());
            if (e2.compareTo(date) != -1) {
                calendar.setTime(e2);
            } else if (m.c(str2).booleanValue()) {
                return null;
            } else {
                calendar.setTime(date);
            }
            Date a2 = a(date, timeZone);
            if (m.c(str2).booleanValue()) {
                return calendar;
            }
            if (e.a.a.d.a.q(str2)) {
                try {
                    e.a.a.d.a aVar = new e.a.a.d.a(str2);
                    aVar.s(timeZone);
                    Date j = aVar.j(date);
                    if (j == null || j.compareTo(a2) <= 0) {
                        return null;
                    }
                    calendar.setTime(j);
                    return calendar;
                } catch (ParseException e3) {
                    e3.printStackTrace();
                }
            }
            return null;
        }
        return null;
    }
}
