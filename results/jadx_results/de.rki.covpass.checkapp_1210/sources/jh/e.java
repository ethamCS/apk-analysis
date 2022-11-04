package jh;

import hh.n;
import hh.v;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class e implements ak.d, Serializable {

    /* renamed from: c */
    private transient n f14362c;

    /* renamed from: d */
    private transient v f14363d;

    public e(n nVar) {
        b(nVar);
    }

    public e(byte[] bArr) {
        this(c(bArr));
    }

    private void b(n nVar) {
        this.f14362c = nVar;
        this.f14363d = nVar.C().m();
    }

    private static n c(byte[] bArr) {
        try {
            return n.n(b.a(bArr));
        } catch (ClassCastException e10) {
            throw new a("malformed data: " + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new a("malformed data: " + e11.getMessage(), e11);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f14362c.equals(((e) obj).f14362c);
        }
        return false;
    }

    @Override // ak.d
    public byte[] getEncoded() {
        return this.f14362c.getEncoded();
    }

    public int hashCode() {
        return this.f14362c.hashCode();
    }
}
