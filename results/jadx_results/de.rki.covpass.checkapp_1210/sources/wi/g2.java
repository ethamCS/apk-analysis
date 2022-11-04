package wi;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class g2 extends e.b {

    /* renamed from: k */
    private static final ti.f[] f25154k = {new f2(ti.d.f22360b)};

    /* renamed from: j */
    protected h2 f25155j = new h2(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25156a;

        /* renamed from: b */
        final /* synthetic */ long[] f25157b;

        a(int i10, long[] jArr) {
            g2.this = r1;
            this.f25156a = i10;
            this.f25157b = jArr;
        }

        private ti.i d(long[] jArr, long[] jArr2) {
            return g2.this.i(new f2(jArr), new f2(jArr2), g2.f25154k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            long[] c10 = bj.i.c();
            long[] c11 = bj.i.c();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25156a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 5; i13++) {
                    long j11 = c10[i13];
                    long[] jArr = this.f25157b;
                    c10[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    c11[i13] = c11[i13] ^ (jArr[(i11 + 5) + i13] & j10);
                }
                i11 += 10;
            }
            return d(c10, c11);
        }

        @Override // ti.g
        public int b() {
            return this.f25156a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            long[] c10 = bj.i.c();
            long[] c11 = bj.i.c();
            int i11 = i10 * 5 * 2;
            for (int i12 = 0; i12 < 5; i12++) {
                long[] jArr = this.f25157b;
                c10[i12] = jArr[i11 + i12];
                c11[i12] = jArr[i11 + 5 + i12];
            }
            return d(c10, c11);
        }
    }

    public g2() {
        super(283, 5, 7, 12);
        this.f22366b = m(BigInteger.valueOf(0L));
        this.f22367c = m(BigInteger.valueOf(1L));
        this.f22368d = new BigInteger(1, bk.f.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
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
        return new g2();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        long[] jArr = new long[i11 * 5 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.i.a(((f2) iVar.n()).f25144g, 0, jArr, i12);
            int i14 = i12 + 5;
            bj.i.a(((f2) iVar.o()).f25144g, 0, jArr, i14);
            i12 = i14 + 5;
        }
        return new a(i11, jArr);
    }

    @Override // ti.e
    protected ti.h f() {
        return new ti.y();
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new h2(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new h2(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new f2(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return 283;
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25155j;
    }
}
