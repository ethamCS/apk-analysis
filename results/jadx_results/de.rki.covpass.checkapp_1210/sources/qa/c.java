package qa;

import hc.t;
import hc.v;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.p0;
import org.conscrypt.BuildConfig;
import qa.b;
import tb.e0;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lqa/c;", "Lqa/b;", "Ltb/e0;", "close", "()V", "Lxb/g;", "coroutineContext$delegate", "Lkotlin/Lazy;", "h", "()Lxb/g;", "coroutineContext", BuildConfig.FLAVOR, "engineName", "<init>", "(Ljava/lang/String;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class c implements qa.b {

    /* renamed from: q */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19760q = AtomicIntegerFieldUpdater.newUpdater(c.class, "closed");

    /* renamed from: c */
    private final String f19761c;
    private volatile /* synthetic */ int closed = 0;

    /* renamed from: d */
    private final Lazy f19762d;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<Throwable, e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            c.this = r1;
        }

        public final void b(Throwable th2) {
            d.b(c.this.I0());
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxb/g;", "b", "()Lxb/g;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<xb.g> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            c.this = r1;
        }

        /* renamed from: b */
        public final xb.g invoke() {
            return fb.n.b(null, 1, null).B(c.this.I0()).B(new p0(t.l(c.this.f19761c, "-context")));
        }
    }

    public c(String str) {
        Lazy a10;
        t.e(str, "engineName");
        this.f19761c = str;
        a10 = tb.m.a(new b());
        this.f19762d = a10;
    }

    @Override // qa.b
    public void S0(na.a aVar) {
        b.a.h(this, aVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!f19760q.compareAndSet(this, 0, 1)) {
            return;
        }
        g.b i10 = h().i(a2.W0);
        b0 b0Var = i10 instanceof b0 ? (b0) i10 : null;
        if (b0Var == null) {
            return;
        }
        b0Var.V();
        b0Var.D0(new a());
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return (xb.g) this.f19762d.getValue();
    }

    @Override // qa.b
    public Set<e<?>> p0() {
        return b.a.g(this);
    }
}
