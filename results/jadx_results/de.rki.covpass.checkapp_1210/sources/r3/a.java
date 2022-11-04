package r3;

import z3.d;
/* loaded from: classes.dex */
public class a {
    public static z3.b a(int i10, int i11, boolean z10) {
        z3.b bVar = new z3.b(i11, i10);
        float f10 = 1.0f;
        if (z10) {
            f10 = 1.0f / bVar.f26453a;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            bVar.f26447c[i12] = f10;
        }
        return bVar;
    }

    public static d b(int i10, int i11) {
        d dVar = new d(i11, i10);
        for (int i12 = 0; i12 < i11; i12++) {
            dVar.f26449c[i12] = 1;
        }
        return dVar;
    }
}
