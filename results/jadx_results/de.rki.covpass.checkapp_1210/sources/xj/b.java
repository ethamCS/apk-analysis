package xj;

import gg.v;
import hh.n0;
import java.io.IOException;
import java.security.PublicKey;
import oj.t;
/* loaded from: classes3.dex */
public class b implements PublicKey {

    /* renamed from: c */
    private transient v f25676c;

    /* renamed from: d */
    private transient t f25677d;

    public b(n0 n0Var) {
        b(n0Var);
    }

    private void b(n0 n0Var) {
        t tVar = (t) nj.c.a(n0Var);
        this.f25677d = tVar;
        this.f25676c = e.a(tVar.b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25676c.s(bVar.f25676c) && ak.a.c(this.f25677d.f(), bVar.f25677d.f());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return nj.d.a(this.f25677d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f25676c.hashCode() + (ak.a.F(this.f25677d.f()) * 37);
    }
}
