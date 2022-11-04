package y1;

import android.content.Context;
import c2.p;
import java.util.ArrayList;
import java.util.List;
import u1.k;
import z1.c;
import z1.e;
import z1.f;
import z1.g;
import z1.h;
/* loaded from: classes.dex */
public class d implements c.a {

    /* renamed from: d */
    private static final String f25757d = k.f("WorkConstraintsTracker");

    /* renamed from: a */
    private final c f25758a;

    /* renamed from: b */
    private final z1.c<?>[] f25759b;

    /* renamed from: c */
    private final Object f25760c = new Object();

    public d(Context context, e2.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f25758a = cVar;
        this.f25759b = new z1.c[]{new z1.a(applicationContext, aVar), new z1.b(applicationContext, aVar), new h(applicationContext, aVar), new z1.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    @Override // z1.c.a
    public void a(List<String> list) {
        synchronized (this.f25760c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    k.c().a(f25757d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f25758a;
            if (cVar != null) {
                cVar.d(arrayList);
            }
        }
    }

    @Override // z1.c.a
    public void b(List<String> list) {
        synchronized (this.f25760c) {
            c cVar = this.f25758a;
            if (cVar != null) {
                cVar.c(list);
            }
        }
    }

    public boolean c(String str) {
        z1.c<?>[] cVarArr;
        synchronized (this.f25760c) {
            for (z1.c<?> cVar : this.f25759b) {
                if (cVar.d(str)) {
                    k.c().a(f25757d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f25760c) {
            for (z1.c<?> cVar : this.f25759b) {
                cVar.g(null);
            }
            for (z1.c<?> cVar2 : this.f25759b) {
                cVar2.e(iterable);
            }
            for (z1.c<?> cVar3 : this.f25759b) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f25760c) {
            for (z1.c<?> cVar : this.f25759b) {
                cVar.f();
            }
        }
    }
}
