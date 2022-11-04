package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class XPathNumNegExpr extends XPathUnaryOpExpr {
    public XPathNumNegExpr() {
    }

    public XPathNumNegExpr(XPathExpression xPathExpression) {
        super(xPathExpression);
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        return new Double(-XPathFuncExpr.toNumeric(this.a.eval(formInstance, evaluationContext)).doubleValue());
    }

    public String toString() {
        return "{unop-expr:num-neg," + this.a.toString() + "}";
    }

    @Override // org.javarosa.xpath.expr.XPathUnaryOpExpr
    public boolean equals(Object obj) {
        if (obj instanceof XPathNumNegExpr) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // org.javarosa.xpath.expr.XPathUnaryOpExpr, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        super.readExternal(dataInputStream, prototypeFactory);
    }

    @Override // org.javarosa.xpath.expr.XPathUnaryOpExpr, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        super.writeExternal(dataOutputStream);
    }
}
