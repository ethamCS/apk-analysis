package tb;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0010B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Ltb/u;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "toString", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "<init>", "(Lgc/a;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
final class u<T> implements Lazy<T>, Serializable {
    public static final a Companion = new a(null);

    /* renamed from: x */
    private static final AtomicReferenceFieldUpdater<u<?>, Object> f22171x = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "d");

    /* renamed from: c */
    private volatile gc.a<? extends T> f22172c;

    /* renamed from: d */
    private volatile Object f22173d;

    /* renamed from: q */
    private final Object f22174q;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bRd\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Ltb/u$a;", BuildConfig.FLAVOR, "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Ltb/u;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public u(gc.a<? extends T> aVar) {
        hc.t.e(aVar, "initializer");
        this.f22172c = aVar;
        b0 b0Var = b0.f22146a;
        this.f22173d = b0Var;
        this.f22174q = b0Var;
    }

    @Override // kotlin.Lazy
    public boolean c() {
        return this.f22173d != b0.f22146a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t10 = (T) this.f22173d;
        b0 b0Var = b0.f22146a;
        if (t10 != b0Var) {
            return t10;
        }
        gc.a<? extends T> aVar = this.f22172c;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (androidx.concurrent.futures.b.a(f22171x, this, b0Var, invoke)) {
                this.f22172c = null;
                return invoke;
            }
        }
        return (T) this.f22173d;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
