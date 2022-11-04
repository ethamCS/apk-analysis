package ya;

import bb.l;
import bb.v;
import bb.w;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\r¨\u0006%"}, d2 = {"Lya/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", "Lbb/w;", "statusCode", "Lbb/w;", "f", "()Lbb/w;", "Lib/b;", "requestTime", "Lib/b;", "d", "()Lib/b;", "Lbb/l;", "headers", "Lbb/l;", "c", "()Lbb/l;", "Lbb/v;", "version", "Lbb/v;", "g", "()Lbb/v;", "body", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Lxb/g;", "callContext", "Lxb/g;", "b", "()Lxb/g;", "responseTime", "e", "<init>", "(Lbb/w;Lib/b;Lbb/l;Lbb/v;Ljava/lang/Object;Lxb/g;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final w f26001a;

    /* renamed from: b */
    private final ib.b f26002b;

    /* renamed from: c */
    private final l f26003c;

    /* renamed from: d */
    private final v f26004d;

    /* renamed from: e */
    private final Object f26005e;

    /* renamed from: f */
    private final xb.g f26006f;

    /* renamed from: g */
    private final ib.b f26007g = ib.a.b(null, 1, null);

    public g(w wVar, ib.b bVar, l lVar, v vVar, Object obj, xb.g gVar) {
        t.e(wVar, "statusCode");
        t.e(bVar, "requestTime");
        t.e(lVar, "headers");
        t.e(vVar, "version");
        t.e(obj, "body");
        t.e(gVar, "callContext");
        this.f26001a = wVar;
        this.f26002b = bVar;
        this.f26003c = lVar;
        this.f26004d = vVar;
        this.f26005e = obj;
        this.f26006f = gVar;
    }

    public final Object a() {
        return this.f26005e;
    }

    public final xb.g b() {
        return this.f26006f;
    }

    public final l c() {
        return this.f26003c;
    }

    public final ib.b d() {
        return this.f26002b;
    }

    public final ib.b e() {
        return this.f26007g;
    }

    public final w f() {
        return this.f26001a;
    }

    public final v g() {
        return this.f26004d;
    }

    public String toString() {
        return "HttpResponseData=(statusCode=" + this.f26001a + ')';
    }
}
