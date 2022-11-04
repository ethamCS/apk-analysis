package s4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\"\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0014\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004*\u00020\u0003H\u0004R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Ls4/h;", "T", "Lkotlinx/coroutines/flow/w;", "Ls4/r0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "n", "Ls4/m;", "launcher", "Ls4/m;", "j", "()Ls4/m;", BuildConfig.FLAVOR, "started", "I", "m", "()I", "o", "(I)V", "Lkotlinx/coroutines/sync/b;", "mutex", "Lkotlinx/coroutines/sync/b;", "k", "()Lkotlinx/coroutines/sync/b;", "Lkotlinx/coroutines/flow/o;", "Ltb/e0;", "onChangeFlow", "Lkotlinx/coroutines/flow/o;", "l", "()Lkotlinx/coroutines/flow/o;", "Ls4/d0;", "i", "()Ls4/d0;", "autoRunner", "<init>", "(Ls4/m;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class h<T> implements kotlinx.coroutines.flow.w<T> {

    /* renamed from: c */
    private final m f21401c;

    /* renamed from: d */
    private int f21402d;

    /* renamed from: q */
    private final kotlinx.coroutines.sync.b f21403q = kotlinx.coroutines.sync.d.b(false, 1, null);

    /* renamed from: x */
    private final kotlinx.coroutines.flow.o<tb.e0> f21404x;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<Throwable, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ h<T> f21405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h<T> hVar) {
            super(1);
            this.f21405c = hVar;
        }

        public final void b(Throwable th2) {
            this.f21405c.i().g();
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
            b(th2);
            return tb.e0.f22152a;
        }
    }

    public h(m mVar) {
        hc.t.e(mVar, "launcher");
        this.f21401c = mVar;
        kotlinx.coroutines.flow.o<tb.e0> b10 = kotlinx.coroutines.flow.u.b(1, 0, df.h.DROP_OLDEST, 2, null);
        this.f21404x = b10;
        b10.e(tb.e0.f22152a);
        t.d(mVar, new a(this));
    }

    protected abstract d0 i();

    public final m j() {
        return this.f21401c;
    }

    public final kotlinx.coroutines.sync.b k() {
        return this.f21403q;
    }

    public final kotlinx.coroutines.flow.o<tb.e0> l() {
        return this.f21404x;
    }

    public final int m() {
        return this.f21402d;
    }

    public final List<Object> n(r0 r0Var) {
        int s10;
        hc.t.e(r0Var, "<this>");
        Collection<f<?>> values = r0Var.b().values();
        s10 = ub.v.s(values, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) it.next()).getValue());
        }
        return arrayList;
    }

    public final void o(int i10) {
        this.f21402d = i10;
    }
}
