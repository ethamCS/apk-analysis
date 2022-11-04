package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import b.g.l.b0;
import b.g.l.c0.c;
import b.g.l.t;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class h implements androidx.appcompat.view.menu.m {

    /* renamed from: b */
    private NavigationMenuView f3186b;

    /* renamed from: c */
    LinearLayout f3187c;

    /* renamed from: d */
    private m.a f3188d;

    /* renamed from: e */
    androidx.appcompat.view.menu.g f3189e;

    /* renamed from: f */
    private int f3190f;

    /* renamed from: g */
    c f3191g;

    /* renamed from: h */
    LayoutInflater f3192h;
    int i;
    boolean j;
    ColorStateList k;
    ColorStateList l;
    Drawable m;
    int n;
    int o;
    int p;
    boolean q;
    private int s;
    private int t;
    int u;
    boolean r = true;
    private int v = -1;
    final View.OnClickListener w = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
            h.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            h.this.K(true);
            androidx.appcompat.view.menu.i itemData = ((NavigationMenuItemView) view).getItemData();
            h hVar = h.this;
            boolean O = hVar.f3189e.O(itemData, hVar, 0);
            if (itemData == null || !itemData.isCheckable() || !O) {
                z = false;
            } else {
                h.this.f3191g.O(itemData);
            }
            h.this.K(false);
            if (z) {
                h.this.n(false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* loaded from: classes.dex */
    public class c extends RecyclerView.g<l> {

        /* renamed from: c */
        private final ArrayList<e> f3194c = new ArrayList<>();

        /* renamed from: d */
        private androidx.appcompat.view.menu.i f3195d;

        /* renamed from: e */
        private boolean f3196e;

        c() {
            h.this = r1;
            M();
        }

        private void F(int i, int i2) {
            while (i < i2) {
                ((g) this.f3194c.get(i)).f3201b = true;
                i++;
            }
        }

        private void M() {
            if (this.f3196e) {
                return;
            }
            this.f3196e = true;
            this.f3194c.clear();
            this.f3194c.add(new d());
            int i = -1;
            int size = h.this.f3189e.G().size();
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                androidx.appcompat.view.menu.i iVar = h.this.f3189e.G().get(i3);
                if (iVar.isChecked()) {
                    O(iVar);
                }
                if (iVar.isCheckable()) {
                    iVar.t(false);
                }
                if (iVar.hasSubMenu()) {
                    SubMenu subMenu = iVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.f3194c.add(new f(h.this.u, 0));
                        }
                        this.f3194c.add(new g(iVar));
                        int size2 = this.f3194c.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) subMenu.getItem(i4);
                            if (iVar2.isVisible()) {
                                if (!z2 && iVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (iVar2.isCheckable()) {
                                    iVar2.t(false);
                                }
                                if (iVar.isChecked()) {
                                    O(iVar);
                                }
                                this.f3194c.add(new g(iVar2));
                            }
                        }
                        if (z2) {
                            F(size2, this.f3194c.size());
                        }
                    }
                } else {
                    int groupId = iVar.getGroupId();
                    if (groupId != i) {
                        i2 = this.f3194c.size();
                        z = iVar.getIcon() != null;
                        if (i3 != 0) {
                            i2++;
                            ArrayList<e> arrayList = this.f3194c;
                            int i5 = h.this.u;
                            arrayList.add(new f(i5, i5));
                        }
                    } else if (!z && iVar.getIcon() != null) {
                        F(i2, this.f3194c.size());
                        z = true;
                    }
                    g gVar = new g(iVar);
                    gVar.f3201b = z;
                    this.f3194c.add(gVar);
                    i = groupId;
                }
            }
            this.f3196e = false;
        }

        public Bundle G() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.i iVar = this.f3195d;
            if (iVar != null) {
                bundle.putInt("android:menu:checked", iVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f3194c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f3194c.get(i);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.i a2 = ((g) eVar).a();
                    View actionView = a2 != null ? a2.getActionView() : null;
                    if (actionView != null) {
                        com.google.android.material.internal.j jVar = new com.google.android.material.internal.j();
                        actionView.saveHierarchyState(jVar);
                        sparseArray.put(a2.getItemId(), jVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.i H() {
            return this.f3195d;
        }

        int I() {
            int i = h.this.f3187c.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < h.this.f3191g.f(); i2++) {
                if (h.this.f3191g.h(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: J */
        public void u(l lVar, int i) {
            int h2 = h(i);
            if (h2 != 0) {
                if (h2 == 1) {
                    ((TextView) lVar.f1551a).setText(((g) this.f3194c.get(i)).a().getTitle());
                    return;
                } else if (h2 != 2) {
                    return;
                } else {
                    f fVar = (f) this.f3194c.get(i);
                    lVar.f1551a.setPadding(0, fVar.b(), 0, fVar.a());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f1551a;
            navigationMenuItemView.setIconTintList(h.this.l);
            h hVar = h.this;
            if (hVar.j) {
                navigationMenuItemView.setTextAppearance(hVar.i);
            }
            ColorStateList colorStateList = h.this.k;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable = h.this.m;
            t.l0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            g gVar = (g) this.f3194c.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f3201b);
            navigationMenuItemView.setHorizontalPadding(h.this.n);
            navigationMenuItemView.setIconPadding(h.this.o);
            h hVar2 = h.this;
            if (hVar2.q) {
                navigationMenuItemView.setIconSize(hVar2.p);
            }
            navigationMenuItemView.setMaxLines(h.this.s);
            navigationMenuItemView.e(gVar.a(), 0);
        }

        /* renamed from: K */
        public l w(ViewGroup viewGroup, int i) {
            if (i == 0) {
                h hVar = h.this;
                return new i(hVar.f3192h, viewGroup, hVar.w);
            } else if (i == 1) {
                return new k(h.this.f3192h, viewGroup);
            } else {
                if (i == 2) {
                    return new j(h.this.f3192h, viewGroup);
                }
                if (i == 3) {
                    return new b(h.this.f3187c);
                }
                return null;
            }
        }

        /* renamed from: L */
        public void B(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.f1551a).D();
            }
        }

        public void N(Bundle bundle) {
            androidx.appcompat.view.menu.i a2;
            View actionView;
            com.google.android.material.internal.j jVar;
            androidx.appcompat.view.menu.i a3;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f3196e = true;
                int size = this.f3194c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    e eVar = this.f3194c.get(i2);
                    if ((eVar instanceof g) && (a3 = ((g) eVar).a()) != null && a3.getItemId() == i) {
                        O(a3);
                        break;
                    }
                    i2++;
                }
                this.f3196e = false;
                M();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f3194c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = this.f3194c.get(i3);
                    if ((eVar2 instanceof g) && (a2 = ((g) eVar2).a()) != null && (actionView = a2.getActionView()) != null && (jVar = (com.google.android.material.internal.j) sparseParcelableArray.get(a2.getItemId())) != null) {
                        actionView.restoreHierarchyState(jVar);
                    }
                }
            }
        }

        public void O(androidx.appcompat.view.menu.i iVar) {
            if (this.f3195d == iVar || !iVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.i iVar2 = this.f3195d;
            if (iVar2 != null) {
                iVar2.setChecked(false);
            }
            this.f3195d = iVar;
            iVar.setChecked(true);
        }

        public void P(boolean z) {
            this.f3196e = z;
        }

        public void Q() {
            M();
            k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int f() {
            return this.f3194c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public long g(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int h(int i) {
            e eVar = this.f3194c.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (!(eVar instanceof g)) {
                throw new RuntimeException("Unknown item type.");
            }
            return ((g) eVar).a().hasSubMenu() ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
        d() {
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public static class f implements e {

        /* renamed from: a */
        private final int f3198a;

        /* renamed from: b */
        private final int f3199b;

        public f(int i, int i2) {
            this.f3198a = i;
            this.f3199b = i2;
        }

        public int a() {
            return this.f3199b;
        }

        public int b() {
            return this.f3198a;
        }
    }

    /* loaded from: classes.dex */
    public static class g implements e {

        /* renamed from: a */
        private final androidx.appcompat.view.menu.i f3200a;

        /* renamed from: b */
        boolean f3201b;

        g(androidx.appcompat.view.menu.i iVar) {
            this.f3200a = iVar;
        }

        public androidx.appcompat.view.menu.i a() {
            return this.f3200a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$h */
    /* loaded from: classes.dex */
    public class C0077h extends r {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0077h(RecyclerView recyclerView) {
            super(recyclerView);
            h.this = r1;
        }

        @Override // androidx.recyclerview.widget.r, b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.d0(c.b.a(h.this.f3191g.I(), 0, false));
        }
    }

    /* loaded from: classes.dex */
    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(d.a.a.a.h.a_res_0x7f0c0028, viewGroup, false));
            this.f1551a.setOnClickListener(onClickListener);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(d.a.a.a.h.c_res_0x7f0c002a, viewGroup, false));
        }
    }

    /* loaded from: classes.dex */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(d.a.a.a.h.d_res_0x7f0c002b, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class l extends RecyclerView.d0 {
        public l(View view) {
            super(view);
        }
    }

    private void L() {
        int i2 = (this.f3187c.getChildCount() != 0 || !this.r) ? 0 : this.t;
        NavigationMenuView navigationMenuView = this.f3186b;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    public void A(int i2) {
        this.f3190f = i2;
    }

    public void B(Drawable drawable) {
        this.m = drawable;
        n(false);
    }

    public void C(int i2) {
        this.n = i2;
        n(false);
    }

    public void D(int i2) {
        this.o = i2;
        n(false);
    }

    public void E(int i2) {
        if (this.p != i2) {
            this.p = i2;
            this.q = true;
            n(false);
        }
    }

    public void F(ColorStateList colorStateList) {
        this.l = colorStateList;
        n(false);
    }

    public void G(int i2) {
        this.s = i2;
        n(false);
    }

    public void H(int i2) {
        this.i = i2;
        this.j = true;
        n(false);
    }

    public void I(ColorStateList colorStateList) {
        this.k = colorStateList;
        n(false);
    }

    public void J(int i2) {
        this.v = i2;
        NavigationMenuView navigationMenuView = this.f3186b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void K(boolean z) {
        c cVar = this.f3191g;
        if (cVar != null) {
            cVar.P(z);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        m.a aVar = this.f3188d;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public int c() {
        return this.f3190f;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable e() {
        Bundle bundle = new Bundle();
        if (this.f3186b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3186b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f3191g;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.G());
        }
        if (this.f3187c != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f3187c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(Context context, androidx.appcompat.view.menu.g gVar) {
        this.f3192h = LayoutInflater.from(context);
        this.f3189e = gVar;
        this.u = context.getResources().getDimensionPixelOffset(d.a.a.a.d.f_res_0x7f07007e);
    }

    public void g(View view) {
        this.f3187c.addView(view);
        NavigationMenuView navigationMenuView = this.f3186b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f3186b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f3191g.N(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 == null) {
                return;
            }
            this.f3187c.restoreHierarchyState(sparseParcelableArray2);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean j(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    public void l(b0 b0Var) {
        int i2 = b0Var.i();
        if (this.t != i2) {
            this.t = i2;
            L();
        }
        NavigationMenuView navigationMenuView = this.f3186b;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, b0Var.f());
        t.g(this.f3187c, b0Var);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean m(androidx.appcompat.view.menu.r rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void n(boolean z) {
        c cVar = this.f3191g;
        if (cVar != null) {
            cVar.Q();
        }
    }

    public androidx.appcompat.view.menu.i o() {
        return this.f3191g.H();
    }

    public int p() {
        return this.f3187c.getChildCount();
    }

    public Drawable q() {
        return this.m;
    }

    public int r() {
        return this.n;
    }

    public int s() {
        return this.o;
    }

    public int t() {
        return this.s;
    }

    public ColorStateList u() {
        return this.k;
    }

    public ColorStateList v() {
        return this.l;
    }

    public androidx.appcompat.view.menu.n w(ViewGroup viewGroup) {
        if (this.f3186b == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f3192h.inflate(d.a.a.a.h.e_res_0x7f0c002c, viewGroup, false);
            this.f3186b = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C0077h(this.f3186b));
            if (this.f3191g == null) {
                this.f3191g = new c();
            }
            int i2 = this.v;
            if (i2 != -1) {
                this.f3186b.setOverScrollMode(i2);
            }
            this.f3187c = (LinearLayout) this.f3192h.inflate(d.a.a.a.h.b_res_0x7f0c0029, (ViewGroup) this.f3186b, false);
            this.f3186b.setAdapter(this.f3191g);
        }
        return this.f3186b;
    }

    public View x(int i2) {
        View inflate = this.f3192h.inflate(i2, (ViewGroup) this.f3187c, false);
        g(inflate);
        return inflate;
    }

    public void y(boolean z) {
        if (this.r != z) {
            this.r = z;
            L();
        }
    }

    public void z(androidx.appcompat.view.menu.i iVar) {
        this.f3191g.O(iVar);
    }
}
