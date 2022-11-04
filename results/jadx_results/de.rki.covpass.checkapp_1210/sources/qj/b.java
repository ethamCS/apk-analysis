package qj;

import gj.g;
import hh.n0;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import nj.d;
/* loaded from: classes3.dex */
public class b implements PublicKey, Key {

    /* renamed from: c */
    private transient g f20260c;

    public b(n0 n0Var) {
        b(n0Var);
    }

    private void b(n0 n0Var) {
        this.f20260c = (g) nj.c.a(n0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            try {
                return ak.a.c(this.f20260c.getEncoded(), ((b) obj).f20260c.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f20260c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return ak.a.F(this.f20260c.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
