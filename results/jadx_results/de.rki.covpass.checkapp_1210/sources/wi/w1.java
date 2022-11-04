package wi;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class w1 extends e.b {

    /* renamed from: k */
    private static final ti.f[] f25297k = {new v1(ti.d.f22360b)};

    /* renamed from: j */
    protected x1 f25298j = new x1(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25299a;

        /* renamed from: b */
        final /* synthetic */ long[] f25300b;

        a(int i10, long[] jArr) {
            w1.this = r1;
            this.f25299a = i10;
            this.f25300b = jArr;
        }

        private ti.i d(long[] jArr, long[] jArr2) {
            return w1.this.i(new v1(jArr), new v1(jArr2), w1.f25297k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            long[] j10 = bj.h.j();
            long[] j11 = bj.h.j();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25299a; i12++) {
                long j12 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 4; i13++) {
                    long j13 = j10[i13];
                    long[] jArr = this.f25300b;
                    j10[i13] = j13 ^ (jArr[i11 + i13] & j12);
                    j11[i13] = j11[i13] ^ (jArr[(i11 + 4) + i13] & j12);
                }
                i11 += 8;
            }
            return d(j10, j11);
        }

        @Override // ti.g
        public int b() {
            return this.f25299a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            long[] j10 = bj.h.j();
            long[] j11 = bj.h.j();
            int i11 = i10 * 4 * 2;
            for (int i12 = 0; i12 < 4; i12++) {
                long[] jArr = this.f25300b;
                j10[i12] = jArr[i11 + i12];
                j11[i12] = jArr[i11 + 4 + i12];
            }
            return d(j10, j11);
        }
    }

    public w1() {
        super(233, 74, 0, 0);
        this.f22366b = m(BigInteger.valueOf(0L));
        this.f22367c = m(BigInteger.valueOf(1L));
        this.f22368d = new BigInteger(1, bk.f.b("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.f22369e = BigInteger.valueOf(4L);
        this.f22370f = 6;
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 6;
    }

    @Override // ti.e.b
    public boolean I() {
        return true;
    }

    @Override // ti.e
    protected ti.e c() {
        return new w1();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        long[] jArr = new long[i11 * 4 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.h.g(((v1) iVar.n()).f25285g, 0, jArr, i12);
            int i14 = i12 + 4;
            bj.h.g(((v1) iVar.o()).f25285g, 0, jArr, i14);
            i12 = i14 + 4;
        }
        return new a(i11, jArr);
    }

    @Override // ti.e
    protected ti.h f() {
        return new ti.y();
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new x1(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new x1(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new v1(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return 233;
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25298j;
    }
}
