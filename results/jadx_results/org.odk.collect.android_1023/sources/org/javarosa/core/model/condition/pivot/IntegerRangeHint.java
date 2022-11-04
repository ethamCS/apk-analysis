package org.javarosa.core.model.condition.pivot;

import org.javarosa.core.model.data.IntegerData;
/* loaded from: classes.dex */
public class IntegerRangeHint extends RangeHint<IntegerData> {
    @Override // org.javarosa.core.model.condition.pivot.RangeHint
    public IntegerData castToValue(double d) throws UnpivotableExpressionException {
        return new IntegerData((int) Math.floor(d));
    }

    @Override // org.javarosa.core.model.condition.pivot.RangeHint
    protected double unit() {
        return 1.0d;
    }
}
