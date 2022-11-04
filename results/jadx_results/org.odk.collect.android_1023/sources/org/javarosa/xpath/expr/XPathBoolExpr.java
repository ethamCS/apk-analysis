package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class XPathBoolExpr extends XPathBinaryOpExpr {
    public static final int AND = 0;
    public static final int OR = 1;
    public int op;

    public XPathBoolExpr() {
    }

    public XPathBoolExpr(int i, XPathExpression xPathExpression, XPathExpression xPathExpression2) {
        super(xPathExpression, xPathExpression2);
        this.op = i;
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        boolean z = true;
        boolean z2 = false;
        boolean booleanValue = XPathFuncExpr.toBoolean(this.a.eval(formInstance, evaluationContext)).booleanValue();
        if ((!booleanValue && this.op == 0) || (booleanValue && this.op == 1)) {
            return new Boolean(booleanValue);
        }
        boolean booleanValue2 = XPathFuncExpr.toBoolean(this.b.eval(formInstance, evaluationContext)).booleanValue();
        switch (this.op) {
            case 0:
                if (!booleanValue || !booleanValue2) {
                    z = false;
                }
                z2 = z;
                break;
            case 1:
                if (booleanValue || booleanValue2) {
                    z2 = true;
                    break;
                }
        }
        return new Boolean(z2);
    }

    public String toString() {
        String str = null;
        switch (this.op) {
            case 0:
                str = "and";
                break;
            case 1:
                str = "or";
                break;
        }
        return super.toString(str);
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr
    public boolean equals(Object obj) {
        if (obj instanceof XPathBoolExpr) {
            return super.equals(obj) && this.op == ((XPathBoolExpr) obj).op;
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
}
