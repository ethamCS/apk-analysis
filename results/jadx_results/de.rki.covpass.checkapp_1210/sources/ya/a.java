package ya;

import bb.l;
import bb.p0;
import bb.u;
import hc.t;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lya/a;", "Lya/b;", "Loa/b;", "call", "Loa/b;", "c", "()Loa/b;", "Lxb/g;", "h", "()Lxb/g;", "coroutineContext", "Lbb/u;", "method", "Lbb/u;", "R0", "()Lbb/u;", "Lbb/p0;", "url", "Lbb/p0;", "u0", "()Lbb/p0;", "Lbb/l;", "headers", "Lbb/l;", "a", "()Lbb/l;", "Lfb/b;", "attributes", "Lfb/b;", "c1", "()Lfb/b;", "Lya/d;", "data", "<init>", "(Loa/b;Lya/d;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class a implements b {
    private final fb.b U3;

    /* renamed from: c */
    private final oa.b f25974c;

    /* renamed from: d */
    private final u f25975d;

    /* renamed from: q */
    private final p0 f25976q;

    /* renamed from: x */
    private final db.a f25977x;

    /* renamed from: y */
    private final l f25978y;

    public a(oa.b bVar, d dVar) {
        t.e(bVar, "call");
        t.e(dVar, "data");
        this.f25974c = bVar;
        this.f25975d = dVar.f();
        this.f25976q = dVar.h();
        this.f25977x = dVar.b();
        this.f25978y = dVar.e();
        this.U3 = dVar.a();
    }

    @Override // ya.b
    public u R0() {
        return this.f25975d;
    }

    @Override // bb.r
    public l a() {
        return this.f25978y;
    }

    public oa.b c() {
        return this.f25974c;
    }

    @Override // ya.b
    public fb.b c1() {
        return this.U3;
    }

    @Override // ya.b, kotlinx.coroutines.q0
    public xb.g h() {
        return c().h();
    }

    @Override // ya.b
    public p0 u0() {
        return this.f25976q;
    }
}
