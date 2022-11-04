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
    protected Context f555b;

    /* renamed from: c */
    protected Context f556c;
    protected g d;
    protected LayoutInflater e;
    private m.a f;
    private int g;
    private int h;
    protected n i;
    private int j;

    public b(Context context, int i, int i2) {
        this.f555b = context;
        this.e = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    public View a(i iVar, View view, ViewGroup viewGroup) {
        n.a a2 = view instanceof n.a ? (n.a) view : a(viewGroup);
        a(iVar, a2);
        return (View) a2;
    }

    public m.a a() {
        return this.f;
    }

    public n.a a(ViewGroup viewGroup) {
        return (n.a) this.e.inflate(this.h, viewGroup, false);
    }

    public void a(int i) {
        this.j = i;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(Context context, g gVar) {
        this.f556c = context;
        LayoutInflater.from(context);
        this.d = gVar;
    }

    protected void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.f;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public abstract void a(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void a(m.a aVar) {
        this.f = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.d;
        int i = 0;
        if (gVar != null) {
            gVar.b();
            ArrayList<i> n = this.d.n();
            int size = n.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = n.get(i3);
                if (a(i2, iVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View a2 = a(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        a2.setPressed(false);
                        a2.jumpDrawablesToCurrentState();
                    }
                    if (a2 != childAt) {
                        a(a2, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!a(viewGroup, i)) {
                i++;
            }
        }
    }

    public abstract boolean a(int i, i iVar);

    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(r rVar) {
        m.a aVar = this.f;
        if (aVar != null) {
            return aVar.a(rVar);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int b() {
        return this.j;
    }

    public n b(ViewGroup viewGroup) {
        if (this.i == null) {
            n nVar = (n) this.e.inflate(this.g, viewGroup, false);
            this.i = nVar;
            nVar.a(this.d);
            a(true);
        }
        return this.i;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean b(g gVar, i iVar) {
        return false;
    }
}
