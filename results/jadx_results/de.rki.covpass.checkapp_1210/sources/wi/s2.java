package wi;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class s2 extends e.b {

    /* renamed from: k */
    private static final ti.f[] f25267k = {new r2(ti.d.f22360b)};

    /* renamed from: j */
    protected t2 f25268j = new t2(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25269a;

        /* renamed from: b */
        final /* synthetic */ long[] f25270b;

        a(int i10, long[] jArr) {
            s2.this = r1;
            this.f25269a = i10;
            this.f25270b = jArr;
        }

        private ti.i d(long[] jArr, long[] jArr2) {
            return s2.this.i(new r2(jArr), new r2(jArr2), s2.f25267k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            long[] c10 = bj.m.c();
            long[] c11 = bj.m.c();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25269a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 9; i13++) {
                    long j11 = c10[i13];
                    long[] jArr = this.f25270b;
                    c10[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    c11[i13] = c11[i13] ^ (jArr[(i11 + 9) + i13] & j10);
                }
                i11 += 18;
            }
            return d(c10, c11);
        }

        @Override // ti.g
        public int b() {
            return this.f25269a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            long[] c10 = bj.m.c();
            long[] c11 = bj.m.c();
            int i11 = i10 * 9 * 2;
            for (int i12 = 0; i12 < 9; i12++) {
                long[] jArr = this.f25270b;
                c10[i12] = jArr[i11 + i12];
                c11[i12] = jArr[i11 + 9 + i12];
            }
            return d(c10, c11);
        }
    }

    public s2() {
        super(571, 2, 5, 10);
        this.f22366b = m(BigInteger.valueOf(0L));
        this.f22367c = m(BigInteger.valueOf(1L));
        this.f22368d = new BigInteger(1, bk.f.b("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
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
        return new s2();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        long[] jArr = new long[i11 * 9 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.m.a(((r2) iVar.n()).f25253g, 0, jArr, i12);
            int i14 = i12 + 9;
            bj.m.a(((r2) iVar.o()).f25253g, 0, jArr, i14);
            i12 = i14 + 9;
        }
        return new a(i11, jArr);
    }

    @Override // ti.e
    protected ti.h f() {
        return new ti.y();
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new t2(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new t2(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new r2(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return 571;
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25268j;
    }
}
