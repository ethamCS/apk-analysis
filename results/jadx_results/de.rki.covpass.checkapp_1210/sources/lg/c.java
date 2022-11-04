package lg;

import gg.a0;
import gg.d0;
import gg.h;
import gg.t;
import gg.t1;
import gg.v;
import gg.w;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class c extends t {

    /* renamed from: c */
    private w f16046c;

    /* renamed from: d */
    private v f16047d;

    private c(d0 d0Var) {
        Enumeration H = d0Var.H();
        this.f16046c = (w) H.nextElement();
        this.f16047d = (v) H.nextElement();
    }

    public c(byte[] bArr, v vVar) {
        this.f16046c = new t1(bArr);
        this.f16047d = vVar;
    }

    public static c n(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj == null) {
            return null;
        }
        return new c(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        h hVar = new h(2);
        hVar.a(this.f16046c);
        hVar.a(this.f16047d);
        return new x1(hVar);
    }

    public v l() {
        return this.f16047d;
    }

    public byte[] m() {
        return ak.a.h(this.f16046c.F());
    }
}
