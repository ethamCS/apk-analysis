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
public final class BloodpressureChartBinding implements ViewBinding {
    public final XYPlot bloodPressurePlot;
    private final LinearLayout rootView;

    private BloodpressureChartBinding(LinearLayout rootView, XYPlot bloodPressurePlot) {
        this.rootView = rootView;
        this.bloodPressurePlot = bloodPressurePlot;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static BloodpressureChartBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BloodpressureChartBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.bloodpressure_chart, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BloodpressureChartBinding bind(View rootView) {
        XYPlot xYPlot = (XYPlot) ViewBindings.findChildViewById(rootView, R.id.bloodPressurePlot);
        if (xYPlot != null) {
            return new BloodpressureChartBinding((LinearLayout) rootView, xYPlot);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.bloodPressurePlot)));
    }
}
