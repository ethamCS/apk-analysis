package tb;

import hc.q0;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004BH\u00124\u0010\u0015\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u0012\u0006\u0010\n\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Ltb/d;", "T", "R", "Ltb/c;", "Lxb/d;", "Ltb/s;", "result", "Ltb/e0;", "y", "(Ljava/lang/Object;)V", "value", "a", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "Lxb/g;", "b", "()Lxb/g;", "context", "Lkotlin/Function3;", BuildConfig.FLAVOR, "block", "<init>", "(Lgc/q;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d<T, R> extends c<T, R> implements xb.d<R> {

    /* renamed from: c */
    private gc.q<? super c<?, ?>, Object, ? super xb.d<Object>, ? extends Object> f22148c;

    /* renamed from: d */
    private Object f22149d;

    /* renamed from: q */
    private xb.d<Object> f22150q = this;

    /* renamed from: x */
    private Object f22151x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(gc.q<? super c<T, R>, ? super T, ? super xb.d<? super R>, ? extends Object> qVar, T t10) {
        super(null);
        Object obj;
        hc.t.e(qVar, "block");
        this.f22148c = qVar;
        this.f22149d = t10;
        hc.t.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        obj = b.f22145a;
        this.f22151x = obj;
    }

    @Override // tb.c
    public Object a(T t10, xb.d<? super R> dVar) {
        Object c10;
        Object c11;
        hc.t.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f22150q = dVar;
        this.f22149d = t10;
        c10 = yb.d.c();
        c11 = yb.d.c();
        if (c10 == c11) {
            zb.h.c(dVar);
        }
        return c10;
    }

    @Override // xb.d
    public xb.g b() {
        return xb.h.f25516c;
    }

    public final R c() {
        Object obj;
        Object obj2;
        Object obj3;
        Object c10;
        while (true) {
            R r10 = (R) this.f22151x;
            xb.d<Object> dVar = this.f22150q;
            if (dVar == null) {
                t.b(r10);
                return r10;
            }
            obj = b.f22145a;
            if (s.f(obj, r10)) {
                try {
                    gc.q<? super c<?, ?>, Object, ? super xb.d<Object>, ? extends Object> qVar = this.f22148c;
                    Object obj4 = this.f22149d;
                    hc.t.c(qVar, "null cannot be cast to non-null type kotlin.Function3<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, P of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn>, kotlin.Any?>");
                    obj3 = ((gc.q) q0.d(qVar, 3)).s(this, obj4, dVar);
                    c10 = yb.d.c();
                } catch (Throwable th2) {
                    s.a aVar = s.Companion;
                    obj3 = t.a(th2);
                }
                if (obj3 != c10) {
                    s.a aVar2 = s.Companion;
                    r10 = (R) s.c(obj3);
                }
            } else {
                obj2 = b.f22145a;
                this.f22151x = obj2;
            }
            dVar.y(r10);
        }
    }

    @Override // xb.d
    public void y(Object obj) {
        this.f22150q = null;
        this.f22151x = obj;
    }
}
