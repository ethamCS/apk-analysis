package org.javarosa.core.model.condition.pivot;

import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.IConditionExpr;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.xpath.expr.XPathFuncExpr;
/* loaded from: classes.dex */
public abstract class RangeHint<T extends IAnswerData> implements ConstraintHint {
    Double max;
    T maxCast;
    boolean maxInclusive;
    Double min;
    T minCast;
    boolean minInclusive;

    protected abstract T castToValue(double d) throws UnpivotableExpressionException;

    protected abstract double unit();

    @Override // org.javarosa.core.model.condition.pivot.ConstraintHint
    public void init(EvaluationContext evaluationContext, IConditionExpr iConditionExpr, FormInstance formInstance) throws UnpivotableExpressionException {
        Vector<Object> pivot = iConditionExpr.pivot(formInstance, evaluationContext);
        Vector vector = new Vector();
        Iterator<Object> it = pivot.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof CmpPivot)) {
                throw new UnpivotableExpressionException();
            }
            vector.addElement((CmpPivot) next);
        }
        if (vector.size() > 2) {
            throw new UnpivotableExpressionException();
        }
        Iterator it2 = vector.iterator();
        while (it2.hasNext()) {
            evaluatePivot((CmpPivot) it2.next(), iConditionExpr, evaluationContext, formInstance);
        }
    }

    public T getMin() {
        if (this.min == null) {
            return null;
        }
        return this.minCast;
    }

    public boolean isMinInclusive() {
        return this.minInclusive;
    }

    public T getMax() {
        if (this.max == null) {
            return null;
        }
        return this.maxCast;
    }

    public boolean isMaxInclusive() {
        return this.maxInclusive;
    }

    private void evaluatePivot(CmpPivot cmpPivot, IConditionExpr iConditionExpr, EvaluationContext evaluationContext, FormInstance formInstance) throws UnpivotableExpressionException {
        double unit = unit();
        double val = cmpPivot.getVal();
        evaluationContext.isConstraint = true;
        evaluationContext.candidateValue = castToValue(val);
        boolean booleanValue = XPathFuncExpr.toBoolean(Boolean.valueOf(iConditionExpr.eval(formInstance, evaluationContext))).booleanValue();
        evaluationContext.candidateValue = castToValue(val - unit);
        boolean booleanValue2 = XPathFuncExpr.toBoolean(Boolean.valueOf(iConditionExpr.eval(formInstance, evaluationContext))).booleanValue();
        evaluationContext.candidateValue = castToValue(unit + val);
        boolean booleanValue3 = XPathFuncExpr.toBoolean(Boolean.valueOf(iConditionExpr.eval(formInstance, evaluationContext))).booleanValue();
        if (booleanValue2 && !booleanValue3) {
            this.max = new Double(val);
            this.maxInclusive = booleanValue;
            this.maxCast = castToValue(this.max.doubleValue());
        }
        if (!booleanValue2 && booleanValue3) {
            this.min = new Double(val);
            this.minInclusive = booleanValue;
            this.minCast = castToValue(this.min.doubleValue());
        }
    }
}
