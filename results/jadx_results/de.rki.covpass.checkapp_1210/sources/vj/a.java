package vj;

import fj.e;
import fj.h;
import gg.e0;
import gg.t1;
import gg.v;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import zg.s;
/* loaded from: classes3.dex */
public class a implements PrivateKey, Key {

    /* renamed from: c */
    private transient v f24384c;

    /* renamed from: d */
    private transient mj.b f24385d;

    /* renamed from: q */
    private transient e0 f24386q;

    public a(s sVar) {
        b(sVar);
    }

    private void b(s sVar) {
        this.f24386q = sVar.l();
        this.f24384c = h.l(sVar.o().o()).m().l();
        this.f24385d = (mj.b) nj.a.b(sVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24384c.s(aVar.f24384c) && ak.a.c(this.f24385d.c(), aVar.f24385d.c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.f24385d.b() != null ? nj.b.a(this.f24385d, this.f24386q) : new s(new hh.b(e.f10270r, new h(new hh.b(this.f24384c))), new t1(this.f24385d.c()), this.f24386q)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f24384c.hashCode() + (ak.a.F(this.f24385d.c()) * 37);
    }
}
