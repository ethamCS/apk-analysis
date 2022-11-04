package wi;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class m1 extends e.b {

    /* renamed from: k */
    private static final ti.f[] f25208k = {new h1(ti.d.f22360b)};

    /* renamed from: j */
    protected n1 f25209j = new n1(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25210a;

        /* renamed from: b */
        final /* synthetic */ long[] f25211b;

        a(int i10, long[] jArr) {
            m1.this = r1;
            this.f25210a = i10;
            this.f25211b = jArr;
        }

        private ti.i d(long[] jArr, long[] jArr2) {
            return m1.this.i(new h1(jArr), new h1(jArr2), m1.f25208k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            long[] i11 = bj.f.i();
            long[] i12 = bj.f.i();
            int i13 = 0;
            for (int i14 = 0; i14 < this.f25210a; i14++) {
                long j10 = ((i14 ^ i10) - 1) >> 31;
                for (int i15 = 0; i15 < 3; i15++) {
                    long j11 = i11[i15];
                    long[] jArr = this.f25211b;
                    i11[i15] = j11 ^ (jArr[i13 + i15] & j10);
                    i12[i15] = i12[i15] ^ (jArr[(i13 + 3) + i15] & j10);
                }
                i13 += 6;
            }
            return d(i11, i12);
        }

        @Override // ti.g
        public int b() {
            return this.f25210a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            long[] i11 = bj.f.i();
            long[] i12 = bj.f.i();
            int i13 = i10 * 3 * 2;
            for (int i14 = 0; i14 < 3; i14++) {
                long[] jArr = this.f25211b;
                i11[i14] = jArr[i13 + i14];
                i12[i14] = jArr[i13 + 3 + i14];
            }
            return d(i11, i12);
        }
    }

    public m1() {
        super(163, 3, 6, 7);
        this.f22366b = m(BigInteger.valueOf(1L));
        this.f22367c = m(new BigInteger(1, bk.f.b("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.f22368d = new BigInteger(1, bk.f.b("040000000000000000000292FE77E70C12A4234C33"));
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
        return new m1();
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
        return new n1(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new n1(this, fVar, fVar2, fVarArr);
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
        return this.f25209j;
    }
}
