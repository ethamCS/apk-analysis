package com.google.android.material.internal;

import a.g.l.c0;
import a.g.l.d0.c;
import a.g.l.u;
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
import androidx.appcompat.view.menu.r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f implements androidx.appcompat.view.menu.m {

    /* renamed from: b */
    private NavigationMenuView f1521b;

    /* renamed from: c */
    LinearLayout f1522c;
    private m.a d;
    androidx.appcompat.view.menu.g e;
    private int f;
    c g;
    LayoutInflater h;
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
            f.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            f.this.c(true);
            androidx.appcompat.view.menu.i itemData = ((NavigationMenuItemView) view).getItemData();
            f fVar = f.this;
            boolean a2 = fVar.e.a(itemData, fVar, 0);
            if (itemData == null || !itemData.isCheckable() || !a2) {
                z = false;
            } else {
                f.this.g.a(itemData);
            }
            f.this.c(false);
            if (z) {
                f.this.a(false);
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
        private final ArrayList<e> f1524c = new ArrayList<>();
        private androidx.appcompat.view.menu.i d;
        private boolean e;

        c() {
            f.this = r1;
            i();
        }

        private void a(int i, int i2) {
            while (i < i2) {
                ((g) this.f1524c.get(i)).f1528b = true;
                i++;
            }
        }

        private void i() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.f1524c.clear();
            this.f1524c.add(new d());
            int i = -1;
            int size = f.this.e.n().size();
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                androidx.appcompat.view.menu.i iVar = f.this.e.n().get(i3);
                if (iVar.isChecked()) {
                    a(iVar);
                }
                if (iVar.isCheckable()) {
                    iVar.c(false);
                }
                if (iVar.hasSubMenu()) {
                    SubMenu subMenu = iVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.f1524c.add(new C0068f(f.this.u, 0));
                        }
                        this.f1524c.add(new g(iVar));
                        int size2 = this.f1524c.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) subMenu.getItem(i4);
                            if (iVar2.isVisible()) {
                                if (!z2 && iVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (iVar2.isCheckable()) {
                                    iVar2.c(false);
                                }
                                if (iVar.isChecked()) {
                                    a(iVar);
                                }
                                this.f1524c.add(new g(iVar2));
                            }
                        }
                        if (z2) {
                            a(size2, this.f1524c.size());
                        }
                    }
                } else {
                    int groupId = iVar.getGroupId();
                    if (groupId != i) {
                        i2 = this.f1524c.size();
                        z = iVar.getIcon() != null;
                        if (i3 != 0) {
                            i2++;
                            ArrayList<e> arrayList = this.f1524c;
                            int i5 = f.this.u;
                            arrayList.add(new C0068f(i5, i5));
                        }
                    } else if (!z && iVar.getIcon() != null) {
                        a(i2, this.f1524c.size());
                        z = true;
                    }
                    g gVar = new g(iVar);
                    gVar.f1528b = z;
                    this.f1524c.add(gVar);
                    i = groupId;
                }
            }
            this.e = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int a() {
            return this.f1524c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public long a(int i) {
            return i;
        }

        public void a(Bundle bundle) {
            androidx.appcompat.view.menu.i a2;
            View actionView;
            com.google.android.material.internal.h hVar;
            androidx.appcompat.view.menu.i a3;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.e = true;
                int size = this.f1524c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    e eVar = this.f1524c.get(i2);
                    if ((eVar instanceof g) && (a3 = ((g) eVar).a()) != null && a3.getItemId() == i) {
                        a(a3);
                        break;
                    }
                    i2++;
                }
                this.e = false;
                i();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f1524c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = this.f1524c.get(i3);
                    if ((eVar2 instanceof g) && (a2 = ((g) eVar2).a()) != null && (actionView = a2.getActionView()) != null && (hVar = (com.google.android.material.internal.h) sparseParcelableArray.get(a2.getItemId())) != null) {
                        actionView.restoreHierarchyState(hVar);
                    }
                }
            }
        }

        public void a(androidx.appcompat.view.menu.i iVar) {
            if (this.d == iVar || !iVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.i iVar2 = this.d;
            if (iVar2 != null) {
                iVar2.setChecked(false);
            }
            this.d = iVar;
            iVar.setChecked(true);
        }

        /* renamed from: a */
        public void d(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.f1022a).d();
            }
        }

        /* renamed from: a */
        public void b(l lVar, int i) {
            int b2 = b(i);
            if (b2 != 0) {
                if (b2 == 1) {
                    ((TextView) lVar.f1022a).setText(((g) this.f1524c.get(i)).a().getTitle());
                    return;
                } else if (b2 != 2) {
                    return;
                } else {
                    C0068f c0068f = (C0068f) this.f1524c.get(i);
                    lVar.f1022a.setPadding(0, c0068f.b(), 0, c0068f.a());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f1022a;
            navigationMenuItemView.setIconTintList(f.this.l);
            f fVar = f.this;
            if (fVar.j) {
                navigationMenuItemView.setTextAppearance(fVar.i);
            }
            ColorStateList colorStateList = f.this.k;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable = f.this.m;
            u.a(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            g gVar = (g) this.f1524c.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f1528b);
            navigationMenuItemView.setHorizontalPadding(f.this.n);
            navigationMenuItemView.setIconPadding(f.this.o);
            f fVar2 = f.this;
            if (fVar2.q) {
                navigationMenuItemView.setIconSize(fVar2.p);
            }
            navigationMenuItemView.setMaxLines(f.this.s);
            navigationMenuItemView.a(gVar.a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int b(int i) {
            e eVar = this.f1524c.get(i);
            if (eVar instanceof C0068f) {
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

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public l b(ViewGroup viewGroup, int i) {
            if (i == 0) {
                f fVar = f.this;
                return new i(fVar.h, viewGroup, fVar.w);
            } else if (i == 1) {
                return new k(f.this.h, viewGroup);
            } else {
                if (i == 2) {
                    return new j(f.this.h, viewGroup);
                }
                if (i == 3) {
                    return new b(f.this.f1522c);
                }
                return null;
            }
        }

        public void b(boolean z) {
            this.e = z;
        }

        public Bundle e() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.i iVar = this.d;
            if (iVar != null) {
                bundle.putInt("android:menu:checked", iVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f1524c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f1524c.get(i);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.i a2 = ((g) eVar).a();
                    View actionView = a2 != null ? a2.getActionView() : null;
                    if (actionView != null) {
                        com.google.android.material.internal.h hVar = new com.google.android.material.internal.h();
                        actionView.saveHierarchyState(hVar);
                        sparseArray.put(a2.getItemId(), hVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.i f() {
            return this.d;
        }

        int g() {
            int i = f.this.f1522c.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < f.this.g.a(); i2++) {
                if (f.this.g.b(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        public void h() {
            i();
            d();
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

    /* renamed from: com.google.android.material.internal.f$f */
    /* loaded from: classes.dex */
    public static class C0068f implements e {

        /* renamed from: a */
        private final int f1525a;

        /* renamed from: b */
        private final int f1526b;

        public C0068f(int i, int i2) {
            this.f1525a = i;
            this.f1526b = i2;
        }

        public int a() {
            return this.f1526b;
        }

        public int b() {
            return this.f1525a;
        }
    }

    /* loaded from: classes.dex */
    public static class g implements e {

        /* renamed from: a */
        private final androidx.appcompat.view.menu.i f1527a;

        /* renamed from: b */
        boolean f1528b;

        g(androidx.appcompat.view.menu.i iVar) {
            this.f1527a = iVar;
        }

        public androidx.appcompat.view.menu.i a() {
            return this.f1527a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends androidx.recyclerview.widget.k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(RecyclerView recyclerView) {
            super(recyclerView);
            f.this = r1;
        }

        @Override // androidx.recyclerview.widget.k, a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            super.a(view, cVar);
            cVar.a(c.b.a(f.this.g.g(), 0, false));
        }
    }

    /* loaded from: classes.dex */
    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(b.a.a.a.h.design_navigation_item, viewGroup, false));
            this.f1022a.setOnClickListener(onClickListener);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(b.a.a.a.h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* loaded from: classes.dex */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(b.a.a.a.h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class l extends RecyclerView.d0 {
        public l(View view) {
            super(view);
        }
    }

    private void l() {
        int i2 = (this.f1522c.getChildCount() != 0 || !this.r) ? 0 : this.t;
        NavigationMenuView navigationMenuView = this.f1521b;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    public View a(int i2) {
        return this.f1522c.getChildAt(i2);
    }

    public androidx.appcompat.view.menu.i a() {
        return this.g.f();
    }

    public androidx.appcompat.view.menu.n a(ViewGroup viewGroup) {
        if (this.f1521b == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.h.inflate(b.a.a.a.h.design_navigation_menu, viewGroup, false);
            this.f1521b = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f1521b));
            if (this.g == null) {
                this.g = new c();
            }
            int i2 = this.v;
            if (i2 != -1) {
                this.f1521b.setOverScrollMode(i2);
            }
            this.f1522c = (LinearLayout) this.h.inflate(b.a.a.a.h.design_navigation_item_header, (ViewGroup) this.f1521b, false);
            this.f1521b.setAdapter(this.g);
        }
        return this.f1521b;
    }

    public void a(c0 c0Var) {
        int e2 = c0Var.e();
        if (this.t != e2) {
            this.t = e2;
            l();
        }
        NavigationMenuView navigationMenuView = this.f1521b;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c0Var.b());
        u.a(this.f1522c, c0Var);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(Context context, androidx.appcompat.view.menu.g gVar) {
        this.h = LayoutInflater.from(context);
        this.e = gVar;
        this.u = context.getResources().getDimensionPixelOffset(b.a.a.a.d.design_navigation_separator_vertical_padding);
    }

    public void a(ColorStateList colorStateList) {
        this.l = colorStateList;
        a(false);
    }

    public void a(Drawable drawable) {
        this.m = drawable;
        a(false);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f1521b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.g.a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 == null) {
                return;
            }
            this.f1522c.restoreHierarchyState(sparseParcelableArray2);
        }
    }

    public void a(View view) {
        this.f1522c.addView(view);
        NavigationMenuView navigationMenuView = this.f1521b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        m.a aVar = this.d;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public void a(androidx.appcompat.view.menu.i iVar) {
        this.g.a(iVar);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(m.a aVar) {
        this.d = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(boolean z) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(r rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int b() {
        return this.f;
    }

    public View b(int i2) {
        View inflate = this.h.inflate(i2, (ViewGroup) this.f1522c, false);
        a(inflate);
        return inflate;
    }

    public void b(ColorStateList colorStateList) {
        this.k = colorStateList;
        a(false);
    }

    public void b(boolean z) {
        if (this.r != z) {
            this.r = z;
            l();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean b(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    public void c(int i2) {
        this.f = i2;
    }

    public void c(boolean z) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.b(z);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        return false;
    }

    public int d() {
        return this.f1522c.getChildCount();
    }

    public void d(int i2) {
        this.n = i2;
        a(false);
    }

    public Drawable e() {
        return this.m;
    }

    public void e(int i2) {
        this.o = i2;
        a(false);
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable f() {
        Bundle bundle = new Bundle();
        if (this.f1521b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1521b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.g;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.e());
        }
        if (this.f1522c != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f1522c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public void f(int i2) {
        if (this.p != i2) {
            this.p = i2;
            this.q = true;
            a(false);
        }
    }

    public int g() {
        return this.n;
    }

    public void g(int i2) {
        this.s = i2;
        a(false);
    }

    public int h() {
        return this.o;
    }

    public void h(int i2) {
        this.i = i2;
        this.j = true;
        a(false);
    }

    public int i() {
        return this.s;
    }

    public void i(int i2) {
        this.v = i2;
        NavigationMenuView navigationMenuView = this.f1521b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public ColorStateList j() {
        return this.k;
    }

    public ColorStateList k() {
        return this.l;
    }
}
