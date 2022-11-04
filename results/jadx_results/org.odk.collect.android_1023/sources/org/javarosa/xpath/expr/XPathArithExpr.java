package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class XPathArithExpr extends XPathBinaryOpExpr {
    public static final int ADD = 0;
    public static final int DIVIDE = 3;
    public static final int MODULO = 4;
    public static final int MULTIPLY = 2;
    public static final int SUBTRACT = 1;
    public int op;

    public XPathArithExpr() {
    }

    public XPathArithExpr(int i, XPathExpression xPathExpression, XPathExpression xPathExpression2) {
        super(xPathExpression, xPathExpression2);
        this.op = i;
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        double doubleValue = XPathFuncExpr.toNumeric(this.a.eval(formInstance, evaluationContext)).doubleValue();
        double doubleValue2 = XPathFuncExpr.toNumeric(this.b.eval(formInstance, evaluationContext)).doubleValue();
        double d = 0.0d;
        switch (this.op) {
            case 0:
                d = doubleValue + doubleValue2;
                break;
            case 1:
                d = doubleValue - doubleValue2;
                break;
            case 2:
                d = doubleValue * doubleValue2;
                break;
            case 3:
                d = doubleValue / doubleValue2;
                break;
            case 4:
                d = doubleValue % doubleValue2;
                break;
        }
        return new Double(d);
    }

    public String toString() {
        String str = null;
        switch (this.op) {
            case 0:
                str = "+";
                break;
            case 1:
                str = "-";
                break;
            case 2:
                str = TreeReference.NAME_WILDCARD;
                break;
            case 3:
                str = "/";
                break;
            case 4:
                str = "%";
                break;
        }
        return super.toString(str);
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr
    public boolean equals(Object obj) {
        if (obj instanceof XPathArithExpr) {
            return super.equals(obj) && this.op == ((XPathArithExpr) obj).op;
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
