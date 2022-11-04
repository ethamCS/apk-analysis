package vh;

import org.bouncycastle.crypto.g0;
import zh.f1;
/* loaded from: classes3.dex */
public class p extends g0 {

    /* renamed from: b */
    private byte[] f24281b;

    /* renamed from: c */
    private byte[] f24282c;

    /* renamed from: d */
    private byte[] f24283d;

    /* renamed from: e */
    private int f24284e;

    /* renamed from: f */
    private final int f24285f;

    /* renamed from: g */
    private final org.bouncycastle.crypto.e f24286g;

    /* renamed from: h */
    boolean f24287h = true;

    /* renamed from: i */
    int f24288i;

    /* renamed from: j */
    int f24289j;

    public p(org.bouncycastle.crypto.e eVar) {
        super(eVar);
        this.f24286g = eVar;
        int b10 = eVar.b();
        this.f24285f = b10;
        if (b10 == 8) {
            this.f24281b = new byte[eVar.b()];
            this.f24282c = new byte[eVar.b()];
            this.f24283d = new byte[eVar.b()];
            return;
        }
        throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
    }

    private int e(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] << 24) & (-16777216)) + ((bArr[i10 + 2] << 16) & 16711680) + ((bArr[i10 + 1] << 8) & 65280) + (bArr[i10] & 255);
    }

    private void f(int i10, byte[] bArr, int i11) {
        bArr[i11 + 3] = (byte) (i10 >>> 24);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f24285f, bArr2, i11);
        return this.f24285f;
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24285f;
    }

    @Override // org.bouncycastle.crypto.g0
    protected byte c(byte b10) {
        if (this.f24284e == 0) {
            if (this.f24287h) {
                this.f24287h = false;
                this.f24286g.a(this.f24282c, 0, this.f24283d, 0);
                this.f24288i = e(this.f24283d, 0);
                this.f24289j = e(this.f24283d, 4);
            }
            int i10 = this.f24288i + 16843009;
            this.f24288i = i10;
            int i11 = this.f24289j + 16843012;
            this.f24289j = i11;
            if (i11 < 16843012 && i11 > 0) {
                this.f24289j = i11 + 1;
            }
            f(i10, this.f24282c, 0);
            f(this.f24289j, this.f24282c, 4);
            this.f24286g.a(this.f24282c, 0, this.f24283d, 0);
        }
        byte[] bArr = this.f24283d;
        int i12 = this.f24284e;
        int i13 = i12 + 1;
        this.f24284e = i13;
        byte b11 = (byte) (b10 ^ bArr[i12]);
        int i14 = this.f24285f;
        if (i13 == i14) {
            this.f24284e = 0;
            byte[] bArr2 = this.f24282c;
            System.arraycopy(bArr2, i14, bArr2, 0, bArr2.length - i14);
            byte[] bArr3 = this.f24283d;
            byte[] bArr4 = this.f24282c;
            int length = bArr4.length;
            int i15 = this.f24285f;
            System.arraycopy(bArr3, 0, bArr4, length - i15, i15);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24286g.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f24287h = true;
        this.f24288i = 0;
        this.f24289j = 0;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a10 = f1Var.a();
            int length = a10.length;
            byte[] bArr = this.f24281b;
            if (length < bArr.length) {
                System.arraycopy(a10, 0, bArr, bArr.length - a10.length, a10.length);
                int i10 = 0;
                while (true) {
                    byte[] bArr2 = this.f24281b;
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
            eVar = this.f24286g;
            iVar = f1Var.b();
        } else {
            reset();
            if (iVar == null) {
                return;
            }
            eVar = this.f24286g;
        }
        eVar.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.f24287h = true;
        this.f24288i = 0;
        this.f24289j = 0;
        byte[] bArr = this.f24281b;
        System.arraycopy(bArr, 0, this.f24282c, 0, bArr.length);
        this.f24284e = 0;
        this.f24286g.reset();
    }
}
