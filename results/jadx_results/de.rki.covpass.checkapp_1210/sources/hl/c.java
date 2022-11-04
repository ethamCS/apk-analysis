package hl;

import rk.c0;
import rk.e0;
import rk.i0;
import rk.m;
import rk.n;
import rk.o;
import rk.x;
import rk.y;
import rk.z;
/* loaded from: classes3.dex */
public class c extends b<c> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12237a;

        static {
            int[] iArr = new int[e0.values().length];
            f12237a = iArr;
            try {
                iArr[e0.DDRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12237a[e0.FDRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12237a[e0.ZDRM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12237a[e0.CDRM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12237a[e0.DSCC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12237a[e0.FSCC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected c() {
    }

    public c(int i10, int i11, e0 e0Var) {
        c0 c0Var;
        switch (a.f12237a[e0Var.ordinal()]) {
            case 1:
                c0Var = new n(i10, i11);
                break;
            case 2:
                c0Var = new y(i10, i11);
                break;
            case 3:
                c0Var = new i0(i10, i11);
                break;
            case 4:
                c0Var = new rk.d(i10, i11);
                break;
            case 5:
                c0Var = new o(i10, i11);
                break;
            case 6:
                c0Var = new z(i10, i11);
                break;
            default:
                throw new RuntimeException("Unknown matrix type");
        }
        j(c0Var);
    }

    public c(c0 c0Var) {
        n nVar;
        if (c0Var instanceof m) {
            n nVar2 = new n(c0Var.Z(), c0Var.w());
            gl.c.a((m) c0Var, nVar2);
            nVar = nVar2;
        } else if (c0Var instanceof x) {
            y yVar = new y(c0Var.Z(), c0Var.w());
            gl.d.a((x) c0Var, yVar);
            nVar = yVar;
        } else {
            nVar = c0Var.a();
        }
        j(nVar);
    }

    public static c p(c0 c0Var) {
        c cVar = new c();
        cVar.j(c0Var);
        return cVar;
    }

    /* renamed from: n */
    public c b(int i10, int i11, e0 e0Var) {
        return new c(i10, i11, e0Var);
    }

    /* renamed from: r */
    public c k(c0 c0Var) {
        return new c(c0Var);
    }
}
