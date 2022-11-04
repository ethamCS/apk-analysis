package d.a.b.w.n;

import d.a.b.r;
import d.a.b.t;
import d.a.b.u;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: classes.dex */
public final class j extends t<Date> {

    /* renamed from: b */
    public static final u f3846b = new a();

    /* renamed from: a */
    private final DateFormat f3847a = new SimpleDateFormat("MMM d, yyyy");

    /* loaded from: classes.dex */
    static class a implements u {
        a() {
        }

        @Override // d.a.b.u
        public <T> t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new j();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Date b(d.a.b.y.a aVar) {
        if (aVar.w0() == d.a.b.y.b.NULL) {
            aVar.s0();
            return null;
        }
        try {
            return new Date(this.f3847a.parse(aVar.u0()).getTime());
        } catch (ParseException e2) {
            throw new r(e2);
        }
    }

    /* renamed from: f */
    public synchronized void d(d.a.b.y.c cVar, Date date) {
        cVar.z0(date == null ? null : this.f3847a.format((java.util.Date) date));
    }
}
