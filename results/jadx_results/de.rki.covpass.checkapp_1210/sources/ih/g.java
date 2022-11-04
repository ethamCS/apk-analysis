package ih;

import gg.a0;
import gg.r;
import gg.t;
import gg.v;
/* loaded from: classes3.dex */
public class g extends t implements gg.f {

    /* renamed from: c */
    private a0 f12660c;

    private g(a0 a0Var) {
        this.f12660c = a0Var;
    }

    public g(r rVar) {
        this.f12660c = rVar;
    }

    public g(v vVar) {
        this.f12660c = vVar;
    }

    public g(i iVar) {
        this.f12660c = null;
        this.f12660c = iVar.b();
    }

    public static g l(Object obj) {
        if (obj == null || (obj instanceof g)) {
            return (g) obj;
        }
        if (obj instanceof a0) {
            return new g((a0) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new g(a0.u((byte[]) obj));
        } catch (Exception e10) {
            throw new IllegalArgumentException("unable to parse encoded data: " + e10.getMessage());
        }
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return this.f12660c;
    }

    public a0 m() {
        return this.f12660c;
    }

    public boolean n() {
        return this.f12660c instanceof r;
    }

    public boolean o() {
        return this.f12660c instanceof v;
    }
}
