package xj;

import gg.v;
import hh.n0;
import java.io.IOException;
import java.security.PublicKey;
import oj.z;
/* loaded from: classes3.dex */
public class d implements PublicKey {

    /* renamed from: c */
    private transient z f25681c;

    /* renamed from: d */
    private transient v f25682d;

    public d(n0 n0Var) {
        b(n0Var);
    }

    private void b(n0 n0Var) {
        z zVar = (z) nj.c.a(n0Var);
        this.f25681c = zVar;
        this.f25682d = e.a(zVar.b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            try {
                if (this.f25682d.s(dVar.f25682d)) {
                    if (ak.a.c(this.f25681c.getEncoded(), dVar.f25681c.getEncoded())) {
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return nj.d.a(this.f25681c).getEncoded();
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
            return this.f25682d.hashCode() + (ak.a.F(this.f25681c.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.f25682d.hashCode();
        }
    }
}
