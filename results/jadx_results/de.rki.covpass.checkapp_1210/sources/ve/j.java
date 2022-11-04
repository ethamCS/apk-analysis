package ve;

import oe.e0;
import uc.j;
import ve.f;
import xc.j1;
import xc.y;
/* loaded from: classes3.dex */
final class j implements f {

    /* renamed from: a */
    public static final j f24040a = new j();

    /* renamed from: b */
    private static final String f24041b = "second parameter must be of type KProperty<*> or its supertype";

    private j() {
    }

    @Override // ve.f
    public String a() {
        return f24041b;
    }

    @Override // ve.f
    public boolean b(y yVar) {
        hc.t.e(yVar, "functionDescriptor");
        j1 j1Var = yVar.o().get(1);
        j.b bVar = uc.j.Companion;
        hc.t.d(j1Var, "secondParameter");
        e0 a10 = bVar.a(ee.a.l(j1Var));
        if (a10 != null) {
            e0 type = j1Var.getType();
            hc.t.d(type, "secondParameter.type");
            return te.a.o(a10, te.a.s(type));
        }
        return false;
    }

    @Override // ve.f
    public String c(y yVar) {
        return f.a.a(this, yVar);
    }
}
