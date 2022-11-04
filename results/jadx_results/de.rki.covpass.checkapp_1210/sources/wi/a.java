package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
import ti.e;
/* loaded from: classes3.dex */
public class a extends e.c {

    /* renamed from: j */
    public static final BigInteger f25088j = c.f25109h;

    /* renamed from: k */
    private static final ti.f[] f25089k = {new c(ti.d.f22360b)};

    /* renamed from: i */
    protected d f25090i = new d(this, null, null);

    /* renamed from: wi.a$a */
    /* loaded from: classes3.dex */
    class C0445a extends ti.a {

        /* renamed from: a */
        final /* synthetic */ int f25091a;

        /* renamed from: b */
        final /* synthetic */ int[] f25092b;

        C0445a(int i10, int[] iArr) {
            a.this = r1;
            this.f25091a = i10;
            this.f25092b = iArr;
        }

        private ti.i d(int[] iArr, int[] iArr2) {
            return a.this.i(new c(iArr), new c(iArr2), a.f25089k);
        }

        @Override // ti.g
        public ti.i a(int i10) {
            int[] f10 = bj.d.f();
            int[] f11 = bj.d.f();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25091a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 4; i14++) {
                    int i15 = f10[i14];
                    int[] iArr = this.f25092b;
                    f10[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    f11[i14] = f11[i14] ^ (iArr[(i11 + 4) + i14] & i13);
                }
                i11 += 8;
            }
            return d(f10, f11);
        }

        @Override // ti.g
        public int b() {
            return this.f25091a;
        }

        @Override // ti.g
        public ti.i c(int i10) {
            int[] f10 = bj.d.f();
            int[] f11 = bj.d.f();
            int i11 = i10 * 4 * 2;
            for (int i12 = 0; i12 < 4; i12++) {
                int[] iArr = this.f25092b;
                f10[i12] = iArr[i11 + i12];
                f11[i12] = iArr[i11 + 4 + i12];
            }
            return d(f10, f11);
        }
    }

    public a() {
        super(f25088j);
        this.f22366b = m(new BigInteger(1, bk.f.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f22367c = m(new BigInteger(1, bk.f.b("E87579C11079F43DD824993C2CEE5ED3")));
        this.f22368d = new BigInteger(1, bk.f.b("FFFFFFFE0000000075A30D1B9038A115"));
        this.f22369e = BigInteger.valueOf(1L);
        this.f22370f = 2;
    }

    @Override // ti.e.c, ti.e
    public ti.f C(SecureRandom secureRandom) {
        int[] f10 = bj.d.f();
        b.k(secureRandom, f10);
        return new c(f10);
    }

    @Override // ti.e
    public boolean D(int i10) {
        return i10 == 2;
    }

    @Override // ti.e
    protected ti.e c() {
        return new a();
    }

    @Override // ti.e
    public ti.g e(ti.i[] iVarArr, int i10, int i11) {
        int[] iArr = new int[i11 * 4 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ti.i iVar = iVarArr[i10 + i13];
            bj.d.c(((c) iVar.n()).f25110g, 0, iArr, i12);
            int i14 = i12 + 4;
            bj.d.c(((c) iVar.o()).f25110g, 0, iArr, i14);
            i12 = i14 + 4;
        }
        return new C0445a(i11, iArr);
    }

    @Override // ti.e
    public ti.i h(ti.f fVar, ti.f fVar2) {
        return new d(this, fVar, fVar2);
    }

    @Override // ti.e
    public ti.i i(ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        return new d(this, fVar, fVar2, fVarArr);
    }

    @Override // ti.e
    public ti.f m(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    @Override // ti.e
    public int t() {
        return f25088j.bitLength();
    }

    @Override // ti.e
    public ti.i u() {
        return this.f25090i;
    }
}
