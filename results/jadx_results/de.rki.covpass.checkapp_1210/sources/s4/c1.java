package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a+\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Ls4/l0;", BuildConfig.FLAVOR, "amount", "c", "a", "Lkotlinx/coroutines/flow/w;", "flow", "Ltb/e0;", "e", "(Ls4/l0;Lkotlinx/coroutines/flow/w;Lxb/d;)Ljava/lang/Object;", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c1 {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<Integer, Integer> {

        /* renamed from: c */
        final /* synthetic */ int f21376c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(1);
            this.f21376c = i10;
        }

        public final Integer b(int i10) {
            return Integer.valueOf(i10 + this.f21376c);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return b(num.intValue());
        }
    }

    @zb.f(c = "com.ensody.reactivestate.ValueFlowUtilsKt", f = "ValueFlowUtils.kt", l = {23}, m = "incrementFrom")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        /* synthetic */ Object U3;
        int V3;

        /* renamed from: x */
        Object f21377x;

        /* renamed from: y */
        Object f21378y;

        b(xb.d<? super b> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.V3 |= Integer.MIN_VALUE;
            return c1.e(null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "a", "(ILxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: c */
        final /* synthetic */ l0<Integer> f21379c;

        /* renamed from: d */
        final /* synthetic */ hc.h0 f21380d;

        c(l0<Integer> l0Var, hc.h0 h0Var) {
            this.f21379c = l0Var;
            this.f21380d = h0Var;
        }

        public final Object a(int i10, xb.d<? super tb.e0> dVar) {
            c1.c(this.f21379c, i10 - this.f21380d.f11761c);
            this.f21380d.f11761c = i10;
            return tb.e0.f22152a;
        }

        @Override // kotlinx.coroutines.flow.e
        public /* bridge */ /* synthetic */ Object c(Object obj, xb.d dVar) {
            return a(((Number) obj).intValue(), dVar);
        }
    }

    public static final int a(l0<Integer> l0Var, int i10) {
        hc.t.e(l0Var, "<this>");
        return c(l0Var, -i10);
    }

    public static /* synthetic */ int b(l0 l0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return a(l0Var, i10);
    }

    public static final int c(l0<Integer> l0Var, int i10) {
        hc.t.e(l0Var, "<this>");
        return l0Var.h(new a(i10)).intValue();
    }

    public static /* synthetic */ int d(l0 l0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return c(l0Var, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(s4.l0<java.lang.Integer> r5, kotlinx.coroutines.flow.w<java.lang.Integer> r6, xb.d<? super tb.e0> r7) {
        /*
            boolean r0 = r7 instanceof s4.c1.b
            if (r0 == 0) goto L13
            r0 = r7
            s4.c1$b r0 = (s4.c1.b) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            s4.c1$b r0 = new s4.c1$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.f21378y
            hc.h0 r5 = (hc.h0) r5
            java.lang.Object r6 = r0.f21377x
            s4.l0 r6 = (s4.l0) r6
            tb.t.b(r7)     // Catch: java.lang.Throwable -> L3b
            r7 = r5
            r5 = r6
            goto L5b
        L3b:
            r7 = move-exception
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L62
        L41:
            tb.t.b(r7)
            hc.h0 r7 = new hc.h0
            r7.<init>()
            s4.c1$c r2 = new s4.c1$c     // Catch: java.lang.Throwable -> L61
            r2.<init>(r5, r7)     // Catch: java.lang.Throwable -> L61
            r0.f21377x = r5     // Catch: java.lang.Throwable -> L61
            r0.f21378y = r7     // Catch: java.lang.Throwable -> L61
            r0.V3 = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L61
            if (r6 != r1) goto L5b
            return r1
        L5b:
            tb.i r6 = new tb.i     // Catch: java.lang.Throwable -> L61
            r6.<init>()     // Catch: java.lang.Throwable -> L61
            throw r6     // Catch: java.lang.Throwable -> L61
        L61:
            r6 = move-exception
        L62:
            int r7 = r7.f11761c
            a(r5, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.c1.e(s4.l0, kotlinx.coroutines.flow.w, xb.d):java.lang.Object");
    }
}
