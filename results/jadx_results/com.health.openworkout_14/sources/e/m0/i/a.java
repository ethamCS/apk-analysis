package e.m0.i;

import e.a0;
import e.b0;
import e.g0;
import e.h0;
import e.i0;
import e.q;
import e.r;
import e.y;
import f.l;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements a0 {

    /* renamed from: a */
    private final r f4150a;

    public a(r rVar) {
        this.f4150a = rVar;
    }

    private String b(List<q> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            q qVar = list.get(i);
            sb.append(qVar.c());
            sb.append('=');
            sb.append(qVar.k());
        }
        return sb.toString();
    }

    @Override // e.a0
    public i0 a(a0.a aVar) {
        g0 a2 = aVar.a();
        g0.a g2 = a2.g();
        h0 a3 = a2.a();
        if (a3 != null) {
            b0 b2 = a3.b();
            if (b2 != null) {
                g2.b("Content-Type", b2.toString());
            }
            long a4 = a3.a();
            if (a4 != -1) {
                g2.b("Content-Length", Long.toString(a4));
                g2.e("Transfer-Encoding");
            } else {
                g2.b("Transfer-Encoding", "chunked");
                g2.e("Content-Length");
            }
        }
        boolean z = false;
        if (a2.c("Host") == null) {
            g2.b("Host", e.m0.e.q(a2.i(), false));
        }
        if (a2.c("Connection") == null) {
            g2.b("Connection", "Keep-Alive");
        }
        if (a2.c("Accept-Encoding") == null && a2.c("Range") == null) {
            z = true;
            g2.b("Accept-Encoding", "gzip");
        }
        List<q> a5 = this.f4150a.a(a2.i());
        if (!a5.isEmpty()) {
            g2.b("Cookie", b(a5));
        }
        if (a2.c("User-Agent") == null) {
            g2.b("User-Agent", e.m0.f.a());
        }
        i0 c2 = aVar.c(g2.a());
        e.e(this.f4150a, a2.i(), c2.g0());
        i0.a j0 = c2.j0();
        j0.q(a2);
        if (z && "gzip".equalsIgnoreCase(c2.N("Content-Encoding")) && e.c(c2)) {
            f.j jVar = new f.j(c2.a().h0());
            y.a f2 = c2.g0().f();
            f2.f("Content-Encoding");
            f2.f("Content-Length");
            j0.j(f2.e());
            j0.b(new h(c2.N("Content-Type"), -1L, l.b(jVar)));
        }
        return j0.c();
    }
}
