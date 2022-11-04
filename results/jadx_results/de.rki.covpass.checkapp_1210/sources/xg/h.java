package xg;

import gg.a0;
import gg.a2;
import gg.t;
import gg.x1;
import hh.v;
/* loaded from: classes3.dex */
public class h extends t {

    /* renamed from: c */
    b f25632c;

    /* renamed from: d */
    v f25633d;

    public h(b bVar, v vVar) {
        this.f25632c = bVar;
        this.f25633d = vVar;
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f25632c);
        v vVar = this.f25633d;
        if (vVar != null) {
            hVar.a(new a2(true, 0, vVar));
        }
        return new x1(hVar);
    }
}
