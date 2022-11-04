package ig;

import gg.a0;
import gg.d0;
import gg.t;
import gg.x1;
/* loaded from: classes3.dex */
public class g extends t {

    /* renamed from: c */
    private final gg.g f12603c;

    /* renamed from: d */
    private final i f12604d;

    private g(d0 d0Var) {
        if (d0Var.size() == 2) {
            gg.g G = d0Var.G(0);
            if (!(G instanceof b) && !(G instanceof h)) {
                d0 F = d0.F(G);
                G = F.size() == 2 ? b.n(F) : h.m(F);
            }
            this.f12603c = G;
            this.f12604d = i.l(d0Var.G(1));
            return;
        }
        throw new IllegalArgumentException("malformed sequence");
    }

    public g(b bVar, i iVar) {
        this.f12603c = bVar;
        this.f12604d = iVar;
    }

    public static g l(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj == null) {
            return null;
        }
        return new g(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f12603c);
        hVar.a(this.f12604d);
        return new x1(hVar);
    }

    public i m() {
        return this.f12604d;
    }

    public gg.g n() {
        return this.f12603c;
    }
}
