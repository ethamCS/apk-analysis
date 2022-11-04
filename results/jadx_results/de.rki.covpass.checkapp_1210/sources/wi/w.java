package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class w extends e.c {

    /* renamed from: j */
    public static final BigInteger f25286j = y.f25305h;

    /* renamed from: k */
    private static final ti.f[] f25287k = {new y(ti.d.f22360b)};

    /* renamed from: i */
    protected z f25288i = new z(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25289a;

        /* renamed from: b */
        final /* synthetic */ int[] f25290b;

        a(int i10, int[] iArr) {
            w.this = r1;
            this.f25289a = i10;
            this.f25290b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return w.this.i(new y(iArr), new y(iArr2), w.f25287k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] e10 = bj.g.e();
            int[] e11 = bj.g.e();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25289a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 7; i14++) {
                    int i15 = e10[i14];
                    int[] iArr = this.f25290b;
                    e10[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    e11[i14] = e11[i14] ^ (iArr[(i11 + 7) + i14] & i13);
                }
                i11 += 14;
            }
            return d(e10, e11);
        }

        @Override // ti.g
        public int b() {
            return this.f25289a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] e10 = bj.g.e();
            int[] e11 = bj.g.e();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25289a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 7; i14++) {
                    int i15 = e10[i14];
                    int[] iArr = this.f25290b;
                    e10[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    e11[i14] = e11[i14] ^ (iArr[(i11 + 7) + i14] & i13);
                }
                i11 += 14;
            }
            return d(e10, e11);
        }
    }

    public w() {
        super(f25286j);
        this.f22366b = m(ti.d.f22359a);
        this.f22367c = m(BigInteger.valueOf(5L));
        this.f22368d = new BigInteger(1, bk.f.b("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] e10 = bj.g.e();
        x.j(secureRandom, e10);
        return new y(e10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new w();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 7 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.g.c(((y) iVar.n()).f25307g, 0, iArr, i12);
            int i14 = i12 + 7;
            bj.g.c(((y) iVar.o()).f25307g, 0, iArr, i14);
            i12 = i14 + 7;
        }
        return new a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new z(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new z(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new y(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25286j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25288i;
    }
}
