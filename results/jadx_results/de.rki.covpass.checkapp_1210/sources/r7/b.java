package r7;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import q7.e;
import q7.f;
import s7.i;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lr7/b;", "Lq7/e;", "Ltb/e0;", "c", BuildConfig.FLAVOR, "d", "Lq7/f;", "a", "Ls7/i;", "ntpService", "Lq7/b;", "fallbackClock", "<init>", "(Ls7/i;Lq7/b;)V", "kronos-java"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a */
    private final i f20487a;

    /* renamed from: b */
    private final q7.b f20488b;

    public b(i iVar, q7.b bVar) {
        t.e(iVar, "ntpService");
        t.e(bVar, "fallbackClock");
        this.f20487a = iVar;
        this.f20488b = bVar;
    }

    @Override // q7.e
    public f a() {
        f a10 = this.f20487a.a();
        return a10 != null ? a10 : new f(this.f20488b.b(), null);
    }

    @Override // q7.e, q7.b
    public long b() {
        return e.a.a(this);
    }

    @Override // q7.e
    public void c() {
        this.f20487a.c();
    }

    @Override // q7.b
    public long d() {
        return this.f20488b.d();
    }
}
