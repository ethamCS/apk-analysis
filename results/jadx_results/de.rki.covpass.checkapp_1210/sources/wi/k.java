package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class k extends e.c {

    /* renamed from: j */
    public static final BigInteger f25183j = m.f25200h;

    /* renamed from: k */
    private static final ti.f[] f25184k = {new m(ti.d.f22360b)};

    /* renamed from: i */
    protected n f25185i = new n(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25186a;

        /* renamed from: b */
        final /* synthetic */ int[] f25187b;

        a(int i10, int[] iArr) {
            k.this = r1;
            this.f25186a = i10;
            this.f25187b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return k.this.i(new m(iArr), new m(iArr2), k.f25184k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] d10 = bj.e.d();
            int[] d11 = bj.e.d();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25186a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 5; i14++) {
                    int i15 = d10[i14];
                    int[] iArr = this.f25187b;
                    d10[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    d11[i14] = d11[i14] ^ (iArr[(i11 + 5) + i14] & i13);
                }
                i11 += 10;
            }
            return d(d10, d11);
        }

        @Override // ti.g
        public int b() {
            return this.f25186a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] d10 = bj.e.d();
            int[] d11 = bj.e.d();
            int i11 = i10 * 5 * 2;
            for (int i12 = 0; i12 < 5; i12++) {
                int[] iArr = this.f25187b;
                d10[i12] = iArr[i11 + i12];
                d11[i12] = iArr[i11 + 5 + i12];
            }
            return d(d10, d11);
        }
    }

    public k() {
        super(f25183j);
        this.f22366b = m(new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f22367c = m(new BigInteger(1, bk.f.b("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.f22368d = new BigInteger(1, bk.f.b("0100000000000000000000351EE786A818F3A1A16B"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] d10 = bj.e.d();
        l.j(secureRandom, d10);
        return new m(d10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new k();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 5 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.e.c(((m) iVar.n()).f25201g, 0, iArr, i12);
            int i14 = i12 + 5;
            bj.e.c(((m) iVar.o()).f25201g, 0, iArr, i14);
            i12 = i14 + 5;
        }
        return new a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new n(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new n(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new m(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25183j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25185i;
    }
}
