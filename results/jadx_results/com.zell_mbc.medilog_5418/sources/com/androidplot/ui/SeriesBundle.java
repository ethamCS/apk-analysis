package com.androidplot.ui;

import com.androidplot.Series;
import com.androidplot.ui.Formatter;
/* loaded from: classes2.dex */
public class SeriesBundle<SeriesType extends Series, FormatterType extends Formatter> {
    private final FormatterType formatter;
    private final SeriesType series;

    public SeriesBundle(SeriesType seriestype, FormatterType formattertype) {
        this.series = seriestype;
        this.formatter = formattertype;
    }

    public SeriesType getSeries() {
        return this.series;
    }

    public FormatterType getFormatter() {
        return this.formatter;
    }

    public boolean rendersWith(SeriesRenderer seriesRenderer) {
        return getFormatter().getRendererClass() == seriesRenderer.getClass();
    }
}
