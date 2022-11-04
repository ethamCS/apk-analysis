package sa;

import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
import of.f0;
import of.x;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!R.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lsa/c;", "Lqa/g;", "Lkotlin/Function1;", "Lof/x$a;", "Ltb/e0;", "config", "Lgc/l;", "d", "()Lgc/l;", "setConfig$ktor_client_okhttp", "(Lgc/l;)V", "Lof/x;", "preconfigured", "Lof/x;", "e", "()Lof/x;", "g", "(Lof/x;)V", BuildConfig.FLAVOR, "clientCacheSize", "I", "c", "()I", "setClientCacheSize", "(I)V", "Lof/f0$a;", "webSocketFactory", "Lof/f0$a;", "f", "()Lof/f0$a;", "setWebSocketFactory", "(Lof/f0$a;)V", "<init>", "()V", "ktor-client-okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c extends qa.g {

    /* renamed from: d */
    private x f21568d;

    /* renamed from: f */
    private f0.a f21570f;

    /* renamed from: c */
    private l<? super x.a, e0> f21567c = a.f21571c;

    /* renamed from: e */
    private int f21569e = 10;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lof/x$a;", "Ltb/e0;", "b", "(Lof/x$a;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements l<x.a, e0> {

        /* renamed from: c */
        public static final a f21571c = new a();

        a() {
            super(1);
        }

        public final void b(x.a aVar) {
            t.e(aVar, "$this$null");
            aVar.i(false);
            aVar.j(false);
            aVar.R(true);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(x.a aVar) {
            b(aVar);
            return e0.f22152a;
        }
    }

    public final int c() {
        return this.f21569e;
    }

    public final l<x.a, e0> d() {
        return this.f21567c;
    }

    public final x e() {
        return this.f21568d;
    }

    public final f0.a f() {
        return this.f21570f;
    }

    public final void g(x xVar) {
        this.f21568d = xVar;
    }
}
