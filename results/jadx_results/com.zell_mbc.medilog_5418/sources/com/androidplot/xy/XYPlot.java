package com.androidplot.xy;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import androidx.core.internal.view.SupportMenu;
import com.androidplot.Plot;
import com.androidplot.R;
import com.androidplot.ui.Anchor;
import com.androidplot.ui.DynamicTableModel;
import com.androidplot.ui.HorizontalPositioning;
import com.androidplot.ui.Size;
import com.androidplot.ui.SizeMode;
import com.androidplot.ui.TextOrientation;
import com.androidplot.ui.VerticalPositioning;
import com.androidplot.ui.widget.TextLabelWidget;
import com.androidplot.util.AttrUtils;
import com.androidplot.util.PixelUtils;
import com.androidplot.util.SeriesUtils;
import com.androidplot.xy.CandlestickSeries;
import com.androidplot.xy.SimpleXYSeries;
import com.zell_mbc.medilog.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class XYPlot extends Plot<XYSeries, XYSeriesFormatter, XYSeriesRenderer, XYSeriesBundle, XYSeriesRegistry> {
    private static final int DEFAULT_DOMAIN_LABEL_WIDGET_H_DP = 10;
    private static final int DEFAULT_DOMAIN_LABEL_WIDGET_W_DP = 80;
    private static final int DEFAULT_DOMAIN_LABEL_WIDGET_X_OFFSET_DP = 20;
    private static final int DEFAULT_DOMAIN_LABEL_WIDGET_Y_OFFSET_DP = 0;
    private static final int DEFAULT_GRAPH_WIDGET_H_DP = 18;
    private static final int DEFAULT_GRAPH_WIDGET_W_DP = 10;
    private static final int DEFAULT_GRAPH_WIDGET_X_OFFSET_DP = 0;
    private static final int DEFAULT_GRAPH_WIDGET_Y_OFFSET_DP = 0;
    private static final int DEFAULT_LEGEND_WIDGET_H_DP = 10;
    private static final int DEFAULT_LEGEND_WIDGET_ICON_SIZE_DP = 7;
    private static final int DEFAULT_LEGEND_WIDGET_X_OFFSET_DP = 40;
    private static final int DEFAULT_LEGEND_WIDGET_Y_OFFSET_DP = 0;
    private static final int DEFAULT_PLOT_BOTTOM_MARGIN_DP = 1;
    private static final int DEFAULT_PLOT_LEFT_MARGIN_DP = 1;
    private static final int DEFAULT_PLOT_RIGHT_MARGIN_DP = 1;
    private static final int DEFAULT_PLOT_TOP_MARGIN_DP = 1;
    private static final int DEFAULT_RANGE_LABEL_WIDGET_H_DP = 50;
    private static final int DEFAULT_RANGE_LABEL_WIDGET_W_DP = 10;
    private static final int DEFAULT_RANGE_LABEL_WIDGET_X_OFFSET_DP = 0;
    private static final int DEFAULT_RANGE_LABEL_WIDGET_Y_OFFSET_DP = 0;
    private BoundaryMode domainOriginBoundaryMode;
    private StepModel domainStepModel;
    private TextLabelWidget domainTitle;
    private XYGraphWidget graph;
    private XYLegendWidget legend;
    private Number prevMaxX;
    private Number prevMaxY;
    private Number prevMinX;
    private Number prevMinY;
    private PreviewMode previewMode;
    private BoundaryMode rangeOriginBoundaryMode;
    private StepModel rangeStepModel;
    private TextLabelWidget rangeTitle;
    private Number userDomainOrigin;
    private Number userRangeOrigin;
    private ArrayList<XValueMarker> xValueMarkers;
    private ArrayList<YValueMarker> yValueMarkers;
    private XYConstraints constraints = new XYConstraints();
    private RectRegion bounds = RectRegion.withDefaults(new RectRegion(-1, 1, -1, 1));
    private final RectRegion innerLimits = new RectRegion();
    private final RectRegion outerLimits = new RectRegion();
    private XYCoords calculatedOrigin = new XYCoords();
    private Number domainOriginExtent = null;
    private Number rangeOriginExtent = null;

    /* loaded from: classes2.dex */
    public enum PreviewMode {
        LineAndPoint,
        Candlestick,
        Bar
    }

    private static double distance(double d, double d2) {
        return d > d2 ? d - d2 : d2 - d;
    }

    public XYPlot(Context context, String str) {
        super(context, str);
    }

    public XYPlot(Context context, String str, Plot.RenderMode renderMode) {
        super(context, str, renderMode);
    }

    public XYPlot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XYPlot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.androidplot.Plot
    protected void onPreInit() {
        this.legend = new XYLegendWidget(getLayoutManager(), this, new Size(PixelUtils.dpToPix(10.0f), SizeMode.ABSOLUTE, 0.5f, SizeMode.RELATIVE), new DynamicTableModel(0, 1), new Size(PixelUtils.dpToPix(7.0f), SizeMode.ABSOLUTE, PixelUtils.dpToPix(7.0f), SizeMode.ABSOLUTE));
        this.graph = new XYGraphWidget(getLayoutManager(), this, new Size(PixelUtils.dpToPix(18.0f), SizeMode.FILL, PixelUtils.dpToPix(10.0f), SizeMode.FILL));
        Paint paint = new Paint();
        paint.setColor(-12303292);
        paint.setStyle(Paint.Style.FILL);
        this.graph.setBackgroundPaint(paint);
        this.domainTitle = new TextLabelWidget(getLayoutManager(), new Size(PixelUtils.dpToPix(10.0f), SizeMode.ABSOLUTE, PixelUtils.dpToPix(80.0f), SizeMode.ABSOLUTE), TextOrientation.HORIZONTAL);
        this.rangeTitle = new TextLabelWidget(getLayoutManager(), new Size(PixelUtils.dpToPix(50.0f), SizeMode.ABSOLUTE, PixelUtils.dpToPix(10.0f), SizeMode.ABSOLUTE), TextOrientation.VERTICAL_ASCENDING);
        this.legend.position(PixelUtils.dpToPix(40.0f), HorizontalPositioning.ABSOLUTE_FROM_RIGHT, PixelUtils.dpToPix(0.0f), VerticalPositioning.ABSOLUTE_FROM_BOTTOM, Anchor.RIGHT_BOTTOM);
        this.graph.position(PixelUtils.dpToPix(0.0f), HorizontalPositioning.ABSOLUTE_FROM_RIGHT, PixelUtils.dpToPix(0.0f), VerticalPositioning.ABSOLUTE_FROM_CENTER, Anchor.RIGHT_MIDDLE);
        this.domainTitle.position(PixelUtils.dpToPix(20.0f), HorizontalPositioning.ABSOLUTE_FROM_LEFT, PixelUtils.dpToPix(0.0f), VerticalPositioning.ABSOLUTE_FROM_BOTTOM, Anchor.LEFT_BOTTOM);
        this.rangeTitle.position(PixelUtils.dpToPix(0.0f), HorizontalPositioning.ABSOLUTE_FROM_LEFT, PixelUtils.dpToPix(0.0f), VerticalPositioning.ABSOLUTE_FROM_CENTER, Anchor.LEFT_MIDDLE);
        getLayoutManager().moveToTop(getTitle());
        getLayoutManager().moveToTop(getLegend());
        getDomainTitle().pack();
        getRangeTitle().pack();
        setPlotMarginLeft(PixelUtils.dpToPix(1.0f));
        setPlotMarginRight(PixelUtils.dpToPix(1.0f));
        setPlotMarginTop(PixelUtils.dpToPix(1.0f));
        setPlotMarginBottom(PixelUtils.dpToPix(1.0f));
        this.xValueMarkers = new ArrayList<>();
        this.yValueMarkers = new ArrayList<>();
        this.domainStepModel = new StepModel(StepMode.SUBDIVIDE, 10.0d);
        this.rangeStepModel = new StepModel(StepMode.SUBDIVIDE, 10.0d);
    }

    @Override // com.androidplot.Plot
    protected void onAfterConfig() {
        if (isInEditMode()) {
            int i = AnonymousClass1.$SwitchMap$com$androidplot$xy$XYPlot$PreviewMode[this.previewMode.ordinal()];
            if (i == 1) {
                addSeries((XYPlot) new SimpleXYSeries(Arrays.asList(1, 2, 3, 3, 4), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "Red"), (SimpleXYSeries) new LineAndPointFormatter(Integer.valueOf((int) SupportMenu.CATEGORY_MASK), null, null, null));
                addSeries((XYPlot) new SimpleXYSeries(Arrays.asList(2, 1, 4, 2, 5), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "Green"), (SimpleXYSeries) new LineAndPointFormatter(-16711936, null, null, null));
                addSeries((XYPlot) new SimpleXYSeries(Arrays.asList(3, 3, 2, 3, 3), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, MainActivity.DEFAULT_THEME_COLOUR), (SimpleXYSeries) new LineAndPointFormatter(-16776961, null, null, null));
            } else if (i == 2) {
                CandlestickMaker.make(this, new CandlestickFormatter(), new CandlestickSeries(new CandlestickSeries.Item(1.0d, 10.0d, 2.0d, 9.0d), new CandlestickSeries.Item(4.0d, 18.0d, 6.0d, 5.0d), new CandlestickSeries.Item(3.0d, 11.0d, 5.0d, 10.0d), new CandlestickSeries.Item(2.0d, 17.0d, 2.0d, 15.0d), new CandlestickSeries.Item(6.0d, 11.0d, 11.0d, 7.0d), new CandlestickSeries.Item(8.0d, 16.0d, 10.0d, 15.0d)));
            } else if (i == 3) {
                throw new UnsupportedOperationException("Not yet implemented.");
            } else {
                throw new UnsupportedOperationException("Unexpected preview mode: " + this.previewMode);
            }
        }
    }

    @Override // com.androidplot.Plot
    protected void processAttrs(TypedArray typedArray) {
        this.previewMode = PreviewMode.values()[typedArray.getInt(R.styleable.xy_XYPlot_previewMode, PreviewMode.LineAndPoint.ordinal())];
        String string = typedArray.getString(R.styleable.xy_XYPlot_domainTitle);
        if (string != null) {
            getDomainTitle().setText(string);
        }
        String string2 = typedArray.getString(R.styleable.xy_XYPlot_rangeTitle);
        if (string2 != null) {
            getRangeTitle().setText(string2);
        }
        AttrUtils.configureStep(typedArray, getDomainStepModel(), R.styleable.xy_XYPlot_domainStepMode, R.styleable.xy_XYPlot_domainStep);
        AttrUtils.configureStep(typedArray, getRangeStepModel(), R.styleable.xy_XYPlot_rangeStepMode, R.styleable.xy_XYPlot_rangeStep);
        AttrUtils.configureTextPaint(typedArray, getDomainTitle().getLabelPaint(), R.styleable.xy_XYPlot_domainTitleTextColor, R.styleable.xy_XYPlot_domainTitleTextSize);
        AttrUtils.configureTextPaint(typedArray, getRangeTitle().getLabelPaint(), R.styleable.xy_XYPlot_rangeTitleTextColor, R.styleable.xy_XYPlot_rangeTitleTextSize);
        AttrUtils.configureTextPaint(typedArray, getLegend().getTextPaint(), R.styleable.xy_XYPlot_legendTextColor, R.styleable.xy_XYPlot_legendTextSize);
        AttrUtils.configureSize(typedArray, getLegend().getIconSize(), R.styleable.xy_XYPlot_legendIconHeightMode, R.styleable.xy_XYPlot_legendIconHeight, R.styleable.xy_XYPlot_legendIconWidthMode, R.styleable.xy_XYPlot_legendIconWidth);
        AttrUtils.configureWidget(typedArray, getLegend(), R.styleable.xy_XYPlot_legendHeightMode, R.styleable.xy_XYPlot_legendHeight, R.styleable.xy_XYPlot_legendWidthMode, R.styleable.xy_XYPlot_legendWidth, R.styleable.xy_XYPlot_legendHorizontalPositioning, R.styleable.xy_XYPlot_legendHorizontalPosition, R.styleable.xy_XYPlot_legendVerticalPositioning, R.styleable.xy_XYPlot_legendVerticalPosition, R.styleable.xy_XYPlot_legendAnchor, R.styleable.xy_XYPlot_legendVisible);
        getGraph().processAttrs(typedArray);
    }

    @Override // com.androidplot.Plot
    public void notifyListenersBeforeDraw(Canvas canvas) {
        super.notifyListenersBeforeDraw(canvas);
        calculateMinMaxVals();
        getRegistry().estimate(this);
    }

    public boolean containsPoint(float f, float f2) {
        return getGraph().containsPoint(f, f2);
    }

    public boolean containsPoint(PointF pointF) {
        return containsPoint(pointF.x, pointF.y);
    }

    public void setCursorPosition(PointF pointF) {
        getGraph().setCursorPosition(pointF);
    }

    public void setCursorPosition(float f, float f2) {
        getGraph().setCursorPosition(Float.valueOf(f), Float.valueOf(f2));
    }

    @Deprecated
    public Number getXVal(float f) {
        return getGraph().screenToSeriesX(f);
    }

    public Number getYVal(float f) {
        return getGraph().screenToSeriesY(f);
    }

    @Deprecated
    public Number getYVal(PointF pointF) {
        return getGraph().screenToSeriesY(pointF);
    }

    @Deprecated
    public Number getXVal(PointF pointF) {
        return getGraph().screenToSeriesX(pointF);
    }

    public Number screenToSeriesX(float f) {
        return getGraph().screenToSeriesX(f);
    }

    public Number screenToSeriesY(float f) {
        return getGraph().screenToSeriesY(f);
    }

    public float seriesToScreenX(Number number) {
        return getGraph().seriesToScreenX(number);
    }

    public float seriesToScreenY(Number number) {
        return getGraph().seriesToScreenY(number);
    }

    public PointF seriesToScreen(XYCoords xYCoords) {
        return getGraph().seriesToScreen(xYCoords);
    }

    public XYCoords screentoSeries(PointF pointF) {
        return getGraph().screenToSeries(pointF);
    }

    public void calculateMinMaxVals() {
        Number number = null;
        this.prevMinX = this.bounds.isMinXSet() ? this.bounds.getMinX() : null;
        this.prevMaxX = this.bounds.isMaxXSet() ? this.bounds.getMaxX() : null;
        this.prevMinY = this.bounds.isMinYSet() ? this.bounds.getMinY() : null;
        if (this.bounds.isMaxYSet()) {
            number = this.bounds.getMaxY();
        }
        this.prevMaxY = number;
        this.bounds.setMinX(this.constraints.getMinX());
        this.bounds.setMaxX(this.constraints.getMaxX());
        this.bounds.setMinY(this.constraints.getMinY());
        this.bounds.setMaxY(this.constraints.getMaxY());
        if (!this.bounds.isFullyDefined()) {
            RectRegion minMax = SeriesUtils.minMax(this.constraints, getRegistry().getSeriesList());
            if (!this.bounds.isMinXSet()) {
                this.bounds.setMinX(minMax.getMinX());
            }
            if (!this.bounds.isMaxXSet()) {
                this.bounds.setMaxX(minMax.getMaxX());
            }
            if (!this.bounds.isMinYSet()) {
                this.bounds.setMinY(minMax.getMinY());
            }
            if (!this.bounds.isMaxYSet()) {
                this.bounds.setMaxY(minMax.getMaxY());
            }
        }
        int i = AnonymousClass1.$SwitchMap$com$androidplot$xy$XYFramingModel[this.constraints.getDomainFramingModel().ordinal()];
        if (i == 1) {
            updateDomainMinMaxForOriginModel();
        } else if (i == 2) {
            this.bounds.setMaxX(applyUserMinMax(getCalculatedUpperBoundary(this.constraints.getDomainUpperBoundaryMode(), this.prevMaxX, this.bounds.getMaxX()), this.innerLimits.getMaxX(), this.outerLimits.getMaxX()));
            this.bounds.setMinX(applyUserMinMax(getCalculatedLowerBoundary(this.constraints.getDomainLowerBoundaryMode(), this.prevMinX, this.bounds.getMinX()), this.outerLimits.getMinX(), this.innerLimits.getMinX()));
        } else {
            throw new UnsupportedOperationException("Domain Framing Model not yet supported: " + this.constraints.getDomainFramingModel());
        }
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$xy$XYFramingModel[this.constraints.getRangeFramingModel().ordinal()];
        if (i2 == 1) {
            updateRangeMinMaxForOriginModel();
        } else if (i2 == 2) {
            if (getRegistry().size() > 0) {
                this.bounds.setMaxY(applyUserMinMax(getCalculatedUpperBoundary(this.constraints.getRangeUpperBoundaryMode(), this.prevMaxY, this.bounds.getMaxY()), this.innerLimits.getMaxY(), this.outerLimits.getMaxY()));
                this.bounds.setMinY(applyUserMinMax(getCalculatedLowerBoundary(this.constraints.getRangeLowerBoundaryMode(), this.prevMinY, this.bounds.getMinY()), this.outerLimits.getMinY(), this.innerLimits.getMinY()));
            }
        } else {
            throw new UnsupportedOperationException("Range Framing Model not yet supported: " + this.constraints.getRangeFramingModel());
        }
        XYCoords xYCoords = this.calculatedOrigin;
        Number number2 = this.userDomainOrigin;
        if (number2 == null) {
            number2 = this.bounds.getMinX();
        }
        xYCoords.x = number2;
        XYCoords xYCoords2 = this.calculatedOrigin;
        Number number3 = this.userRangeOrigin;
        if (number3 == null) {
            number3 = this.bounds.getMinY();
        }
        xYCoords2.y = number3;
    }

    /* renamed from: com.androidplot.xy.XYPlot$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$BoundaryMode;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$XYFramingModel;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$XYPlot$PreviewMode;

        static {
            int[] iArr = new int[BoundaryMode.values().length];
            $SwitchMap$com$androidplot$xy$BoundaryMode = iArr;
            try {
                iArr[BoundaryMode.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$BoundaryMode[BoundaryMode.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$xy$BoundaryMode[BoundaryMode.GROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$xy$BoundaryMode[BoundaryMode.SHRINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[XYFramingModel.values().length];
            $SwitchMap$com$androidplot$xy$XYFramingModel = iArr2;
            try {
                iArr2[XYFramingModel.ORIGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$xy$XYFramingModel[XYFramingModel.EDGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreviewMode.values().length];
            $SwitchMap$com$androidplot$xy$XYPlot$PreviewMode = iArr3;
            try {
                iArr3[PreviewMode.LineAndPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$androidplot$xy$XYPlot$PreviewMode[PreviewMode.Candlestick.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$androidplot$xy$XYPlot$PreviewMode[PreviewMode.Bar.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    protected Number getCalculatedUpperBoundary(BoundaryMode boundaryMode, Number number, Number number2) {
        int i = AnonymousClass1.$SwitchMap$com$androidplot$xy$BoundaryMode[boundaryMode.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    if (number != null && number2.doubleValue() >= number.doubleValue()) {
                        return number;
                    }
                } else {
                    throw new UnsupportedOperationException("BoundaryMode not supported: " + boundaryMode);
                }
            } else if (number != null && number2.doubleValue() <= number.doubleValue()) {
                return number;
            }
        }
        return number2;
    }

    protected Number getCalculatedLowerBoundary(BoundaryMode boundaryMode, Number number, Number number2) {
        int i = AnonymousClass1.$SwitchMap$com$androidplot$xy$BoundaryMode[boundaryMode.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    if (number != null && number2.doubleValue() <= number.doubleValue()) {
                        return number;
                    }
                } else {
                    throw new UnsupportedOperationException("BoundaryMode not supported: " + boundaryMode);
                }
            } else if (number != null && number2.doubleValue() >= number.doubleValue()) {
                return number;
            }
        }
        return number2;
    }

    private static Number applyUserMinMax(Number number, Number number2, Number number3) {
        if (number2 != null && number != null && number.doubleValue() <= number2.doubleValue()) {
            number = number2;
        }
        return (number3 == null || number == null || number.doubleValue() < number3.doubleValue()) ? number : number3;
    }

    public void centerOnDomainOrigin(Number number) {
        centerOnDomainOrigin(number, null, BoundaryMode.AUTO);
    }

    public void centerOnDomainOrigin(Number number, Number number2, BoundaryMode boundaryMode) {
        if (number == null) {
            throw new IllegalArgumentException("Origin param cannot be null.");
        }
        this.constraints.setDomainFramingModel(XYFramingModel.ORIGIN);
        setUserDomainOrigin(number);
        this.domainOriginExtent = number2;
        this.domainOriginBoundaryMode = boundaryMode;
        Number[] originMinMax = getOriginMinMax(boundaryMode, this.userDomainOrigin, number2);
        this.constraints.setMinX(originMinMax[0]);
        this.constraints.setMaxX(originMinMax[1]);
    }

    public void centerOnRangeOrigin(Number number) {
        centerOnRangeOrigin(number, null, BoundaryMode.AUTO);
    }

    public void centerOnRangeOrigin(Number number, Number number2, BoundaryMode boundaryMode) {
        if (number == null) {
            throw new IllegalArgumentException("Origin param cannot be null.");
        }
        this.constraints.setRangeFramingModel(XYFramingModel.ORIGIN);
        setUserRangeOrigin(number);
        this.rangeOriginExtent = number2;
        this.rangeOriginBoundaryMode = boundaryMode;
        Number[] originMinMax = getOriginMinMax(boundaryMode, this.userRangeOrigin, number2);
        this.constraints.setMinY(originMinMax[0]);
        this.constraints.setMaxY(originMinMax[1]);
    }

    protected Number[] getOriginMinMax(BoundaryMode boundaryMode, Number number, Number number2) {
        if (boundaryMode == BoundaryMode.FIXED) {
            double doubleValue = number.doubleValue();
            double doubleValue2 = number2.doubleValue();
            return new Number[]{Double.valueOf(doubleValue - doubleValue2), Double.valueOf(doubleValue + doubleValue2)};
        }
        return new Number[]{null, null};
    }

    public void updateDomainMinMaxForOriginModel() {
        double doubleValue = this.userDomainOrigin.doubleValue();
        double distance = distance(this.bounds.getMaxX().doubleValue(), doubleValue);
        double distance2 = distance(this.bounds.getMinX().doubleValue(), doubleValue);
        if (distance <= distance2) {
            distance = distance2;
        }
        double d = doubleValue - distance;
        double d2 = doubleValue + distance;
        int i = AnonymousClass1.$SwitchMap$com$androidplot$xy$BoundaryMode[this.domainOriginBoundaryMode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.bounds.setMinX(Double.valueOf(d));
                this.bounds.setMaxX(Double.valueOf(d2));
            } else if (i == 3) {
                Number number = this.prevMinX;
                if (number == null || d < number.doubleValue()) {
                    this.bounds.setMinX(Double.valueOf(d));
                } else {
                    this.bounds.setMinX(this.prevMinX);
                }
                Number number2 = this.prevMaxX;
                if (number2 == null || d2 > number2.doubleValue()) {
                    this.bounds.setMaxX(Double.valueOf(d2));
                } else {
                    this.bounds.setMaxX(this.prevMaxX);
                }
            } else if (i == 4) {
                Number number3 = this.prevMinX;
                if (number3 == null || d > number3.doubleValue()) {
                    this.bounds.setMinX(Double.valueOf(d));
                } else {
                    this.bounds.setMinX(this.prevMinX);
                }
                Number number4 = this.prevMaxX;
                if (number4 == null || d2 < number4.doubleValue()) {
                    this.bounds.setMaxX(Double.valueOf(d2));
                } else {
                    this.bounds.setMaxX(this.prevMaxX);
                }
            } else {
                throw new UnsupportedOperationException("Domain Origin Boundary Mode not yet supported: " + this.domainOriginBoundaryMode);
            }
        }
    }

    public void updateRangeMinMaxForOriginModel() {
        if (AnonymousClass1.$SwitchMap$com$androidplot$xy$BoundaryMode[this.rangeOriginBoundaryMode.ordinal()] == 2) {
            double doubleValue = this.userRangeOrigin.doubleValue();
            double distance = distance(this.bounds.getMaxY().doubleValue(), doubleValue);
            double distance2 = distance(this.bounds.getMinY().doubleValue(), doubleValue);
            if (distance > distance2) {
                this.bounds.setMinY(Double.valueOf(doubleValue - distance));
                this.bounds.setMaxY(Double.valueOf(doubleValue + distance));
                return;
            }
            this.bounds.setMinY(Double.valueOf(doubleValue - distance2));
            this.bounds.setMaxY(Double.valueOf(doubleValue + distance2));
            return;
        }
        throw new UnsupportedOperationException("Range Origin Boundary Mode not yet supported: " + this.rangeOriginBoundaryMode);
    }

    public int getLinesPerRangeLabel() {
        return this.graph.getLinesPerRangeLabel();
    }

    public void setLinesPerRangeLabel(int i) {
        this.graph.setLinesPerRangeLabel(i);
    }

    public int getLinesPerDomainLabel() {
        return this.graph.getLinesPerDomainLabel();
    }

    public void setLinesPerDomainLabel(int i) {
        this.graph.setLinesPerDomainLabel(i);
    }

    public StepMode getDomainStepMode() {
        return this.domainStepModel.getMode();
    }

    public void setDomainStepMode(StepMode stepMode) {
        this.domainStepModel.setMode(stepMode);
    }

    public double getDomainStepValue() {
        return this.domainStepModel.getValue();
    }

    public void setDomainStepValue(double d) {
        this.domainStepModel.setValue(d);
    }

    public void setDomainStep(StepMode stepMode, double d) {
        setDomainStepMode(stepMode);
        setDomainStepValue(d);
    }

    public StepMode getRangeStepMode() {
        return this.rangeStepModel.getMode();
    }

    public void setRangeStepMode(StepMode stepMode) {
        this.rangeStepModel.setMode(stepMode);
    }

    public double getRangeStepValue() {
        return this.rangeStepModel.getValue();
    }

    public void setRangeStepValue(double d) {
        this.rangeStepModel.setValue(d);
    }

    public void setRangeStep(StepMode stepMode, double d) {
        setRangeStepMode(stepMode);
        setRangeStepValue(d);
    }

    public XYLegendWidget getLegend() {
        return this.legend;
    }

    public void setLegend(XYLegendWidget xYLegendWidget) {
        this.legend = xYLegendWidget;
    }

    public XYGraphWidget getGraph() {
        return this.graph;
    }

    public void setGraph(XYGraphWidget xYGraphWidget) {
        this.graph = xYGraphWidget;
    }

    public TextLabelWidget getDomainTitle() {
        return this.domainTitle;
    }

    public void setDomainTitle(TextLabelWidget textLabelWidget) {
        this.domainTitle = textLabelWidget;
    }

    public void setDomainLabel(String str) {
        getDomainTitle().setText(str);
    }

    public TextLabelWidget getRangeTitle() {
        return this.rangeTitle;
    }

    public void setRangeTitle(TextLabelWidget textLabelWidget) {
        this.rangeTitle = textLabelWidget;
    }

    public void setRangeLabel(String str) {
        getRangeTitle().setText(str);
    }

    public synchronized void setDomainBoundaries(Number number, Number number2, BoundaryMode boundaryMode) {
        setDomainBoundaries(number, boundaryMode, number2, boundaryMode);
    }

    public synchronized void setDomainBoundaries(Number number, BoundaryMode boundaryMode, Number number2, BoundaryMode boundaryMode2) {
        setDomainLowerBoundary(number, boundaryMode);
        setDomainUpperBoundary(number2, boundaryMode2);
    }

    public synchronized void setRangeBoundaries(Number number, Number number2, BoundaryMode boundaryMode) {
        setRangeBoundaries(number, boundaryMode, number2, boundaryMode);
    }

    public synchronized void setRangeBoundaries(Number number, BoundaryMode boundaryMode, Number number2, BoundaryMode boundaryMode2) {
        setRangeLowerBoundary(number, boundaryMode);
        setRangeUpperBoundary(number2, boundaryMode2);
    }

    protected synchronized void setDomainUpperBoundaryMode(BoundaryMode boundaryMode) {
        this.constraints.setDomainUpperBoundaryMode(boundaryMode);
    }

    protected synchronized void setUserMaxX(Number number) {
        this.constraints.setMaxX(number);
    }

    public synchronized void setDomainUpperBoundary(Number number, BoundaryMode boundaryMode) {
        if (boundaryMode != BoundaryMode.FIXED) {
            number = null;
        }
        setUserMaxX(number);
        setDomainUpperBoundaryMode(boundaryMode);
        setDomainFramingModel(XYFramingModel.EDGE);
    }

    protected synchronized void setDomainLowerBoundaryMode(BoundaryMode boundaryMode) {
        this.constraints.setDomainLowerBoundaryMode(boundaryMode);
    }

    protected synchronized void setUserMinX(Number number) {
        this.constraints.setMinX(number);
    }

    public synchronized void setDomainLowerBoundary(Number number, BoundaryMode boundaryMode) {
        if (boundaryMode != BoundaryMode.FIXED) {
            number = null;
        }
        setUserMinX(number);
        setDomainLowerBoundaryMode(boundaryMode);
        setDomainFramingModel(XYFramingModel.EDGE);
    }

    protected synchronized void setRangeUpperBoundaryMode(BoundaryMode boundaryMode) {
        this.constraints.setRangeUpperBoundaryMode(boundaryMode);
    }

    protected synchronized void setUserMaxY(Number number) {
        this.constraints.setMaxY(number);
    }

    public synchronized void setRangeUpperBoundary(Number number, BoundaryMode boundaryMode) {
        if (boundaryMode != BoundaryMode.FIXED) {
            number = null;
        }
        setUserMaxY(number);
        setRangeUpperBoundaryMode(boundaryMode);
        setRangeFramingModel(XYFramingModel.EDGE);
    }

    protected synchronized void setRangeLowerBoundaryMode(BoundaryMode boundaryMode) {
        this.constraints.setRangeLowerBoundaryMode(boundaryMode);
    }

    protected synchronized void setUserMinY(Number number) {
        this.constraints.setMinY(number);
    }

    public synchronized void setRangeLowerBoundary(Number number, BoundaryMode boundaryMode) {
        if (boundaryMode != BoundaryMode.FIXED) {
            number = null;
        }
        setUserMinY(number);
        setRangeLowerBoundaryMode(boundaryMode);
        setRangeFramingModel(XYFramingModel.EDGE);
    }

    public XYCoords getOrigin() {
        return this.calculatedOrigin;
    }

    public Number getDomainOrigin() {
        return this.calculatedOrigin.x;
    }

    public Number getRangeOrigin() {
        return this.calculatedOrigin.y;
    }

    public synchronized void setUserDomainOrigin(Number number) {
        if (number == null) {
            throw new NullPointerException("Origin value cannot be null.");
        }
        this.userDomainOrigin = number;
    }

    public synchronized void setUserRangeOrigin(Number number) {
        if (number == null) {
            throw new NullPointerException("Origin value cannot be null.");
        }
        this.userRangeOrigin = number;
    }

    protected void setDomainFramingModel(XYFramingModel xYFramingModel) {
        this.constraints.setDomainFramingModel(xYFramingModel);
    }

    protected void setRangeFramingModel(XYFramingModel xYFramingModel) {
        this.constraints.setRangeFramingModel(xYFramingModel);
    }

    public RectRegion getBounds() {
        return this.bounds;
    }

    public boolean addMarker(YValueMarker yValueMarker) {
        if (this.yValueMarkers.contains(yValueMarker)) {
            return false;
        }
        return this.yValueMarkers.add(yValueMarker);
    }

    public YValueMarker removeMarker(YValueMarker yValueMarker) {
        int indexOf = this.yValueMarkers.indexOf(yValueMarker);
        if (indexOf == -1) {
            return null;
        }
        return this.yValueMarkers.remove(indexOf);
    }

    public int removeMarkers() {
        return removeXMarkers() + removeYMarkers();
    }

    public int removeYMarkers() {
        int size = this.yValueMarkers.size();
        this.yValueMarkers.clear();
        return size;
    }

    public boolean addMarker(XValueMarker xValueMarker) {
        return !this.xValueMarkers.contains(xValueMarker) && this.xValueMarkers.add(xValueMarker);
    }

    public XValueMarker removeMarker(XValueMarker xValueMarker) {
        int indexOf = this.xValueMarkers.indexOf(xValueMarker);
        if (indexOf == -1) {
            return null;
        }
        return this.xValueMarkers.remove(indexOf);
    }

    public int removeXMarkers() {
        int size = this.xValueMarkers.size();
        this.xValueMarkers.clear();
        return size;
    }

    public List<YValueMarker> getYValueMarkers() {
        return this.yValueMarkers;
    }

    public List<XValueMarker> getXValueMarkers() {
        return this.xValueMarkers;
    }

    public RectRegion getInnerLimits() {
        return this.innerLimits;
    }

    public RectRegion getOuterLimits() {
        return this.outerLimits;
    }

    public StepModel getDomainStepModel() {
        return this.domainStepModel;
    }

    public void setDomainStepModel(StepModel stepModel) {
        this.domainStepModel = stepModel;
    }

    public StepModel getRangeStepModel() {
        return this.rangeStepModel;
    }

    public void setRangeStepModel(StepModel stepModel) {
        this.rangeStepModel = stepModel;
    }

    @Override // com.androidplot.Plot
    public XYSeriesRegistry getRegistryInstance() {
        return new XYSeriesRegistry();
    }
}
