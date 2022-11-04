package hl;

import rk.c0;
import rk.e0;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a */
    e0 f12232a;

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends b<T>> T a(b bVar) {
        if (bVar.getType() == this.f12232a) {
            return bVar;
        }
        if (!bVar.getType().j() && this.f12232a.j()) {
            System.err.println("\n***** WARNING *****\n");
            System.err.println("Converting a sparse to dense matrix automatically.");
            System.err.println("Current auto convert code isn't that smart and this might have been available");
        }
        c0 a10 = gl.b.a(bVar.f12233c, this.f12232a);
        if (a10 != null) {
            return (T) bVar.k(a10);
        }
        throw new IllegalArgumentException("Conversion from " + bVar.getType() + " to " + this.f12232a + " not possible");
    }

    public void b(b... bVarArr) {
        int i10 = 32;
        boolean z10 = true;
        boolean z11 = false;
        for (b bVar : bVarArr) {
            e0 type = bVar.f12233c.getType();
            if (type.j()) {
                z11 = true;
            }
            if (!type.p()) {
                z10 = false;
            }
            if (type.g() == 64) {
                i10 = 64;
            }
        }
        this.f12232a = e0.r(z11, z10, i10);
    }
}
