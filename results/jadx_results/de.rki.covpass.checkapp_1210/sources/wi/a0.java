package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class a0 extends e.c {

    /* renamed from: j */
    public static final BigInteger f25094j = c0.f25111h;

    /* renamed from: k */
    private static final ti.f[] f25095k = {new c0(ti.d.f22360b)};

    /* renamed from: i */
    protected d0 f25096i = new d0(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25097a;

        /* renamed from: b */
        final /* synthetic */ int[] f25098b;

        a(int i10, int[] iArr) {
            a0.this = r1;
            this.f25097a = i10;
            this.f25098b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return a0.this.i(new c0(iArr), new c0(iArr2), a0.f25095k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] e10 = bj.g.e();
            int[] e11 = bj.g.e();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25097a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 7; i14++) {
                    int i15 = e10[i14];
                    int[] iArr = this.f25098b;
                    e10[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    e11[i14] = e11[i14] ^ (iArr[(i11 + 7) + i14] & i13);
                }
                i11 += 14;
            }
            return d(e10, e11);
        }

        @Override // ti.g
        public int b() {
            return this.f25097a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] e10 = bj.g.e();
            int[] e11 = bj.g.e();
            int i11 = i10 * 7 * 2;
            for (int i12 = 0; i12 < 7; i12++) {
                int[] iArr = this.f25098b;
                e10[i12] = iArr[i11 + i12];
                e11[i12] = iArr[i11 + 7 + i12];
            }
            return d(e10, e11);
        }
    }

    public a0() {
        super(f25094j);
        this.f22366b = m(new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f22367c = m(new BigInteger(1, bk.f.b("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.f22368d = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] e10 = bj.g.e();
        b0.k(secureRandom, e10);
        return new c0(e10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new a0();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 7 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.g.c(((c0) iVar.n()).f25112g, 0, iArr, i12);
            int i14 = i12 + 7;
            bj.g.c(((c0) iVar.o()).f25112g, 0, iArr, i14);
            i12 = i14 + 7;
        }
        return new a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new d0(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new d0(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new c0(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25094j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25096i;
    }
}
