package uh;

import org.bouncycastle.crypto.y;
import qh.h1;
import qh.j1;
/* loaded from: classes3.dex */
public final class r implements y {

    /* renamed from: a */
    private final a f23785a;

    /* renamed from: b */
    private final int f23786b;

    /* renamed from: c */
    private final int[] f23787c;

    /* renamed from: d */
    private final int[] f23788d;

    /* renamed from: e */
    private j1 f23789e;

    /* renamed from: f */
    private int f23790f;

    /* renamed from: g */
    private int f23791g;

    /* loaded from: classes3.dex */
    public static class a extends j1 {
        public a(int i10) {
            super(i10);
        }

        int v() {
            return super.q();
        }
    }

    public r(int i10) {
        this.f23785a = new a(i10);
        this.f23786b = i10;
        int i11 = i10 / 32;
        this.f23787c = new int[i11];
        this.f23788d = new int[i11 + 1];
    }

    private int a(int i10, int i11) {
        int[] iArr = this.f23788d;
        int i12 = this.f23790f;
        int i13 = iArr[(i12 + i10) % iArr.length];
        if (i11 == 0) {
            return i13;
        }
        int i14 = iArr[((i12 + i10) + 1) % iArr.length];
        return (i14 >>> (32 - i11)) | (i13 << i11);
    }

    private void b() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f23787c;
            if (i11 < iArr.length) {
                iArr[i11] = this.f23785a.v();
                i11++;
            }
        }
        while (true) {
            int[] iArr2 = this.f23788d;
            if (i10 >= iArr2.length - 1) {
                this.f23790f = iArr2.length - 1;
                this.f23791g = 3;
                return;
            }
            iArr2[i10] = this.f23785a.v();
            i10++;
        }
    }

    private void c() {
        int i10 = (this.f23791g + 1) % 4;
        this.f23791g = i10;
        if (i10 == 0) {
            this.f23790f = (this.f23790f + 1) % this.f23788d.length;
        }
    }

    private void d() {
        int i10 = (this.f23791g + 1) % 4;
        this.f23791g = i10;
        if (i10 == 0) {
            this.f23788d[this.f23790f] = this.f23785a.v();
            this.f23790f = (this.f23790f + 1) % this.f23788d.length;
        }
    }

    private void e(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f23787c;
            if (i11 < iArr.length) {
                iArr[i11] = iArr[i11] ^ a(i11, i10);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        c();
        e(this.f23791g * 8);
        int i11 = 0;
        while (true) {
            int[] iArr = this.f23787c;
            if (i11 >= iArr.length) {
                reset();
                return getMacSize();
            }
            h1.n(iArr[i11], bArr, (i11 * 4) + i10);
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return "Zuc256Mac-" + this.f23786b;
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23786b / 8;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f23785a.init(true, iVar);
        this.f23789e = (j1) this.f23785a.a();
        b();
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        j1 j1Var = this.f23789e;
        if (j1Var != null) {
            this.f23785a.b(j1Var);
        }
        b();
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        d();
        int i10 = this.f23791g * 8;
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
