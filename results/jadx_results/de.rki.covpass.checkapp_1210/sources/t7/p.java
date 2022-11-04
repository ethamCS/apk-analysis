package t7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Comparator;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class p {

    /* renamed from: f */
    private static final byte[] f21989f = new byte[0];

    /* renamed from: a */
    private final InputStream f21990a;

    /* renamed from: b */
    private final g f21991b;

    /* renamed from: c */
    private int f21992c;

    /* renamed from: d */
    private c0 f21993d;

    /* renamed from: e */
    private boolean f21994e;

    public p(InputStream inputStream, g gVar) {
        this.f21990a = inputStream;
        this.f21991b = gVar;
    }

    private void a(long j10) {
        int i10 = j10 >= 257 ? 257 : j10 < 0 ? 0 : (int) j10;
        if (i10 == 25) {
            if (this.f21993d == null) {
                throw new h("No stringref namespace");
            }
        } else if (i10 != 256) {
            if (i10 != 28 && i10 != 29) {
                return;
            }
            this.f21994e = true;
        } else {
            c0 c0Var = this.f21993d;
            if (c0Var == null) {
                c0Var = new c0();
            }
            this.f21993d = c0Var;
            c0Var.d();
        }
    }

    private o b(byte[] bArr, int i10) {
        o f02 = o.f0(bArr);
        c0 c0Var = this.f21993d;
        if (c0Var != null) {
            c0Var.a(f02, i10);
        }
        return f02;
    }

    private o c(byte[] bArr, int i10) {
        o T = bArr.length == 0 ? o.T(BuildConfig.FLAVOR) : o.g0(bArr);
        c0 c0Var = this.f21993d;
        if (c0Var != null) {
            c0Var.a(T, i10);
        }
        return T;
    }

    private static byte[] e(InputStream inputStream, long j10, OutputStream outputStream) {
        Throwable th2;
        if (j10 == 0) {
            return f21989f;
        }
        if ((j10 >> 63) != 0 || j10 > 2147483647L) {
            throw new h("Length" + m(j10) + " is bigger than supported ");
        } else if (z.d(inputStream, j10)) {
            throw new h("Premature end of stream");
        } else {
            ByteArrayOutputStream byteArrayOutputStream = null;
            if (j10 <= 65536) {
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                if (inputStream.read(bArr, 0, i10) != i10) {
                    throw new h("Premature end of stream");
                }
                if (outputStream == null) {
                    return bArr;
                }
                outputStream.write(bArr, 0, i10);
                return null;
            }
            byte[] bArr2 = new byte[65536];
            int i11 = (int) j10;
            if (outputStream != null) {
                while (i11 > 0) {
                    int min = Math.min(65536, i11);
                    if (inputStream.read(bArr2, 0, min) != min) {
                        throw new h("Premature end of stream");
                    }
                    outputStream.write(bArr2, 0, min);
                    i11 -= min;
                }
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(65536);
                while (i11 > 0) {
                    try {
                        int min2 = Math.min(65536, i11);
                        if (inputStream.read(bArr2, 0, min2) != min2) {
                            throw new h("Premature end of stream");
                        }
                        byteArrayOutputStream2.write(bArr2, 0, min2);
                        i11 -= min2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th2;
                    }
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException unused2) {
                }
                return byteArray;
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    private static long f(InputStream inputStream, int i10, int i11) {
        return g(inputStream, i10, i11, true);
    }

    private static long g(InputStream inputStream, int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            if (((i10 >> 5) & 7) != i11) {
                throw new h("Unexpected data encountered");
            }
            int i12 = i10 & 31;
            if (i12 < 24) {
                return i12;
            }
            byte[] bArr = new byte[8];
            switch (i12) {
                case 24:
                    int read = inputStream.read();
                    if (read < 0) {
                        throw new h("Premature end of data");
                    }
                    if (!z10 && read < 24) {
                        throw new h("Non-shortest CBOR form");
                    }
                    return read;
                case 25:
                    if (inputStream.read(bArr, 0, 2) != 2) {
                        throw new h("Premature end of data");
                    }
                    int i13 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                    if (!z10 && i13 < 256) {
                        throw new h("Non-shortest CBOR form");
                    }
                    return i13;
                case 26:
                    if (inputStream.read(bArr, 0, 4) != 4) {
                        throw new h("Premature end of data");
                    }
                    long j10 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (!z10 && (j10 >> 16) == 0) {
                        throw new h("Non-shortest CBOR form");
                    }
                    return j10;
                case 27:
                    if (inputStream.read(bArr, 0, 8) != 8) {
                        throw new h("Premature end of data");
                    }
                    long j11 = ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
                    if (!z10 && (j11 >> 32) == 0) {
                        throw new h("Non-shortest CBOR form");
                    }
                    return j11;
                case 28:
                case 29:
                case 30:
                    throw new h("Unexpected data encountered");
                case 31:
                    throw new h("Indefinite-length data not allowed here");
                default:
                    return i12;
            }
        }
        throw new h("Unexpected data encountered");
    }

    private o i() {
        if (this.f21992c <= 500) {
            int read = this.f21990a.read();
            if (read < 0) {
                throw new h("Premature end of data");
            }
            return h(read);
        }
        throw new h("Too deeply nested");
    }

    private o j() {
        if (this.f21992c <= 500) {
            int read = this.f21990a.read();
            if (read >= 0) {
                return h(read);
            }
            return null;
        }
        throw new h("Too deeply nested");
    }

    private o k(int i10, long j10) {
        this.f21991b.c();
        o oVar = null;
        long j11 = 0;
        if (i10 == 2 || i10 == 3) {
            if ((j10 >> 31) != 0) {
                throw new h("Length of " + m(j10).toString() + " is bigger than supported");
            }
            int i11 = (j10 > 2147483647L || (j10 >> 63) != 0) ? Integer.MAX_VALUE : (int) j10;
            byte[] e10 = e(this.f21990a, j10, null);
            if (i10 != 3) {
                return b(e10, i11);
            }
            if (!t.g(e10)) {
                throw new h("Invalid UTF-8");
            }
            return c(e10, i11);
        } else if (i10 == 4) {
            if (this.f21991b.c() && this.f21992c >= 4) {
                throw new h("Depth too high in canonical CBOR");
            }
            o D0 = o.D0();
            if ((j10 >> 31) != 0) {
                throw new h("Length of " + m(j10).toString() + " is bigger than supported");
            } else if (z.d(this.f21990a, j10)) {
                throw new h("Remaining data too small for array length");
            } else {
                this.f21992c++;
                while (j11 < j10) {
                    D0.d(i());
                    j11++;
                }
                this.f21992c--;
                return D0;
            }
        } else if (i10 != 5) {
            return null;
        } else {
            if (this.f21991b.c() && this.f21992c >= 4) {
                throw new h("Depth too high in canonical CBOR");
            }
            o H0 = this.f21991b.e() ? o.H0() : o.G0();
            if ((j10 >> 31) != 0) {
                throw new h("Length of " + m(j10).toString() + " is bigger than supported");
            } else if (z.d(this.f21990a, j10)) {
                throw new h("Remaining data too small for map length");
            } else {
                Comparator<o> comparator = b.f21931a;
                while (j11 < j10) {
                    this.f21992c++;
                    o i12 = i();
                    o i13 = i();
                    this.f21992c--;
                    if (this.f21991b.c() && oVar != null) {
                        int compare = comparator.compare(oVar, i12);
                        if (compare > 0) {
                            throw new h("Map key not in canonical order");
                        }
                        if (compare == 0) {
                            throw new h("Duplicate map key");
                        }
                    }
                    if (!this.f21991b.a() && H0.E(i12)) {
                        throw new h("Duplicate key already exists");
                    }
                    H0.C1(i12, i13);
                    j11++;
                    oVar = i12;
                }
                return H0;
            }
        }
    }

    private static o l(o oVar, a0 a0Var) {
        if (oVar == null) {
            return null;
        }
        q s12 = oVar.s1();
        if (oVar.v0(29)) {
            o P0 = oVar.P0();
            if (!P0.x1() && P0.s1() == q.Integer && !P0.r().z()) {
                return a0Var.b(P0.h());
            }
            throw new h("Shared ref index must be an untagged integer 0 or greater");
        }
        if (oVar.v0(28)) {
            oVar = oVar.P0();
            a0Var.a(oVar);
        }
        if (s12 == q.Map) {
            for (o oVar2 : oVar.n1()) {
                o k12 = oVar.k1(oVar2);
                o l10 = l(k12, a0Var);
                if (k12 != l10) {
                    oVar.C1(oVar2, l10);
                }
            }
        } else if (s12 == q.Array) {
            for (int i10 = 0; i10 < oVar.D1(); i10++) {
                oVar.A1(i10, l(oVar.j1(i10), a0Var));
            }
        }
        return oVar;
    }

    private static u7.f m(long j10) {
        u7.f Z = u7.f.Z(Long.MAX_VALUE & j10);
        return (j10 >> 63) != 0 ? Z.d(u7.f.Y(1).a1(63)) : Z;
    }

    public o d() {
        o j10 = this.f21991b.b() ? j() : i();
        return (!this.f21991b.f() || !this.f21994e) ? j10 : l(j10, new a0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x021b, code lost:
        throw new t7.h("Length" + m(r10) + " is bigger than supported");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t7.o h(int r21) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.p.h(int):t7.o");
    }
}
