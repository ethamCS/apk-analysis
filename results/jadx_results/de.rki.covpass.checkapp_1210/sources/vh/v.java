package vh;

import org.bouncycastle.crypto.g0;
import zh.f1;
/* loaded from: classes3.dex */
public class v extends g0 {

    /* renamed from: b */
    private int f24346b;

    /* renamed from: c */
    private byte[] f24347c;

    /* renamed from: d */
    private byte[] f24348d;

    /* renamed from: e */
    private byte[] f24349e;

    /* renamed from: f */
    private final int f24350f;

    /* renamed from: g */
    private final org.bouncycastle.crypto.e f24351g;

    public v(org.bouncycastle.crypto.e eVar, int i10) {
        super(eVar);
        if (i10 > eVar.b() * 8 || i10 < 8 || i10 % 8 != 0) {
            throw new IllegalArgumentException("0FB" + i10 + " not supported");
        }
        this.f24351g = eVar;
        this.f24350f = i10 / 8;
        this.f24347c = new byte[eVar.b()];
        this.f24348d = new byte[eVar.b()];
        this.f24349e = new byte[eVar.b()];
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f24350f, bArr2, i11);
        return this.f24350f;
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24350f;
    }

    @Override // org.bouncycastle.crypto.g0
    protected byte c(byte b10) {
        if (this.f24346b == 0) {
            this.f24351g.a(this.f24348d, 0, this.f24349e, 0);
        }
        byte[] bArr = this.f24349e;
        int i10 = this.f24346b;
        int i11 = i10 + 1;
        this.f24346b = i11;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        int i12 = this.f24350f;
        if (i11 == i12) {
            this.f24346b = 0;
            byte[] bArr2 = this.f24348d;
            System.arraycopy(bArr2, i12, bArr2, 0, bArr2.length - i12);
            byte[] bArr3 = this.f24349e;
            byte[] bArr4 = this.f24348d;
            int length = bArr4.length;
            int i13 = this.f24350f;
            System.arraycopy(bArr3, 0, bArr4, length - i13, i13);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24351g.getAlgorithmName() + "/OFB" + (this.f24350f * 8);
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a10 = f1Var.a();
            int length = a10.length;
            byte[] bArr = this.f24347c;
            if (length < bArr.length) {
                System.arraycopy(a10, 0, bArr, bArr.length - a10.length, a10.length);
                int i10 = 0;
                while (true) {
                    byte[] bArr2 = this.f24347c;
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
            eVar = this.f24351g;
            iVar = f1Var.b();
        } else {
            reset();
            if (iVar == null) {
                return;
            }
            eVar = this.f24351g;
        }
        eVar.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        byte[] bArr = this.f24347c;
        System.arraycopy(bArr, 0, this.f24348d, 0, bArr.length);
        this.f24346b = 0;
        this.f24351g.reset();
    }
}
