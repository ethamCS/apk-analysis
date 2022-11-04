package yc;

import hc.t;
import hc.v;
import java.util.Map;
import kotlin.Lazy;
import oe.e0;
import oe.m0;
import tb.o;
import xc.a1;
/* loaded from: classes.dex */
public final class j implements c {

    /* renamed from: a */
    private final uc.h f26042a;

    /* renamed from: b */
    private final wd.c f26043b;

    /* renamed from: c */
    private final Map<wd.f, ce.g<?>> f26044c;

    /* renamed from: d */
    private final Lazy f26045d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<m0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            j.this = r1;
        }

        /* renamed from: b */
        public final m0 invoke() {
            return j.this.f26042a.o(j.this.d()).u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(uc.h hVar, wd.c cVar, Map<wd.f, ? extends ce.g<?>> map) {
        Lazy b10;
        t.e(hVar, "builtIns");
        t.e(cVar, "fqName");
        t.e(map, "allValueArguments");
        this.f26042a = hVar;
        this.f26043b = cVar;
        this.f26044c = map;
        b10 = tb.m.b(o.PUBLICATION, new a());
        this.f26045d = b10;
    }

    @Override // yc.c
    public Map<wd.f, ce.g<?>> b() {
        return this.f26044c;
    }

    @Override // yc.c
    public wd.c d() {
        return this.f26043b;
    }

    @Override // yc.c
    public e0 getType() {
        Object value = this.f26045d.getValue();
        t.d(value, "<get-type>(...)");
        return (e0) value;
    }

    @Override // yc.c
    public a1 m() {
        a1 a1Var = a1.f25519a;
        t.d(a1Var, "NO_SOURCE");
        return a1Var;
    }
}
