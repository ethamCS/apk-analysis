package jh;

import hh.f;
import hh.v;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class c implements ak.d, Serializable {

    /* renamed from: q */
    private static hh.e[] f14355q = new hh.e[0];

    /* renamed from: c */
    private transient f f14356c;

    /* renamed from: d */
    private transient v f14357d;

    public c(f fVar) {
        b(fVar);
    }

    public c(byte[] bArr) {
        this(c(bArr));
    }

    private void b(f fVar) {
        this.f14356c = fVar;
        this.f14357d = fVar.l().n();
    }

    private static f c(byte[] bArr) {
        try {
            return f.m(b.a(bArr));
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
        if (obj instanceof c) {
            return this.f14356c.equals(((c) obj).f14356c);
        }
        return false;
    }

    @Override // ak.d
    public byte[] getEncoded() {
        return this.f14356c.getEncoded();
    }

    public int hashCode() {
        return this.f14356c.hashCode();
    }
}
