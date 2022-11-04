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
public class XPathEqExpr extends XPathBinaryOpExpr {
    public boolean equal;

    public XPathEqExpr() {
    }

    public XPathEqExpr(boolean z, XPathExpression xPathExpression, XPathExpression xPathExpression2) {
        super(xPathExpression, xPathExpression2);
        this.equal = z;
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        boolean z;
        Boolean bool;
        Double d;
        Object unpack = XPathFuncExpr.unpack(this.a.eval(formInstance, evaluationContext));
        Object unpack2 = XPathFuncExpr.unpack(this.b.eval(formInstance, evaluationContext));
        if ((unpack instanceof Boolean) || (unpack2 instanceof Boolean)) {
            if (!(unpack instanceof Boolean)) {
                unpack = XPathFuncExpr.toBoolean(unpack);
                bool = unpack2;
            } else {
                boolean z2 = unpack2 instanceof Boolean;
                bool = unpack2;
                if (!z2) {
                    bool = XPathFuncExpr.toBoolean(unpack2);
                }
            }
            z = ((Boolean) unpack).booleanValue() == ((Boolean) bool).booleanValue();
        } else if ((unpack instanceof Double) || (unpack2 instanceof Double)) {
            if (!(unpack instanceof Double)) {
                unpack = XPathFuncExpr.toNumeric(unpack);
                d = unpack2;
            } else {
                boolean z3 = unpack2 instanceof Double;
                d = unpack2;
                if (!z3) {
                    d = XPathFuncExpr.toNumeric(unpack2);
                }
            }
            z = Math.abs(((Double) unpack).doubleValue() - ((Double) d).doubleValue()) < 1.0E-12d;
        } else {
            z = XPathFuncExpr.toString(unpack).equals(XPathFuncExpr.toString(unpack2));
        }
        if (!this.equal) {
            z = !z;
        }
        return new Boolean(z);
    }

    public String toString() {
        return super.toString(this.equal ? "==" : "!=");
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr
    public boolean equals(Object obj) {
        if (obj instanceof XPathEqExpr) {
            return super.equals(obj) && this.equal == ((XPathEqExpr) obj).equal;
        }
        return false;
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.equal = ExtUtil.readBool(dataInputStream);
        super.readExternal(dataInputStream, prototypeFactory);
    }

    @Override // org.javarosa.xpath.expr.XPathBinaryOpExpr, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeBool(dataOutputStream, this.equal);
        super.writeExternal(dataOutputStream);
    }
}
