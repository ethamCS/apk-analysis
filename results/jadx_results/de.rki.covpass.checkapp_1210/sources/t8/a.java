package t8;

import f9.d;
import h9.e;
import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.i;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lt8/a;", "Ls4/i;", BuildConfig.FLAVOR, "Ltb/e0;", "h", "(Lxb/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/q0;", "scope", "Lh9/e;", "revocationLocalListRepository", "<init>", "(Lkotlinx/coroutines/q0;Lh9/e;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends i<Object> {

    /* renamed from: d */
    private final e f22028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q0 q0Var, e eVar) {
        super(q0Var);
        t.e(q0Var, "scope");
        t.e(eVar, "revocationLocalListRepository");
        this.f22028d = eVar;
    }

    public /* synthetic */ a(q0 q0Var, e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q0Var, (i10 & 2) != 0 ? d.a().V0() : eVar);
    }

    public final Object h(xb.d<? super e0> dVar) {
        Object c10;
        Object I = this.f22028d.I(dVar);
        c10 = yb.d.c();
        return I == c10 ? I : e0.f22152a;
    }
}
