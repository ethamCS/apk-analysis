package com.androidplot.ui;

import com.androidplot.Series;
import com.androidplot.ui.RenderBundle;
import com.androidplot.xy.XYSeriesFormatter;
/* loaded from: classes2.dex */
public abstract class RenderBundle<RenderBundleType extends RenderBundle, SeriesType extends Series, SeriesFormatterType extends XYSeriesFormatter> {
    private SeriesFormatterType formatter;
    private Series series;

    public RenderBundle(SeriesType seriestype, SeriesFormatterType seriesformattertype) {
        this.formatter = seriesformattertype;
        this.series = seriestype;
    }

    public Series getSeries() {
        return this.series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public SeriesFormatterType getFormatter() {
        return this.formatter;
    }

    public void setFormatter(SeriesFormatterType seriesformattertype) {
        this.formatter = seriesformattertype;
    }
}
