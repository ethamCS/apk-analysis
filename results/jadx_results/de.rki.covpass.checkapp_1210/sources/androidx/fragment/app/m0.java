package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a */
    private final ViewGroup f4146a;

    /* renamed from: b */
    final ArrayList<e> f4147b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<e> f4148c = new ArrayList<>();

    /* renamed from: d */
    boolean f4149d = false;

    /* renamed from: e */
    boolean f4150e = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ d f4151c;

        a(d dVar) {
            m0.this = r1;
            this.f4151c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m0.this.f4147b.contains(this.f4151c)) {
                this.f4151c.e().b(this.f4151c.f().f3928x4);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ d f4153c;

        b(d dVar) {
            m0.this = r1;
            this.f4153c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.f4147b.remove(this.f4153c);
            m0.this.f4148c.remove(this.f4153c);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4155a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4156b;

        static {
            int[] iArr = new int[e.b.values().length];
            f4156b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4156b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4156b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f4155a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4155a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4155a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4155a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h */
        private final d0 f4157h;

        d(e.c cVar, e.b bVar, d0 d0Var, androidx.core.os.e eVar) {
            super(cVar, bVar, d0Var.k(), eVar);
            this.f4157h = d0Var;
        }

        @Override // androidx.fragment.app.m0.e
        public void c() {
            super.c();
            this.f4157h.m();
        }

        @Override // androidx.fragment.app.m0.e
        void l() {
            if (g() != e.b.ADDING) {
                if (g() != e.b.REMOVING) {
                    return;
                }
                Fragment k10 = this.f4157h.k();
                View T1 = k10.T1();
                if (w.L0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + T1.findFocus() + " on view " + T1 + " for Fragment " + k10);
                }
                T1.clearFocus();
                return;
            }
            Fragment k11 = this.f4157h.k();
            View findFocus = k11.f3928x4.findFocus();
            if (findFocus != null) {
                k11.b2(findFocus);
                if (w.L0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k11);
                }
            }
            View T12 = f().T1();
            if (T12.getParent() == null) {
                this.f4157h.b();
                T12.setAlpha(0.0f);
            }
            if (T12.getAlpha() == 0.0f && T12.getVisibility() == 0) {
                T12.setVisibility(4);
            }
            T12.setAlpha(k11.m0());
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private c f4158a;

        /* renamed from: b */
        private b f4159b;

        /* renamed from: c */
        private final Fragment f4160c;

        /* renamed from: d */
        private final List<Runnable> f4161d = new ArrayList();

        /* renamed from: e */
        private final HashSet<androidx.core.os.e> f4162e = new HashSet<>();

        /* renamed from: f */
        private boolean f4163f = false;

        /* renamed from: g */
        private boolean f4164g = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements e.b {
            a() {
                e.this = r1;
            }

            @Override // androidx.core.os.e.b
            public void a() {
                e.this.b();
            }
        }

        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c g(int i10) {
                if (i10 != 0) {
                    if (i10 == 4) {
                        return INVISIBLE;
                    }
                    if (i10 == 8) {
                        return GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }
                return VISIBLE;
            }

            public static c h(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : g(view.getVisibility());
            }

            public void b(View view) {
                int i10;
                int i11 = c.f4155a[ordinal()];
                if (i11 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup == null) {
                        return;
                    }
                    if (w.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                    return;
                }
                if (i11 == 2) {
                    if (w.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i10 = 0;
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                    if (w.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                    return;
                } else {
                    if (w.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i10 = 8;
                }
                view.setVisibility(i10);
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f4158a = cVar;
            this.f4159b = bVar;
            this.f4160c = fragment;
            eVar.b(new a());
        }

        public final void a(Runnable runnable) {
            this.f4161d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f4163f = true;
            if (this.f4162e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f4162e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).a();
            }
        }

        public void c() {
            if (this.f4164g) {
                return;
            }
            if (w.L0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4164g = true;
            for (Runnable runnable : this.f4161d) {
                runnable.run();
            }
        }

        public final void d(androidx.core.os.e eVar) {
            if (!this.f4162e.remove(eVar) || !this.f4162e.isEmpty()) {
                return;
            }
            c();
        }

        public c e() {
            return this.f4158a;
        }

        public final Fragment f() {
            return this.f4160c;
        }

        b g() {
            return this.f4159b;
        }

        final boolean h() {
            return this.f4163f;
        }

        final boolean i() {
            return this.f4164g;
        }

        public final void j(androidx.core.os.e eVar) {
            l();
            this.f4162e.add(eVar);
        }

        final void k(c cVar, b bVar) {
            b bVar2;
            int i10 = c.f4156b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 || this.f4158a == c.REMOVED) {
                        return;
                    }
                    if (w.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4160c + " mFinalState = " + this.f4158a + " -> " + cVar + ". ");
                    }
                    this.f4158a = cVar;
                    return;
                }
                if (w.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4160c + " mFinalState = " + this.f4158a + " -> REMOVED. mLifecycleImpact  = " + this.f4159b + " to REMOVING.");
                }
                this.f4158a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else if (this.f4158a != c.REMOVED) {
                return;
            } else {
                if (w.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4160c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4159b + " to ADDING.");
                }
                this.f4158a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f4159b = bVar2;
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f4158a + "} {mLifecycleImpact = " + this.f4159b + "} {mFragment = " + this.f4160c + "}";
        }
    }

    public m0(ViewGroup viewGroup) {
        this.f4146a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, d0 d0Var) {
        synchronized (this.f4147b) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            e h10 = h(d0Var.k());
            if (h10 != null) {
                h10.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, d0Var, eVar);
            this.f4147b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.f4147b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.f4148c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    public static m0 n(ViewGroup viewGroup, w wVar) {
        return o(viewGroup, wVar.D0());
    }

    public static m0 o(ViewGroup viewGroup, n0 n0Var) {
        int i10 = a1.b.b_res_0x7f09023b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof m0) {
            return (m0) tag;
        }
        m0 a10 = n0Var.a(viewGroup);
        viewGroup.setTag(i10, a10);
        return a10;
    }

    private void q() {
        Iterator<e> it = this.f4147b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.g(next.f().T1().getVisibility()), e.b.NONE);
            }
        }
    }

    public void b(e.c cVar, d0 d0Var) {
        if (w.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + d0Var.k());
        }
        a(cVar, e.b.ADDING, d0Var);
    }

    public void c(d0 d0Var) {
        if (w.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + d0Var.k());
        }
        a(e.c.GONE, e.b.NONE, d0Var);
    }

    public void d(d0 d0Var) {
        if (w.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + d0Var.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, d0Var);
    }

    public void e(d0 d0Var) {
        if (w.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + d0Var.k());
        }
        a(e.c.VISIBLE, e.b.NONE, d0Var);
    }

    abstract void f(List<e> list, boolean z10);

    public void g() {
        if (this.f4150e) {
            return;
        }
        if (!androidx.core.view.y.R(this.f4146a)) {
            j();
            this.f4149d = false;
            return;
        }
        synchronized (this.f4147b) {
            if (!this.f4147b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f4148c);
                this.f4148c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (w.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f4148c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f4147b);
                this.f4147b.clear();
                this.f4148c.addAll(arrayList2);
                if (w.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.f4149d);
                this.f4149d = false;
                if (w.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    public void j() {
        String str;
        String str2;
        if (w.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean R = androidx.core.view.y.R(this.f4146a);
        synchronized (this.f4147b) {
            q();
            Iterator<e> it = this.f4147b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f4148c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (w.L0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (R) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        str2 = "Container " + this.f4146a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f4147b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (w.L0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (R) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = "Container " + this.f4146a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.b();
            }
        }
    }

    public void k() {
        if (this.f4150e) {
            if (w.L0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f4150e = false;
            g();
        }
    }

    public e.b l(d0 d0Var) {
        e h10 = h(d0Var.k());
        e.b g10 = h10 != null ? h10.g() : null;
        e i10 = i(d0Var.k());
        return (i10 == null || !(g10 == null || g10 == e.b.NONE)) ? g10 : i10.g();
    }

    public ViewGroup m() {
        return this.f4146a;
    }

    public void p() {
        synchronized (this.f4147b) {
            q();
            this.f4150e = false;
            int size = this.f4147b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f4147b.get(size);
                e.c h10 = e.c.h(eVar.f().f3928x4);
                e.c e10 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e10 == cVar && h10 != cVar) {
                    this.f4150e = eVar.f().G0();
                    break;
                }
                size--;
            }
        }
    }

    public void r(boolean z10) {
        this.f4149d = z10;
    }
}
