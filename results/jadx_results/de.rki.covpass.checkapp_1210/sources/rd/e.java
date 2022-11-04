package rd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class e extends yd.i implements yd.r {
    private static final e U3;
    public static yd.s<e> V3 = new a();

    /* renamed from: d */
    private final yd.d f20878d;

    /* renamed from: q */
    private List<f> f20879q;

    /* renamed from: x */
    private byte f20880x;

    /* renamed from: y */
    private int f20881y;

    /* loaded from: classes.dex */
    static class a extends yd.b<e> {
        a() {
        }

        /* renamed from: m */
        public e d(yd.e eVar, yd.g gVar) {
            return new e(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.b<e, b> implements yd.r {

        /* renamed from: d */
        private int f20882d;

        /* renamed from: q */
        private List<f> f20883q = Collections.emptyList();

        private b() {
            y();
        }

        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f20882d & 1) != 1) {
                this.f20883q = new ArrayList(this.f20883q);
                this.f20882d |= 1;
            }
        }

        private void y() {
        }

        /* renamed from: A */
        public b m(e eVar) {
            if (eVar == e.I()) {
                return this;
            }
            if (!eVar.f20879q.isEmpty()) {
                if (this.f20883q.isEmpty()) {
                    this.f20883q = eVar.f20879q;
                    this.f20882d &= -2;
                } else {
                    x();
                    this.f20883q.addAll(eVar.f20879q);
                }
            }
            o(l().b(eVar.f20878d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.e.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.e> r1 = rd.e.V3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.e r3 = (rd.e) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.e r4 = (rd.e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.e.b.s(yd.e, yd.g):rd.e$b");
        }

        /* renamed from: q */
        public e b() {
            e t10 = t();
            if (t10.c()) {
                return t10;
            }
            throw a.AbstractC0456a.d(t10);
        }

        public e t() {
            e eVar = new e(this);
            if ((this.f20882d & 1) == 1) {
                this.f20883q = Collections.unmodifiableList(this.f20883q);
                this.f20882d &= -2;
            }
            eVar.f20879q = this.f20883q;
            return eVar;
        }

        /* renamed from: v */
        public b k() {
            return w().m(t());
        }
    }

    static {
        e eVar = new e(true);
        U3 = eVar;
        eVar.V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(yd.e eVar, yd.g gVar) {
        this.f20880x = (byte) -1;
        this.f20881y = -1;
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
                                    this.f20879q = new ArrayList();
                                    z11 |= true;
                                }
                                this.f20879q.add(eVar.u(f.Z3, gVar));
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
                    this.f20879q = Collections.unmodifiableList(this.f20879q);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f20878d = r10.i();
                    throw th3;
                }
                this.f20878d = r10.i();
                u();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f20879q = Collections.unmodifiableList(this.f20879q);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f20878d = r10.i();
            throw th4;
        }
        this.f20878d = r10.i();
        u();
    }

    private e(i.b bVar) {
        super(bVar);
        this.f20880x = (byte) -1;
        this.f20881y = -1;
        this.f20878d = bVar.l();
    }

    private e(boolean z10) {
        this.f20880x = (byte) -1;
        this.f20881y = -1;
        this.f20878d = yd.d.f26096c;
    }

    public static e I() {
        return U3;
    }

    private void V() {
        this.f20879q = Collections.emptyList();
    }

    public static b W() {
        return b.w();
    }

    public static b b0(e eVar) {
        return W().m(eVar);
    }

    public f M(int i10) {
        return this.f20879q.get(i10);
    }

    public int N() {
        return this.f20879q.size();
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.f20880x;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < N(); i10++) {
            if (!M(i10).c()) {
                this.f20880x = (byte) 0;
                return false;
            }
        }
        this.f20880x = (byte) 1;
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
        int i10 = this.f20881y;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f20879q.size(); i12++) {
            i11 += yd.f.s(1, this.f20879q.get(i12));
        }
        int size = i11 + this.f20878d.size();
        this.f20881y = size;
        return size;
    }

    @Override // yd.i, yd.q
    public yd.s<e> i() {
        return V3;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        for (int i10 = 0; i10 < this.f20879q.size(); i10++) {
            fVar.d0(1, this.f20879q.get(i10));
        }
        fVar.i0(this.f20878d);
    }
}
