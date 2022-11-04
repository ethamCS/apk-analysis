package qh;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class s0 {

    /* renamed from: a */
    private final org.bouncycastle.crypto.r f20155a;

    /* renamed from: b */
    private final b f20156b;

    /* renamed from: c */
    private boolean f20157c;

    /* renamed from: d */
    private zh.b0 f20158d;

    /* renamed from: e */
    private zh.y f20159e;

    /* renamed from: f */
    private int f20160f;

    /* renamed from: g */
    private SecureRandom f20161g;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20162a;

        static {
            int[] iArr = new int[b.values().length];
            f20162a = iArr;
            try {
                iArr[b.C1C3C2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        C1C2C3,
        C1C3C2
    }

    public s0() {
        this(new nh.d0());
    }

    public s0(org.bouncycastle.crypto.r rVar) {
        this(rVar, b.C1C2C3);
    }

    public s0(org.bouncycastle.crypto.r rVar, b bVar) {
        if (bVar != null) {
            this.f20155a = rVar;
            this.f20156b = bVar;
            return;
        }
        throw new IllegalArgumentException("mode cannot be NULL");
    }

    private void a(org.bouncycastle.crypto.r rVar, ti.f fVar) {
        byte[] b10 = ak.b.b(this.f20160f, fVar.t());
        rVar.update(b10, 0, b10.length);
    }

    private byte[] c(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = (this.f20160f * 2) + 1;
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, i10, bArr2, 0, i13);
        ti.i j10 = this.f20159e.a().j(bArr2);
        if (!j10.y(this.f20159e.c()).u()) {
            ti.i A = j10.y(((zh.d0) this.f20158d).c()).A();
            int digestSize = this.f20155a.getDigestSize();
            int i14 = (i11 - i13) - digestSize;
            byte[] bArr3 = new byte[i14];
            b bVar = this.f20156b;
            b bVar2 = b.C1C3C2;
            if (bVar == bVar2) {
                System.arraycopy(bArr, i10 + i13 + digestSize, bArr3, 0, i14);
            } else {
                System.arraycopy(bArr, i10 + i13, bArr3, 0, i14);
            }
            g(this.f20155a, A, bArr3);
            int digestSize2 = this.f20155a.getDigestSize();
            byte[] bArr4 = new byte[digestSize2];
            a(this.f20155a, A.f());
            this.f20155a.update(bArr3, 0, i14);
            a(this.f20155a, A.g());
            this.f20155a.doFinal(bArr4, 0);
            if (this.f20156b == bVar2) {
                i12 = 0;
                for (int i15 = 0; i15 != digestSize2; i15++) {
                    i12 |= bArr4[i15] ^ bArr[(i10 + i13) + i15];
                }
            } else {
                i12 = 0;
                for (int i16 = 0; i16 != digestSize2; i16++) {
                    i12 |= bArr4[i16] ^ bArr[((i10 + i13) + i14) + i16];
                }
            }
            ak.a.y(bArr2, (byte) 0);
            ak.a.y(bArr4, (byte) 0);
            if (i12 == 0) {
                return bArr3;
            }
            ak.a.y(bArr3, (byte) 0);
            throw new org.bouncycastle.crypto.u("invalid cipher text");
        }
        throw new org.bouncycastle.crypto.u("[h]C1 at infinity");
    }

    private byte[] d(byte[] bArr, int i10, int i11) {
        byte[] l10;
        ti.i A;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        ti.h b10 = b();
        do {
            BigInteger h10 = h();
            l10 = b10.a(this.f20159e.b(), h10).A().l(false);
            A = ((zh.e0) this.f20158d).c().y(h10).A();
            g(this.f20155a, A, bArr2);
        } while (i(bArr2, bArr, i10));
        byte[] bArr3 = new byte[this.f20155a.getDigestSize()];
        a(this.f20155a, A.f());
        this.f20155a.update(bArr, i10, i11);
        a(this.f20155a, A.g());
        this.f20155a.doFinal(bArr3, 0);
        return a.f20162a[this.f20156b.ordinal()] != 1 ? ak.a.q(l10, bArr2, bArr3) : ak.a.q(l10, bArr3, bArr2);
    }

    private void g(org.bouncycastle.crypto.r rVar, ti.i iVar, byte[] bArr) {
        ak.i iVar2;
        int digestSize = rVar.getDigestSize();
        byte[] bArr2 = new byte[Math.max(4, digestSize)];
        ak.i iVar3 = null;
        if (rVar instanceof ak.i) {
            a(rVar, iVar.f());
            a(rVar, iVar.g());
            iVar3 = (ak.i) rVar;
            iVar2 = iVar3.a();
        } else {
            iVar2 = null;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            if (iVar3 != null) {
                iVar3.b(iVar2);
            } else {
                a(rVar, iVar.f());
                a(rVar, iVar.g());
            }
            i11++;
            ak.l.f(i11, bArr2, 0);
            rVar.update(bArr2, 0, 4);
            rVar.doFinal(bArr2, 0);
            int min = Math.min(digestSize, bArr.length - i10);
            k(bArr, bArr2, i10, min);
            i10 += min;
        }
    }

    private BigInteger h() {
        int bitLength = this.f20159e.e().bitLength();
        while (true) {
            BigInteger e10 = ak.b.e(bitLength, this.f20161g);
            if (!e10.equals(ak.b.f550a) && e10.compareTo(this.f20159e.e()) < 0) {
                return e10;
            }
        }
    }

    private boolean i(byte[] bArr, byte[] bArr2, int i10) {
        for (int i11 = 0; i11 != bArr.length; i11++) {
            if (bArr[i11] != bArr2[i10 + i11]) {
                return false;
            }
        }
        return true;
    }

    private void k(byte[] bArr, byte[] bArr2, int i10, int i11) {
        for (int i12 = 0; i12 != i11; i12++) {
            int i13 = i10 + i12;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i12]);
        }
    }

    protected ti.h b() {
        return new ti.k();
    }

    public int e(int i10) {
        return (this.f20160f * 2) + 1 + i10 + this.f20155a.getDigestSize();
    }

    public void f(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f20157c = z10;
        if (z10) {
            zh.g1 g1Var = (zh.g1) iVar;
            zh.b0 b0Var = (zh.b0) g1Var.a();
            this.f20158d = b0Var;
            this.f20159e = b0Var.b();
            if (((zh.e0) this.f20158d).c().y(this.f20159e.c()).u()) {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
            this.f20161g = g1Var.b();
        } else {
            zh.b0 b0Var2 = (zh.b0) iVar;
            this.f20158d = b0Var2;
            this.f20159e = b0Var2.b();
        }
        this.f20160f = (this.f20159e.a().t() + 7) / 8;
    }

    public byte[] j(byte[] bArr, int i10, int i11) {
        return this.f20157c ? d(bArr, i10, i11) : c(bArr, i10, i11);
    }
}
