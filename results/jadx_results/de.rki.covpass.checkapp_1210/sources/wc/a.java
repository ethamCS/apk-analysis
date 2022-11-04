package wc;

import ad.g0;
import hc.t;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.n;
import ub.u;
import xc.a1;
import xc.b;
import xc.e0;
import xc.f1;
import xc.j1;
import xc.x0;
import xc.y;
/* loaded from: classes.dex */
public final class a extends he.e {
    public static final C0439a Companion = new C0439a(null);

    /* renamed from: d */
    private static final wd.f f24705d;

    /* renamed from: wc.a$a */
    /* loaded from: classes.dex */
    public static final class C0439a {
        private C0439a() {
        }

        public /* synthetic */ C0439a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wd.f a() {
            return a.f24705d;
        }
    }

    static {
        wd.f j10 = wd.f.j("clone");
        t.d(j10, "identifier(\"clone\")");
        f24705d = j10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n nVar, xc.e eVar) {
        super(nVar, eVar);
        t.e(nVar, "storageManager");
        t.e(eVar, "containingClass");
    }

    @Override // he.e
    protected List<y> i() {
        List<x0> h10;
        List<? extends f1> h11;
        List<j1> h12;
        List<y> d10;
        g0 u12 = g0.u1(l(), yc.g.Companion.b(), f24705d, b.a.DECLARATION, a1.f25519a);
        x0 S0 = l().S0();
        h10 = u.h();
        h11 = u.h();
        h12 = u.h();
        u12.a1(null, S0, h10, h11, h12, ee.a.f(l()).i(), e0.OPEN, xc.t.f25579c);
        d10 = ub.t.d(u12);
        return d10;
    }
}
