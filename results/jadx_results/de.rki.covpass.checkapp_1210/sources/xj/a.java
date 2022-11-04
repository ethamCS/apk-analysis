package xj;

import fj.j;
import gg.e0;
import gg.v;
import java.io.IOException;
import java.security.PrivateKey;
import oj.s;
/* loaded from: classes3.dex */
public class a implements PrivateKey {

    /* renamed from: c */
    private transient v f25673c;

    /* renamed from: d */
    private transient s f25674d;

    /* renamed from: q */
    private transient e0 f25675q;

    public a(zg.s sVar) {
        b(sVar);
    }

    private void b(zg.s sVar) {
        this.f25675q = sVar.l();
        this.f25673c = j.m(sVar.o().o()).o().l();
        this.f25674d = (s) nj.a.b(sVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25673c.s(aVar.f25673c) && ak.a.c(this.f25674d.d(), aVar.f25674d.d());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return nj.b.a(this.f25674d, this.f25675q).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f25673c.hashCode() + (ak.a.F(this.f25674d.d()) * 37);
    }
}
