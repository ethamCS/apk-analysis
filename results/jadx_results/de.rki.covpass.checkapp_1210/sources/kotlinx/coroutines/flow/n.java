package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aJ\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"T", "Lkotlinx/coroutines/flow/d;", "Lkotlin/Function2;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "action", "a", "(Lkotlinx/coroutines/flow/d;Lgc/p;)Lkotlinx/coroutines/flow/d;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class n {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/d;", "Lkotlinx/coroutines/flow/e;", "collector", "Ltb/e0;", "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a implements d<T> {

        /* renamed from: c */
        final /* synthetic */ d f15363c;

        /* renamed from: d */
        final /* synthetic */ gc.p f15364d;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Ltb/e0;", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.n$a$a */
        /* loaded from: classes3.dex */
        public static final class C0228a<T> implements e {

            /* renamed from: c */
            final /* synthetic */ e f15365c;

            /* renamed from: d */
            final /* synthetic */ gc.p f15366d;

            @zb.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.n$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C0229a extends zb.d {
                Object V3;
                Object W3;

                /* renamed from: x */
                /* synthetic */ Object f15367x;

                /* renamed from: y */
                int f15368y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0229a(xb.d dVar) {
                    super(dVar);
                    C0228a.this = r1;
                }

                @Override // zb.a
                public final Object B(Object obj) {
                    this.f15367x = obj;
                    this.f15368y |= Integer.MIN_VALUE;
                    return C0228a.this.c(null, this);
                }
            }

            public C0228a(e eVar, gc.p pVar) {
                this.f15365c = eVar;
                this.f15366d = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
            @Override // kotlinx.coroutines.flow.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object c(T r6, xb.d<? super tb.e0> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.n.a.C0228a.C0229a
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.n$a$a$a r0 = (kotlinx.coroutines.flow.n.a.C0228a.C0229a) r0
                    int r1 = r0.f15368y
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f15368y = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.n$a$a$a r0 = new kotlinx.coroutines.flow.n$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f15367x
                    java.lang.Object r1 = yb.b.c()
                    int r2 = r0.f15368y
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    tb.t.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.W3
                    kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.e) r6
                    java.lang.Object r2 = r0.V3
                    tb.t.b(r7)
                    goto L5c
                L3e:
                    tb.t.b(r7)
                    kotlinx.coroutines.flow.e r7 = r5.f15365c
                    gc.p r2 = r5.f15366d
                    r0.V3 = r6
                    r0.W3 = r7
                    r0.f15368y = r4
                    r4 = 6
                    hc.r.a(r4)
                    java.lang.Object r2 = r2.u(r6, r0)
                    r4 = 7
                    hc.r.a(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.V3 = r7
                    r0.W3 = r7
                    r0.f15368y = r3
                    java.lang.Object r6 = r6.c(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    tb.e0 r6 = tb.e0.f22152a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.a.C0228a.c(java.lang.Object, xb.d):java.lang.Object");
            }
        }

        public a(d dVar, gc.p pVar) {
            this.f15363c = dVar;
            this.f15364d = pVar;
        }

        @Override // kotlinx.coroutines.flow.d
        public Object a(e eVar, xb.d dVar) {
            Object c10;
            Object a10 = this.f15363c.a(new C0228a(eVar, this.f15364d), dVar);
            c10 = yb.d.c();
            return a10 == c10 ? a10 : e0.f22152a;
        }
    }

    public static final <T> d<T> a(d<? extends T> dVar, gc.p<? super T, ? super xb.d<? super e0>, ? extends Object> pVar) {
        return new a(dVar, pVar);
    }
}
