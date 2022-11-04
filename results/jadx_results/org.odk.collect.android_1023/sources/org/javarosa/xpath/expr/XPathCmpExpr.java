package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.pivot.CmpPivot;
import org.javarosa.core.model.condition.pivot.UnpivotableExpressionException;
import org.javarosa.core.model.data.DecimalData;
import org.javarosa.core.model.data.UncastData;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xpath.XPathNodeset;
/* loaded from: classes.dex */
public class XPathCmpExpr extends XPathBinaryOpExpr {
    public static final int GT = 1;
    public static final int GTE = 3;
    public static final int LT = 0;
    public static final int LTE = 2;
    public int op;

    public XPathCmpExpr() {
    }

    public XPathCmpExpr(int i, XPathExpression xPathExpression, XPathExpression xPathExpression2) {
        super(xPathExpression, xPathExpression2);
        this.op = i;
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        boolean z = true;
        Object eval = this.a.eval(formInstance, evaluationContext);
        Object eval2 = this.b.eval(formInstance, evaluationContext);
        Double numeric = XPathFuncExpr.toNumeric(eval);
        Double numeric2 = XPathFuncExpr.toNumeric(eval2);
        double doubleValue = numeric.doubleValue();
        double doubleValue2 = numeric2.doubleValue();
        switch (this.op) {
            case 0:
                z = doubleValue < doubleValue2;
                break;
            case 1:
                if (doubleValue <= doubleValue2) {
                    z = false;
                    break;
                }
                break;
            case 2:
                if (doubleValue > doubleValue2) {
                    z = false;
                    break;
                }
                break;
            case 3:
                if (doubleValue < doubleValue2) {
                    z = false;
                    break;
                }
                break;
            default:
                z = false;
                break;
        }
        return new Boolean(z);
    }

    public String toString() {
        String str = null;
        switch (this.op) {
            case 0:
                str = "<";
                break;
            case 1:
                str = ">";
                break;
            case 2:
                str = "<=";
                break;
            case 3:
                str = ">=";
                break;
        }
        return super.toString(str);
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr
    public boolean equals(Object obj) {
        if (obj instanceof XPathCmpExpr) {
            return super.equals(obj) && this.op == ((XPathCmpExpr) obj).op;
        }
        return false;
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.op = ExtUtil.readInt(dataInputStream);
        super.readExternal(dataInputStream, prototypeFactory);
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, this.op);
        super.writeExternal(dataOutputStream);
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr, org.javarosa.xpath.expr.XPathExpression
    public Object pivot(FormInstance formInstance, EvaluationContext evaluationContext, Vector<Object> vector, Object obj) throws UnpivotableExpressionException {
        Object pivot = this.a.pivot(formInstance, evaluationContext, vector, obj);
        Object pivot2 = this.b.pivot(formInstance, evaluationContext, vector, obj);
        if (pivot2 instanceof XPathNodeset) {
            pivot2 = ((XPathNodeset) pivot2).unpack();
        }
        if (handled(pivot, pivot2, obj, vector) || handled(pivot2, pivot, obj, vector)) {
            return null;
        }
        return eval(formInstance, evaluationContext);
    }

    private boolean handled(Object obj, Object obj2, Object obj3, Vector<Object> vector) throws UnpivotableExpressionException {
        Double d;
        if (obj3 == obj) {
            if (obj2 == null) {
                throw new UnpivotableExpressionException();
            }
            if (obj3 == obj2) {
                throw new UnpivotableExpressionException();
            }
            if (obj2 instanceof Double) {
                d = (Double) obj2;
            } else if (obj2 instanceof Integer) {
                d = new Double(((Integer) obj2).doubleValue());
            } else if (obj2 instanceof Long) {
                d = new Double(((Long) obj2).doubleValue());
            } else if (obj2 instanceof Float) {
                d = new Double(((Float) obj2).doubleValue());
            } else if (obj2 instanceof Short) {
                d = new Double(((Short) obj2).shortValue());
            } else if (obj2 instanceof Byte) {
                d = new Double(((Byte) obj2).byteValue());
            } else if (obj2 instanceof String) {
                try {
                    d = (Double) new DecimalData().cast(new UncastData((String) obj2)).getValue();
                } catch (Exception e) {
                    throw new UnpivotableExpressionException("Unrecognized numeric data in cmp expression: " + obj2);
                }
            } else {
                throw new UnpivotableExpressionException("Unrecognized numeric data in cmp expression: " + obj2);
            }
            vector.addElement(new CmpPivot(d.doubleValue(), this.op));
            return true;
        }
        return false;
    }
}
