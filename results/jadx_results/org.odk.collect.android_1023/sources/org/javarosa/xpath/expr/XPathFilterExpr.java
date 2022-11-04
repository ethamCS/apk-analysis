package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.pivot.UnpivotableExpressionException;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapListPoly;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xpath.XPathUnsupportedException;
/* loaded from: classes.dex */
public class XPathFilterExpr extends XPathExpression {
    public XPathExpression[] predicates;
    public XPathExpression x;

    public XPathFilterExpr() {
    }

    public XPathFilterExpr(XPathExpression xPathExpression, XPathExpression[] xPathExpressionArr) {
        this.x = xPathExpression;
        this.predicates = xPathExpressionArr;
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        throw new XPathUnsupportedException("filter expression");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{filt-expr:");
        stringBuffer.append(this.x.toString());
        stringBuffer.append(",{");
        for (int i = 0; i < this.predicates.length; i++) {
            stringBuffer.append(this.predicates[i].toString());
            if (i < this.predicates.length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append("}}");
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathFilterExpr) {
            XPathFilterExpr xPathFilterExpr = (XPathFilterExpr) obj;
            Vector vector = new Vector();
            for (int i = 0; i < this.predicates.length; i++) {
                vector.addElement(this.predicates[i]);
            }
            Vector vector2 = new Vector();
            for (int i2 = 0; i2 < xPathFilterExpr.predicates.length; i2++) {
                vector2.addElement(xPathFilterExpr.predicates[i2]);
            }
            return this.x.equals(xPathFilterExpr.x) && ExtUtil.vectorEquals(vector, vector2);
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.x = (XPathExpression) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
        Vector vector = (Vector) ExtUtil.read(dataInputStream, new ExtWrapListPoly(), prototypeFactory);
        this.predicates = new XPathExpression[vector.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.predicates.length) {
                this.predicates[i2] = (XPathExpression) vector.elementAt(i2);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        Vector vector = new Vector();
        for (int i = 0; i < this.predicates.length; i++) {
            vector.addElement(this.predicates[i]);
        }
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.x));
        ExtUtil.write(dataOutputStream, new ExtWrapListPoly(vector));
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object pivot(FormInstance formInstance, EvaluationContext evaluationContext, Vector<Object> vector, Object obj) throws UnpivotableExpressionException {
        throw new UnpivotableExpressionException();
    }
}
