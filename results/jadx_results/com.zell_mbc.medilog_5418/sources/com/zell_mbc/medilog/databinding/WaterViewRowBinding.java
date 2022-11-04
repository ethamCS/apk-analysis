package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zell_mbc.medilog.R;
/* loaded from: classes2.dex */
public final class WaterViewRowBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvCommentItem;
    public final TextView tvDateItem;
    public final TextView tvWaterItem;

    private WaterViewRowBinding(LinearLayout rootView, TextView tvCommentItem, TextView tvDateItem, TextView tvWaterItem) {
        this.rootView = rootView;
        this.tvCommentItem = tvCommentItem;
        this.tvDateItem = tvDateItem;
        this.tvWaterItem = tvWaterItem;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static WaterViewRowBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static WaterViewRowBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.water_view_row, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static WaterViewRowBinding bind(View rootView) {
        int i = R.id.tvCommentItem;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvCommentItem);
        if (textView != null) {
            i = R.id.tvDateItem;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvDateItem);
            if (textView2 != null) {
                i = R.id.tvWaterItem;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvWaterItem);
                if (textView3 != null) {
                    return new WaterViewRowBinding((LinearLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
