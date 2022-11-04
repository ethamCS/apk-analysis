package gg;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: a */
    private final InputStream f10808a;

    /* renamed from: b */
    private final int f10809b;

    /* renamed from: c */
    private final byte[][] f10810c;

    public f0(InputStream inputStream, int i10, byte[][] bArr) {
        this.f10808a = inputStream;
        this.f10809b = i10;
        this.f10810c = bArr;
    }

    private void i(boolean z10) {
        InputStream inputStream = this.f10808a;
        if (inputStream instanceof u2) {
            ((u2) inputStream).h(z10);
        }
    }

    g a(int i10) {
        boolean z10 = false;
        i(false);
        int u10 = p.u(this.f10808a, i10);
        int r10 = p.r(this.f10808a, this.f10809b, u10 == 3 || u10 == 4 || u10 == 16 || u10 == 17 || u10 == 8);
        if (r10 < 0) {
            if ((i10 & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            f0 f0Var = new f0(new u2(this.f10808a, this.f10809b), this.f10809b, this.f10810c);
            int i11 = i10 & 192;
            return i11 != 0 ? 64 == i11 ? new u0(u10, f0Var) : new f1(i11, u10, f0Var) : f0Var.e(u10);
        }
        s2 s2Var = new s2(this.f10808a, r10, this.f10809b);
        if ((i10 & 224) == 0) {
            return f(u10, s2Var);
        }
        f0 f0Var2 = new f0(s2Var, s2Var.b(), this.f10810c);
        int i12 = i10 & 192;
        if (i12 == 0) {
            return f0Var2.d(u10);
        }
        if ((i10 & 32) != 0) {
            z10 = true;
        }
        return 64 == i12 ? (f2) f0Var2.b(i12, u10, z10) : new q2(i12, u10, z10, f0Var2);
    }

    public a0 b(int i10, int i11, boolean z10) {
        return !z10 ? j0.F(i10, i11, ((s2) this.f10808a).i()) : j0.D(i10, i11, h());
    }

    public a0 c(int i10, int i11) {
        return j0.E(i10, i11, h());
    }

    g d(int i10) {
        if (i10 != 3) {
            if (i10 == 4) {
                return new z0(this);
            }
            if (i10 == 8) {
                return new m1(this);
            }
            if (i10 == 16) {
                return new m2(this);
            }
            if (i10 == 17) {
                return new o2(this);
            }
            throw new j("unknown DL object encountered: 0x" + Integer.toHexString(i10));
        }
        return new w0(this);
    }

    g e(int i10) {
        if (i10 != 3) {
            if (i10 == 4) {
                return new z0(this);
            }
            if (i10 == 8) {
                return new m1(this);
            }
            if (i10 == 16) {
                return new b1(this);
            }
            if (i10 == 17) {
                return new d1(this);
            }
            throw new j("unknown BER object encountered: 0x" + Integer.toHexString(i10));
        }
        return new w0(this);
    }

    g f(int i10, s2 s2Var) {
        if (i10 != 3) {
            if (i10 == 4) {
                return new u1(s2Var);
            }
            if (i10 == 8) {
                throw new j("externals must use constructed encoding (see X.690 8.18)");
            }
            if (i10 == 16) {
                throw new j("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (i10 == 17) {
                throw new j("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return p.h(i10, s2Var, this.f10810c);
            } catch (IllegalArgumentException e10) {
                throw new j("corrupted stream detected", e10);
            }
        }
        return new h2(s2Var);
    }

    public g g() {
        int read = this.f10808a.read();
        if (read < 0) {
            return null;
        }
        return a(read);
    }

    public h h() {
        int read = this.f10808a.read();
        if (read < 0) {
            return new h(0);
        }
        h hVar = new h();
        do {
            g a10 = a(read);
            hVar.a(a10 instanceof t2 ? ((t2) a10).e() : a10.b());
            read = this.f10808a.read();
        } while (read >= 0);
        return hVar;
    }
}
