package s4;

import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.h1;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0007\u001a(\u0010\n\u001a\u00060\bj\u0002`\t*\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u001a(\u0010\f\u001a\u00060\bj\u0002`\t*\u00020\u000b2\u0018\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u001a(\u0010\u000e\u001a\u00060\bj\u0002`\t*\u00020\r2\u0018\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u001a\u001a\u0010\u0010\u001a\u00060\bj\u0002`\t*\u00060\bj\u0002`\t2\u0006\u0010\u000f\u001a\u00020\r\u001a6\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00112\u001a\u0010\u0014\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0003*\n\u0010\u0017\"\u00020\b2\u00020\b¨\u0006\u0018"}, d2 = {"Ls4/r;", "a", "Lxb/g;", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Ltb/e0;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/h1;", "Lcom/ensody/reactivestate/Disposable;", "e", "Lkotlinx/coroutines/q0;", "c", "Ls4/m;", "d", "launcher", "b", "T", "Lkotlin/Function0;", BuildConfig.FLAVOR, "invalidateOn", "Lkc/d;", "f", "Disposable", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<Throwable, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ h1 f21445c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h1 h1Var) {
            super(1);
            this.f21445c = h1Var;
        }

        public final void b(Throwable th2) {
            this.f21445c.g();
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
            b(th2);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<tb.e0> {

        /* renamed from: c */
        public static final b f21446c = new b();

        b() {
            super(0);
        }

        public final void b() {
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ tb.e0 invoke() {
            b();
            return tb.e0.f22152a;
        }
    }

    public static final r a() {
        return new s();
    }

    public static final h1 b(h1 h1Var, m mVar) {
        hc.t.e(h1Var, "<this>");
        hc.t.e(mVar, "launcher");
        return d(mVar, new a(h1Var));
    }

    public static final h1 c(kotlinx.coroutines.q0 q0Var, gc.l<? super Throwable, tb.e0> lVar) {
        hc.t.e(q0Var, "<this>");
        hc.t.e(lVar, "handler");
        return e(q0Var.h(), lVar);
    }

    public static final h1 d(m mVar, gc.l<? super Throwable, tb.e0> lVar) {
        hc.t.e(mVar, "<this>");
        hc.t.e(lVar, "handler");
        return c(mVar.d(), lVar);
    }

    public static final h1 e(xb.g gVar, gc.l<? super Throwable, tb.e0> lVar) {
        h1 D0;
        hc.t.e(gVar, "<this>");
        hc.t.e(lVar, "handler");
        a2 a2Var = (a2) gVar.i(a2.W0);
        return (a2Var == null || (D0 = a2Var.D0(lVar)) == null) ? new n0(b.f21446c) : D0;
    }

    public static final <T> kc.d<Object, T> f(gc.l<? super gc.a<tb.e0>, ? extends Object> lVar) {
        hc.t.e(lVar, "invalidateOn");
        return new u(lVar);
    }
}
