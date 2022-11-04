package ui;

import bj.h;
import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
import ti.f;
import ti.g;
import ti.i;
/* loaded from: classes3.dex */
public class a extends e.c {

    /* renamed from: k */
    private static final BigInteger f23793k;

    /* renamed from: m */
    private static final f[] f23795m;

    /* renamed from: i */
    protected d f23796i = new d(this, null, null);

    /* renamed from: j */
    public static final BigInteger f23792j = c.f23802h;

    /* renamed from: l */
    private static final BigInteger f23794l = new BigInteger(1, bk.f.b("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));

    /* renamed from: ui.a$a */
    /* loaded from: classes3.dex */
    class C0419a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f23797a;

        /* renamed from: b */
        final /* synthetic */ int[] f23798b;

        C0419a(int i10, int[] iArr) {
            a.this = r1;
            this.f23797a = i10;
            this.f23798b = iArr;
        }

        private i d(int[] iArr, int[] iArr2) {
            return a.this.i(new c(iArr), new c(iArr2), a.f23795m);
        }

        @Override // ti.g
        public i a(int i10) {
            int[] i11 = h.i();
            int[] i12 = h.i();
            int i13 = 0;
            for (int i14 = 0; i14 < this.f23797a; i14++) {
                int i15 = ((i14 ^ i10) - 1) >> 31;
                for (int i16 = 0; i16 < 8; i16++) {
                    int i17 = i11[i16];
                    int[] iArr = this.f23798b;
                    i11[i16] = i17 ^ (iArr[i13 + i16] & i15);
                    i12[i16] = i12[i16] ^ (iArr[(i13 + 8) + i16] & i15);
                }
                i13 += 16;
            }
            return d(i11, i12);
        }

        @Override // ti.g
        public int b() {
            return this.f23797a;
        }

        @Override // ti.g
        public i c(int i10) {
            int[] i11 = h.i();
            int[] i12 = h.i();
            int i13 = i10 * 8 * 2;
            for (int i14 = 0; i14 < 8; i14++) {
                int[] iArr = this.f23798b;
                i11[i14] = iArr[i13 + i14];
                i12[i14] = iArr[i13 + 8 + i14];
            }
            return d(i11, i12);
        }
    }

    static {
        BigInteger bigInteger = new BigInteger(1, bk.f.b("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        f23793k = bigInteger;
        f23795m = new f[]{new c(ti.d.f22360b), new c(bigInteger)};
    }

    public a() {
        super(f23792j);
        this.f22366b = m(f23793k);
        this.f22367c = m(f23794l);
        this.f22368d = new BigInteger(1, bk.f.b("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f22369e = BigInteger.valueOf(8L);
        this.f22370f = 4;
    }

    @Override // ti.e.c, ti.e
    public f C(SecureRandom secureRandom) {
        int[] i10 = h.i();
        b.k(secureRandom, i10);
        return new c(i10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 4;
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
            h.f(((c) iVar.n()).f23804g, 0, iArr, i12);
            int i14 = i12 + 8;
            h.f(((c) iVar.o()).f23804g, 0, iArr, i14);
            i12 = i14 + 8;
        }
        return new C0419a(i11, iArr);
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
        return f23792j.bitLength();
    }

    @Override // ti.e
    public i u() {
        return this.f23796i;
    }
}
