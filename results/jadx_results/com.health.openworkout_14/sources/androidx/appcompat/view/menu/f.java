package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: b */
    g f300b;

    /* renamed from: c */
    private int f301c = -1;

    /* renamed from: d */
    private boolean f302d;

    /* renamed from: e */
    private final boolean f303e;

    /* renamed from: f */
    private final LayoutInflater f304f;

    /* renamed from: g */
    private final int f305g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f303e = z;
        this.f304f = layoutInflater;
        this.f300b = gVar;
        this.f305g = i;
        a();
    }

    void a() {
        i x = this.f300b.x();
        if (x != null) {
            ArrayList<i> B = this.f300b.B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (B.get(i) == x) {
                    this.f301c = i;
                    return;
                }
            }
        }
        this.f301c = -1;
    }

    public g b() {
        return this.f300b;
    }

    /* renamed from: c */
    public i getItem(int i) {
        ArrayList<i> B = this.f303e ? this.f300b.B() : this.f300b.G();
        int i2 = this.f301c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return B.get(i);
    }

    public void d(boolean z) {
        this.f302d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> B = this.f303e ? this.f300b.B() : this.f300b.G();
        int i = this.f301c;
        int size = B.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f304f.inflate(this.f305g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f300b.H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f302d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
