package uh;

import org.bouncycastle.crypto.y;
import qh.h1;
/* loaded from: classes3.dex */
public final class q implements y {

    /* renamed from: b */
    private int f23780b;

    /* renamed from: d */
    private h1 f23782d;

    /* renamed from: e */
    private int f23783e;

    /* renamed from: f */
    private int f23784f;

    /* renamed from: a */
    private final b f23779a = new b();

    /* renamed from: c */
    private final int[] f23781c = new int[2];

    /* loaded from: classes3.dex */
    public static class b extends h1 {
        private b() {
        }

        int u() {
            return super.q();
        }
    }

    private int a() {
        if (this.f23784f != 0) {
            return this.f23779a.u();
        }
        int[] iArr = this.f23781c;
        int length = (this.f23783e + 1) % iArr.length;
        this.f23783e = length;
        return iArr[length];
    }

    private int b(int i10) {
        int[] iArr = this.f23781c;
        int i11 = this.f23783e;
        int i12 = iArr[i11];
        if (i10 == 0) {
            return i12;
        }
        int i13 = iArr[(i11 + 1) % iArr.length];
        return (i13 >>> (32 - i10)) | (i12 << i10);
    }

    private void c() {
        int i10 = 0;
        this.f23780b = 0;
        while (true) {
            int[] iArr = this.f23781c;
            if (i10 >= iArr.length - 1) {
                this.f23783e = iArr.length - 1;
                this.f23784f = 3;
                return;
            }
            iArr[i10] = this.f23779a.u();
            i10++;
        }
    }

    private void d() {
        int i10 = (this.f23784f + 1) % 4;
        this.f23784f = i10;
        if (i10 == 0) {
            this.f23781c[this.f23783e] = this.f23779a.u();
            this.f23783e = (this.f23783e + 1) % this.f23781c.length;
        }
    }

    private void e(int i10) {
        this.f23780b = b(i10) ^ this.f23780b;
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        d();
        int b10 = this.f23780b ^ b(this.f23784f * 8);
        this.f23780b = b10;
        int a10 = b10 ^ a();
        this.f23780b = a10;
        h1.n(a10, bArr, i10);
        reset();
        return getMacSize();
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return "Zuc128Mac";
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return 4;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f23779a.init(true, iVar);
        this.f23782d = (h1) this.f23779a.a();
        c();
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        h1 h1Var = this.f23782d;
        if (h1Var != null) {
            this.f23779a.b(h1Var);
        }
        c();
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        d();
        int i10 = this.f23784f * 8;
        int i11 = 128;
        int i12 = 0;
        while (i11 > 0) {
            if ((b10 & i11) != 0) {
                e(i10 + i12);
            }
            i11 >>= 1;
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            update(bArr[i10 + i12]);
        }
    }
}
