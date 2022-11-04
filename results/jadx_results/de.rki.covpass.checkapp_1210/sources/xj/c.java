package xj;

import fj.i;
import gg.e0;
import gg.v;
import java.io.IOException;
import java.security.PrivateKey;
import oj.y;
import zg.s;
/* loaded from: classes3.dex */
public class c implements PrivateKey {

    /* renamed from: c */
    private transient y f25678c;

    /* renamed from: d */
    private transient v f25679d;

    /* renamed from: q */
    private transient e0 f25680q;

    public c(s sVar) {
        b(sVar);
    }

    private void b(s sVar) {
        this.f25680q = sVar.l();
        this.f25679d = i.m(sVar.o().o()).n().l();
        this.f25678c = (y) nj.a.b(sVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25679d.s(cVar.f25679d) && ak.a.c(this.f25678c.d(), cVar.f25678c.d());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return nj.b.a(this.f25678c, this.f25680q).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f25679d.hashCode() + (ak.a.F(this.f25678c.d()) * 37);
    }
}
