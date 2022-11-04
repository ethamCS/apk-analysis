package androidx.lifecycle;

import androidx.lifecycle.m;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/o;", BuildConfig.FLAVOR, "Ltb/e0;", "b", "Landroidx/lifecycle/m;", "a", "Landroidx/lifecycle/m;", "lifecycle", "Landroidx/lifecycle/m$c;", "Landroidx/lifecycle/m$c;", "minState", "Landroidx/lifecycle/h;", "c", "Landroidx/lifecycle/h;", "dispatchQueue", "Landroidx/lifecycle/s;", "d", "Landroidx/lifecycle/s;", "observer", "Lkotlinx/coroutines/a2;", "parentJob", "<init>", "(Landroidx/lifecycle/m;Landroidx/lifecycle/m$c;Landroidx/lifecycle/h;Lkotlinx/coroutines/a2;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    private final m f4356a;

    /* renamed from: b */
    private final m.c f4357b;

    /* renamed from: c */
    private final h f4358c;

    /* renamed from: d */
    private final s f4359d;

    public o(m mVar, m.c cVar, h hVar, final a2 a2Var) {
        hc.t.e(mVar, "lifecycle");
        hc.t.e(cVar, "minState");
        hc.t.e(hVar, "dispatchQueue");
        hc.t.e(a2Var, "parentJob");
        this.f4356a = mVar;
        this.f4357b = cVar;
        this.f4358c = hVar;
        s sVar = new s() { // from class: androidx.lifecycle.n
            @Override // androidx.lifecycle.s
            public final void f(v vVar, m.b bVar) {
                o.c(o.this, a2Var, vVar, bVar);
            }
        };
        this.f4359d = sVar;
        if (mVar.b() != m.c.DESTROYED) {
            mVar.a(sVar);
            return;
        }
        a2.a.a(a2Var, null, 1, null);
        b();
    }

    public static final void c(o oVar, a2 a2Var, v vVar, m.b bVar) {
        hc.t.e(oVar, "this$0");
        hc.t.e(a2Var, "$parentJob");
        hc.t.e(vVar, "source");
        hc.t.e(bVar, "<anonymous parameter 1>");
        if (vVar.c().b() == m.c.DESTROYED) {
            a2.a.a(a2Var, null, 1, null);
            oVar.b();
            return;
        }
        int compareTo = vVar.c().b().compareTo(oVar.f4357b);
        h hVar = oVar.f4358c;
        if (compareTo < 0) {
            hVar.h();
        } else {
            hVar.i();
        }
    }

    public final void b() {
        this.f4356a.c(this.f4359d);
        this.f4358c.g();
    }
}
