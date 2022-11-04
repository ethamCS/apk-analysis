package bl;

import fl.h;
import rk.n;
import tk.b;
import tk.g;
/* loaded from: classes3.dex */
public class a implements el.a<n> {

    /* renamed from: a */
    boolean f6119a = true;

    /* renamed from: b */
    h<n> f6120b = al.a.b(1, 1, false, true, true);

    /* renamed from: c */
    n f6121c;

    /* renamed from: b */
    public boolean a(n nVar, int i10, n nVar2) {
        if (nVar.f21298q > nVar.f21297d) {
            if (this.f6119a) {
                this.f6120b = al.a.b(1, 1, false, true, false);
                this.f6119a = false;
            }
        } else if (!this.f6119a) {
            this.f6120b = al.a.b(1, 1, false, true, true);
            this.f6119a = true;
        }
        if (!this.f6120b.d(nVar)) {
            return false;
        }
        double[] h10 = this.f6120b.h();
        this.f6121c = this.f6120b.i(this.f6121c, false);
        g.a(null, false, h10, this.f6120b.f(), this.f6121c, false);
        nVar2.U(this.f6121c.f21297d, i10);
        n nVar3 = this.f6121c;
        int i11 = nVar3.f21297d;
        int i12 = nVar3.f21298q;
        b.d(nVar3, 0, i11, i12 - i10, i12, nVar2, 0, 0);
        return true;
    }
}
