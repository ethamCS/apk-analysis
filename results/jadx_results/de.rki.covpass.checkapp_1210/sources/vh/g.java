package vh;

import java.util.Objects;
import org.bouncycastle.crypto.a0;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class g implements b {

    /* renamed from: l */
    private static final byte[] f24176l = new byte[15];

    /* renamed from: a */
    private final qh.l f24177a;

    /* renamed from: b */
    private final org.bouncycastle.crypto.y f24178b;

    /* renamed from: c */
    private final byte[] f24179c;

    /* renamed from: d */
    private final byte[] f24180d;

    /* renamed from: e */
    private final byte[] f24181e;

    /* renamed from: f */
    private final byte[] f24182f;

    /* renamed from: g */
    private byte[] f24183g;

    /* renamed from: h */
    private long f24184h;

    /* renamed from: i */
    private long f24185i;

    /* renamed from: j */
    private int f24186j;

    /* renamed from: k */
    private int f24187k;

    public g() {
        this(new uh.l());
    }

    public g(org.bouncycastle.crypto.y yVar) {
        this.f24179c = new byte[32];
        this.f24180d = new byte[12];
        this.f24181e = new byte[80];
        this.f24182f = new byte[16];
        this.f24186j = 0;
        Objects.requireNonNull(yVar, "'poly1305' cannot be null");
        if (16 == yVar.getMacSize()) {
            this.f24177a = new qh.l();
            this.f24178b = yVar;
            return;
        }
        throw new IllegalArgumentException("'poly1305' must be a 128-bit MAC");
    }

    private void c() {
        int i10 = this.f24186j;
        int i11 = 2;
        if (i10 != 1) {
            if (i10 == 2) {
                return;
            }
            if (i10 == 4) {
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            }
            i11 = 6;
            if (i10 != 5) {
                if (i10 != 6) {
                    throw new IllegalStateException();
                }
                return;
            }
        }
        this.f24186j = i11;
    }

    private void d() {
        int i10;
        switch (this.f24186j) {
            case 1:
            case 2:
                i10 = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            case 5:
            case 6:
                i10 = 7;
                break;
            default:
                throw new IllegalStateException();
        }
        e(i10);
    }

    private void e(int i10) {
        i(this.f24184h);
        this.f24186j = i10;
    }

    private void f(int i10) {
        i(this.f24185i);
        byte[] bArr = new byte[16];
        ak.l.v(this.f24184h, bArr, 0);
        ak.l.v(this.f24185i, bArr, 8);
        this.f24178b.update(bArr, 0, 16);
        this.f24178b.doFinal(this.f24182f, 0);
        this.f24186j = i10;
    }

    private long g(long j10, int i10, long j11) {
        long j12 = i10;
        if (j10 - Long.MIN_VALUE <= (j11 - j12) - Long.MIN_VALUE) {
            return j10 + j12;
        }
        throw new IllegalStateException("Limit exceeded");
    }

    private void h() {
        byte[] bArr = new byte[64];
        try {
            this.f24177a.processBytes(bArr, 0, 64, bArr, 0);
            this.f24178b.init(new b1(bArr, 0, 32));
        } finally {
            ak.a.g(bArr);
        }
    }

    private void i(long j10) {
        int i10 = ((int) j10) & 15;
        if (i10 != 0) {
            this.f24178b.update(f24176l, 0, 16 - i10);
        }
    }

    private void j(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i12 <= bArr2.length - i11) {
            this.f24177a.processBytes(bArr, i10, i11, bArr2, i12);
            this.f24185i = g(this.f24185i, i11, 274877906880L);
            return;
        }
        throw new a0("Output buffer too short");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void k(boolean z10, boolean z11) {
        ak.a.g(this.f24181e);
        if (z10) {
            ak.a.g(this.f24182f);
        }
        this.f24184h = 0L;
        this.f24185i = 0L;
        this.f24187k = 0;
        switch (this.f24186j) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.f24186j = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.f24186j = 5;
                break;
            default:
                throw new IllegalStateException();
        }
        if (z11) {
            this.f24177a.reset();
        }
        h();
        byte[] bArr = this.f24183g;
        if (bArr != null) {
            a(bArr, 0, bArr.length);
        }
    }

    @Override // vh.b
    public void a(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "'in' cannot be null");
        if (i10 >= 0) {
            if (i11 < 0) {
                throw new IllegalArgumentException("'len' cannot be negative");
            }
            if (i10 > bArr.length - i11) {
                throw new org.bouncycastle.crypto.o("Input buffer too short");
            }
            c();
            if (i11 <= 0) {
                return;
            }
            this.f24184h = g(this.f24184h, i11, -1L);
            this.f24178b.update(bArr, i10, i11);
            return;
        }
        throw new IllegalArgumentException("'inOff' cannot be negative");
    }

    @Override // vh.b
    public byte[] b() {
        return ak.a.h(this.f24182f);
    }

    @Override // vh.b
    public int doFinal(byte[] bArr, int i10) {
        int i11;
        Objects.requireNonNull(bArr, "'out' cannot be null");
        if (i10 >= 0) {
            d();
            ak.a.g(this.f24182f);
            int i12 = this.f24186j;
            if (i12 == 3) {
                int i13 = this.f24187k;
                i11 = i13 + 16;
                if (i10 > bArr.length - i11) {
                    throw new a0("Output buffer too short");
                }
                if (i13 > 0) {
                    j(this.f24181e, 0, i13, bArr, i10);
                    this.f24178b.update(bArr, i10, this.f24187k);
                }
                f(4);
                System.arraycopy(this.f24182f, 0, bArr, i10 + this.f24187k, 16);
            } else if (i12 != 7) {
                throw new IllegalStateException();
            } else {
                int i14 = this.f24187k;
                if (i14 < 16) {
                    throw new org.bouncycastle.crypto.u("data too short");
                }
                i11 = i14 - 16;
                if (i10 > bArr.length - i11) {
                    throw new a0("Output buffer too short");
                }
                if (i11 > 0) {
                    this.f24178b.update(this.f24181e, 0, i11);
                    j(this.f24181e, 0, i11, bArr, i10);
                }
                f(8);
                if (!ak.a.t(16, this.f24182f, 0, this.f24181e, i11)) {
                    throw new org.bouncycastle.crypto.u("mac check in ChaCha20Poly1305 failed");
                }
            }
            k(false, true);
            return i11;
        }
        throw new IllegalArgumentException("'outOff' cannot be negative");
    }

    @Override // vh.b
    public String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // vh.b
    public int getOutputSize(int i10) {
        int max = Math.max(0, i10) + this.f24187k;
        int i11 = this.f24186j;
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return max + 16;
        }
        if (i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalStateException();
        }
        return Math.max(0, max - 16);
    }

    @Override // vh.b
    public int getUpdateOutputSize(int i10) {
        int max = Math.max(0, i10) + this.f24187k;
        int i11 = this.f24186j;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 != 5 && i11 != 6 && i11 != 7) {
                throw new IllegalStateException();
            }
            max = Math.max(0, max - 16);
        }
        return max - (max % 64);
    }

    @Override // vh.b
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        f1 f1Var;
        byte[] bArr;
        b1 b1Var;
        if (iVar instanceof zh.a) {
            zh.a aVar = (zh.a) iVar;
            int c10 = aVar.c();
            if (128 != c10) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c10);
            }
            b1Var = aVar.b();
            bArr = aVar.d();
            f1Var = new f1(b1Var, bArr);
            this.f24183g = aVar.a();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to ChaCha20Poly1305");
        } else {
            f1Var = (f1) iVar;
            b1Var = (b1) f1Var.b();
            bArr = f1Var.a();
            this.f24183g = null;
        }
        if (b1Var == null) {
            if (this.f24186j == 0) {
                throw new IllegalArgumentException("Key must be specified in initial init");
            }
        } else if (32 != b1Var.a().length) {
            throw new IllegalArgumentException("Key must be 256 bits");
        }
        if (bArr == null || 12 != bArr.length) {
            throw new IllegalArgumentException("Nonce must be 96 bits");
        }
        if (this.f24186j != 0 && z10 && ak.a.c(this.f24180d, bArr) && (b1Var == null || ak.a.c(this.f24179c, b1Var.a()))) {
            throw new IllegalArgumentException("cannot reuse nonce for ChaCha20Poly1305 encryption");
        }
        if (b1Var != null) {
            System.arraycopy(b1Var.a(), 0, this.f24179c, 0, 32);
        }
        System.arraycopy(bArr, 0, this.f24180d, 0, 12);
        this.f24177a.init(true, f1Var);
        this.f24186j = z10 ? 1 : 5;
        k(true, false);
    }

    @Override // vh.b
    public int processByte(byte b10, byte[] bArr, int i10) {
        d();
        int i11 = this.f24186j;
        if (i11 == 3) {
            byte[] bArr2 = this.f24181e;
            int i12 = this.f24187k;
            bArr2[i12] = b10;
            int i13 = i12 + 1;
            this.f24187k = i13;
            if (i13 != 64) {
                return 0;
            }
            j(bArr2, 0, 64, bArr, i10);
            this.f24178b.update(bArr, i10, 64);
            this.f24187k = 0;
            return 64;
        } else if (i11 != 7) {
            throw new IllegalStateException();
        } else {
            byte[] bArr3 = this.f24181e;
            int i14 = this.f24187k;
            bArr3[i14] = b10;
            int i15 = i14 + 1;
            this.f24187k = i15;
            if (i15 != bArr3.length) {
                return 0;
            }
            this.f24178b.update(bArr3, 0, 64);
            j(this.f24181e, 0, 64, bArr, i10);
            byte[] bArr4 = this.f24181e;
            System.arraycopy(bArr4, 64, bArr4, 0, 16);
            this.f24187k = 16;
            return 64;
        }
    }

    @Override // vh.b
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14 = i10;
        int i15 = i11;
        Objects.requireNonNull(bArr, "'in' cannot be null");
        if (i14 >= 0) {
            if (i15 < 0) {
                throw new IllegalArgumentException("'len' cannot be negative");
            }
            if (i14 > bArr.length - i15) {
                throw new org.bouncycastle.crypto.o("Input buffer too short");
            }
            if (i12 < 0) {
                throw new IllegalArgumentException("'outOff' cannot be negative");
            }
            d();
            int i16 = this.f24186j;
            if (i16 == 3) {
                if (this.f24187k != 0) {
                    while (i15 > 0) {
                        i15--;
                        byte[] bArr3 = this.f24181e;
                        int i17 = this.f24187k;
                        int i18 = i14 + 1;
                        bArr3[i17] = bArr[i14];
                        int i19 = i17 + 1;
                        this.f24187k = i19;
                        if (i19 == 64) {
                            j(bArr3, 0, 64, bArr2, i12);
                            this.f24178b.update(bArr2, i12, 64);
                            this.f24187k = 0;
                            i13 = 64;
                            i14 = i18;
                            break;
                        }
                        i14 = i18;
                    }
                }
                i13 = 0;
                while (i15 >= 64) {
                    int i20 = i12 + i13;
                    j(bArr, i14, 64, bArr2, i20);
                    this.f24178b.update(bArr2, i20, 64);
                    i14 += 64;
                    i15 -= 64;
                    i13 += 64;
                }
                if (i15 > 0) {
                    System.arraycopy(bArr, i14, this.f24181e, 0, i15);
                    this.f24187k = i15;
                }
            } else if (i16 != 7) {
                throw new IllegalStateException();
            } else {
                i13 = 0;
                for (int i21 = 0; i21 < i15; i21++) {
                    byte[] bArr4 = this.f24181e;
                    int i22 = this.f24187k;
                    bArr4[i22] = bArr[i14 + i21];
                    int i23 = i22 + 1;
                    this.f24187k = i23;
                    if (i23 == bArr4.length) {
                        this.f24178b.update(bArr4, 0, 64);
                        j(this.f24181e, 0, 64, bArr2, i12 + i13);
                        byte[] bArr5 = this.f24181e;
                        System.arraycopy(bArr5, 64, bArr5, 0, 16);
                        this.f24187k = 16;
                        i13 += 64;
                    }
                }
            }
            return i13;
        }
        throw new IllegalArgumentException("'inOff' cannot be negative");
    }
}
