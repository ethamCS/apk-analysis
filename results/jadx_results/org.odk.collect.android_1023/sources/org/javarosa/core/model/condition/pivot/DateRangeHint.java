package org.javarosa.core.model.condition.pivot;

import java.util.Date;
import org.javarosa.core.model.data.DateData;
import org.javarosa.xpath.expr.XPathFuncExpr;
/* loaded from: classes.dex */
public class DateRangeHint extends RangeHint<DateData> {
    @Override // org.javarosa.core.model.condition.pivot.RangeHint
    public DateData castToValue(double d) throws UnpivotableExpressionException {
        return new DateData((Date) XPathFuncExpr.toDate(new Double(Math.floor(d))));
    }

    @Override // org.javarosa.core.model.condition.pivot.RangeHint
    protected double unit() {
        return 1.0d;
    }
}
