package vh;

import java.util.Vector;
import org.bouncycastle.crypto.a0;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class u implements a {

    /* renamed from: a */
    private org.bouncycastle.crypto.e f24324a;

    /* renamed from: b */
    private org.bouncycastle.crypto.e f24325b;

    /* renamed from: c */
    private boolean f24326c;

    /* renamed from: d */
    private int f24327d;

    /* renamed from: e */
    private byte[] f24328e;

    /* renamed from: f */
    private Vector f24329f;

    /* renamed from: g */
    private byte[] f24330g;

    /* renamed from: h */
    private byte[] f24331h;

    /* renamed from: l */
    private byte[] f24335l;

    /* renamed from: m */
    private byte[] f24336m;

    /* renamed from: n */
    private int f24337n;

    /* renamed from: o */
    private int f24338o;

    /* renamed from: p */
    private long f24339p;

    /* renamed from: q */
    private long f24340q;

    /* renamed from: r */
    private byte[] f24341r;

    /* renamed from: s */
    private byte[] f24342s;

    /* renamed from: u */
    private byte[] f24344u;

    /* renamed from: v */
    private byte[] f24345v;

    /* renamed from: i */
    private byte[] f24332i = null;

    /* renamed from: j */
    private byte[] f24333j = new byte[24];

    /* renamed from: k */
    private byte[] f24334k = new byte[16];

    /* renamed from: t */
    private byte[] f24343t = new byte[16];

    public u(org.bouncycastle.crypto.e eVar, org.bouncycastle.crypto.e eVar2) {
        if (eVar != null) {
            if (eVar.b() != 16) {
                throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
            }
            if (eVar2 == null) {
                throw new IllegalArgumentException("'mainCipher' cannot be null");
            }
            if (eVar2.b() != 16) {
                throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
            }
            if (!eVar.getAlgorithmName().equals(eVar2.getAlgorithmName())) {
                throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
            }
            this.f24324a = eVar;
            this.f24325b = eVar2;
            return;
        }
        throw new IllegalArgumentException("'hashCipher' cannot be null");
    }

    protected static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - l(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    protected static void d(byte[] bArr, int i10) {
        bArr[i10] = Byte.MIN_VALUE;
        while (true) {
            i10++;
            if (i10 < 16) {
                bArr[i10] = 0;
            } else {
                return;
            }
        }
    }

    protected static int e(long j10) {
        if (j10 == 0) {
            return 64;
        }
        int i10 = 0;
        while ((1 & j10) == 0) {
            i10++;
            j10 >>>= 1;
        }
        return i10;
    }

    protected static int l(byte[] bArr, byte[] bArr2) {
        int i10 = 16;
        int i11 = 0;
        while (true) {
            i10--;
            if (i10 >= 0) {
                int i12 = bArr[i10] & 255;
                bArr2[i10] = (byte) (i11 | (i12 << 1));
                i11 = (i12 >>> 7) & 1;
            } else {
                return i11;
            }
        }
    }

    protected static void n(byte[] bArr, byte[] bArr2) {
        for (int i10 = 15; i10 >= 0; i10--) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    @Override // vh.b
    public void a(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f24335l;
            int i13 = this.f24337n;
            bArr2[i13] = bArr[i10 + i12];
            int i14 = i13 + 1;
            this.f24337n = i14;
            if (i14 == bArr2.length) {
                h();
            }
        }
    }

    @Override // vh.b
    public byte[] b() {
        byte[] bArr = this.f24345v;
        return bArr == null ? new byte[this.f24327d] : ak.a.h(bArr);
    }

    @Override // vh.b
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2;
        if (!this.f24326c) {
            int i11 = this.f24338o;
            int i12 = this.f24327d;
            if (i11 < i12) {
                throw new org.bouncycastle.crypto.u("data too short");
            }
            int i13 = i11 - i12;
            this.f24338o = i13;
            bArr2 = new byte[i12];
            System.arraycopy(this.f24336m, i13, bArr2, 0, i12);
        } else {
            bArr2 = null;
        }
        int i14 = this.f24337n;
        if (i14 > 0) {
            d(this.f24335l, i14);
            m(this.f24330g);
        }
        int i15 = this.f24338o;
        if (i15 > 0) {
            if (this.f24326c) {
                d(this.f24336m, i15);
                n(this.f24344u, this.f24336m);
            }
            n(this.f24343t, this.f24330g);
            byte[] bArr3 = new byte[16];
            this.f24324a.a(this.f24343t, 0, bArr3, 0);
            n(this.f24336m, bArr3);
            int length = bArr.length;
            int i16 = this.f24338o;
            if (length < i10 + i16) {
                throw new a0("Output buffer too short");
            }
            System.arraycopy(this.f24336m, 0, bArr, i10, i16);
            if (!this.f24326c) {
                d(this.f24336m, this.f24338o);
                n(this.f24344u, this.f24336m);
            }
        }
        n(this.f24344u, this.f24343t);
        n(this.f24344u, this.f24331h);
        org.bouncycastle.crypto.e eVar = this.f24324a;
        byte[] bArr4 = this.f24344u;
        eVar.a(bArr4, 0, bArr4, 0);
        n(this.f24344u, this.f24342s);
        int i17 = this.f24327d;
        byte[] bArr5 = new byte[i17];
        this.f24345v = bArr5;
        System.arraycopy(this.f24344u, 0, bArr5, 0, i17);
        int i18 = this.f24338o;
        if (this.f24326c) {
            int length2 = bArr.length;
            int i19 = i10 + i18;
            int i20 = this.f24327d;
            if (length2 < i19 + i20) {
                throw new a0("Output buffer too short");
            }
            System.arraycopy(this.f24345v, 0, bArr, i19, i20);
            i18 += this.f24327d;
        } else if (!ak.a.u(this.f24345v, bArr2)) {
            throw new org.bouncycastle.crypto.u("mac check in OCB failed");
        }
        k(false);
        return i18;
    }

    protected void f(byte[] bArr) {
        if (bArr != null) {
            ak.a.y(bArr, (byte) 0);
        }
    }

    protected byte[] g(int i10) {
        while (i10 >= this.f24329f.size()) {
            Vector vector = this.f24329f;
            vector.addElement(c((byte[]) vector.lastElement()));
        }
        return (byte[]) this.f24329f.elementAt(i10);
    }

    @Override // vh.b
    public String getAlgorithmName() {
        return this.f24325b.getAlgorithmName() + "/OCB";
    }

    @Override // vh.b
    public int getOutputSize(int i10) {
        int i11 = i10 + this.f24338o;
        if (this.f24326c) {
            return i11 + this.f24327d;
        }
        int i12 = this.f24327d;
        if (i11 >= i12) {
            return i11 - i12;
        }
        return 0;
    }

    @Override // vh.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f24325b;
    }

    @Override // vh.b
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f24338o;
        if (!this.f24326c) {
            int i12 = this.f24327d;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % 16);
    }

    protected void h() {
        long j10 = this.f24339p + 1;
        this.f24339p = j10;
        m(g(e(j10)));
        this.f24337n = 0;
    }

    protected void i(byte[] bArr, int i10) {
        if (bArr.length >= i10 + 16) {
            if (this.f24326c) {
                n(this.f24344u, this.f24336m);
                this.f24338o = 0;
            }
            byte[] bArr2 = this.f24343t;
            long j10 = this.f24340q + 1;
            this.f24340q = j10;
            n(bArr2, g(e(j10)));
            n(this.f24336m, this.f24343t);
            org.bouncycastle.crypto.e eVar = this.f24325b;
            byte[] bArr3 = this.f24336m;
            eVar.a(bArr3, 0, bArr3, 0);
            n(this.f24336m, this.f24343t);
            System.arraycopy(this.f24336m, 0, bArr, i10, 16);
            if (this.f24326c) {
                return;
            }
            n(this.f24344u, this.f24336m);
            byte[] bArr4 = this.f24336m;
            System.arraycopy(bArr4, 16, bArr4, 0, this.f24327d);
            this.f24338o = this.f24327d;
            return;
        }
        throw new a0("Output buffer too short");
    }

    @Override // vh.b
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        b1 b1Var;
        byte[] bArr;
        boolean z11 = this.f24326c;
        this.f24326c = z10;
        this.f24345v = null;
        if (iVar instanceof zh.a) {
            zh.a aVar = (zh.a) iVar;
            bArr = aVar.d();
            this.f24328e = aVar.a();
            int c10 = aVar.c();
            if (c10 < 64 || c10 > 128 || c10 % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c10);
            }
            this.f24327d = c10 / 8;
            b1Var = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to OCB");
        } else {
            f1 f1Var = (f1) iVar;
            bArr = f1Var.a();
            this.f24328e = null;
            this.f24327d = 16;
            b1Var = (b1) f1Var.b();
        }
        this.f24335l = new byte[16];
        this.f24336m = new byte[z10 ? 16 : this.f24327d + 16];
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr.length <= 15) {
            if (b1Var != null) {
                this.f24324a.init(true, b1Var);
                this.f24325b.init(z10, b1Var);
                this.f24332i = null;
            } else if (z11 != z10) {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            }
            byte[] bArr2 = new byte[16];
            this.f24330g = bArr2;
            this.f24324a.a(bArr2, 0, bArr2, 0);
            this.f24331h = c(this.f24330g);
            Vector vector = new Vector();
            this.f24329f = vector;
            vector.addElement(c(this.f24331h));
            int j10 = j(bArr);
            int i10 = j10 % 8;
            int i11 = j10 / 8;
            if (i10 == 0) {
                System.arraycopy(this.f24333j, i11, this.f24334k, 0, 16);
            } else {
                for (int i12 = 0; i12 < 16; i12++) {
                    byte[] bArr3 = this.f24333j;
                    i11++;
                    this.f24334k[i12] = (byte) (((bArr3[i11] & 255) >>> (8 - i10)) | ((bArr3[i11] & 255) << i10));
                }
            }
            this.f24337n = 0;
            this.f24338o = 0;
            this.f24339p = 0L;
            this.f24340q = 0L;
            this.f24341r = new byte[16];
            this.f24342s = new byte[16];
            System.arraycopy(this.f24334k, 0, this.f24343t, 0, 16);
            this.f24344u = new byte[16];
            byte[] bArr4 = this.f24328e;
            if (bArr4 == null) {
                return;
            }
            a(bArr4, 0, bArr4.length);
            return;
        }
        throw new IllegalArgumentException("IV must be no more than 15 bytes");
    }

    protected int j(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.f24327d << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        int i11 = bArr2[15] & 63;
        bArr2[15] = (byte) (bArr2[15] & 192);
        byte[] bArr3 = this.f24332i;
        if (bArr3 == null || !ak.a.c(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.f24332i = bArr2;
            this.f24324a.a(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.f24333j, 0, 16);
            while (i10 < 8) {
                byte[] bArr5 = this.f24333j;
                int i12 = i10 + 16;
                byte b10 = bArr4[i10];
                i10++;
                bArr5[i12] = (byte) (b10 ^ bArr4[i10]);
            }
        }
        return i11;
    }

    protected void k(boolean z10) {
        this.f24324a.reset();
        this.f24325b.reset();
        f(this.f24335l);
        f(this.f24336m);
        this.f24337n = 0;
        this.f24338o = 0;
        this.f24339p = 0L;
        this.f24340q = 0L;
        f(this.f24341r);
        f(this.f24342s);
        System.arraycopy(this.f24334k, 0, this.f24343t, 0, 16);
        f(this.f24344u);
        if (z10) {
            this.f24345v = null;
        }
        byte[] bArr = this.f24328e;
        if (bArr != null) {
            a(bArr, 0, bArr.length);
        }
    }

    protected void m(byte[] bArr) {
        n(this.f24341r, bArr);
        n(this.f24335l, this.f24341r);
        org.bouncycastle.crypto.e eVar = this.f24324a;
        byte[] bArr2 = this.f24335l;
        eVar.a(bArr2, 0, bArr2, 0);
        n(this.f24342s, this.f24335l);
    }

    @Override // vh.b
    public int processByte(byte b10, byte[] bArr, int i10) {
        byte[] bArr2 = this.f24336m;
        int i11 = this.f24338o;
        bArr2[i11] = b10;
        int i12 = i11 + 1;
        this.f24338o = i12;
        if (i12 == bArr2.length) {
            i(bArr, i10);
            return 16;
        }
        return 0;
    }

    @Override // vh.b
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (bArr.length >= i10 + i11) {
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                byte[] bArr3 = this.f24336m;
                int i15 = this.f24338o;
                bArr3[i15] = bArr[i10 + i14];
                int i16 = i15 + 1;
                this.f24338o = i16;
                if (i16 == bArr3.length) {
                    i(bArr2, i12 + i13);
                    i13 += 16;
                }
            }
            return i13;
        }
        throw new org.bouncycastle.crypto.o("Input buffer too short");
    }
}
