package uh;

import org.bouncycastle.crypto.y;
import org.conscrypt.PSKKeyManager;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class p implements y {

    /* renamed from: a */
    private byte f23768a;

    /* renamed from: b */
    private byte f23769b = 0;

    /* renamed from: c */
    private byte[] f23770c = null;

    /* renamed from: d */
    private byte f23771d = 0;

    /* renamed from: e */
    private byte[] f23772e;

    /* renamed from: f */
    private byte[] f23773f;

    /* renamed from: g */
    private byte[] f23774g;

    /* renamed from: h */
    private byte f23775h;

    /* renamed from: i */
    private byte f23776i;

    /* renamed from: j */
    private byte f23777j;

    /* renamed from: k */
    private byte f23778k;

    private void a(byte[] bArr, byte[] bArr2) {
        this.f23771d = (byte) 0;
        this.f23770c = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i10 = 0; i10 < 256; i10++) {
            this.f23770c[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < 768; i11++) {
            byte[] bArr3 = this.f23770c;
            int i12 = i11 & 255;
            byte b10 = bArr3[(this.f23771d + bArr3[i12] + bArr[i11 % bArr.length]) & 255];
            this.f23771d = b10;
            byte b11 = bArr3[i12];
            bArr3[i12] = bArr3[b10 & 255];
            bArr3[b10 & 255] = b11;
        }
        for (int i13 = 0; i13 < 768; i13++) {
            byte[] bArr4 = this.f23770c;
            int i14 = i13 & 255;
            byte b12 = bArr4[(this.f23771d + bArr4[i14] + bArr2[i13 % bArr2.length]) & 255];
            this.f23771d = b12;
            byte b13 = bArr4[i14];
            bArr4[i14] = bArr4[b12 & 255];
            bArr4[b12 & 255] = b13;
        }
        this.f23769b = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        for (int i11 = 1; i11 < 25; i11++) {
            byte[] bArr2 = this.f23770c;
            byte b10 = this.f23771d;
            byte b11 = this.f23769b;
            byte b12 = bArr2[(b10 + bArr2[b11 & 255]) & 255];
            this.f23771d = b12;
            byte b13 = this.f23778k;
            byte b14 = this.f23777j;
            byte b15 = bArr2[(b13 + b14 + i11) & 255];
            this.f23778k = b15;
            byte b16 = this.f23776i;
            byte b17 = bArr2[(b14 + b16 + i11) & 255];
            this.f23777j = b17;
            byte b18 = this.f23775h;
            byte b19 = bArr2[(b16 + b18 + i11) & 255];
            this.f23776i = b19;
            byte b20 = bArr2[(b18 + b12 + i11) & 255];
            this.f23775h = b20;
            byte[] bArr3 = this.f23772e;
            byte b21 = this.f23768a;
            bArr3[b21 & 31] = (byte) (b20 ^ bArr3[b21 & 31]);
            bArr3[(b21 + 1) & 31] = (byte) (b19 ^ bArr3[(b21 + 1) & 31]);
            bArr3[(b21 + 2) & 31] = (byte) (b17 ^ bArr3[(b21 + 2) & 31]);
            bArr3[(b21 + 3) & 31] = (byte) (b15 ^ bArr3[(b21 + 3) & 31]);
            this.f23768a = (byte) ((b21 + 4) & 31);
            byte b22 = bArr2[b11 & 255];
            bArr2[b11 & 255] = bArr2[b12 & 255];
            bArr2[b12 & 255] = b22;
            this.f23769b = (byte) ((b11 + 1) & 255);
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr4 = this.f23770c;
            int i13 = i12 & 255;
            byte b23 = bArr4[(this.f23771d + bArr4[i13] + this.f23772e[i12 & 31]) & 255];
            this.f23771d = b23;
            byte b24 = bArr4[i13];
            bArr4[i13] = bArr4[b23 & 255];
            bArr4[b23 & 255] = b24;
        }
        byte[] bArr5 = new byte[20];
        for (int i14 = 0; i14 < 20; i14++) {
            byte[] bArr6 = this.f23770c;
            int i15 = i14 & 255;
            byte b25 = bArr6[(this.f23771d + bArr6[i15]) & 255];
            this.f23771d = b25;
            bArr5[i14] = bArr6[(bArr6[bArr6[b25 & 255] & 255] + 1) & 255];
            byte b26 = bArr6[i15];
            bArr6[i15] = bArr6[b25 & 255];
            bArr6[b25 & 255] = b26;
        }
        System.arraycopy(bArr5, 0, bArr, i10, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            b1 b1Var = (b1) f1Var.b();
            if (!(f1Var.b() instanceof b1)) {
                throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
            }
            byte[] a10 = f1Var.a();
            this.f23773f = a10;
            if (a10 == null || a10.length < 1 || a10.length > 768) {
                throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
            }
            this.f23774g = b1Var.a();
            reset();
            return;
        }
        throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        a(this.f23774g, this.f23773f);
        this.f23769b = (byte) 0;
        this.f23778k = (byte) 0;
        this.f23777j = (byte) 0;
        this.f23776i = (byte) 0;
        this.f23775h = (byte) 0;
        this.f23768a = (byte) 0;
        this.f23772e = new byte[32];
        for (int i10 = 0; i10 < 32; i10++) {
            this.f23772e[i10] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        byte[] bArr = this.f23770c;
        byte b11 = this.f23771d;
        byte b12 = this.f23769b;
        byte b13 = bArr[(b11 + bArr[b12 & 255]) & 255];
        this.f23771d = b13;
        byte b14 = this.f23778k;
        byte b15 = this.f23777j;
        byte b16 = bArr[(b14 + b15) & 255];
        this.f23778k = b16;
        byte b17 = this.f23776i;
        byte b18 = bArr[(b15 + b17) & 255];
        this.f23777j = b18;
        byte b19 = this.f23775h;
        byte b20 = bArr[(b17 + b19) & 255];
        this.f23776i = b20;
        byte b21 = bArr[(b19 + b13 + ((byte) (b10 ^ bArr[(bArr[bArr[b13 & 255] & 255] + 1) & 255]))) & 255];
        this.f23775h = b21;
        byte[] bArr2 = this.f23772e;
        byte b22 = this.f23768a;
        bArr2[b22 & 31] = (byte) (b21 ^ bArr2[b22 & 31]);
        bArr2[(b22 + 1) & 31] = (byte) (b20 ^ bArr2[(b22 + 1) & 31]);
        bArr2[(b22 + 2) & 31] = (byte) (b18 ^ bArr2[(b22 + 2) & 31]);
        bArr2[(b22 + 3) & 31] = (byte) (b16 ^ bArr2[(b22 + 3) & 31]);
        this.f23768a = (byte) ((b22 + 4) & 31);
        byte b23 = bArr[b12 & 255];
        bArr[b12 & 255] = bArr[b13 & 255];
        bArr[b13 & 255] = b23;
        this.f23769b = (byte) ((b12 + 1) & 255);
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        if (i10 + i11 <= bArr.length) {
            for (int i12 = 0; i12 < i11; i12++) {
                update(bArr[i10 + i12]);
            }
            return;
        }
        throw new org.bouncycastle.crypto.o("input buffer too short");
    }
}
