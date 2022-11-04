package androidx.navigation;

import androidx.lifecycle.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
/* loaded from: classes.dex */
public class h extends androidx.lifecycle.t {

    /* renamed from: c */
    private static final u.a f1324c = new a();

    /* renamed from: b */
    private final HashMap<UUID, androidx.lifecycle.v> f1325b = new HashMap<>();

    /* loaded from: classes.dex */
    class a implements u.a {
        a() {
        }

        @Override // androidx.lifecycle.u.a
        public <T extends androidx.lifecycle.t> T a(Class<T> cls) {
            return new h();
        }
    }

    h() {
    }

    public static h f(androidx.lifecycle.v vVar) {
        return (h) new androidx.lifecycle.u(vVar, f1324c).a(h.class);
    }

    @Override // androidx.lifecycle.t
    public void d() {
        for (androidx.lifecycle.v vVar : this.f1325b.values()) {
            vVar.a();
        }
        this.f1325b.clear();
    }

    public void e(UUID uuid) {
        androidx.lifecycle.v remove = this.f1325b.remove(uuid);
        if (remove != null) {
            remove.a();
        }
    }

    public androidx.lifecycle.v g(UUID uuid) {
        androidx.lifecycle.v vVar = this.f1325b.get(uuid);
        if (vVar == null) {
            androidx.lifecycle.v vVar2 = new androidx.lifecycle.v();
            this.f1325b.put(uuid, vVar2);
            return vVar2;
        }
        return vVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f1325b.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
