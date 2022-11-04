package com.androidplot.ui;

import android.graphics.RectF;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class FixedTableModel extends TableModel {
    private float cellHeight;
    private float cellWidth;

    public FixedTableModel(float f, float f2, TableOrder tableOrder) {
        super(tableOrder);
        setCellWidth(f);
        setCellHeight(f2);
    }

    @Override // com.androidplot.ui.TableModel
    public Iterator<RectF> getIterator(RectF rectF, int i) {
        return new FixedTableModelIterator(this, rectF, i);
    }

    public float getCellWidth() {
        return this.cellWidth;
    }

    public void setCellWidth(float f) {
        this.cellWidth = f;
    }

    public float getCellHeight() {
        return this.cellHeight;
    }

    public void setCellHeight(float f) {
        this.cellHeight = f;
    }

    /* loaded from: classes2.dex */
    private class FixedTableModelIterator implements Iterator<RectF> {
        private int lastElement;
        private RectF lastRect;
        private FixedTableModel model;
        private int numElements;
        private RectF tableRect;

        protected FixedTableModelIterator(FixedTableModel fixedTableModel, RectF rectF, int i) {
            FixedTableModel.this = r4;
            this.model = fixedTableModel;
            this.tableRect = rectF;
            this.numElements = i;
            this.lastRect = new RectF(rectF.left, rectF.top, rectF.left + fixedTableModel.getCellWidth(), rectF.top + fixedTableModel.getCellHeight());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.lastElement < this.numElements && (!isColumnFinished() || !isRowFinished());
        }

        private boolean isColumnFinished() {
            return this.lastRect.bottom + this.model.getCellHeight() > this.tableRect.height();
        }

        private boolean isRowFinished() {
            return this.lastRect.right + this.model.getCellWidth() > this.tableRect.width();
        }

        @Override // java.util.Iterator
        public RectF next() {
            try {
                int i = this.lastElement;
                if (i == 0) {
                    RectF rectF = this.lastRect;
                    this.lastElement = i + 1;
                    return rectF;
                } else if (i >= this.numElements) {
                    throw new IndexOutOfBoundsException();
                } else {
                    int i2 = AnonymousClass1.$SwitchMap$com$androidplot$ui$TableOrder[this.model.getOrder().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            if (isRowFinished()) {
                                moveDownAndBack();
                            } else {
                                moveOver();
                            }
                        } else {
                            throw new UnsupportedOperationException();
                        }
                    } else if (isColumnFinished()) {
                        moveOverAndUp();
                    } else {
                        moveDown();
                    }
                    return this.lastRect;
                }
            } finally {
                this.lastElement++;
            }
        }

        private void moveDownAndBack() {
            this.lastRect.offsetTo(this.tableRect.left, this.lastRect.bottom);
        }

        private void moveOverAndUp() {
            RectF rectF = this.lastRect;
            rectF.offsetTo(rectF.right, this.tableRect.top);
        }

        private void moveOver() {
            RectF rectF = this.lastRect;
            rectF.offsetTo(rectF.right, this.lastRect.top);
        }

        private void moveDown() {
            RectF rectF = this.lastRect;
            rectF.offsetTo(rectF.left, this.lastRect.bottom);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.androidplot.ui.FixedTableModel$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$TableOrder;

        static {
            int[] iArr = new int[TableOrder.values().length];
            $SwitchMap$com$androidplot$ui$TableOrder = iArr;
            try {
                iArr[TableOrder.ROW_MAJOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$TableOrder[TableOrder.COLUMN_MAJOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
