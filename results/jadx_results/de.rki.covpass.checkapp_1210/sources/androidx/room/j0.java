package androidx.room;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.s;
import xb.g;
@Metadata(bv = {}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b*\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"R", "Landroidx/room/i0;", "Lkotlin/Function1;", "Lxb/d;", BuildConfig.FLAVOR, "block", "d", "(Landroidx/room/i0;Lgc/l;Lxb/d;)Ljava/lang/Object;", "Lxb/g;", "c", "(Landroidx/room/i0;Lxb/d;)Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/a2;", "controlJob", "Lxb/e;", "b", "(Ljava/util/concurrent/Executor;Lkotlinx/coroutines/a2;Lxb/d;)Ljava/lang/Object;", "room-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class j0 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<Throwable, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ a2 f4937c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a2 a2Var) {
            super(1);
            this.f4937c = a2Var;
        }

        public final void b(Throwable th2) {
            a2.a.a(this.f4937c, null, 1, null);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
            b(th2);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ kotlinx.coroutines.p<xb.e> f4938c;

        /* renamed from: d */
        final /* synthetic */ a2 f4939d;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", f = "RoomDatabase.kt", l = {e.j.K0}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        static final class a extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ kotlinx.coroutines.p<xb.e> V3;
            final /* synthetic */ a2 W3;

            /* renamed from: y */
            int f4940y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.p<? super xb.e> pVar, a2 a2Var, xb.d<? super a> dVar) {
                super(2, dVar);
                this.V3 = pVar;
                this.W3 = a2Var;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f4940y;
                if (i10 == 0) {
                    tb.t.b(obj);
                    kotlinx.coroutines.p<xb.e> pVar = this.V3;
                    s.a aVar = tb.s.Companion;
                    g.b i11 = ((q0) this.U3).h().i(xb.e.X0);
                    hc.t.b(i11);
                    pVar.y(tb.s.c(i11));
                    a2 a2Var = this.W3;
                    this.f4940y = 1;
                    if (a2Var.V0(this) == c10) {
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
            public final Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
                return ((a) j(q0Var, dVar)).B(tb.e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
                a aVar = new a(this.V3, this.W3, dVar);
                aVar.U3 = obj;
                return aVar;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.p<? super xb.e> pVar, a2 a2Var) {
            this.f4938c = pVar;
            this.f4939d = a2Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            kotlinx.coroutines.k.b(null, new a(this.f4938c, this.f4939d, null), 1, null);
        }
    }

    @zb.f(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabase.kt", l = {99}, m = "createTransactionContext")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends zb.d {
        /* synthetic */ Object U3;
        int V3;

        /* renamed from: x */
        Object f4941x;

        /* renamed from: y */
        Object f4942y;

        c(xb.d<? super c> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.V3 |= Integer.MIN_VALUE;
            return j0.c(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.l<Throwable, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ kotlinx.coroutines.b0 f4943c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlinx.coroutines.b0 b0Var) {
            super(1);
            this.f4943c = b0Var;
        }

        public final void b(Throwable th2) {
            a2.a.a(this.f4943c, null, 1, null);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
            b(th2);
            return tb.e0.f22152a;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @zb.f(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabase.kt", l = {50, 51}, m = "withTransaction")
    /* loaded from: classes.dex */
    public static final class e<R> extends zb.d {
        /* synthetic */ Object U3;
        int V3;

        /* renamed from: x */
        Object f4944x;

        /* renamed from: y */
        Object f4945y;

        e(xb.d<? super e> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.V3 |= Integer.MIN_VALUE;
            return j0.d(null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "androidx.room.RoomDatabaseKt$withTransaction$2", f = "RoomDatabase.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends zb.l implements gc.p<q0, xb.d<? super R>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ i0 V3;
        final /* synthetic */ gc.l<xb.d<? super R>, Object> W3;

        /* renamed from: y */
        int f4946y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(i0 i0Var, gc.l<? super xb.d<? super R>, ? extends Object> lVar, xb.d<? super f> dVar) {
            super(2, dVar);
            this.V3 = i0Var;
            this.W3 = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v4 */
        @Override // zb.a
        public final Object B(Object obj) {
            h1.n c10;
            Throwable th2;
            Throwable th3;
            h1.n nVar;
            c10 = yb.d.c();
            int i10 = this.f4946y;
            try {
                if (i10 == 0) {
                    tb.t.b(obj);
                    g.b i11 = ((q0) this.U3).h().i(h1.n.f11161x);
                    hc.t.b(i11);
                    h1.n nVar2 = (h1.n) i11;
                    nVar2.a();
                    try {
                        this.V3.e();
                        try {
                            gc.l<xb.d<? super R>, Object> lVar = this.W3;
                            this.U3 = nVar2;
                            this.f4946y = 1;
                            Object invoke = lVar.invoke(this);
                            if (invoke == c10) {
                                return c10;
                            }
                            nVar = nVar2;
                            obj = invoke;
                        } catch (Throwable th4) {
                            th3 = th4;
                            this.V3.i();
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        c10 = nVar2;
                        th2 = th5;
                        c10.c();
                        throw th2;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    nVar = (h1.n) this.U3;
                    try {
                        tb.t.b(obj);
                    } catch (Throwable th6) {
                        th3 = th6;
                        this.V3.i();
                        throw th3;
                    }
                }
                this.V3.D();
                this.V3.i();
                nVar.c();
                return obj;
            } catch (Throwable th7) {
                th2 = th7;
            }
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super R> dVar) {
            return ((f) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            f fVar = new f(this.V3, this.W3, dVar);
            fVar.U3 = obj;
            return fVar;
        }
    }

    private static final Object b(Executor executor, a2 a2Var, xb.d<? super xb.e> dVar) {
        xb.d b10;
        Object c10;
        b10 = yb.c.b(dVar);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(b10, 1);
        qVar.z();
        qVar.N(new a(a2Var));
        try {
            executor.execute(new b(qVar, a2Var));
        } catch (RejectedExecutionException e10) {
            qVar.g(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object s10 = qVar.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar);
        }
        return s10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.room.i0 r6, xb.d<? super xb.g> r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.j0.c
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.j0$c r0 = (androidx.room.j0.c) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            androidx.room.j0$c r0 = new androidx.room.j0$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f4942y
            kotlinx.coroutines.b0 r6 = (kotlinx.coroutines.b0) r6
            java.lang.Object r0 = r0.f4941x
            androidx.room.i0 r0 = (androidx.room.i0) r0
            tb.t.b(r7)
            goto L71
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            tb.t.b(r7)
            r7 = 0
            kotlinx.coroutines.b0 r7 = kotlinx.coroutines.e2.b(r7, r3, r7)
            xb.g r2 = r0.b()
            kotlinx.coroutines.a2$b r4 = kotlinx.coroutines.a2.W0
            xb.g$b r2 = r2.i(r4)
            kotlinx.coroutines.a2 r2 = (kotlinx.coroutines.a2) r2
            if (r2 == 0) goto L57
            androidx.room.j0$d r4 = new androidx.room.j0$d
            r4.<init>(r7)
            r2.D0(r4)
        L57:
            java.util.concurrent.Executor r2 = r6.r()
            java.lang.String r4 = "transactionExecutor"
            hc.t.d(r2, r4)
            r0.f4941x = r6
            r0.f4942y = r7
            r0.V3 = r3
            java.lang.Object r0 = b(r2, r7, r0)
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L71:
            xb.e r7 = (xb.e) r7
            h1.n r1 = new h1.n
            r1.<init>(r6, r7)
            java.lang.ThreadLocal r0 = r0.q()
            java.lang.String r2 = "suspendingTransactionId"
            hc.t.d(r0, r2)
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r6 = zb.b.c(r6)
            kotlinx.coroutines.z2 r6 = kotlinx.coroutines.a3.a(r0, r6)
            xb.g r7 = r7.B(r1)
            xb.g r6 = r7.B(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.j0.c(androidx.room.i0, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:25:0x0078, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object d(androidx.room.i0 r5, gc.l<? super xb.d<? super R>, ? extends java.lang.Object> r6, xb.d<? super R> r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.j0.e
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.j0$e r0 = (androidx.room.j0.e) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            androidx.room.j0$e r0 = new androidx.room.j0$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r7)
            goto L7b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f4945y
            r6 = r5
            gc.l r6 = (gc.l) r6
            java.lang.Object r5 = r0.f4944x
            androidx.room.i0 r5 = (androidx.room.i0) r5
            tb.t.b(r7)
            goto L66
        L41:
            tb.t.b(r7)
            xb.g r7 = r0.b()
            h1.n$a r2 = h1.n.f11161x
            xb.g$b r7 = r7.i(r2)
            h1.n r7 = (h1.n) r7
            if (r7 == 0) goto L59
            xb.e r7 = r7.b()
            if (r7 == 0) goto L59
            goto L68
        L59:
            r0.f4944x = r5
            r0.f4945y = r6
            r0.V3 = r4
            java.lang.Object r7 = c(r5, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            xb.g r7 = (xb.g) r7
        L68:
            androidx.room.j0$f r2 = new androidx.room.j0$f
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f4944x = r4
            r0.f4945y = r4
            r0.V3 = r3
            java.lang.Object r7 = kotlinx.coroutines.j.g(r7, r2, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.j0.d(androidx.room.i0, gc.l, xb.d):java.lang.Object");
    }
}
