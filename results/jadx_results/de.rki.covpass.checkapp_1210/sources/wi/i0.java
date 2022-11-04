package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class i0 extends e.c {

    /* renamed from: j */
    public static final BigInteger f25165j = k0.f25189h;

    /* renamed from: k */
    private static final ti.f[] f25166k = {new k0(ti.d.f22360b)};

    /* renamed from: i */
    protected l0 f25167i = new l0(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25168a;

        /* renamed from: b */
        final /* synthetic */ int[] f25169b;

        a(int i10, int[] iArr) {
            i0.this = r1;
            this.f25168a = i10;
            this.f25169b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return i0.this.i(new k0(iArr), new k0(iArr2), i0.f25166k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] i11 = bj.h.i();
            int[] i12 = bj.h.i();
            int i13 = 0;
            for (int i14 = 0; i14 < this.f25168a; i14++) {
                int i15 = ((i14 ^ i10) - 1) >> 31;
                for (int i16 = 0; i16 < 8; i16++) {
                    int i17 = i11[i16];
                    int[] iArr = this.f25169b;
                    i11[i16] = i17 ^ (iArr[i13 + i16] & i15);
                    i12[i16] = i12[i16] ^ (iArr[(i13 + 8) + i16] & i15);
                }
                i13 += 16;
            }
            return d(i11, i12);
        }

        @Override // ti.g
        public int b() {
            return this.f25168a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] i11 = bj.h.i();
            int[] i12 = bj.h.i();
            int i13 = i10 * 8 * 2;
            for (int i14 = 0; i14 < 8; i14++) {
                int[] iArr = this.f25169b;
                i11[i14] = iArr[i13 + i14];
                i12[i14] = iArr[i13 + 8 + i14];
            }
            return d(i11, i12);
        }
    }

    public i0() {
        super(f25165j);
        this.f22366b = m(new BigInteger(1, bk.f.b("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f22367c = m(new BigInteger(1, bk.f.b("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.f22368d = new BigInteger(1, bk.f.b("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] i10 = bj.h.i();
        j0.k(secureRandom, i10);
        return new k0(i10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new i0();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 8 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.h.f(((k0) iVar.n()).f25190g, 0, iArr, i12);
            int i14 = i12 + 8;
            bj.h.f(((k0) iVar.o()).f25190g, 0, iArr, i14);
            i12 = i14 + 8;
        }
        return new a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new l0(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new l0(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new k0(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25165j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25167i;
    }
}
