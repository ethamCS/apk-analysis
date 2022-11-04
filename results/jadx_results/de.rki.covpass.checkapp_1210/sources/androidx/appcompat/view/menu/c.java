package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {
    int U3;
    int V3;
    private j.a W3;
    a X3;

    /* renamed from: c */
    Context f922c;

    /* renamed from: d */
    LayoutInflater f923d;

    /* renamed from: q */
    e f924q;

    /* renamed from: x */
    ExpandedMenuView f925x;

    /* renamed from: y */
    int f926y;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: c */
        private int f927c = -1;

        public a() {
            c.this = r1;
            a();
        }

        void a() {
            g v10 = c.this.f924q.v();
            if (v10 != null) {
                ArrayList<g> z10 = c.this.f924q.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (z10.get(i10) == v10) {
                        this.f927c = i10;
                        return;
                    }
                }
            }
            this.f927c = -1;
        }

        /* renamed from: b */
        public g getItem(int i10) {
            ArrayList<g> z10 = c.this.f924q.z();
            int i11 = i10 + c.this.f926y;
            int i12 = this.f927c;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return z10.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f924q.z().size() - c.this.f926y;
            return this.f927c < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f923d.inflate(cVar.V3, viewGroup, false);
            }
            ((k.a) view).e(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i10, int i11) {
        this.V3 = i10;
        this.U3 = i11;
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f922c = context;
        this.f923d = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.X3 == null) {
            this.X3 = new a();
        }
        return this.X3;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.W3;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public k c(ViewGroup viewGroup) {
        if (this.f925x == null) {
            this.f925x = (ExpandedMenuView) this.f923d.inflate(e.g.g_res_0x7f0c000d, viewGroup, false);
            if (this.X3 == null) {
                this.X3 = new a();
            }
            this.f925x.setAdapter((ListAdapter) this.X3);
            this.f925x.setOnItemClickListener(this);
        }
        return this.f925x;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r3, androidx.appcompat.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.U3
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.U3
            r0.<init>(r3, r1)
            r2.f922c = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f923d = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f922c
            if (r0 == 0) goto L23
            r2.f922c = r3
            android.view.LayoutInflater r0 = r2.f923d
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f924q = r4
            androidx.appcompat.view.menu.c$a r3 = r2.X3
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.c.d(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.W3;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        a aVar = this.X3;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.W3 = aVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f924q.M(this.X3.getItem(i10), this, 0);
    }
}
