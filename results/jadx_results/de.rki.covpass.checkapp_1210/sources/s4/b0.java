package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001af\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032.\u0010\n\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", BuildConfig.FLAVOR, "timeoutMillis", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/e;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "transform", "b", "(Lkotlinx/coroutines/flow/d;JLgc/q;)Lkotlinx/coroutines/flow/d;", "a", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b0 {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "com.ensody.reactivestate.FlowExtKt$addDelay$1", f = "FlowExt.kt", l = {89}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements gc.p<T, xb.d<? super tb.e0>, Object> {
        final /* synthetic */ long U3;

        /* renamed from: y */
        int f21363y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, xb.d<? super a> dVar) {
            super(2, dVar);
            this.U3 = j10;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f21363y;
            if (i10 == 0) {
                tb.t.b(obj);
                long j10 = this.U3;
                this.f21363y = 1;
                if (kotlinx.coroutines.a1.a(j10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(T t10, xb.d<? super tb.e0> dVar) {
            return ((a) j(t10, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.U3, dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/e;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "com.ensody.reactivestate.FlowExtKt$conflatedWorker$$inlined$conflatedTransform$1", f = "FlowExt.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements gc.p<kotlinx.coroutines.flow.e<? super R>, xb.d<? super tb.e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ kotlinx.coroutines.flow.d V3;
        final /* synthetic */ gc.q W3;

        /* renamed from: y */
        int f21364y;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Ltb/e0;", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: c */
            final /* synthetic */ kotlinx.coroutines.flow.e<R> f21365c;

            /* renamed from: d */
            final /* synthetic */ gc.q f21366d;

            @zb.f(c = "com.ensody.reactivestate.FlowExtKt$conflatedWorker$$inlined$conflatedTransform$1$1", f = "FlowExt.kt", l = {42}, m = "emit")
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: s4.b0$b$a$a */
            /* loaded from: classes.dex */
            public static final class C0351a extends zb.d {

                /* renamed from: x */
                /* synthetic */ Object f21367x;

                /* renamed from: y */
                int f21368y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0351a(xb.d dVar) {
                    super(dVar);
                    a.this = r1;
                }

                @Override // zb.a
                public final Object B(Object obj) {
                    this.f21367x = obj;
                    this.f21368y |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(gc.q qVar, kotlinx.coroutines.flow.e eVar) {
                this.f21366d = qVar;
                this.f21365c = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.flow.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object c(java.lang.Object r5, xb.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof s4.b0.b.a.C0351a
                    if (r0 == 0) goto L13
                    r0 = r6
                    s4.b0$b$a$a r0 = (s4.b0.b.a.C0351a) r0
                    int r1 = r0.f21368y
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f21368y = r1
                    goto L18
                L13:
                    s4.b0$b$a$a r0 = new s4.b0$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f21367x
                    java.lang.Object r1 = yb.b.c()
                    int r2 = r0.f21368y
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tb.t.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tb.t.b(r6)
                    gc.q r6 = r4.f21366d
                    kotlinx.coroutines.flow.e<R> r2 = r4.f21365c
                    r0.f21368y = r3
                    java.lang.Object r5 = r6.s(r2, r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    tb.e0 r5 = tb.e0.f22152a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: s4.b0.b.a.c(java.lang.Object, xb.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.flow.d dVar, gc.q qVar, xb.d dVar2) {
            super(2, dVar2);
            this.V3 = dVar;
            this.W3 = qVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f21364y;
            if (i10 == 0) {
                tb.t.b(obj);
                kotlinx.coroutines.flow.d dVar = this.V3;
                a aVar = new a(this.W3, (kotlinx.coroutines.flow.e) this.U3);
                this.f21364y = 1;
                if (dVar.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(kotlinx.coroutines.flow.e<? super R> eVar, xb.d<? super tb.e0> dVar) {
            return ((b) j(eVar, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            b bVar = new b(this.V3, this.W3, dVar);
            bVar.U3 = obj;
            return bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.d<T> a(kotlinx.coroutines.flow.d<? extends T> dVar, long j10) {
        hc.t.e(dVar, "<this>");
        return j10 <= 0 ? dVar : kotlinx.coroutines.flow.f.j(dVar, new a(j10, null));
    }

    public static final <T, R> kotlinx.coroutines.flow.d<R> b(kotlinx.coroutines.flow.d<? extends T> dVar, long j10, gc.q<? super kotlinx.coroutines.flow.e<? super R>, ? super T, ? super xb.d<? super tb.e0>, ? extends Object> qVar) {
        hc.t.e(dVar, "<this>");
        hc.t.e(qVar, "transform");
        return a(kotlinx.coroutines.flow.f.i(new b(kotlinx.coroutines.flow.f.e(dVar), qVar, null)), j10);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.d c(kotlinx.coroutines.flow.d dVar, long j10, gc.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return b(dVar, j10, qVar);
    }
}
