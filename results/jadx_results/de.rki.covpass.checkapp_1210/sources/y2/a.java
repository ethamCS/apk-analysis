package y2;

import fl.h;
import java.util.Arrays;
import rk.n;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    protected h<n> f25761a = new yk.a(al.a.b(0, 0, true, true, false));

    /* renamed from: b */
    n f25762b = new n(3, 3);

    public boolean a(n nVar, b4.b bVar) {
        if (!c(nVar)) {
            return false;
        }
        b(bVar, nVar);
        return true;
    }

    protected void b(b4.b bVar, n nVar) {
        if (da.a.a(bVar.f5453b, nVar, bVar.f5452a) < 0.0d) {
            tk.b.j(-1.0d, nVar);
        }
    }

    protected boolean c(n nVar) {
        if (!this.f25761a.d(nVar)) {
            return false;
        }
        Arrays.sort(this.f25761a.h(), 0, 3);
        tk.b.a(nVar, this.f25761a.h()[1]);
        return true;
    }
}
