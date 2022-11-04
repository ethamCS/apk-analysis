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
public final class WeightChartBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final XYPlot weightPlot;

    private WeightChartBinding(LinearLayout rootView, XYPlot weightPlot) {
        this.rootView = rootView;
        this.weightPlot = weightPlot;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static WeightChartBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static WeightChartBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.weight_chart, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static WeightChartBinding bind(View rootView) {
        XYPlot xYPlot = (XYPlot) ViewBindings.findChildViewById(rootView, R.id.weightPlot);
        if (xYPlot != null) {
            return new WeightChartBinding((LinearLayout) rootView, xYPlot);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.weightPlot)));
    }
}
