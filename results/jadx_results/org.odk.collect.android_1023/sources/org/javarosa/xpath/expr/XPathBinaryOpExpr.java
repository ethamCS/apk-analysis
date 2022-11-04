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
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public abstract class XPathBinaryOpExpr extends XPathOpExpr {
    public XPathExpression a;
    public XPathExpression b;

    public XPathBinaryOpExpr() {
    }

    public XPathBinaryOpExpr(XPathExpression xPathExpression, XPathExpression xPathExpression2) {
        this.a = xPathExpression;
        this.b = xPathExpression2;
    }

    public String toString(String str) {
        return "{binop-expr:" + str + "," + this.a.toString() + "," + this.b.toString() + "}";
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathBinaryOpExpr) {
            XPathBinaryOpExpr xPathBinaryOpExpr = (XPathBinaryOpExpr) obj;
            return this.a.equals(xPathBinaryOpExpr.a) && this.b.equals(xPathBinaryOpExpr.b);
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.a = (XPathExpression) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
        this.b = (XPathExpression) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.a));
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.b));
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object pivot(FormInstance formInstance, EvaluationContext evaluationContext, Vector<Object> vector, Object obj) throws UnpivotableExpressionException {
        Object pivot = this.a.pivot(formInstance, evaluationContext, vector, obj);
        Object pivot2 = this.b.pivot(formInstance, evaluationContext, vector, obj);
        if (pivot == obj || pivot2 == obj) {
            throw new UnpivotableExpressionException();
        }
        if (pivot != null && pivot2 != null) {
            return eval(formInstance, evaluationContext);
        }
        return null;
    }
}
