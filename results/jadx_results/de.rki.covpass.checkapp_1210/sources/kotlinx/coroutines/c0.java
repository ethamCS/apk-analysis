package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004JQ\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lkotlinx/coroutines/c0;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/q;", "cont", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "d", "result", "Lkotlinx/coroutines/n;", "cancelHandler", "Lkotlin/Function1;", "onCancellation", "idempotentResume", "cancelCause", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Ljava/lang/Object;", "b", "Lkotlinx/coroutines/n;", "e", "Ljava/lang/Throwable;", "c", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/n;Lgc/l;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class c0 {

    /* renamed from: a */
    public final Object f15316a;

    /* renamed from: b */
    public final n f15317b;

    /* renamed from: c */
    public final gc.l<Throwable, tb.e0> f15318c;

    /* renamed from: d */
    public final Object f15319d;

    /* renamed from: e */
    public final Throwable f15320e;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(Object obj, n nVar, gc.l<? super Throwable, tb.e0> lVar, Object obj2, Throwable th2) {
        this.f15316a = obj;
        this.f15317b = nVar;
        this.f15318c = lVar;
        this.f15319d = obj2;
        this.f15320e = th2;
    }

    public /* synthetic */ c0(Object obj, n nVar, gc.l lVar, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : nVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }

    public static /* synthetic */ c0 b(c0 c0Var, Object obj, n nVar, gc.l lVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c0Var.f15316a;
        }
        if ((i10 & 2) != 0) {
            nVar = c0Var.f15317b;
        }
        n nVar2 = nVar;
        gc.l<Throwable, tb.e0> lVar2 = lVar;
        if ((i10 & 4) != 0) {
            lVar2 = c0Var.f15318c;
        }
        gc.l lVar3 = lVar2;
        if ((i10 & 8) != 0) {
            obj2 = c0Var.f15319d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = c0Var.f15320e;
        }
        return c0Var.a(obj, nVar2, lVar3, obj4, th2);
    }

    public final c0 a(Object obj, n nVar, gc.l<? super Throwable, tb.e0> lVar, Object obj2, Throwable th2) {
        return new c0(obj, nVar, lVar, obj2, th2);
    }

    public final boolean c() {
        return this.f15320e != null;
    }

    public final void d(q<?> qVar, Throwable th2) {
        n nVar = this.f15317b;
        if (nVar != null) {
            qVar.k(nVar, th2);
        }
        gc.l<Throwable, tb.e0> lVar = this.f15318c;
        if (lVar != null) {
            qVar.l(lVar, th2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return hc.t.a(this.f15316a, c0Var.f15316a) && hc.t.a(this.f15317b, c0Var.f15317b) && hc.t.a(this.f15318c, c0Var.f15318c) && hc.t.a(this.f15319d, c0Var.f15319d) && hc.t.a(this.f15320e, c0Var.f15320e);
    }

    public int hashCode() {
        Object obj = this.f15316a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        n nVar = this.f15317b;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        gc.l<Throwable, tb.e0> lVar = this.f15318c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f15319d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f15320e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f15316a + ", cancelHandler=" + this.f15317b + ", onCancellation=" + this.f15318c + ", idempotentResume=" + this.f15319d + ", cancelCause=" + this.f15320e + ')';
    }
}
