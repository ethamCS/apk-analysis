package rj;

import hh.n0;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.crypto.i;
/* loaded from: classes3.dex */
public class b implements i, PublicKey {

    /* renamed from: c */
    private hj.c f21254c;

    public b(hj.c cVar) {
        this.f21254c = cVar;
    }

    public zj.a b() {
        return this.f21254c.c();
    }

    public int c() {
        return this.f21254c.d();
    }

    public int e() {
        return this.f21254c.e();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21254c.d() == bVar.c() && this.f21254c.e() == bVar.e() && this.f21254c.c().equals(bVar.b());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new n0(new hh.b(fj.e.f10266n), new fj.b(this.f21254c.d(), this.f21254c.e(), this.f21254c.c(), g.a(this.f21254c.b()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f21254c.d() + (this.f21254c.e() * 37)) * 37) + this.f21254c.c().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f21254c.d() + "\n") + " error correction capability: " + this.f21254c.e() + "\n") + " generator matrix           : " + this.f21254c.c().toString();
    }
}
