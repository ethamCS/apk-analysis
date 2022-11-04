package tj;

import hh.n0;
import java.io.IOException;
import java.security.PublicKey;
import nj.d;
/* loaded from: classes3.dex */
public class b implements PublicKey {

    /* renamed from: c */
    private transient jj.b f22462c;

    public b(n0 n0Var) {
        b(n0Var);
    }

    private void b(n0 n0Var) {
        this.f22462c = (jj.b) nj.c.a(n0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f22462c.c() == bVar.f22462c.c() && ak.a.c(this.f22462c.b(), bVar.f22462c.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return jj.c.a(this.f22462c.c());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f22462c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f22462c.c() + (ak.a.F(this.f22462c.b()) * 37);
    }
}
