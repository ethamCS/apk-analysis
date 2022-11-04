package org.javarosa.core.model.condition.pivot;
/* loaded from: classes.dex */
public class CmpPivot implements Pivot {
    private int op;
    private boolean outcome;
    private double val;

    public CmpPivot(double d, int i) {
        this.val = d;
        this.op = i;
    }

    public void setOutcome(boolean z) {
        this.outcome = z;
    }

    public double getVal() {
        return this.val;
    }

    public int getOp() {
        return this.op;
    }

    public boolean getOutcome() {
        return this.outcome;
    }
}
