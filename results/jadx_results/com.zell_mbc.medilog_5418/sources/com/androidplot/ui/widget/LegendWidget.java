package com.androidplot.ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.Size;
import com.androidplot.ui.TableModel;
import com.androidplot.ui.widget.LegendItem;
import com.androidplot.util.FontUtils;
import com.androidplot.util.PixelUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class LegendWidget<ItemT extends LegendItem> extends Widget {
    private static final float DEFAULT_TEXT_SIZE_DP = 20.0f;
    private boolean drawIconBackgroundEnabled = true;
    private boolean drawIconBorderEnabled = true;
    private Paint iconBackgroundPaint;
    private Paint iconBorderPaint;
    private Size iconSize;
    private Comparator<ItemT> legendItemComparator;
    private TableModel tableModel;
    private Paint textPaint;

    protected abstract void drawIcon(Canvas canvas, RectF rectF, ItemT itemt);

    protected abstract List<ItemT> getLegendItems();

    public LegendWidget(TableModel tableModel, LayoutManager layoutManager, Size size, Size size2) {
        super(layoutManager, size);
        Paint paint = new Paint();
        this.textPaint = paint;
        paint.setColor(-3355444);
        this.textPaint.setTextSize(PixelUtils.spToPix(20.0f));
        this.textPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.iconBackgroundPaint = paint2;
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint3 = new Paint();
        this.iconBorderPaint = paint3;
        paint3.setColor(0);
        this.iconBorderPaint.setStyle(Paint.Style.STROKE);
        setTableModel(tableModel);
        this.iconSize = size2;
    }

    @Override // com.androidplot.ui.widget.Widget
    protected void doOnDraw(Canvas canvas, RectF rectF) {
        List<ItemT> legendItems = getLegendItems();
        Comparator<ItemT> comparator = this.legendItemComparator;
        if (comparator != null) {
            Collections.sort(legendItems, comparator);
        }
        Iterator<RectF> iterator = this.tableModel.getIterator(rectF, legendItems.size());
        for (ItemT itemt : legendItems) {
            RectF next = iterator.next();
            RectF iconRect = getIconRect(next);
            beginDrawingCell(canvas, iconRect);
            drawItem(canvas, iconRect, itemt);
            finishDrawingCell(canvas, next, iconRect, itemt);
        }
    }

    protected void drawItem(Canvas canvas, RectF rectF, ItemT itemt) {
        drawIcon(canvas, rectF, itemt);
    }

    private RectF getIconRect(RectF rectF) {
        float height = rectF.top + (rectF.height() / 2.0f);
        RectF rectF2 = this.iconSize.getRectF(rectF);
        rectF2.offsetTo(rectF.left + 1.0f, height - (rectF2.height() / 2.0f));
        return rectF2;
    }

    protected void beginDrawingCell(Canvas canvas, RectF rectF) {
        Paint paint;
        if (!this.drawIconBackgroundEnabled || (paint = this.iconBackgroundPaint) == null) {
            return;
        }
        canvas.drawRect(rectF, paint);
    }

    protected void finishDrawingCell(Canvas canvas, RectF rectF, RectF rectF2, LegendItem legendItem) {
        Paint paint;
        if (this.drawIconBorderEnabled && (paint = this.iconBorderPaint) != null) {
            canvas.drawRect(rectF2, paint);
        }
        float rectCenterY = getRectCenterY(rectF) + (FontUtils.getFontHeight(this.textPaint) / 2.0f);
        if (this.textPaint.getTextAlign().equals(Paint.Align.RIGHT)) {
            canvas.drawText(legendItem.getTitle(), rectF2.left - 2.0f, rectCenterY, this.textPaint);
        } else {
            canvas.drawText(legendItem.getTitle(), rectF2.right + 2.0f, rectCenterY, this.textPaint);
        }
    }

    protected static float getRectCenterY(RectF rectF) {
        return rectF.top + (rectF.height() / 2.0f);
    }

    public synchronized void setTableModel(TableModel tableModel) {
        this.tableModel = tableModel;
    }

    public Paint getTextPaint() {
        return this.textPaint;
    }

    public void setTextPaint(Paint paint) {
        this.textPaint = paint;
    }

    public boolean isDrawIconBackgroundEnabled() {
        return this.drawIconBackgroundEnabled;
    }

    public void setDrawIconBackgroundEnabled(boolean z) {
        this.drawIconBackgroundEnabled = z;
    }

    public boolean isDrawIconBorderEnabled() {
        return this.drawIconBorderEnabled;
    }

    public void setDrawIconBorderEnabled(boolean z) {
        this.drawIconBorderEnabled = z;
    }

    public Size getIconSize() {
        return this.iconSize;
    }

    public void setIconSize(Size size) {
        this.iconSize = size;
    }

    public Comparator<ItemT> getLegendItemComparator() {
        return this.legendItemComparator;
    }

    public void setLegendItemComparator(Comparator<ItemT> comparator) {
        this.legendItemComparator = comparator;
    }
}
