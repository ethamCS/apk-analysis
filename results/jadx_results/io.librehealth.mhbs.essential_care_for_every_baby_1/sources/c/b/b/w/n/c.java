package c.b.b.w.n;

import c.b.b.r;
import c.b.b.t;
import c.b.b.u;
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
    public static final u f528b = new a();

    /* renamed from: a */
    private final List<DateFormat> f529a;

    /* loaded from: classes.dex */
    static class a implements u {
        a() {
        }

        @Override // c.b.b.u
        public <T> t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f529a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (c.b.b.w.e.e()) {
            arrayList.add(c.b.b.w.j.c(2, 2));
        }
    }

    private synchronized Date e(String str) {
        for (DateFormat dateFormat : this.f529a) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return c.b.b.w.n.o.a.c(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new r(str, e2);
        }
    }

    /* renamed from: f */
    public Date b(c.b.b.y.a aVar) {
        if (aVar.x() == c.b.b.y.b.NULL) {
            aVar.t();
            return null;
        }
        return e(aVar.v());
    }

    /* renamed from: g */
    public synchronized void d(c.b.b.y.c cVar, Date date) {
        if (date == null) {
            cVar.m();
        } else {
            cVar.z(this.f529a.get(0).format(date));
        }
    }
}
