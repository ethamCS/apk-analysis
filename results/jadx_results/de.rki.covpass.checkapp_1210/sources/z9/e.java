package z9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x0;
import kotlinx.coroutines.y2;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
import tb.t;
import ub.v;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:82)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:60)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:54)
    */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a]\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ac\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032$\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "R", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "failFast", "Lkotlin/Function2;", "Lxb/d;", BuildConfig.FLAVOR, "block", BuildConfig.FLAVOR, "a", "(Ljava/lang/Iterable;ZLgc/p;Lxb/d;)Ljava/lang/Object;", "c", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/q0;", BuildConfig.FLAVOR, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.utils.CoroutinesKt$parallelMap$2", f = "Coroutines.kt", l = {115}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements gc.p<q0, xb.d<? super List<? extends R>>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ Iterable<T> V3;
        final /* synthetic */ gc.p<T, xb.d<? super R>, Object> W3;
        final /* synthetic */ boolean X3;

        /* renamed from: y */
        int f26539y;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/q0;", "Ltb/s;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "de.rki.covpass.sdk.utils.CoroutinesKt$parallelMap$2$results$1$1", f = "Coroutines.kt", l = {105}, m = "invokeSuspend")
        /* renamed from: z9.e$a$a */
        /* loaded from: classes.dex */
        public static final class C0473a extends zb.l implements gc.p<q0, xb.d<? super s<? extends R>>, Object> {
            final /* synthetic */ gc.p<T, xb.d<? super R>, Object> U3;
            final /* synthetic */ T V3;
            final /* synthetic */ boolean W3;

            /* renamed from: y */
            int f26540y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0473a(gc.p<? super T, ? super xb.d<? super R>, ? extends Object> pVar, T t10, boolean z10, xb.d<? super C0473a> dVar) {
                super(2, dVar);
                this.U3 = pVar;
                this.V3 = t10;
                this.W3 = z10;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                Object obj2;
                c10 = yb.d.c();
                int i10 = this.f26540y;
                try {
                    if (i10 == 0) {
                        t.b(obj);
                        s.a aVar = s.Companion;
                        gc.p<T, xb.d<? super R>, Object> pVar = this.U3;
                        T t10 = this.V3;
                        this.f26540y = 1;
                        obj = pVar.u(t10, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        t.b(obj);
                    }
                    obj2 = s.c(obj);
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    if (this.W3) {
                        throw th2;
                    }
                    s.a aVar2 = s.Companion;
                    obj2 = s.c(t.a(th2));
                }
                return s.b(obj2);
            }

            public final Object d0(q0 q0Var, xb.d<? super s<? extends R>> dVar) {
                return ((C0473a) j(q0Var, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                return new C0473a(this.U3, this.V3, this.W3, dVar);
            }

            @Override // gc.p
            public /* bridge */ /* synthetic */ Object u(q0 q0Var, Object obj) {
                return d0(q0Var, (xb.d) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Iterable<? extends T> iterable, gc.p<? super T, ? super xb.d<? super R>, ? extends Object> pVar, boolean z10, xb.d<? super a> dVar) {
            super(2, dVar);
            this.V3 = iterable;
            this.W3 = pVar;
            this.X3 = z10;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            int s10;
            int s11;
            x0 b10;
            c10 = yb.d.c();
            int i10 = this.f26539y;
            if (i10 == 0) {
                t.b(obj);
                q0 q0Var = (q0) this.U3;
                Iterable<T> iterable = this.V3;
                gc.p<T, xb.d<? super R>, Object> pVar = this.W3;
                boolean z10 = this.X3;
                s11 = v.s(iterable, 10);
                ArrayList arrayList = new ArrayList(s11);
                for (T t10 : iterable) {
                    b10 = kotlinx.coroutines.l.b(q0Var, null, null, new C0473a(pVar, t10, z10, null), 3, null);
                    arrayList.add(b10);
                }
                this.f26539y = 1;
                obj = kotlinx.coroutines.f.a(arrayList, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            List<s> list = (List) obj;
            s10 = v.s(list, 10);
            ArrayList arrayList2 = new ArrayList(s10);
            for (s sVar : list) {
                Object n10 = sVar.n();
                t.b(n10);
                arrayList2.add(n10);
            }
            return arrayList2;
        }

        public final Object d0(q0 q0Var, xb.d<? super List<? extends R>> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.V3, this.W3, this.X3, dVar);
            aVar.U3 = obj;
            return aVar;
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ Object u(q0 q0Var, Object obj) {
            return d0(q0Var, (xb.d) obj);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @zb.f(c = "de.rki.covpass.sdk.utils.CoroutinesKt", f = "Coroutines.kt", l = {131}, m = "parallelMapNotNull")
    /* loaded from: classes.dex */
    public static final class b<T, R> extends zb.d {

        /* renamed from: x */
        /* synthetic */ Object f26541x;

        /* renamed from: y */
        int f26542y;

        b(xb.d<? super b> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f26541x = obj;
            this.f26542y |= Integer.MIN_VALUE;
            return e.c(null, false, null, this);
        }
    }

    public static final <T, R> Object a(Iterable<? extends T> iterable, boolean z10, gc.p<? super T, ? super xb.d<? super R>, ? extends Object> pVar, xb.d<? super List<? extends R>> dVar) {
        return y2.c(new a(iterable, pVar, z10, null), dVar);
    }

    public static /* synthetic */ Object b(Iterable iterable, boolean z10, gc.p pVar, xb.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(iterable, z10, pVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, R> java.lang.Object c(java.lang.Iterable<? extends T> r4, boolean r5, gc.p<? super T, ? super xb.d<? super R>, ? extends java.lang.Object> r6, xb.d<? super java.util.List<? extends R>> r7) {
        /*
            boolean r0 = r7 instanceof z9.e.b
            if (r0 == 0) goto L13
            r0 = r7
            z9.e$b r0 = (z9.e.b) r0
            int r1 = r0.f26542y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26542y = r1
            goto L18
        L13:
            z9.e$b r0 = new z9.e$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26541x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.f26542y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tb.t.b(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tb.t.b(r7)
            r0.f26542y = r3
            java.lang.Object r7 = a(r4, r5, r6, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r4 = ub.s.S(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.e.c(java.lang.Iterable, boolean, gc.p, xb.d):java.lang.Object");
    }

    public static /* synthetic */ Object d(Iterable iterable, boolean z10, gc.p pVar, xb.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(iterable, z10, pVar, dVar);
    }
}
