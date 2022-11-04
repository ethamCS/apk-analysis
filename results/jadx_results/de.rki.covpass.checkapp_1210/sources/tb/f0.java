package tb;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Ltb/f0;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "toString", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "<init>", "(Lgc/a;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f0<T> implements Lazy<T>, Serializable {

    /* renamed from: c */
    private gc.a<? extends T> f22153c;

    /* renamed from: d */
    private Object f22154d = b0.f22146a;

    public f0(gc.a<? extends T> aVar) {
        hc.t.e(aVar, "initializer");
        this.f22153c = aVar;
    }

    @Override // kotlin.Lazy
    public boolean c() {
        return this.f22154d != b0.f22146a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        if (this.f22154d == b0.f22146a) {
            gc.a<? extends T> aVar = this.f22153c;
            hc.t.b(aVar);
            this.f22154d = aVar.invoke();
            this.f22153c = null;
        }
        return (T) this.f22154d;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
