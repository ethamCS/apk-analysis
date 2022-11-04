package ta;

import bb.c;
import db.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.r0;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lna/a;", "Ltb/e0;", "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g {

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "body", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.features.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements gc.q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        /* synthetic */ Object V3;

        /* renamed from: y */
        int f22049y;

        @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"ta/g$a$a", "Ldb/a$a;", BuildConfig.FLAVOR, "d", "Lbb/c;", "contentType", "Lbb/c;", "b", "()Lbb/c;", BuildConfig.FLAVOR, "contentLength", "J", "a", "()Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: ta.g$a$a */
        /* loaded from: classes.dex */
        public static final class C0378a extends a.AbstractC0130a {

            /* renamed from: a */
            private final bb.c f22050a;

            /* renamed from: b */
            private final long f22051b;

            /* renamed from: c */
            final /* synthetic */ bb.c f22052c;

            /* renamed from: d */
            final /* synthetic */ Object f22053d;

            C0378a(bb.c cVar, Object obj) {
                this.f22052c = cVar;
                this.f22053d = obj;
                this.f22050a = cVar == null ? c.a.f5792a.b() : cVar;
                this.f22051b = ((byte[]) obj).length;
            }

            @Override // db.a
            public Long a() {
                return Long.valueOf(this.f22051b);
            }

            @Override // db.a
            public bb.c b() {
                return this.f22050a;
            }

            @Override // db.a.AbstractC0130a
            public byte[] d() {
                return (byte[]) this.f22053d;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ta/g$a$b", "Ldb/a$c;", "Lio/ktor/utils/io/h;", "d", "Lbb/c;", "contentType", "Lbb/c;", "b", "()Lbb/c;", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class b extends a.c {

            /* renamed from: a */
            private final bb.c f22054a;

            /* renamed from: b */
            final /* synthetic */ bb.c f22055b;

            /* renamed from: c */
            final /* synthetic */ Object f22056c;

            b(bb.c cVar, Object obj) {
                this.f22055b = cVar;
                this.f22056c = obj;
                this.f22054a = cVar == null ? c.a.f5792a.b() : cVar;
            }

            @Override // db.a
            public bb.c b() {
                return this.f22054a;
            }

            @Override // db.a.c
            public io.ktor.utils.io.h d() {
                return (io.ktor.utils.io.h) this.f22056c;
            }
        }

        a(xb.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            Object obj2;
            c10 = yb.d.c();
            int i10 = this.f22049y;
            if (i10 == 0) {
                tb.t.b(obj);
                jb.e eVar = (jb.e) this.U3;
                Object obj3 = this.V3;
                bb.m a10 = ((ya.c) eVar.b()).a();
                bb.p pVar = bb.p.f5855a;
                if (a10.g(pVar.c()) == null) {
                    ((ya.c) eVar.b()).a().a(pVar.c(), "*/*");
                }
                String g10 = ((ya.c) eVar.b()).a().g(pVar.g());
                bb.c b10 = g10 == null ? null : bb.c.Companion.b(g10);
                if (obj3 instanceof String) {
                    String str = (String) obj3;
                    if (b10 == null) {
                        b10 = c.C0079c.f5812a.a();
                    }
                    obj2 = new db.b(str, b10, null, 4, null);
                } else {
                    obj2 = obj3 instanceof byte[] ? new C0378a(b10, obj3) : obj3 instanceof io.ktor.utils.io.h ? new b(b10, obj3) : null;
                }
                if (obj2 != null) {
                    ((ya.c) eVar.b()).a().l(pVar.g());
                    this.U3 = null;
                    this.f22049y = 1;
                    if (eVar.O0(obj2, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
            a aVar = new a(dVar);
            aVar.U3 = eVar;
            aVar.V3 = obj;
            return aVar.B(e0.f22152a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", "Lza/d;", "Loa/b;", "<name for destructuring parameter 0>", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.features.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", l = {64, 67, 67, 71, 71, 74, 81, 106, androidx.constraintlayout.widget.i.E2}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements gc.q<jb.e<za.d, oa.b>, za.d, xb.d<? super e0>, Object> {
        int U3;
        private /* synthetic */ Object V3;
        /* synthetic */ Object W3;
        final /* synthetic */ na.a X3;

        /* renamed from: y */
        long f22057y;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lio/ktor/utils/io/u;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.DefaultTransformKt$defaultTransformers$2$channel$1", f = "DefaultTransform.kt", l = {90}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends zb.l implements gc.p<io.ktor.utils.io.u, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ Object V3;
            final /* synthetic */ za.c W3;

            /* renamed from: y */
            int f22058y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, za.c cVar, xb.d<? super a> dVar) {
                super(2, dVar);
                this.V3 = obj;
                this.W3 = cVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f22058y;
                try {
                    if (i10 != 0) {
                        try {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            tb.t.b(obj);
                        } catch (Throwable th2) {
                            za.e.a(this.W3);
                            throw th2;
                        }
                    } else {
                        tb.t.b(obj);
                        io.ktor.utils.io.k e10 = ((io.ktor.utils.io.u) this.U3).e();
                        this.f22058y = 1;
                        if (io.ktor.utils.io.i.b((io.ktor.utils.io.h) this.V3, e10, Long.MAX_VALUE, this) == c10) {
                            return c10;
                        }
                    }
                    za.e.a(this.W3);
                    return e0.f22152a;
                } catch (CancellationException e11) {
                    r0.d(this.W3, e11);
                    throw e11;
                } catch (Throwable th3) {
                    r0.c(this.W3, "Receive failed", th3);
                    throw th3;
                }
            }

            /* renamed from: d0 */
            public final Object u(io.ktor.utils.io.u uVar, xb.d<? super e0> dVar) {
                return ((a) j(uVar, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                a aVar = new a(this.V3, this.W3, dVar);
                aVar.U3 = obj;
                return aVar;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: ta.g$b$b */
        /* loaded from: classes.dex */
        public static final class C0379b extends hc.v implements gc.l<Throwable, e0> {

            /* renamed from: c */
            final /* synthetic */ b0 f22059c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0379b(b0 b0Var) {
                super(1);
                this.f22059c = b0Var;
            }

            public final void b(Throwable th2) {
                this.f22059c.V();
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
                b(th2);
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(na.a aVar, xb.d<? super b> dVar) {
            super(3, dVar);
            this.X3 = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00e7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0127 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x019b A[RETURN] */
        @Override // zb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object B(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 556
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ta.g.b.B(java.lang.Object):java.lang.Object");
        }

        /* renamed from: d0 */
        public final Object s(jb.e<za.d, oa.b> eVar, za.d dVar, xb.d<? super e0> dVar2) {
            b bVar = new b(this.X3, dVar2);
            bVar.V3 = eVar;
            bVar.W3 = dVar;
            return bVar.B(e0.f22152a);
        }
    }

    public static final void a(na.a aVar) {
        hc.t.e(aVar, "<this>");
        aVar.s().o(ya.f.f25994i.b(), new a(null));
        aVar.u().o(za.f.f26572i.a(), new b(aVar, null));
        h.a(aVar);
    }
}
