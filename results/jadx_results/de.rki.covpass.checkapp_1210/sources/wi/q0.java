package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class q0 extends e.c {

    /* renamed from: j */
    public static final BigInteger f25240j = s0.f25260h;

    /* renamed from: k */
    private static final ti.f[] f25241k = {new s0(ti.d.f22360b)};

    /* renamed from: i */
    protected t0 f25242i = new t0(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25243a;

        /* renamed from: b */
        final /* synthetic */ int[] f25244b;

        a(int i10, int[] iArr) {
            q0.this = r1;
            this.f25243a = i10;
            this.f25244b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return q0.this.i(new s0(iArr), new s0(iArr2), q0.f25241k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] k10 = bj.n.k(17);
            int[] k11 = bj.n.k(17);
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25243a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 17; i14++) {
                    int i15 = k10[i14];
                    int[] iArr = this.f25244b;
                    k10[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    k11[i14] = k11[i14] ^ (iArr[(i11 + 17) + i14] & i13);
                }
                i11 += 34;
            }
            return d(k10, k11);
        }

        @Override // ti.g
        public int b() {
            return this.f25243a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] k10 = bj.n.k(17);
            int[] k11 = bj.n.k(17);
            int i11 = i10 * 17 * 2;
            for (int i12 = 0; i12 < 17; i12++) {
                int i13 = k10[i12];
                int[] iArr = this.f25244b;
                k10[i12] = i13 ^ iArr[i11 + i12];
                k11[i12] = k11[i12] ^ iArr[(i11 + 17) + i12];
            }
            return d(k10, k11);
        }
    }

    public q0() {
        super(f25240j);
        this.f22366b = m(new BigInteger(1, bk.f.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f22367c = m(new BigInteger(1, bk.f.b("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.f22368d = new BigInteger(1, bk.f.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] k10 = bj.n.k(17);
        r0.k(secureRandom, k10);
        return new s0(k10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new q0();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 17 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.n.j(17, ((s0) iVar.n()).f25261g, 0, iArr, i12);
            int i14 = i12 + 17;
            bj.n.j(17, ((s0) iVar.o()).f25261g, 0, iArr, i14);
            i12 = i14 + 17;
        }
        return new a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new t0(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new t0(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new s0(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25240j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25242i;
    }
}
