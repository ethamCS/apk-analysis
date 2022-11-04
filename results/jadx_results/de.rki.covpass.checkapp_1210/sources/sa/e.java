package sa;

import db.a;
import gc.p;
import hc.h0;
import hc.v;
import io.ktor.utils.io.k;
import io.ktor.utils.io.u;
import java.io.Closeable;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.t1;
import of.a0;
import of.x;
import of.z;
import org.conscrypt.BuildConfig;
import qa.n;
import ta.t;
import tb.e0;
import tb.t;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¨\u0006\u0015"}, d2 = {"Leg/e;", "Lxb/g;", "context", "Lya/d;", "requestData", "Lio/ktor/utils/io/h;", "i", BuildConfig.FLAVOR, "cause", "request", "g", "callContext", "Lof/z;", "f", "Ldb/a;", "Lof/a0;", "e", "Lof/x$a;", "Lta/t$b;", "timeoutAttributes", "h", "ktor-client-okhttp"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/h;", "b", "()Lio/ktor/utils/io/h;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<io.ktor.utils.io.h> {

        /* renamed from: c */
        final /* synthetic */ db.a f21585c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(db.a aVar) {
            super(0);
            this.f21585c = aVar;
        }

        /* renamed from: b */
        public final io.ktor.utils.io.h invoke() {
            return ((a.c) this.f21585c).d();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/h;", "b", "()Lio/ktor/utils/io/h;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<io.ktor.utils.io.h> {

        /* renamed from: c */
        final /* synthetic */ xb.g f21586c;

        /* renamed from: d */
        final /* synthetic */ db.a f21587d;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lio/ktor/utils/io/u;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1", f = "OkHttpEngine.kt", l = {207}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends l implements p<u, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ db.a V3;

            /* renamed from: y */
            int f21588y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(db.a aVar, xb.d<? super a> dVar) {
                super(2, dVar);
                this.V3 = aVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f21588y;
                if (i10 == 0) {
                    t.b(obj);
                    k e10 = ((u) this.U3).e();
                    this.f21588y = 1;
                    if (((a.d) this.V3).d(e10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    t.b(obj);
                }
                return e0.f22152a;
            }

            /* renamed from: d0 */
            public final Object u(u uVar, xb.d<? super e0> dVar) {
                return ((a) j(uVar, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                a aVar = new a(this.V3, dVar);
                aVar.U3 = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.g gVar, db.a aVar) {
            super(0);
            this.f21586c = gVar;
            this.f21587d = aVar;
        }

        /* renamed from: b */
        public final io.ktor.utils.io.h invoke() {
            return io.ktor.utils.io.p.e(t1.f15571c, this.f21586c, false, new a(this.f21587d, null), 2, null).e();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "key", "value", "Ltb/e0;", "b", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends v implements p<String, String, e0> {

        /* renamed from: c */
        final /* synthetic */ z.a f21589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z.a aVar) {
            super(2);
            this.f21589c = aVar;
        }

        public final void b(String str, String str2) {
            hc.t.e(str, "key");
            hc.t.e(str2, "value");
            if (hc.t.a(str, bb.p.f5855a.f())) {
                return;
            }
            this.f21589c.a(str, str2);
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ e0 u(String str, String str2) {
            b(str, str2);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lio/ktor/utils/io/u;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", l = {163}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements p<u, xb.d<? super e0>, Object> {
        Object U3;
        Object V3;
        Object W3;
        Object X3;
        int Y3;
        private /* synthetic */ Object Z3;

        /* renamed from: a4 */
        final /* synthetic */ eg.e f21590a4;

        /* renamed from: b4 */
        final /* synthetic */ xb.g f21591b4;

        /* renamed from: c4 */
        final /* synthetic */ ya.d f21592c4;

        /* renamed from: y */
        Object f21593y;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "buffer", "Ltb/e0;", "b", "(Ljava/nio/ByteBuffer;)V"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class a extends v implements gc.l<ByteBuffer, e0> {

            /* renamed from: c */
            final /* synthetic */ h0 f21594c;

            /* renamed from: d */
            final /* synthetic */ eg.e f21595d;

            /* renamed from: q */
            final /* synthetic */ ya.d f21596q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, eg.e eVar, ya.d dVar) {
                super(1);
                this.f21594c = h0Var;
                this.f21595d = eVar;
                this.f21596q = dVar;
            }

            public final void b(ByteBuffer byteBuffer) {
                hc.t.e(byteBuffer, "buffer");
                try {
                    this.f21594c.f11761c = this.f21595d.read(byteBuffer);
                } catch (Throwable th2) {
                    throw e.g(th2, this.f21596q);
                }
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(ByteBuffer byteBuffer) {
                b(byteBuffer);
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(eg.e eVar, xb.g gVar, ya.d dVar, xb.d<? super d> dVar2) {
            super(2, dVar2);
            this.f21590a4 = eVar;
            this.f21591b4 = gVar;
            this.f21592c4 = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.nio.channels.ReadableByteChannel, eg.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v2 */
        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            d dVar;
            u uVar;
            Closeable closeable;
            xb.g gVar;
            ya.d dVar2;
            eg.e eVar;
            h0 h0Var;
            k e10;
            a aVar;
            c10 = yb.d.c();
            int i10 = this.Y3;
            try {
                if (i10 == 0) {
                    t.b(obj);
                    u uVar2 = (u) this.Z3;
                    closeable = this.f21590a4;
                    xb.g gVar2 = this.f21591b4;
                    ya.d dVar3 = this.f21592c4;
                    uVar = uVar2;
                    gVar = gVar2;
                    h0Var = new h0();
                    dVar = this;
                    dVar2 = dVar3;
                    eVar = closeable;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    h0Var = (h0) this.X3;
                    eg.e eVar2 = (eg.e) this.W3;
                    dVar2 = (ya.d) this.V3;
                    gVar = (xb.g) this.U3;
                    closeable = (Closeable) this.f21593y;
                    uVar = (u) this.Z3;
                    t.b(obj);
                    dVar = this;
                    eVar = eVar2;
                }
                do {
                    Throwable th2 = null;
                    if (!eVar.isOpen() || !e2.i(gVar) || h0Var.f11761c < 0) {
                        return e0.f22152a;
                    }
                    e10 = uVar.e();
                    aVar = new a(h0Var, eVar, dVar2);
                    dVar.Z3 = uVar;
                    dVar.f21593y = closeable;
                    dVar.U3 = gVar;
                    dVar.V3 = dVar2;
                    dVar.W3 = eVar;
                    dVar.X3 = h0Var;
                    dVar.Y3 = 1;
                } while (k.a.a(e10, 0, aVar, dVar, 1, null) != c10);
                return c10;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } finally {
                    dc.b.a(closeable, th3);
                }
            }
        }

        /* renamed from: d0 */
        public final Object u(u uVar, xb.d<? super e0> dVar) {
            return ((d) j(uVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            d dVar2 = new d(this.f21590a4, this.f21591b4, this.f21592c4, dVar);
            dVar2.Z3 = obj;
            return dVar2;
        }
    }

    public static final /* synthetic */ z a(ya.d dVar, xb.g gVar) {
        return f(dVar, gVar);
    }

    public static final /* synthetic */ x.a c(x.a aVar, t.b bVar) {
        return h(aVar, bVar);
    }

    public static final /* synthetic */ io.ktor.utils.io.h d(eg.e eVar, xb.g gVar, ya.d dVar) {
        return i(eVar, gVar, dVar);
    }

    public static final a0 e(db.a aVar, xb.g gVar) {
        hc.t.e(aVar, "<this>");
        hc.t.e(gVar, "callContext");
        if (aVar instanceof a.AbstractC0130a) {
            byte[] d10 = ((a.AbstractC0130a) aVar).d();
            return a0.Companion.a(d10, null, 0, d10.length);
        } else if (aVar instanceof a.c) {
            return new i(aVar.a(), new a(aVar));
        } else {
            if (aVar instanceof a.d) {
                return new i(aVar.a(), new b(gVar, aVar));
            }
            if (!(aVar instanceof a.b)) {
                throw new oa.k(aVar);
            }
            return a0.Companion.a(new byte[0], null, 0, 0);
        }
    }

    public static final z f(ya.d dVar, xb.g gVar) {
        z.a aVar = new z.a();
        aVar.l(dVar.h().toString());
        n.b(dVar.e(), dVar.b(), new c(aVar));
        aVar.f(dVar.f().c(), uf.f.b(dVar.f().c()) ? e(dVar.b(), gVar) : null);
        return aVar.b();
    }

    public static final Throwable g(Throwable th2, ya.d dVar) {
        return th2 instanceof SocketTimeoutException ? ta.u.b(dVar, th2) : th2;
    }

    public static final x.a h(x.a aVar, t.b bVar) {
        Long c10 = bVar.c();
        if (c10 != null) {
            aVar.e(ta.u.d(c10.longValue()), TimeUnit.MILLISECONDS);
        }
        Long e10 = bVar.e();
        if (e10 != null) {
            long longValue = e10.longValue();
            long d10 = ta.u.d(longValue);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.Q(d10, timeUnit);
            aVar.k0(ta.u.d(longValue), timeUnit);
        }
        return aVar;
    }

    public static final io.ktor.utils.io.h i(eg.e eVar, xb.g gVar, ya.d dVar) {
        return io.ktor.utils.io.p.e(t1.f15571c, gVar, false, new d(eVar, gVar, dVar, null), 2, null).e();
    }
}
