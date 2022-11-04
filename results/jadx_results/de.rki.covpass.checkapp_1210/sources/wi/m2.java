package wi;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class m2 extends e.b {

    /* renamed from: k */
    private static final ti.f[] f25213k = {new l2(ti.d.f22360b)};

    /* renamed from: j */
    protected n2 f25214j = new n2(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25215a;

        /* renamed from: b */
        final /* synthetic */ long[] f25216b;

        a(int i10, long[] jArr) {
            m2.this = r1;
            this.f25215a = i10;
            this.f25216b = jArr;
        }

        private ti.i d(long[] jArr, long[] jArr2) {
            return m2.this.i(new l2(jArr), new l2(jArr2), m2.f25213k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            long[] c10 = bj.k.c();
            long[] c11 = bj.k.c();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25215a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 7; i13++) {
                    long j11 = c10[i13];
                    long[] jArr = this.f25216b;
                    c10[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    c11[i13] = c11[i13] ^ (jArr[(i11 + 7) + i13] & j10);
                }
                i11 += 14;
            }
            return d(c10, c11);
        }

        @Override // ti.g
        public int b() {
            return this.f25215a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            long[] c10 = bj.k.c();
            long[] c11 = bj.k.c();
            int i11 = i10 * 7 * 2;
            for (int i12 = 0; i12 < 7; i12++) {
                long[] jArr = this.f25216b;
                c10[i12] = jArr[i11 + i12];
                c11[i12] = jArr[i11 + 7 + i12];
            }
            return d(c10, c11);
        }
    }

    public m2() {
        super(409, 87, 0, 0);
        this.f22366b = m(BigInteger.valueOf(0L));
        this.f22367c = m(BigInteger.valueOf(1L));
        this.f22368d = new BigInteger(1, bk.f.b("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
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
        return new m2();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        long[] jArr = new long[i11 * 7 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.k.a(((l2) iVar.n()).f25199g, 0, jArr, i12);
            int i14 = i12 + 7;
            bj.k.a(((l2) iVar.o()).f25199g, 0, jArr, i14);
            i12 = i14 + 7;
        }
        return new a(i11, jArr);
    }

    @Override // ti.e
    protected ti.h f() {
        return new ti.y();
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new n2(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new n2(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new l2(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return 409;
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25214j;
    }
}
