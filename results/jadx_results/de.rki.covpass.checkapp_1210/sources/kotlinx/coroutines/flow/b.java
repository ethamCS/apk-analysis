package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlinx/coroutines/flow/b;", "T", "Lef/d;", "Ltb/e0;", "p", "()V", "Lxb/g;", "context", BuildConfig.FLAVOR, "capacity", "Ldf/h;", "onBufferOverflow", "l", "(Lxb/g;ILdf/h;)Lef/d;", "Ldf/y;", "scope", "k", "(Ldf/y;Lxb/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/q0;", "Ldf/a0;", "o", "(Lkotlinx/coroutines/q0;)Ldf/a0;", "Lkotlinx/coroutines/flow/e;", "collector", "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "i", "()Ljava/lang/String;", BuildConfig.FLAVOR, "y", "Z", "consume", "channel", "<init>", "(Ldf/a0;ZLxb/g;ILdf/h;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b<T> extends ef.d<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater U3 = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: x */
    private final df.a0<T> f15346x;

    /* renamed from: y */
    private final boolean f15347y;

    /* JADX WARN: Multi-variable type inference failed */
    public b(df.a0<? extends T> a0Var, boolean z10, xb.g gVar, int i10, df.h hVar) {
        super(gVar, i10, hVar);
        this.f15346x = a0Var;
        this.f15347y = z10;
        this.consumed = 0;
    }

    public /* synthetic */ b(df.a0 a0Var, boolean z10, xb.g gVar, int i10, df.h hVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, z10, (i11 & 4) != 0 ? xb.h.f25516c : gVar, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? df.h.SUSPEND : hVar);
    }

    private final void p() {
        if (this.f15347y) {
            boolean z10 = true;
            if (U3.getAndSet(this, 1) != 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    @Override // ef.d, kotlinx.coroutines.flow.d
    public Object a(e<? super T> eVar, xb.d<? super e0> dVar) {
        Object c10;
        Object c11;
        if (this.f9560d != -3) {
            Object a10 = super.a(eVar, dVar);
            c10 = yb.d.c();
            return a10 == c10 ? a10 : e0.f22152a;
        }
        p();
        Object c12 = h.c(eVar, this.f15346x, this.f15347y, dVar);
        c11 = yb.d.c();
        return c12 == c11 ? c12 : e0.f22152a;
    }

    @Override // ef.d
    protected String i() {
        return "channel=" + this.f15346x;
    }

    @Override // ef.d
    protected Object k(df.y<? super T> yVar, xb.d<? super e0> dVar) {
        Object c10;
        Object c11 = h.c(new ef.p(yVar), this.f15346x, this.f15347y, dVar);
        c10 = yb.d.c();
        return c11 == c10 ? c11 : e0.f22152a;
    }

    @Override // ef.d
    protected ef.d<T> l(xb.g gVar, int i10, df.h hVar) {
        return new b(this.f15346x, this.f15347y, gVar, i10, hVar);
    }

    @Override // ef.d
    public df.a0<T> o(q0 q0Var) {
        p();
        return this.f9560d == -3 ? this.f15346x : super.o(q0Var);
    }
}
