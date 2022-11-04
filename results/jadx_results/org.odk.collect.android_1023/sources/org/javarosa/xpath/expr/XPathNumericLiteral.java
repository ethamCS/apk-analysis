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
public class XPathNumericLiteral extends XPathExpression {
    public double d;

    public XPathNumericLiteral() {
    }

    public XPathNumericLiteral(Double d) {
        this.d = d.doubleValue();
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        return new Double(this.d);
    }

    public String toString() {
        return "{num:" + Double.toString(this.d) + "}";
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathNumericLiteral) {
            XPathNumericLiteral xPathNumericLiteral = (XPathNumericLiteral) obj;
            return Double.isNaN(this.d) ? Double.isNaN(xPathNumericLiteral.d) : this.d == xPathNumericLiteral.d;
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        if (dataInputStream.readByte() == 0) {
            this.d = ExtUtil.readNumeric(dataInputStream);
        } else {
            this.d = ExtUtil.readDecimal(dataInputStream);
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        if (this.d == ((int) this.d)) {
            dataOutputStream.writeByte(0);
            ExtUtil.writeNumeric(dataOutputStream, (int) this.d);
            return;
        }
        dataOutputStream.writeByte(1);
        ExtUtil.writeDecimal(dataOutputStream, this.d);
    }
}
