package androidx.compose.animation.core;

import kotlin.Metadata;
/* compiled from: SpringSimulation.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0004R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "finalPosition", "", "(F)V", "dampedFreq", "", "value", "dampingRatio", "getDampingRatio", "()F", "setDampingRatio", "getFinalPosition", "setFinalPosition", "gammaMinus", "gammaPlus", "initialized", "", "naturalFreq", "stiffness", "getStiffness", "setStiffness", "getAcceleration", "lastDisplacement", "lastVelocity", "init", "", "updateValues", "Landroidx/compose/animation/core/Motion;", "timeElapsed", "", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "animation-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SpringSimulation {
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f) {
        this.finalPosition = f;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final void setFinalPosition(float f) {
        this.finalPosition = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f);
        this.initialized = false;
    }

    public final float getStiffness() {
        double d = this.naturalFreq;
        return (float) (d * d);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final void setDampingRatio(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f;
        this.initialized = false;
    }

    public final float getAcceleration(float f, float f2) {
        float f3 = f - this.finalPosition;
        double d = this.naturalFreq;
        return (float) (((-(d * d)) * f3) - (((d * 2.0d) * this.dampingRatio) * f2));
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f = this.dampingRatio;
        double d = f * f;
        if (f > 1.0f) {
            double d2 = this.naturalFreq;
            double d3 = d - 1;
            this.gammaPlus = ((-f) * d2) + (d2 * Math.sqrt(d3));
            double d4 = this.naturalFreq;
            this.gammaMinus = ((-this.dampingRatio) * d4) - (d4 * Math.sqrt(d3));
        } else if (f >= 0.0f && f < 1.0f) {
            this.dampedFreq = this.naturalFreq * Math.sqrt(1 - d);
        }
        this.initialized = true;
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release */
    public final long m132updateValuesIJZedt4$animation_core_release(float f, float f2, long j) {
        double d;
        double d2;
        float f3;
        init();
        float f4 = f - this.finalPosition;
        double d3 = j / 1000.0d;
        float f5 = this.dampingRatio;
        if (f5 > 1.0f) {
            double d4 = f4;
            double d5 = this.gammaMinus;
            double d6 = f2;
            double d7 = this.gammaPlus;
            double d8 = d4 - (((d5 * d4) - d6) / (d5 - d7));
            double d9 = ((d4 * d5) - d6) / (d5 - d7);
            d2 = (Math.exp(d5 * d3) * d8) + (Math.exp(this.gammaPlus * d3) * d9);
            double d10 = this.gammaMinus;
            double exp = d8 * d10 * Math.exp(d10 * d3);
            double d11 = this.gammaPlus;
            d = exp + (d9 * d11 * Math.exp(d11 * d3));
        } else {
            if (f5 == 1.0f) {
                double d12 = this.naturalFreq;
                double d13 = f4;
                double d14 = f2 + (d12 * d13);
                double d15 = d13 + (d14 * d3);
                double exp2 = Math.exp((-d12) * d3) * d15;
                double exp3 = d15 * Math.exp((-this.naturalFreq) * d3);
                double d16 = this.naturalFreq;
                d = (exp3 * (-d16)) + (d14 * Math.exp((-d16) * d3));
                d2 = exp2;
            } else {
                double d17 = this.naturalFreq;
                double d18 = f4;
                double d19 = (1 / this.dampedFreq) * ((f5 * d17 * d18) + f2);
                double exp4 = Math.exp((-f5) * d17 * d3) * ((Math.cos(this.dampedFreq * d3) * d18) + (Math.sin(this.dampedFreq * d3) * d19));
                double d20 = this.naturalFreq;
                double d21 = (-d20) * exp4 * this.dampingRatio;
                double exp5 = Math.exp((-f3) * d20 * d3);
                double d22 = this.dampedFreq;
                double sin = (-d22) * d18 * Math.sin(d22 * d3);
                double d23 = this.dampedFreq;
                d = d21 + (exp5 * (sin + (d19 * d23 * Math.cos(d23 * d3))));
                d2 = exp4;
            }
        }
        return SpringSimulationKt.Motion((float) (d2 + this.finalPosition), (float) d);
    }
}
