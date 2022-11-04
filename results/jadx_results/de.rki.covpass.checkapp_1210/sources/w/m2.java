package w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import w.c2;
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a */
    private final String f24527a;

    /* renamed from: b */
    private final Map<String, b> f24528b = new LinkedHashMap();

    /* loaded from: classes.dex */
    public interface a {
        boolean a(b bVar);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final c2 f24529a;

        /* renamed from: b */
        private boolean f24530b = false;

        /* renamed from: c */
        private boolean f24531c = false;

        b(c2 c2Var) {
            this.f24529a = c2Var;
        }

        boolean a() {
            return this.f24531c;
        }

        public boolean b() {
            return this.f24530b;
        }

        c2 c() {
            return this.f24529a;
        }

        void d(boolean z10) {
            this.f24531c = z10;
        }

        void e(boolean z10) {
            this.f24530b = z10;
        }
    }

    public m2(String str) {
        this.f24527a = str;
    }

    private b g(String str, c2 c2Var) {
        b bVar = this.f24528b.get(str);
        if (bVar == null) {
            b bVar2 = new b(c2Var);
            this.f24528b.put(str, bVar2);
            return bVar2;
        }
        return bVar;
    }

    private Collection<c2> h(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f24528b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().c());
            }
        }
        return arrayList;
    }

    public static /* synthetic */ boolean j(b bVar) {
        return bVar.a() && bVar.b();
    }

    public c2.f c() {
        c2.f fVar = new c2.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f24528b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                fVar.a(value.c());
                arrayList.add(entry.getKey());
            }
        }
        androidx.camera.core.s1.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f24527a);
        return fVar;
    }

    public Collection<c2> d() {
        return Collections.unmodifiableCollection(h(l2.f24518a));
    }

    public c2.f e() {
        c2.f fVar = new c2.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f24528b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                fVar.a(value.c());
                arrayList.add(entry.getKey());
            }
        }
        androidx.camera.core.s1.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f24527a);
        return fVar;
    }

    public Collection<c2> f() {
        return Collections.unmodifiableCollection(h(k2.f24509a));
    }

    public boolean i(String str) {
        if (!this.f24528b.containsKey(str)) {
            return false;
        }
        return this.f24528b.get(str).b();
    }

    public void l(String str) {
        this.f24528b.remove(str);
    }

    public void m(String str, c2 c2Var) {
        g(str, c2Var).d(true);
    }

    public void n(String str, c2 c2Var) {
        g(str, c2Var).e(true);
    }

    public void o(String str) {
        if (!this.f24528b.containsKey(str)) {
            return;
        }
        b bVar = this.f24528b.get(str);
        bVar.e(false);
        if (bVar.a()) {
            return;
        }
        this.f24528b.remove(str);
    }

    public void p(String str) {
        if (!this.f24528b.containsKey(str)) {
            return;
        }
        b bVar = this.f24528b.get(str);
        bVar.d(false);
        if (bVar.b()) {
            return;
        }
        this.f24528b.remove(str);
    }

    public void q(String str, c2 c2Var) {
        if (!this.f24528b.containsKey(str)) {
            return;
        }
        b bVar = new b(c2Var);
        b bVar2 = this.f24528b.get(str);
        bVar.e(bVar2.b());
        bVar.d(bVar2.a());
        this.f24528b.put(str, bVar);
    }
}
