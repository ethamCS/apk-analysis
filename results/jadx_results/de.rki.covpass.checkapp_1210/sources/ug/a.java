package ug;

import ak.q;
import bh.c;
import bh.d;
import gg.v;
import ih.i;
import java.util.Enumeration;
import java.util.Hashtable;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a */
    static final Hashtable f23629a = new Hashtable();

    /* renamed from: b */
    static final Hashtable f23630b = new Hashtable();

    static {
        a("B-571", d.F);
        a("B-409", d.D);
        a("B-283", d.f6073n);
        a("B-233", d.f6079t);
        a("B-163", d.f6071l);
        a("K-571", d.E);
        a("K-409", d.C);
        a("K-283", d.f6072m);
        a("K-233", d.f6078s);
        a("K-163", d.f6061b);
        a("P-521", d.B);
        a("P-384", d.A);
        a("P-256", d.H);
        a("P-224", d.f6085z);
        a("P-192", d.G);
    }

    static void a(String str, v vVar) {
        f23629a.put(str, vVar);
        f23630b.put(vVar, str);
    }

    public static i b(String str) {
        v vVar = (v) f23629a.get(q.k(str));
        if (vVar != null) {
            return c(vVar);
        }
        return null;
    }

    public static i c(v vVar) {
        return c.k(vVar);
    }

    public static String d(v vVar) {
        return (String) f23630b.get(vVar);
    }

    public static Enumeration e() {
        return f23629a.keys();
    }

    public static v f(String str) {
        return (v) f23629a.get(q.k(str));
    }
}
