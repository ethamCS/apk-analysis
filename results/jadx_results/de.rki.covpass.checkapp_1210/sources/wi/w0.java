package wi;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class w0 extends e.b {

    /* renamed from: k */
    private static final ti.f[] f25292k = {new v0(ti.d.f22360b)};

    /* renamed from: j */
    protected x0 f25293j = new x0(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25294a;

        /* renamed from: b */
        final /* synthetic */ long[] f25295b;

        a(int i10, long[] jArr) {
            w0.this = r1;
            this.f25294a = i10;
            this.f25295b = jArr;
        }

        private ti.i d(long[] jArr, long[] jArr2) {
            return w0.this.i(new v0(jArr), new v0(jArr2), w0.f25292k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            long[] g10 = bj.d.g();
            long[] g11 = bj.d.g();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25294a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 2; i13++) {
                    long j11 = g10[i13];
                    long[] jArr = this.f25295b;
                    g10[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    g11[i13] = g11[i13] ^ (jArr[(i11 + 2) + i13] & j10);
                }
                i11 += 4;
            }
            return d(g10, g11);
        }

        @Override // ti.g
        public int b() {
            return this.f25294a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            long[] g10 = bj.d.g();
            long[] g11 = bj.d.g();
            int i11 = i10 * 2 * 2;
            for (int i12 = 0; i12 < 2; i12++) {
                long[] jArr = this.f25295b;
                g10[i12] = jArr[i11 + i12];
                g11[i12] = jArr[i11 + 2 + i12];
            }
            return d(g10, g11);
        }
    }

    public w0() {
        super(113, 9, 0, 0);
        this.f22366b = m(new BigInteger(1, bk.f.b("003088250CA6E7C7FE649CE85820F7")));
        this.f22367c = m(new BigInteger(1, bk.f.b("00E8BEE4D3E2260744188BE0E9C723")));
        this.f22368d = new BigInteger(1, bk.f.b("0100000000000000D9CCEC8A39E56F"));
        this.f22369e = BigInteger.valueOf(2L);
        this.f22370f = 6;
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 6;
    }

    @Override // ti.e.b
    public boolean I() {
        return false;
    }

    @Override // ti.e
    protected ti.e c() {
        return new w0();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        long[] jArr = new long[i11 * 2 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.d.d(((v0) iVar.n()).f25284g, 0, jArr, i12);
            int i14 = i12 + 2;
            bj.d.d(((v0) iVar.o()).f25284g, 0, jArr, i14);
            i12 = i14 + 2;
        }
        return new a(i11, jArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new x0(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new x0(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new v0(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return 113;
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25293j;
    }
}
