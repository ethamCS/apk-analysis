package uh;

import org.bouncycastle.crypto.y;
import org.conscrypt.PSKKeyManager;
import zh.b1;
/* loaded from: classes3.dex */
public class c implements y {

    /* renamed from: a */
    private byte[] f23682a;

    /* renamed from: b */
    private byte[] f23683b;

    /* renamed from: c */
    private byte[] f23684c;

    /* renamed from: d */
    private byte[] f23685d;

    /* renamed from: e */
    private int f23686e;

    /* renamed from: f */
    private org.bouncycastle.crypto.e f23687f;

    /* renamed from: g */
    private int f23688g;

    /* renamed from: h */
    private byte[] f23689h;

    /* renamed from: i */
    private byte[] f23690i;

    public c(org.bouncycastle.crypto.e eVar) {
        this(eVar, eVar.b() * 8);
    }

    public c(org.bouncycastle.crypto.e eVar, int i10) {
        if (i10 % 8 == 0) {
            if (i10 > eVar.b() * 8) {
                throw new IllegalArgumentException("MAC size must be less or equal to " + (eVar.b() * 8));
            }
            this.f23687f = new vh.c(eVar);
            this.f23688g = i10 / 8;
            this.f23682a = b(eVar.b());
            this.f23684c = new byte[eVar.b()];
            this.f23685d = new byte[eVar.b()];
            this.f23683b = new byte[eVar.b()];
            this.f23686e = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    private byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i10 = (-c(bArr, bArr2)) & 255;
        int length = bArr.length - 3;
        byte b10 = bArr2[length];
        byte[] bArr3 = this.f23682a;
        bArr2[length] = (byte) (b10 ^ (bArr3[1] & i10));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((bArr3[2] & i10) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i10 & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    private static byte[] b(int i10) {
        int i11 = i10 * 8;
        int i12 = 135;
        switch (i11) {
            case 64:
            case 320:
                i12 = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i12 = 45;
                break;
            case 224:
                i12 = 777;
                break;
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                i12 = 1061;
                break;
            case 384:
                i12 = 4109;
                break;
            case 448:
                i12 = 2129;
                break;
            case 512:
                i12 = 293;
                break;
            case 768:
                i12 = 655377;
                break;
            case 1024:
                i12 = 524355;
                break;
            case 2048:
                i12 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + i11);
        }
        return ak.l.h(i12);
    }

    private static int c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            length--;
            if (length >= 0) {
                int i11 = bArr[length] & 255;
                bArr2[length] = (byte) (i10 | (i11 << 1));
                i10 = (i11 >>> 7) & 1;
            } else {
                return i10;
            }
        }
    }

    void d(org.bouncycastle.crypto.i iVar) {
        if (iVar == null || (iVar instanceof b1)) {
            return;
        }
        throw new IllegalArgumentException("CMac mode only permits key to be set.");
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2;
        if (this.f23686e == this.f23687f.b()) {
            bArr2 = this.f23689h;
        } else {
            new yh.c().b(this.f23685d, this.f23686e);
            bArr2 = this.f23690i;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr3 = this.f23684c;
            if (i11 >= bArr3.length) {
                this.f23687f.a(this.f23685d, 0, bArr3, 0);
                System.arraycopy(this.f23684c, 0, bArr, i10, this.f23688g);
                reset();
                return this.f23688g;
            }
            byte[] bArr4 = this.f23685d;
            bArr4[i11] = (byte) (bArr4[i11] ^ bArr2[i11]);
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return this.f23687f.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23688g;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        d(iVar);
        this.f23687f.init(true, iVar);
        byte[] bArr = this.f23683b;
        byte[] bArr2 = new byte[bArr.length];
        this.f23687f.a(bArr, 0, bArr2, 0);
        byte[] a10 = a(bArr2);
        this.f23689h = a10;
        this.f23690i = a(a10);
        reset();
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f23685d;
            if (i10 >= bArr.length) {
                this.f23686e = 0;
                this.f23687f.reset();
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        int i10 = this.f23686e;
        byte[] bArr = this.f23685d;
        if (i10 == bArr.length) {
            this.f23687f.a(bArr, 0, this.f23684c, 0);
            this.f23686e = 0;
        }
        byte[] bArr2 = this.f23685d;
        int i11 = this.f23686e;
        this.f23686e = i11 + 1;
        bArr2[i11] = b10;
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 >= 0) {
            int b10 = this.f23687f.b();
            int i12 = this.f23686e;
            int i13 = b10 - i12;
            if (i11 > i13) {
                System.arraycopy(bArr, i10, this.f23685d, i12, i13);
                this.f23687f.a(this.f23685d, 0, this.f23684c, 0);
                this.f23686e = 0;
                i11 -= i13;
                i10 += i13;
                while (i11 > b10) {
                    this.f23687f.a(bArr, i10, this.f23684c, 0);
                    i11 -= b10;
                    i10 += b10;
                }
            }
            System.arraycopy(bArr, i10, this.f23685d, this.f23686e, i11);
            this.f23686e += i11;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
