package org.javarosa.core.model.condition.pivot;

import org.javarosa.core.model.data.StringData;
/* loaded from: classes.dex */
public class StringLengthRangeHint extends RangeHint<StringData> {
    @Override // org.javarosa.core.model.condition.pivot.RangeHint
    public StringData castToValue(double d) throws UnpivotableExpressionException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ((int) d); i++) {
            sb.append("X");
        }
        return new StringData(sb.toString());
    }

    @Override // org.javarosa.core.model.condition.pivot.RangeHint
    protected double unit() {
        return 1.0d;
    }
}
