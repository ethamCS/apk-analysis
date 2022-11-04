package di;

import java.math.BigInteger;
import nh.d0;
import org.bouncycastle.crypto.f0;
import zh.b0;
import zh.e0;
import zh.e1;
import zh.g1;
import zh.y;
/* loaded from: classes3.dex */
public class r implements f0, ti.d {

    /* renamed from: g */
    private final b f9145g;

    /* renamed from: h */
    private final org.bouncycastle.crypto.r f9146h;

    /* renamed from: i */
    private final a f9147i;

    /* renamed from: j */
    private y f9148j;

    /* renamed from: k */
    private ti.i f9149k;

    /* renamed from: l */
    private b0 f9150l;

    /* renamed from: m */
    private byte[] f9151m;

    public r() {
        this(s.f9152a, new d0());
    }

    public r(a aVar, org.bouncycastle.crypto.r rVar) {
        this.f9145g = new q();
        this.f9147i = aVar;
        this.f9146h = rVar;
    }

    public r(org.bouncycastle.crypto.r rVar) {
        this(s.f9152a, rVar);
    }

    private void c(org.bouncycastle.crypto.r rVar, ti.f fVar) {
        byte[] e10 = fVar.e();
        rVar.update(e10, 0, e10.length);
    }

    private void d(org.bouncycastle.crypto.r rVar, byte[] bArr) {
        int length = bArr.length * 8;
        rVar.update((byte) ((length >> 8) & 255));
        rVar.update((byte) (length & 255));
        rVar.update(bArr, 0, bArr.length);
    }

    private byte[] g() {
        byte[] bArr = new byte[this.f9146h.getDigestSize()];
        this.f9146h.doFinal(bArr, 0);
        i();
        return bArr;
    }

    private byte[] h(byte[] bArr) {
        this.f9146h.reset();
        d(this.f9146h, bArr);
        c(this.f9146h, this.f9148j.a().n());
        c(this.f9146h, this.f9148j.a().o());
        c(this.f9146h, this.f9148j.b().f());
        c(this.f9146h, this.f9148j.b().g());
        c(this.f9146h, this.f9149k.f());
        c(this.f9146h, this.f9149k.g());
        byte[] bArr2 = new byte[this.f9146h.getDigestSize()];
        this.f9146h.doFinal(bArr2, 0);
        return bArr2;
    }

    private boolean j(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger e10 = this.f9148j.e();
        BigInteger bigInteger3 = ti.d.f22360b;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(e10) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(e10) >= 0) {
            return false;
        }
        BigInteger e11 = e(e10, g());
        BigInteger mod = bigInteger.add(bigInteger2).mod(e10);
        if (mod.equals(ti.d.f22359a)) {
            return false;
        }
        ti.i A = ti.c.r(this.f9148j.b(), bigInteger2, ((e0) this.f9150l).c(), mod).A();
        if (!A.u()) {
            return e11.add(A.f().t()).mod(e10).equals(bigInteger);
        }
        return false;
    }

    @Override // org.bouncycastle.crypto.f0
    public boolean a(byte[] bArr) {
        try {
            BigInteger[] a10 = this.f9147i.a(this.f9148j.e(), bArr);
            return j(a10[0], a10[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.crypto.f0
    public byte[] b() {
        byte[] g10 = g();
        BigInteger e10 = this.f9148j.e();
        BigInteger e11 = e(e10, g10);
        BigInteger c10 = ((zh.d0) this.f9150l).c();
        ti.h f10 = f();
        while (true) {
            BigInteger a10 = this.f9145g.a();
            BigInteger mod = e11.add(f10.a(this.f9148j.b(), a10).A().f().t()).mod(e10);
            BigInteger bigInteger = ti.d.f22359a;
            if (!mod.equals(bigInteger) && !mod.add(a10).equals(e10)) {
                BigInteger mod2 = ak.b.j(e10, c10.add(ti.d.f22360b)).multiply(a10.subtract(mod.multiply(c10)).mod(e10)).mod(e10);
                if (!mod2.equals(bigInteger)) {
                    try {
                        return this.f9147i.b(this.f9148j.e(), mod, mod2);
                    } catch (Exception e12) {
                        throw new org.bouncycastle.crypto.j("unable to encode signature: " + e12.getMessage(), e12);
                    }
                }
            }
        }
    }

    protected BigInteger e(BigInteger bigInteger, byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    protected ti.h f() {
        return new ti.k();
    }

    public void i() {
        this.f9146h.reset();
        byte[] bArr = this.f9151m;
        if (bArr != null) {
            this.f9146h.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.f0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        byte[] bArr;
        ti.i iVar2;
        if (iVar instanceof e1) {
            e1 e1Var = (e1) iVar;
            org.bouncycastle.crypto.i b10 = e1Var.b();
            byte[] a10 = e1Var.a();
            if (a10.length >= 8192) {
                throw new IllegalArgumentException("SM2 user ID must be less than 2^16 bits long");
            }
            bArr = a10;
            iVar = b10;
        } else {
            bArr = bk.f.b("31323334353637383132333435363738");
        }
        if (z10) {
            if (iVar instanceof g1) {
                g1 g1Var = (g1) iVar;
                b0 b0Var = (b0) g1Var.a();
                this.f9150l = b0Var;
                y b11 = b0Var.b();
                this.f9148j = b11;
                this.f9145g.c(b11.e(), g1Var.b());
            } else {
                b0 b0Var2 = (b0) iVar;
                this.f9150l = b0Var2;
                y b12 = b0Var2.b();
                this.f9148j = b12;
                this.f9145g.c(b12.e(), org.bouncycastle.crypto.l.b());
            }
            iVar2 = f().a(this.f9148j.b(), ((zh.d0) this.f9150l).c()).A();
        } else {
            b0 b0Var3 = (b0) iVar;
            this.f9150l = b0Var3;
            this.f9148j = b0Var3.b();
            iVar2 = ((e0) this.f9150l).c();
        }
        this.f9149k = iVar2;
        byte[] h10 = h(bArr);
        this.f9151m = h10;
        this.f9146h.update(h10, 0, h10.length);
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte b10) {
        this.f9146h.update(b10);
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte[] bArr, int i10, int i11) {
        this.f9146h.update(bArr, i10, i11);
    }
}
