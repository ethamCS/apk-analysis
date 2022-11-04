package org.odk.collect.android.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;
import org.odk.collect.android.logic.HierarchyElement;
import org.odk.collect.android.views.HierarchyElementView;
/* loaded from: classes.dex */
public class HierarchyListAdapter extends BaseAdapter {
    private Context mContext;
    private List<HierarchyElement> mItems = new ArrayList();

    public HierarchyListAdapter(Context context) {
        this.mContext = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mItems.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int position) {
        return this.mItems.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        HierarchyElementView hev;
        if (convertView == null) {
            hev = new HierarchyElementView(this.mContext, this.mItems.get(position));
        } else {
            hev = (HierarchyElementView) convertView;
            hev.setPrimaryText(this.mItems.get(position).getPrimaryText());
            hev.setSecondaryText(this.mItems.get(position).getSecondaryText());
            hev.setIcon(this.mItems.get(position).getIcon());
            hev.setColor(this.mItems.get(position).getColor());
        }
        if (this.mItems.get(position).getSecondaryText() == null || this.mItems.get(position).getSecondaryText().equals("")) {
            hev.showSecondary(false);
        } else {
            hev.showSecondary(true);
        }
        return hev;
    }

    public void setListItems(List<HierarchyElement> it) {
        this.mItems = it;
    }
}
