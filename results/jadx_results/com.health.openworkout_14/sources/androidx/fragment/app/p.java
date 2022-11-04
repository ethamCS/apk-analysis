package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.u;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class p extends androidx.lifecycle.t {

    /* renamed from: h */
    private static final u.a f1101h = new a();

    /* renamed from: e */
    private final boolean f1105e;

    /* renamed from: b */
    private final HashMap<String, Fragment> f1102b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, p> f1103c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, androidx.lifecycle.v> f1104d = new HashMap<>();

    /* renamed from: f */
    private boolean f1106f = false;

    /* renamed from: g */
    private boolean f1107g = false;

    /* loaded from: classes.dex */
    static class a implements u.a {
        a() {
        }

        @Override // androidx.lifecycle.u.a
        public <T extends androidx.lifecycle.t> T a(Class<T> cls) {
            return new p(true);
        }
    }

    public p(boolean z) {
        this.f1105e = z;
    }

    public static p i(androidx.lifecycle.v vVar) {
        return (p) new androidx.lifecycle.u(vVar, f1101h).a(p.class);
    }

    @Override // androidx.lifecycle.t
    public void d() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1106f = true;
    }

    public boolean e(Fragment fragment) {
        if (this.f1102b.containsKey(fragment.f1016f)) {
            return false;
        }
        this.f1102b.put(fragment.f1016f, fragment);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f1102b.equals(pVar.f1102b) && this.f1103c.equals(pVar.f1103c) && this.f1104d.equals(pVar.f1104d);
    }

    public void f(Fragment fragment) {
        if (m.p0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        p pVar = this.f1103c.get(fragment.f1016f);
        if (pVar != null) {
            pVar.d();
            this.f1103c.remove(fragment.f1016f);
        }
        androidx.lifecycle.v vVar = this.f1104d.get(fragment.f1016f);
        if (vVar != null) {
            vVar.a();
            this.f1104d.remove(fragment.f1016f);
        }
    }

    public Fragment g(String str) {
        return this.f1102b.get(str);
    }

    public p h(Fragment fragment) {
        p pVar = this.f1103c.get(fragment.f1016f);
        if (pVar == null) {
            p pVar2 = new p(this.f1105e);
            this.f1103c.put(fragment.f1016f, pVar2);
            return pVar2;
        }
        return pVar;
    }

    public int hashCode() {
        return (((this.f1102b.hashCode() * 31) + this.f1103c.hashCode()) * 31) + this.f1104d.hashCode();
    }

    public Collection<Fragment> j() {
        return this.f1102b.values();
    }

    public androidx.lifecycle.v k(Fragment fragment) {
        androidx.lifecycle.v vVar = this.f1104d.get(fragment.f1016f);
        if (vVar == null) {
            androidx.lifecycle.v vVar2 = new androidx.lifecycle.v();
            this.f1104d.put(fragment.f1016f, vVar2);
            return vVar2;
        }
        return vVar;
    }

    public boolean l() {
        return this.f1106f;
    }

    public boolean m(Fragment fragment) {
        return this.f1102b.remove(fragment.f1016f) != null;
    }

    public boolean n(Fragment fragment) {
        if (!this.f1102b.containsKey(fragment.f1016f)) {
            return true;
        }
        return this.f1105e ? this.f1106f : !this.f1107g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1102b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1103c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1104d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
