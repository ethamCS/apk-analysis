package h1;

import gc.p;
import hc.t;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.a2;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lh1/n;", "Lxb/g$b;", "Ltb/e0;", "a", "c", "Lxb/e;", "transactionDispatcher", "Lxb/e;", "b", "()Lxb/e;", "Lxb/g$c;", "getKey", "()Lxb/g$c;", "key", "Lkotlinx/coroutines/a2;", "transactionThreadControlJob", "<init>", "(Lkotlinx/coroutines/a2;Lxb/e;)V", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class n implements g.b {

    /* renamed from: x */
    public static final a f11161x = new a(null);

    /* renamed from: c */
    private final a2 f11162c;

    /* renamed from: d */
    private final xb.e f11163d;

    /* renamed from: q */
    private final AtomicInteger f11164q = new AtomicInteger(0);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh1/n$a;", "Lxb/g$c;", "Lh1/n;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a implements g.c<n> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public n(a2 a2Var, xb.e eVar) {
        t.e(a2Var, "transactionThreadControlJob");
        t.e(eVar, "transactionDispatcher");
        this.f11162c = a2Var;
        this.f11163d = eVar;
    }

    @Override // xb.g
    public xb.g B(xb.g gVar) {
        return g.b.a.d(this, gVar);
    }

    public final void a() {
        this.f11164q.incrementAndGet();
    }

    public final xb.e b() {
        return this.f11163d;
    }

    public final void c() {
        int decrementAndGet = this.f11164q.decrementAndGet();
        if (decrementAndGet >= 0) {
            if (decrementAndGet != 0) {
                return;
            }
            a2.a.a(this.f11162c, null, 1, null);
            return;
        }
        throw new IllegalStateException("Transaction was never started or was already released.");
    }

    @Override // xb.g.b, xb.g
    public <R> R f(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // xb.g.b
    public g.c<n> getKey() {
        return f11161x;
    }

    @Override // xb.g.b, xb.g
    public <E extends g.b> E i(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // xb.g.b, xb.g
    public xb.g s(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }
}
