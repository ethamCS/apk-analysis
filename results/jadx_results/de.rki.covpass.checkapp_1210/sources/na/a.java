package na;

import gc.l;
import gc.q;
import hc.k0;
import hc.v;
import hc.y;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import oc.k;
import org.conscrypt.BuildConfig;
import qa.g;
import ta.m;
import ta.n;
import ta.p;
import ta.s;
import tb.e0;
import tb.t;
import ya.f;
import ya.h;
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B!\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0010\b\u0002\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020@0\n¢\u0006\u0004\bF\u0010GB)\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u000e\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020@0\n\u0012\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\bF\u0010HJ\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00002\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u00107\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010A\u001a\b\u0012\u0004\u0012\u00020@0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, d2 = {"Lna/a;", "Lkotlinx/coroutines/q0;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lya/c;", "builder", "Loa/b;", "i", "(Lya/c;Lxb/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lna/b;", "Ltb/e0;", "block", "f", "(Lgc/l;)Lna/a;", "close", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "<set-?>", "manageEngine$delegate", "Lkc/d;", "p", "()Z", "B", "(Z)V", "manageEngine", "Lqa/b;", "engine", "Lqa/b;", "n", "()Lqa/b;", "Lxb/g;", "coroutineContext", "Lxb/g;", "h", "()Lxb/g;", "Lya/f;", "requestPipeline", "Lya/f;", "s", "()Lya/f;", "Lza/f;", "responsePipeline", "Lza/f;", "u", "()Lza/f;", "Lya/h;", "sendPipeline", "Lya/h;", "z", "()Lya/h;", "Lza/b;", "receivePipeline", "Lza/b;", "r", "()Lza/b;", "Lfb/b;", "attributes", "Lfb/b;", "c1", "()Lfb/b;", "Lqa/g;", "config", "Lna/b;", "j", "()Lna/b;", "userConfig", "<init>", "(Lqa/b;Lna/b;)V", "(Lqa/b;Lna/b;Z)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a implements q0, Closeable {

    /* renamed from: b4 */
    static final /* synthetic */ k<Object>[] f16899b4 = {k0.e(new y(a.class, "manageEngine", "getManageEngine()Z", 0))};

    /* renamed from: c4 */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f16900c4 = AtomicIntegerFieldUpdater.newUpdater(a.class, "closed");
    private final f U3;
    private final za.f V3;
    private final h W3;
    private final za.b X3;
    private final fb.b Y3;
    private final g Z3;

    /* renamed from: a4 */
    private final na.b<g> f16901a4;

    /* renamed from: c */
    private final qa.b f16902c;
    private volatile /* synthetic */ int closed;

    /* renamed from: d */
    private final na.b<? extends g> f16903d;

    /* renamed from: q */
    private final kc.d f16904q;

    /* renamed from: x */
    private final b0 f16905x;

    /* renamed from: y */
    private final xb.g f16906y;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: na.a$a */
    /* loaded from: classes.dex */
    public static final class C0260a extends v implements l<Throwable, e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0260a() {
            super(1);
            a.this = r1;
        }

        public final void b(Throwable th2) {
            if (th2 != null) {
                r0.e(a.this.n(), null, 1, null);
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "call", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {149, 150}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        /* synthetic */ Object V3;

        /* renamed from: y */
        int f16908y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(3, dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            jb.e eVar;
            c10 = yb.d.c();
            int i10 = this.f16908y;
            if (i10 == 0) {
                t.b(obj);
                eVar = (jb.e) this.U3;
                Object obj2 = this.V3;
                if (!(obj2 instanceof oa.b)) {
                    throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + k0.b(obj2.getClass()) + ").").toString());
                }
                za.b r10 = a.this.r();
                za.c g10 = ((oa.b) obj2).g();
                this.U3 = eVar;
                this.f16908y = 1;
                obj = r10.d(obj2, g10, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return e0.f22152a;
            } else {
                eVar = (jb.e) this.U3;
                t.b(obj);
            }
            oa.b c11 = ((za.c) obj).c();
            this.U3 = null;
            this.f16908y = 2;
            if (eVar.O0(c11, this) == c10) {
                return c10;
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
            b bVar = new b(dVar);
            bVar.U3 = eVar;
            bVar.V3 = obj;
            return bVar.B(e0.f22152a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lna/a;", "Ltb/e0;", "b", "(Lna/a;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends v implements l<a, e0> {

        /* renamed from: c */
        public static final c f16909c = new c();

        c() {
            super(1);
        }

        public final void b(a aVar) {
            hc.t.e(aVar, "$this$install");
            ta.g.a(aVar);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(a aVar) {
            b(aVar);
            return e0.f22152a;
        }
    }

    @zb.f(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", l = {191}, m = "execute")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f16910x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(xb.d<? super d> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f16910x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return a.this.i(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class e implements kc.d<Object, Boolean> {

        /* renamed from: a */
        private Boolean f16912a;

        /* renamed from: b */
        final /* synthetic */ Object f16913b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Object obj) {
            this.f16913b = obj;
            this.f16912a = obj;
        }

        @Override // kc.d, kc.c
        public Boolean a(Object obj, k<?> kVar) {
            hc.t.e(obj, "thisRef");
            hc.t.e(kVar, "property");
            return this.f16912a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, Boolean bool) {
            hc.t.e(obj, "thisRef");
            hc.t.e(kVar, "property");
            this.f16912a = bool;
        }
    }

    public a(qa.b bVar, na.b<? extends g> bVar2) {
        hc.t.e(bVar, "engine");
        hc.t.e(bVar2, "userConfig");
        this.f16902c = bVar;
        this.f16903d = bVar2;
        this.f16904q = new e(Boolean.FALSE);
        this.closed = 0;
        b0 a10 = e2.a((a2) bVar.h().i(a2.W0));
        this.f16905x = a10;
        this.f16906y = bVar.h().B(a10);
        this.U3 = new f(bVar2.c());
        this.V3 = new za.f(bVar2.c());
        h hVar = new h(bVar2.c());
        this.W3 = hVar;
        this.X3 = new za.b(bVar2.c());
        this.Y3 = fb.d.a(true);
        this.Z3 = bVar.k();
        this.f16901a4 = new na.b<>();
        ab.c.a();
        if (p()) {
            a10.D0(new C0260a());
        }
        bVar.S0(this);
        hVar.o(h.f26008i.b(), new b(null));
        na.b.k(j(), p.f22100a, null, 2, null);
        na.b.k(j(), ta.a.f22029a, null, 2, null);
        if (bVar2.g()) {
            na.b.k(j(), m.f22080d, null, 2, null);
            j().h("DefaultTransformers", c.f16909c);
        }
        na.b.k(j(), s.f22105c, null, 2, null);
        if (bVar2.f()) {
            na.b.k(j(), n.f22092a, null, 2, null);
        }
        j().l(bVar2);
        ta.f.b(j());
        j().i(this);
        io.ktor.utils.io.s.a(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(qa.b bVar, na.b<? extends g> bVar2, boolean z10) {
        this(bVar, bVar2);
        hc.t.e(bVar, "engine");
        hc.t.e(bVar2, "userConfig");
        B(z10);
    }

    private final void B(boolean z10) {
        this.f16904q.b(this, f16899b4[0], Boolean.valueOf(z10));
    }

    private final boolean p() {
        return ((Boolean) this.f16904q.a(this, f16899b4[0])).booleanValue();
    }

    public final fb.b c1() {
        return this.Y3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!f16900c4.compareAndSet(this, 0, 1)) {
            return;
        }
        fb.b bVar = (fb.b) this.Y3.c(ta.l.c());
        Iterator<T> it = bVar.f().iterator();
        while (it.hasNext()) {
            Object c10 = bVar.c((fb.a) it.next());
            if (c10 instanceof Closeable) {
                ((Closeable) c10).close();
            }
        }
        this.f16905x.V();
        if (!p()) {
            return;
        }
        this.f16902c.close();
    }

    public final a f(l<? super na.b<?>, e0> lVar) {
        hc.t.e(lVar, "block");
        qa.b bVar = this.f16902c;
        na.b bVar2 = new na.b();
        bVar2.l(this.f16903d);
        lVar.invoke(bVar2);
        return new a(bVar, bVar2, p());
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.f16906y;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(ya.c r5, xb.d<? super oa.b> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof na.a.d
            if (r0 == 0) goto L13
            r0 = r6
            na.a$d r0 = (na.a.d) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            na.a$d r0 = new na.a$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16910x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tb.t.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tb.t.b(r6)
            ya.f r6 = r4.s()
            java.lang.Object r2 = r5.d()
            r0.U3 = r3
            java.lang.Object r6 = r6.d(r5, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            oa.b r6 = (oa.b) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: na.a.i(ya.c, xb.d):java.lang.Object");
    }

    public final na.b<g> j() {
        return this.f16901a4;
    }

    public final qa.b n() {
        return this.f16902c;
    }

    public final za.b r() {
        return this.X3;
    }

    public final f s() {
        return this.U3;
    }

    public String toString() {
        return "HttpClient[" + this.f16902c + ']';
    }

    public final za.f u() {
        return this.V3;
    }

    public final h z() {
        return this.W3;
    }
}
