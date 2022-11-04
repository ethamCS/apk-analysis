package e.a.a.e.h;

import e.a.a.g.m;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/* loaded from: classes.dex */
public abstract class h extends b {

    /* renamed from: a */
    public String f826a;

    /* renamed from: b */
    public String f827b;

    /* renamed from: c */
    public Boolean f828c;

    /* renamed from: d */
    public Boolean f829d;

    public abstract Calendar j(Date date);

    public Boolean k() {
        Boolean bool = Boolean.FALSE;
        if ((m.c(this.f826a).booleanValue() ? e.a.a.g.f.f841b : TimeZone.getTimeZone(this.f826a)) != null) {
            if (this.f827b == null && !this.f828c.booleanValue()) {
                return bool;
            }
            Calendar j = j(this.f828c.booleanValue() ? e.a.a.g.f.b(this.f826a) : e.a.a.g.f.e(this.f827b, this.f826a));
            if (j == null) {
                return bool;
            }
            Date time = j.getTime();
            return Boolean.valueOf(time != null && time.compareTo(e.a.a.g.f.b(this.f826a)) >= 0);
        }
        throw new e.a.a.e.f.a("Invalid time zone");
    }
}
