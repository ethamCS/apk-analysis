package androidx.lifecycle;

import androidx.lifecycle.m;
import kotlin.Metadata;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$b;", "event", "Ltb/e0;", "f", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements s {

    /* renamed from: c */
    final /* synthetic */ m.c f4290c;

    /* renamed from: d */
    final /* synthetic */ m f4291d;

    /* renamed from: q */
    final /* synthetic */ kotlinx.coroutines.p<Object> f4292q;

    /* renamed from: x */
    final /* synthetic */ gc.a<Object> f4293x;

    @Override // androidx.lifecycle.s
    public void f(v vVar, m.b bVar) {
        Object obj;
        kotlinx.coroutines.p<Object> pVar;
        q th2;
        hc.t.e(vVar, "source");
        hc.t.e(bVar, "event");
        if (bVar == m.b.j(this.f4290c)) {
            this.f4291d.c(this);
            pVar = this.f4292q;
            gc.a<Object> aVar = this.f4293x;
            try {
                s.a aVar2 = tb.s.Companion;
                obj = tb.s.c(aVar.invoke());
            } catch (Throwable th3) {
                th2 = th3;
                s.a aVar3 = tb.s.Companion;
            }
            pVar.y(obj);
        } else if (bVar != m.b.ON_DESTROY) {
            return;
        } else {
            this.f4291d.c(this);
            pVar = this.f4292q;
            s.a aVar4 = tb.s.Companion;
            th2 = new q();
        }
        obj = tb.s.c(tb.t.a(th2));
        pVar.y(obj);
    }
}
