package org.javarosa.model.xform;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.model.IDataReference;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xpath.XPathParseTool;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.expr.XPathPathExpr;
import org.javarosa.xpath.parser.XPathSyntaxException;
/* loaded from: classes.dex */
public class XPathReference implements IDataReference {
    private String nodeset;
    private TreeReference ref;

    public XPathReference() {
    }

    public XPathReference(String str) {
        this.ref = getPathExpr(str).getReference();
        this.nodeset = str;
    }

    public static XPathPathExpr getPathExpr(String str) {
        boolean z;
        try {
            XPathExpression parseXPath = XPathParseTool.parseXPath(str);
            if (!(parseXPath instanceof XPathPathExpr)) {
                z = true;
                try {
                    throw new XPathSyntaxException();
                } catch (XPathSyntaxException e) {
                    if (z) {
                        throw new RuntimeException("Expected XPath path, got XPath expression: [" + str + "]");
                    }
                    throw new RuntimeException("Parse error in XPath path: [" + str + "]");
                }
            }
            return (XPathPathExpr) parseXPath;
        } catch (XPathSyntaxException e2) {
            z = false;
        }
    }

    public XPathReference(XPathPathExpr xPathPathExpr) {
        this.ref = xPathPathExpr.getReference();
    }

    public XPathReference(TreeReference treeReference) {
        this.ref = treeReference;
    }

    @Override // org.javarosa.core.model.IDataReference
    public Object getReference() {
        return this.ref;
    }

    @Override // org.javarosa.core.model.IDataReference
    public void setReference(Object obj) {
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathReference) {
            return this.ref.equals(((XPathReference) obj).ref);
        }
        return false;
    }

    public int hashCode() {
        return this.ref.hashCode();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.nodeset = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.ref = (TreeReference) ExtUtil.read(dataInputStream, TreeReference.class, prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.nodeset));
        ExtUtil.write(dataOutputStream, this.ref);
    }
}
