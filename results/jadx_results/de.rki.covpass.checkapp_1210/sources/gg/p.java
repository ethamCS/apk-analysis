package gg;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class p extends FilterInputStream {

    /* renamed from: c */
    private final int f10870c;

    /* renamed from: d */
    private final boolean f10871d;

    /* renamed from: q */
    private final byte[][] f10872q;

    public p(InputStream inputStream) {
        this(inputStream, z2.a(inputStream));
    }

    public p(InputStream inputStream, int i10) {
        this(inputStream, i10, false);
    }

    public p(InputStream inputStream, int i10, boolean z10) {
        this(inputStream, i10, z10, new byte[11]);
    }

    private p(InputStream inputStream, int i10, boolean z10, byte[][] bArr) {
        super(inputStream);
        this.f10870c = i10;
        this.f10871d = z10;
        this.f10872q = bArr;
    }

    public p(InputStream inputStream, boolean z10) {
        this(inputStream, z2.a(inputStream), z10);
    }

    public p(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public p(byte[] bArr, boolean z10) {
        this(new ByteArrayInputStream(bArr), bArr.length, z10);
    }

    public static a0 h(int i10, s2 s2Var, byte[][] bArr) {
        switch (i10) {
            case 1:
                return e.C(j(s2Var, bArr));
            case 2:
                return q.C(s2Var.i());
            case 3:
                return c.C(s2Var.i());
            case 4:
                return w.C(s2Var.i());
            case 5:
                return r.C(s2Var.i());
            case 6:
                return v.D(j(s2Var, bArr), true);
            case 7:
                return u.C(s2Var.i());
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                throw new IOException("unknown tag " + i10 + " encountered");
            case 10:
                return i.C(j(s2Var, bArr), true);
            case 12:
                return m0.C(s2Var.i());
            case 13:
                return c0.C(s2Var.i(), false);
            case 18:
                return s.C(s2Var.i());
            case 19:
                return b0.C(s2Var.i());
            case 20:
                return h0.C(s2Var.i());
            case 21:
                return r0.C(s2Var.i());
            case 22:
                return o.C(s2Var.i());
            case 23:
                return l0.C(s2Var.i());
            case 24:
                return m.F(s2Var.i());
            case 25:
                return n.C(s2Var.i());
            case 26:
                return s0.C(s2Var.i());
            case 27:
                return l.C(s2Var.i());
            case 28:
                return n0.C(s2Var.i());
            case 30:
                return b.D(i(s2Var));
        }
    }

    private static char[] i(s2 s2Var) {
        int i10;
        int f10 = s2Var.f();
        if ((f10 & 1) == 0) {
            int i11 = f10 / 2;
            char[] cArr = new char[i11];
            byte[] bArr = new byte[8];
            int i12 = 0;
            int i13 = 0;
            while (f10 >= 8) {
                if (ck.b.g(s2Var, bArr, 0, 8) != 8) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                cArr[i13] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
                cArr[i13 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
                cArr[i13 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
                cArr[i13 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
                i13 += 4;
                f10 -= 8;
            }
            if (f10 > 0) {
                if (ck.b.g(s2Var, bArr, 0, f10) != f10) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                while (true) {
                    int i14 = i12 + 1;
                    int i15 = i14 + 1;
                    i10 = i13 + 1;
                    cArr[i13] = (char) ((bArr[i12] << 8) | (bArr[i14] & 255));
                    if (i15 >= f10) {
                        break;
                    }
                    i12 = i15;
                    i13 = i10;
                }
                i13 = i10;
            }
            if (s2Var.f() != 0 || i11 != i13) {
                throw new IllegalStateException();
            }
            return cArr;
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    private static byte[] j(s2 s2Var, byte[][] bArr) {
        int f10 = s2Var.f();
        if (f10 >= bArr.length) {
            return s2Var.i();
        }
        byte[] bArr2 = bArr[f10];
        if (bArr2 == null) {
            bArr2 = new byte[f10];
            bArr[f10] = bArr2;
        }
        s2Var.h(bArr2);
        return bArr2;
    }

    public static int r(InputStream inputStream, int i10, boolean z10) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == read) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i11 = read & 127;
        int i12 = 0;
        int i13 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i12 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i12 = (i12 << 8) + read2;
            i13++;
        } while (i13 < i11);
        if (i12 < i10 || z10) {
            return i12;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i12 + " >= " + i10);
    }

    public static int u(InputStream inputStream, int i10) {
        int i11 = i10 & 31;
        if (i11 == 31) {
            int i12 = 0;
            int read = inputStream.read();
            if (read < 31) {
                if (read >= 0) {
                    throw new IOException("corrupted stream - high tag number < 31 found");
                }
                throw new EOFException("EOF found inside tag value.");
            } else if ((read & 127) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            } else {
                while ((read & 128) != 0) {
                    if ((i12 >>> 24) != 0) {
                        throw new IOException("Tag number more than 31 bits");
                    }
                    i12 = (i12 | (read & 127)) << 7;
                    read = inputStream.read();
                    if (read < 0) {
                        throw new EOFException("EOF found inside tag value.");
                    }
                }
                return i12 | (read & 127);
            }
        }
        return i11;
    }

    public h B() {
        a0 s10 = s();
        if (s10 == null) {
            return new h(0);
        }
        h hVar = new h();
        do {
            hVar.a(s10);
            s10 = s();
        } while (s10 != null);
        return hVar;
    }

    h G(s2 s2Var) {
        int f10 = s2Var.f();
        return f10 < 1 ? new h(0) : new p(s2Var, f10, this.f10871d, this.f10872q).B();
    }

    c b(h hVar) {
        int f10 = hVar.f();
        c[] cVarArr = new c[f10];
        for (int i10 = 0; i10 != f10; i10++) {
            g d10 = hVar.d(i10);
            if (!(d10 instanceof c)) {
                throw new j("unknown object encountered in constructed BIT STRING: " + d10.getClass());
            }
            cVarArr[i10] = (c) d10;
        }
        return new v0(cVarArr);
    }

    w e(h hVar) {
        int f10 = hVar.f();
        w[] wVarArr = new w[f10];
        for (int i10 = 0; i10 != f10; i10++) {
            g d10 = hVar.d(i10);
            if (!(d10 instanceof w)) {
                throw new j("unknown object encountered in constructed OCTET STRING: " + d10.getClass());
            }
            wVarArr[i10] = (w) d10;
        }
        return new y0(wVarArr);
    }

    protected a0 f(int i10, int i11, int i12) {
        s2 s2Var = new s2(this, i12, this.f10870c);
        if ((i10 & 224) == 0) {
            return h(i11, s2Var, this.f10872q);
        }
        int i13 = i10 & 192;
        boolean z10 = true;
        if (i13 != 0) {
            if ((i10 & 32) == 0) {
                z10 = false;
            }
            return z(i13, i11, z10, s2Var);
        } else if (i11 == 3) {
            return b(G(s2Var));
        } else {
            if (i11 == 4) {
                return e(G(s2Var));
            }
            if (i11 == 8) {
                return j2.a(G(s2Var)).K();
            }
            if (i11 == 16) {
                return s2Var.f() < 1 ? j2.f10841a : this.f10871d ? new w2(s2Var.i()) : j2.a(G(s2Var));
            } else if (i11 == 17) {
                return j2.b(G(s2Var));
            } else {
                throw new IOException("unknown tag " + i11 + " encountered");
            }
        }
    }

    public int n() {
        return this.f10870c;
    }

    protected int p() {
        return r(this, this.f10870c, false);
    }

    public a0 s() {
        int read = read();
        if (read <= 0) {
            if (read == 0) {
                throw new IOException("unexpected end-of-contents marker");
            }
            return null;
        }
        int u10 = u(this, read);
        int p10 = p();
        if (p10 >= 0) {
            try {
                return f(read, u10, p10);
            } catch (IllegalArgumentException e10) {
                throw new j("corrupted stream detected", e10);
            }
        } else if ((read & 32) == 0) {
            throw new IOException("indefinite-length primitive encoding encountered");
        } else {
            f0 f0Var = new f0(new u2(this, this.f10870c), this.f10870c, this.f10872q);
            int i10 = read & 192;
            if (i10 != 0) {
                return f0Var.c(i10, u10);
            }
            if (u10 == 3) {
                return w0.c(f0Var);
            }
            if (u10 == 4) {
                return z0.c(f0Var);
            }
            if (u10 == 8) {
                return m1.c(f0Var);
            }
            if (u10 == 16) {
                return b1.c(f0Var);
            }
            if (u10 != 17) {
                throw new IOException("unknown BER object encountered");
            }
            return d1.c(f0Var);
        }
    }

    a0 z(int i10, int i11, boolean z10, s2 s2Var) {
        return !z10 ? j0.F(i10, i11, s2Var.i()) : j0.D(i10, i11, G(s2Var));
    }
}
