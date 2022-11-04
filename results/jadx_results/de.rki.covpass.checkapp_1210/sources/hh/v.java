package hh;

import gg.x1;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
/* loaded from: classes3.dex */
public class v extends gg.t {

    /* renamed from: c */
    private Hashtable f12075c = new Hashtable();

    /* renamed from: d */
    private Vector f12076d = new Vector();

    private v(gg.d0 d0Var) {
        Enumeration H = d0Var.H();
        while (H.hasMoreElements()) {
            u o10 = u.o(H.nextElement());
            if (this.f12075c.containsKey(o10.m())) {
                throw new IllegalArgumentException("repeated extension found: " + o10.m());
            }
            this.f12075c.put(o10.m(), o10);
            this.f12076d.addElement(o10.m());
        }
    }

    public static v m(gg.j0 j0Var, boolean z10) {
        return n(gg.d0.E(j0Var, z10));
    }

    public static v n(Object obj) {
        if (obj instanceof v) {
            return (v) obj;
        }
        if (obj == null) {
            return null;
        }
        return new v(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(this.f12076d.size());
        Enumeration elements = this.f12076d.elements();
        while (elements.hasMoreElements()) {
            hVar.a((u) this.f12075c.get((gg.v) elements.nextElement()));
        }
        return new x1(hVar);
    }

    public u l(gg.v vVar) {
        return (u) this.f12075c.get(vVar);
    }

    public Enumeration o() {
        return this.f12076d.elements();
    }
}
