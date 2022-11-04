package ud;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.conscrypt.BuildConfig;
import rd.l;
import rd.n;
import rd.q;
import rd.s;
import yd.a;
import yd.d;
import yd.f;
import yd.g;
import yd.i;
import yd.j;
import yd.k;
import yd.r;
import yd.z;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final i.f<rd.d, c> f23535a;

    /* renamed from: b */
    public static final i.f<rd.i, c> f23536b;

    /* renamed from: c */
    public static final i.f<rd.i, Integer> f23537c;

    /* renamed from: d */
    public static final i.f<n, d> f23538d;

    /* renamed from: e */
    public static final i.f<n, Integer> f23539e;

    /* renamed from: f */
    public static final i.f<q, List<rd.b>> f23540f;

    /* renamed from: g */
    public static final i.f<q, Boolean> f23541g = i.x(q.z0(), Boolean.FALSE, null, null, 101, z.b.Y3, Boolean.class);

    /* renamed from: h */
    public static final i.f<s, List<rd.b>> f23542h;

    /* renamed from: i */
    public static final i.f<rd.c, Integer> f23543i;

    /* renamed from: j */
    public static final i.f<rd.c, List<n>> f23544j;

    /* renamed from: k */
    public static final i.f<rd.c, Integer> f23545k;

    /* renamed from: l */
    public static final i.f<rd.c, Integer> f23546l;

    /* renamed from: m */
    public static final i.f<l, Integer> f23547m;

    /* renamed from: n */
    public static final i.f<l, List<n>> f23548n;

    /* loaded from: classes.dex */
    public static final class b extends i implements r {
        private static final b W3;
        public static yd.s<b> X3 = new C0410a();
        private byte U3;
        private int V3;

        /* renamed from: d */
        private final yd.d f23549d;

        /* renamed from: q */
        private int f23550q;

        /* renamed from: x */
        private int f23551x;

        /* renamed from: y */
        private int f23552y;

        /* renamed from: ud.a$b$a */
        /* loaded from: classes.dex */
        static class C0410a extends yd.b<b> {
            C0410a() {
            }

            /* renamed from: m */
            public b d(yd.e eVar, g gVar) {
                return new b(eVar, gVar);
            }
        }

        /* renamed from: ud.a$b$b */
        /* loaded from: classes.dex */
        public static final class C0411b extends i.b<b, C0411b> implements r {

            /* renamed from: d */
            private int f23553d;

            /* renamed from: q */
            private int f23554q;

            /* renamed from: x */
            private int f23555x;

            private C0411b() {
                x();
            }

            public static C0411b w() {
                return new C0411b();
            }

            private void x() {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: A */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public ud.a.b.C0411b s(yd.e r3, yd.g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    yd.s<ud.a$b> r1 = ud.a.b.X3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    ud.a$b r3 = (ud.a.b) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                    ud.a$b r4 = (ud.a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: ud.a.b.C0411b.s(yd.e, yd.g):ud.a$b$b");
            }

            public C0411b B(int i10) {
                this.f23553d |= 2;
                this.f23555x = i10;
                return this;
            }

            public C0411b C(int i10) {
                this.f23553d |= 1;
                this.f23554q = i10;
                return this;
            }

            /* renamed from: q */
            public b b() {
                b t10 = t();
                if (t10.c()) {
                    return t10;
                }
                throw a.AbstractC0456a.d(t10);
            }

            public b t() {
                b bVar = new b(this);
                int i10 = this.f23553d;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                bVar.f23551x = this.f23554q;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f23552y = this.f23555x;
                bVar.f23550q = i11;
                return bVar;
            }

            /* renamed from: v */
            public C0411b k() {
                return w().m(t());
            }

            /* renamed from: y */
            public C0411b m(b bVar) {
                if (bVar == b.M()) {
                    return this;
                }
                if (bVar.b0()) {
                    C(bVar.V());
                }
                if (bVar.W()) {
                    B(bVar.N());
                }
                o(l().b(bVar.f23549d));
                return this;
            }
        }

        static {
            b bVar = new b(true);
            W3 = bVar;
            bVar.c0();
        }

        private b(yd.e eVar, g gVar) {
            this.U3 = (byte) -1;
            this.V3 = -1;
            c0();
            d.b r10 = yd.d.r();
            f J = f.J(r10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f23550q |= 1;
                                this.f23551x = eVar.s();
                            } else if (K == 16) {
                                this.f23550q |= 2;
                                this.f23552y = eVar.s();
                            } else if (!y(eVar, J, gVar, K)) {
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.k(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).k(this);
                    }
                } catch (Throwable th2) {
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23549d = r10.i();
                        throw th3;
                    }
                    this.f23549d = r10.i();
                    u();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f23549d = r10.i();
                throw th4;
            }
            this.f23549d = r10.i();
            u();
        }

        private b(i.b bVar) {
            super(bVar);
            this.U3 = (byte) -1;
            this.V3 = -1;
            this.f23549d = bVar.l();
        }

        private b(boolean z10) {
            this.U3 = (byte) -1;
            this.V3 = -1;
            this.f23549d = yd.d.f26096c;
        }

        public static b M() {
            return W3;
        }

        private void c0() {
            this.f23551x = 0;
            this.f23552y = 0;
        }

        public static C0411b d0() {
            return C0411b.w();
        }

        public static C0411b e0(b bVar) {
            return d0().m(bVar);
        }

        public int N() {
            return this.f23552y;
        }

        public int V() {
            return this.f23551x;
        }

        public boolean W() {
            return (this.f23550q & 2) == 2;
        }

        public boolean b0() {
            return (this.f23550q & 1) == 1;
        }

        @Override // yd.r
        public final boolean c() {
            byte b10 = this.U3;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.U3 = (byte) 1;
            return true;
        }

        @Override // yd.q
        public int e() {
            int i10 = this.V3;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            if ((this.f23550q & 1) == 1) {
                i11 = 0 + f.o(1, this.f23551x);
            }
            if ((this.f23550q & 2) == 2) {
                i11 += f.o(2, this.f23552y);
            }
            int size = i11 + this.f23549d.size();
            this.V3 = size;
            return size;
        }

        /* renamed from: f0 */
        public C0411b h() {
            return d0();
        }

        /* renamed from: g0 */
        public C0411b g() {
            return e0(this);
        }

        @Override // yd.i, yd.q
        public yd.s<b> i() {
            return X3;
        }

        @Override // yd.q
        public void j(f fVar) {
            e();
            if ((this.f23550q & 1) == 1) {
                fVar.a0(1, this.f23551x);
            }
            if ((this.f23550q & 2) == 2) {
                fVar.a0(2, this.f23552y);
            }
            fVar.i0(this.f23549d);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends i implements r {
        private static final c W3;
        public static yd.s<c> X3 = new C0412a();
        private byte U3;
        private int V3;

        /* renamed from: d */
        private final yd.d f23556d;

        /* renamed from: q */
        private int f23557q;

        /* renamed from: x */
        private int f23558x;

        /* renamed from: y */
        private int f23559y;

        /* renamed from: ud.a$c$a */
        /* loaded from: classes.dex */
        static class C0412a extends yd.b<c> {
            C0412a() {
            }

            /* renamed from: m */
            public c d(yd.e eVar, g gVar) {
                return new c(eVar, gVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends i.b<c, b> implements r {

            /* renamed from: d */
            private int f23560d;

            /* renamed from: q */
            private int f23561q;

            /* renamed from: x */
            private int f23562x;

            private b() {
                x();
            }

            public static b w() {
                return new b();
            }

            private void x() {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: A */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public ud.a.c.b s(yd.e r3, yd.g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    yd.s<ud.a$c> r1 = ud.a.c.X3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    ud.a$c r3 = (ud.a.c) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                    ud.a$c r4 = (ud.a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: ud.a.c.b.s(yd.e, yd.g):ud.a$c$b");
            }

            public b B(int i10) {
                this.f23560d |= 2;
                this.f23562x = i10;
                return this;
            }

            public b C(int i10) {
                this.f23560d |= 1;
                this.f23561q = i10;
                return this;
            }

            /* renamed from: q */
            public c b() {
                c t10 = t();
                if (t10.c()) {
                    return t10;
                }
                throw a.AbstractC0456a.d(t10);
            }

            public c t() {
                c cVar = new c(this);
                int i10 = this.f23560d;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                cVar.f23558x = this.f23561q;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f23559y = this.f23562x;
                cVar.f23557q = i11;
                return cVar;
            }

            /* renamed from: v */
            public b k() {
                return w().m(t());
            }

            /* renamed from: y */
            public b m(c cVar) {
                if (cVar == c.M()) {
                    return this;
                }
                if (cVar.b0()) {
                    C(cVar.V());
                }
                if (cVar.W()) {
                    B(cVar.N());
                }
                o(l().b(cVar.f23556d));
                return this;
            }
        }

        static {
            c cVar = new c(true);
            W3 = cVar;
            cVar.c0();
        }

        private c(yd.e eVar, g gVar) {
            this.U3 = (byte) -1;
            this.V3 = -1;
            c0();
            d.b r10 = yd.d.r();
            f J = f.J(r10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f23557q |= 1;
                                this.f23558x = eVar.s();
                            } else if (K == 16) {
                                this.f23557q |= 2;
                                this.f23559y = eVar.s();
                            } else if (!y(eVar, J, gVar, K)) {
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.k(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).k(this);
                    }
                } catch (Throwable th2) {
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23556d = r10.i();
                        throw th3;
                    }
                    this.f23556d = r10.i();
                    u();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f23556d = r10.i();
                throw th4;
            }
            this.f23556d = r10.i();
            u();
        }

        private c(i.b bVar) {
            super(bVar);
            this.U3 = (byte) -1;
            this.V3 = -1;
            this.f23556d = bVar.l();
        }

        private c(boolean z10) {
            this.U3 = (byte) -1;
            this.V3 = -1;
            this.f23556d = yd.d.f26096c;
        }

        public static c M() {
            return W3;
        }

        private void c0() {
            this.f23558x = 0;
            this.f23559y = 0;
        }

        public static b d0() {
            return b.w();
        }

        public static b e0(c cVar) {
            return d0().m(cVar);
        }

        public int N() {
            return this.f23559y;
        }

        public int V() {
            return this.f23558x;
        }

        public boolean W() {
            return (this.f23557q & 2) == 2;
        }

        public boolean b0() {
            return (this.f23557q & 1) == 1;
        }

        @Override // yd.r
        public final boolean c() {
            byte b10 = this.U3;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.U3 = (byte) 1;
            return true;
        }

        @Override // yd.q
        public int e() {
            int i10 = this.V3;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            if ((this.f23557q & 1) == 1) {
                i11 = 0 + f.o(1, this.f23558x);
            }
            if ((this.f23557q & 2) == 2) {
                i11 += f.o(2, this.f23559y);
            }
            int size = i11 + this.f23556d.size();
            this.V3 = size;
            return size;
        }

        /* renamed from: f0 */
        public b h() {
            return d0();
        }

        /* renamed from: g0 */
        public b g() {
            return e0(this);
        }

        @Override // yd.i, yd.q
        public yd.s<c> i() {
            return X3;
        }

        @Override // yd.q
        public void j(f fVar) {
            e();
            if ((this.f23557q & 1) == 1) {
                fVar.a0(1, this.f23558x);
            }
            if ((this.f23557q & 2) == 2) {
                fVar.a0(2, this.f23559y);
            }
            fVar.i0(this.f23556d);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends i implements r {
        private static final d Z3;

        /* renamed from: a4 */
        public static yd.s<d> f23563a4 = new C0413a();
        private c U3;
        private c V3;
        private c W3;
        private byte X3;
        private int Y3;

        /* renamed from: d */
        private final yd.d f23564d;

        /* renamed from: q */
        private int f23565q;

        /* renamed from: x */
        private b f23566x;

        /* renamed from: y */
        private c f23567y;

        /* renamed from: ud.a$d$a */
        /* loaded from: classes.dex */
        static class C0413a extends yd.b<d> {
            C0413a() {
            }

            /* renamed from: m */
            public d d(yd.e eVar, g gVar) {
                return new d(eVar, gVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends i.b<d, b> implements r {

            /* renamed from: d */
            private int f23568d;

            /* renamed from: q */
            private b f23569q = b.M();

            /* renamed from: x */
            private c f23570x = c.M();

            /* renamed from: y */
            private c f23571y = c.M();
            private c U3 = c.M();
            private c V3 = c.M();

            private b() {
                x();
            }

            public static b w() {
                return new b();
            }

            private void x() {
            }

            public b A(b bVar) {
                if ((this.f23568d & 1) == 1 && this.f23569q != b.M()) {
                    bVar = b.e0(this.f23569q).m(bVar).t();
                }
                this.f23569q = bVar;
                this.f23568d |= 1;
                return this;
            }

            /* renamed from: B */
            public b m(d dVar) {
                if (dVar == d.W()) {
                    return this;
                }
                if (dVar.h0()) {
                    A(dVar.c0());
                }
                if (dVar.k0()) {
                    F(dVar.f0());
                }
                if (dVar.i0()) {
                    D(dVar.d0());
                }
                if (dVar.j0()) {
                    E(dVar.e0());
                }
                if (dVar.g0()) {
                    y(dVar.b0());
                }
                o(l().b(dVar.f23564d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: C */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public ud.a.d.b s(yd.e r3, yd.g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    yd.s<ud.a$d> r1 = ud.a.d.f23563a4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    ud.a$d r3 = (ud.a.d) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                    ud.a$d r4 = (ud.a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: ud.a.d.b.s(yd.e, yd.g):ud.a$d$b");
            }

            public b D(c cVar) {
                if ((this.f23568d & 4) == 4 && this.f23571y != c.M()) {
                    cVar = c.e0(this.f23571y).m(cVar).t();
                }
                this.f23571y = cVar;
                this.f23568d |= 4;
                return this;
            }

            public b E(c cVar) {
                if ((this.f23568d & 8) == 8 && this.U3 != c.M()) {
                    cVar = c.e0(this.U3).m(cVar).t();
                }
                this.U3 = cVar;
                this.f23568d |= 8;
                return this;
            }

            public b F(c cVar) {
                if ((this.f23568d & 2) == 2 && this.f23570x != c.M()) {
                    cVar = c.e0(this.f23570x).m(cVar).t();
                }
                this.f23570x = cVar;
                this.f23568d |= 2;
                return this;
            }

            /* renamed from: q */
            public d b() {
                d t10 = t();
                if (t10.c()) {
                    return t10;
                }
                throw a.AbstractC0456a.d(t10);
            }

            public d t() {
                d dVar = new d(this);
                int i10 = this.f23568d;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                dVar.f23566x = this.f23569q;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                dVar.f23567y = this.f23570x;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                dVar.U3 = this.f23571y;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                dVar.V3 = this.U3;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                dVar.W3 = this.V3;
                dVar.f23565q = i11;
                return dVar;
            }

            /* renamed from: v */
            public b k() {
                return w().m(t());
            }

            public b y(c cVar) {
                if ((this.f23568d & 16) == 16 && this.V3 != c.M()) {
                    cVar = c.e0(this.V3).m(cVar).t();
                }
                this.V3 = cVar;
                this.f23568d |= 16;
                return this;
            }
        }

        static {
            d dVar = new d(true);
            Z3 = dVar;
            dVar.l0();
        }

        private d(yd.e eVar, g gVar) {
            int i10;
            int i11;
            this.X3 = (byte) -1;
            this.Y3 = -1;
            l0();
            d.b r10 = yd.d.r();
            f J = f.J(r10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            c.b bVar = null;
                            b.C0411b g10 = null;
                            c.b g11 = null;
                            c.b g12 = null;
                            c.b g13 = null;
                            if (K != 10) {
                                if (K == 18) {
                                    i10 = 2;
                                    bVar = (this.f23565q & 2) == 2 ? this.f23567y.g() : bVar;
                                    c cVar = (c) eVar.u(c.X3, gVar);
                                    this.f23567y = cVar;
                                    if (bVar != null) {
                                        bVar.m(cVar);
                                        this.f23567y = bVar.t();
                                    }
                                    i11 = this.f23565q;
                                } else if (K == 26) {
                                    i10 = 4;
                                    g13 = (this.f23565q & 4) == 4 ? this.U3.g() : g13;
                                    c cVar2 = (c) eVar.u(c.X3, gVar);
                                    this.U3 = cVar2;
                                    if (g13 != null) {
                                        g13.m(cVar2);
                                        this.U3 = g13.t();
                                    }
                                    i11 = this.f23565q;
                                } else if (K == 34) {
                                    i10 = 8;
                                    g12 = (this.f23565q & 8) == 8 ? this.V3.g() : g12;
                                    c cVar3 = (c) eVar.u(c.X3, gVar);
                                    this.V3 = cVar3;
                                    if (g12 != null) {
                                        g12.m(cVar3);
                                        this.V3 = g12.t();
                                    }
                                    i11 = this.f23565q;
                                } else if (K == 42) {
                                    i10 = 16;
                                    g11 = (this.f23565q & 16) == 16 ? this.W3.g() : g11;
                                    c cVar4 = (c) eVar.u(c.X3, gVar);
                                    this.W3 = cVar4;
                                    if (g11 != null) {
                                        g11.m(cVar4);
                                        this.W3 = g11.t();
                                    }
                                    i11 = this.f23565q;
                                } else if (!y(eVar, J, gVar, K)) {
                                }
                                this.f23565q = i11 | i10;
                            } else {
                                g10 = (this.f23565q & 1) == 1 ? this.f23566x.g() : g10;
                                b bVar2 = (b) eVar.u(b.X3, gVar);
                                this.f23566x = bVar2;
                                if (g10 != null) {
                                    g10.m(bVar2);
                                    this.f23566x = g10.t();
                                }
                                this.f23565q |= 1;
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f23564d = r10.i();
                            throw th3;
                        }
                        this.f23564d = r10.i();
                        u();
                        throw th2;
                    }
                } catch (k e10) {
                    throw e10.k(this);
                } catch (IOException e11) {
                    throw new k(e11.getMessage()).k(this);
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f23564d = r10.i();
                throw th4;
            }
            this.f23564d = r10.i();
            u();
        }

        private d(i.b bVar) {
            super(bVar);
            this.X3 = (byte) -1;
            this.Y3 = -1;
            this.f23564d = bVar.l();
        }

        private d(boolean z10) {
            this.X3 = (byte) -1;
            this.Y3 = -1;
            this.f23564d = yd.d.f26096c;
        }

        public static d W() {
            return Z3;
        }

        private void l0() {
            this.f23566x = b.M();
            this.f23567y = c.M();
            this.U3 = c.M();
            this.V3 = c.M();
            this.W3 = c.M();
        }

        public static b m0() {
            return b.w();
        }

        public static b n0(d dVar) {
            return m0().m(dVar);
        }

        public c b0() {
            return this.W3;
        }

        @Override // yd.r
        public final boolean c() {
            byte b10 = this.X3;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.X3 = (byte) 1;
            return true;
        }

        public b c0() {
            return this.f23566x;
        }

        public c d0() {
            return this.U3;
        }

        @Override // yd.q
        public int e() {
            int i10 = this.Y3;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            if ((this.f23565q & 1) == 1) {
                i11 = 0 + f.s(1, this.f23566x);
            }
            if ((this.f23565q & 2) == 2) {
                i11 += f.s(2, this.f23567y);
            }
            if ((this.f23565q & 4) == 4) {
                i11 += f.s(3, this.U3);
            }
            if ((this.f23565q & 8) == 8) {
                i11 += f.s(4, this.V3);
            }
            if ((this.f23565q & 16) == 16) {
                i11 += f.s(5, this.W3);
            }
            int size = i11 + this.f23564d.size();
            this.Y3 = size;
            return size;
        }

        public c e0() {
            return this.V3;
        }

        public c f0() {
            return this.f23567y;
        }

        public boolean g0() {
            return (this.f23565q & 16) == 16;
        }

        public boolean h0() {
            return (this.f23565q & 1) == 1;
        }

        @Override // yd.i, yd.q
        public yd.s<d> i() {
            return f23563a4;
        }

        public boolean i0() {
            return (this.f23565q & 4) == 4;
        }

        @Override // yd.q
        public void j(f fVar) {
            e();
            if ((this.f23565q & 1) == 1) {
                fVar.d0(1, this.f23566x);
            }
            if ((this.f23565q & 2) == 2) {
                fVar.d0(2, this.f23567y);
            }
            if ((this.f23565q & 4) == 4) {
                fVar.d0(3, this.U3);
            }
            if ((this.f23565q & 8) == 8) {
                fVar.d0(4, this.V3);
            }
            if ((this.f23565q & 16) == 16) {
                fVar.d0(5, this.W3);
            }
            fVar.i0(this.f23564d);
        }

        public boolean j0() {
            return (this.f23565q & 8) == 8;
        }

        public boolean k0() {
            return (this.f23565q & 2) == 2;
        }

        /* renamed from: o0 */
        public b h() {
            return m0();
        }

        /* renamed from: p0 */
        public b g() {
            return n0(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends i implements r {
        private static final e W3;
        public static yd.s<e> X3 = new C0414a();
        private byte U3;
        private int V3;

        /* renamed from: d */
        private final yd.d f23572d;

        /* renamed from: q */
        private List<c> f23573q;

        /* renamed from: x */
        private List<Integer> f23574x;

        /* renamed from: y */
        private int f23575y;

        /* renamed from: ud.a$e$a */
        /* loaded from: classes.dex */
        static class C0414a extends yd.b<e> {
            C0414a() {
            }

            /* renamed from: m */
            public e d(yd.e eVar, g gVar) {
                return new e(eVar, gVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends i.b<e, b> implements r {

            /* renamed from: d */
            private int f23576d;

            /* renamed from: q */
            private List<c> f23577q = Collections.emptyList();

            /* renamed from: x */
            private List<Integer> f23578x = Collections.emptyList();

            private b() {
                A();
            }

            private void A() {
            }

            public static b w() {
                return new b();
            }

            private void x() {
                if ((this.f23576d & 2) != 2) {
                    this.f23578x = new ArrayList(this.f23578x);
                    this.f23576d |= 2;
                }
            }

            private void y() {
                if ((this.f23576d & 1) != 1) {
                    this.f23577q = new ArrayList(this.f23577q);
                    this.f23576d |= 1;
                }
            }

            /* renamed from: B */
            public b m(e eVar) {
                if (eVar == e.N()) {
                    return this;
                }
                if (!eVar.f23573q.isEmpty()) {
                    if (this.f23577q.isEmpty()) {
                        this.f23577q = eVar.f23573q;
                        this.f23576d &= -2;
                    } else {
                        y();
                        this.f23577q.addAll(eVar.f23573q);
                    }
                }
                if (!eVar.f23574x.isEmpty()) {
                    if (this.f23578x.isEmpty()) {
                        this.f23578x = eVar.f23574x;
                        this.f23576d &= -3;
                    } else {
                        x();
                        this.f23578x.addAll(eVar.f23574x);
                    }
                }
                o(l().b(eVar.f23572d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: C */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public ud.a.e.b s(yd.e r3, yd.g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    yd.s<ud.a$e> r1 = ud.a.e.X3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    ud.a$e r3 = (ud.a.e) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                    ud.a$e r4 = (ud.a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: ud.a.e.b.s(yd.e, yd.g):ud.a$e$b");
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
                if ((this.f23576d & 1) == 1) {
                    this.f23577q = Collections.unmodifiableList(this.f23577q);
                    this.f23576d &= -2;
                }
                eVar.f23573q = this.f23577q;
                if ((this.f23576d & 2) == 2) {
                    this.f23578x = Collections.unmodifiableList(this.f23578x);
                    this.f23576d &= -3;
                }
                eVar.f23574x = this.f23578x;
                return eVar;
            }

            /* renamed from: v */
            public b k() {
                return w().m(t());
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends i implements r {

            /* renamed from: c4 */
            private static final c f23579c4;

            /* renamed from: d4 */
            public static yd.s<c> f23580d4 = new C0415a();
            private Object U3;
            private EnumC0416c V3;
            private List<Integer> W3;
            private int X3;
            private List<Integer> Y3;
            private int Z3;

            /* renamed from: a4 */
            private byte f23581a4;

            /* renamed from: b4 */
            private int f23582b4;

            /* renamed from: d */
            private final yd.d f23583d;

            /* renamed from: q */
            private int f23584q;

            /* renamed from: x */
            private int f23585x;

            /* renamed from: y */
            private int f23586y;

            /* renamed from: ud.a$e$c$a */
            /* loaded from: classes.dex */
            static class C0415a extends yd.b<c> {
                C0415a() {
                }

                /* renamed from: m */
                public c d(yd.e eVar, g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* loaded from: classes.dex */
            public static final class b extends i.b<c, b> implements r {

                /* renamed from: d */
                private int f23587d;

                /* renamed from: x */
                private int f23589x;

                /* renamed from: q */
                private int f23588q = 1;

                /* renamed from: y */
                private Object f23590y = BuildConfig.FLAVOR;
                private EnumC0416c U3 = EnumC0416c.NONE;
                private List<Integer> V3 = Collections.emptyList();
                private List<Integer> W3 = Collections.emptyList();

                private b() {
                    A();
                }

                private void A() {
                }

                public static b w() {
                    return new b();
                }

                private void x() {
                    if ((this.f23587d & 32) != 32) {
                        this.W3 = new ArrayList(this.W3);
                        this.f23587d |= 32;
                    }
                }

                private void y() {
                    if ((this.f23587d & 16) != 16) {
                        this.V3 = new ArrayList(this.V3);
                        this.f23587d |= 16;
                    }
                }

                /* renamed from: B */
                public b m(c cVar) {
                    if (cVar == c.e0()) {
                        return this;
                    }
                    if (cVar.q0()) {
                        F(cVar.h0());
                    }
                    if (cVar.p0()) {
                        E(cVar.g0());
                    }
                    if (cVar.r0()) {
                        this.f23587d |= 4;
                        this.f23590y = cVar.U3;
                    }
                    if (cVar.o0()) {
                        D(cVar.f0());
                    }
                    if (!cVar.W3.isEmpty()) {
                        if (this.V3.isEmpty()) {
                            this.V3 = cVar.W3;
                            this.f23587d &= -17;
                        } else {
                            y();
                            this.V3.addAll(cVar.W3);
                        }
                    }
                    if (!cVar.Y3.isEmpty()) {
                        if (this.W3.isEmpty()) {
                            this.W3 = cVar.Y3;
                            this.f23587d &= -33;
                        } else {
                            x();
                            this.W3.addAll(cVar.Y3);
                        }
                    }
                    o(l().b(cVar.f23583d));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /* renamed from: C */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public ud.a.e.c.b s(yd.e r3, yd.g r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        yd.s<ud.a$e$c> r1 = ud.a.e.c.f23580d4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                        java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                        ud.a$e$c r3 = (ud.a.e.c) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                        ud.a$e$c r4 = (ud.a.e.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: ud.a.e.c.b.s(yd.e, yd.g):ud.a$e$c$b");
                }

                public b D(EnumC0416c enumC0416c) {
                    Objects.requireNonNull(enumC0416c);
                    this.f23587d |= 8;
                    this.U3 = enumC0416c;
                    return this;
                }

                public b E(int i10) {
                    this.f23587d |= 2;
                    this.f23589x = i10;
                    return this;
                }

                public b F(int i10) {
                    this.f23587d |= 1;
                    this.f23588q = i10;
                    return this;
                }

                /* renamed from: q */
                public c b() {
                    c t10 = t();
                    if (t10.c()) {
                        return t10;
                    }
                    throw a.AbstractC0456a.d(t10);
                }

                public c t() {
                    c cVar = new c(this);
                    int i10 = this.f23587d;
                    int i11 = 1;
                    if ((i10 & 1) != 1) {
                        i11 = 0;
                    }
                    cVar.f23585x = this.f23588q;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f23586y = this.f23589x;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.U3 = this.f23590y;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.V3 = this.U3;
                    if ((this.f23587d & 16) == 16) {
                        this.V3 = Collections.unmodifiableList(this.V3);
                        this.f23587d &= -17;
                    }
                    cVar.W3 = this.V3;
                    if ((this.f23587d & 32) == 32) {
                        this.W3 = Collections.unmodifiableList(this.W3);
                        this.f23587d &= -33;
                    }
                    cVar.Y3 = this.W3;
                    cVar.f23584q = i11;
                    return cVar;
                }

                /* renamed from: v */
                public b k() {
                    return w().m(t());
                }
            }

            /* renamed from: ud.a$e$c$c */
            /* loaded from: classes.dex */
            public enum EnumC0416c implements j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                

                /* renamed from: y */
                private static j.b<EnumC0416c> f23594y = new C0417a();

                /* renamed from: c */
                private final int f23595c;

                /* renamed from: ud.a$e$c$c$a */
                /* loaded from: classes.dex */
                static class C0417a implements j.b<EnumC0416c> {
                    C0417a() {
                    }

                    /* renamed from: b */
                    public EnumC0416c a(int i10) {
                        return EnumC0416c.b(i10);
                    }
                }

                EnumC0416c(int i10, int i11) {
                    this.f23595c = i11;
                }

                public static EnumC0416c b(int i10) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            return INTERNAL_TO_CLASS_ID;
                        }
                        if (i10 == 2) {
                            return DESC_TO_CLASS_ID;
                        }
                        return null;
                    }
                    return NONE;
                }

                @Override // yd.j.a
                public final int c() {
                    return this.f23595c;
                }
            }

            static {
                c cVar = new c(true);
                f23579c4 = cVar;
                cVar.s0();
            }

            private c(yd.e eVar, g gVar) {
                List<Integer> list;
                Integer valueOf;
                int j10;
                this.X3 = -1;
                this.Z3 = -1;
                this.f23581a4 = (byte) -1;
                this.f23582b4 = -1;
                s0();
                d.b r10 = yd.d.r();
                f J = f.J(r10, 1);
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f23584q |= 1;
                                    this.f23585x = eVar.s();
                                } else if (K == 16) {
                                    this.f23584q |= 2;
                                    this.f23586y = eVar.s();
                                } else if (K != 24) {
                                    if (K != 32) {
                                        if (K == 34) {
                                            j10 = eVar.j(eVar.A());
                                            if (!(z11 & true) && eVar.e() > 0) {
                                                this.W3 = new ArrayList();
                                                z11 |= true;
                                            }
                                            while (eVar.e() > 0) {
                                                this.W3.add(Integer.valueOf(eVar.s()));
                                            }
                                        } else if (K == 40) {
                                            if (!(z11 & true)) {
                                                this.Y3 = new ArrayList();
                                                z11 |= true;
                                            }
                                            list = this.Y3;
                                            valueOf = Integer.valueOf(eVar.s());
                                        } else if (K == 42) {
                                            j10 = eVar.j(eVar.A());
                                            if (!(z11 & true) && eVar.e() > 0) {
                                                this.Y3 = new ArrayList();
                                                z11 |= true;
                                            }
                                            while (eVar.e() > 0) {
                                                this.Y3.add(Integer.valueOf(eVar.s()));
                                            }
                                        } else if (K == 50) {
                                            yd.d l10 = eVar.l();
                                            this.f23584q |= 4;
                                            this.U3 = l10;
                                        } else if (!y(eVar, J, gVar, K)) {
                                        }
                                        eVar.i(j10);
                                    } else {
                                        if (!(z11 & true)) {
                                            this.W3 = new ArrayList();
                                            z11 |= true;
                                        }
                                        list = this.W3;
                                        valueOf = Integer.valueOf(eVar.s());
                                    }
                                    list.add(valueOf);
                                } else {
                                    int n10 = eVar.n();
                                    EnumC0416c b10 = EnumC0416c.b(n10);
                                    if (b10 == null) {
                                        J.o0(K);
                                        J.o0(n10);
                                    } else {
                                        this.f23584q |= 8;
                                        this.V3 = b10;
                                    }
                                }
                            }
                            z10 = true;
                        } catch (Throwable th2) {
                            if (z11 & true) {
                                this.W3 = Collections.unmodifiableList(this.W3);
                            }
                            if (z11 & true) {
                                this.Y3 = Collections.unmodifiableList(this.Y3);
                            }
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f23583d = r10.i();
                                throw th3;
                            }
                            this.f23583d = r10.i();
                            u();
                            throw th2;
                        }
                    } catch (k e10) {
                        throw e10.k(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).k(this);
                    }
                }
                if (z11 & true) {
                    this.W3 = Collections.unmodifiableList(this.W3);
                }
                if (z11 & true) {
                    this.Y3 = Collections.unmodifiableList(this.Y3);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f23583d = r10.i();
                    throw th4;
                }
                this.f23583d = r10.i();
                u();
            }

            private c(i.b bVar) {
                super(bVar);
                this.X3 = -1;
                this.Z3 = -1;
                this.f23581a4 = (byte) -1;
                this.f23582b4 = -1;
                this.f23583d = bVar.l();
            }

            private c(boolean z10) {
                this.X3 = -1;
                this.Z3 = -1;
                this.f23581a4 = (byte) -1;
                this.f23582b4 = -1;
                this.f23583d = yd.d.f26096c;
            }

            public static c e0() {
                return f23579c4;
            }

            private void s0() {
                this.f23585x = 1;
                this.f23586y = 0;
                this.U3 = BuildConfig.FLAVOR;
                this.V3 = EnumC0416c.NONE;
                this.W3 = Collections.emptyList();
                this.Y3 = Collections.emptyList();
            }

            public static b t0() {
                return b.w();
            }

            public static b u0(c cVar) {
                return t0().m(cVar);
            }

            @Override // yd.r
            public final boolean c() {
                byte b10 = this.f23581a4;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f23581a4 = (byte) 1;
                return true;
            }

            @Override // yd.q
            public int e() {
                int i10 = this.f23582b4;
                if (i10 != -1) {
                    return i10;
                }
                int o10 = (this.f23584q & 1) == 1 ? f.o(1, this.f23585x) + 0 : 0;
                if ((this.f23584q & 2) == 2) {
                    o10 += f.o(2, this.f23586y);
                }
                if ((this.f23584q & 8) == 8) {
                    o10 += f.h(3, this.V3.c());
                }
                int i11 = 0;
                for (int i12 = 0; i12 < this.W3.size(); i12++) {
                    i11 += f.p(this.W3.get(i12).intValue());
                }
                int i13 = o10 + i11;
                if (!n0().isEmpty()) {
                    i13 = i13 + 1 + f.p(i11);
                }
                this.X3 = i11;
                int i14 = 0;
                for (int i15 = 0; i15 < this.Y3.size(); i15++) {
                    i14 += f.p(this.Y3.get(i15).intValue());
                }
                int i16 = i13 + i14;
                if (!j0().isEmpty()) {
                    i16 = i16 + 1 + f.p(i14);
                }
                this.Z3 = i14;
                if ((this.f23584q & 4) == 4) {
                    i16 += f.d(6, l0());
                }
                int size = i16 + this.f23583d.size();
                this.f23582b4 = size;
                return size;
            }

            public EnumC0416c f0() {
                return this.V3;
            }

            public int g0() {
                return this.f23586y;
            }

            public int h0() {
                return this.f23585x;
            }

            @Override // yd.i, yd.q
            public yd.s<c> i() {
                return f23580d4;
            }

            public int i0() {
                return this.Y3.size();
            }

            @Override // yd.q
            public void j(f fVar) {
                e();
                if ((this.f23584q & 1) == 1) {
                    fVar.a0(1, this.f23585x);
                }
                if ((this.f23584q & 2) == 2) {
                    fVar.a0(2, this.f23586y);
                }
                if ((this.f23584q & 8) == 8) {
                    fVar.S(3, this.V3.c());
                }
                if (n0().size() > 0) {
                    fVar.o0(34);
                    fVar.o0(this.X3);
                }
                for (int i10 = 0; i10 < this.W3.size(); i10++) {
                    fVar.b0(this.W3.get(i10).intValue());
                }
                if (j0().size() > 0) {
                    fVar.o0(42);
                    fVar.o0(this.Z3);
                }
                for (int i11 = 0; i11 < this.Y3.size(); i11++) {
                    fVar.b0(this.Y3.get(i11).intValue());
                }
                if ((this.f23584q & 4) == 4) {
                    fVar.O(6, l0());
                }
                fVar.i0(this.f23583d);
            }

            public List<Integer> j0() {
                return this.Y3;
            }

            public String k0() {
                Object obj = this.U3;
                if (obj instanceof String) {
                    return (String) obj;
                }
                yd.d dVar = (yd.d) obj;
                String D = dVar.D();
                if (dVar.n()) {
                    this.U3 = D;
                }
                return D;
            }

            public yd.d l0() {
                Object obj = this.U3;
                if (obj instanceof String) {
                    yd.d f10 = yd.d.f((String) obj);
                    this.U3 = f10;
                    return f10;
                }
                return (yd.d) obj;
            }

            public int m0() {
                return this.W3.size();
            }

            public List<Integer> n0() {
                return this.W3;
            }

            public boolean o0() {
                return (this.f23584q & 8) == 8;
            }

            public boolean p0() {
                return (this.f23584q & 2) == 2;
            }

            public boolean q0() {
                return (this.f23584q & 1) == 1;
            }

            public boolean r0() {
                return (this.f23584q & 4) == 4;
            }

            /* renamed from: v0 */
            public b h() {
                return t0();
            }

            /* renamed from: w0 */
            public b g() {
                return u0(this);
            }
        }

        static {
            e eVar = new e(true);
            W3 = eVar;
            eVar.b0();
        }

        private e(yd.e eVar, g gVar) {
            List list;
            Object u10;
            this.f23575y = -1;
            this.U3 = (byte) -1;
            this.V3 = -1;
            b0();
            d.b r10 = yd.d.r();
            f J = f.J(r10, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                if (!(z11 & true)) {
                                    this.f23573q = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f23573q;
                                u10 = eVar.u(c.f23580d4, gVar);
                            } else if (K == 40) {
                                if (!(z11 & true)) {
                                    this.f23574x = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f23574x;
                                u10 = Integer.valueOf(eVar.s());
                            } else if (K == 42) {
                                int j10 = eVar.j(eVar.A());
                                if (!(z11 & true) && eVar.e() > 0) {
                                    this.f23574x = new ArrayList();
                                    z11 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.f23574x.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j10);
                            } else if (!y(eVar, J, gVar, K)) {
                            }
                            list.add(u10);
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.k(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).k(this);
                    }
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f23573q = Collections.unmodifiableList(this.f23573q);
                    }
                    if (z11 & true) {
                        this.f23574x = Collections.unmodifiableList(this.f23574x);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23572d = r10.i();
                        throw th3;
                    }
                    this.f23572d = r10.i();
                    u();
                    throw th2;
                }
            }
            if (z11 & true) {
                this.f23573q = Collections.unmodifiableList(this.f23573q);
            }
            if (z11 & true) {
                this.f23574x = Collections.unmodifiableList(this.f23574x);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f23572d = r10.i();
                throw th4;
            }
            this.f23572d = r10.i();
            u();
        }

        private e(i.b bVar) {
            super(bVar);
            this.f23575y = -1;
            this.U3 = (byte) -1;
            this.V3 = -1;
            this.f23572d = bVar.l();
        }

        private e(boolean z10) {
            this.f23575y = -1;
            this.U3 = (byte) -1;
            this.V3 = -1;
            this.f23572d = yd.d.f26096c;
        }

        public static e N() {
            return W3;
        }

        private void b0() {
            this.f23573q = Collections.emptyList();
            this.f23574x = Collections.emptyList();
        }

        public static b c0() {
            return b.w();
        }

        public static b d0(e eVar) {
            return c0().m(eVar);
        }

        public static e f0(InputStream inputStream, g gVar) {
            return X3.a(inputStream, gVar);
        }

        public List<Integer> V() {
            return this.f23574x;
        }

        public List<c> W() {
            return this.f23573q;
        }

        @Override // yd.r
        public final boolean c() {
            byte b10 = this.U3;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.U3 = (byte) 1;
            return true;
        }

        @Override // yd.q
        public int e() {
            int i10 = this.V3;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f23573q.size(); i12++) {
                i11 += f.s(1, this.f23573q.get(i12));
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f23574x.size(); i14++) {
                i13 += f.p(this.f23574x.get(i14).intValue());
            }
            int i15 = i11 + i13;
            if (!V().isEmpty()) {
                i15 = i15 + 1 + f.p(i13);
            }
            this.f23575y = i13;
            int size = i15 + this.f23572d.size();
            this.V3 = size;
            return size;
        }

        /* renamed from: e0 */
        public b h() {
            return c0();
        }

        /* renamed from: g0 */
        public b g() {
            return d0(this);
        }

        @Override // yd.i, yd.q
        public yd.s<e> i() {
            return X3;
        }

        @Override // yd.q
        public void j(f fVar) {
            e();
            for (int i10 = 0; i10 < this.f23573q.size(); i10++) {
                fVar.d0(1, this.f23573q.get(i10));
            }
            if (V().size() > 0) {
                fVar.o0(42);
                fVar.o0(this.f23575y);
            }
            for (int i11 = 0; i11 < this.f23574x.size(); i11++) {
                fVar.b0(this.f23574x.get(i11).intValue());
            }
            fVar.i0(this.f23572d);
        }
    }

    static {
        rd.d j02 = rd.d.j0();
        c M = c.M();
        c M2 = c.M();
        z.b bVar = z.b.f26211b4;
        f23535a = i.x(j02, M, M2, null, 100, bVar, c.class);
        f23536b = i.x(rd.i.C0(), c.M(), c.M(), null, 100, bVar, c.class);
        rd.i C0 = rd.i.C0();
        z.b bVar2 = z.b.V3;
        f23537c = i.x(C0, 0, null, null, 101, bVar2, Integer.class);
        f23538d = i.x(n.A0(), d.W(), d.W(), null, 100, bVar, d.class);
        f23539e = i.x(n.A0(), 0, null, null, 101, bVar2, Integer.class);
        f23540f = i.v(q.z0(), rd.b.b0(), null, 100, bVar, false, rd.b.class);
        f23542h = i.v(s.m0(), rd.b.b0(), null, 100, bVar, false, rd.b.class);
        f23543i = i.x(rd.c.a1(), 0, null, null, 101, bVar2, Integer.class);
        f23544j = i.v(rd.c.a1(), n.A0(), null, 102, bVar, false, n.class);
        f23545k = i.x(rd.c.a1(), 0, null, null, 103, bVar2, Integer.class);
        f23546l = i.x(rd.c.a1(), 0, null, null, 104, bVar2, Integer.class);
        f23547m = i.x(l.m0(), 0, null, null, 101, bVar2, Integer.class);
        f23548n = i.v(l.m0(), n.A0(), null, 102, bVar, false, n.class);
    }

    public static void a(g gVar) {
        gVar.a(f23535a);
        gVar.a(f23536b);
        gVar.a(f23537c);
        gVar.a(f23538d);
        gVar.a(f23539e);
        gVar.a(f23540f);
        gVar.a(f23541g);
        gVar.a(f23542h);
        gVar.a(f23543i);
        gVar.a(f23544j);
        gVar.a(f23545k);
        gVar.a(f23546l);
        gVar.a(f23547m);
        gVar.a(f23548n);
    }
}
