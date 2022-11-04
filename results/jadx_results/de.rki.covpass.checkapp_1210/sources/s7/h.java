package s7;

import hc.t;
import kotlin.Metadata;
import s7.f;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Ls7/h;", "Ls7/g;", "Ls7/f$b;", "get", "response", "Ltb/e0;", "a", "clear", "Lq7/h;", "syncResponseCache", "Lq7/b;", "deviceClock", "<init>", "(Lq7/h;Lq7/b;)V", "kronos-java"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a */
    private final q7.h f21509a;

    /* renamed from: b */
    private final q7.b f21510b;

    public h(q7.h hVar, q7.b bVar) {
        t.e(hVar, "syncResponseCache");
        t.e(bVar, "deviceClock");
        this.f21509a = hVar;
        this.f21510b = bVar;
    }

    @Override // s7.g
    public void a(f.b bVar) {
        t.e(bVar, "response");
        synchronized (this) {
            this.f21509a.b(bVar.b());
            this.f21509a.c(bVar.c());
            this.f21509a.d(bVar.d());
            e0 e0Var = e0.f22152a;
        }
    }

    @Override // s7.g
    public void clear() {
        synchronized (this) {
            this.f21509a.clear();
            e0 e0Var = e0.f22152a;
        }
    }

    @Override // s7.g
    public f.b get() {
        long a10 = this.f21509a.a();
        long e10 = this.f21509a.e();
        long f10 = this.f21509a.f();
        if (e10 == 0) {
            return null;
        }
        return new f.b(a10, e10, f10, this.f21510b);
    }
}
