package com.androidplot.xy;
/* loaded from: classes2.dex */
public class XYConstraints {
    private XYFramingModel domainFramingModel;
    private BoundaryMode domainLowerBoundaryMode;
    private BoundaryMode domainUpperBoundaryMode;
    private Number maxX;
    private Number maxY;
    private Number minX;
    private Number minY;
    private XYFramingModel rangeFramingModel;
    private BoundaryMode rangeLowerBoundaryMode;
    private BoundaryMode rangeUpperBoundaryMode;

    public XYConstraints() {
        this(null, null, null, null);
    }

    public XYConstraints(Number number, Number number2, Number number3, Number number4) {
        this.domainFramingModel = XYFramingModel.EDGE;
        this.rangeFramingModel = XYFramingModel.EDGE;
        this.domainUpperBoundaryMode = BoundaryMode.AUTO;
        this.domainLowerBoundaryMode = BoundaryMode.AUTO;
        this.rangeUpperBoundaryMode = BoundaryMode.AUTO;
        this.rangeLowerBoundaryMode = BoundaryMode.AUTO;
        this.minX = number;
        this.minY = number3;
        this.maxX = number2;
        this.maxY = number4;
    }

    public boolean contains(RectRegion rectRegion) {
        return contains(rectRegion.getMinY(), rectRegion.getMinY()) && contains(rectRegion.getMaxX(), rectRegion.getMaxY());
    }

    public boolean contains(Number number, Number number2) {
        if (number == null || number2 == null) {
            return false;
        }
        if (this.minX == null && this.maxX == null && this.minY == null && this.maxY == null) {
            return true;
        }
        double doubleValue = number.doubleValue();
        Number number3 = this.minX;
        if (number3 != null && doubleValue < number3.doubleValue()) {
            return false;
        }
        Number number4 = this.maxX;
        if (number4 != null && doubleValue > number4.doubleValue()) {
            return false;
        }
        double doubleValue2 = number2.doubleValue();
        Number number5 = this.minY;
        if (number5 != null && doubleValue2 < number5.doubleValue()) {
            return false;
        }
        Number number6 = this.maxY;
        return number6 == null || doubleValue2 <= number6.doubleValue();
    }

    public Number getMinX() {
        return this.minX;
    }

    public Number getMaxX() {
        return this.maxX;
    }

    public Number getMinY() {
        return this.minY;
    }

    public Number getMaxY() {
        return this.maxY;
    }

    public void setMinX(Number number) {
        this.minX = number;
    }

    public void setMaxX(Number number) {
        this.maxX = number;
    }

    public void setMinY(Number number) {
        this.minY = number;
    }

    public void setMaxY(Number number) {
        this.maxY = number;
    }

    public XYFramingModel getDomainFramingModel() {
        return this.domainFramingModel;
    }

    public void setDomainFramingModel(XYFramingModel xYFramingModel) {
        this.domainFramingModel = xYFramingModel;
    }

    public XYFramingModel getRangeFramingModel() {
        return this.rangeFramingModel;
    }

    public void setRangeFramingModel(XYFramingModel xYFramingModel) {
        this.rangeFramingModel = xYFramingModel;
    }

    public BoundaryMode getDomainUpperBoundaryMode() {
        return this.domainUpperBoundaryMode;
    }

    public void setDomainUpperBoundaryMode(BoundaryMode boundaryMode) {
        this.domainUpperBoundaryMode = boundaryMode;
    }

    public BoundaryMode getDomainLowerBoundaryMode() {
        return this.domainLowerBoundaryMode;
    }

    public void setDomainLowerBoundaryMode(BoundaryMode boundaryMode) {
        this.domainLowerBoundaryMode = boundaryMode;
    }

    public BoundaryMode getRangeUpperBoundaryMode() {
        return this.rangeUpperBoundaryMode;
    }

    public void setRangeUpperBoundaryMode(BoundaryMode boundaryMode) {
        this.rangeUpperBoundaryMode = boundaryMode;
    }

    public BoundaryMode getRangeLowerBoundaryMode() {
        return this.rangeLowerBoundaryMode;
    }

    public void setRangeLowerBoundaryMode(BoundaryMode boundaryMode) {
        this.rangeLowerBoundaryMode = boundaryMode;
    }

    public String toString() {
        return "XYConstraints{domainFramingModel=" + this.domainFramingModel + ", rangeFramingModel=" + this.rangeFramingModel + ", domainUpperBoundaryMode=" + this.domainUpperBoundaryMode + ", domainLowerBoundaryMode=" + this.domainLowerBoundaryMode + ", rangeUpperBoundaryMode=" + this.rangeUpperBoundaryMode + ", rangeLowerBoundaryMode=" + this.rangeLowerBoundaryMode + ", minX=" + this.minX + ", maxX=" + this.maxX + ", minY=" + this.minY + ", maxY=" + this.maxY + '}';
    }
}
