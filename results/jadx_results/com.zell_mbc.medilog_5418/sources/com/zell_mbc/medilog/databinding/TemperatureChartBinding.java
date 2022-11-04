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
public final class TemperatureChartBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final XYPlot temperaturePlot;

    private TemperatureChartBinding(LinearLayout rootView, XYPlot temperaturePlot) {
        this.rootView = rootView;
        this.temperaturePlot = temperaturePlot;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static TemperatureChartBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static TemperatureChartBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.temperature_chart, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static TemperatureChartBinding bind(View rootView) {
        XYPlot xYPlot = (XYPlot) ViewBindings.findChildViewById(rootView, R.id.temperaturePlot);
        if (xYPlot != null) {
            return new TemperatureChartBinding((LinearLayout) rootView, xYPlot);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.temperaturePlot)));
    }
}
