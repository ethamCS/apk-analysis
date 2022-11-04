package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/n;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Lgc/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class x1 extends n {

    /* renamed from: c */
    private final gc.l<Throwable, tb.e0> f15581c;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(gc.l<? super Throwable, tb.e0> lVar) {
        this.f15581c = lVar;
    }

    @Override // kotlinx.coroutines.o
    public void a(Throwable th2) {
        this.f15581c.invoke(th2);
    }

    @Override // gc.l
    public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
        a(th2);
        return tb.e0.f22152a;
    }

    public String toString() {
        return "InvokeOnCancel[" + u0.a(this.f15581c) + '@' + u0.b(this) + ']';
    }
}
