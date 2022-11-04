package zg;

import gg.a0;
import gg.d0;
import gg.r1;
import gg.t1;
import gg.x1;
import java.math.BigInteger;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class o extends gg.t {

    /* renamed from: y */
    private static final hh.b f26781y = new hh.b(q.I1, r1.f10880d);

    /* renamed from: c */
    private final gg.w f26782c;

    /* renamed from: d */
    private final gg.q f26783d;

    /* renamed from: q */
    private final gg.q f26784q;

    /* renamed from: x */
    private final hh.b f26785x;

    private o(d0 d0Var) {
        Enumeration H = d0Var.H();
        this.f26782c = (gg.w) H.nextElement();
        this.f26783d = (gg.q) H.nextElement();
        if (H.hasMoreElements()) {
            Object nextElement = H.nextElement();
            if (nextElement instanceof gg.q) {
                this.f26784q = gg.q.E(nextElement);
                nextElement = H.hasMoreElements() ? H.nextElement() : null;
            } else {
                this.f26784q = null;
            }
            if (nextElement != null) {
                this.f26785x = hh.b.n(nextElement);
                return;
            }
        } else {
            this.f26784q = null;
        }
        this.f26785x = null;
    }

    public o(byte[] bArr, int i10) {
        this(bArr, i10, 0);
    }

    public o(byte[] bArr, int i10, int i11) {
        this(bArr, i10, i11, null);
    }

    public o(byte[] bArr, int i10, int i11, hh.b bVar) {
        this.f26782c = new t1(ak.a.h(bArr));
        this.f26783d = new gg.q(i10);
        this.f26784q = i11 > 0 ? new gg.q(i11) : null;
        this.f26785x = bVar;
    }

    public static o l(Object obj) {
        if (obj instanceof o) {
            return (o) obj;
        }
        if (obj == null) {
            return null;
        }
        return new o(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(4);
        hVar.a(this.f26782c);
        hVar.a(this.f26783d);
        gg.q qVar = this.f26784q;
        if (qVar != null) {
            hVar.a(qVar);
        }
        hh.b bVar = this.f26785x;
        if (bVar != null && !bVar.equals(f26781y)) {
            hVar.a(this.f26785x);
        }
        return new x1(hVar);
    }

    public BigInteger m() {
        return this.f26783d.G();
    }

    public BigInteger n() {
        gg.q qVar = this.f26784q;
        if (qVar != null) {
            return qVar.G();
        }
        return null;
    }

    public hh.b o() {
        hh.b bVar = this.f26785x;
        return bVar != null ? bVar : f26781y;
    }

    public byte[] q() {
        return this.f26782c.F();
    }

    public boolean r() {
        hh.b bVar = this.f26785x;
        return bVar == null || bVar.equals(f26781y);
    }
}
