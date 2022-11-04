package org.javarosa.core.model.condition.pivot;

import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.IConditionExpr;
import org.javarosa.core.model.instance.FormInstance;
/* loaded from: classes.dex */
public interface ConstraintHint {
    void init(EvaluationContext evaluationContext, IConditionExpr iConditionExpr, FormInstance formInstance) throws UnpivotableExpressionException;
}
