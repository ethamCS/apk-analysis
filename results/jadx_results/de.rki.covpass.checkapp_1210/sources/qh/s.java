package qh;

import java.util.ArrayList;
/* loaded from: classes3.dex */
public class s implements org.bouncycastle.crypto.i0 {

    /* renamed from: a */
    private boolean f20148a;

    /* renamed from: b */
    private r f20149b;

    /* renamed from: c */
    private byte[] f20150c;

    /* renamed from: e */
    private byte[] f20152e;

    /* renamed from: f */
    private byte[] f20153f;

    /* renamed from: g */
    private ArrayList<byte[]> f20154g = new ArrayList<>();

    /* renamed from: d */
    private byte[] f20151d = new byte[4];

    public s(int i10) {
        r rVar = new r(i10);
        this.f20149b = rVar;
        this.f20150c = new byte[rVar.b() / 2];
        this.f20152e = new byte[this.f20149b.b()];
        this.f20153f = new byte[this.f20149b.b()];
    }

    private void c(int i10, byte[] bArr, int i11) {
        bArr[i11 + 3] = (byte) (i10 >> 24);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] a(byte[] bArr, int i10, int i11) {
        if (!this.f20148a) {
            if (i11 % this.f20149b.b() != 0) {
                throw new org.bouncycastle.crypto.o("unwrap data must be a multiple of " + this.f20149b.b() + " bytes");
            }
            int b10 = (i11 * 2) / this.f20149b.b();
            int i12 = b10 - 1;
            int i13 = i12 * 6;
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            byte[] bArr3 = new byte[this.f20149b.b() / 2];
            System.arraycopy(bArr2, 0, bArr3, 0, this.f20149b.b() / 2);
            this.f20154g.clear();
            int b11 = i11 - (this.f20149b.b() / 2);
            int b12 = this.f20149b.b() / 2;
            while (b11 != 0) {
                byte[] bArr4 = new byte[this.f20149b.b() / 2];
                System.arraycopy(bArr2, b12, bArr4, 0, this.f20149b.b() / 2);
                this.f20154g.add(bArr4);
                b11 -= this.f20149b.b() / 2;
                b12 += this.f20149b.b() / 2;
            }
            for (int i14 = 0; i14 < i13; i14++) {
                System.arraycopy(this.f20154g.get(b10 - 2), 0, bArr2, 0, this.f20149b.b() / 2);
                System.arraycopy(bArr3, 0, bArr2, this.f20149b.b() / 2, this.f20149b.b() / 2);
                c(i13 - i14, this.f20151d, 0);
                for (int i15 = 0; i15 < 4; i15++) {
                    int b13 = (this.f20149b.b() / 2) + i15;
                    bArr2[b13] = (byte) (bArr2[b13] ^ this.f20151d[i15]);
                }
                this.f20149b.a(bArr2, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr3, 0, this.f20149b.b() / 2);
                for (int i16 = 2; i16 < b10; i16++) {
                    int i17 = b10 - i16;
                    System.arraycopy(this.f20154g.get(i17 - 1), 0, this.f20154g.get(i17), 0, this.f20149b.b() / 2);
                }
                System.arraycopy(bArr2, this.f20149b.b() / 2, this.f20154g.get(0), 0, this.f20149b.b() / 2);
            }
            System.arraycopy(bArr3, 0, bArr2, 0, this.f20149b.b() / 2);
            int b14 = this.f20149b.b() / 2;
            for (int i18 = 0; i18 < i12; i18++) {
                System.arraycopy(this.f20154g.get(i18), 0, bArr2, b14, this.f20149b.b() / 2);
                b14 += this.f20149b.b() / 2;
            }
            System.arraycopy(bArr2, i11 - this.f20149b.b(), this.f20152e, 0, this.f20149b.b());
            byte[] bArr5 = new byte[i11 - this.f20149b.b()];
            if (!ak.a.c(this.f20152e, this.f20153f)) {
                throw new org.bouncycastle.crypto.u("checksum failed");
            }
            System.arraycopy(bArr2, 0, bArr5, 0, i11 - this.f20149b.b());
            return bArr5;
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] b(byte[] bArr, int i10, int i11) {
        if (this.f20148a) {
            if (i11 % this.f20149b.b() != 0) {
                throw new org.bouncycastle.crypto.o("wrap data must be a multiple of " + this.f20149b.b() + " bytes");
            } else if (i10 + i11 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            } else {
                int b10 = ((i11 / this.f20149b.b()) + 1) * 2;
                int i12 = b10 - 1;
                int i13 = i12 * 6;
                int b11 = this.f20149b.b() + i11;
                byte[] bArr2 = new byte[b11];
                System.arraycopy(bArr, i10, bArr2, 0, i11);
                System.arraycopy(bArr2, 0, this.f20150c, 0, this.f20149b.b() / 2);
                this.f20154g.clear();
                int b12 = b11 - (this.f20149b.b() / 2);
                int b13 = this.f20149b.b() / 2;
                while (b12 != 0) {
                    byte[] bArr3 = new byte[this.f20149b.b() / 2];
                    System.arraycopy(bArr2, b13, bArr3, 0, this.f20149b.b() / 2);
                    this.f20154g.add(bArr3);
                    b12 -= this.f20149b.b() / 2;
                    b13 += this.f20149b.b() / 2;
                }
                int i14 = 0;
                while (i14 < i13) {
                    System.arraycopy(this.f20150c, 0, bArr2, 0, this.f20149b.b() / 2);
                    System.arraycopy(this.f20154g.get(0), 0, bArr2, this.f20149b.b() / 2, this.f20149b.b() / 2);
                    this.f20149b.a(bArr2, 0, bArr2, 0);
                    i14++;
                    c(i14, this.f20151d, 0);
                    for (int i15 = 0; i15 < 4; i15++) {
                        int b14 = (this.f20149b.b() / 2) + i15;
                        bArr2[b14] = (byte) (bArr2[b14] ^ this.f20151d[i15]);
                    }
                    System.arraycopy(bArr2, this.f20149b.b() / 2, this.f20150c, 0, this.f20149b.b() / 2);
                    for (int i16 = 2; i16 < b10; i16++) {
                        System.arraycopy(this.f20154g.get(i16 - 1), 0, this.f20154g.get(i16 - 2), 0, this.f20149b.b() / 2);
                    }
                    System.arraycopy(bArr2, 0, this.f20154g.get(b10 - 2), 0, this.f20149b.b() / 2);
                }
                System.arraycopy(this.f20150c, 0, bArr2, 0, this.f20149b.b() / 2);
                int b15 = this.f20149b.b() / 2;
                for (int i17 = 0; i17 < i12; i17++) {
                    System.arraycopy(this.f20154g.get(i17), 0, bArr2, b15, this.f20149b.b() / 2);
                    b15 += this.f20149b.b() / 2;
                }
                return bArr2;
            }
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public String getAlgorithmName() {
        return "DSTU7624WrapEngine";
    }

    @Override // org.bouncycastle.crypto.i0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.g1) {
            iVar = ((zh.g1) iVar).a();
        }
        this.f20148a = z10;
        if (iVar instanceof zh.b1) {
            this.f20149b.init(z10, iVar);
            return;
        }
        throw new IllegalArgumentException("invalid parameters passed to DSTU7624WrapEngine");
    }
}
