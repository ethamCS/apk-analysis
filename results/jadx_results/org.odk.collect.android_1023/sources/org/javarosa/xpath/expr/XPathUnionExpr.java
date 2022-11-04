package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xpath.XPathUnsupportedException;
/* loaded from: classes.dex */
public class XPathUnionExpr extends XPathBinaryOpExpr {
    public XPathUnionExpr() {
    }

    public XPathUnionExpr(XPathExpression xPathExpression, XPathExpression xPathExpression2) {
        super(xPathExpression, xPathExpression2);
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        throw new XPathUnsupportedException("nodeset union operation");
    }

    public String toString() {
        return super.toString("union");
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr
    public boolean equals(Object obj) {
        if (obj instanceof XPathUnionExpr) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        super.readExternal(dataInputStream, prototypeFactory);
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        super.writeExternal(dataOutputStream);
    }
}
