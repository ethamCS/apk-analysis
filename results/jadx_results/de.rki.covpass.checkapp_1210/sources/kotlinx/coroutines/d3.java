package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/d3;", "T", "Lkotlinx/coroutines/internal/z;", "Lxb/g;", "context", BuildConfig.FLAVOR, "oldValue", "Ltb/e0;", "n1", BuildConfig.FLAVOR, "m1", "state", "h1", "Ljava/lang/ThreadLocal;", "Ltb/r;", "x", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lxb/d;", "uCont", "<init>", "(Lxb/g;Lxb/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d3<T> extends kotlinx.coroutines.internal.z<T> {

    /* renamed from: x */
    private ThreadLocal<tb.r<xb.g, Object>> f15328x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d3(xb.g r3, xb.d<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.e3 r0 = kotlinx.coroutines.e3.f15336c
            xb.g$b r1 = r3.i(r0)
            if (r1 != 0) goto Ld
            xb.g r0 = r3.B(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f15328x = r0
            xb.g r4 = r4.b()
            xb.e$b r0 = xb.e.X0
            xb.g$b r4 = r4.i(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.l0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.f0.c(r3, r4)
            kotlinx.coroutines.internal.f0.a(r3, r4)
            r2.n1(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.d3.<init>(xb.g, xb.d):void");
    }

    @Override // kotlinx.coroutines.internal.z, kotlinx.coroutines.a
    protected void h1(Object obj) {
        tb.r<xb.g, Object> rVar = this.f15328x.get();
        d3<?> d3Var = null;
        if (rVar != null) {
            kotlinx.coroutines.internal.f0.a(rVar.b(), rVar.c());
            this.f15328x.set(null);
        }
        Object a10 = h0.a(obj, this.f15466q);
        xb.d<T> dVar = this.f15466q;
        xb.g b10 = dVar.b();
        Object c10 = kotlinx.coroutines.internal.f0.c(b10, null);
        if (c10 != kotlinx.coroutines.internal.f0.f15417a) {
            d3Var = k0.g(dVar, b10, c10);
        }
        try {
            this.f15466q.y(a10);
            tb.e0 e0Var = tb.e0.f22152a;
        } finally {
            if (d3Var == null || d3Var.m1()) {
                kotlinx.coroutines.internal.f0.a(b10, c10);
            }
        }
    }

    public final boolean m1() {
        if (this.f15328x.get() == null) {
            return false;
        }
        this.f15328x.set(null);
        return true;
    }

    public final void n1(xb.g gVar, Object obj) {
        this.f15328x.set(tb.x.a(gVar, obj));
    }
}
