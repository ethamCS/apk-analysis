package com.androidplot.ui;

import android.graphics.RectF;
import java.util.Iterator;
/* loaded from: classes2.dex */
public abstract class TableModel {
    private TableOrder order;

    /* loaded from: classes2.dex */
    public enum Axis {
        ROW,
        COLUMN
    }

    /* loaded from: classes2.dex */
    public enum CellSizingMethod {
        FIXED,
        FILL
    }

    public abstract Iterator<RectF> getIterator(RectF rectF, int i);

    public TableModel(TableOrder tableOrder) {
        setOrder(tableOrder);
    }

    public TableOrder getOrder() {
        return this.order;
    }

    public void setOrder(TableOrder tableOrder) {
        this.order = tableOrder;
    }
}
