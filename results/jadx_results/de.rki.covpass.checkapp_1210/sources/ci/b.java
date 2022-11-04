package ci;

import ak.g;
import java.util.Hashtable;
import org.bouncycastle.crypto.r;
/* loaded from: classes3.dex */
public class b implements c {

    /* renamed from: h */
    private static final byte[] f6604h = {1};

    /* renamed from: i */
    private static final Hashtable f6605i;

    /* renamed from: a */
    private r f6606a;

    /* renamed from: b */
    private byte[] f6607b;

    /* renamed from: c */
    private byte[] f6608c;

    /* renamed from: d */
    private long f6609d;

    /* renamed from: e */
    private bi.c f6610e;

    /* renamed from: f */
    private int f6611f;

    /* renamed from: g */
    private int f6612g;

    static {
        Hashtable hashtable = new Hashtable();
        f6605i = hashtable;
        hashtable.put("SHA-1", g.e(440));
        hashtable.put("SHA-224", g.e(440));
        hashtable.put("SHA-256", g.e(440));
        hashtable.put("SHA-512/256", g.e(440));
        hashtable.put("SHA-512/224", g.e(440));
        hashtable.put("SHA-384", g.e(888));
        hashtable.put("SHA-512", g.e(888));
    }

    public b(r rVar, int i10, bi.c cVar, byte[] bArr, byte[] bArr2) {
        if (i10 <= d.a(rVar)) {
            if (cVar.entropySize() < i10) {
                throw new IllegalArgumentException("Not enough entropy for security strength required");
            }
            this.f6606a = rVar;
            this.f6610e = cVar;
            this.f6611f = i10;
            this.f6612g = ((Integer) f6605i.get(rVar.getAlgorithmName())).intValue();
            byte[] c10 = d.c(this.f6606a, ak.a.q(e(), bArr2, bArr), this.f6612g);
            this.f6607b = c10;
            byte[] bArr3 = new byte[c10.length + 1];
            System.arraycopy(c10, 0, bArr3, 1, c10.length);
            this.f6608c = d.c(this.f6606a, bArr3, this.f6612g);
            this.f6609d = 1L;
            return;
        }
        throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
    }

    private void c(byte[] bArr, byte[] bArr2) {
        int i10 = 0;
        for (int i11 = 1; i11 <= bArr2.length; i11++) {
            int i12 = (bArr[bArr.length - i11] & 255) + (bArr2[bArr2.length - i11] & 255) + i10;
            i10 = i12 > 255 ? 1 : 0;
            bArr[bArr.length - i11] = (byte) i12;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i13 = (bArr[bArr.length - length] & 255) + i10;
            i10 = i13 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i13;
        }
    }

    private void d(byte[] bArr, byte[] bArr2) {
        this.f6606a.update(bArr, 0, bArr.length);
        this.f6606a.doFinal(bArr2, 0);
    }

    private byte[] e() {
        byte[] entropy = this.f6610e.getEntropy();
        if (entropy.length >= (this.f6611f + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private byte[] f(byte[] bArr) {
        byte[] bArr2 = new byte[this.f6606a.getDigestSize()];
        d(bArr, bArr2);
        return bArr2;
    }

    private byte[] g(byte[] bArr, int i10) {
        int i11 = i10 / 8;
        int digestSize = i11 / this.f6606a.getDigestSize();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i11];
        int digestSize2 = this.f6606a.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        for (int i12 = 0; i12 <= digestSize; i12++) {
            d(bArr2, bArr4);
            int i13 = i12 * digestSize2;
            int i14 = i11 - i13;
            if (i14 > digestSize2) {
                i14 = digestSize2;
            }
            System.arraycopy(bArr4, 0, bArr3, i13, i14);
            c(bArr2, f6604h);
        }
        return bArr3;
    }

    @Override // ci.c
    public void a(byte[] bArr) {
        byte[] c10 = d.c(this.f6606a, ak.a.r(f6604h, this.f6607b, e(), bArr), this.f6612g);
        this.f6607b = c10;
        byte[] bArr2 = new byte[c10.length + 1];
        bArr2[0] = 0;
        System.arraycopy(c10, 0, bArr2, 1, c10.length);
        this.f6608c = d.c(this.f6606a, bArr2, this.f6612g);
        this.f6609d = 1L;
    }

    @Override // ci.c
    public int b(byte[] bArr, byte[] bArr2, boolean z10) {
        long j10;
        int length = bArr.length * 8;
        if (length <= 262144) {
            if (this.f6609d > 140737488355328L) {
                return -1;
            }
            if (z10) {
                a(bArr2);
                bArr2 = null;
            }
            if (bArr2 != null) {
                byte[] bArr3 = this.f6607b;
                byte[] bArr4 = new byte[bArr3.length + 1 + bArr2.length];
                bArr4[0] = 2;
                System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
                System.arraycopy(bArr2, 0, bArr4, this.f6607b.length + 1, bArr2.length);
                c(this.f6607b, f(bArr4));
            }
            byte[] g10 = g(this.f6607b, length);
            byte[] bArr5 = this.f6607b;
            byte[] bArr6 = new byte[bArr5.length + 1];
            System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
            bArr6[0] = 3;
            c(this.f6607b, f(bArr6));
            c(this.f6607b, this.f6608c);
            c(this.f6607b, new byte[]{(byte) (j10 >> 24), (byte) (j10 >> 16), (byte) (j10 >> 8), (byte) this.f6609d});
            this.f6609d++;
            System.arraycopy(g10, 0, bArr, 0, bArr.length);
            return length;
        }
        throw new IllegalArgumentException("Number of bits per request limited to 262144");
    }
}
