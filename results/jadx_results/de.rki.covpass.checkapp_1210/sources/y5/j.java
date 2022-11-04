package y5;

import f6.a0;
import f6.c0;
import f6.i0;
import f6.y;
import f6.z;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class j {
    @GuardedBy("this")

    /* renamed from: a */
    private final c0.b f25824a;

    private j(c0.b bVar) {
        this.f25824a = bVar;
    }

    private synchronized boolean d(int i10) {
        boolean z10;
        Iterator<c0.c> it = this.f25824a.E().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (it.next().T() == i10) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    private synchronized c0.c e(a0 a0Var) {
        y p10;
        int f10;
        i0 S;
        p10 = r.p(a0Var);
        f10 = f();
        S = a0Var.S();
        if (S == i0.UNKNOWN_PREFIX) {
            S = i0.TINK;
        }
        return c0.c.X().B(p10).C(f10).E(z.ENABLED).D(S).b();
    }

    private synchronized int f() {
        int g10;
        do {
            g10 = g();
        } while (d(g10));
        return g10;
    }

    private static int g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i10 = 0;
        while (i10 == 0) {
            secureRandom.nextBytes(bArr);
            i10 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i10;
    }

    public static j i() {
        return new j(c0.W());
    }

    public static j j(i iVar) {
        return new j(iVar.f().g());
    }

    public synchronized j a(g gVar) {
        b(gVar.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(a0 a0Var, boolean z10) {
        c0.c e10;
        e10 = e(a0Var);
        this.f25824a.B(e10);
        if (z10) {
            this.f25824a.F(e10.T());
        }
        return e10.T();
    }

    public synchronized i c() {
        return i.e(this.f25824a.b());
    }

    public synchronized j h(int i10) {
        for (int i11 = 0; i11 < this.f25824a.D(); i11++) {
            c0.c C = this.f25824a.C(i11);
            if (C.T() == i10) {
                if (!C.V().equals(z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                } else {
                    this.f25824a.F(i10);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}
