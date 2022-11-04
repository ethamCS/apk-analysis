package v1;

import androidx.lifecycle.d0;
import u1.n;
/* loaded from: classes.dex */
public class c implements n {

    /* renamed from: c */
    private final d0<n.b> f23839c = new d0<>();

    /* renamed from: d */
    private final androidx.work.impl.utils.futures.c<n.b.c> f23840d = androidx.work.impl.utils.futures.c.t();

    public c() {
        a(n.f22566b);
    }

    public void a(n.b bVar) {
        this.f23839c.k(bVar);
        if (bVar instanceof n.b.c) {
            this.f23840d.p((n.b.c) bVar);
        } else if (!(bVar instanceof n.b.a)) {
        } else {
            this.f23840d.q(((n.b.a) bVar).a());
        }
    }
}
