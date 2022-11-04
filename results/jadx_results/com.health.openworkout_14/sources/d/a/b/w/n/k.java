package d.a.b.w.n;

import d.a.b.r;
import d.a.b.t;
import d.a.b.u;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public final class k extends t<Time> {

    /* renamed from: b */
    public static final u f3848b = new a();

    /* renamed from: a */
    private final DateFormat f3849a = new SimpleDateFormat("hh:mm:ss a");

    /* loaded from: classes.dex */
    static class a implements u {
        a() {
        }

        @Override // d.a.b.u
        public <T> t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new k();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Time b(d.a.b.y.a aVar) {
        if (aVar.w0() == d.a.b.y.b.NULL) {
            aVar.s0();
            return null;
        }
        try {
            return new Time(this.f3849a.parse(aVar.u0()).getTime());
        } catch (ParseException e2) {
            throw new r(e2);
        }
    }

    /* renamed from: f */
    public synchronized void d(d.a.b.y.c cVar, Time time) {
        cVar.z0(time == null ? null : this.f3849a.format((Date) time));
    }
}
