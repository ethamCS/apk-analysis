package wa;

import bb.l;
import bb.v;
import bb.w;
import hc.t;
import io.ktor.utils.io.h;
import kotlin.Metadata;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lwa/d;", "Lza/c;", "Loa/b;", "call", "Loa/b;", "c", "()Loa/b;", "Lio/ktor/utils/io/h;", "content", "Lio/ktor/utils/io/h;", "d", "()Lio/ktor/utils/io/h;", "Lxb/g;", "coroutineContext", "Lxb/g;", "h", "()Lxb/g;", "Lbb/w;", "i", "()Lbb/w;", "status", "Lbb/v;", "j", "()Lbb/v;", "version", "Lib/b;", "f", "()Lib/b;", "requestTime", "g", "responseTime", "Lbb/l;", "a", "()Lbb/l;", "headers", "origin", "<init>", "(Loa/b;Lio/ktor/utils/io/h;Lza/c;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d extends za.c {

    /* renamed from: c */
    private final oa.b f24699c;

    /* renamed from: d */
    private final h f24700d;

    /* renamed from: q */
    private final za.c f24701q;

    /* renamed from: x */
    private final g f24702x;

    public d(oa.b bVar, h hVar, za.c cVar) {
        t.e(bVar, "call");
        t.e(hVar, "content");
        t.e(cVar, "origin");
        this.f24699c = bVar;
        this.f24700d = hVar;
        this.f24701q = cVar;
        this.f24702x = cVar.h();
    }

    @Override // bb.r
    public l a() {
        return this.f24701q.a();
    }

    @Override // za.c
    public oa.b c() {
        return this.f24699c;
    }

    @Override // za.c
    public h d() {
        return this.f24700d;
    }

    @Override // za.c
    public ib.b f() {
        return this.f24701q.f();
    }

    @Override // za.c
    public ib.b g() {
        return this.f24701q.g();
    }

    @Override // kotlinx.coroutines.q0
    public g h() {
        return this.f24702x;
    }

    @Override // za.c
    public w i() {
        return this.f24701q.i();
    }

    @Override // za.c
    public v j() {
        return this.f24701q.j();
    }
}
