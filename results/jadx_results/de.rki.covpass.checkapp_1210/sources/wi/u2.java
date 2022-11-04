package wi;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class u2 extends e.b {

    /* renamed from: k */
    private static final ti.f[] f25277k = {new r2(ti.d.f22360b)};

    /* renamed from: l */
    static final r2 f25278l;

    /* renamed from: m */
    static final r2 f25279m;

    /* renamed from: j */
    protected v2 f25280j = new v2(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25281a;

        /* renamed from: b */
        final /* synthetic */ long[] f25282b;

        a(int i10, long[] jArr) {
            u2.this = r1;
            this.f25281a = i10;
            this.f25282b = jArr;
        }

        private ti.i d(long[] jArr, long[] jArr2) {
            return u2.this.i(new r2(jArr), new r2(jArr2), u2.f25277k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            long[] c10 = bj.m.c();
            long[] c11 = bj.m.c();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25281a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 9; i13++) {
                    long j11 = c10[i13];
                    long[] jArr = this.f25282b;
                    c10[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    c11[i13] = c11[i13] ^ (jArr[(i11 + 9) + i13] & j10);
                }
                i11 += 18;
            }
            return d(c10, c11);
        }

        @Override // ti.g
        public int b() {
            return this.f25281a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            long[] c10 = bj.m.c();
            long[] c11 = bj.m.c();
            int i11 = i10 * 9 * 2;
            for (int i12 = 0; i12 < 9; i12++) {
                long[] jArr = this.f25282b;
                c10[i12] = jArr[i11 + i12];
                c11[i12] = jArr[i11 + 9 + i12];
            }
            return d(c10, c11);
        }
    }

    static {
        r2 r2Var = new r2(new BigInteger(1, bk.f.b("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        f25278l = r2Var;
        f25279m = (r2) r2Var.n();
    }

    public u2() {
        super(571, 2, 5, 10);
        this.f22366b = m(BigInteger.valueOf(1L));
        this.f22367c = f25278l;
        this.f22368d = new BigInteger(1, bk.f.b("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
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
        return new u2();
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
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new v2(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new v2(this, fVar, fVar2, fVarArr);
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
        return this.f25280j;
    }
}
