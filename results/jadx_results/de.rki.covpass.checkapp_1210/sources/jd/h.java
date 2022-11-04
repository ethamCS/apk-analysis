package jd;

import gc.l;
import hc.t;
import hc.v;
import java.util.Map;
import nd.y;
import nd.z;
import xc.f1;
import xc.m;
/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a */
    private final g f14328a;

    /* renamed from: b */
    private final m f14329b;

    /* renamed from: c */
    private final int f14330c;

    /* renamed from: d */
    private final Map<y, Integer> f14331d;

    /* renamed from: e */
    private final ne.h<y, kd.m> f14332e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends v implements l<y, kd.m> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            h.this = r1;
        }

        /* renamed from: b */
        public final kd.m invoke(y yVar) {
            t.e(yVar, "typeParameter");
            Integer num = (Integer) h.this.f14331d.get(yVar);
            if (num != null) {
                h hVar = h.this;
                return new kd.m(jd.a.h(jd.a.a(hVar.f14328a, hVar), hVar.f14329b.j()), yVar, hVar.f14330c + num.intValue(), hVar.f14329b);
            }
            return null;
        }
    }

    public h(g gVar, m mVar, z zVar, int i10) {
        t.e(gVar, "c");
        t.e(mVar, "containingDeclaration");
        t.e(zVar, "typeParameterOwner");
        this.f14328a = gVar;
        this.f14329b = mVar;
        this.f14330c = i10;
        this.f14331d = ye.a.d(zVar.p());
        this.f14332e = gVar.e().i(new a());
    }

    @Override // jd.k
    public f1 a(y yVar) {
        t.e(yVar, "javaTypeParameter");
        kd.m invoke = this.f14332e.invoke(yVar);
        return invoke != null ? invoke : this.f14328a.f().a(yVar);
    }
}
