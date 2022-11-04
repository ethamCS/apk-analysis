package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class a implements j {
    private j.a U3;
    private int V3;
    private int W3;
    protected k X3;
    private int Y3;

    /* renamed from: c */
    protected Context f886c;

    /* renamed from: d */
    protected Context f887d;

    /* renamed from: q */
    protected e f888q;

    /* renamed from: x */
    protected LayoutInflater f889x;

    /* renamed from: y */
    protected LayoutInflater f890y;

    public a(Context context, int i10, int i11) {
        this.f886c = context;
        this.f889x = LayoutInflater.from(context);
        this.V3 = i10;
        this.W3 = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.X3).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.U3;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public abstract void c(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void d(Context context, e eVar) {
        this.f887d = context;
        this.f890y = LayoutInflater.from(context);
        this.f888q = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        j.a aVar = this.U3;
        m mVar2 = mVar;
        if (aVar != null) {
            if (mVar == null) {
                mVar2 = this.f888q;
            }
            return aVar.c(mVar2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.X3;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f888q;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> E = this.f888q.E();
            int size = E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = E.get(i12);
                if (q(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n10 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n10.setPressed(false);
                        n10.jumpDrawablesToCurrentState();
                    }
                    if (n10 != childAt) {
                        a(n10, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    public k.a h(ViewGroup viewGroup) {
        return (k.a) this.f889x.inflate(this.W3, viewGroup, false);
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
        this.U3 = aVar;
    }

    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.U3;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a h10 = view instanceof k.a ? (k.a) view : h(viewGroup);
        c(gVar, h10);
        return (View) h10;
    }

    public k o(ViewGroup viewGroup) {
        if (this.X3 == null) {
            k kVar = (k) this.f889x.inflate(this.V3, viewGroup, false);
            this.X3 = kVar;
            kVar.b(this.f888q);
            f(true);
        }
        return this.X3;
    }

    public void p(int i10) {
        this.Y3 = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
