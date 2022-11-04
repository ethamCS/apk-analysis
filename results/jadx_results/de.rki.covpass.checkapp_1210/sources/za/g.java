package za;

import gc.p;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ta.k;
import tb.e0;
import tb.t;
import zb.l;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J=\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0006H\u0081@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u0002*\u00020\u0006H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0010H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lza/g;", BuildConfig.FLAVOR, "Ltb/e0;", "a", "T", "Lkotlin/Function2;", "Lza/c;", "Lxb/d;", "block", "c", "(Lgc/p;Lxb/d;)Ljava/lang/Object;", "d", "(Lxb/d;)Ljava/lang/Object;", "e", "b", "(Lza/c;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "toString", "Lya/c;", "builder", "Lna/a;", "client", "<init>", "(Lya/c;Lna/a;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final ya.c f26579a;

    /* renamed from: b */
    private final na.a f26580b;

    @zb.f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {121}, m = "cleanup")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        int V3;

        /* renamed from: x */
        Object f26581x;

        /* renamed from: y */
        /* synthetic */ Object f26582y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f26582y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @zb.f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {43, 46, 48, 48}, m = "execute")
    /* loaded from: classes.dex */
    public static final class b<T> extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f26583x;

        /* renamed from: y */
        Object f26584y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return g.this.c(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lza/c;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.statement.HttpStatement$execute$3", f = "HttpStatement.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<za.c, xb.d<? super za.c>, Object> {
        /* synthetic */ Object U3;

        /* renamed from: y */
        int f26585y;

        c(xb.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f26585y;
            if (i10 == 0) {
                t.b(obj);
                oa.b c11 = ((za.c) this.U3).c();
                this.f26585y = 1;
                obj = oa.e.a(c11, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return ((oa.b) obj).g();
        }

        /* renamed from: d0 */
        public final Object u(za.c cVar, xb.d<? super za.c> dVar) {
            return ((c) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.U3 = obj;
            return cVar;
        }
    }

    @zb.f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {104}, m = "executeUnsafe")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f26586x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(xb.d<? super d> dVar) {
            super(dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f26586x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    public g(ya.c cVar, na.a aVar) {
        hc.t.e(cVar, "builder");
        hc.t.e(aVar, "client");
        this.f26579a = cVar;
        this.f26580b = aVar;
        a();
    }

    private final void a() {
        Set keySet;
        Map map = (Map) this.f26579a.c().e(qa.f.a());
        if (map == null || (keySet = map.keySet()) == null) {
            return;
        }
        ArrayList<k> arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (obj instanceof k) {
                arrayList.add(obj);
            }
        }
        for (k kVar : arrayList) {
            if (ta.l.a(this.f26580b, kVar) == null) {
                throw new IllegalArgumentException(("Consider installing " + kVar + " feature because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(za.c r5, xb.d<? super tb.e0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof za.g.a
            if (r0 == 0) goto L13
            r0 = r6
            za.g$a r0 = (za.g.a) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            za.g$a r0 = new za.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26582y
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f26581x
            kotlinx.coroutines.b0 r5 = (kotlinx.coroutines.b0) r5
            tb.t.b(r6)
            goto L5c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tb.t.b(r6)
            xb.g r6 = r5.h()
            kotlinx.coroutines.a2$b r2 = kotlinx.coroutines.a2.W0
            xb.g$b r6 = r6.i(r2)
            hc.t.b(r6)
            kotlinx.coroutines.b0 r6 = (kotlinx.coroutines.b0) r6
            r6.V()
            io.ktor.utils.io.h r5 = r5.d()     // Catch: java.lang.Throwable -> L51
            io.ktor.utils.io.j.a(r5)     // Catch: java.lang.Throwable -> L51
        L51:
            r0.f26581x = r6
            r0.V3 = r3
            java.lang.Object r5 = r6.V0(r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            tb.e0 r5 = tb.e0.f22152a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: za.g.b(za.c, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object c(gc.p<? super za.c, ? super xb.d<? super T>, ? extends java.lang.Object> r10, xb.d<? super T> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof za.g.b
            if (r0 == 0) goto L13
            r0 = r11
            za.g$b r0 = (za.g.b) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            za.g$b r0 = new za.g$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L63
            if (r2 == r7) goto L57
            if (r2 == r6) goto L46
            if (r2 == r5) goto L40
            if (r2 == r4) goto L37
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.Object r10 = r0.f26583x
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            tb.t.b(r11)
            goto La3
        L40:
            java.lang.Object r10 = r0.f26583x
            tb.t.b(r11)
            goto L94
        L46:
            java.lang.Object r10 = r0.f26584y
            za.c r10 = (za.c) r10
            java.lang.Object r2 = r0.f26583x
            za.g r2 = (za.g) r2
            tb.t.b(r11)     // Catch: java.lang.Throwable -> L52
            goto L86
        L52:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L96
        L57:
            java.lang.Object r10 = r0.f26584y
            gc.p r10 = (gc.p) r10
            java.lang.Object r2 = r0.f26583x
            za.g r2 = (za.g) r2
            tb.t.b(r11)
            goto L74
        L63:
            tb.t.b(r11)
            r0.f26583x = r9
            r0.f26584y = r10
            r0.W3 = r7
            java.lang.Object r11 = r9.e(r0)
            if (r11 != r1) goto L73
            return r1
        L73:
            r2 = r9
        L74:
            za.c r11 = (za.c) r11
            r0.f26583x = r2     // Catch: java.lang.Throwable -> L95
            r0.f26584y = r11     // Catch: java.lang.Throwable -> L95
            r0.W3 = r6     // Catch: java.lang.Throwable -> L95
            java.lang.Object r10 = r10.u(r11, r0)     // Catch: java.lang.Throwable -> L95
            if (r10 != r1) goto L83
            return r1
        L83:
            r8 = r11
            r11 = r10
            r10 = r8
        L86:
            r0.f26583x = r11
            r0.f26584y = r3
            r0.W3 = r5
            java.lang.Object r10 = r2.b(r10, r0)
            if (r10 != r1) goto L93
            return r1
        L93:
            r10 = r11
        L94:
            return r10
        L95:
            r10 = move-exception
        L96:
            r0.f26583x = r10
            r0.f26584y = r3
            r0.W3 = r4
            java.lang.Object r11 = r2.b(r11, r0)
            if (r11 != r1) goto La3
            return r1
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: za.g.c(gc.p, xb.d):java.lang.Object");
    }

    public final Object d(xb.d<? super za.c> dVar) {
        return c(new c(null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(xb.d<? super za.c> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof za.g.d
            if (r0 == 0) goto L13
            r0 = r5
            za.g$d r0 = (za.g.d) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            za.g$d r0 = new za.g$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f26586x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tb.t.b(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tb.t.b(r5)
            ya.c r5 = new ya.c
            r5.<init>()
            ya.c r2 = r4.f26579a
            ya.c r5 = r5.m(r2)
            na.a r2 = r4.f26580b
            r0.U3 = r3
            java.lang.Object r5 = r2.i(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            oa.b r5 = (oa.b) r5
            za.c r5 = r5.g()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: za.g.e(xb.d):java.lang.Object");
    }

    public String toString() {
        return "HttpStatement[" + this.f26579a.g().c() + ']';
    }
}
