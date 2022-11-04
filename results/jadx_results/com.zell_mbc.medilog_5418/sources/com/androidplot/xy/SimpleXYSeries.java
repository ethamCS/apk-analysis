package com.androidplot.xy;

import android.graphics.Canvas;
import com.androidplot.Plot;
import com.androidplot.PlotListener;
import com.androidplot.xy.OrderedXYSeries;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes2.dex */
public class SimpleXYSeries implements EditableXYSeries, OrderedXYSeries, PlotListener {
    private ReentrantReadWriteLock lock;
    private volatile String title;
    private OrderedXYSeries.XOrder xOrder;
    private volatile LinkedList<Number> xVals;
    private volatile LinkedList<Number> yVals;

    /* loaded from: classes2.dex */
    public enum ArrayFormat {
        Y_VALS_ONLY,
        XY_VALS_INTERLEAVED
    }

    public SimpleXYSeries(String str) {
        this.xVals = new LinkedList<>();
        this.yVals = new LinkedList<>();
        this.title = null;
        this.lock = new ReentrantReadWriteLock(true);
        this.xOrder = OrderedXYSeries.XOrder.NONE;
        this.title = str;
    }

    public SimpleXYSeries(ArrayFormat arrayFormat, String str, Number... numberArr) {
        this(asNumberList(numberArr), arrayFormat, str);
    }

    @Override // com.androidplot.xy.OrderedXYSeries
    public OrderedXYSeries.XOrder getXOrder() {
        return this.xOrder;
    }

    public void setXOrder(OrderedXYSeries.XOrder xOrder) {
        this.xOrder = xOrder;
    }

    @Override // com.androidplot.PlotListener
    public void onBeforeDraw(Plot plot, Canvas canvas) {
        this.lock.readLock().lock();
    }

    @Override // com.androidplot.PlotListener
    public void onAfterDraw(Plot plot, Canvas canvas) {
        this.lock.readLock().unlock();
    }

    protected static List<Number> asNumberList(Number... numberArr) {
        ArrayList arrayList = new ArrayList(numberArr.length);
        Collections.addAll(arrayList, numberArr);
        return arrayList;
    }

    public SimpleXYSeries(List<? extends Number> list, ArrayFormat arrayFormat, String str) {
        this(str);
        setModel(list, arrayFormat);
    }

    public SimpleXYSeries(List<? extends Number> list, List<? extends Number> list2, String str) {
        this(str);
        if (list == null || list2 == null) {
            throw new IllegalArgumentException("Neither the xVals nor the yVals parameters may be null.");
        }
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("xVals and yVals List parameters must be of the same size.");
        }
        this.xVals.addAll(list);
        this.yVals.addAll(list2);
    }

    public void useImplicitXVals() {
        this.lock.writeLock().lock();
        try {
            this.xVals = null;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void setModel(List<? extends Number> list, ArrayFormat arrayFormat) {
        this.lock.writeLock().lock();
        try {
            this.xVals.clear();
            this.yVals.clear();
            if (list != null && list.size() != 0) {
                int i = AnonymousClass1.$SwitchMap$com$androidplot$xy$SimpleXYSeries$ArrayFormat[arrayFormat.ordinal()];
                int i2 = 0;
                if (i == 1) {
                    this.yVals.addAll(list);
                    while (i2 < this.yVals.size()) {
                        this.xVals.add(Integer.valueOf(i2));
                        i2++;
                    }
                } else if (i == 2) {
                    if (this.xVals == null) {
                        this.xVals = new LinkedList<>();
                    }
                    if (list.size() % 2 != 0) {
                        throw new IndexOutOfBoundsException("Cannot auto-generate series from odd-sized xy List.");
                    }
                    int size = list.size() / 2;
                    int i3 = 0;
                    while (i2 < size) {
                        this.xVals.add(list.get(i3));
                        this.yVals.add(list.get(i3 + 1));
                        i2++;
                        i3 += 2;
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected enum value: " + arrayFormat);
                }
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    /* renamed from: com.androidplot.xy.SimpleXYSeries$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$SimpleXYSeries$ArrayFormat;

        static {
            int[] iArr = new int[ArrayFormat.values().length];
            $SwitchMap$com$androidplot$xy$SimpleXYSeries$ArrayFormat = iArr;
            try {
                iArr[ArrayFormat.Y_VALS_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$SimpleXYSeries$ArrayFormat[ArrayFormat.XY_VALS_INTERLEAVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.androidplot.xy.EditableXYSeries
    public void setX(Number number, int i) {
        this.lock.writeLock().lock();
        try {
            this.xVals.set(i, number);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // com.androidplot.xy.EditableXYSeries
    public void setY(Number number, int i) {
        this.lock.writeLock().lock();
        try {
            this.yVals.set(i, number);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // com.androidplot.xy.EditableXYSeries
    public void resize(int i) {
        try {
            this.lock.writeLock().lock();
            if (this.xVals.size() < i) {
                for (int size = this.xVals.size(); size < i; size++) {
                    this.xVals.add(null);
                    this.yVals.add(null);
                }
            } else if (this.xVals.size() > i) {
                for (int size2 = this.xVals.size(); size2 > i; size2--) {
                    this.xVals.removeLast();
                    this.yVals.removeLast();
                }
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void setXY(Number number, Number number2, int i) {
        this.lock.writeLock().lock();
        try {
            this.yVals.set(i, number2);
            this.xVals.set(i, number);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void addFirst(Number number, Number number2) {
        this.lock.writeLock().lock();
        try {
            if (this.xVals != null) {
                this.xVals.addFirst(number);
            }
            this.yVals.addFirst(number2);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public XYCoords removeFirst() {
        this.lock.writeLock().lock();
        try {
            if (size() <= 0) {
                throw new NoSuchElementException();
            }
            return new XYCoords(this.xVals != null ? this.xVals.removeFirst() : 0, this.yVals.removeFirst());
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void addLast(Number number, Number number2) {
        this.lock.writeLock().lock();
        try {
            if (this.xVals != null) {
                this.xVals.addLast(number);
            }
            this.yVals.addLast(number2);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public XYCoords removeLast() {
        this.lock.writeLock().lock();
        try {
            if (size() <= 0) {
                throw new NoSuchElementException();
            }
            return new XYCoords(this.xVals != null ? this.xVals.removeLast() : Integer.valueOf(this.yVals.size() - 1), this.yVals.removeLast());
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // com.androidplot.Series
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.lock.writeLock().lock();
        try {
            this.title = str;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // com.androidplot.xy.XYSeries
    public int size() {
        if (this.yVals != null) {
            return this.yVals.size();
        }
        return 0;
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getX(int i) {
        return this.xVals != null ? this.xVals.get(i) : Integer.valueOf(i);
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getY(int i) {
        return this.yVals.get(i);
    }

    public LinkedList<Number> getxVals() {
        return this.xVals;
    }

    public LinkedList<Number> getyVals() {
        return this.yVals;
    }

    public void clear() {
        this.lock.writeLock().lock();
        try {
            if (this.xVals != null) {
                this.xVals.clear();
            }
            this.yVals.clear();
        } finally {
            this.lock.writeLock().unlock();
        }
    }
}
