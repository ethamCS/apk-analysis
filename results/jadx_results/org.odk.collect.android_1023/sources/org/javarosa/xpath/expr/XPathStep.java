package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapListPoly;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class XPathStep implements Externalizable {
    public static final int AXIS_ANCESTOR = 3;
    public static final int AXIS_ANCESTOR_OR_SELF = 12;
    public static final int AXIS_ATTRIBUTE = 8;
    public static final int AXIS_CHILD = 0;
    public static final int AXIS_DESCENDANT = 1;
    public static final int AXIS_DESCENDANT_OR_SELF = 11;
    public static final int AXIS_FOLLOWING = 6;
    public static final int AXIS_FOLLOWING_SIBLING = 4;
    public static final int AXIS_NAMESPACE = 9;
    public static final int AXIS_PARENT = 2;
    public static final int AXIS_PRECEDING = 7;
    public static final int AXIS_PRECEDING_SIBLING = 5;
    public static final int AXIS_SELF = 10;
    public static final int TEST_NAME = 0;
    public static final int TEST_NAMESPACE_WILDCARD = 2;
    public static final int TEST_NAME_WILDCARD = 1;
    public static final int TEST_TYPE_COMMENT = 5;
    public static final int TEST_TYPE_NODE = 3;
    public static final int TEST_TYPE_PROCESSING_INSTRUCTION = 6;
    public static final int TEST_TYPE_TEXT = 4;
    public int axis;
    public String literal;
    public XPathQName name;
    public String namespace;
    public XPathExpression[] predicates;
    public int test;

    public static XPathStep ABBR_SELF() {
        return new XPathStep(10, 3);
    }

    public static XPathStep ABBR_PARENT() {
        return new XPathStep(2, 3);
    }

    public static XPathStep ABBR_DESCENDANTS() {
        return new XPathStep(11, 3);
    }

    public XPathStep() {
    }

    public XPathStep(int i, int i2) {
        this.axis = i;
        this.test = i2;
        this.predicates = new XPathExpression[0];
    }

    public XPathStep(int i, XPathQName xPathQName) {
        this(i, 0);
        this.name = xPathQName;
    }

    public XPathStep(int i, String str) {
        this(i, 2);
        this.namespace = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{step:");
        stringBuffer.append(axisStr(this.axis));
        stringBuffer.append(",");
        stringBuffer.append(testStr());
        if (this.predicates.length > 0) {
            stringBuffer.append(",{");
            for (int i = 0; i < this.predicates.length; i++) {
                stringBuffer.append(this.predicates[i].toString());
                if (i < this.predicates.length - 1) {
                    stringBuffer.append(",");
                }
            }
            stringBuffer.append("}");
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public static String axisStr(int i) {
        switch (i) {
            case 0:
                return "child";
            case 1:
                return "descendant";
            case 2:
                return "parent";
            case 3:
                return "ancestor";
            case 4:
                return "following-sibling";
            case 5:
                return "preceding-sibling";
            case 6:
                return "following";
            case 7:
                return "preceding";
            case 8:
                return "attribute";
            case 9:
                return "namespace";
            case 10:
                return "self";
            case 11:
                return "descendant-or-self";
            case 12:
                return "ancestor-or-self";
            default:
                return null;
        }
    }

    public String testStr() {
        switch (this.test) {
            case 0:
                return this.name.toString();
            case 1:
                return TreeReference.NAME_WILDCARD;
            case 2:
                return this.namespace + ":*";
            case 3:
                return "node()";
            case 4:
                return "text()";
            case 5:
                return "comment()";
            case 6:
                return "proc-instr(" + (this.literal == null ? "" : "'" + this.literal + "'") + ")";
            default:
                return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathStep) {
            XPathStep xPathStep = (XPathStep) obj;
            if ((this.axis != xPathStep.axis && this.test != xPathStep.test) || this.predicates.length != xPathStep.predicates.length) {
                return false;
            }
            switch (this.test) {
                case 0:
                    if (!this.name.equals(xPathStep.name)) {
                        return false;
                    }
                    break;
                case 2:
                    if (!this.namespace.equals(xPathStep.namespace)) {
                        return false;
                    }
                    break;
                case 6:
                    if (!ExtUtil.equals(this.literal, xPathStep.literal)) {
                        return false;
                    }
                    break;
            }
            return ExtUtil.arrayEquals(this.predicates, xPathStep.predicates);
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.axis = ExtUtil.readInt(dataInputStream);
        this.test = ExtUtil.readInt(dataInputStream);
        switch (this.test) {
            case 0:
                this.name = (XPathQName) ExtUtil.read(dataInputStream, XPathQName.class);
                break;
            case 2:
                this.namespace = ExtUtil.readString(dataInputStream);
                break;
            case 6:
                this.literal = (String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class));
                break;
        }
        Vector vector = (Vector) ExtUtil.read(dataInputStream, new ExtWrapListPoly(), prototypeFactory);
        this.predicates = new XPathExpression[vector.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.predicates.length) {
                this.predicates[i2] = (XPathExpression) vector.elementAt(i2);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, this.axis);
        ExtUtil.writeNumeric(dataOutputStream, this.test);
        switch (this.test) {
            case 0:
                ExtUtil.write(dataOutputStream, this.name);
                break;
            case 2:
                ExtUtil.writeString(dataOutputStream, this.namespace);
                break;
            case 6:
                ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.literal));
                break;
        }
        Vector vector = new Vector();
        for (int i = 0; i < this.predicates.length; i++) {
            vector.addElement(this.predicates[i]);
        }
        ExtUtil.write(dataOutputStream, new ExtWrapListPoly(vector));
    }
}
