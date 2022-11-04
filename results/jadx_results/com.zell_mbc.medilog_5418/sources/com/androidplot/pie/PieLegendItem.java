package com.androidplot.pie;

import com.androidplot.ui.widget.LegendItem;
/* loaded from: classes2.dex */
public class PieLegendItem implements LegendItem {
    public SegmentFormatter formatter;
    public Segment segment;

    public PieLegendItem(Segment segment, SegmentFormatter segmentFormatter) {
        this.segment = segment;
        this.formatter = segmentFormatter;
    }

    @Override // com.androidplot.ui.widget.LegendItem
    public String getTitle() {
        return this.segment.getTitle();
    }
}
