package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class m0 extends e.c {

    /* renamed from: j */
    public static final BigInteger f25202j = o0.f25227h;

    /* renamed from: k */
    private static final ti.f[] f25203k = {new o0(ti.d.f22360b)};

    /* renamed from: i */
    protected p0 f25204i = new p0(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25205a;

        /* renamed from: b */
        final /* synthetic */ int[] f25206b;

        a(int i10, int[] iArr) {
            m0.this = r1;
            this.f25205a = i10;
            this.f25206b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return m0.this.i(new o0(iArr), new o0(iArr2), m0.f25203k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] k10 = bj.n.k(12);
            int[] k11 = bj.n.k(12);
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25205a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 12; i14++) {
                    int i15 = k10[i14];
                    int[] iArr = this.f25206b;
                    k10[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    k11[i14] = k11[i14] ^ (iArr[(i11 + 12) + i14] & i13);
                }
                i11 += 24;
            }
            return d(k10, k11);
        }

        @Override // ti.g
        public int b() {
            return this.f25205a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] k10 = bj.n.k(12);
            int[] k11 = bj.n.k(12);
            int i11 = i10 * 12 * 2;
            for (int i12 = 0; i12 < 12; i12++) {
                int[] iArr = this.f25206b;
                k10[i12] = iArr[i11 + i12];
                k11[i12] = iArr[i11 + 12 + i12];
            }
            return d(k10, k11);
        }
    }

    public m0() {
        super(f25202j);
        this.f22366b = m(new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.f22367c = m(new BigInteger(1, bk.f.b("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.f22368d = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] k10 = bj.n.k(12);
        n0.k(secureRandom, k10);
        return new o0(k10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new m0();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 12 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.n.j(12, ((o0) iVar.n()).f25228g, 0, iArr, i12);
            int i14 = i12 + 12;
            bj.n.j(12, ((o0) iVar.o()).f25228g, 0, iArr, i14);
            i12 = i14 + 12;
        }
        return new a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new p0(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new p0(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new o0(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25202j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25204i;
    }
}
