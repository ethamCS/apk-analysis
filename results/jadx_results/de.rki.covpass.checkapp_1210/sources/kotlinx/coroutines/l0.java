package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import xb.e;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/l0;", "Lxb/a;", "Lxb/e;", "Lxb/g;", "context", BuildConfig.FLAVOR, "R0", BuildConfig.FLAVOR, "parallelism", "c1", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ltb/e0;", "u0", "O0", "T", "Lxb/d;", "continuation", "u", "M", BuildConfig.FLAVOR, "toString", "<init>", "()V", "d", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class l0 extends xb.a implements xb.e {

    /* renamed from: d */
    public static final a f15483d = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/l0$a;", "Lxb/b;", "Lxb/e;", "Lkotlinx/coroutines/l0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends xb.b<xb.e, l0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxb/g$b;", "it", "Lkotlinx/coroutines/l0;", "b", "(Lxb/g$b;)Lkotlinx/coroutines/l0;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.l0$a$a */
        /* loaded from: classes3.dex */
        public static final class C0230a extends hc.v implements gc.l<g.b, l0> {

            /* renamed from: c */
            public static final C0230a f15484c = new C0230a();

            C0230a() {
                super(1);
            }

            /* renamed from: b */
            public final l0 invoke(g.b bVar) {
                if (bVar instanceof l0) {
                    return (l0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(xb.e.X0, C0230a.f15484c);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l0() {
        super(xb.e.X0);
    }

    @Override // xb.e
    public final void M(xb.d<?> dVar) {
        ((kotlinx.coroutines.internal.f) dVar).o();
    }

    public void O0(xb.g gVar, Runnable runnable) {
        u0(gVar, runnable);
    }

    public boolean R0(xb.g gVar) {
        return true;
    }

    public l0 c1(int i10) {
        kotlinx.coroutines.internal.l.a(i10);
        return new kotlinx.coroutines.internal.k(this, i10);
    }

    @Override // xb.a, xb.g.b, xb.g
    public <E extends g.b> E i(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // xb.a, xb.g.b, xb.g
    public xb.g s(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return u0.a(this) + '@' + u0.b(this);
    }

    @Override // xb.e
    public final <T> xb.d<T> u(xb.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.f(this, dVar);
    }

    public abstract void u0(xb.g gVar, Runnable runnable);
}
