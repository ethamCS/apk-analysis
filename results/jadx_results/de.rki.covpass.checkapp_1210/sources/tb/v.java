package tb;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Ltb/v;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "toString", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", BuildConfig.FLAVOR, "lock", "<init>", "(Lgc/a;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
final class v<T> implements Lazy<T>, Serializable {

    /* renamed from: c */
    private gc.a<? extends T> f22175c;

    /* renamed from: d */
    private volatile Object f22176d;

    /* renamed from: q */
    private final Object f22177q;

    public v(gc.a<? extends T> aVar, Object obj) {
        hc.t.e(aVar, "initializer");
        this.f22175c = aVar;
        this.f22176d = b0.f22146a;
        this.f22177q = obj == null ? this : obj;
    }

    public /* synthetic */ v(gc.a aVar, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    @Override // kotlin.Lazy
    public boolean c() {
        return this.f22176d != b0.f22146a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t10;
        T t11 = (T) this.f22176d;
        b0 b0Var = b0.f22146a;
        if (t11 != b0Var) {
            return t11;
        }
        synchronized (this.f22177q) {
            t10 = (T) this.f22176d;
            if (t10 == b0Var) {
                gc.a<? extends T> aVar = this.f22175c;
                hc.t.b(aVar);
                t10 = aVar.invoke();
                this.f22176d = t10;
                this.f22175c = null;
            }
        }
        return t10;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
