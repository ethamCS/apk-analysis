package uh;

import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.y;
import zh.b1;
/* loaded from: classes3.dex */
public class d implements y {

    /* renamed from: a */
    private nh.c f23691a;

    /* renamed from: b */
    private int f23692b;

    /* renamed from: c */
    private byte[] f23693c = null;

    /* renamed from: d */
    private byte[] f23694d = null;

    /* renamed from: e */
    private long f23695e;

    public d(int i10) {
        this.f23691a = new nh.c(i10);
        this.f23692b = i10 / 8;
    }

    private void a() {
        int byteLength = this.f23691a.getByteLength() - ((int) (this.f23695e % this.f23691a.getByteLength()));
        if (byteLength < 13) {
            byteLength += this.f23691a.getByteLength();
        }
        byte[] bArr = new byte[byteLength];
        bArr[0] = Byte.MIN_VALUE;
        ak.l.v(this.f23695e * 8, bArr, byteLength - 12);
        this.f23691a.update(bArr, 0, byteLength);
    }

    private byte[] b(byte[] bArr) {
        int length = (((bArr.length + this.f23691a.getByteLength()) - 1) / this.f23691a.getByteLength()) * this.f23691a.getByteLength();
        if (length - bArr.length < 13) {
            length += this.f23691a.getByteLength();
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = Byte.MIN_VALUE;
        ak.l.i(bArr.length * 8, bArr2, length - 12);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        if (this.f23693c == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (bArr.length - i10 < this.f23692b) {
            throw new a0("Output buffer too short");
        } else {
            a();
            nh.c cVar = this.f23691a;
            byte[] bArr2 = this.f23694d;
            cVar.update(bArr2, 0, bArr2.length);
            this.f23695e = 0L;
            int doFinal = this.f23691a.doFinal(bArr, i10);
            reset();
            return doFinal;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return "DSTU7564Mac";
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23692b;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f23693c = null;
        reset();
        if (iVar instanceof b1) {
            byte[] a10 = ((b1) iVar).a();
            this.f23694d = new byte[a10.length];
            this.f23693c = b(a10);
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f23694d;
                if (i10 >= bArr.length) {
                    nh.c cVar = this.f23691a;
                    byte[] bArr2 = this.f23693c;
                    cVar.update(bArr2, 0, bArr2.length);
                    return;
                }
                bArr[i10] = (byte) (~a10[i10]);
                i10++;
            }
        } else {
            throw new IllegalArgumentException("Bad parameter passed");
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        this.f23695e = 0L;
        this.f23691a.reset();
        byte[] bArr = this.f23693c;
        if (bArr != null) {
            this.f23691a.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        this.f23691a.update(b10);
        this.f23695e++;
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        if (bArr.length - i10 >= i11) {
            if (this.f23693c != null) {
                this.f23691a.update(bArr, i10, i11);
                this.f23695e += i11;
                return;
            }
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        throw new org.bouncycastle.crypto.o("Input buffer too short");
    }
}
