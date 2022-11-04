package c.b.b.w.n;

import c.b.b.r;
import c.b.b.t;
import c.b.b.u;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: classes.dex */
public final class j extends t<Date> {

    /* renamed from: b */
    public static final u f552b = new a();

    /* renamed from: a */
    private final DateFormat f553a = new SimpleDateFormat("MMM d, yyyy");

    /* loaded from: classes.dex */
    static class a implements u {
        a() {
        }

        @Override // c.b.b.u
        public <T> t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new j();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Date b(c.b.b.y.a aVar) {
        if (aVar.x() == c.b.b.y.b.NULL) {
            aVar.t();
            return null;
        }
        try {
            return new Date(this.f553a.parse(aVar.v()).getTime());
        } catch (ParseException e2) {
            throw new r(e2);
        }
    }

    /* renamed from: f */
    public synchronized void d(c.b.b.y.c cVar, Date date) {
        cVar.z(date == null ? null : this.f553a.format((java.util.Date) date));
    }
}
