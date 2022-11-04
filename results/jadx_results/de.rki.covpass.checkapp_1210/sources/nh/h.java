package nh;
/* loaded from: classes3.dex */
public abstract class h implements org.bouncycastle.crypto.t, ak.i {

    /* renamed from: a */
    private final byte[] f17190a;

    /* renamed from: b */
    private int f17191b;

    /* renamed from: c */
    private long f17192c;

    public h() {
        this.f17190a = new byte[4];
        this.f17191b = 0;
    }

    public h(h hVar) {
        this.f17190a = new byte[4];
        d(hVar);
    }

    public void d(h hVar) {
        byte[] bArr = hVar.f17190a;
        System.arraycopy(bArr, 0, this.f17190a, 0, bArr.length);
        this.f17191b = hVar.f17191b;
        this.f17192c = hVar.f17192c;
    }

    public void e() {
        long j10 = this.f17192c << 3;
        byte b10 = Byte.MIN_VALUE;
        while (true) {
            update(b10);
            if (this.f17191b == 0) {
                g(j10);
                f();
                return;
            }
            b10 = 0;
        }
    }

    protected abstract void f();

    protected abstract void g(long j10);

    @Override // org.bouncycastle.crypto.t
    public int getByteLength() {
        return 64;
    }

    protected abstract void h(byte[] bArr, int i10);

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        this.f17192c = 0L;
        this.f17191b = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f17190a;
            if (i10 < bArr.length) {
                bArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        byte[] bArr = this.f17190a;
        int i10 = this.f17191b;
        int i11 = i10 + 1;
        this.f17191b = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            h(bArr, 0);
            this.f17191b = 0;
        }
        this.f17192c++;
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        int max = Math.max(0, i11);
        if (this.f17191b != 0) {
            int i13 = 0;
            while (true) {
                if (i13 >= max) {
                    i12 = i13;
                    break;
                }
                byte[] bArr2 = this.f17190a;
                int i14 = this.f17191b;
                int i15 = i14 + 1;
                this.f17191b = i15;
                int i16 = i13 + 1;
                bArr2[i14] = bArr[i13 + i10];
                if (i15 == 4) {
                    h(bArr2, 0);
                    this.f17191b = 0;
                    i12 = i16;
                    break;
                }
                i13 = i16;
            }
        }
        int i17 = ((max - i12) & (-4)) + i12;
        while (i12 < i17) {
            h(bArr, i10 + i12);
            i12 += 4;
        }
        while (i12 < max) {
            byte[] bArr3 = this.f17190a;
            int i18 = this.f17191b;
            this.f17191b = i18 + 1;
            bArr3[i18] = bArr[i12 + i10];
            i12++;
        }
        this.f17192c += max;
    }
}
