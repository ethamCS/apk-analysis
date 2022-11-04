package org.javarosa.core.model.condition;

import java.util.Date;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.data.BooleanData;
import org.javarosa.core.model.data.DateData;
import org.javarosa.core.model.data.DateTimeData;
import org.javarosa.core.model.data.DecimalData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.IntegerData;
import org.javarosa.core.model.data.LongData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.core.model.data.TimeData;
import org.javarosa.core.model.data.UncastData;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
/* loaded from: classes.dex */
public class Recalculate extends Triggerable {
    public Recalculate() {
    }

    public Recalculate(IConditionExpr iConditionExpr, TreeReference treeReference) {
        super(iConditionExpr, treeReference);
    }

    public Recalculate(IConditionExpr iConditionExpr, TreeReference treeReference, TreeReference treeReference2) {
        super(iConditionExpr, treeReference2);
        addTarget(treeReference);
    }

    @Override // org.javarosa.core.model.condition.Triggerable
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        return this.expr.evalRaw(formInstance, evaluationContext);
    }

    @Override // org.javarosa.core.model.condition.Triggerable
    public void apply(TreeReference treeReference, Object obj, FormInstance formInstance, FormDef formDef) {
        formDef.setAnswer(wrapData(obj, formDef.getMainInstance().resolveReference(treeReference).dataType), treeReference);
    }

    @Override // org.javarosa.core.model.condition.Triggerable
    public boolean canCascade() {
        return true;
    }

    @Override // org.javarosa.core.model.condition.Triggerable
    public boolean equals(Object obj) {
        if (obj instanceof Recalculate) {
            Recalculate recalculate = (Recalculate) obj;
            if (this == recalculate) {
                return true;
            }
            return super.equals(recalculate);
        }
        return false;
    }

    public static IAnswerData wrapData(Object obj, int i) {
        boolean z;
        boolean z2 = true;
        if (((obj instanceof String) && ((String) obj).length() == 0) || ((obj instanceof Double) && ((Double) obj).isNaN())) {
            return null;
        }
        if (9 == i || (obj instanceof Boolean)) {
            if (obj instanceof Boolean) {
                z = ((Boolean) obj).booleanValue();
            } else if (obj instanceof Double) {
                Double d = (Double) obj;
                z = Math.abs(d.doubleValue()) > 1.0E-12d && !Double.isNaN(d.doubleValue());
            } else if (obj instanceof String) {
                if (((String) obj).length() <= 0) {
                    z2 = false;
                }
                z = z2;
            } else {
                throw new RuntimeException("unrecognized data representation while trying to convert to BOOLEAN");
            }
            return new BooleanData(z);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            long j = (long) doubleValue;
            if (Math.abs(doubleValue - j) >= 1.0E-9d) {
                z2 = false;
            }
            if (2 == i || (z2 && 2147483647L >= j && -2147483648L <= j)) {
                return new IntegerData((int) doubleValue);
            }
            if (13 == i || z2) {
                return new LongData((long) doubleValue);
            }
            return new DecimalData(doubleValue);
        } else if (i == 7) {
            return new SelectOneData().cast(new UncastData(String.valueOf(obj)));
        } else {
            if (i == 8) {
                return new SelectMultiData().cast(new UncastData(String.valueOf(obj)));
            }
            if (obj instanceof String) {
                return new StringData((String) obj);
            }
            if (obj instanceof Date) {
                if (i == 6) {
                    return new DateTimeData((Date) obj);
                }
                if (i == 5) {
                    return new TimeData((Date) obj);
                }
                return new DateData((Date) obj);
            }
            throw new RuntimeException("unrecognized data type in 'calculate' expression: " + obj.getClass().getName());
        }
    }
}
