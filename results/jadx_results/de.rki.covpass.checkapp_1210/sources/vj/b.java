package vj;

import fj.e;
import fj.h;
import gg.v;
import hh.n0;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import nj.d;
/* loaded from: classes3.dex */
public class b implements PublicKey, Key {

    /* renamed from: c */
    private transient v f24387c;

    /* renamed from: d */
    private transient mj.c f24388d;

    public b(n0 n0Var) {
        b(n0Var);
    }

    private void b(n0 n0Var) {
        this.f24387c = h.l(n0Var.l().o()).m().l();
        this.f24388d = (mj.c) nj.c.a(n0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24387c.s(bVar.f24387c) && ak.a.c(this.f24388d.c(), bVar.f24388d.c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.f24388d.b() != null ? d.a(this.f24388d) : new n0(new hh.b(e.f10270r, new h(new hh.b(this.f24387c))), this.f24388d.c())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f24387c.hashCode() + (ak.a.F(this.f24388d.c()) * 37);
    }
}
