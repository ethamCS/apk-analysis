package a.e.a.j;

import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a */
    HashSet<o> f148a = new HashSet<>(2);

    /* renamed from: b */
    int f149b = 0;

    public void a() {
        this.f149b = 1;
        Iterator<o> it = this.f148a.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public void a(o oVar) {
        this.f148a.add(oVar);
    }

    public void b() {
        this.f149b = 0;
        Iterator<o> it = this.f148a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public boolean c() {
        return this.f149b == 1;
    }

    public void d() {
        this.f149b = 0;
        this.f148a.clear();
    }

    public void e() {
    }
}
