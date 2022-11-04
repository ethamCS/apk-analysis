package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class z extends s0 {

    /* renamed from: k */
    private static final v0.b f4240k = new a();

    /* renamed from: g */
    private final boolean f4244g;

    /* renamed from: d */
    private final HashMap<String, Fragment> f4241d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, z> f4242e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, y0> f4243f = new HashMap<>();

    /* renamed from: h */
    private boolean f4245h = false;

    /* renamed from: i */
    private boolean f4246i = false;

    /* renamed from: j */
    private boolean f4247j = false;

    /* loaded from: classes.dex */
    class a implements v0.b {
        a() {
        }

        @Override // androidx.lifecycle.v0.b
        public <T extends s0> T a(Class<T> cls) {
            return new z(true);
        }

        @Override // androidx.lifecycle.v0.b
        public /* synthetic */ s0 b(Class cls, e1.a aVar) {
            return w0.b(this, cls, aVar);
        }
    }

    public z(boolean z10) {
        this.f4244g = z10;
    }

    private void i(String str) {
        z zVar = this.f4242e.get(str);
        if (zVar != null) {
            zVar.d();
            this.f4242e.remove(str);
        }
        y0 y0Var = this.f4243f.get(str);
        if (y0Var != null) {
            y0Var.a();
            this.f4243f.remove(str);
        }
    }

    public static z l(y0 y0Var) {
        return (z) new v0(y0Var, f4240k).a(z.class);
    }

    @Override // androidx.lifecycle.s0
    public void d() {
        if (w.L0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4245h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f4241d.equals(zVar.f4241d) && this.f4242e.equals(zVar.f4242e) && this.f4243f.equals(zVar.f4243f);
    }

    public void f(Fragment fragment) {
        if (this.f4247j) {
            if (!w.L0(2)) {
                return;
            }
            Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
        } else if (this.f4241d.containsKey(fragment.U3)) {
        } else {
            this.f4241d.put(fragment.U3, fragment);
            if (!w.L0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public void g(Fragment fragment) {
        if (w.L0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.U3);
    }

    public void h(String str) {
        if (w.L0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.f4241d.hashCode() * 31) + this.f4242e.hashCode()) * 31) + this.f4243f.hashCode();
    }

    public Fragment j(String str) {
        return this.f4241d.get(str);
    }

    public z k(Fragment fragment) {
        z zVar = this.f4242e.get(fragment.U3);
        if (zVar == null) {
            z zVar2 = new z(this.f4244g);
            this.f4242e.put(fragment.U3, zVar2);
            return zVar2;
        }
        return zVar;
    }

    public Collection<Fragment> m() {
        return new ArrayList(this.f4241d.values());
    }

    public y0 n(Fragment fragment) {
        y0 y0Var = this.f4243f.get(fragment.U3);
        if (y0Var == null) {
            y0 y0Var2 = new y0();
            this.f4243f.put(fragment.U3, y0Var2);
            return y0Var2;
        }
        return y0Var;
    }

    public boolean o() {
        return this.f4245h;
    }

    public void p(Fragment fragment) {
        if (this.f4247j) {
            if (!w.L0(2)) {
                return;
            }
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            return;
        }
        if (!(this.f4241d.remove(fragment.U3) != null) || !w.L0(2)) {
            return;
        }
        Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
    }

    public void q(boolean z10) {
        this.f4247j = z10;
    }

    public boolean r(Fragment fragment) {
        if (!this.f4241d.containsKey(fragment.U3)) {
            return true;
        }
        return this.f4244g ? this.f4245h : !this.f4246i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f4241d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f4242e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4243f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
