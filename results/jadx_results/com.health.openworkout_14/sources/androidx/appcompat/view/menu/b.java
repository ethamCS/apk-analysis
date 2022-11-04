package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: b */
    protected Context f265b;

    /* renamed from: c */
    protected Context f266c;

    /* renamed from: d */
    protected g f267d;

    /* renamed from: e */
    protected LayoutInflater f268e;

    /* renamed from: f */
    private m.a f269f;

    /* renamed from: g */
    private int f270g;

    /* renamed from: h */
    private int f271h;
    protected n i;
    private int j;

    public b(Context context, int i, int i2) {
        this.f265b = context;
        this.f268e = LayoutInflater.from(context);
        this.f270g = i;
        this.f271h = i2;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.f269f;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    protected void b(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.m
    public int c() {
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(Context context, g gVar) {
        this.f266c = context;
        LayoutInflater.from(context);
        this.f267d = gVar;
    }

    public abstract void g(i iVar, n.a aVar);

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
        this.f269f = aVar;
    }

    public n.a l(ViewGroup viewGroup) {
        return (n.a) this.f268e.inflate(this.f271h, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean m(r rVar) {
        m.a aVar = this.f269f;
        r rVar2 = rVar;
        if (aVar != null) {
            if (rVar == null) {
                rVar2 = this.f267d;
            }
            return aVar.b(rVar2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void n(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f267d;
        int i = 0;
        if (gVar != null) {
            gVar.t();
            ArrayList<i> G = this.f267d.G();
            int size = G.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = G.get(i3);
                if (t(i2, iVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View q = q(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        q.setPressed(false);
                        q.jumpDrawablesToCurrentState();
                    }
                    if (q != childAt) {
                        b(q, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!o(viewGroup, i)) {
                i++;
            }
        }
    }

    public boolean o(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public m.a p() {
        return this.f269f;
    }

    public View q(i iVar, View view, ViewGroup viewGroup) {
        n.a l = view instanceof n.a ? (n.a) view : l(viewGroup);
        g(iVar, l);
        return (View) l;
    }

    public n r(ViewGroup viewGroup) {
        if (this.i == null) {
            n nVar = (n) this.f268e.inflate(this.f270g, viewGroup, false);
            this.i = nVar;
            nVar.b(this.f267d);
            n(true);
        }
        return this.i;
    }

    public void s(int i) {
        this.j = i;
    }

    public abstract boolean t(int i, i iVar);
}
