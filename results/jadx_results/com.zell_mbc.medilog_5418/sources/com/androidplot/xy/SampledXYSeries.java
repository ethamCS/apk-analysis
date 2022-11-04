package com.androidplot.xy;

import com.androidplot.util.SeriesUtils;
import com.androidplot.xy.OrderedXYSeries;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class SampledXYSeries implements FastXYSeries, OrderedXYSeries {
    private XYSeries activeSeries;
    private Sampler algorithm;
    private RectRegion bounds;
    private Exception lastResamplingException;
    private float ratio;
    private XYSeries rawData;
    private int threshold;
    private final OrderedXYSeries.XOrder xOrder;
    private List<EditableXYSeries> zoomLevels;

    public SampledXYSeries(XYSeries xYSeries, OrderedXYSeries.XOrder xOrder, float f, int i) {
        this.algorithm = new LTTBSampler();
        this.rawData = xYSeries;
        this.xOrder = xOrder;
        setRatio(f);
        setThreshold(i);
        resample();
    }

    public SampledXYSeries(XYSeries xYSeries, float f, int i) {
        this(xYSeries, SeriesUtils.getXYOrder(xYSeries), f, i);
    }

    public void resample() {
        this.bounds = null;
        this.zoomLevels = new ArrayList();
        int ceil = (int) Math.ceil(this.rawData.size() / getRatio());
        ArrayList<Thread> arrayList = new ArrayList(this.zoomLevels.size());
        while (ceil > this.threshold) {
            final FixedSizeEditableXYSeries fixedSizeEditableXYSeries = new FixedSizeEditableXYSeries(getTitle(), ceil);
            Thread thread = new Thread(new Runnable() { // from class: com.androidplot.xy.SampledXYSeries.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        RectRegion run = SampledXYSeries.this.getAlgorithm().run(SampledXYSeries.this.rawData, fixedSizeEditableXYSeries);
                        if (SampledXYSeries.this.bounds != null) {
                            return;
                        }
                        SampledXYSeries.this.bounds = run;
                    } catch (Exception e) {
                        SampledXYSeries.this.lastResamplingException = e;
                    }
                }
            }, "Androidplot XY Series Sampler");
            getZoomLevels().add(fixedSizeEditableXYSeries);
            arrayList.add(thread);
            thread.start();
            ceil = (int) Math.ceil(ceil / getRatio());
        }
        for (Thread thread2 : arrayList) {
            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (this.lastResamplingException == null) {
            return;
        }
        throw new RuntimeException("Exception encountered during resampling", this.lastResamplingException);
    }

    protected List<EditableXYSeries> getZoomLevels() {
        return this.zoomLevels;
    }

    public void setZoomFactor(double d) {
        if (d <= 1.0d) {
            this.activeSeries = this.rawData;
            return;
        }
        int zoomIndex = getZoomIndex(d, getRatio());
        if (zoomIndex < this.zoomLevels.size()) {
            this.activeSeries = this.zoomLevels.get(zoomIndex);
            return;
        }
        List<EditableXYSeries> list = this.zoomLevels;
        this.activeSeries = list.get(list.size() - 1);
    }

    protected static int getZoomIndex(double d, double d2) {
        int round = (int) Math.round(Math.log(d) / Math.log(d2));
        if (round > 0) {
            return round - 1;
        }
        return 0;
    }

    public double getMaxZoomFactor() {
        return Math.pow(getRatio(), this.zoomLevels.size());
    }

    public Sampler getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(Sampler sampler) {
        this.algorithm = sampler;
        resample();
    }

    @Override // com.androidplot.Series
    public String getTitle() {
        return this.rawData.getTitle();
    }

    @Override // com.androidplot.xy.XYSeries
    public int size() {
        return this.activeSeries.size();
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getX(int i) {
        return this.activeSeries.getX(i);
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getY(int i) {
        return this.activeSeries.getY(i);
    }

    public int getThreshold() {
        return this.threshold;
    }

    public void setThreshold(int i) {
        if (i >= this.rawData.size()) {
            throw new IllegalArgumentException("Threshold must be < original series size.");
        }
        this.threshold = i;
    }

    public RectRegion getBounds() {
        return this.bounds;
    }

    public void setBounds(RectRegion rectRegion) {
        this.bounds = rectRegion;
    }

    @Override // com.androidplot.xy.FastXYSeries
    public RectRegion minMax() {
        return this.bounds;
    }

    @Override // com.androidplot.xy.OrderedXYSeries
    public OrderedXYSeries.XOrder getXOrder() {
        return this.xOrder;
    }

    public float getRatio() {
        return this.ratio;
    }

    public void setRatio(float f) {
        if (f <= 1.0f) {
            throw new IllegalArgumentException("Ratio must be greater than 1");
        }
        this.ratio = f;
    }
}
