package e.m0.k;

import e.a0;
import e.d0;
import e.e0;
import e.g0;
import e.i0;
import e.y;
import f.s;
import f.t;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class g implements e.m0.i.c {

    /* renamed from: g */
    private static final List<String> f4281g = e.m0.e.s("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    private static final List<String> f4282h = e.m0.e.s("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final a0.a f4283a;

    /* renamed from: b */
    private final e.m0.h.f f4284b;

    /* renamed from: c */
    private final f f4285c;

    /* renamed from: d */
    private volatile i f4286d;

    /* renamed from: e */
    private final e0 f4287e;

    /* renamed from: f */
    private volatile boolean f4288f;

    public g(d0 d0Var, e.m0.h.f fVar, a0.a aVar, f fVar2) {
        this.f4284b = fVar;
        this.f4283a = aVar;
        this.f4285c = fVar2;
        List<e0> w = d0Var.w();
        e0 e0Var = e0.H2_PRIOR_KNOWLEDGE;
        this.f4287e = !w.contains(e0Var) ? e0.HTTP_2 : e0Var;
    }

    public static List<c> i(g0 g0Var) {
        y d2 = g0Var.d();
        ArrayList arrayList = new ArrayList(d2.h() + 4);
        arrayList.add(new c(c.f4202f, g0Var.f()));
        arrayList.add(new c(c.f4203g, e.m0.i.i.c(g0Var.i())));
        String c2 = g0Var.c("Host");
        if (c2 != null) {
            arrayList.add(new c(c.i, c2));
        }
        arrayList.add(new c(c.f4204h, g0Var.i().D()));
        int h2 = d2.h();
        for (int i = 0; i < h2; i++) {
            String lowerCase = d2.e(i).toLowerCase(Locale.US);
            if (!f4281g.contains(lowerCase) || (lowerCase.equals("te") && d2.i(i).equals("trailers"))) {
                arrayList.add(new c(lowerCase, d2.i(i)));
            }
        }
        return arrayList;
    }

    public static i0.a j(y yVar, e0 e0Var) {
        y.a aVar = new y.a();
        int h2 = yVar.h();
        e.m0.i.k kVar = null;
        for (int i = 0; i < h2; i++) {
            String e2 = yVar.e(i);
            String i2 = yVar.i(i);
            if (e2.equals(":status")) {
                kVar = e.m0.i.k.a("HTTP/1.1 " + i2);
            } else if (!f4282h.contains(e2)) {
                e.m0.c.f4060a.b(aVar, e2, i2);
            }
        }
        if (kVar != null) {
            i0.a aVar2 = new i0.a();
            aVar2.o(e0Var);
            aVar2.g(kVar.f4168b);
            aVar2.l(kVar.f4169c);
            aVar2.j(aVar.e());
            return aVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // e.m0.i.c
    public void a() {
        this.f4286d.h().close();
    }

    @Override // e.m0.i.c
    public void b(g0 g0Var) {
        if (this.f4286d != null) {
            return;
        }
        this.f4286d = this.f4285c.r0(i(g0Var), g0Var.a() != null);
        if (this.f4288f) {
            this.f4286d.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4286d.l().g(this.f4283a.e(), timeUnit);
        this.f4286d.r().g(this.f4283a.b(), timeUnit);
    }

    @Override // e.m0.i.c
    public void c() {
        this.f4285c.flush();
    }

    @Override // e.m0.i.c
    public void cancel() {
        this.f4288f = true;
        if (this.f4286d != null) {
            this.f4286d.f(b.CANCEL);
        }
    }

    @Override // e.m0.i.c
    public s d(g0 g0Var, long j) {
        return this.f4286d.h();
    }

    @Override // e.m0.i.c
    public long e(i0 i0Var) {
        return e.m0.i.e.b(i0Var);
    }

    @Override // e.m0.i.c
    public t f(i0 i0Var) {
        return this.f4286d.i();
    }

    @Override // e.m0.i.c
    public i0.a g(boolean z) {
        i0.a j = j(this.f4286d.p(), this.f4287e);
        if (!z || e.m0.c.f4060a.d(j) != 100) {
            return j;
        }
        return null;
    }

    @Override // e.m0.i.c
    public e.m0.h.f h() {
        return this.f4284b;
    }
}
