package com.androidplot.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import com.androidplot.Plot;
import com.androidplot.Series;
import com.androidplot.ui.Formatter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class SeriesRenderer<PlotType extends Plot, SeriesType extends Series, SeriesFormatterType extends Formatter> {
    private PlotType plot;

    protected abstract void doDrawLegendIcon(Canvas canvas, RectF rectF, SeriesFormatterType seriesformattertype);

    protected abstract void onRender(Canvas canvas, RectF rectF, SeriesType seriestype, SeriesFormatterType seriesformattertype, RenderStack renderStack);

    public SeriesRenderer(PlotType plottype) {
        this.plot = plottype;
    }

    public PlotType getPlot() {
        return this.plot;
    }

    public void setPlot(PlotType plottype) {
        this.plot = plottype;
    }

    public SeriesFormatterType getFormatter(SeriesType seriestype) {
        return (SeriesFormatterType) this.plot.getFormatter(seriestype, getClass());
    }

    public void render(Canvas canvas, RectF rectF, SeriesBundle<SeriesType, SeriesFormatterType> seriesBundle, RenderStack renderStack) {
        onRender(canvas, rectF, seriesBundle.getSeries(), seriesBundle.getFormatter(), renderStack);
    }

    public void drawSeriesLegendIcon(Canvas canvas, RectF rectF, SeriesFormatterType seriesformattertype) {
        try {
            canvas.save();
            canvas.clipRect(rectF, Region.Op.INTERSECT);
            doDrawLegendIcon(canvas, rectF, seriesformattertype);
        } finally {
            canvas.restore();
        }
    }

    public List<SeriesBundle<SeriesType, ? extends SeriesFormatterType>> getSeriesAndFormatterList() {
        ArrayList arrayList = new ArrayList();
        for (SeriesBundle seriesBundle : getPlot().getRegistry().getSeriesAndFormatterList()) {
            if (seriesBundle.rendersWith(this)) {
                arrayList.add(seriesBundle);
            }
        }
        return arrayList;
    }

    public List<SeriesType> getSeriesList() {
        ArrayList arrayList = new ArrayList();
        for (SeriesBundle seriesBundle : getPlot().getRegistry().getSeriesAndFormatterList()) {
            if (seriesBundle.rendersWith(this)) {
                arrayList.add(seriesBundle.getSeries());
            }
        }
        return arrayList;
    }
}
