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
public class XPathVariableReference extends XPathExpression {
    public XPathQName id;

    public XPathVariableReference() {
    }

    public XPathVariableReference(XPathQName xPathQName) {
        this.id = xPathQName;
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        return evaluationContext.getVariable(this.id.toString());
    }

    public String toString() {
        return "{var:" + this.id.toString() + "}";
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathVariableReference) {
            return this.id.equals(((XPathVariableReference) obj).id);
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.id = (XPathQName) ExtUtil.read(dataInputStream, XPathQName.class);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, this.id);
    }
}
