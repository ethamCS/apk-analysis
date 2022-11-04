package kotlinx.coroutines.flow;

import kotlin.Metadata;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/a0;", "T", "Lkotlinx/coroutines/flow/e;", "value", "Ltb/e0;", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "a", "(Lxb/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/e;", "collector", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a0<T> implements e<T> {

    /* renamed from: c */
    private final e<T> f15342c;

    /* renamed from: d */
    private final gc.p<e<? super T>, xb.d<? super e0>, Object> f15343d;

    @zb.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends zb.d {
        /* synthetic */ Object U3;
        final /* synthetic */ a0<T> V3;
        int W3;

        /* renamed from: x */
        Object f15344x;

        /* renamed from: y */
        Object f15345y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a0<T> a0Var, xb.d<? super a> dVar) {
            super(dVar);
            this.V3 = a0Var;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return this.V3.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ef.m] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xb.d<? super tb.e0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.a0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a0$a r0 = (kotlinx.coroutines.flow.a0.a) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a0$a r0 = new kotlinx.coroutines.flow.a0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f15345y
            ef.m r2 = (ef.m) r2
            java.lang.Object r4 = r0.f15344x
            kotlinx.coroutines.flow.a0 r4 = (kotlinx.coroutines.flow.a0) r4
            tb.t.b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            tb.t.b(r7)
            ef.m r2 = new ef.m
            kotlinx.coroutines.flow.e<T> r7 = r6.f15342c
            xb.g r5 = r0.b()
            r2.<init>(r7, r5)
            gc.p<kotlinx.coroutines.flow.e<? super T>, xb.d<? super tb.e0>, java.lang.Object> r7 = r6.f15343d     // Catch: java.lang.Throwable -> L7d
            r0.f15344x = r6     // Catch: java.lang.Throwable -> L7d
            r0.f15345y = r2     // Catch: java.lang.Throwable -> L7d
            r0.W3 = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.u(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.G()
            kotlinx.coroutines.flow.e<T> r7 = r4.f15342c
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.a0
            if (r2 == 0) goto L7a
            kotlinx.coroutines.flow.a0 r7 = (kotlinx.coroutines.flow.a0) r7
            r2 = 0
            r0.f15344x = r2
            r0.f15345y = r2
            r0.W3 = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            tb.e0 r7 = tb.e0.f22152a
            return r7
        L7a:
            tb.e0 r7 = tb.e0.f22152a
            return r7
        L7d:
            r7 = move-exception
            r2.G()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.a(xb.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.e
    public Object c(T t10, xb.d<? super e0> dVar) {
        return this.f15342c.c(t10, dVar);
    }
}
