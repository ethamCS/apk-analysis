package com.androidplot.xy;

import android.graphics.PointF;
import android.graphics.RectF;
import com.androidplot.Region;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class RectRegion {
    private String label;
    Region xRegion;
    Region yRegion;

    public RectRegion() {
        this.xRegion = new Region();
        this.yRegion = new Region();
    }

    public static RectRegion withDefaults(RectRegion rectRegion) {
        if (rectRegion == null || !rectRegion.isFullyDefined()) {
            throw new IllegalArgumentException("When specifying defaults, RectRegion param must contain no null values.");
        }
        RectRegion rectRegion2 = new RectRegion();
        rectRegion2.xRegion = Region.withDefaults(rectRegion.getxRegion());
        rectRegion2.yRegion = Region.withDefaults(rectRegion.getyRegion());
        return rectRegion2;
    }

    public RectRegion(XYCoords xYCoords, XYCoords xYCoords2) {
        this(xYCoords.x, xYCoords2.x, xYCoords.y, xYCoords2.y);
    }

    public RectRegion(Number number, Number number2, Number number3, Number number4, String str) {
        this.xRegion = new Region(number, number2);
        this.yRegion = new Region(number3, number4);
        setLabel(str);
    }

    public RectRegion(RectF rectF) {
        this(Float.valueOf(rectF.left < rectF.right ? rectF.left : rectF.right), Float.valueOf(rectF.right > rectF.left ? rectF.right : rectF.left), Float.valueOf(rectF.bottom < rectF.top ? rectF.bottom : rectF.top), Float.valueOf(rectF.top > rectF.bottom ? rectF.top : rectF.bottom));
    }

    public RectRegion(Number number, Number number2, Number number3, Number number4) {
        this(number, number2, number3, number4, null);
    }

    public XYCoords transform(Number number, Number number2, RectRegion rectRegion, boolean z, boolean z2) {
        return new XYCoords(this.xRegion.transform(number.doubleValue(), rectRegion.xRegion, z), this.yRegion.transform(number2.doubleValue(), rectRegion.yRegion, z2));
    }

    public XYCoords transform(Number number, Number number2, RectRegion rectRegion) {
        return transform(number, number2, rectRegion, false, false);
    }

    public XYCoords transform(XYCoords xYCoords, RectRegion rectRegion) {
        return transform(xYCoords.x, xYCoords.y, rectRegion);
    }

    public RectRegion transform(RectRegion rectRegion, RectRegion rectRegion2, boolean z, boolean z2) {
        return new RectRegion(transform(rectRegion.getMinX(), rectRegion.getMinY(), rectRegion2, z, z2), transform(rectRegion.getMaxX(), rectRegion.getMaxY(), rectRegion2, z, z2));
    }

    public PointF transformScreen(Number number, Number number2, RectF rectF) {
        return transform(number, number2, rectF, false, true);
    }

    public void transformScreen(PointF pointF, Number number, Number number2, RectF rectF) {
        transform(pointF, number, number2, rectF, false, true);
    }

    public void transform(PointF pointF, Number number, Number number2, RectF rectF, boolean z, boolean z2) {
        pointF.x = (float) this.xRegion.transform(number.doubleValue(), rectF.left, rectF.right, z);
        pointF.y = (float) this.yRegion.transform(number2.doubleValue(), rectF.top, rectF.bottom, z2);
    }

    public PointF transform(Number number, Number number2, RectF rectF, boolean z, boolean z2) {
        PointF pointF = new PointF();
        transform(pointF, number, number2, rectF, z, z2);
        return pointF;
    }

    public PointF transformScreen(XYCoords xYCoords, RectF rectF) {
        return transform(xYCoords, rectF, false, true);
    }

    public PointF transform(XYCoords xYCoords, RectF rectF, boolean z, boolean z2) {
        return transform(xYCoords.x, xYCoords.y, rectF, z, z2);
    }

    public void union(Number number, Number number2) {
        this.xRegion.union(number);
        this.yRegion.union(number2);
    }

    public void union(RectRegion rectRegion) {
        this.xRegion.union(rectRegion.xRegion);
        this.yRegion.union(rectRegion.yRegion);
    }

    public boolean intersects(RectRegion rectRegion) {
        return intersects(rectRegion.getMinX(), rectRegion.getMaxX(), rectRegion.getMinY(), rectRegion.getMaxY());
    }

    public boolean intersects(Number number, Number number2, Number number3, Number number4) {
        return this.xRegion.intersects(number, number2) && this.yRegion.intersects(number3, number4);
    }

    public RectF asRectF() {
        return new RectF(getMinX().floatValue(), getMinY().floatValue(), getMaxX().floatValue(), getMaxY().floatValue());
    }

    public void intersect(RectRegion rectRegion) {
        if (intersects(rectRegion)) {
            this.xRegion.intersect(rectRegion.xRegion);
            this.yRegion.intersect(rectRegion.yRegion);
            return;
        }
        setMinY(null);
        setMaxY(null);
        setMinX(null);
        setMaxX(null);
    }

    public List<RectRegion> intersects(List<RectRegion> list) {
        ArrayList arrayList = new ArrayList();
        for (RectRegion rectRegion : list) {
            if (rectRegion.intersects(getMinX(), getMaxX(), getMinY(), getMaxY())) {
                arrayList.add(rectRegion);
            }
        }
        return arrayList;
    }

    public Number getWidth() {
        return distanceBetween(getMinX(), getMaxX());
    }

    public Number getHeight() {
        return distanceBetween(getMinY(), getMaxY());
    }

    private static Number distanceBetween(Number number, Number number2) {
        return Double.valueOf(Math.abs(number.doubleValue() - number2.doubleValue()));
    }

    public void set(Number number, Number number2, Number number3, Number number4) {
        setMinX(number);
        setMaxX(number2);
        setMinY(number3);
        setMaxY(number4);
    }

    public boolean isMinXSet() {
        return this.xRegion.isMinSet();
    }

    public Number getMinX() {
        return this.xRegion.getMin();
    }

    public void setMinX(Number number) {
        this.xRegion.setMin(number);
    }

    public boolean isMaxXSet() {
        return this.xRegion.isMaxSet();
    }

    public Number getMaxX() {
        return this.xRegion.getMax();
    }

    public void setMaxX(Number number) {
        this.xRegion.setMax(number);
    }

    public boolean isMinYSet() {
        return this.yRegion.isMinSet();
    }

    public Number getMinY() {
        return this.yRegion.getMin();
    }

    public void setMinY(Number number) {
        this.yRegion.setMin(number);
    }

    public boolean isMaxYSet() {
        return this.yRegion.isMaxSet();
    }

    public Number getMaxY() {
        return this.yRegion.getMax();
    }

    public void setMaxY(Number number) {
        this.yRegion.setMax(number);
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public Region getxRegion() {
        return this.xRegion;
    }

    public void setxRegion(Region region) {
        this.xRegion = region;
    }

    public Region getyRegion() {
        return this.yRegion;
    }

    public void setyRegion(Region region) {
        this.yRegion = region;
    }

    public boolean isFullyDefined() {
        return this.xRegion.isDefined() && this.yRegion.isDefined();
    }

    public boolean contains(Number number, Number number2) {
        return getxRegion().contains(number) && getyRegion().contains(number2);
    }

    public String toString() {
        return "RectRegion{xRegion=" + this.xRegion + ", yRegion=" + this.yRegion + ", label='" + this.label + "'}";
    }
}
