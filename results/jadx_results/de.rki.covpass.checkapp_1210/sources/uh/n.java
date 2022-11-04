package uh;

import org.bouncycastle.crypto.y;
import zh.b1;
/* loaded from: classes3.dex */
public class n implements y {

    /* renamed from: a */
    protected final int f23756a;

    /* renamed from: b */
    protected final int f23757b;

    /* renamed from: c */
    protected long f23758c;

    /* renamed from: d */
    protected long f23759d;

    /* renamed from: e */
    protected long f23760e;

    /* renamed from: f */
    protected long f23761f;

    /* renamed from: g */
    protected long f23762g;

    /* renamed from: h */
    protected long f23763h;

    /* renamed from: i */
    protected long f23764i;

    /* renamed from: j */
    protected int f23765j;

    /* renamed from: k */
    protected int f23766k;

    public n() {
        this.f23764i = 0L;
        this.f23765j = 0;
        this.f23766k = 0;
        this.f23756a = 2;
        this.f23757b = 4;
    }

    public n(int i10, int i11) {
        this.f23764i = 0L;
        this.f23765j = 0;
        this.f23766k = 0;
        this.f23756a = i10;
        this.f23757b = i11;
    }

    protected static long d(long j10, int i10) {
        return (j10 >>> (-i10)) | (j10 << i10);
    }

    public void a(int i10) {
        long j10 = this.f23760e;
        long j11 = this.f23761f;
        long j12 = this.f23762g;
        long j13 = this.f23763h;
        for (int i11 = 0; i11 < i10; i11++) {
            long j14 = j10 + j11;
            long j15 = j12 + j13;
            long d10 = d(j11, 13) ^ j14;
            long d11 = d(j13, 16) ^ j15;
            long j16 = j15 + d10;
            j10 = d(j14, 32) + d11;
            j11 = d(d10, 17) ^ j16;
            j13 = d(d11, 21) ^ j10;
            j12 = d(j16, 32);
        }
        this.f23760e = j10;
        this.f23761f = j11;
        this.f23762g = j12;
        this.f23763h = j13;
    }

    public long b() {
        int i10;
        this.f23764i = ((this.f23764i >>> ((7 - this.f23765j) << 3)) >>> 8) | ((((this.f23766k << 3) + i10) & 255) << 56);
        c();
        this.f23762g ^= 255;
        a(this.f23757b);
        long j10 = ((this.f23760e ^ this.f23761f) ^ this.f23762g) ^ this.f23763h;
        reset();
        return j10;
    }

    public void c() {
        this.f23766k++;
        this.f23763h ^= this.f23764i;
        a(this.f23756a);
        this.f23760e ^= this.f23764i;
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        ak.l.v(b(), bArr, i10);
        return 8;
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return "SipHash-" + this.f23756a + "-" + this.f23757b;
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof b1) {
            byte[] a10 = ((b1) iVar).a();
            if (a10.length != 16) {
                throw new IllegalArgumentException("'params' must be a 128-bit key");
            }
            this.f23758c = ak.l.p(a10, 0);
            this.f23759d = ak.l.p(a10, 8);
            reset();
            return;
        }
        throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        long j10 = this.f23758c;
        this.f23760e = 8317987319222330741L ^ j10;
        long j11 = this.f23759d;
        this.f23761f = 7237128888997146477L ^ j11;
        this.f23762g = j10 ^ 7816392313619706465L;
        this.f23763h = 8387220255154660723L ^ j11;
        this.f23764i = 0L;
        this.f23765j = 0;
        this.f23766k = 0;
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        this.f23764i = (this.f23764i >>> 8) | ((b10 & 255) << 56);
        int i10 = this.f23765j + 1;
        this.f23765j = i10;
        if (i10 == 8) {
            c();
            this.f23765j = 0;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = i11 & (-8);
        int i13 = this.f23765j;
        int i14 = 0;
        if (i13 == 0) {
            while (i14 < i12) {
                this.f23764i = ak.l.p(bArr, i10 + i14);
                c();
                i14 += 8;
            }
            while (i14 < i11) {
                long j10 = this.f23764i >>> 8;
                this.f23764i = j10;
                this.f23764i = j10 | ((bArr[i10 + i14] & 255) << 56);
                i14++;
            }
            this.f23765j = i11 - i12;
            return;
        }
        int i15 = i13 << 3;
        int i16 = 0;
        while (i16 < i12) {
            long p10 = ak.l.p(bArr, i10 + i16);
            this.f23764i = (this.f23764i >>> (-i15)) | (p10 << i15);
            c();
            this.f23764i = p10;
            i16 += 8;
        }
        while (i16 < i11) {
            long j11 = this.f23764i >>> 8;
            this.f23764i = j11;
            this.f23764i = j11 | ((bArr[i10 + i16] & 255) << 56);
            int i17 = this.f23765j + 1;
            this.f23765j = i17;
            if (i17 == 8) {
                c();
                this.f23765j = 0;
            }
            i16++;
        }
    }
}
