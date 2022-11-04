package z1;

import c2.p;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c<T> implements y1.a<T> {

    /* renamed from: a */
    private final List<String> f26439a = new ArrayList();

    /* renamed from: b */
    private T f26440b;

    /* renamed from: c */
    private a2.d<T> f26441c;

    /* renamed from: d */
    private a f26442d;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    public c(a2.d<T> dVar) {
        this.f26441c = dVar;
    }

    private void h(a aVar, T t10) {
        if (this.f26439a.isEmpty() || aVar == null) {
            return;
        }
        if (t10 == null || c(t10)) {
            aVar.b(this.f26439a);
        } else {
            aVar.a(this.f26439a);
        }
    }

    @Override // y1.a
    public void a(T t10) {
        this.f26440b = t10;
        h(this.f26442d, t10);
    }

    abstract boolean b(p pVar);

    abstract boolean c(T t10);

    public boolean d(String str) {
        T t10 = this.f26440b;
        return t10 != null && c(t10) && this.f26439a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f26439a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f26439a.add(pVar.f6164a);
            }
        }
        if (this.f26439a.isEmpty()) {
            this.f26441c.c(this);
        } else {
            this.f26441c.a(this);
        }
        h(this.f26442d, this.f26440b);
    }

    public void f() {
        if (!this.f26439a.isEmpty()) {
            this.f26439a.clear();
            this.f26441c.c(this);
        }
    }

    public void g(a aVar) {
        if (this.f26442d != aVar) {
            this.f26442d = aVar;
            h(aVar, this.f26440b);
        }
    }
}
