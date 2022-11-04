package com.androidplot.xy;

import com.androidplot.ui.widget.LegendItem;
/* loaded from: classes2.dex */
public class XYLegendItem implements LegendItem {
    public final Object item;
    private final String text;
    public final Type type;

    /* loaded from: classes2.dex */
    public enum Type {
        SERIES,
        REGION
    }

    public XYLegendItem(Type type, Object obj, String str) {
        this.type = type;
        this.item = obj;
        this.text = str;
    }

    @Override // com.androidplot.ui.widget.LegendItem
    public String getTitle() {
        return this.text;
    }
}
