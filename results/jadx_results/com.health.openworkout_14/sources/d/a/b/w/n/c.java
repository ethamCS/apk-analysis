package d.a.b.w.n;

import d.a.b.r;
import d.a.b.t;
import d.a.b.u;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class c extends t<Date> {

    /* renamed from: b */
    public static final u f3819b = new a();

    /* renamed from: a */
    private final List<DateFormat> f3820a;

    /* loaded from: classes.dex */
    static class a implements u {
        a() {
        }

        @Override // d.a.b.u
        public <T> t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f3820a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.a.b.w.e.e()) {
            arrayList.add(d.a.b.w.j.c(2, 2));
        }
    }

    private synchronized Date e(String str) {
        for (DateFormat dateFormat : this.f3820a) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return d.a.b.w.n.o.a.c(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new r(str, e2);
        }
    }

    /* renamed from: f */
    public Date b(d.a.b.y.a aVar) {
        if (aVar.w0() == d.a.b.y.b.NULL) {
            aVar.s0();
            return null;
        }
        return e(aVar.u0());
    }

    /* renamed from: g */
    public synchronized void d(d.a.b.y.c cVar, Date date) {
        if (date == null) {
            cVar.m0();
        } else {
            cVar.z0(this.f3820a.get(0).format(date));
        }
    }
}
