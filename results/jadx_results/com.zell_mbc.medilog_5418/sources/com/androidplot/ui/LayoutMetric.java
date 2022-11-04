package com.androidplot.ui;

import java.lang.Enum;
/* loaded from: classes2.dex */
abstract class LayoutMetric<LayoutType extends Enum> {
    private LayoutType layoutType;
    private float value;

    public abstract float getPixelValue(float f);

    protected abstract void validatePair(float f, LayoutType layouttype);

    public LayoutMetric(float f, LayoutType layouttype) {
        validatePair(f, layouttype);
        set(f, layouttype);
    }

    public void set(float f, LayoutType layouttype) {
        validatePair(f, layouttype);
        this.value = f;
        this.layoutType = layouttype;
    }

    public float getValue() {
        return this.value;
    }

    public void setValue(float f) {
        validatePair(f, this.layoutType);
        this.value = f;
    }

    public LayoutType getLayoutType() {
        return this.layoutType;
    }

    public void setLayoutType(LayoutType layouttype) {
        validatePair(this.value, layouttype);
        this.layoutType = layouttype;
    }
}
