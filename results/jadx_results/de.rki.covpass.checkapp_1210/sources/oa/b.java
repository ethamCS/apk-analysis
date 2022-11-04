package oa;

import hc.e0;
import hc.k0;
import hc.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u00011B\u0011\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b/\u00100J\u0013\u0010\u0003\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R*\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@@X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020#8\u0006@@X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0014X\u0094D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Loa/b;", "Lkotlinx/coroutines/q0;", "Lio/ktor/utils/io/h;", "i", "(Lxb/d;)Ljava/lang/Object;", "Lkb/a;", "info", BuildConfig.FLAVOR, "l", "(Lkb/a;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lna/a;", "client$delegate", "Lkc/c;", "d", "()Lna/a;", "client", "Lxb/g;", "h", "()Lxb/g;", "coroutineContext", "Lfb/b;", "c1", "()Lfb/b;", "attributes", "Lya/b;", "<set-?>", "request", "Lya/b;", "f", "()Lya/b;", "m", "(Lya/b;)V", "Lza/c;", "response", "Lza/c;", "g", "()Lza/c;", "n", "(Lza/c;)V", BuildConfig.FLAVOR, "allowDoubleReceive", "Z", "c", "()Z", "<init>", "(Lna/a;)V", "a", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class b implements q0 {

    /* renamed from: c */
    private final kc.c f17717c;

    /* renamed from: d */
    public ya.b f17718d;

    /* renamed from: q */
    public za.c f17719q;
    private volatile /* synthetic */ int received = 0;

    /* renamed from: x */
    private final boolean f17720x;

    /* renamed from: y */
    static final /* synthetic */ oc.k<Object>[] f17716y = {k0.g(new e0(b.class, "client", "getClient()Lio/ktor/client/HttpClient;", 0))};
    public static final a Companion = new a(null);
    private static final fb.a<Object> V3 = new fb.a<>("CustomResponse");
    private static final /* synthetic */ AtomicIntegerFieldUpdater U3 = AtomicIntegerFieldUpdater.newUpdater(b.class, "received");

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Loa/b$a;", BuildConfig.FLAVOR, "Lfb/a;", "CustomResponse", "Lfb/a;", "a", "()Lfb/a;", "getCustomResponse$annotations", "()V", "<init>", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fb.a<Object> a() {
            return b.V3;
        }
    }

    @zb.f(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {95, 100}, m = "receive")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: oa.b$b */
    /* loaded from: classes.dex */
    public static final class C0272b extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f17721x;

        /* renamed from: y */
        Object f17722y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0272b(xb.d<? super C0272b> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return b.this.l(null, this);
        }
    }

    public b(na.a aVar) {
        t.e(aVar, "client");
        this.f17717c = nb.c.b(aVar);
    }

    static /* synthetic */ Object j(b bVar, xb.d dVar) {
        return bVar.g().d();
    }

    protected boolean c() {
        return this.f17720x;
    }

    public final fb.b c1() {
        return f().c1();
    }

    public final na.a d() {
        return (na.a) this.f17717c.a(this, f17716y[0]);
    }

    public final ya.b f() {
        ya.b bVar = this.f17718d;
        if (bVar != null) {
            return bVar;
        }
        t.s("request");
        return null;
    }

    public final za.c g() {
        za.c cVar = this.f17719q;
        if (cVar != null) {
            return cVar;
        }
        t.s("response");
        return null;
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return g().h();
    }

    protected Object i(xb.d<? super io.ktor.utils.io.h> dVar) {
        return j(this, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:18:0x0048, B:40:0x009d, B:42:0x00a8, B:52:0x00e8, B:53:0x0107), top: B:66:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:46:0x00ba, B:50:0x00d2, B:51:0x00e7), top: B:63:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8 A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #3 {all -> 0x004c, blocks: (B:18:0x0048, B:40:0x009d, B:42:0x00a8, B:52:0x00e8, B:53:0x0107), top: B:66:0x0048 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kb.a r6, xb.d<java.lang.Object> r7) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.b.l(kb.a, xb.d):java.lang.Object");
    }

    public final void m(ya.b bVar) {
        t.e(bVar, "<set-?>");
        this.f17718d = bVar;
    }

    public final void n(za.c cVar) {
        t.e(cVar, "<set-?>");
        this.f17719q = cVar;
    }

    public String toString() {
        return "HttpClientCall[" + f().u0() + ", " + g().i() + ']';
    }
}
