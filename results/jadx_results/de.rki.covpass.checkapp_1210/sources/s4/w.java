package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Ls4/v;", "T", "Ls4/x;", "handler", "Ltb/e0;", "a", "(Ls4/x;Ls4/v;Lxb/d;)Ljava/lang/Object;", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class w {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls4/v;", "T", "Lkotlin/Function2;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "it", "a", "(Lgc/p;Lxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: c */
        final /* synthetic */ v f21456c;

        @zb.f(c = "com.ensody.reactivestate.ErrorEventsKt$handleEvents$2", f = "ErrorEvents.kt", l = {50}, m = "emit")
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: s4.w$a$a */
        /* loaded from: classes.dex */
        public static final class C0358a extends zb.d {
            final /* synthetic */ a<T> U3;
            int V3;

            /* renamed from: x */
            Object f21457x;

            /* renamed from: y */
            /* synthetic */ Object f21458y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0358a(a<? super T> aVar, xb.d<? super C0358a> dVar) {
                super(dVar);
                this.U3 = aVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                this.f21458y = obj;
                this.V3 |= Integer.MIN_VALUE;
                return this.U3.c(null, this);
            }
        }

        a(v vVar) {
            this.f21456c = vVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(gc.p<? super T, ? super xb.d<? super tb.e0>, ? extends java.lang.Object> r6, xb.d<? super tb.e0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof s4.w.a.C0358a
                if (r0 == 0) goto L13
                r0 = r7
                s4.w$a$a r0 = (s4.w.a.C0358a) r0
                int r1 = r0.V3
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.V3 = r1
                goto L18
            L13:
                s4.w$a$a r0 = new s4.w$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f21458y
                java.lang.Object r1 = yb.b.c()
                int r2 = r0.V3
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f21457x
                s4.v r6 = (s4.v) r6
                tb.t.b(r7)     // Catch: java.lang.Throwable -> L2d
                goto L54
            L2d:
                r7 = move-exception
                goto L4b
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                tb.t.b(r7)
                s4.v r7 = r5.f21456c
                r0.f21457x = r7     // Catch: java.lang.Throwable -> L47
                r0.V3 = r3     // Catch: java.lang.Throwable -> L47
                java.lang.Object r6 = r6.u(r7, r0)     // Catch: java.lang.Throwable -> L47
                if (r6 != r1) goto L54
                return r1
            L47:
                r6 = move-exception
                r4 = r7
                r7 = r6
                r6 = r4
            L4b:
                boolean r0 = s4.a0.a(r7)
                if (r0 != 0) goto L57
                r6.a(r7)
            L54:
                tb.e0 r6 = tb.e0.f22152a
                return r6
            L57:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: s4.w.a.c(gc.p, xb.d):java.lang.Object");
        }
    }

    public static final <T extends v> Object a(x<T> xVar, T t10, xb.d<? super tb.e0> dVar) {
        Object c10;
        Object a10 = xVar.a(new a(t10), dVar);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : tb.e0.f22152a;
    }
}
