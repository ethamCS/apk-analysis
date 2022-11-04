package rj;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.crypto.i;
import zg.s;
import zj.h;
/* loaded from: classes3.dex */
public class c implements i, PrivateKey {

    /* renamed from: c */
    private hj.f f21255c;

    public c(hj.f fVar) {
        this.f21255c = fVar;
    }

    public zj.b b() {
        return this.f21255c.b();
    }

    public zj.i c() {
        return this.f21255c.c();
    }

    public int e() {
        return this.f21255c.d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f() == cVar.f() && e() == cVar.e() && b().equals(cVar.b()) && c().equals(cVar.c()) && i().equals(cVar.i()) && g().equals(cVar.g()) && h().equals(cVar.h());
    }

    public int f() {
        return this.f21255c.e();
    }

    public h g() {
        return this.f21255c.f();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new s(new hh.b(fj.e.f10265m), new fj.c(this.f21255c.e(), this.f21255c.d(), this.f21255c.b(), this.f21255c.c(), this.f21255c.f(), this.f21255c.g(), this.f21255c.h())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public h h() {
        return this.f21255c.g();
    }

    public int hashCode() {
        return (((((((((((this.f21255c.d() * 37) + this.f21255c.e()) * 37) + this.f21255c.b().hashCode()) * 37) + this.f21255c.c().hashCode()) * 37) + this.f21255c.f().hashCode()) * 37) + this.f21255c.g().hashCode()) * 37) + this.f21255c.h().hashCode();
    }

    public zj.a i() {
        return this.f21255c.h();
    }
}
