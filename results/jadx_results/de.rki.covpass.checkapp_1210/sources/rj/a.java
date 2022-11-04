package rj;

import java.io.IOException;
import java.security.PrivateKey;
import zg.s;
import zj.h;
import zj.i;
/* loaded from: classes3.dex */
public class a implements PrivateKey {

    /* renamed from: c */
    private hj.b f21253c;

    public a(hj.b bVar) {
        this.f21253c = bVar;
    }

    public zj.b b() {
        return this.f21253c.c();
    }

    public i c() {
        return this.f21253c.d();
    }

    public zj.a e() {
        return this.f21253c.e();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g() == aVar.g() && f() == aVar.f() && b().equals(aVar.b()) && c().equals(aVar.c()) && h().equals(aVar.h()) && e().equals(aVar.e());
    }

    public int f() {
        return this.f21253c.f();
    }

    public int g() {
        return this.f21253c.g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new s(new hh.b(fj.e.f10266n), new fj.a(g(), f(), b(), c(), h(), g.a(this.f21253c.b()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public h h() {
        return this.f21253c.h();
    }

    public int hashCode() {
        return (((((((((this.f21253c.f() * 37) + this.f21253c.g()) * 37) + this.f21253c.c().hashCode()) * 37) + this.f21253c.d().hashCode()) * 37) + this.f21253c.h().hashCode()) * 37) + this.f21253c.e().hashCode();
    }
}
