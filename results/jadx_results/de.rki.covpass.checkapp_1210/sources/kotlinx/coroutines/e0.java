package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/e0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/Object;", "result", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Ltb/e0;", "onCancellation", "<init>", "(Ljava/lang/Object;Lgc/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a */
    public final Object f15334a;

    /* renamed from: b */
    public final gc.l<Throwable, tb.e0> f15335b;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(Object obj, gc.l<? super Throwable, tb.e0> lVar) {
        this.f15334a = obj;
        this.f15335b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return hc.t.a(this.f15334a, e0Var.f15334a) && hc.t.a(this.f15335b, e0Var.f15335b);
    }

    public int hashCode() {
        Object obj = this.f15334a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f15335b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f15334a + ", onCancellation=" + this.f15335b + ')';
    }
}
