package wi;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class k1 extends e.b {

    /* renamed from: k */
    private static final ti.f[] f25191k = {new h1(ti.d.f22360b)};

    /* renamed from: j */
    protected l1 f25192j = new l1(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25193a;

        /* renamed from: b */
        final /* synthetic */ long[] f25194b;

        a(int i10, long[] jArr) {
            k1.this = r1;
            this.f25193a = i10;
            this.f25194b = jArr;
        }

        private ti.i d(long[] jArr, long[] jArr2) {
            return k1.this.i(new h1(jArr), new h1(jArr2), k1.f25191k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            long[] i11 = bj.f.i();
            long[] i12 = bj.f.i();
            int i13 = 0;
            for (int i14 = 0; i14 < this.f25193a; i14++) {
                long j10 = ((i14 ^ i10) - 1) >> 31;
                for (int i15 = 0; i15 < 3; i15++) {
                    long j11 = i11[i15];
                    long[] jArr = this.f25194b;
                    i11[i15] = j11 ^ (jArr[i13 + i15] & j10);
                    i12[i15] = i12[i15] ^ (jArr[(i13 + 3) + i15] & j10);
                }
                i13 += 6;
            }
            return d(i11, i12);
        }

        @Override // ti.g
        public int b() {
            return this.f25193a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            long[] i11 = bj.f.i();
            long[] i12 = bj.f.i();
            int i13 = i10 * 3 * 2;
            for (int i14 = 0; i14 < 3; i14++) {
                long[] jArr = this.f25194b;
                i11[i14] = jArr[i13 + i14];
                i12[i14] = jArr[i13 + 3 + i14];
            }
            return d(i11, i12);
        }
    }

    public k1() {
        super(163, 3, 6, 7);
        this.f22366b = m(new BigInteger(1, bk.f.b("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.f22367c = m(new BigInteger(1, bk.f.b("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.f22368d = new BigInteger(1, bk.f.b("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
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
        return new k1();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        long[] jArr = new long[i11 * 3 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.f.f(((h1) iVar.n()).f25162g, 0, jArr, i12);
            int i14 = i12 + 3;
            bj.f.f(((h1) iVar.o()).f25162g, 0, jArr, i14);
            i12 = i14 + 3;
        }
        return new a(i11, jArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new l1(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new l1(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new h1(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return 163;
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25192j;
    }
}
