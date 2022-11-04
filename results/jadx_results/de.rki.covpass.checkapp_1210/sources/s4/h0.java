package s4;

import androidx.lifecycle.LiveData;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Ls4/h0;", "T", "Ls4/f;", "Ltb/e0;", "b", "a", "getValue", "()Ljava/lang/Object;", "value", "Landroidx/lifecycle/LiveData;", "data", "Ls4/g;", "autoRunner", "<init>", "(Landroidx/lifecycle/LiveData;Ls4/g;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h0<T> implements f<T> {

    /* renamed from: a */
    private final LiveData<T> f21406a;

    /* renamed from: b */
    private boolean f21407b;

    /* renamed from: c */
    private final androidx.lifecycle.e0<T> f21408c;

    public h0(LiveData<T> liveData, final g gVar) {
        hc.t.e(liveData, "data");
        hc.t.e(gVar, "autoRunner");
        this.f21406a = liveData;
        this.f21408c = new androidx.lifecycle.e0() { // from class: s4.g0
            @Override // androidx.lifecycle.e0
            public final void a(Object obj) {
                h0.d(h0.this, gVar, obj);
            }
        };
    }

    public static final void d(h0 h0Var, g gVar, Object obj) {
        hc.t.e(h0Var, "this$0");
        hc.t.e(gVar, "$autoRunner");
        if (!h0Var.f21407b) {
            gVar.f();
        }
    }

    @Override // s4.f
    public void a() {
        this.f21406a.l(this.f21408c);
    }

    @Override // s4.f
    public void b() {
        this.f21407b = true;
        this.f21406a.h(this.f21408c);
        this.f21407b = false;
    }

    @Override // s4.f
    public T getValue() {
        return this.f21406a.e();
    }
}
