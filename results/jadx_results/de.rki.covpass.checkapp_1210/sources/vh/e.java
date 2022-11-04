package vh;

import org.bouncycastle.crypto.g0;
import zh.f1;
/* loaded from: classes3.dex */
public class e extends g0 {

    /* renamed from: b */
    private byte[] f24167b;

    /* renamed from: c */
    private byte[] f24168c;

    /* renamed from: d */
    private byte[] f24169d;

    /* renamed from: e */
    private byte[] f24170e;

    /* renamed from: f */
    private int f24171f;

    /* renamed from: g */
    private org.bouncycastle.crypto.e f24172g;

    /* renamed from: h */
    private boolean f24173h;

    /* renamed from: i */
    private int f24174i;

    public e(org.bouncycastle.crypto.e eVar, int i10) {
        super(eVar);
        this.f24172g = null;
        if (i10 > eVar.b() * 8 || i10 < 8 || i10 % 8 != 0) {
            throw new IllegalArgumentException("CFB" + i10 + " not supported");
        }
        this.f24172g = eVar;
        this.f24171f = i10 / 8;
        this.f24167b = new byte[eVar.b()];
        this.f24168c = new byte[eVar.b()];
        this.f24169d = new byte[eVar.b()];
        this.f24170e = new byte[this.f24171f];
    }

    private byte e(byte b10) {
        if (this.f24174i == 0) {
            this.f24172g.a(this.f24168c, 0, this.f24169d, 0);
        }
        byte[] bArr = this.f24170e;
        int i10 = this.f24174i;
        bArr[i10] = b10;
        byte[] bArr2 = this.f24169d;
        int i11 = i10 + 1;
        this.f24174i = i11;
        byte b11 = (byte) (b10 ^ bArr2[i10]);
        int i12 = this.f24171f;
        if (i11 == i12) {
            this.f24174i = 0;
            byte[] bArr3 = this.f24168c;
            System.arraycopy(bArr3, i12, bArr3, 0, bArr3.length - i12);
            byte[] bArr4 = this.f24170e;
            byte[] bArr5 = this.f24168c;
            int length = bArr5.length;
            int i13 = this.f24171f;
            System.arraycopy(bArr4, 0, bArr5, length - i13, i13);
        }
        return b11;
    }

    private byte f(byte b10) {
        if (this.f24174i == 0) {
            this.f24172g.a(this.f24168c, 0, this.f24169d, 0);
        }
        byte[] bArr = this.f24169d;
        int i10 = this.f24174i;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        byte[] bArr2 = this.f24170e;
        int i11 = i10 + 1;
        this.f24174i = i11;
        bArr2[i10] = b11;
        int i12 = this.f24171f;
        if (i11 == i12) {
            this.f24174i = 0;
            byte[] bArr3 = this.f24168c;
            System.arraycopy(bArr3, i12, bArr3, 0, bArr3.length - i12);
            byte[] bArr4 = this.f24170e;
            byte[] bArr5 = this.f24168c;
            int length = bArr5.length;
            int i13 = this.f24171f;
            System.arraycopy(bArr4, 0, bArr5, length - i13, i13);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f24171f, bArr2, i11);
        return this.f24171f;
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24171f;
    }

    @Override // org.bouncycastle.crypto.g0
    public byte c(byte b10) {
        return this.f24173h ? f(b10) : e(b10);
    }

    public byte[] g() {
        return ak.a.h(this.f24168c);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24172g.getAlgorithmName() + "/CFB" + (this.f24171f * 8);
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f24173h = z10;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a10 = f1Var.a();
            int length = a10.length;
            byte[] bArr = this.f24167b;
            if (length < bArr.length) {
                System.arraycopy(a10, 0, bArr, bArr.length - a10.length, a10.length);
                int i10 = 0;
                while (true) {
                    byte[] bArr2 = this.f24167b;
                    if (i10 >= bArr2.length - a10.length) {
                        break;
                    }
                    bArr2[i10] = 0;
                    i10++;
                }
            } else {
                System.arraycopy(a10, 0, bArr, 0, bArr.length);
            }
            reset();
            if (f1Var.b() == null) {
                return;
            }
            eVar = this.f24172g;
            iVar = f1Var.b();
        } else {
            reset();
            if (iVar == null) {
                return;
            }
            eVar = this.f24172g;
        }
        eVar.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        byte[] bArr = this.f24167b;
        System.arraycopy(bArr, 0, this.f24168c, 0, bArr.length);
        ak.a.y(this.f24170e, (byte) 0);
        this.f24174i = 0;
        this.f24172g.reset();
    }
}
