package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d extends BaseAdapter {
    private final int U3;

    /* renamed from: c */
    e f929c;

    /* renamed from: d */
    private int f930d = -1;

    /* renamed from: q */
    private boolean f931q;

    /* renamed from: x */
    private final boolean f932x;

    /* renamed from: y */
    private final LayoutInflater f933y;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f932x = z10;
        this.f933y = layoutInflater;
        this.f929c = eVar;
        this.U3 = i10;
        a();
    }

    void a() {
        g v10 = this.f929c.v();
        if (v10 != null) {
            ArrayList<g> z10 = this.f929c.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v10) {
                    this.f930d = i10;
                    return;
                }
            }
        }
        this.f930d = -1;
    }

    public e b() {
        return this.f929c;
    }

    /* renamed from: c */
    public g getItem(int i10) {
        ArrayList<g> z10 = this.f932x ? this.f929c.z() : this.f929c.E();
        int i11 = this.f930d;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z10.get(i10);
    }

    public void d(boolean z10) {
        this.f931q = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> z10 = this.f932x ? this.f929c.z() : this.f929c.E();
        int i10 = this.f930d;
        int size = z10.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f933y.inflate(this.U3, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f929c.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f931q) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
