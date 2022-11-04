package s4;

import androidx.lifecycle.LiveData;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Ls4/r0;", "Landroidx/lifecycle/LiveData;", "data", "a", "(Ls4/r0;Landroidx/lifecycle/LiveData;)Ljava/lang/Object;", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ls4/h0;", "b", "()Ls4/h0;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<h0<T>> {

        /* renamed from: c */
        final /* synthetic */ LiveData<T> f21369c;

        /* renamed from: d */
        final /* synthetic */ r0 f21370d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LiveData<T> liveData, r0 r0Var) {
            super(0);
            this.f21369c = liveData;
            this.f21370d = r0Var;
        }

        /* renamed from: b */
        public final h0<T> invoke() {
            return new h0<>(this.f21369c, this.f21370d.a());
        }
    }

    public static final <T> T a(r0 r0Var, LiveData<T> liveData) {
        hc.t.e(r0Var, "<this>");
        hc.t.e(liveData, "data");
        r0Var.d(liveData, new a(liveData, r0Var));
        return liveData.e();
    }
}
