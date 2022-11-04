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
    g f573b;

    /* renamed from: c */
    private int f574c = -1;
    private boolean d;
    private final boolean e;
    private final LayoutInflater f;
    private final int g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.e = z;
        this.f = layoutInflater;
        this.f573b = gVar;
        this.g = i;
        a();
    }

    void a() {
        i f = this.f573b.f();
        if (f != null) {
            ArrayList<i> j = this.f573b.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == f) {
                    this.f574c = i;
                    return;
                }
            }
        }
        this.f574c = -1;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public g b() {
        return this.f573b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> j = this.e ? this.f573b.j() : this.f573b.n();
        int i = this.f574c;
        int size = j.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public i getItem(int i) {
        ArrayList<i> j = this.e ? this.f573b.j() : this.f573b.n();
        int i2 = this.f574c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return j.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(this.g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f573b.o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
