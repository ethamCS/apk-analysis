package hh;

import gg.a2;
import gg.x1;
import java.util.Enumeration;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public class o0 extends gg.t {
    gg.d0 U3;
    v V3;

    /* renamed from: c */
    gg.q f12007c;

    /* renamed from: d */
    hh.b f12008d;

    /* renamed from: q */
    fh.c f12009q;

    /* renamed from: x */
    u0 f12010x;

    /* renamed from: y */
    u0 f12011y;

    /* loaded from: classes3.dex */
    public static class b extends gg.t {

        /* renamed from: c */
        gg.d0 f12012c;

        /* renamed from: d */
        v f12013d;

        private b(gg.d0 d0Var) {
            if (d0Var.size() >= 2 && d0Var.size() <= 3) {
                this.f12012c = d0Var;
                return;
            }
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }

        public static b m(Object obj) {
            if (obj instanceof b) {
                return (b) obj;
            }
            if (obj == null) {
                return null;
            }
            return new b(gg.d0.F(obj));
        }

        @Override // gg.t, gg.g
        public gg.a0 b() {
            return this.f12012c;
        }

        public v l() {
            if (this.f12013d == null && this.f12012c.size() == 3) {
                this.f12013d = v.n(this.f12012c.G(2));
            }
            return this.f12013d;
        }

        public u0 n() {
            return u0.m(this.f12012c.G(1));
        }

        public gg.q o() {
            return gg.q.E(this.f12012c.G(0));
        }

        public boolean q() {
            return this.f12012c.size() == 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c implements Enumeration {
        private c() {
            o0.this = r1;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            throw new NoSuchElementException("Empty Enumeration");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class d implements Enumeration {

        /* renamed from: a */
        private final Enumeration f12015a;

        d(Enumeration enumeration) {
            o0.this = r1;
            this.f12015a = enumeration;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f12015a.hasMoreElements();
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            return b.m(this.f12015a.nextElement());
        }
    }

    public o0(gg.d0 d0Var) {
        if (d0Var.size() < 3 || d0Var.size() > 7) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        int i10 = 0;
        if (d0Var.G(0) instanceof gg.q) {
            this.f12007c = gg.q.E(d0Var.G(0));
            i10 = 1;
        } else {
            this.f12007c = null;
        }
        int i11 = i10 + 1;
        this.f12008d = hh.b.n(d0Var.G(i10));
        int i12 = i11 + 1;
        this.f12009q = fh.c.n(d0Var.G(i11));
        int i13 = i12 + 1;
        this.f12010x = u0.m(d0Var.G(i12));
        if (i13 < d0Var.size() && ((d0Var.G(i13) instanceof gg.l0) || (d0Var.G(i13) instanceof gg.m) || (d0Var.G(i13) instanceof u0))) {
            this.f12011y = u0.m(d0Var.G(i13));
            i13++;
        }
        if (i13 < d0Var.size() && !(d0Var.G(i13) instanceof gg.j0)) {
            this.U3 = gg.d0.F(d0Var.G(i13));
            i13++;
        }
        if (i13 >= d0Var.size() || !(d0Var.G(i13) instanceof gg.j0)) {
            return;
        }
        this.V3 = v.n(gg.d0.E((gg.j0) d0Var.G(i13), true));
    }

    public static o0 m(Object obj) {
        if (obj instanceof o0) {
            return (o0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new o0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(7);
        gg.q qVar = this.f12007c;
        if (qVar != null) {
            hVar.a(qVar);
        }
        hVar.a(this.f12008d);
        hVar.a(this.f12009q);
        hVar.a(this.f12010x);
        u0 u0Var = this.f12011y;
        if (u0Var != null) {
            hVar.a(u0Var);
        }
        gg.d0 d0Var = this.U3;
        if (d0Var != null) {
            hVar.a(d0Var);
        }
        v vVar = this.V3;
        if (vVar != null) {
            hVar.a(new a2(0, vVar));
        }
        return new x1(hVar);
    }

    public v l() {
        return this.V3;
    }

    public fh.c n() {
        return this.f12009q;
    }

    public u0 o() {
        return this.f12011y;
    }

    public Enumeration q() {
        gg.d0 d0Var = this.U3;
        return d0Var == null ? new c() : new d(d0Var.H());
    }

    public hh.b r() {
        return this.f12008d;
    }

    public u0 s() {
        return this.f12010x;
    }

    public int u() {
        gg.q qVar = this.f12007c;
        if (qVar == null) {
            return 1;
        }
        return qVar.M() + 1;
    }
}
