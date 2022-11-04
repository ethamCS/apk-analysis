package ph;

import ak.m;
import java.security.SecureRandom;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.l;
import org.bouncycastle.crypto.u;
import zh.g1;
/* loaded from: classes3.dex */
public class c implements org.bouncycastle.crypto.a {

    /* renamed from: a */
    private SecureRandom f19228a;

    /* renamed from: b */
    private org.bouncycastle.crypto.a f19229b;

    /* renamed from: c */
    private boolean f19230c;

    /* renamed from: d */
    private boolean f19231d;

    /* renamed from: h */
    private byte[] f19235h;

    /* renamed from: f */
    private int f19233f = -1;

    /* renamed from: g */
    private byte[] f19234g = null;

    /* renamed from: e */
    private boolean f19232e = i();

    public c(org.bouncycastle.crypto.a aVar) {
        this.f19229b = aVar;
    }

    private static int d(byte[] bArr, int i10) {
        int i11 = 0 | (bArr[0] ^ 2);
        int i12 = i10 + 1;
        int length = bArr.length - i12;
        for (int i13 = 1; i13 < length; i13++) {
            byte b10 = bArr[i13];
            int i14 = b10 | (b10 >> 1);
            int i15 = i14 | (i14 >> 2);
            i11 |= ((i15 | (i15 >> 4)) & 1) - 1;
        }
        int i16 = bArr[bArr.length - i12] | i11;
        int i17 = i16 | (i16 >> 1);
        int i18 = i17 | (i17 >> 2);
        return ~(((i18 | (i18 >> 4)) & 1) - 1);
    }

    private byte[] e(byte[] bArr, int i10, int i11) {
        if (this.f19233f != -1) {
            return f(bArr, i10, i11);
        }
        byte[] a10 = this.f19229b.a(bArr, i10, i11);
        boolean z10 = true;
        boolean z11 = this.f19232e & (a10.length != this.f19229b.c());
        if (a10.length < c()) {
            a10 = this.f19235h;
        }
        byte b10 = a10[0];
        boolean z12 = !this.f19231d ? b10 != 1 : b10 != 2;
        int h10 = h(b10, a10) + 1;
        if (h10 >= 10) {
            z10 = false;
        }
        if (z12 || z10) {
            ak.a.y(a10, (byte) 0);
            throw new u("block incorrect");
        } else if (z11) {
            ak.a.y(a10, (byte) 0);
            throw new u("block incorrect size");
        } else {
            int length = a10.length - h10;
            byte[] bArr2 = new byte[length];
            System.arraycopy(a10, h10, bArr2, 0, length);
            return bArr2;
        }
    }

    private byte[] f(byte[] bArr, int i10, int i11) {
        if (this.f19231d) {
            byte[] a10 = this.f19229b.a(bArr, i10, i11);
            byte[] bArr2 = this.f19234g;
            if (bArr2 == null) {
                bArr2 = new byte[this.f19233f];
                this.f19228a.nextBytes(bArr2);
            }
            if (this.f19232e & (a10.length != this.f19229b.c())) {
                a10 = this.f19235h;
            }
            int d10 = d(a10, this.f19233f);
            byte[] bArr3 = new byte[this.f19233f];
            int i12 = 0;
            while (true) {
                int i13 = this.f19233f;
                if (i12 >= i13) {
                    ak.a.y(a10, (byte) 0);
                    return bArr3;
                }
                bArr3[i12] = (byte) ((a10[(a10.length - i13) + i12] & (~d10)) | (bArr2[i12] & d10));
                i12++;
            }
        } else {
            throw new u("sorry, this method is only for decryption, not for signing");
        }
    }

    private byte[] g(byte[] bArr, int i10, int i11) {
        if (i11 <= b()) {
            int b10 = this.f19229b.b();
            byte[] bArr2 = new byte[b10];
            if (this.f19231d) {
                bArr2[0] = 1;
                for (int i12 = 1; i12 != (b10 - i11) - 1; i12++) {
                    bArr2[i12] = -1;
                }
            } else {
                this.f19228a.nextBytes(bArr2);
                bArr2[0] = 2;
                for (int i13 = 1; i13 != (b10 - i11) - 1; i13++) {
                    while (bArr2[i13] == 0) {
                        bArr2[i13] = (byte) this.f19228a.nextInt();
                    }
                }
            }
            int i14 = b10 - i11;
            bArr2[i14 - 1] = 0;
            System.arraycopy(bArr, i10, bArr2, i14, i11);
            return this.f19229b.a(bArr2, 0, b10);
        }
        throw new IllegalArgumentException("input data too large");
    }

    private int h(byte b10, byte[] bArr) {
        int i10 = -1;
        boolean z10 = false;
        for (int i11 = 1; i11 != bArr.length; i11++) {
            byte b11 = bArr[i11];
            if ((b11 == 0) & (i10 < 0)) {
                i10 = i11;
            }
            z10 |= (b11 != -1) & (b10 == 1) & (i10 < 0);
        }
        if (z10) {
            return -1;
        }
        return i10;
    }

    private boolean i() {
        if (m.d("org.bouncycastle.pkcs1.not_strict", true)) {
            return false;
        }
        return !m.d("org.bouncycastle.pkcs1.strict", false);
    }

    @Override // org.bouncycastle.crypto.a
    public byte[] a(byte[] bArr, int i10, int i11) {
        return this.f19230c ? g(bArr, i10, i11) : e(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.a
    public int b() {
        int b10 = this.f19229b.b();
        return this.f19230c ? b10 - 10 : b10;
    }

    @Override // org.bouncycastle.crypto.a
    public int c() {
        int c10 = this.f19229b.c();
        return this.f19230c ? c10 : c10 - 10;
    }

    @Override // org.bouncycastle.crypto.a
    public void init(boolean z10, i iVar) {
        zh.b bVar;
        if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f19228a = g1Var.b();
            bVar = (zh.b) g1Var.a();
        } else {
            bVar = (zh.b) iVar;
            if (!bVar.a() && z10) {
                this.f19228a = l.b();
            }
        }
        this.f19229b.init(z10, iVar);
        this.f19231d = bVar.a();
        this.f19230c = z10;
        this.f19235h = new byte[this.f19229b.c()];
        if (this.f19233f > 0 && this.f19234g == null && this.f19228a == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }
}
