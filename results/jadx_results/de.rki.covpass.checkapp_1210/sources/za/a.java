package za;

import bb.l;
import bb.v;
import bb.w;
import hc.t;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lza/a;", "Lza/c;", "Loa/b;", "call", "Loa/b;", "c", "()Loa/b;", "Lxb/g;", "coroutineContext", "Lxb/g;", "h", "()Lxb/g;", "Lbb/w;", "status", "Lbb/w;", "i", "()Lbb/w;", "Lbb/v;", "version", "Lbb/v;", "j", "()Lbb/v;", "Lib/b;", "requestTime", "Lib/b;", "f", "()Lib/b;", "responseTime", "g", "Lio/ktor/utils/io/h;", "content", "Lio/ktor/utils/io/h;", "d", "()Lio/ktor/utils/io/h;", "Lbb/l;", "headers", "Lbb/l;", "a", "()Lbb/l;", "Lya/g;", "responseData", "<init>", "(Loa/b;Lya/g;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a extends c {
    private final ib.b U3;
    private final io.ktor.utils.io.h V3;
    private final l W3;

    /* renamed from: c */
    private final oa.b f26560c;

    /* renamed from: d */
    private final xb.g f26561d;

    /* renamed from: q */
    private final w f26562q;

    /* renamed from: x */
    private final v f26563x;

    /* renamed from: y */
    private final ib.b f26564y;

    public a(oa.b bVar, ya.g gVar) {
        t.e(bVar, "call");
        t.e(gVar, "responseData");
        this.f26560c = bVar;
        this.f26561d = gVar.b();
        this.f26562q = gVar.f();
        this.f26563x = gVar.g();
        this.f26564y = gVar.d();
        this.U3 = gVar.e();
        Object a10 = gVar.a();
        io.ktor.utils.io.h hVar = a10 instanceof io.ktor.utils.io.h ? (io.ktor.utils.io.h) a10 : null;
        this.V3 = hVar == null ? io.ktor.utils.io.h.Companion.a() : hVar;
        this.W3 = gVar.c();
    }

    @Override // bb.r
    public l a() {
        return this.W3;
    }

    @Override // za.c
    public oa.b c() {
        return this.f26560c;
    }

    @Override // za.c
    public io.ktor.utils.io.h d() {
        return this.V3;
    }

    @Override // za.c
    public ib.b f() {
        return this.f26564y;
    }

    @Override // za.c
    public ib.b g() {
        return this.U3;
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.f26561d;
    }

    @Override // za.c
    public w i() {
        return this.f26562q;
    }

    @Override // za.c
    public v j() {
        return this.f26563x;
    }
}
