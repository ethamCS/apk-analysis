package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class e extends e.c {

    /* renamed from: j */
    public static final BigInteger f25123j = m.f25200h;

    /* renamed from: k */
    private static final ti.f[] f25124k = {new m(ti.d.f22360b)};

    /* renamed from: i */
    protected f f25125i = new f(this, null, null);

    /* loaded from: classes3.dex */
    class a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25126a;

        /* renamed from: b */
        final /* synthetic */ int[] f25127b;

        a(int i10, int[] iArr) {
            e.this = r1;
            this.f25126a = i10;
            this.f25127b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return e.this.i(new m(iArr), new m(iArr2), e.f25124k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] d10 = bj.e.d();
            int[] d11 = bj.e.d();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25126a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 5; i14++) {
                    int i15 = d10[i14];
                    int[] iArr = this.f25127b;
                    d10[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    d11[i14] = d11[i14] ^ (iArr[(i11 + 5) + i14] & i13);
                }
                i11 += 10;
            }
            return d(d10, d11);
        }

        @Override // ti.g
        public int b() {
            return this.f25126a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] d10 = bj.e.d();
            int[] d11 = bj.e.d();
            int i11 = i10 * 5 * 2;
            for (int i12 = 0; i12 < 5; i12++) {
                int[] iArr = this.f25127b;
                d10[i12] = iArr[i11 + i12];
                d11[i12] = iArr[i11 + 5 + i12];
            }
            return d(d10, d11);
        }
    }

    public e() {
        super(f25123j);
        this.f22366b = m(ti.d.f22359a);
        this.f22367c = m(BigInteger.valueOf(7L));
        this.f22368d = new BigInteger(1, bk.f.b("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] d10 = bj.e.d();
        l.j(secureRandom, d10);
        return new m(d10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new e();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 5 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.e.c(((m) iVar.n()).f25201g, 0, iArr, i12);
            int i14 = i12 + 5;
            bj.e.c(((m) iVar.o()).f25201g, 0, iArr, i14);
            i12 = i14 + 5;
        }
        return new a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new f(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new f(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new m(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25123j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25125i;
    }
}
