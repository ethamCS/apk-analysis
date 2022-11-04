package vi;

import bj.h;
import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
import ti.f;
import ti.g;
import ti.i;
/* loaded from: classes3.dex */
public class a extends e.c {

    /* renamed from: j */
    public static final BigInteger f24374j = c.f24382h;

    /* renamed from: k */
    private static final f[] f24375k = {new c(ti.d.f22360b)};

    /* renamed from: i */
    protected d f24376i = new d(this, null, null);

    /* renamed from: vi.a$a */
    /* loaded from: classes3.dex */
    class C0433a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f24377a;

        /* renamed from: b */
        final /* synthetic */ int[] f24378b;

        C0433a(int i10, int[] iArr) {
            a.this = r1;
            this.f24377a = i10;
            this.f24378b = iArr;
        }

        private i d(int[] iArr, int[] iArr2) {
            return a.this.i(new c(iArr), new c(iArr2), a.f24375k);
        }

        @Override // ti.g
        public i a(int i10) {
            int[] i11 = h.i();
            int[] i12 = h.i();
            int i13 = 0;
            for (int i14 = 0; i14 < this.f24377a; i14++) {
                int i15 = ((i14 ^ i10) - 1) >> 31;
                for (int i16 = 0; i16 < 8; i16++) {
                    int i17 = i11[i16];
                    int[] iArr = this.f24378b;
                    i11[i16] = i17 ^ (iArr[i13 + i16] & i15);
                    i12[i16] = i12[i16] ^ (iArr[(i13 + 8) + i16] & i15);
                }
                i13 += 16;
            }
            return d(i11, i12);
        }

        @Override // ti.g
        public int b() {
            return this.f24377a;
        }

        @Override // ti.g
        public i c(int i10) {
            int[] i11 = h.i();
            int[] i12 = h.i();
            int i13 = i10 * 8 * 2;
            for (int i14 = 0; i14 < 8; i14++) {
                int[] iArr = this.f24378b;
                i11[i14] = iArr[i13 + i14];
                i12[i14] = iArr[i13 + 8 + i14];
            }
            return d(i11, i12);
        }
    }

    public a() {
        super(f24374j);
        this.f22366b = m(new BigInteger(1, bk.f.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.f22367c = m(new BigInteger(1, bk.f.b("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.f22368d = new BigInteger(1, bk.f.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public f C(SecureRandom secureRandom) {
        int[] i10 = h.i();
        b.k(secureRandom, i10);
        return new c(i10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected e c() {
        return new a();
    }

    @Override // ti.e
    public g e(i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 8 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i iVar = iVarArr[i10 + i13];
            h.f(((c) iVar.n()).f24383g, 0, iArr, i12);
            int i14 = i12 + 8;
            h.f(((c) iVar.o()).f24383g, 0, iArr, i14);
            i12 = i14 + 8;
        }
        return new C0433a(i11, iArr);
    }

    @Override // ti.e
    public i h(f fVar, f fVar2) {
        return new d(this, fVar, fVar2);
    }

    @Override // ti.e
    public i i(f fVar, f fVar2, f[] fVarArr) {
        return new d(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public f m(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f24374j.bitLength();
    }

    @Override // ti.e
    public i u() {
        return this.f24376i;
    }
}
