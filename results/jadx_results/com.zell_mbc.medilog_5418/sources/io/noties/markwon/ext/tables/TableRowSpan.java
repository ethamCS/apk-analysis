package io.noties.markwon.ext.tables;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import io.noties.markwon.core.spans.TextLayoutSpan;
import io.noties.markwon.image.AsyncDrawable;
import io.noties.markwon.image.AsyncDrawableSpan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class TableRowSpan extends ReplacementSpan {
    public static final int ALIGN_CENTER = 1;
    public static final int ALIGN_LEFT = 0;
    public static final int ALIGN_RIGHT = 2;
    private final List<Cell> cells;
    private final boolean header;
    private int height;
    private Invalidator invalidator;
    private final List<Layout> layouts;
    private final boolean odd;
    private final TableTheme theme;
    private int width;
    private final Rect rect = new Rect();
    private final Paint paint = new Paint(1);
    private final TextPaint textPaint = new TextPaint();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Alignment {
    }

    /* loaded from: classes2.dex */
    public interface Invalidator {
        void invalidate();
    }

    /* loaded from: classes2.dex */
    public static class Cell {
        final int alignment;
        final CharSequence text;

        public Cell(int i, CharSequence charSequence) {
            this.alignment = i;
            this.text = charSequence;
        }

        public int alignment() {
            return this.alignment;
        }

        public CharSequence text() {
            return this.text;
        }

        public String toString() {
            return "Cell{alignment=" + this.alignment + ", text=" + ((Object) this.text) + '}';
        }
    }

    public TableRowSpan(TableTheme tableTheme, List<Cell> list, boolean z, boolean z2) {
        this.theme = tableTheme;
        this.cells = list;
        this.layouts = new ArrayList(list.size());
        this.header = z;
        this.odd = z2;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.layouts.size() > 0 && fontMetricsInt != null) {
            int i3 = 0;
            for (Layout layout : this.layouts) {
                int height = layout.getHeight();
                if (height > i3) {
                    i3 = height;
                }
            }
            this.height = i3;
            fontMetricsInt.ascent = -(i3 + (this.theme.tableCellPadding() * 2));
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.width;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0164 A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #0 {all -> 0x0177, blocks: (B:48:0x011c, B:51:0x0123, B:52:0x012a, B:53:0x0131, B:55:0x013c, B:57:0x0152, B:59:0x0164), top: B:71:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0169 A[SYNTHETIC] */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r18, java.lang.CharSequence r19, int r20, int r21, float r22, int r23, int r24, int r25, android.graphics.Paint r26) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.ext.tables.TableRowSpan.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    private boolean recreateLayouts(int i) {
        return this.width != i;
    }

    private void makeNewLayouts() {
        this.textPaint.setFakeBoldText(this.header);
        int cellWidth = cellWidth(this.cells.size()) - (this.theme.tableCellPadding() * 2);
        this.layouts.clear();
        int size = this.cells.size();
        for (int i = 0; i < size; i++) {
            makeLayout(i, cellWidth, this.cells.get(i));
        }
    }

    public void makeLayout(final int i, final int i2, final Cell cell) {
        Spannable spannable;
        Runnable runnable = new Runnable() { // from class: io.noties.markwon.ext.tables.TableRowSpan.1
            @Override // java.lang.Runnable
            public void run() {
                Invalidator invalidator = TableRowSpan.this.invalidator;
                if (invalidator != null) {
                    TableRowSpan.this.layouts.remove(i);
                    TableRowSpan.this.makeLayout(i, i2, cell);
                    invalidator.invalidate();
                }
            }
        };
        if (cell.text instanceof Spannable) {
            spannable = (Spannable) cell.text;
        } else {
            spannable = new SpannableString(cell.text);
        }
        StaticLayout staticLayout = new StaticLayout(spannable, this.textPaint, i2, alignment(cell.alignment), 1.0f, 0.0f, false);
        TextLayoutSpan.applyTo(spannable, staticLayout);
        scheduleAsyncDrawables(spannable, runnable);
        this.layouts.add(i, staticLayout);
    }

    private void scheduleAsyncDrawables(Spannable spannable, final Runnable runnable) {
        AsyncDrawableSpan[] asyncDrawableSpanArr = (AsyncDrawableSpan[]) spannable.getSpans(0, spannable.length(), AsyncDrawableSpan.class);
        if (asyncDrawableSpanArr == null || asyncDrawableSpanArr.length <= 0) {
            return;
        }
        for (AsyncDrawableSpan asyncDrawableSpan : asyncDrawableSpanArr) {
            AsyncDrawable drawable = asyncDrawableSpan.getDrawable();
            if (!drawable.isAttached()) {
                drawable.setCallback2(new CallbackAdapter() { // from class: io.noties.markwon.ext.tables.TableRowSpan.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                        TableRowSpan.this = this;
                    }

                    @Override // io.noties.markwon.ext.tables.TableRowSpan.CallbackAdapter, android.graphics.drawable.Drawable.Callback
                    public void invalidateDrawable(Drawable drawable2) {
                        runnable.run();
                    }
                });
            }
        }
    }

    public Layout findLayoutForHorizontalOffset(int i) {
        int size = this.layouts.size();
        int cellWidth = i / cellWidth(size);
        if (cellWidth >= size) {
            return null;
        }
        return this.layouts.get(cellWidth);
    }

    public int cellWidth() {
        return cellWidth(this.layouts.size());
    }

    protected int cellWidth(int i) {
        return (int) (((this.width * 1.0f) / i) + 0.5f);
    }

    private static Layout.Alignment alignment(int i) {
        if (i != 1) {
            if (i == 2) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    public void invalidator(Invalidator invalidator) {
        this.invalidator = invalidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class CallbackAdapter implements Drawable.Callback {
        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        private CallbackAdapter() {
        }
    }
}
