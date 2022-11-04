package rj;

import hh.n0;
import java.io.IOException;
import java.security.PublicKey;
/* loaded from: classes3.dex */
public class d implements PublicKey {

    /* renamed from: c */
    private hj.g f21256c;

    public d(hj.g gVar) {
        this.f21256c = gVar;
    }

    public zj.a b() {
        return this.f21256c.b();
    }

    public int c() {
        return this.f21256c.c();
    }

    public int e() {
        return this.f21256c.d();
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f21256c.c() == dVar.c() && this.f21256c.d() == dVar.e() && this.f21256c.b().equals(dVar.b());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new n0(new hh.b(fj.e.f10265m), new fj.d(this.f21256c.c(), this.f21256c.d(), this.f21256c.b())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f21256c.c() + (this.f21256c.d() * 37)) * 37) + this.f21256c.b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f21256c.c() + "\n") + " error correction capability: " + this.f21256c.d() + "\n") + " generator matrix           : " + this.f21256c.b();
    }
}
