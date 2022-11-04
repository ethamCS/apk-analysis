package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class o extends e.c {

    /* renamed from: j */
    public static final BigInteger f25221j = q.f25238h;

    /* renamed from: k */
    private static final ti.f[] f25222k = {new q(ti.d.f22360b)};

    /* renamed from: i */
    protected r f25223i = new r(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25224a;

        /* renamed from: b */
        final /* synthetic */ int[] f25225b;

        a(int i10, int[] iArr) {
            o.this = r1;
            this.f25224a = i10;
            this.f25225b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return o.this.i(new q(iArr), new q(iArr2), o.f25222k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] h10 = bj.f.h();
            int[] h11 = bj.f.h();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25224a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 6; i14++) {
                    int i15 = h10[i14];
                    int[] iArr = this.f25225b;
                    h10[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    h11[i14] = h11[i14] ^ (iArr[(i11 + 6) + i14] & i13);
                }
                i11 += 12;
            }
            return d(h10, h11);
        }

        @Override // ti.g
        public int b() {
            return this.f25224a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] h10 = bj.f.h();
            int[] h11 = bj.f.h();
            int i11 = i10 * 6 * 2;
            for (int i12 = 0; i12 < 6; i12++) {
                int[] iArr = this.f25225b;
                h10[i12] = iArr[i11 + i12];
                h11[i12] = iArr[i11 + 6 + i12];
            }
            return d(h10, h11);
        }
    }

    public o() {
        super(f25221j);
        this.f22366b = m(ti.d.f22359a);
        this.f22367c = m(BigInteger.valueOf(3L));
        this.f22368d = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] h10 = bj.f.h();
        p.j(secureRandom, h10);
        return new q(h10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new o();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 6 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.f.e(((q) iVar.n()).f25239g, 0, iArr, i12);
            int i14 = i12 + 6;
            bj.f.e(((q) iVar.o()).f25239g, 0, iArr, i14);
            i12 = i14 + 6;
        }
        return new a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new r(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new r(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new q(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25221j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25223i;
    }
}
