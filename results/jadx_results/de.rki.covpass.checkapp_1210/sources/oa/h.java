package oa;

import bb.l;
import bb.v;
import bb.w;
import hc.t;
import kotlin.Metadata;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.g2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Loa/h;", "Lza/c;", "Loa/f;", "call", "Loa/f;", "l", "()Loa/f;", "Lbb/w;", "status", "Lbb/w;", "i", "()Lbb/w;", "Lbb/v;", "version", "Lbb/v;", "j", "()Lbb/v;", "Lib/b;", "requestTime", "Lib/b;", "f", "()Lib/b;", "responseTime", "g", "Lbb/l;", "headers", "Lbb/l;", "a", "()Lbb/l;", "Lxb/g;", "coroutineContext", "Lxb/g;", "h", "()Lxb/g;", "Lio/ktor/utils/io/h;", "content", "Lio/ktor/utils/io/h;", "d", "()Lio/ktor/utils/io/h;", BuildConfig.FLAVOR, "body", "origin", "<init>", "(Loa/f;[BLza/c;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h extends za.c {
    private final ib.b U3;
    private final l V3;
    private final xb.g W3;
    private final io.ktor.utils.io.h X3;

    /* renamed from: c */
    private final f f17729c;

    /* renamed from: d */
    private final b0 f17730d;

    /* renamed from: q */
    private final w f17731q;

    /* renamed from: x */
    private final v f17732x;

    /* renamed from: y */
    private final ib.b f17733y;

    public h(f fVar, byte[] bArr, za.c cVar) {
        b0 b10;
        t.e(fVar, "call");
        t.e(bArr, "body");
        t.e(cVar, "origin");
        this.f17729c = fVar;
        b10 = g2.b(null, 1, null);
        this.f17730d = b10;
        this.f17731q = cVar.i();
        this.f17732x = cVar.j();
        this.f17733y = cVar.f();
        this.U3 = cVar.g();
        this.V3 = cVar.a();
        this.W3 = cVar.h().B(b10);
        this.X3 = io.ktor.utils.io.d.a(bArr);
    }

    @Override // bb.r
    public l a() {
        return this.V3;
    }

    @Override // za.c
    public io.ktor.utils.io.h d() {
        return this.X3;
    }

    @Override // za.c
    public ib.b f() {
        return this.f17733y;
    }

    @Override // za.c
    public ib.b g() {
        return this.U3;
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.W3;
    }

    @Override // za.c
    public w i() {
        return this.f17731q;
    }

    @Override // za.c
    public v j() {
        return this.f17732x;
    }

    /* renamed from: l */
    public f c() {
        return this.f17729c;
    }
}
