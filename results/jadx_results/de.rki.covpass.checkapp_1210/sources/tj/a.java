package tj;

import gg.e0;
import java.io.IOException;
import java.security.PrivateKey;
import zg.s;
/* loaded from: classes3.dex */
public class a implements PrivateKey {

    /* renamed from: c */
    private transient jj.a f22460c;

    /* renamed from: d */
    private transient e0 f22461d;

    public a(s sVar) {
        b(sVar);
    }

    private void b(s sVar) {
        this.f22461d = sVar.l();
        this.f22460c = (jj.a) nj.a.b(sVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22460c.c() == aVar.f22460c.c() && ak.a.c(this.f22460c.b(), aVar.f22460c.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return jj.c.a(this.f22460c.c());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return nj.b.a(this.f22460c, this.f22461d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f22460c.c() + (ak.a.F(this.f22460c.b()) * 37);
    }
}
