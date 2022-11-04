package org.javarosa.core.util;

import java.util.Enumeration;
import java.util.Vector;
import org.javarosa.core.model.instance.TreeReference;
/* loaded from: classes.dex */
public class PrefixTreeNode {
    public Vector children;
    public String prefix;
    public boolean terminal = false;

    public PrefixTreeNode(String str) {
        this.prefix = str;
    }

    public void decompose(Vector vector, String str) {
        String str2 = str + this.prefix;
        if (this.terminal) {
            vector.addElement(str2);
        }
        if (this.children != null) {
            Enumeration elements = this.children.elements();
            while (elements.hasMoreElements()) {
                ((PrefixTreeNode) elements.nextElement()).decompose(vector, str2);
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof PrefixTreeNode) {
            return this.prefix.equals(((PrefixTreeNode) obj).prefix);
        }
        return false;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(this.prefix);
        if (this.terminal) {
            stringBuffer.append(TreeReference.NAME_WILDCARD);
        }
        if (this.children != null) {
            Enumeration elements = this.children.elements();
            while (elements.hasMoreElements()) {
                stringBuffer.append(((PrefixTreeNode) elements.nextElement()).toString());
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
