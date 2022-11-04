package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/z;", "Lef/c;", "Lkotlinx/coroutines/flow/x;", "flow", BuildConfig.FLAVOR, "c", "(Lkotlinx/coroutines/flow/x;)Z", BuildConfig.FLAVOR, "Lxb/d;", "Ltb/e0;", "e", "(Lkotlinx/coroutines/flow/x;)[Lxb/d;", "f", "()V", "g", "()Z", "d", "(Lxb/d;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class z extends ef.c<x<?>> {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f15389a = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    /* renamed from: c */
    public boolean a(x<?> xVar) {
        kotlinx.coroutines.internal.b0 b0Var;
        if (this._state != null) {
            return false;
        }
        b0Var = y.f15387a;
        this._state = b0Var;
        return true;
    }

    public final Object d(xb.d<? super e0> dVar) {
        xb.d b10;
        kotlinx.coroutines.internal.b0 b0Var;
        Object c10;
        Object c11;
        b10 = yb.c.b(dVar);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(b10, 1);
        qVar.z();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15389a;
        b0Var = y.f15387a;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, qVar)) {
            s.a aVar = tb.s.Companion;
            qVar.y(tb.s.c(e0.f22152a));
        }
        Object s10 = qVar.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar);
        }
        c11 = yb.d.c();
        return s10 == c11 ? s10 : e0.f22152a;
    }

    /* renamed from: e */
    public xb.d<e0>[] b(x<?> xVar) {
        this._state = null;
        return ef.b.f9558a;
    }

    public final void f() {
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        kotlinx.coroutines.internal.b0 b0Var3;
        kotlinx.coroutines.internal.b0 b0Var4;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            b0Var = y.f15388b;
            if (obj == b0Var) {
                return;
            }
            b0Var2 = y.f15387a;
            if (obj == b0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15389a;
                b0Var3 = y.f15388b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, b0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15389a;
                b0Var4 = y.f15387a;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, obj, b0Var4)) {
                    s.a aVar = tb.s.Companion;
                    ((kotlinx.coroutines.q) obj).y(tb.s.c(e0.f22152a));
                    return;
                }
            }
        }
    }

    public final boolean g() {
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15389a;
        b0Var = y.f15387a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, b0Var);
        hc.t.b(andSet);
        b0Var2 = y.f15388b;
        return andSet == b0Var2;
    }
}
