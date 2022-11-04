package org.javarosa.core.model.condition.pivot;

import org.javarosa.core.model.data.DecimalData;
/* loaded from: classes.dex */
public class DecimalRangeHint extends RangeHint<DecimalData> {
    @Override // org.javarosa.core.model.condition.pivot.RangeHint
    public DecimalData castToValue(double d) throws UnpivotableExpressionException {
        return new DecimalData(d);
    }

    @Override // org.javarosa.core.model.condition.pivot.RangeHint
    protected double unit() {
        return Double.MIN_VALUE;
    }
}
