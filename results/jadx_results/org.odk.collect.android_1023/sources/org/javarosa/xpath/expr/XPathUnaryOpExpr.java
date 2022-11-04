package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public abstract class XPathUnaryOpExpr extends XPathOpExpr {
    public XPathExpression a;

    public XPathUnaryOpExpr() {
    }

    public XPathUnaryOpExpr(XPathExpression xPathExpression) {
        this.a = xPathExpression;
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathUnaryOpExpr) {
            return this.a.equals(((XPathUnaryOpExpr) obj).a);
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.a = (XPathExpression) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.a));
    }
}
