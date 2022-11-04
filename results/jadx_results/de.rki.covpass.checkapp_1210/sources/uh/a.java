package uh;

import org.bouncycastle.crypto.y;
/* loaded from: classes3.dex */
public class a implements y {

    /* renamed from: a */
    private byte[] f23670a;

    /* renamed from: b */
    private byte[] f23671b;

    /* renamed from: c */
    private int f23672c;

    /* renamed from: d */
    private org.bouncycastle.crypto.e f23673d;

    /* renamed from: e */
    private yh.a f23674e;

    /* renamed from: f */
    private int f23675f;

    public a(org.bouncycastle.crypto.e eVar) {
        this(eVar, (eVar.b() * 8) / 2, null);
    }

    public a(org.bouncycastle.crypto.e eVar, int i10) {
        this(eVar, i10, null);
    }

    public a(org.bouncycastle.crypto.e eVar, int i10, yh.a aVar) {
        if (i10 % 8 == 0) {
            this.f23673d = new vh.c(eVar);
            this.f23674e = aVar;
            this.f23675f = i10 / 8;
            this.f23670a = new byte[eVar.b()];
            this.f23671b = new byte[eVar.b()];
            this.f23672c = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        int b10 = this.f23673d.b();
        if (this.f23674e == null) {
            while (true) {
                int i11 = this.f23672c;
                if (i11 >= b10) {
                    break;
                }
                this.f23671b[i11] = 0;
                this.f23672c = i11 + 1;
            }
        } else {
            if (this.f23672c == b10) {
                this.f23673d.a(this.f23671b, 0, this.f23670a, 0);
                this.f23672c = 0;
            }
            this.f23674e.b(this.f23671b, this.f23672c);
        }
        this.f23673d.a(this.f23671b, 0, this.f23670a, 0);
        System.arraycopy(this.f23670a, 0, bArr, i10, this.f23675f);
        reset();
        return this.f23675f;
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return this.f23673d.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23675f;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        reset();
        this.f23673d.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f23671b;
            if (i10 >= bArr.length) {
                this.f23672c = 0;
                this.f23673d.reset();
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        int i10 = this.f23672c;
        byte[] bArr = this.f23671b;
        if (i10 == bArr.length) {
            this.f23673d.a(bArr, 0, this.f23670a, 0);
            this.f23672c = 0;
        }
        byte[] bArr2 = this.f23671b;
        int i11 = this.f23672c;
        this.f23672c = i11 + 1;
        bArr2[i11] = b10;
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 >= 0) {
            int b10 = this.f23673d.b();
            int i12 = this.f23672c;
            int i13 = b10 - i12;
            if (i11 > i13) {
                System.arraycopy(bArr, i10, this.f23671b, i12, i13);
                this.f23673d.a(this.f23671b, 0, this.f23670a, 0);
                this.f23672c = 0;
                i11 -= i13;
                i10 += i13;
                while (i11 > b10) {
                    this.f23673d.a(bArr, i10, this.f23670a, 0);
                    i11 -= b10;
                    i10 += b10;
                }
            }
            System.arraycopy(bArr, i10, this.f23671b, this.f23672c, i11);
            this.f23672c += i11;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
