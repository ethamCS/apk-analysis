package wi;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class s1 extends e.b {

    /* renamed from: k */
    private static final ti.f[] f25262k = {new p1(ti.d.f22360b)};

    /* renamed from: j */
    protected t1 f25263j = new t1(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25264a;

        /* renamed from: b */
        final /* synthetic */ long[] f25265b;

        a(int i10, long[] jArr) {
            s1.this = r1;
            this.f25264a = i10;
            this.f25265b = jArr;
        }

        private ti.i d(long[] jArr, long[] jArr2) {
            return s1.this.i(new p1(jArr), new p1(jArr2), s1.f25262k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            long[] j10 = bj.h.j();
            long[] j11 = bj.h.j();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25264a; i12++) {
                long j12 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 4; i13++) {
                    long j13 = j10[i13];
                    long[] jArr = this.f25265b;
                    j10[i13] = j13 ^ (jArr[i11 + i13] & j12);
                    j11[i13] = j11[i13] ^ (jArr[(i11 + 4) + i13] & j12);
                }
                i11 += 8;
            }
            return d(j10, j11);
        }

        @Override // ti.g
        public int b() {
            return this.f25264a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            long[] j10 = bj.h.j();
            long[] j11 = bj.h.j();
            int i11 = i10 * 4 * 2;
            for (int i12 = 0; i12 < 4; i12++) {
                long j12 = j10[i12];
                long[] jArr = this.f25265b;
                j10[i12] = j12 ^ jArr[i11 + i12];
                j11[i12] = j11[i12] ^ jArr[(i11 + 4) + i12];
            }
            return d(j10, j11);
        }
    }

    public s1() {
        super(193, 15, 0, 0);
        this.f22366b = m(new BigInteger(1, bk.f.b("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.f22367c = m(new BigInteger(1, bk.f.b("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.f22368d = new BigInteger(1, bk.f.b("010000000000000000000000015AAB561B005413CCD4EE99D5"));
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
        return new s1();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        long[] jArr = new long[i11 * 4 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.h.g(((p1) iVar.n()).f25237g, 0, jArr, i12);
            int i14 = i12 + 4;
            bj.h.g(((p1) iVar.o()).f25237g, 0, jArr, i14);
            i12 = i14 + 4;
        }
        return new a(i11, jArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new t1(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new t1(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new p1(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return 193;
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25263j;
    }
}
