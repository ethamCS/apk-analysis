package qa;

import gc.p;
import gc.q;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.t;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0014\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0082@ø\u0001\u0000R\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000b\u0010\u001e\u001a\u00020\u001d8BX\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lqa/b;", "Lkotlinx/coroutines/q0;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lya/d;", "data", "Lya/g;", "E0", "(Lya/d;Lxb/d;)Ljava/lang/Object;", "Lna/a;", "client", "Ltb/e0;", "S0", "requestData", "checkExtensions", "executeWithinCallContext", "Lkotlinx/coroutines/l0;", "I0", "()Lkotlinx/coroutines/l0;", "dispatcher", "Lqa/g;", "k", "()Lqa/g;", "config", BuildConfig.FLAVOR, "Lqa/e;", "p0", "()Ljava/util/Set;", "supportedCapabilities", BuildConfig.FLAVOR, "closed", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface b extends q0, Closeable {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {

        @zb.f(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", l = {76, 86}, m = "executeWithinCallContext")
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: qa.b$a$a */
        /* loaded from: classes.dex */
        public static final class C0320a extends zb.d {
            /* synthetic */ Object U3;
            int V3;

            /* renamed from: x */
            Object f19756x;

            /* renamed from: y */
            Object f19757y;

            C0320a(xb.d<? super C0320a> dVar) {
                super(dVar);
            }

            @Override // zb.a
            public final Object B(Object obj) {
                this.U3 = obj;
                this.V3 |= Integer.MIN_VALUE;
                return a.e(null, null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lya/g;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", l = {85}, m = "invokeSuspend")
        /* renamed from: qa.b$a$b */
        /* loaded from: classes.dex */
        public static final class C0321b extends zb.l implements p<q0, xb.d<? super ya.g>, Object> {
            final /* synthetic */ b U3;
            final /* synthetic */ ya.d V3;

            /* renamed from: y */
            int f19758y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0321b(b bVar, ya.d dVar, xb.d<? super C0321b> dVar2) {
                super(2, dVar2);
                this.U3 = bVar;
                this.V3 = dVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f19758y;
                if (i10 == 0) {
                    t.b(obj);
                    if (a.f(this.U3)) {
                        throw new qa.a(null, 1, null);
                    }
                    b bVar = this.U3;
                    ya.d dVar = this.V3;
                    this.f19758y = 1;
                    obj = bVar.E0(dVar, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    t.b(obj);
                }
                return obj;
            }

            /* renamed from: d0 */
            public final Object u(q0 q0Var, xb.d<? super ya.g> dVar) {
                return ((C0321b) j(q0Var, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                return new C0321b(this.U3, this.V3, dVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "content", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {65, 68}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends zb.l implements q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            /* synthetic */ Object V3;
            final /* synthetic */ b W3;
            final /* synthetic */ na.a X3;

            /* renamed from: y */
            int f19759y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar, na.a aVar, xb.d<? super c> dVar) {
                super(3, dVar);
                this.W3 = bVar;
                this.X3 = aVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                jb.e eVar;
                ya.d dVar;
                c10 = yb.d.c();
                int i10 = this.f19759y;
                if (i10 == 0) {
                    t.b(obj);
                    jb.e eVar2 = (jb.e) this.U3;
                    Object obj2 = this.V3;
                    ya.c cVar = new ya.c();
                    cVar.m((ya.c) eVar2.b());
                    cVar.h(obj2);
                    dVar = cVar.b();
                    j.c(dVar);
                    a.d(this.W3, dVar);
                    b bVar = this.W3;
                    this.U3 = eVar2;
                    this.V3 = dVar;
                    this.f19759y = 1;
                    Object e10 = a.e(bVar, dVar, this);
                    if (e10 == c10) {
                        return c10;
                    }
                    eVar = eVar2;
                    obj = e10;
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return e0.f22152a;
                } else {
                    dVar = (ya.d) this.V3;
                    eVar = (jb.e) this.U3;
                    t.b(obj);
                }
                oa.b a10 = oa.c.a(this.X3, dVar, (ya.g) obj);
                this.U3 = null;
                this.V3 = null;
                this.f19759y = 2;
                if (eVar.O0(a10, this) == c10) {
                    return c10;
                }
                return e0.f22152a;
            }

            /* renamed from: d0 */
            public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
                c cVar = new c(this.W3, this.X3, dVar);
                cVar.U3 = eVar;
                cVar.V3 = obj;
                return cVar.B(e0.f22152a);
            }
        }

        public static void d(b bVar, ya.d dVar) {
            for (e<?> eVar : dVar.g()) {
                if (!bVar.p0().contains(eVar)) {
                    throw new IllegalArgumentException(hc.t.l("Engine doesn't support ", eVar).toString());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[PHI: r12 
          PHI: (r12v2 java.lang.Object) = (r12v5 java.lang.Object), (r12v1 java.lang.Object) binds: [B:20:0x007b, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object e(qa.b r10, ya.d r11, xb.d<? super ya.g> r12) {
            /*
                boolean r0 = r12 instanceof qa.b.a.C0320a
                if (r0 == 0) goto L13
                r0 = r12
                qa.b$a$a r0 = (qa.b.a.C0320a) r0
                int r1 = r0.V3
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.V3 = r1
                goto L18
            L13:
                qa.b$a$a r0 = new qa.b$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.U3
                java.lang.Object r1 = yb.b.c()
                int r2 = r0.V3
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L41
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                tb.t.b(r12)
                goto L7e
            L2c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L34:
                java.lang.Object r10 = r0.f19757y
                r11 = r10
                ya.d r11 = (ya.d) r11
                java.lang.Object r10 = r0.f19756x
                qa.b r10 = (qa.b) r10
                tb.t.b(r12)
                goto L55
            L41:
                tb.t.b(r12)
                kotlinx.coroutines.a2 r12 = r11.d()
                r0.f19756x = r10
                r0.f19757y = r11
                r0.V3 = r4
                java.lang.Object r12 = qa.i.a(r10, r12, r0)
                if (r12 != r1) goto L55
                return r1
            L55:
                r4 = r10
                xb.g r12 = (xb.g) r12
                io.ktor.utils.io.s.a(r12)
                qa.k r10 = new qa.k
                r10.<init>(r12)
                xb.g r5 = r12.B(r10)
                r6 = 0
                qa.b$a$b r7 = new qa.b$a$b
                r10 = 0
                r7.<init>(r4, r11, r10)
                r8 = 2
                r9 = 0
                kotlinx.coroutines.x0 r11 = kotlinx.coroutines.j.b(r4, r5, r6, r7, r8, r9)
                r0.f19756x = r10
                r0.f19757y = r10
                r0.V3 = r3
                java.lang.Object r12 = r11.G(r0)
                if (r12 != r1) goto L7e
                return r1
            L7e:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: qa.b.a.e(qa.b, ya.d, xb.d):java.lang.Object");
        }

        public static boolean f(b bVar) {
            a2 a2Var = (a2) bVar.h().i(a2.W0);
            return !(a2Var == null ? false : a2Var.j());
        }

        public static Set<e<?>> g(b bVar) {
            Set<e<?>> b10;
            hc.t.e(bVar, "this");
            b10 = y0.b();
            return b10;
        }

        public static void h(b bVar, na.a aVar) {
            hc.t.e(bVar, "this");
            hc.t.e(aVar, "client");
            aVar.z().o(ya.h.f26008i.a(), new c(bVar, aVar, null));
        }
    }

    Object E0(ya.d dVar, xb.d<? super ya.g> dVar2);

    l0 I0();

    void S0(na.a aVar);

    g k();

    Set<e<?>> p0();
}
