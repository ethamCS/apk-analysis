package e.a.a.e.h;

import android.content.Context;
import e.a.a.g.m;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes.dex */
public class g extends h {

    /* renamed from: e */
    public Integer f825e;

    @Override // e.a.a.e.h.b
    public /* bridge */ /* synthetic */ b b(Map map) {
        m(map);
        return this;
    }

    @Override // e.a.a.e.h.b
    public String g() {
        return f();
    }

    @Override // e.a.a.e.h.b
    public Map<String, Object> h() {
        HashMap hashMap = new HashMap();
        hashMap.put("timeZone", this.f826a);
        hashMap.put("interval", this.f825e);
        hashMap.put("repeats", this.f828c);
        hashMap.put("allowWhileIdle", this.f829d);
        return hashMap;
    }

    @Override // e.a.a.e.h.b
    public void i(Context context) {
        Integer num = this.f825e;
        if (num == null || num.intValue() < 0) {
            throw new e.a.a.e.f.a("Interval is required and must be greater than zero");
        }
    }

    @Override // e.a.a.e.h.h
    public Calendar j(Date date) {
        TimeZone timeZone = m.c(this.f826a).booleanValue() ? e.a.a.g.f.f841b : TimeZone.getTimeZone(this.f826a);
        if (timeZone != null) {
            if (date == null) {
                date = e.a.a.g.f.b(this.f826a);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(timeZone);
            calendar.setTime(date);
            calendar.add(13, this.f825e.intValue());
            if (date.compareTo(calendar.getTime()) > 0) {
                return null;
            }
            return calendar;
        }
        throw new e.a.a.e.f.a("Invalid time zone");
    }

    /* renamed from: l */
    public g a(String str) {
        return (g) super.e(str);
    }

    public g m(Map<String, Object> map) {
        this.f826a = (String) b.d(map, "timeZone", String.class);
        this.f825e = (Integer) b.d(map, "interval", Integer.class);
        this.f828c = (Boolean) b.d(map, "repeats", Boolean.class);
        this.f829d = (Boolean) b.d(map, "allowWhileIdle", Boolean.class);
        return this;
    }
}
