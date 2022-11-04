package androidx.navigation.z;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.navigation.NavController;
import androidx.navigation.l;
import androidx.navigation.r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public class a implements NavigationView.c {

        /* renamed from: a */
        final /* synthetic */ NavController f1419a;

        /* renamed from: b */
        final /* synthetic */ NavigationView f1420b;

        a(NavController navController, NavigationView navigationView) {
            this.f1419a = navController;
            this.f1420b = navigationView;
        }

        @Override // com.google.android.material.navigation.NavigationView.c
        public boolean a(MenuItem menuItem) {
            boolean f2 = d.f(menuItem, this.f1419a);
            if (f2) {
                ViewParent parent = this.f1420b.getParent();
                if (parent instanceof b.i.b.c) {
                    ((b.i.b.c) parent).close();
                } else {
                    BottomSheetBehavior a2 = d.a(this.f1420b);
                    if (a2 != null) {
                        a2.j0(5);
                    }
                }
            }
            return f2;
        }
    }

    /* loaded from: classes.dex */
    public class b implements NavController.b {

        /* renamed from: a */
        final /* synthetic */ WeakReference f1421a;

        /* renamed from: b */
        final /* synthetic */ NavController f1422b;

        b(WeakReference weakReference, NavController navController) {
            this.f1421a = weakReference;
            this.f1422b = navController;
        }

        @Override // androidx.navigation.NavController.b
        public void a(NavController navController, l lVar, Bundle bundle) {
            NavigationView navigationView = (NavigationView) this.f1421a.get();
            if (navigationView == null) {
                this.f1422b.x(this);
                return;
            }
            Menu menu = navigationView.getMenu();
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                item.setChecked(d.c(lVar, item.getItemId()));
            }
        }
    }

    static BottomSheetBehavior a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            return a((View) parent);
        }
        CoordinatorLayout.c f2 = ((CoordinatorLayout.f) layoutParams).f();
        if (f2 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) f2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static androidx.navigation.l b(androidx.navigation.n r1) {
        /*
        L0:
            boolean r0 = r1 instanceof androidx.navigation.n
            if (r0 == 0) goto Lf
            androidx.navigation.n r1 = (androidx.navigation.n) r1
            int r0 = r1.x()
            androidx.navigation.l r1 = r1.u(r0)
            goto L0
        Lf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.z.d.b(androidx.navigation.n):androidx.navigation.l");
    }

    static boolean c(l lVar, int i) {
        while (lVar.i() != i && lVar.l() != null) {
            lVar = lVar.l();
        }
        return lVar.i() == i;
    }

    public static boolean d(l lVar, Set<Integer> set) {
        while (!set.contains(Integer.valueOf(lVar.i()))) {
            lVar = lVar.l();
            if (lVar == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(NavController navController, c cVar) {
        b.i.b.c b2 = cVar.b();
        l h2 = navController.h();
        Set<Integer> c2 = cVar.c();
        if (b2 != null && h2 != null && d(h2, c2)) {
            b2.a();
            return true;
        } else if (navController.s()) {
            return true;
        } else {
            if (cVar.a() == null) {
                return false;
            }
            return cVar.a().a();
        }
    }

    public static boolean f(MenuItem menuItem, NavController navController) {
        r.a aVar = new r.a();
        aVar.d(true);
        aVar.b(e.a_res_0x7f02000f);
        aVar.c(e.b_res_0x7f020010);
        aVar.e(e.c_res_0x7f020011);
        aVar.f(e.d_res_0x7f020012);
        if ((menuItem.getOrder() & 196608) == 0) {
            aVar.g(b(navController.j()).i(), false);
        }
        try {
            navController.o(menuItem.getItemId(), null, aVar.a());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static void g(androidx.appcompat.app.d dVar, NavController navController, c cVar) {
        navController.a(new androidx.navigation.z.b(dVar, cVar));
    }

    public static void h(NavigationView navigationView, NavController navController) {
        navigationView.setNavigationItemSelectedListener(new a(navController, navigationView));
        navController.a(new b(new WeakReference(navigationView), navController));
    }
}
