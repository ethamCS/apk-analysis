package com.androidplot.xy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class CandlestickSeries {
    private SimpleXYSeries closeSeries;
    private SimpleXYSeries highSeries;
    private SimpleXYSeries lowSeries;
    private SimpleXYSeries openSeries;

    protected static List<Number> generateRange(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2 - i);
        while (i < i2) {
            arrayList.add(Integer.valueOf(i));
            i++;
        }
        return arrayList;
    }

    public CandlestickSeries(Item... itemArr) {
        this(Arrays.asList(itemArr));
    }

    public CandlestickSeries(List<Item> list) {
        this(generateRange(0, list.size()), list);
    }

    public CandlestickSeries(List<Number> list, List<Item> list2) {
        this.highSeries = new SimpleXYSeries(null);
        this.lowSeries = new SimpleXYSeries(null);
        this.openSeries = new SimpleXYSeries(null);
        this.closeSeries = new SimpleXYSeries(null);
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("xVals and yVals length must be identical.");
        }
        for (int i = 0; i < list.size(); i++) {
            Number number = list.get(i);
            this.highSeries.addLast(number, Double.valueOf(list2.get(i).getHigh()));
            this.lowSeries.addLast(number, Double.valueOf(list2.get(i).getLow()));
            this.openSeries.addLast(number, Double.valueOf(list2.get(i).getOpen()));
            this.closeSeries.addLast(number, Double.valueOf(list2.get(i).getClose()));
        }
    }

    public SimpleXYSeries getHighSeries() {
        return this.highSeries;
    }

    public void setHighSeries(SimpleXYSeries simpleXYSeries) {
        this.highSeries = simpleXYSeries;
    }

    public SimpleXYSeries getLowSeries() {
        return this.lowSeries;
    }

    public void setLowSeries(SimpleXYSeries simpleXYSeries) {
        this.lowSeries = simpleXYSeries;
    }

    public SimpleXYSeries getOpenSeries() {
        return this.openSeries;
    }

    public void setOpenSeries(SimpleXYSeries simpleXYSeries) {
        this.openSeries = simpleXYSeries;
    }

    public SimpleXYSeries getCloseSeries() {
        return this.closeSeries;
    }

    public void setCloseSeries(SimpleXYSeries simpleXYSeries) {
        this.closeSeries = simpleXYSeries;
    }

    /* loaded from: classes2.dex */
    public static class Item {
        private double close;
        private double high;
        private double low;
        private double open;

        public Item(double d, double d2, double d3, double d4) {
            this.low = d;
            this.high = d2;
            this.open = d3;
            this.close = d4;
        }

        public double getLow() {
            return this.low;
        }

        public void setLow(double d) {
            this.low = d;
        }

        public double getHigh() {
            return this.high;
        }

        public void setHigh(double d) {
            this.high = d;
        }

        public double getOpen() {
            return this.open;
        }

        public void setOpen(double d) {
            this.open = d;
        }

        public double getClose() {
            return this.close;
        }

        public void setClose(double d) {
            this.close = d;
        }
    }
}
