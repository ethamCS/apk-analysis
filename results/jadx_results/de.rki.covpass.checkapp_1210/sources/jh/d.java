package jh;

import gg.a0;
import gg.p;
import hh.b0;
import hh.o;
import hh.u;
import hh.v;
import hh.w;
import hh.x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class d implements ak.d, Serializable {

    /* renamed from: c */
    private transient o f14358c;

    /* renamed from: d */
    private transient boolean f14359d;

    /* renamed from: q */
    private transient v f14360q;

    /* renamed from: x */
    private transient x f14361x;

    public d(o oVar) {
        b(oVar);
    }

    public d(byte[] bArr) {
        this(e(new ByteArrayInputStream(bArr)));
    }

    private void b(o oVar) {
        this.f14358c = oVar;
        v l10 = oVar.s().l();
        this.f14360q = l10;
        this.f14359d = c(l10);
        this.f14361x = new x(new w(oVar.m()));
    }

    private static boolean c(v vVar) {
        u l10;
        return (vVar == null || (l10 = vVar.l(u.f12049e4)) == null || !b0.o(l10.q()).r()) ? false : true;
    }

    private static o e(InputStream inputStream) {
        try {
            a0 s10 = new p(inputStream, true).s();
            if (s10 == null) {
                throw new IOException("no content found");
            }
            return o.l(s10);
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
        if (obj instanceof d) {
            return this.f14358c.equals(((d) obj).f14358c);
        }
        return false;
    }

    @Override // ak.d
    public byte[] getEncoded() {
        return this.f14358c.getEncoded();
    }

    public int hashCode() {
        return this.f14358c.hashCode();
    }
}
