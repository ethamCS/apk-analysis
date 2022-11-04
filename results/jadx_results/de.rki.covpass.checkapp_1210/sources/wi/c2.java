package wi;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class c2 extends e.b {

    /* renamed from: k */
    private static final ti.f[] f25118k = {new b2(ti.d.f22360b)};

    /* renamed from: j */
    protected d2 f25119j = new d2(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25120a;

        /* renamed from: b */
        final /* synthetic */ long[] f25121b;

        a(int i10, long[] jArr) {
            c2.this = r1;
            this.f25120a = i10;
            this.f25121b = jArr;
        }

        private ti.i d(long[] jArr, long[] jArr2) {
            return c2.this.i(new b2(jArr), new b2(jArr2), c2.f25118k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            long[] j10 = bj.h.j();
            long[] j11 = bj.h.j();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25120a; i12++) {
                long j12 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 4; i13++) {
                    long j13 = j10[i13];
                    long[] jArr = this.f25121b;
                    j10[i13] = j13 ^ (jArr[i11 + i13] & j12);
                    j11[i13] = j11[i13] ^ (jArr[(i11 + 4) + i13] & j12);
                }
                i11 += 8;
            }
            return d(j10, j11);
        }

        @Override // ti.g
        public int b() {
            return this.f25120a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            long[] j10 = bj.h.j();
            long[] j11 = bj.h.j();
            int i11 = i10 * 4 * 2;
            for (int i12 = 0; i12 < 4; i12++) {
                long[] jArr = this.f25121b;
                j10[i12] = jArr[i11 + i12];
                j11[i12] = jArr[i11 + 4 + i12];
            }
            return d(j10, j11);
        }
    }

    public c2() {
        super(239, 158, 0, 0);
        this.f22366b = m(BigInteger.valueOf(0L));
        this.f22367c = m(BigInteger.valueOf(1L));
        this.f22368d = new BigInteger(1, bk.f.b("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
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
        return new c2();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        long[] jArr = new long[i11 * 4 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.h.g(((b2) iVar.n()).f25108g, 0, jArr, i12);
            int i14 = i12 + 4;
            bj.h.g(((b2) iVar.o()).f25108g, 0, jArr, i14);
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
        return new d2(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new d2(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new b2(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return 239;
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25119j;
    }
}
