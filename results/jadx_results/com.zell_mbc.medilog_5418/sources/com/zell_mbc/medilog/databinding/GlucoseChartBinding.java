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
public final class GlucoseChartBinding implements ViewBinding {
    public final XYPlot glucosePlot;
    private final LinearLayout rootView;

    private GlucoseChartBinding(LinearLayout rootView, XYPlot glucosePlot) {
        this.rootView = rootView;
        this.glucosePlot = glucosePlot;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlucoseChartBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static GlucoseChartBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.glucose_chart, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlucoseChartBinding bind(View rootView) {
        XYPlot xYPlot = (XYPlot) ViewBindings.findChildViewById(rootView, R.id.glucosePlot);
        if (xYPlot != null) {
            return new GlucoseChartBinding((LinearLayout) rootView, xYPlot);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.glucosePlot)));
    }
}
