package com.androidplot.xy;
/* loaded from: classes2.dex */
public class StepModel {
    private StepMode mode;
    private double value;

    public StepModel(StepMode stepMode, double d) {
        setMode(stepMode);
        setValue(d);
    }

    public StepMode getMode() {
        return this.mode;
    }

    public void setMode(StepMode stepMode) {
        this.mode = stepMode;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double d) {
        this.value = d;
    }
}
