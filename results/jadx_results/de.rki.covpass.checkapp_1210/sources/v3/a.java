package v3;

import ll.b;
import ll.d;
import ok.e;
import ok.g;
import ok.i;
/* loaded from: classes.dex */
public class a {
    public static <T> d<T> a(d<T> dVar, b.a<T> aVar) {
        if (dVar == null) {
            dVar = new d<>(aVar);
        }
        dVar.f();
        return dVar;
    }

    public static byte[] b(i iVar, int i10, boolean z10) {
        if (iVar == null) {
            iVar = new i(i10);
        }
        iVar.f(i10);
        if (z10) {
            iVar.a((byte) 0);
        }
        return iVar.f18613a;
    }

    public static float[] c(e eVar, int i10, boolean z10) {
        if (eVar == null) {
            eVar = new e(i10);
        }
        eVar.f(i10);
        if (z10) {
            eVar.b(0.0f);
        }
        return eVar.f18605a;
    }

    public static int[] d(g gVar, int i10, boolean z10) {
        if (gVar == null) {
            gVar = new g(i10);
        }
        gVar.i(i10);
        if (z10) {
            gVar.c(0);
        }
        return gVar.f18609a;
    }

    public static boolean e(int i10, int i11, double d10, double d11) {
        return d10 >= 0.0d && d10 < ((double) i10) && d11 >= 0.0d && d11 < ((double) i11);
    }
}
