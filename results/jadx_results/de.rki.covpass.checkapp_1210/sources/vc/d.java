package vc;

import hc.t;
import java.util.List;
import ne.n;
import ub.u;
import xc.y;
/* loaded from: classes.dex */
public final class d extends he.e {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23993a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.Function.ordinal()] = 1;
            iArr[c.SuspendFunction.ordinal()] = 2;
            f23993a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, b bVar) {
        super(nVar, bVar);
        t.e(nVar, "storageManager");
        t.e(bVar, "containingClass");
    }

    @Override // he.e
    protected List<y> i() {
        e eVar;
        List<y> d10;
        List<y> h10;
        xc.e l10 = l();
        t.c(l10, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int i10 = a.f23993a[((b) l10).d1().ordinal()];
        if (i10 == 1) {
            eVar = e.f23994t4.a((b) l(), false);
        } else if (i10 != 2) {
            h10 = u.h();
            return h10;
        } else {
            eVar = e.f23994t4.a((b) l(), true);
        }
        d10 = ub.t.d(eVar);
        return d10;
    }
}
