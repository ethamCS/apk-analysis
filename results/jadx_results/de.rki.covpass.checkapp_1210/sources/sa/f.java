package sa;

import cb.a;
import cb.b;
import df.e0;
import df.l;
import df.n;
import gc.p;
import hc.t;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.y;
import of.b0;
import of.f0;
import of.g0;
import of.x;
import of.z;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b0\u00101J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\"\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0006\u0010\u0017\u001a\u00020\u0007R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'¨\u00062"}, d2 = {"Lsa/f;", BuildConfig.FLAVOR, "Lof/g0;", "Lof/f0;", "webSocket", "Lof/b0;", "response", "Ltb/e0;", "i", "Leg/f;", "bytes", "f", BuildConfig.FLAVOR, "text", "g", BuildConfig.FLAVOR, "code", "reason", "a", "c", BuildConfig.FLAVOR, "t", "d", "o", "Lxb/g;", "coroutineContext", "Lxb/g;", "h", "()Lxb/g;", "Lkotlinx/coroutines/y;", "originResponse", "Lkotlinx/coroutines/y;", "m", "()Lkotlinx/coroutines/y;", "Ldf/e0;", "Lcb/b;", "outgoing", "Ldf/e0;", "n", "()Ldf/e0;", "getOutgoing$annotations", "()V", "Lof/x;", "engine", "Lof/f0$a;", "webSocketFactory", "Lof/z;", "engineRequest", "<init>", "(Lof/x;Lof/f0$a;Lof/z;Lxb/g;)V", "ktor-client-okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f extends g0 implements q0 {
    private final e0<cb.b> W3;

    /* renamed from: c */
    private final x f21597c;

    /* renamed from: d */
    private final f0.a f21598d;

    /* renamed from: q */
    private final xb.g f21599q;

    /* renamed from: x */
    private final y<f> f21600x = a0.b(null, 1, null);

    /* renamed from: y */
    private final y<b0> f21601y = a0.b(null, 1, null);
    private final df.i<cb.b> U3 = l.b(0, null, null, 7, null);
    private final y<cb.a> V3 = a0.b(null, 1, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Ldf/f;", "Lcb/b;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1", f = "OkHttpWebsocketSession.kt", l = {62, 66}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements p<df.f<cb.b>, xb.d<? super tb.e0>, Object> {
        Object U3;
        int V3;
        private /* synthetic */ Object W3;
        final /* synthetic */ z Y3;

        /* renamed from: y */
        Object f21602y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z zVar, xb.d<? super a> dVar) {
            super(2, dVar);
            f.this = r1;
            this.Y3 = zVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0089 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[Catch: all -> 0x0113, TryCatch #1 {all -> 0x0113, blocks: (B:24:0x0091, B:26:0x0099, B:28:0x00a3, B:29:0x00b7, B:31:0x00bb, B:33:0x00cf, B:35:0x00d3, B:46:0x00fa, B:47:0x00ff), top: B:66:0x0091 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008a -> B:66:0x0091). Please submit an issue!!! */
        @Override // zb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object B(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sa.f.a.B(java.lang.Object):java.lang.Object");
        }

        /* renamed from: d0 */
        public final Object u(df.f<cb.b> fVar, xb.d<? super tb.e0> dVar) {
            return ((a) j(fVar, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.Y3, dVar);
            aVar.W3 = obj;
            return aVar;
        }
    }

    public f(x xVar, f0.a aVar, z zVar, xb.g gVar) {
        t.e(xVar, "engine");
        t.e(aVar, "webSocketFactory");
        t.e(zVar, "engineRequest");
        t.e(gVar, "coroutineContext");
        this.f21597c = xVar;
        this.f21598d = aVar;
        this.f21599q = gVar;
        this.W3 = df.e.b(this, null, 0, null, null, new a(zVar, null), 15, null);
    }

    @Override // of.g0
    public void a(f0 f0Var, int i10, String str) {
        String str2;
        t.e(f0Var, "webSocket");
        t.e(str, "reason");
        super.a(f0Var, i10, str);
        short s10 = (short) i10;
        this.V3.h0(new cb.a(s10, str));
        e0.a.a(this.U3, null, 1, null);
        e0<cb.b> n10 = n();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WebSocket session closed with code ");
        a.EnumC0086a a10 = a.EnumC0086a.Companion.a(s10);
        sb2.append((a10 == null || (str2 = a10.toString()) == null) ? Integer.valueOf(i10) : str2);
        sb2.append('.');
        n10.a(new CancellationException(sb2.toString()));
    }

    @Override // of.g0
    public void c(f0 f0Var, int i10, String str) {
        t.e(f0Var, "webSocket");
        t.e(str, "reason");
        super.c(f0Var, i10, str);
        short s10 = (short) i10;
        this.V3.h0(new cb.a(s10, str));
        try {
            n.b(n(), new b.C0088b(new cb.a(s10, str)));
        } catch (Throwable unused) {
        }
        e0.a.a(this.U3, null, 1, null);
    }

    @Override // of.g0
    public void d(f0 f0Var, Throwable th2, b0 b0Var) {
        t.e(f0Var, "webSocket");
        t.e(th2, "t");
        super.d(f0Var, th2, b0Var);
        this.V3.n(th2);
        this.f21601y.n(th2);
        this.U3.a(th2);
        n().a(th2);
    }

    @Override // of.g0
    public void f(f0 f0Var, eg.f fVar) {
        t.e(f0Var, "webSocket");
        t.e(fVar, "bytes");
        super.f(f0Var, fVar);
        n.b(this.U3, new b.a(true, fVar.d0()));
    }

    @Override // of.g0
    public void g(f0 f0Var, String str) {
        t.e(f0Var, "webSocket");
        t.e(str, "text");
        super.g(f0Var, str);
        df.i<cb.b> iVar = this.U3;
        byte[] bytes = str.getBytes(bf.d.f5986b);
        t.d(bytes, "this as java.lang.String).getBytes(charset)");
        n.b(iVar, new b.d(true, bytes));
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.f21599q;
    }

    @Override // of.g0
    public void i(f0 f0Var, b0 b0Var) {
        t.e(f0Var, "webSocket");
        t.e(b0Var, "response");
        super.i(f0Var, b0Var);
        this.f21601y.h0(b0Var);
    }

    public final y<b0> m() {
        return this.f21601y;
    }

    public e0<cb.b> n() {
        return this.W3;
    }

    public final void o() {
        this.f21600x.h0(this);
    }
}
