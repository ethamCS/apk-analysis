package ih;

import gg.v;
import java.util.Enumeration;
import java.util.Vector;
/* loaded from: classes3.dex */
public class d {
    private static void a(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    public static i b(String str) {
        i h10 = f.h(str);
        if (h10 == null) {
            h10 = bh.c.j(str);
        }
        if (h10 == null) {
            h10 = ug.a.b(str);
        }
        if (h10 == null) {
            h10 = ch.a.h(str);
        }
        if (h10 == null) {
            h10 = hg.a.h(str);
        }
        if (h10 == null) {
            h10 = lg.b.d(str);
        }
        return h10 == null ? ng.a.h(str) : h10;
    }

    public static i c(v vVar) {
        i i10 = f.i(vVar);
        if (i10 == null) {
            i10 = bh.c.k(vVar);
        }
        if (i10 == null) {
            i10 = ch.a.i(vVar);
        }
        if (i10 == null) {
            i10 = hg.a.i(vVar);
        }
        if (i10 == null) {
            i10 = lg.b.f(vVar);
        }
        return i10 == null ? ng.a.i(vVar) : i10;
    }

    public static String d(v vVar) {
        String j10 = f.j(vVar);
        if (j10 == null) {
            j10 = bh.c.l(vVar);
        }
        if (j10 == null) {
            j10 = ug.a.d(vVar);
        }
        if (j10 == null) {
            j10 = ch.a.j(vVar);
        }
        if (j10 == null) {
            j10 = hg.a.j(vVar);
        }
        if (j10 == null) {
            j10 = lg.b.g(vVar);
        }
        if (j10 == null) {
            j10 = ng.a.j(vVar);
        }
        return j10 == null ? oh.a.k(vVar) : j10;
    }

    public static Enumeration e() {
        Vector vector = new Vector();
        a(vector, f.k());
        a(vector, bh.c.m());
        a(vector, ug.a.e());
        a(vector, ch.a.k());
        a(vector, hg.a.k());
        a(vector, lg.b.h());
        a(vector, ng.a.k());
        return vector.elements();
    }

    public static v f(String str) {
        v l10 = f.l(str);
        if (l10 == null) {
            l10 = bh.c.n(str);
        }
        if (l10 == null) {
            l10 = ug.a.f(str);
        }
        if (l10 == null) {
            l10 = ch.a.l(str);
        }
        if (l10 == null) {
            l10 = hg.a.l(str);
        }
        if (l10 == null) {
            l10 = lg.b.i(str);
        }
        if (l10 == null) {
            l10 = ng.a.l(str);
        }
        return (l10 != null || !str.equals("curve25519")) ? l10 : kg.a.f15277c;
    }
}
