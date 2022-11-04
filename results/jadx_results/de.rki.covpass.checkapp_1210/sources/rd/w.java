package rd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class w extends yd.i implements yd.r {
    private static final w U3;
    public static yd.s<w> V3 = new a();

    /* renamed from: d */
    private final yd.d f21117d;

    /* renamed from: q */
    private List<v> f21118q;

    /* renamed from: x */
    private byte f21119x;

    /* renamed from: y */
    private int f21120y;

    /* loaded from: classes.dex */
    static class a extends yd.b<w> {
        a() {
        }

        /* renamed from: m */
        public w d(yd.e eVar, yd.g gVar) {
            return new w(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.b<w, b> implements yd.r {

        /* renamed from: d */
        private int f21121d;

        /* renamed from: q */
        private List<v> f21122q = Collections.emptyList();

        private b() {
            y();
        }

        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f21121d & 1) != 1) {
                this.f21122q = new ArrayList(this.f21122q);
                this.f21121d |= 1;
            }
        }

        private void y() {
        }

        /* renamed from: A */
        public b m(w wVar) {
            if (wVar == w.I()) {
                return this;
            }
            if (!wVar.f21118q.isEmpty()) {
                if (this.f21122q.isEmpty()) {
                    this.f21122q = wVar.f21118q;
                    this.f21121d &= -2;
                } else {
                    x();
                    this.f21122q.addAll(wVar.f21118q);
                }
            }
            o(l().b(wVar.f21117d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.w.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.w> r1 = rd.w.V3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.w r3 = (rd.w) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                if (r3 == 0) goto Le
                r2.m(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                yd.q r4 = r3.b()     // Catch: java.lang.Throwable -> Lf
                rd.w r4 = (rd.w) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: rd.w.b.s(yd.e, yd.g):rd.w$b");
        }

        /* renamed from: q */
        public w b() {
            w t10 = t();
            if (t10.c()) {
                return t10;
            }
            throw a.AbstractC0456a.d(t10);
        }

        public w t() {
            w wVar = new w(this);
            if ((this.f21121d & 1) == 1) {
                this.f21122q = Collections.unmodifiableList(this.f21122q);
                this.f21121d &= -2;
            }
            wVar.f21118q = this.f21122q;
            return wVar;
        }

        /* renamed from: v */
        public b k() {
            return w().m(t());
        }
    }

    static {
        w wVar = new w(true);
        U3 = wVar;
        wVar.V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private w(yd.e eVar, yd.g gVar) {
        this.f21119x = (byte) -1;
        this.f21120y = -1;
        V();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                if (!(z11 & true)) {
                                    this.f21118q = new ArrayList();
                                    z11 |= true;
                                }
                                this.f21118q.add(eVar.u(v.f21098b4, gVar));
                            } else if (!y(eVar, J, gVar, K)) {
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new yd.k(e10.getMessage()).k(this);
                    }
                } catch (yd.k e11) {
                    throw e11.k(this);
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f21118q = Collections.unmodifiableList(this.f21118q);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f21117d = r10.i();
                    throw th3;
                }
                this.f21117d = r10.i();
                u();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f21118q = Collections.unmodifiableList(this.f21118q);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f21117d = r10.i();
            throw th4;
        }
        this.f21117d = r10.i();
        u();
    }

    private w(i.b bVar) {
        super(bVar);
        this.f21119x = (byte) -1;
        this.f21120y = -1;
        this.f21117d = bVar.l();
    }

    private w(boolean z10) {
        this.f21119x = (byte) -1;
        this.f21120y = -1;
        this.f21117d = yd.d.f26096c;
    }

    public static w I() {
        return U3;
    }

    private void V() {
        this.f21118q = Collections.emptyList();
    }

    public static b W() {
        return b.w();
    }

    public static b b0(w wVar) {
        return W().m(wVar);
    }

    public int M() {
        return this.f21118q.size();
    }

    public List<v> N() {
        return this.f21118q;
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.f21119x;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f21119x = (byte) 1;
        return true;
    }

    /* renamed from: c0 */
    public b h() {
        return W();
    }

    /* renamed from: d0 */
    public b g() {
        return b0(this);
    }

    @Override // yd.q
    public int e() {
        int i10 = this.f21120y;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f21118q.size(); i12++) {
            i11 += yd.f.s(1, this.f21118q.get(i12));
        }
        int size = i11 + this.f21117d.size();
        this.f21120y = size;
        return size;
    }

    @Override // yd.i, yd.q
    public yd.s<w> i() {
        return V3;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        for (int i10 = 0; i10 < this.f21118q.size(); i10++) {
            fVar.d0(1, this.f21118q.get(i10));
        }
        fVar.i0(this.f21117d);
    }
}
