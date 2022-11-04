package org.javarosa.core.model.condition;

import java.util.Vector;
import org.javarosa.core.model.condition.pivot.UnpivotableExpressionException;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface IConditionExpr extends Externalizable {
    boolean eval(FormInstance formInstance, EvaluationContext evaluationContext);

    Vector<TreeReference> evalNodeset(FormInstance formInstance, EvaluationContext evaluationContext);

    Object evalRaw(FormInstance formInstance, EvaluationContext evaluationContext);

    String evalReadable(FormInstance formInstance, EvaluationContext evaluationContext);

    Vector<TreeReference> getTriggers();

    Vector<Object> pivot(FormInstance formInstance, EvaluationContext evaluationContext) throws UnpivotableExpressionException;
}
