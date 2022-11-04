package o7;

import h6.t;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class g implements t {

    /* renamed from: a */
    private h6.o f17615a;

    /* renamed from: b */
    private List<h6.s> f17616b = new ArrayList();

    public g(h6.o oVar) {
        this.f17615a = oVar;
    }

    @Override // h6.t
    public void a(h6.s sVar) {
        this.f17616b.add(sVar);
    }

    protected h6.q b(h6.c cVar) {
        h6.q qVar;
        this.f17616b.clear();
        try {
            h6.o oVar = this.f17615a;
            qVar = oVar instanceof h6.k ? ((h6.k) oVar).d(cVar) : oVar.a(cVar);
        } catch (Exception unused) {
            qVar = null;
        } catch (Throwable th2) {
            this.f17615a.reset();
            throw th2;
        }
        this.f17615a.reset();
        return qVar;
    }

    public h6.q c(h6.j jVar) {
        return b(e(jVar));
    }

    public List<h6.s> d() {
        return new ArrayList(this.f17616b);
    }

    protected h6.c e(h6.j jVar) {
        return new h6.c(new o6.j(jVar));
    }
}
