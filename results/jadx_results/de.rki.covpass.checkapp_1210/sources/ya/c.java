package ya;

import bb.f0;
import bb.l;
import bb.m;
import bb.n0;
import bb.p0;
import bb.s;
import bb.u;
import bf.x;
import fb.z;
import gc.p;
import hc.t;
import hc.v;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.y2;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b8\u00109J \u0010\u0006\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000J-\u0010\u0011\u001a\u00020\u0004\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010%\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lya/c;", "Lbb/s;", "Lkotlin/Function2;", "Lbb/f0;", "Ltb/e0;", "block", "n", "Lya/d;", "b", "builder", "m", "l", BuildConfig.FLAVOR, "T", "Lqa/e;", "key", "capability", "i", "(Lqa/e;Ljava/lang/Object;)V", "e", "(Lqa/e;)Ljava/lang/Object;", "url", "Lbb/f0;", "g", "()Lbb/f0;", "Lbb/u;", "method", "Lbb/u;", "getMethod", "()Lbb/u;", "k", "(Lbb/u;)V", "Lbb/m;", "headers", "Lbb/m;", "a", "()Lbb/m;", "body", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "h", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/a2;", "value", "executionContext", "Lkotlinx/coroutines/a2;", "f", "()Lkotlinx/coroutines/a2;", "j", "(Lkotlinx/coroutines/a2;)V", "Lfb/b;", "attributes", "Lfb/b;", "c", "()Lfb/b;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c implements s {
    public static final a Companion = new a(null);

    /* renamed from: e */
    private a2 f25983e;

    /* renamed from: a */
    private final f0 f25979a = new f0(null, null, 0, null, null, null, null, null, false, 511, null);

    /* renamed from: b */
    private u f25980b = u.Companion.a();

    /* renamed from: c */
    private final m f25981c = new m(0, 1, null);

    /* renamed from: d */
    private Object f25982d = ab.d.f240a;

    /* renamed from: f */
    private final fb.b f25984f = fb.d.a(true);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lya/c$a;", BuildConfig.FLAVOR, "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lqa/e;", "b", "()Ljava/util/Map;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<Map<qa.e<?>, Object>> {

        /* renamed from: c */
        public static final b f25985c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final Map<qa.e<?>, Object> invoke() {
            return ab.g.b();
        }
    }

    public c() {
        b0 b10 = y2.b(null, 1, null);
        io.ktor.utils.io.s.a(b10);
        this.f25983e = b10;
    }

    @Override // bb.s
    public m a() {
        return this.f25981c;
    }

    public final d b() {
        p0 b10 = this.f25979a.b();
        u uVar = this.f25980b;
        l q10 = a().q();
        Object obj = this.f25982d;
        db.a aVar = obj instanceof db.a ? (db.a) obj : null;
        if (aVar != null) {
            return new d(b10, uVar, q10, aVar, this.f25983e, this.f25984f);
        }
        throw new IllegalStateException(t.l("No request transformation found: ", this.f25982d).toString());
    }

    public final fb.b c() {
        return this.f25984f;
    }

    public final Object d() {
        return this.f25982d;
    }

    public final <T> T e(qa.e<T> eVar) {
        t.e(eVar, "key");
        Map map = (Map) this.f25984f.e(qa.f.a());
        if (map == null) {
            return null;
        }
        return (T) map.get(eVar);
    }

    public final a2 f() {
        return this.f25983e;
    }

    public final f0 g() {
        return this.f25979a;
    }

    public final void h(Object obj) {
        t.e(obj, "<set-?>");
        this.f25982d = obj;
    }

    public final <T> void i(qa.e<T> eVar, T t10) {
        t.e(eVar, "key");
        t.e(t10, "capability");
        ((Map) this.f25984f.d(qa.f.a(), b.f25985c)).put(eVar, t10);
    }

    public final void j(a2 a2Var) {
        t.e(a2Var, "value");
        io.ktor.utils.io.s.a(a2Var);
        this.f25983e = a2Var;
    }

    public final void k(u uVar) {
        t.e(uVar, "<set-?>");
        this.f25980b = uVar;
    }

    public final c l(c cVar) {
        boolean x10;
        t.e(cVar, "builder");
        this.f25980b = cVar.f25980b;
        this.f25982d = cVar.f25982d;
        n0.e(this.f25979a, cVar.f25979a);
        f0 f0Var = this.f25979a;
        x10 = x.x(f0Var.d());
        f0Var.m(x10 ? "/" : this.f25979a.d());
        z.c(a(), cVar.a());
        fb.e.a(this.f25984f, cVar.f25984f);
        return this;
    }

    public final c m(c cVar) {
        t.e(cVar, "builder");
        j(cVar.f25983e);
        return l(cVar);
    }

    public final void n(p<? super f0, ? super f0, e0> pVar) {
        t.e(pVar, "block");
        f0 f0Var = this.f25979a;
        pVar.u(f0Var, f0Var);
    }
}
