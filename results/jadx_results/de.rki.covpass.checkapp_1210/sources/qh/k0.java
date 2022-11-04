package qh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class k0 implements org.bouncycastle.crypto.i0 {

    /* renamed from: a */
    private vh.c f20059a;

    /* renamed from: b */
    private zh.f1 f20060b;

    /* renamed from: c */
    private boolean f20061c;

    /* renamed from: d */
    private SecureRandom f20062d;

    public k0(org.bouncycastle.crypto.e eVar) {
        this.f20059a = new vh.c(eVar);
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] a(byte[] bArr, int i10, int i11) {
        if (!this.f20061c) {
            int b10 = this.f20059a.b();
            if (i11 < b10 * 2) {
                throw new org.bouncycastle.crypto.u("input too short");
            }
            byte[] bArr2 = new byte[i11];
            byte[] bArr3 = new byte[b10];
            boolean z10 = false;
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            System.arraycopy(bArr, i10, bArr3, 0, b10);
            this.f20059a.init(false, new zh.f1(this.f20060b.b(), bArr3));
            for (int i12 = b10; i12 < i11; i12 += b10) {
                this.f20059a.a(bArr2, i12, bArr2, i12);
            }
            System.arraycopy(bArr2, i11 - b10, bArr3, 0, b10);
            this.f20059a.init(false, new zh.f1(this.f20060b.b(), bArr3));
            this.f20059a.a(bArr2, 0, bArr2, 0);
            this.f20059a.init(false, this.f20060b);
            for (int i13 = 0; i13 < i11; i13 += b10) {
                this.f20059a.a(bArr2, i13, bArr2, i13);
            }
            int i14 = i11 - 4;
            boolean z11 = (bArr2[0] & 255) > i14;
            if (!z11) {
                i14 = bArr2[0] & 255;
            }
            byte[] bArr4 = new byte[i14];
            System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
            int i15 = 0;
            int i16 = 0;
            while (i15 != 3) {
                int i17 = i15 + 1;
                i16 |= bArr2[i15 + 4] ^ ((byte) (~bArr2[i17]));
                i15 = i17;
            }
            ak.a.g(bArr2);
            if (i16 != 0) {
                z10 = true;
            }
            if (z11 || z10) {
                throw new org.bouncycastle.crypto.u("wrapped key corrupted");
            }
            return bArr4;
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] b(byte[] bArr, int i10, int i11) {
        if (this.f20061c) {
            if (i11 > 255 || i11 < 0) {
                throw new IllegalArgumentException("input must be from 0 to 255 bytes");
            }
            this.f20059a.init(true, this.f20060b);
            int b10 = this.f20059a.b();
            int i12 = i11 + 4;
            int i13 = b10 * 2;
            if (i12 >= i13) {
                i13 = i12 % b10 == 0 ? i12 : ((i12 / b10) + 1) * b10;
            }
            byte[] bArr2 = new byte[i13];
            bArr2[0] = (byte) i11;
            System.arraycopy(bArr, i10, bArr2, 4, i11);
            int length = bArr2.length - i12;
            byte[] bArr3 = new byte[length];
            this.f20062d.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i12, length);
            bArr2[1] = (byte) (~bArr2[4]);
            bArr2[2] = (byte) (~bArr2[5]);
            bArr2[3] = (byte) (~bArr2[6]);
            for (int i14 = 0; i14 < bArr2.length; i14 += b10) {
                this.f20059a.a(bArr2, i14, bArr2, i14);
            }
            for (int i15 = 0; i15 < bArr2.length; i15 += b10) {
                this.f20059a.a(bArr2, i15, bArr2, i15);
            }
            return bArr2;
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public String getAlgorithmName() {
        return this.f20059a.e().getAlgorithmName() + "/RFC3211Wrap";
    }

    @Override // org.bouncycastle.crypto.i0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f20061c = z10;
        if (iVar instanceof zh.g1) {
            zh.g1 g1Var = (zh.g1) iVar;
            this.f20062d = g1Var.b();
            if (!(g1Var.a() instanceof zh.f1)) {
                throw new IllegalArgumentException("RFC3211Wrap requires an IV");
            }
            this.f20060b = (zh.f1) g1Var.a();
            return;
        }
        if (z10) {
            this.f20062d = org.bouncycastle.crypto.l.b();
        }
        if (!(iVar instanceof zh.f1)) {
            throw new IllegalArgumentException("RFC3211Wrap requires an IV");
        }
        this.f20060b = (zh.f1) iVar;
    }
}
