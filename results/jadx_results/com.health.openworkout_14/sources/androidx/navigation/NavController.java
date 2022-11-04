package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.e;
import androidx.navigation.l;
import androidx.navigation.r;
import androidx.navigation.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class NavController {

    /* renamed from: a */
    private final Context f1271a;

    /* renamed from: b */
    private Activity f1272b;

    /* renamed from: c */
    private q f1273c;

    /* renamed from: d */
    n f1274d;

    /* renamed from: e */
    private Bundle f1275e;

    /* renamed from: f */
    private Parcelable[] f1276f;

    /* renamed from: g */
    private boolean f1277g;
    private androidx.lifecycle.i i;
    private h j;

    /* renamed from: h */
    final Deque<f> f1278h = new ArrayDeque();
    private v k = new v();
    private final CopyOnWriteArrayList<b> l = new CopyOnWriteArrayList<>();
    private final androidx.lifecycle.h m = new androidx.lifecycle.g() { // from class: androidx.navigation.NavController.1
        @Override // androidx.lifecycle.g
        public void d(androidx.lifecycle.i iVar, e.a aVar) {
            NavController navController = NavController.this;
            if (navController.f1274d != null) {
                for (f fVar : navController.f1278h) {
                    fVar.i(aVar);
                }
            }
        }
    };
    private final androidx.activity.b n = new a(false);
    private boolean o = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.activity.b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(z);
            NavController.this = r1;
        }

        @Override // androidx.activity.b
        public void b() {
            NavController.this.u();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(NavController navController, l lVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.f1271a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f1272b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        v vVar = this.k;
        vVar.a(new o(vVar));
        this.k.a(new androidx.navigation.b(this.f1271a));
    }

    private void G() {
        androidx.activity.b bVar = this.n;
        boolean z = true;
        if (!this.o || i() <= 1) {
            z = false;
        }
        bVar.f(z);
    }

    private boolean b() {
        while (!this.f1278h.isEmpty() && (this.f1278h.peekLast().e() instanceof n) && w(this.f1278h.peekLast().e().i(), true)) {
        }
        if (!this.f1278h.isEmpty()) {
            l e2 = this.f1278h.peekLast().e();
            l lVar = null;
            if (e2 instanceof c) {
                Iterator<f> descendingIterator = this.f1278h.descendingIterator();
                while (true) {
                    if (!descendingIterator.hasNext()) {
                        break;
                    }
                    l e3 = descendingIterator.next().e();
                    if (!(e3 instanceof n) && !(e3 instanceof c)) {
                        lVar = e3;
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            Iterator<f> descendingIterator2 = this.f1278h.descendingIterator();
            while (descendingIterator2.hasNext()) {
                f next = descendingIterator2.next();
                e.b f2 = next.f();
                l e4 = next.e();
                if (e2 != null && e4.i() == e2.i()) {
                    e.b bVar = e.b.RESUMED;
                    if (f2 != bVar) {
                        hashMap.put(next, bVar);
                    }
                    e2 = e2.l();
                } else if (lVar == null || e4.i() != lVar.i()) {
                    next.l(e.b.CREATED);
                } else {
                    if (f2 == e.b.RESUMED) {
                        next.l(e.b.STARTED);
                    } else {
                        e.b bVar2 = e.b.STARTED;
                        if (f2 != bVar2) {
                            hashMap.put(next, bVar2);
                        }
                    }
                    lVar = lVar.l();
                }
            }
            for (f fVar : this.f1278h) {
                e.b bVar3 = (e.b) hashMap.get(fVar);
                if (bVar3 != null) {
                    fVar.l(bVar3);
                } else {
                    fVar.m();
                }
            }
            f peekLast = this.f1278h.peekLast();
            Iterator<b> it = this.l.iterator();
            while (it.hasNext()) {
                it.next().a(this, peekLast.e(), peekLast.b());
            }
            return true;
        }
        return false;
    }

    private String e(int[] iArr) {
        n nVar;
        n nVar2 = this.f1274d;
        int i = 0;
        while (true) {
            l lVar = null;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i != 0) {
                    lVar = nVar2.u(i2);
                } else if (this.f1274d.i() == i2) {
                    lVar = this.f1274d;
                }
                if (lVar == null) {
                    return l.h(this.f1271a, i2);
                }
                if (i != iArr.length - 1) {
                    while (true) {
                        nVar = (n) lVar;
                        if (!(nVar.u(nVar.x()) instanceof n)) {
                            break;
                        }
                        lVar = nVar.u(nVar.x());
                    }
                    nVar2 = nVar;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    private int i() {
        int i = 0;
        for (f fVar : this.f1278h) {
            if (!(fVar.e() instanceof n)) {
                i++;
            }
        }
        return i;
    }

    private void q(l lVar, Bundle bundle, r rVar, u.a aVar) {
        boolean z = false;
        boolean w = (rVar == null || rVar.e() == -1) ? false : w(rVar.e(), rVar.f());
        u d2 = this.k.d(lVar.k());
        Bundle c2 = lVar.c(bundle);
        l b2 = d2.b(lVar, c2, rVar, aVar);
        if (b2 != null) {
            if (!(b2 instanceof c)) {
                while (!this.f1278h.isEmpty() && (this.f1278h.peekLast().e() instanceof c) && w(this.f1278h.peekLast().e().i(), true)) {
                }
            }
            if (this.f1278h.isEmpty()) {
                this.f1278h.add(new f(this.f1271a, this.f1274d, c2, this.i, this.j));
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            n nVar = b2;
            while (nVar != null && d(nVar.i()) == null) {
                nVar = nVar.l();
                if (nVar != null) {
                    arrayDeque.addFirst(new f(this.f1271a, nVar, c2, this.i, this.j));
                }
            }
            this.f1278h.addAll(arrayDeque);
            this.f1278h.add(new f(this.f1271a, b2, b2.c(c2), this.i, this.j));
        } else if (rVar != null && rVar.g()) {
            f peekLast = this.f1278h.peekLast();
            if (peekLast != null) {
                peekLast.j(bundle);
            }
            z = true;
        }
        G();
        if (w || b2 != null || z) {
            b();
        }
    }

    private void t(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f1275e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                u d2 = this.k.d(next);
                Bundle bundle3 = this.f1275e.getBundle(next);
                if (bundle3 != null) {
                    d2.c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f1276f;
        boolean z = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                g gVar = (g) parcelable;
                l d3 = d(gVar.c());
                if (d3 == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + l.h(this.f1271a, gVar.c()) + " cannot be found from the current destination " + h());
                }
                Bundle a2 = gVar.a();
                if (a2 != null) {
                    a2.setClassLoader(this.f1271a.getClassLoader());
                }
                this.f1278h.add(new f(this.f1271a, d3, a2, this.i, this.j, gVar.m(), gVar.k()));
            }
            G();
            this.f1276f = null;
        }
        if (this.f1274d == null || !this.f1278h.isEmpty()) {
            b();
            return;
        }
        if (!this.f1277g && (activity = this.f1272b) != null && m(activity.getIntent())) {
            z = true;
        }
        if (z) {
            return;
        }
        q(this.f1274d, bundle, null, null);
    }

    public void A(int i) {
        B(i, null);
    }

    public void B(int i, Bundle bundle) {
        C(k().c(i), bundle);
    }

    public void C(n nVar, Bundle bundle) {
        n nVar2 = this.f1274d;
        if (nVar2 != null) {
            w(nVar2.i(), true);
        }
        this.f1274d = nVar;
        t(bundle);
    }

    public void D(androidx.lifecycle.i iVar) {
        this.i = iVar;
        iVar.a().a(this.m);
    }

    public void E(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.i != null) {
            this.n.d();
            onBackPressedDispatcher.a(this.i, this.n);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    public void F(androidx.lifecycle.v vVar) {
        if (this.f1278h.isEmpty()) {
            this.j = h.f(vVar);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
    }

    public void a(b bVar) {
        if (!this.f1278h.isEmpty()) {
            f peekLast = this.f1278h.peekLast();
            bVar.a(this, peekLast.e(), peekLast.b());
        }
        this.l.add(bVar);
    }

    public void c(boolean z) {
        this.o = z;
        G();
    }

    l d(int i) {
        n nVar = this.f1274d;
        if (nVar == null) {
            return null;
        }
        if (nVar.i() == i) {
            return this.f1274d;
        }
        l e2 = this.f1278h.isEmpty() ? this.f1274d : this.f1278h.getLast().e();
        return (e2 instanceof n ? e2 : e2.l()).u(i);
    }

    public Context f() {
        return this.f1271a;
    }

    public f g() {
        if (this.f1278h.isEmpty()) {
            return null;
        }
        return this.f1278h.getLast();
    }

    public l h() {
        f g2 = g();
        if (g2 != null) {
            return g2.e();
        }
        return null;
    }

    public n j() {
        n nVar = this.f1274d;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public q k() {
        if (this.f1273c == null) {
            this.f1273c = new q(this.f1271a, this.k);
        }
        return this.f1273c;
    }

    public v l() {
        return this.k;
    }

    public boolean m(Intent intent) {
        n nVar;
        l.a m;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if ((intArray == null || intArray.length == 0) && intent.getData() != null && (m = this.f1274d.m(new k(intent))) != null) {
            intArray = m.b().d();
            bundle.putAll(m.c());
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String e2 = e(intArray);
        if (e2 != null) {
            Log.i("NavController", "Could not find destination " + e2 + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i = 268435456 & flags;
        if (i != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            androidx.core.app.n e3 = androidx.core.app.n.e(this.f1271a);
            e3.b(intent);
            e3.h();
            Activity activity = this.f1272b;
            if (activity != null) {
                activity.finish();
                this.f1272b.overridePendingTransition(0, 0);
            }
            return true;
        } else if (i != 0) {
            if (!this.f1278h.isEmpty()) {
                w(this.f1274d.i(), true);
            }
            int i2 = 0;
            while (i2 < intArray.length) {
                int i3 = i2 + 1;
                int i4 = intArray[i2];
                l d2 = d(i4);
                if (d2 == null) {
                    String h2 = l.h(this.f1271a, i4);
                    throw new IllegalStateException("Deep Linking failed: destination " + h2 + " cannot be found from the current destination " + h());
                }
                r.a aVar = new r.a();
                aVar.b(0);
                aVar.c(0);
                q(d2, bundle, aVar.a(), null);
                i2 = i3;
            }
            return true;
        } else {
            n nVar2 = this.f1274d;
            int i5 = 0;
            while (i5 < intArray.length) {
                int i6 = intArray[i5];
                l u = i5 == 0 ? this.f1274d : nVar2.u(i6);
                if (u == null) {
                    String h3 = l.h(this.f1271a, i6);
                    throw new IllegalStateException("Deep Linking failed: destination " + h3 + " cannot be found in graph " + nVar2);
                }
                if (i5 != intArray.length - 1) {
                    while (true) {
                        nVar = (n) u;
                        if (!(nVar.u(nVar.x()) instanceof n)) {
                            break;
                        }
                        u = nVar.u(nVar.x());
                    }
                    nVar2 = nVar;
                } else {
                    Bundle c2 = u.c(bundle);
                    r.a aVar2 = new r.a();
                    aVar2.g(this.f1274d.i(), true);
                    aVar2.b(0);
                    aVar2.c(0);
                    q(u, c2, aVar2.a(), null);
                }
                i5++;
            }
            this.f1277g = true;
            return true;
        }
    }

    public void n(int i, Bundle bundle) {
        o(i, bundle, null);
    }

    public void o(int i, Bundle bundle, r rVar) {
        p(i, bundle, rVar, null);
    }

    public void p(int i, Bundle bundle, r rVar, u.a aVar) {
        int i2;
        l e2 = this.f1278h.isEmpty() ? this.f1274d : this.f1278h.getLast().e();
        if (e2 != null) {
            d e3 = e2.e(i);
            Bundle bundle2 = null;
            if (e3 != null) {
                if (rVar == null) {
                    rVar = e3.c();
                }
                i2 = e3.b();
                Bundle a2 = e3.a();
                if (a2 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a2);
                }
            } else {
                i2 = i;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i2 == 0 && rVar != null && rVar.e() != -1) {
                v(rVar.e(), rVar.f());
                return;
            } else if (i2 == 0) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            } else {
                l d2 = d(i2);
                if (d2 != null) {
                    q(d2, bundle2, rVar, aVar);
                    return;
                }
                String h2 = l.h(this.f1271a, i2);
                if (e3 == null) {
                    throw new IllegalArgumentException("Navigation action/destination " + h2 + " cannot be found from the current destination " + e2);
                }
                throw new IllegalArgumentException("Navigation destination " + h2 + " referenced from action " + l.h(this.f1271a, i) + " cannot be found from the current destination " + e2);
            }
        }
        throw new IllegalStateException("no current navigation node");
    }

    public void r(m mVar) {
        n(mVar.a(), mVar.b());
    }

    public boolean s() {
        int i;
        n l;
        int x;
        if (i() == 1) {
            l lVar = h();
            do {
                i = lVar.i();
                l = lVar.l();
                if (l == null) {
                    return false;
                }
                x = l.x();
                lVar = l;
            } while (x == i);
            Bundle bundle = new Bundle();
            Activity activity = this.f1272b;
            if (activity != null && activity.getIntent() != null && this.f1272b.getIntent().getData() != null) {
                bundle.putParcelable("android-support-nav:controller:deepLinkIntent", this.f1272b.getIntent());
                l.a m = this.f1274d.m(new k(this.f1272b.getIntent()));
                if (m != null) {
                    bundle.putAll(m.c());
                }
            }
            j jVar = new j(this);
            jVar.d(l.i());
            jVar.c(bundle);
            jVar.a().h();
            Activity activity2 = this.f1272b;
            if (activity2 != null) {
                activity2.finish();
            }
            return true;
        }
        return u();
    }

    public boolean u() {
        if (this.f1278h.isEmpty()) {
            return false;
        }
        return v(h().i(), true);
    }

    public boolean v(int i, boolean z) {
        return w(i, z) && b();
    }

    boolean w(int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f1278h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<f> descendingIterator = this.f1278h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            l e2 = descendingIterator.next().e();
            u d2 = this.k.d(e2.k());
            if (z || e2.i() != i) {
                arrayList.add(d2);
            }
            if (e2.i() == i) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            String h2 = l.h(this.f1271a, i);
            Log.i("NavController", "Ignoring popBackStack to destination " + h2 + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((u) it.next()).e()) {
            f removeLast = this.f1278h.removeLast();
            removeLast.l(e.b.DESTROYED);
            h hVar = this.j;
            if (hVar != null) {
                hVar.e(removeLast.f1301f);
            }
            z3 = true;
        }
        G();
        return z3;
    }

    public void x(b bVar) {
        this.l.remove(bVar);
    }

    public void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f1271a.getClassLoader());
        this.f1275e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f1276f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f1277g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle z() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, u<? extends l>> entry : this.k.e().entrySet()) {
            String key = entry.getKey();
            Bundle d2 = entry.getValue().d();
            if (d2 != null) {
                arrayList.add(key);
                bundle2.putBundle(key, d2);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f1278h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f1278h.size()];
            int i = 0;
            for (f fVar : this.f1278h) {
                parcelableArr[i] = new g(fVar);
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f1277g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f1277g);
        }
        return bundle;
    }
}
