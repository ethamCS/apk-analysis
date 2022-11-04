package e.a.a.e.h;

import android.content.Context;
import e.a.a.g.m;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: e */
    public Integer f813e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;

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
        Integer num;
        HashMap hashMap = new HashMap();
        hashMap.put("timeZone", this.f826a);
        hashMap.put("era", this.f813e);
        hashMap.put("year", this.f);
        hashMap.put("month", this.g);
        hashMap.put("day", this.h);
        hashMap.put("hour", this.i);
        hashMap.put("minute", this.j);
        hashMap.put("second", this.k);
        hashMap.put("millisecond", this.l);
        hashMap.put("weekOfMonth", this.n);
        hashMap.put("weekOfYear", this.o);
        Integer num2 = this.m;
        if (num2 == null) {
            num = null;
        } else {
            num = Integer.valueOf(num2.intValue() == 1 ? 7 : this.m.intValue() - 1);
        }
        hashMap.put("weekday", num);
        hashMap.put("repeats", this.f828c);
        hashMap.put("allowWhileIdle", this.f829d);
        return hashMap;
    }

    @Override // e.a.a.e.h.b
    public void i(Context context) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11 = this.f813e;
        if (num11 == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null || this.n == null || this.o == null) {
            if ((num11 != null && !e.a.a.g.h.d(num11, 0, 99999).booleanValue()) || (((num = this.f) != null && !e.a.a.g.h.d(num, 0, 99999).booleanValue()) || (((num2 = this.g) != null && !e.a.a.g.h.d(num2, 1, 12).booleanValue()) || (((num3 = this.h) != null && !e.a.a.g.h.d(num3, 1, 31).booleanValue()) || (((num4 = this.i) != null && !e.a.a.g.h.d(num4, 0, 23).booleanValue()) || (((num5 = this.j) != null && !e.a.a.g.h.d(num5, 0, 59).booleanValue()) || (((num6 = this.k) != null && !e.a.a.g.h.d(num6, 0, 59).booleanValue()) || (((num7 = this.l) != null && !e.a.a.g.h.d(num7, 0, 999).booleanValue()) || (((num8 = this.m) != null && !e.a.a.g.h.d(num8, 1, 7).booleanValue()) || (((num9 = this.n) != null && !e.a.a.g.h.d(num9, 1, 6).booleanValue()) || ((num10 = this.o) != null && !e.a.a.g.h.d(num10, 1, 53).booleanValue()))))))))))) {
                throw new e.a.a.e.f.a("Calendar values are invalid");
            }
            return;
        }
        throw new e.a.a.e.f.a("At least one parameter is required");
    }

    @Override // e.a.a.e.h.h
    public Calendar j(Date date) {
        String str;
        StringBuilder sb = new StringBuilder();
        Integer num = this.k;
        String str2 = "*";
        sb.append(num == null ? str2 : num.toString());
        sb.append(" ");
        Integer num2 = this.j;
        sb.append(num2 == null ? str2 : num2.toString());
        sb.append(" ");
        Integer num3 = this.i;
        sb.append(num3 == null ? str2 : num3.toString());
        sb.append(" ");
        String str3 = "?";
        if (this.m != null) {
            str = str3;
        } else {
            Integer num4 = this.h;
            str = num4 == null ? str2 : num4.toString();
        }
        sb.append(str);
        sb.append(" ");
        Integer num5 = this.g;
        sb.append(num5 == null ? str2 : num5.toString());
        sb.append(" ");
        Integer num6 = this.m;
        if (num6 != null) {
            str3 = num6.toString();
        }
        sb.append(str3);
        sb.append(" ");
        Integer num7 = this.f;
        if (num7 != null) {
            str2 = num7.toString();
        }
        sb.append(str2);
        String sb2 = sb.toString();
        TimeZone timeZone = m.c(this.f826a).booleanValue() ? e.a.a.g.f.f841b : TimeZone.getTimeZone(this.f826a);
        if (timeZone != null) {
            return e.a.a.g.e.b(null, sb2, date, timeZone);
        }
        throw new e.a.a.e.f.a("Invalid time zone");
    }

    /* renamed from: l */
    public d a(String str) {
        return (d) super.e(str);
    }

    public d m(Map<String, Object> map) {
        this.f826a = (String) b.d(map, "timeZone", String.class);
        this.f813e = (Integer) b.d(map, "era", Integer.class);
        this.f = (Integer) b.d(map, "year", Integer.class);
        this.g = (Integer) b.d(map, "month", Integer.class);
        this.h = (Integer) b.d(map, "day", Integer.class);
        this.i = (Integer) b.d(map, "hour", Integer.class);
        this.j = (Integer) b.d(map, "minute", Integer.class);
        this.k = (Integer) b.d(map, "second", Integer.class);
        this.l = (Integer) b.d(map, "millisecond", Integer.class);
        this.m = (Integer) b.d(map, "weekday", Integer.class);
        this.n = (Integer) b.d(map, "weekOfMonth", Integer.class);
        this.o = (Integer) b.d(map, "weekOfYear", Integer.class);
        this.f828c = (Boolean) b.d(map, "repeats", Boolean.class);
        this.f829d = (Boolean) b.d(map, "allowWhileIdle", Boolean.class);
        Integer num = this.f813e;
        if (num != null && num.intValue() < 0) {
            this.f813e = null;
        }
        Integer num2 = this.f;
        if (num2 != null && num2.intValue() < 0) {
            this.f = null;
        }
        Integer num3 = this.g;
        if (num3 != null && num3.intValue() < 0) {
            this.g = null;
        }
        Integer num4 = this.h;
        if (num4 != null && num4.intValue() < 0) {
            this.h = null;
        }
        Integer num5 = this.i;
        if (num5 != null && num5.intValue() < 0) {
            this.i = null;
        }
        Integer num6 = this.j;
        if (num6 != null && num6.intValue() < 0) {
            this.j = null;
        }
        Integer num7 = this.k;
        if (num7 != null && num7.intValue() < 0) {
            this.k = null;
        }
        Integer num8 = this.l;
        if (num8 != null && num8.intValue() < 0) {
            this.l = null;
        }
        Integer num9 = this.m;
        if (num9 != null && num9.intValue() < 0) {
            this.m = null;
        }
        Integer num10 = this.n;
        if (num10 != null && num10.intValue() < 0) {
            this.n = null;
        }
        Integer num11 = this.o;
        if (num11 != null && num11.intValue() < 0) {
            this.o = null;
        }
        Integer num12 = this.m;
        if (num12 != null) {
            int i = 1;
            if (num12.intValue() != 7) {
                i = 1 + this.m.intValue();
            }
            this.m = Integer.valueOf(i);
        }
        return this;
    }
}
