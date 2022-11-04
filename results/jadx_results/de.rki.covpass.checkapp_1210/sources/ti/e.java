package ti;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Random;
import ti.f;
import ti.i;
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a */
    protected aj.a f22365a;

    /* renamed from: b */
    protected ti.f f22366b;

    /* renamed from: c */
    protected ti.f f22367c;

    /* renamed from: d */
    protected BigInteger f22368d;

    /* renamed from: e */
    protected BigInteger f22369e;

    /* renamed from: f */
    protected int f22370f = 0;

    /* renamed from: g */
    protected xi.a f22371g = null;

    /* renamed from: h */
    protected h f22372h = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f22373a;

        /* renamed from: b */
        final /* synthetic */ int f22374b;

        /* renamed from: c */
        final /* synthetic */ byte[] f22375c;

        a(int i10, int i11, byte[] bArr) {
            e.this = r1;
            this.f22373a = i10;
            this.f22374b = i11;
            this.f22375c = bArr;
        }

        private i d(byte[] bArr, byte[] bArr2) {
            e eVar = e.this;
            return eVar.h(eVar.m(new BigInteger(1, bArr)), e.this.m(new BigInteger(1, bArr2)));
        }

        @Override // ti.g
        public i a(int i10) {
            int i11;
            int i12 = this.f22374b;
            byte[] bArr = new byte[i12];
            byte[] bArr2 = new byte[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < this.f22373a; i14++) {
                int i15 = ((i14 ^ i10) - 1) >> 31;
                int i16 = 0;
                while (true) {
                    i11 = this.f22374b;
                    if (i16 < i11) {
                        byte b10 = bArr[i16];
                        byte[] bArr3 = this.f22375c;
                        bArr[i16] = (byte) (b10 ^ (bArr3[i13 + i16] & i15));
                        bArr2[i16] = (byte) ((bArr3[(i11 + i13) + i16] & i15) ^ bArr2[i16]);
                        i16++;
                    }
                }
                i13 += i11 * 2;
            }
            return d(bArr, bArr2);
        }

        @Override // ti.g
        public int b() {
            return this.f22373a;
        }

        @Override // ti.g
        public i c(int i10) {
            int i11 = this.f22374b;
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[i11];
            int i12 = i10 * i11 * 2;
            int i13 = 0;
            while (true) {
                int i14 = this.f22374b;
                if (i13 < i14) {
                    byte[] bArr3 = this.f22375c;
                    bArr[i13] = bArr3[i12 + i13];
                    bArr2[i13] = bArr3[i14 + i12 + i13];
                    i13++;
                } else {
                    return d(bArr, bArr2);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b extends e {

        /* renamed from: i */
        private BigInteger[] f22377i = null;

        public b(int i10, int i11, int i12, int i13) {
            super(F(i10, i11, i12, i13));
        }

        private static aj.a F(int i10, int i11, int i12, int i13) {
            if (i11 != 0) {
                if (i12 == 0) {
                    if (i13 != 0) {
                        throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                    }
                    return aj.b.a(new int[]{0, i11, i10});
                } else if (i12 <= i11) {
                    throw new IllegalArgumentException("k2 must be > k1");
                } else {
                    if (i13 <= i12) {
                        throw new IllegalArgumentException("k3 must be > k2");
                    }
                    return aj.b.a(new int[]{0, i11, i12, i13, i10});
                }
            }
            throw new IllegalArgumentException("k1 must be > 0");
        }

        private static BigInteger H(SecureRandom secureRandom, int i10) {
            BigInteger e10;
            do {
                e10 = ak.b.e(i10, secureRandom);
            } while (e10.signum() <= 0);
            return e10;
        }

        @Override // ti.e
        public ti.f C(SecureRandom secureRandom) {
            int t10 = t();
            return m(H(secureRandom, t10)).j(m(H(secureRandom, t10)));
        }

        public synchronized BigInteger[] G() {
            if (this.f22377i == null) {
                this.f22377i = t.f(this);
            }
            return this.f22377i;
        }

        public boolean I() {
            return this.f22368d != null && this.f22369e != null && this.f22367c.h() && (this.f22366b.i() || this.f22366b.h());
        }

        public ti.f J(ti.f fVar) {
            ti.f fVar2;
            f.a aVar = (f.a) fVar;
            boolean v10 = aVar.v();
            if (!v10 || aVar.w() == 0) {
                int t10 = t();
                if ((t10 & 1) != 0) {
                    ti.f u10 = aVar.u();
                    if (!v10 && !u10.o().a(u10).a(fVar).i()) {
                        return null;
                    }
                    return u10;
                } else if (fVar.i()) {
                    return fVar;
                } else {
                    ti.f m10 = m(ti.d.f22359a);
                    Random random = new Random();
                    do {
                        ti.f m11 = m(new BigInteger(t10, random));
                        ti.f fVar3 = fVar;
                        fVar2 = m10;
                        for (int i10 = 1; i10 < t10; i10++) {
                            ti.f o10 = fVar3.o();
                            fVar2 = fVar2.o().a(o10.j(m11));
                            fVar3 = o10.a(fVar);
                        }
                        if (!fVar3.i()) {
                            return null;
                        }
                    } while (fVar2.o().a(fVar2).i());
                    return fVar2;
                }
            }
            return null;
        }

        @Override // ti.e
        public i g(BigInteger bigInteger, BigInteger bigInteger2) {
            ti.f m10 = m(bigInteger);
            ti.f m11 = m(bigInteger2);
            int q10 = q();
            if (q10 == 5 || q10 == 6) {
                if (!m10.i()) {
                    m11 = m11.d(m10).a(m10);
                } else if (!m11.o().equals(o())) {
                    throw new IllegalArgumentException();
                }
            }
            return h(m10, m11);
        }

        @Override // ti.e
        protected i k(int i10, BigInteger bigInteger) {
            ti.f fVar;
            ti.f m10 = m(bigInteger);
            if (m10.i()) {
                fVar = o().n();
            } else {
                ti.f J = J(m10.o().g().j(o()).a(n()).a(m10));
                if (J != null) {
                    boolean s10 = J.s();
                    boolean z10 = true;
                    if (i10 != 1) {
                        z10 = false;
                    }
                    if (s10 != z10) {
                        J = J.b();
                    }
                    int q10 = q();
                    fVar = (q10 == 5 || q10 == 6) ? J.a(m10) : J.j(m10);
                } else {
                    fVar = null;
                }
            }
            if (fVar != null) {
                return h(m10, fVar);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // ti.e
        public boolean y(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= t();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c extends e {
        public c(BigInteger bigInteger) {
            super(aj.b.b(bigInteger));
        }

        private static BigInteger F(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger e10 = ak.b.e(bigInteger.bitLength(), secureRandom);
                if (e10.signum() > 0 && e10.compareTo(bigInteger) < 0) {
                    return e10;
                }
            }
        }

        @Override // ti.e
        public ti.f C(SecureRandom secureRandom) {
            BigInteger c10 = s().c();
            return m(F(secureRandom, c10)).j(m(F(secureRandom, c10)));
        }

        @Override // ti.e
        protected i k(int i10, BigInteger bigInteger) {
            ti.f m10 = m(bigInteger);
            ti.f n10 = m10.o().a(this.f22366b).j(m10).a(this.f22367c).n();
            if (n10 != null) {
                boolean s10 = n10.s();
                boolean z10 = true;
                if (i10 != 1) {
                    z10 = false;
                }
                if (s10 != z10) {
                    n10 = n10.m();
                }
                return h(m10, n10);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // ti.e
        public boolean y(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(s().c()) < 0;
        }
    }

    /* loaded from: classes3.dex */
    public class d {

        /* renamed from: a */
        protected int f22378a;

        /* renamed from: b */
        protected xi.a f22379b;

        /* renamed from: c */
        protected h f22380c;

        d(int i10, xi.a aVar, h hVar) {
            e.this = r1;
            this.f22378a = i10;
            this.f22379b = aVar;
            this.f22380c = hVar;
        }

        public e a() {
            if (e.this.D(this.f22378a)) {
                e c10 = e.this.c();
                if (c10 == e.this) {
                    throw new IllegalStateException("implementation returned current curve");
                }
                synchronized (c10) {
                    c10.f22370f = this.f22378a;
                    c10.f22371g = this.f22379b;
                    c10.f22372h = this.f22380c;
                }
                return c10;
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        public d b(xi.a aVar) {
            this.f22379b = aVar;
            return this;
        }
    }

    /* renamed from: ti.e$e */
    /* loaded from: classes3.dex */
    public static class C0394e extends b {

        /* renamed from: j */
        private int f22382j;

        /* renamed from: k */
        private int f22383k;

        /* renamed from: l */
        private int f22384l;

        /* renamed from: m */
        private int f22385m;

        /* renamed from: n */
        private i.d f22386n;

        /* renamed from: ti.e$e$a */
        /* loaded from: classes3.dex */
        class a extends ti.a {

            /* renamed from: a */
            final /* synthetic */ int f22387a;

            /* renamed from: b */
            final /* synthetic */ int f22388b;

            /* renamed from: c */
            final /* synthetic */ long[] f22389c;

            /* renamed from: d */
            final /* synthetic */ int[] f22390d;

            a(int i10, int i11, long[] jArr, int[] iArr) {
                C0394e.this = r1;
                this.f22387a = i10;
                this.f22388b = i11;
                this.f22389c = jArr;
                this.f22390d = iArr;
            }

            private i d(long[] jArr, long[] jArr2) {
                return C0394e.this.h(new f.c(C0394e.this.f22382j, this.f22390d, new o(jArr)), new f.c(C0394e.this.f22382j, this.f22390d, new o(jArr2)));
            }

            @Override // ti.g
            public i a(int i10) {
                int i11;
                long[] l10 = bj.n.l(this.f22388b);
                long[] l11 = bj.n.l(this.f22388b);
                int i12 = 0;
                for (int i13 = 0; i13 < this.f22387a; i13++) {
                    long j10 = ((i13 ^ i10) - 1) >> 31;
                    int i14 = 0;
                    while (true) {
                        i11 = this.f22388b;
                        if (i14 < i11) {
                            long j11 = l10[i14];
                            long[] jArr = this.f22389c;
                            l10[i14] = j11 ^ (jArr[i12 + i14] & j10);
                            l11[i14] = l11[i14] ^ (jArr[(i11 + i12) + i14] & j10);
                            i14++;
                        }
                    }
                    i12 += i11 * 2;
                }
                return d(l10, l11);
            }

            @Override // ti.g
            public int b() {
                return this.f22387a;
            }

            @Override // ti.g
            public i c(int i10) {
                long[] l10 = bj.n.l(this.f22388b);
                long[] l11 = bj.n.l(this.f22388b);
                int i11 = i10 * this.f22388b * 2;
                int i12 = 0;
                while (true) {
                    int i13 = this.f22388b;
                    if (i12 < i13) {
                        long[] jArr = this.f22389c;
                        l10[i12] = jArr[i11 + i12];
                        l11[i12] = jArr[i13 + i11 + i12];
                        i12++;
                    } else {
                        return d(l10, l11);
                    }
                }
            }
        }

        public C0394e(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i10, i11, i12, i13, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public C0394e(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i10, i11, i12, i13);
            this.f22382j = i10;
            this.f22383k = i11;
            this.f22384l = i12;
            this.f22385m = i13;
            this.f22368d = bigInteger3;
            this.f22369e = bigInteger4;
            this.f22386n = new i.d(this, null, null);
            this.f22366b = m(bigInteger);
            this.f22367c = m(bigInteger2);
            this.f22370f = 6;
        }

        protected C0394e(int i10, int i11, int i12, int i13, ti.f fVar, ti.f fVar2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i10, i11, i12, i13);
            this.f22382j = i10;
            this.f22383k = i11;
            this.f22384l = i12;
            this.f22385m = i13;
            this.f22368d = bigInteger;
            this.f22369e = bigInteger2;
            this.f22386n = new i.d(this, null, null);
            this.f22366b = fVar;
            this.f22367c = fVar2;
            this.f22370f = 6;
        }

        public C0394e(int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i10, i11, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // ti.e
        public boolean D(int i10) {
            return i10 == 0 || i10 == 1 || i10 == 6;
        }

        public boolean L() {
            return this.f22384l == 0 && this.f22385m == 0;
        }

        @Override // ti.e
        protected e c() {
            return new C0394e(this.f22382j, this.f22383k, this.f22384l, this.f22385m, this.f22366b, this.f22367c, this.f22368d, this.f22369e);
        }

        @Override // ti.e
        public g e(i[] iVarArr, int i10, int i11) {
            int i12 = (this.f22382j + 63) >>> 6;
            int[] iArr = L() ? new int[]{this.f22383k} : new int[]{this.f22383k, this.f22384l, this.f22385m};
            long[] jArr = new long[i11 * i12 * 2];
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                i iVar = iVarArr[i10 + i14];
                ((f.c) iVar.n()).f22398j.k(jArr, i13);
                int i15 = i13 + i12;
                ((f.c) iVar.o()).f22398j.k(jArr, i15);
                i13 = i15 + i12;
            }
            return new a(i11, i12, jArr, iArr);
        }

        @Override // ti.e
        protected h f() {
            return I() ? new y() : super.f();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ti.e
        public i h(ti.f fVar, ti.f fVar2) {
            return new i.d(this, fVar, fVar2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ti.e
        public i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
            return new i.d(this, fVar, fVar2, fVarArr);
        }

        @Override // ti.e
        public ti.f m(BigInteger bigInteger) {
            return new f.c(this.f22382j, this.f22383k, this.f22384l, this.f22385m, bigInteger);
        }

        @Override // ti.e
        public int t() {
            return this.f22382j;
        }

        @Override // ti.e
        public i u() {
            return this.f22386n;
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends c {

        /* renamed from: i */
        BigInteger f22392i;

        /* renamed from: j */
        BigInteger f22393j;

        /* renamed from: k */
        i.e f22394k;

        public f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        public f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f22392i = bigInteger;
            this.f22393j = f.d.u(bigInteger);
            this.f22394k = new i.e(this, null, null);
            this.f22366b = m(bigInteger2);
            this.f22367c = m(bigInteger3);
            this.f22368d = bigInteger4;
            this.f22369e = bigInteger5;
            this.f22370f = 4;
        }

        protected f(BigInteger bigInteger, BigInteger bigInteger2, ti.f fVar, ti.f fVar2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f22392i = bigInteger;
            this.f22393j = bigInteger2;
            this.f22394k = new i.e(this, null, null);
            this.f22366b = fVar;
            this.f22367c = fVar2;
            this.f22368d = bigInteger3;
            this.f22369e = bigInteger4;
            this.f22370f = 4;
        }

        @Override // ti.e
        public boolean D(int i10) {
            return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 4;
        }

        @Override // ti.e
        protected e c() {
            return new f(this.f22392i, this.f22393j, this.f22366b, this.f22367c, this.f22368d, this.f22369e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ti.e
        public i h(ti.f fVar, ti.f fVar2) {
            return new i.e(this, fVar, fVar2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ti.e
        public i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
            return new i.e(this, fVar, fVar2, fVarArr);
        }

        @Override // ti.e
        public ti.f m(BigInteger bigInteger) {
            return new f.d(this.f22392i, this.f22393j, bigInteger);
        }

        @Override // ti.e
        public int t() {
            return this.f22392i.bitLength();
        }

        @Override // ti.e
        public i u() {
            return this.f22394k;
        }

        @Override // ti.e
        public i x(i iVar) {
            int q10;
            return (this == iVar.i() || q() != 2 || iVar.u() || !((q10 = iVar.i().q()) == 2 || q10 == 3 || q10 == 4)) ? super.x(iVar) : new i.e(this, m(iVar.f22404b.t()), m(iVar.f22405c.t()), new ti.f[]{m(iVar.f22406d[0].t())});
        }
    }

    protected e(aj.a aVar) {
        this.f22365a = aVar;
    }

    public void A(i[] iVarArr, int i10, int i11, ti.f fVar) {
        b(iVarArr, i10, i11);
        int q10 = q();
        if (q10 == 0 || q10 == 5) {
            if (fVar != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        ti.f[] fVarArr = new ti.f[i11];
        int[] iArr = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i10 + i13;
            i iVar = iVarArr[i14];
            if (iVar != null && (fVar != null || !iVar.v())) {
                fVarArr[i12] = iVar.s(0);
                iArr[i12] = i14;
                i12++;
            }
        }
        if (i12 == 0) {
            return;
        }
        ti.c.p(fVarArr, 0, i12, fVar);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = iArr[i15];
            iVarArr[i16] = iVarArr[i16].B(fVarArr[i15]);
        }
    }

    public q B(i iVar, String str, p pVar) {
        Hashtable hashtable;
        q a10;
        a(iVar);
        synchronized (iVar) {
            hashtable = iVar.f22407e;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                iVar.f22407e = hashtable;
            }
        }
        synchronized (hashtable) {
            q qVar = (q) hashtable.get(str);
            a10 = pVar.a(qVar);
            if (a10 != qVar) {
                hashtable.put(str, a10);
            }
        }
        return a10;
    }

    public abstract ti.f C(SecureRandom secureRandom);

    public boolean D(int i10) {
        return i10 == 0;
    }

    public i E(BigInteger bigInteger, BigInteger bigInteger2) {
        i g10 = g(bigInteger, bigInteger2);
        if (g10.w()) {
            return g10;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    protected void a(i iVar) {
        if (iVar == null || this != iVar.i()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    protected void b(i[] iVarArr, int i10, int i11) {
        if (iVarArr != null) {
            if (i10 < 0 || i11 < 0 || i10 > iVarArr.length - i11) {
                throw new IllegalArgumentException("invalid range specified for 'points'");
            }
            for (int i12 = 0; i12 < i11; i12++) {
                i iVar = iVarArr[i10 + i12];
                if (iVar != null && this != iVar.i()) {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
            return;
        }
        throw new IllegalArgumentException("'points' cannot be null");
    }

    protected abstract e c();

    public synchronized d d() {
        return new d(this.f22370f, this.f22371g, this.f22372h);
    }

    public g e(i[] iVarArr, int i10, int i11) {
        int t10 = (t() + 7) >>> 3;
        byte[] bArr = new byte[i11 * t10 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i iVar = iVarArr[i10 + i13];
            byte[] byteArray = iVar.n().t().toByteArray();
            byte[] byteArray2 = iVar.o().t().toByteArray();
            int i14 = 1;
            int i15 = byteArray.length > t10 ? 1 : 0;
            int length = byteArray.length - i15;
            if (byteArray2.length <= t10) {
                i14 = 0;
            }
            int length2 = byteArray2.length - i14;
            int i16 = i12 + t10;
            System.arraycopy(byteArray, i15, bArr, i16 - length, length);
            i12 = i16 + t10;
            System.arraycopy(byteArray2, i14, bArr, i12 - length2, length2);
        }
        return new a(i11, t10, bArr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof e) && l((e) obj));
    }

    protected h f() {
        xi.a aVar = this.f22371g;
        return aVar instanceof xi.d ? new n(this, (xi.d) aVar) : new v();
    }

    public i g(BigInteger bigInteger, BigInteger bigInteger2) {
        return h(m(bigInteger), m(bigInteger2));
    }

    public abstract i h(ti.f fVar, ti.f fVar2);

    public int hashCode() {
        return (s().hashCode() ^ ak.g.c(n().t().hashCode(), 8)) ^ ak.g.c(o().t().hashCode(), 16);
    }

    public abstract i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr);

    public i j(byte[] bArr) {
        i iVar;
        int t10 = (t() + 7) / 8;
        boolean z10 = false;
        byte b10 = bArr[0];
        if (b10 != 0) {
            if (b10 == 2 || b10 == 3) {
                if (bArr.length != t10 + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                iVar = k(b10 & 1, ak.b.h(bArr, 1, t10));
                if (!iVar.t(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b10 != 4) {
                if (b10 != 6 && b10 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b10, 16));
                } else if (bArr.length != (t10 * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                } else {
                    BigInteger h10 = ak.b.h(bArr, 1, t10);
                    BigInteger h11 = ak.b.h(bArr, t10 + 1, t10);
                    boolean testBit = h11.testBit(0);
                    if (b10 == 7) {
                        z10 = true;
                    }
                    if (testBit != z10) {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                    iVar = E(h10, h11);
                }
            } else if (bArr.length != (t10 * 2) + 1) {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            } else {
                iVar = E(ak.b.h(bArr, 1, t10), ak.b.h(bArr, t10 + 1, t10));
            }
        } else if (bArr.length != 1) {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        } else {
            iVar = u();
        }
        if (b10 == 0 || !iVar.u()) {
            return iVar;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    protected abstract i k(int i10, BigInteger bigInteger);

    public boolean l(e eVar) {
        return this == eVar || (eVar != null && s().equals(eVar.s()) && n().t().equals(eVar.n().t()) && o().t().equals(eVar.o().t()));
    }

    public abstract ti.f m(BigInteger bigInteger);

    public ti.f n() {
        return this.f22366b;
    }

    public ti.f o() {
        return this.f22367c;
    }

    public BigInteger p() {
        return this.f22369e;
    }

    public int q() {
        return this.f22370f;
    }

    public xi.a r() {
        return this.f22371g;
    }

    public aj.a s() {
        return this.f22365a;
    }

    public abstract int t();

    public abstract i u();

    public h v() {
        if (this.f22372h == null) {
            this.f22372h = f();
        }
        return this.f22372h;
    }

    public BigInteger w() {
        return this.f22368d;
    }

    public i x(i iVar) {
        if (this == iVar.i()) {
            return iVar;
        }
        if (iVar.u()) {
            return u();
        }
        i A = iVar.A();
        return g(A.q().t(), A.r().t());
    }

    public abstract boolean y(BigInteger bigInteger);

    public void z(i[] iVarArr) {
        A(iVarArr, 0, iVarArr.length, null);
    }
}
