package uh;

import org.bouncycastle.crypto.y;
/* loaded from: classes3.dex */
public class b implements y {

    /* renamed from: a */
    private byte[] f23676a;

    /* renamed from: b */
    private byte[] f23677b;

    /* renamed from: c */
    private int f23678c;

    /* renamed from: d */
    private j f23679d;

    /* renamed from: e */
    private yh.a f23680e;

    /* renamed from: f */
    private int f23681f;

    public b(org.bouncycastle.crypto.e eVar) {
        this(eVar, 8, (eVar.b() * 8) / 2, null);
    }

    public b(org.bouncycastle.crypto.e eVar, int i10, int i11, yh.a aVar) {
        this.f23680e = null;
        if (i11 % 8 == 0) {
            this.f23676a = new byte[eVar.b()];
            j jVar = new j(eVar, i10);
            this.f23679d = jVar;
            this.f23680e = aVar;
            this.f23681f = i11 / 8;
            this.f23677b = new byte[jVar.b()];
            this.f23678c = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        int b10 = this.f23679d.b();
        yh.a aVar = this.f23680e;
        if (aVar == null) {
            while (true) {
                int i11 = this.f23678c;
                if (i11 >= b10) {
                    break;
                }
                this.f23677b[i11] = 0;
                this.f23678c = i11 + 1;
            }
        } else {
            aVar.b(this.f23677b, this.f23678c);
        }
        this.f23679d.e(this.f23677b, 0, this.f23676a, 0);
        this.f23679d.c(this.f23676a);
        System.arraycopy(this.f23676a, 0, bArr, i10, this.f23681f);
        reset();
        return this.f23681f;
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return this.f23679d.a();
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23681f;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        reset();
        this.f23679d.d(iVar);
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f23677b;
            if (i10 >= bArr.length) {
                this.f23678c = 0;
                this.f23679d.f();
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        int i10 = this.f23678c;
        byte[] bArr = this.f23677b;
        if (i10 == bArr.length) {
            this.f23679d.e(bArr, 0, this.f23676a, 0);
            this.f23678c = 0;
        }
        byte[] bArr2 = this.f23677b;
        int i11 = this.f23678c;
        this.f23678c = i11 + 1;
        bArr2[i11] = b10;
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 >= 0) {
            int b10 = this.f23679d.b();
            int i12 = this.f23678c;
            int i13 = b10 - i12;
            if (i11 > i13) {
                System.arraycopy(bArr, i10, this.f23677b, i12, i13);
                this.f23679d.e(this.f23677b, 0, this.f23676a, 0);
                this.f23678c = 0;
                i11 -= i13;
                i10 += i13;
                while (i11 > b10) {
                    this.f23679d.e(bArr, i10, this.f23676a, 0);
                    i11 -= b10;
                    i10 += b10;
                }
            }
            System.arraycopy(bArr, i10, this.f23677b, this.f23678c, i11);
            this.f23678c += i11;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
