package ph;

import ak.l;
import java.security.SecureRandom;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.o;
import org.bouncycastle.crypto.r;
import org.bouncycastle.crypto.u;
import zh.g1;
/* loaded from: classes3.dex */
public class b implements org.bouncycastle.crypto.a {

    /* renamed from: a */
    private byte[] f19223a;

    /* renamed from: b */
    private r f19224b;

    /* renamed from: c */
    private org.bouncycastle.crypto.a f19225c;

    /* renamed from: d */
    private SecureRandom f19226d;

    /* renamed from: e */
    private boolean f19227e;

    public b(org.bouncycastle.crypto.a aVar, r rVar, r rVar2, byte[] bArr) {
        this.f19225c = aVar;
        this.f19224b = rVar2;
        this.f19223a = new byte[rVar.getDigestSize()];
        rVar.reset();
        if (bArr != null) {
            rVar.update(bArr, 0, bArr.length);
        }
        rVar.doFinal(this.f19223a, 0);
    }

    public b(org.bouncycastle.crypto.a aVar, r rVar, byte[] bArr) {
        this(aVar, rVar, rVar, bArr);
    }

    private byte[] f(byte[] bArr, int i10, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        int digestSize = this.f19224b.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.f19224b.reset();
        int i13 = 0;
        while (i13 < i12 / digestSize) {
            l.f(i13, bArr4, 0);
            this.f19224b.update(bArr, i10, i11);
            this.f19224b.update(bArr4, 0, 4);
            this.f19224b.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i13 * digestSize, digestSize);
            i13++;
        }
        int i14 = digestSize * i13;
        if (i14 < i12) {
            l.f(i13, bArr4, 0);
            this.f19224b.update(bArr, i10, i11);
            this.f19224b.update(bArr4, 0, 4);
            this.f19224b.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i14, i12 - i14);
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.a
    public byte[] a(byte[] bArr, int i10, int i11) {
        return this.f19227e ? e(bArr, i10, i11) : d(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.a
    public int b() {
        int b10 = this.f19225c.b();
        return this.f19227e ? (b10 - 1) - (this.f19223a.length * 2) : b10;
    }

    @Override // org.bouncycastle.crypto.a
    public int c() {
        int c10 = this.f19225c.c();
        return this.f19227e ? c10 : (c10 - 1) - (this.f19223a.length * 2);
    }

    public byte[] d(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] a10 = this.f19225c.a(bArr, i10, i11);
        int c10 = this.f19225c.c();
        byte[] bArr4 = new byte[c10];
        boolean z10 = c10 < (this.f19223a.length * 2) + 1;
        if (a10.length <= c10) {
            System.arraycopy(a10, 0, bArr4, c10 - a10.length, a10.length);
        } else {
            System.arraycopy(a10, 0, bArr4, 0, c10);
            z10 = true;
        }
        byte[] bArr5 = this.f19223a;
        byte[] f10 = f(bArr4, bArr5.length, c10 - bArr5.length, bArr5.length);
        int i12 = 0;
        while (true) {
            bArr2 = this.f19223a;
            if (i12 == bArr2.length) {
                break;
            }
            bArr4[i12] = (byte) (bArr4[i12] ^ f10[i12]);
            i12++;
        }
        byte[] f11 = f(bArr4, 0, bArr2.length, c10 - bArr2.length);
        for (int length = this.f19223a.length; length != c10; length++) {
            bArr4[length] = (byte) (bArr4[length] ^ f11[length - this.f19223a.length]);
        }
        int i13 = 0;
        boolean z11 = false;
        while (true) {
            bArr3 = this.f19223a;
            if (i13 == bArr3.length) {
                break;
            }
            if (bArr3[i13] != bArr4[bArr3.length + i13]) {
                z11 = true;
            }
            i13++;
        }
        int i14 = c10;
        for (int length2 = bArr3.length * 2; length2 != c10; length2++) {
            if ((bArr4[length2] != 0) & (i14 == c10)) {
                i14 = length2;
            }
        }
        boolean z12 = i14 > c10 + (-1);
        boolean z13 = bArr4[i14] != 1;
        int i15 = i14 + 1;
        if ((z12 | z13) || (z10 | z11)) {
            ak.a.y(bArr4, (byte) 0);
            throw new u("data wrong");
        }
        int i16 = c10 - i15;
        byte[] bArr6 = new byte[i16];
        System.arraycopy(bArr4, i15, bArr6, 0, i16);
        ak.a.y(bArr4, (byte) 0);
        return bArr6;
    }

    public byte[] e(byte[] bArr, int i10, int i11) {
        if (i11 <= b()) {
            int b10 = b() + 1 + (this.f19223a.length * 2);
            byte[] bArr2 = new byte[b10];
            int i12 = b10 - i11;
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            bArr2[i12 - 1] = 1;
            byte[] bArr3 = this.f19223a;
            System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
            int length = this.f19223a.length;
            byte[] bArr4 = new byte[length];
            this.f19226d.nextBytes(bArr4);
            byte[] f10 = f(bArr4, 0, length, b10 - this.f19223a.length);
            for (int length2 = this.f19223a.length; length2 != b10; length2++) {
                bArr2[length2] = (byte) (bArr2[length2] ^ f10[length2 - this.f19223a.length]);
            }
            System.arraycopy(bArr4, 0, bArr2, 0, this.f19223a.length);
            byte[] bArr5 = this.f19223a;
            byte[] f11 = f(bArr2, bArr5.length, b10 - bArr5.length, bArr5.length);
            for (int i13 = 0; i13 != this.f19223a.length; i13++) {
                bArr2[i13] = (byte) (bArr2[i13] ^ f11[i13]);
            }
            return this.f19225c.a(bArr2, 0, b10);
        }
        throw new o("input data too long");
    }

    @Override // org.bouncycastle.crypto.a
    public void init(boolean z10, i iVar) {
        this.f19226d = iVar instanceof g1 ? ((g1) iVar).b() : org.bouncycastle.crypto.l.b();
        this.f19225c.init(z10, iVar);
        this.f19227e = z10;
    }
}
