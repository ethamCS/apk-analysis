package kotlinx.coroutines.flow;

import hc.j0;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/c;", "T", "Lkotlinx/coroutines/flow/d;", "Lkotlinx/coroutines/flow/e;", "collector", "Ltb/e0;", "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "c", "Lkotlinx/coroutines/flow/d;", "upstream", "Lkotlin/Function1;", BuildConfig.FLAVOR, "keySelector", "Lkotlin/Function2;", BuildConfig.FLAVOR, "areEquivalent", "<init>", "(Lkotlinx/coroutines/flow/d;Lgc/l;Lgc/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c<T> implements d<T> {

    /* renamed from: c */
    private final d<T> f15349c;

    /* renamed from: d */
    public final gc.l<T, Object> f15350d;

    /* renamed from: q */
    public final gc.p<Object, Object, Boolean> f15351q;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Ltb/e0;", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a<T> implements e {

        /* renamed from: c */
        final /* synthetic */ c<T> f15352c;

        /* renamed from: d */
        final /* synthetic */ j0<Object> f15353d;

        /* renamed from: q */
        final /* synthetic */ e<T> f15354q;

        @zb.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.c$a$a */
        /* loaded from: classes3.dex */
        public static final class C0227a extends zb.d {
            int U3;

            /* renamed from: x */
            /* synthetic */ Object f15355x;

            /* renamed from: y */
            final /* synthetic */ a<T> f15356y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0227a(a<? super T> aVar, xb.d<? super C0227a> dVar) {
                super(dVar);
                this.f15356y = aVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                this.f15355x = obj;
                this.U3 |= Integer.MIN_VALUE;
                return this.f15356y.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(c<T> cVar, j0<Object> j0Var, e<? super T> eVar) {
            this.f15352c = cVar;
            this.f15353d = j0Var;
            this.f15354q = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(T r6, xb.d<? super tb.e0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.c.a.C0227a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.c$a$a r0 = (kotlinx.coroutines.flow.c.a.C0227a) r0
                int r1 = r0.U3
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.U3 = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.c$a$a r0 = new kotlinx.coroutines.flow.c$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f15355x
                java.lang.Object r1 = yb.b.c()
                int r2 = r0.U3
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                tb.t.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                tb.t.b(r7)
                kotlinx.coroutines.flow.c<T> r7 = r5.f15352c
                gc.l<T, java.lang.Object> r7 = r7.f15350d
                java.lang.Object r7 = r7.invoke(r6)
                hc.j0<java.lang.Object> r2 = r5.f15353d
                T r2 = r2.f11764c
                kotlinx.coroutines.internal.b0 r4 = ef.l.f9571a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.c<T> r4 = r5.f15352c
                gc.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f15351q
                java.lang.Object r2 = r4.u(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                tb.e0 r6 = tb.e0.f22152a
                return r6
            L58:
                hc.j0<java.lang.Object> r2 = r5.f15353d
                r2.f11764c = r7
                kotlinx.coroutines.flow.e<T> r7 = r5.f15354q
                r0.U3 = r3
                java.lang.Object r6 = r7.c(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                tb.e0 r6 = tb.e0.f22152a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.c.a.c(java.lang.Object, xb.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(d<? extends T> dVar, gc.l<? super T, ? extends Object> lVar, gc.p<Object, Object, Boolean> pVar) {
        this.f15349c = dVar;
        this.f15350d = lVar;
        this.f15351q = pVar;
    }

    @Override // kotlinx.coroutines.flow.d
    public Object a(e<? super T> eVar, xb.d<? super e0> dVar) {
        Object c10;
        j0 j0Var = new j0();
        j0Var.f11764c = (T) ef.l.f9571a;
        Object a10 = this.f15349c.a(new a(this, j0Var, eVar), dVar);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : e0.f22152a;
    }
}
