package com.androidplot.xy;

import com.androidplot.Region;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class StepModelFit extends StepModel {
    private Region scale;
    private double[] steps;

    public StepModelFit(Region region, double[] dArr, double d) {
        super(StepMode.INCREMENT_BY_FIT, d);
        setSteps(dArr);
        setScale(region);
    }

    public double[] getSteps() {
        return this.steps;
    }

    public void setSteps(double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return;
        }
        for (double d : dArr) {
            if (d <= 0.0d) {
                return;
            }
        }
        this.steps = dArr;
    }

    public Region getScale() {
        return this.scale;
    }

    public void setScale(Region region) {
        this.scale = region;
    }

    @Override // com.androidplot.xy.StepModel
    public double getValue() {
        Region region;
        double[] dArr;
        if (this.steps == null || (region = this.scale) == null || !region.isDefined()) {
            return super.getValue();
        }
        double d = this.steps[0];
        double abs = Math.abs((this.scale.length().doubleValue() / d) - super.getValue());
        for (double d2 : this.steps) {
            double abs2 = Math.abs((this.scale.length().doubleValue() / d2) - super.getValue());
            if (abs2 < abs) {
                d = d2;
                abs = abs2;
            }
        }
        return d;
    }

    public String toString() {
        return "StepModelFit{steps=" + Arrays.toString(this.steps) + ", scale=" + this.scale + ", current stepping=" + getValue() + '}';
    }
}
