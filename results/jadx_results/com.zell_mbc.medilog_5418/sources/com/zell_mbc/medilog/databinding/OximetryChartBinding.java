package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.androidplot.xy.XYPlot;
import com.zell_mbc.medilog.R;
/* loaded from: classes2.dex */
public final class OximetryChartBinding implements ViewBinding {
    public final XYPlot oximetryPlot;
    private final LinearLayout rootView;

    private OximetryChartBinding(LinearLayout rootView, XYPlot oximetryPlot) {
        this.rootView = rootView;
        this.oximetryPlot = oximetryPlot;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static OximetryChartBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static OximetryChartBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.oximetry_chart, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static OximetryChartBinding bind(View rootView) {
        XYPlot xYPlot = (XYPlot) ViewBindings.findChildViewById(rootView, R.id.oximetryPlot);
        if (xYPlot != null) {
            return new OximetryChartBinding((LinearLayout) rootView, xYPlot);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.oximetryPlot)));
    }
}
