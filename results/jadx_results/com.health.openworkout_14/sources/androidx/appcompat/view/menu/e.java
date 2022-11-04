package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: b */
    Context f291b;

    /* renamed from: c */
    LayoutInflater f292c;

    /* renamed from: d */
    g f293d;

    /* renamed from: e */
    ExpandedMenuView f294e;

    /* renamed from: f */
    int f295f;

    /* renamed from: g */
    int f296g;

    /* renamed from: h */
    int f297h;
    private m.a i;
    a j;
    private int k;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: b */
        private int f298b = -1;

        public a() {
            e.this = r1;
            a();
        }

        void a() {
            i x = e.this.f293d.x();
            if (x != null) {
                ArrayList<i> B = e.this.f293d.B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.f298b = i;
                        return;
                    }
                }
            }
            this.f298b = -1;
        }

        /* renamed from: b */
        public i getItem(int i) {
            ArrayList<i> B = e.this.f293d.B();
            int i2 = i + e.this.f295f;
            int i3 = this.f298b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f293d.B().size() - e.this.f295f;
            return this.f298b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f292c.inflate(eVar.f297h, viewGroup, false);
            }
            ((n.a) view).e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i, int i2) {
        this.f297h = i;
        this.f296g = i2;
    }

    public e(Context context, int i) {
        this(i, 0);
        this.f291b = context;
        this.f292c = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.i;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public ListAdapter b() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.m
    public int c() {
        return this.k;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable e() {
        if (this.f294e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o(bundle);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.f296g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f296g
            r0.<init>(r3, r1)
            r2.f291b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f292c = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f291b
            if (r0 == 0) goto L23
            r2.f291b = r3
            android.view.LayoutInflater r0 = r2.f292c
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f293d = r4
            androidx.appcompat.view.menu.e$a r3 = r2.j
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.f(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    public n g(ViewGroup viewGroup) {
        if (this.f294e == null) {
            this.f294e = (ExpandedMenuView) this.f292c.inflate(b.a.g.g_res_0x7f0c000d, viewGroup, false);
            if (this.j == null) {
                this.j = new a();
            }
            this.f294e.setAdapter((ListAdapter) this.j);
            this.f294e.setOnItemClickListener(this);
        }
        return this.f294e;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(Parcelable parcelable) {
        l((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean j(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(m.a aVar) {
        this.i = aVar;
    }

    public void l(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f294e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean m(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void n(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void o(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f294e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f293d.O(this.j.getItem(i), this, 0);
    }
}
