package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.r;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class l extends androidx.lifecycle.q {
    private static final r.a h = new a();
    private final boolean e;

    /* renamed from: b */
    private final HashSet<Fragment> f925b = new HashSet<>();

    /* renamed from: c */
    private final HashMap<String, l> f926c = new HashMap<>();
    private final HashMap<String, androidx.lifecycle.s> d = new HashMap<>();
    private boolean f = false;
    private boolean g = false;

    /* loaded from: classes.dex */
    static class a implements r.a {
        a() {
        }

        @Override // androidx.lifecycle.r.a
        public <T extends androidx.lifecycle.q> T a(Class<T> cls) {
            return new l(true);
        }
    }

    public l(boolean z) {
        this.e = z;
    }

    public static l a(androidx.lifecycle.s sVar) {
        return (l) new androidx.lifecycle.r(sVar, h).a(l.class);
    }

    public boolean a(Fragment fragment) {
        return this.f925b.add(fragment);
    }

    @Override // androidx.lifecycle.q
    public void b() {
        if (j.I) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public void b(Fragment fragment) {
        if (j.I) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        l lVar = this.f926c.get(fragment.f);
        if (lVar != null) {
            lVar.b();
            this.f926c.remove(fragment.f);
        }
        androidx.lifecycle.s sVar = this.d.get(fragment.f);
        if (sVar != null) {
            sVar.a();
            this.d.remove(fragment.f);
        }
    }

    public l c(Fragment fragment) {
        l lVar = this.f926c.get(fragment.f);
        if (lVar == null) {
            l lVar2 = new l(this.e);
            this.f926c.put(fragment.f, lVar2);
            return lVar2;
        }
        return lVar;
    }

    public Collection<Fragment> c() {
        return this.f925b;
    }

    public androidx.lifecycle.s d(Fragment fragment) {
        androidx.lifecycle.s sVar = this.d.get(fragment.f);
        if (sVar == null) {
            androidx.lifecycle.s sVar2 = new androidx.lifecycle.s();
            this.d.put(fragment.f, sVar2);
            return sVar2;
        }
        return sVar;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e(Fragment fragment) {
        return this.f925b.remove(fragment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f925b.equals(lVar.f925b) && this.f926c.equals(lVar.f926c) && this.d.equals(lVar.d);
    }

    public boolean f(Fragment fragment) {
        if (!this.f925b.contains(fragment)) {
            return true;
        }
        return this.e ? this.f : !this.g;
    }

    public int hashCode() {
        return (((this.f925b.hashCode() * 31) + this.f926c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f925b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f926c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
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
