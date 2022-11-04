package com.androidplot.ui;

import android.content.Context;
import com.androidplot.Plot;
import com.halfhp.fig.Fig;
import com.halfhp.fig.FigException;
/* loaded from: classes2.dex */
public abstract class Formatter<PlotType extends Plot> {
    private boolean isLegendIconEnabled = true;

    protected abstract SeriesRenderer doGetRendererInstance(PlotType plottype);

    public abstract Class<? extends SeriesRenderer> getRendererClass();

    public Formatter() {
    }

    public Formatter(Context context, int i) {
        configure(context, i);
    }

    public void configure(Context context, int i) {
        try {
            Fig.configure(context, this, i);
        } catch (FigException e) {
            throw new RuntimeException(e);
        }
    }

    public <T extends SeriesRenderer> T getRendererInstance(PlotType plottype) {
        return (T) doGetRendererInstance(plottype);
    }

    public boolean isLegendIconEnabled() {
        return this.isLegendIconEnabled;
    }

    public void setLegendIconEnabled(boolean z) {
        this.isLegendIconEnabled = z;
    }
}
