package ra;

import gc.l;
import hc.t;
import hc.v;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import qa.g;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lra/d;", "Lqa/g;", BuildConfig.FLAVOR, "connectTimeout", "I", "c", "()I", "setConnectTimeout", "(I)V", "socketTimeout", "e", "setSocketTimeout", "Lkotlin/Function1;", "Ljavax/net/ssl/HttpsURLConnection;", "Ltb/e0;", "sslManager", "Lgc/l;", "f", "()Lgc/l;", "setSslManager", "(Lgc/l;)V", "Ljava/net/HttpURLConnection;", "requestConfig", "d", "setRequestConfig", "<init>", "()V", "ktor-client-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: c */
    private int f20571c = 100000;

    /* renamed from: d */
    private int f20572d = 100000;

    /* renamed from: e */
    private l<? super HttpsURLConnection, e0> f20573e = b.f20576c;

    /* renamed from: f */
    private l<? super HttpURLConnection, e0> f20574f = a.f20575c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/net/HttpURLConnection;", "Ltb/e0;", "b", "(Ljava/net/HttpURLConnection;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements l<HttpURLConnection, e0> {

        /* renamed from: c */
        public static final a f20575c = new a();

        a() {
            super(1);
        }

        public final void b(HttpURLConnection httpURLConnection) {
            t.e(httpURLConnection, "$this$null");
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(HttpURLConnection httpURLConnection) {
            b(httpURLConnection);
            return e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljavax/net/ssl/HttpsURLConnection;", "it", "Ltb/e0;", "b", "(Ljavax/net/ssl/HttpsURLConnection;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements l<HttpsURLConnection, e0> {

        /* renamed from: c */
        public static final b f20576c = new b();

        b() {
            super(1);
        }

        public final void b(HttpsURLConnection httpsURLConnection) {
            t.e(httpsURLConnection, "it");
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(HttpsURLConnection httpsURLConnection) {
            b(httpsURLConnection);
            return e0.f22152a;
        }
    }

    public final int c() {
        return this.f20571c;
    }

    public final l<HttpURLConnection, e0> d() {
        return this.f20574f;
    }

    public final int e() {
        return this.f20572d;
    }

    public final l<HttpsURLConnection, e0> f() {
        return this.f20573e;
    }
}
