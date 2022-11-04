package io.noties.markwon.ext.tables;

import android.content.Context;
import android.graphics.Paint;
import io.noties.markwon.utils.ColorUtils;
import io.noties.markwon.utils.Dip;
/* loaded from: classes2.dex */
public class TableTheme {
    protected static final int TABLE_BORDER_DEF_ALPHA = 75;
    protected static final int TABLE_ODD_ROW_DEF_ALPHA = 22;
    protected final int tableBorderColor;
    protected final int tableBorderWidth;
    protected final int tableCellPadding;
    protected final int tableEvenRowBackgroundColor;
    protected final int tableHeaderRowBackgroundColor;
    protected final int tableOddRowBackgroundColor;

    public static TableTheme create(Context context) {
        return buildWithDefaults(context).build();
    }

    public static Builder buildWithDefaults(Context context) {
        Dip create = Dip.create(context);
        return emptyBuilder().tableCellPadding(create.toPx(4)).tableBorderWidth(create.toPx(1));
    }

    public static Builder emptyBuilder() {
        return new Builder();
    }

    protected TableTheme(Builder builder) {
        this.tableCellPadding = builder.tableCellPadding;
        this.tableBorderColor = builder.tableBorderColor;
        this.tableBorderWidth = builder.tableBorderWidth;
        this.tableOddRowBackgroundColor = builder.tableOddRowBackgroundColor;
        this.tableEvenRowBackgroundColor = builder.tableEvenRowBackgroundColor;
        this.tableHeaderRowBackgroundColor = builder.tableHeaderRowBackgroundColor;
    }

    public Builder asBuilder() {
        return new Builder().tableCellPadding(this.tableCellPadding).tableBorderColor(this.tableBorderColor).tableBorderWidth(this.tableBorderWidth).tableOddRowBackgroundColor(this.tableOddRowBackgroundColor).tableEvenRowBackgroundColor(this.tableEvenRowBackgroundColor).tableHeaderRowBackgroundColor(this.tableHeaderRowBackgroundColor);
    }

    public int tableCellPadding() {
        return this.tableCellPadding;
    }

    public int tableBorderWidth(Paint paint) {
        int i = this.tableBorderWidth;
        return i == -1 ? (int) (paint.getStrokeWidth() + 0.5f) : i;
    }

    public void applyTableBorderStyle(Paint paint) {
        int i = this.tableBorderColor;
        if (i == 0) {
            i = ColorUtils.applyAlpha(paint.getColor(), 75);
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    public void applyTableOddRowStyle(Paint paint) {
        int i = this.tableOddRowBackgroundColor;
        if (i == 0) {
            i = ColorUtils.applyAlpha(paint.getColor(), 22);
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    public void applyTableEvenRowStyle(Paint paint) {
        paint.setColor(this.tableEvenRowBackgroundColor);
        paint.setStyle(Paint.Style.FILL);
    }

    public void applyTableHeaderRowStyle(Paint paint) {
        paint.setColor(this.tableHeaderRowBackgroundColor);
        paint.setStyle(Paint.Style.FILL);
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private int tableBorderColor;
        private int tableBorderWidth = -1;
        private int tableCellPadding;
        private int tableEvenRowBackgroundColor;
        private int tableHeaderRowBackgroundColor;
        private int tableOddRowBackgroundColor;

        public Builder tableCellPadding(int i) {
            this.tableCellPadding = i;
            return this;
        }

        public Builder tableBorderColor(int i) {
            this.tableBorderColor = i;
            return this;
        }

        public Builder tableBorderWidth(int i) {
            this.tableBorderWidth = i;
            return this;
        }

        public Builder tableOddRowBackgroundColor(int i) {
            this.tableOddRowBackgroundColor = i;
            return this;
        }

        public Builder tableEvenRowBackgroundColor(int i) {
            this.tableEvenRowBackgroundColor = i;
            return this;
        }

        public Builder tableHeaderRowBackgroundColor(int i) {
            this.tableHeaderRowBackgroundColor = i;
            return this;
        }

        public TableTheme build() {
            return new TableTheme(this);
        }
    }
}
