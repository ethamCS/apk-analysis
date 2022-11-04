package ya;

import bb.l;
import bb.p0;
import bb.u;
import hc.t;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b,\u0010-J#\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lya/d;", BuildConfig.FLAVOR, "T", "Lqa/e;", "key", "c", "(Lqa/e;)Ljava/lang/Object;", BuildConfig.FLAVOR, "toString", "Lbb/p0;", "url", "Lbb/p0;", "h", "()Lbb/p0;", "Lbb/u;", "method", "Lbb/u;", "f", "()Lbb/u;", "Lbb/l;", "headers", "Lbb/l;", "e", "()Lbb/l;", "Ldb/a;", "body", "Ldb/a;", "b", "()Ldb/a;", "Lkotlinx/coroutines/a2;", "executionContext", "Lkotlinx/coroutines/a2;", "d", "()Lkotlinx/coroutines/a2;", "Lfb/b;", "attributes", "Lfb/b;", "a", "()Lfb/b;", BuildConfig.FLAVOR, "requiredCapabilities", "Ljava/util/Set;", "g", "()Ljava/util/Set;", "<init>", "(Lbb/p0;Lbb/u;Lbb/l;Ldb/a;Lkotlinx/coroutines/a2;Lfb/b;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final p0 f25986a;

    /* renamed from: b */
    private final u f25987b;

    /* renamed from: c */
    private final l f25988c;

    /* renamed from: d */
    private final db.a f25989d;

    /* renamed from: e */
    private final a2 f25990e;

    /* renamed from: f */
    private final fb.b f25991f;

    /* renamed from: g */
    private final Set<qa.e<?>> f25992g;

    public d(p0 p0Var, u uVar, l lVar, db.a aVar, a2 a2Var, fb.b bVar) {
        t.e(p0Var, "url");
        t.e(uVar, "method");
        t.e(lVar, "headers");
        t.e(aVar, "body");
        t.e(a2Var, "executionContext");
        t.e(bVar, "attributes");
        this.f25986a = p0Var;
        this.f25987b = uVar;
        this.f25988c = lVar;
        this.f25989d = aVar;
        this.f25990e = a2Var;
        this.f25991f = bVar;
        Map map = (Map) bVar.e(qa.f.a());
        Set<qa.e<?>> keySet = map == null ? null : map.keySet();
        this.f25992g = keySet == null ? y0.b() : keySet;
    }

    public final fb.b a() {
        return this.f25991f;
    }

    public final db.a b() {
        return this.f25989d;
    }

    public final <T> T c(qa.e<T> eVar) {
        t.e(eVar, "key");
        Map map = (Map) this.f25991f.e(qa.f.a());
        if (map == null) {
            return null;
        }
        return (T) map.get(eVar);
    }

    public final a2 d() {
        return this.f25990e;
    }

    public final l e() {
        return this.f25988c;
    }

    public final u f() {
        return this.f25987b;
    }

    public final Set<qa.e<?>> g() {
        return this.f25992g;
    }

    public final p0 h() {
        return this.f25986a;
    }

    public String toString() {
        return "HttpRequestData(url=" + this.f25986a + ", method=" + this.f25987b + ')';
    }
}
