package sj;

import hh.n0;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import nj.d;
/* loaded from: classes3.dex */
public class b implements Key, PublicKey {

    /* renamed from: c */
    private transient ij.b f21769c;

    public b(n0 n0Var) {
        b(n0Var);
    }

    private void b(n0 n0Var) {
        this.f21769c = (ij.b) nj.c.a(n0Var);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return ak.a.c(this.f21769c.b(), ((b) obj).f21769c.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f21769c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ak.a.F(this.f21769c.b());
    }
}
