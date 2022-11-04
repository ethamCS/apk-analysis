package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class g extends e.c {

    /* renamed from: j */
    public static final BigInteger f25145j = i.f25163h;

    /* renamed from: k */
    private static final ti.f[] f25146k = {new i(ti.d.f22360b)};

    /* renamed from: i */
    protected j f25147i = new j(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25148a;

        /* renamed from: b */
        final /* synthetic */ int[] f25149b;

        a(int i10, int[] iArr) {
            g.this = r1;
            this.f25148a = i10;
            this.f25149b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return g.this.i(new i(iArr), new i(iArr2), g.f25146k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] d10 = bj.e.d();
            int[] d11 = bj.e.d();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25148a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 5; i14++) {
                    int i15 = d10[i14];
                    int[] iArr = this.f25149b;
                    d10[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    d11[i14] = d11[i14] ^ (iArr[(i11 + 5) + i14] & i13);
                }
                i11 += 10;
            }
            return d(d10, d11);
        }

        @Override // ti.g
        public int b() {
            return this.f25148a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] d10 = bj.e.d();
            int[] d11 = bj.e.d();
            int i11 = i10 * 5 * 2;
            for (int i12 = 0; i12 < 5; i12++) {
                int[] iArr = this.f25149b;
                d10[i12] = iArr[i11 + i12];
                d11[i12] = iArr[i11 + 5 + i12];
            }
            return d(d10, d11);
        }
    }

    public g() {
        super(f25145j);
        this.f22366b = m(new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f22367c = m(new BigInteger(1, bk.f.b("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.f22368d = new BigInteger(1, bk.f.b("0100000000000000000001F4C8F927AED3CA752257"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] d10 = bj.e.d();
        h.j(secureRandom, d10);
        return new i(d10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new g();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 5 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.e.c(((i) iVar.n()).f25164g, 0, iArr, i12);
            int i14 = i12 + 5;
            bj.e.c(((i) iVar.o()).f25164g, 0, iArr, i14);
            i12 = i14 + 5;
        }
        return new a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new j(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new j(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new i(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25145j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25147i;
    }
}
