package ci;

import org.bouncycastle.crypto.y;
import zh.b1;
/* loaded from: classes3.dex */
public class a implements c {

    /* renamed from: a */
    private byte[] f6598a;

    /* renamed from: b */
    private byte[] f6599b;

    /* renamed from: c */
    private long f6600c;

    /* renamed from: d */
    private bi.c f6601d;

    /* renamed from: e */
    private y f6602e;

    /* renamed from: f */
    private int f6603f;

    public a(y yVar, int i10, bi.c cVar, byte[] bArr, byte[] bArr2) {
        if (i10 <= d.b(yVar)) {
            if (cVar.entropySize() < i10) {
                throw new IllegalArgumentException("Not enough entropy for security strength required");
            }
            this.f6603f = i10;
            this.f6601d = cVar;
            this.f6602e = yVar;
            byte[] q10 = ak.a.q(c(), bArr2, bArr);
            byte[] bArr3 = new byte[yVar.getMacSize()];
            this.f6598a = bArr3;
            byte[] bArr4 = new byte[bArr3.length];
            this.f6599b = bArr4;
            ak.a.y(bArr4, (byte) 1);
            d(q10);
            this.f6600c = 1L;
            return;
        }
        throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
    }

    private byte[] c() {
        byte[] entropy = this.f6601d.getEntropy();
        if (entropy.length >= (this.f6603f + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private void d(byte[] bArr) {
        e(bArr, (byte) 0);
        if (bArr != null) {
            e(bArr, (byte) 1);
        }
    }

    private void e(byte[] bArr, byte b10) {
        this.f6602e.init(new b1(this.f6598a));
        y yVar = this.f6602e;
        byte[] bArr2 = this.f6599b;
        yVar.update(bArr2, 0, bArr2.length);
        this.f6602e.update(b10);
        if (bArr != null) {
            this.f6602e.update(bArr, 0, bArr.length);
        }
        this.f6602e.doFinal(this.f6598a, 0);
        this.f6602e.init(new b1(this.f6598a));
        y yVar2 = this.f6602e;
        byte[] bArr3 = this.f6599b;
        yVar2.update(bArr3, 0, bArr3.length);
        this.f6602e.doFinal(this.f6599b, 0);
    }

    @Override // ci.c
    public void a(byte[] bArr) {
        d(ak.a.p(c(), bArr));
        this.f6600c = 1L;
    }

    @Override // ci.c
    public int b(byte[] bArr, byte[] bArr2, boolean z10) {
        int length = bArr.length * 8;
        if (length <= 262144) {
            if (this.f6600c > 140737488355328L) {
                return -1;
            }
            if (z10) {
                a(bArr2);
                bArr2 = null;
            }
            if (bArr2 != null) {
                d(bArr2);
            }
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            int length3 = bArr.length / this.f6599b.length;
            this.f6602e.init(new b1(this.f6598a));
            for (int i10 = 0; i10 < length3; i10++) {
                y yVar = this.f6602e;
                byte[] bArr4 = this.f6599b;
                yVar.update(bArr4, 0, bArr4.length);
                this.f6602e.doFinal(this.f6599b, 0);
                byte[] bArr5 = this.f6599b;
                System.arraycopy(bArr5, 0, bArr3, bArr5.length * i10, bArr5.length);
            }
            byte[] bArr6 = this.f6599b;
            if (bArr6.length * length3 < length2) {
                this.f6602e.update(bArr6, 0, bArr6.length);
                this.f6602e.doFinal(this.f6599b, 0);
                byte[] bArr7 = this.f6599b;
                System.arraycopy(bArr7, 0, bArr3, bArr7.length * length3, length2 - (length3 * bArr7.length));
            }
            d(bArr2);
            this.f6600c++;
            System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
            return length;
        }
        throw new IllegalArgumentException("Number of bits per request limited to 262144");
    }
}
