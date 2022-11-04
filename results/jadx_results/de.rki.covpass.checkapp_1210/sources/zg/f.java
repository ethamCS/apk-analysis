package zg;

import gg.a0;
import gg.a1;
import gg.d0;
import gg.e1;
import gg.j0;
import gg.l2;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class f extends gg.t implements q {

    /* renamed from: c */
    private gg.v f26762c;

    /* renamed from: d */
    private gg.g f26763d;

    /* renamed from: q */
    private boolean f26764q;

    private f(d0 d0Var) {
        this.f26764q = true;
        Enumeration H = d0Var.H();
        this.f26762c = (gg.v) H.nextElement();
        if (H.hasMoreElements()) {
            this.f26763d = ((j0) H.nextElement()).O();
        }
        this.f26764q = d0Var instanceof a1;
    }

    public f(gg.v vVar, gg.g gVar) {
        this.f26764q = true;
        this.f26762c = vVar;
        this.f26763d = gVar;
    }

    public static f n(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj == null) {
            return null;
        }
        return new f(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f26762c);
        gg.g gVar = this.f26763d;
        if (gVar != null) {
            hVar.a(new e1(true, 0, gVar));
        }
        return this.f26764q ? new a1(hVar) : new l2(hVar);
    }

    public gg.g l() {
        return this.f26763d;
    }

    public gg.v m() {
        return this.f26762c;
    }
}
