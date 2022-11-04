package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class e0 extends e.c {

    /* renamed from: j */
    public static final BigInteger f25129j = g0.f25151h;

    /* renamed from: k */
    private static final ti.f[] f25130k = {new g0(ti.d.f22360b)};

    /* renamed from: i */
    protected h0 f25131i = new h0(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25132a;

        /* renamed from: b */
        final /* synthetic */ int[] f25133b;

        a(int i10, int[] iArr) {
            e0.this = r1;
            this.f25132a = i10;
            this.f25133b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return e0.this.i(new g0(iArr), new g0(iArr2), e0.f25130k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] i11 = bj.h.i();
            int[] i12 = bj.h.i();
            int i13 = 0;
            for (int i14 = 0; i14 < this.f25132a; i14++) {
                int i15 = ((i14 ^ i10) - 1) >> 31;
                for (int i16 = 0; i16 < 8; i16++) {
                    int i17 = i11[i16];
                    int[] iArr = this.f25133b;
                    i11[i16] = i17 ^ (iArr[i13 + i16] & i15);
                    i12[i16] = i12[i16] ^ (iArr[(i13 + 8) + i16] & i15);
                }
                i13 += 16;
            }
            return d(i11, i12);
        }

        @Override // ti.g
        public int b() {
            return this.f25132a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] i11 = bj.h.i();
            int[] i12 = bj.h.i();
            int i13 = i10 * 8 * 2;
            for (int i14 = 0; i14 < 8; i14++) {
                int[] iArr = this.f25133b;
                i11[i14] = iArr[i13 + i14];
                i12[i14] = iArr[i13 + 8 + i14];
            }
            return d(i11, i12);
        }
    }

    public e0() {
        super(f25129j);
        this.f22366b = m(ti.d.f22359a);
        this.f22367c = m(BigInteger.valueOf(7L));
        this.f22368d = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] i10 = bj.h.i();
        f0.j(secureRandom, i10);
        return new g0(i10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new e0();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 8 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.h.f(((g0) iVar.n()).f25152g, 0, iArr, i12);
            int i14 = i12 + 8;
            bj.h.f(((g0) iVar.o()).f25152g, 0, iArr, i14);
            i12 = i14 + 8;
        }
        return new a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new h0(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new h0(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new g0(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25129j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25131i;
    }
}
