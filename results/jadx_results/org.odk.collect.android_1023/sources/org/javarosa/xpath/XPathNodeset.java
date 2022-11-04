package org.javarosa.xpath;

import java.util.Vector;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.xpath.expr.XPathPathExpr;
/* loaded from: classes.dex */
public class XPathNodeset {
    EvaluationContext ec;
    FormInstance instance;
    Vector<TreeReference> nodes;

    public XPathNodeset(Vector<TreeReference> vector, FormInstance formInstance, EvaluationContext evaluationContext) {
        this.nodes = vector;
        this.instance = formInstance;
        this.ec = evaluationContext;
    }

    public Object unpack() {
        if (size() == 0) {
            return XPathPathExpr.unpackValue(null);
        }
        if (size() > 1) {
            throw new XPathTypeMismatchException("nodeset has more than one node [" + nodeContents() + "]; cannot convert to value");
        }
        return getValAt(0);
    }

    public Object[] toArgList() {
        Object[] objArr = new Object[size()];
        for (int i = 0; i < size(); i++) {
            Object valAt = getValAt(i);
            if (valAt == null) {
                throw new RuntimeException("retrived a null value out of a nodeset! shouldn't happen!");
            }
            objArr[i] = valAt;
        }
        return objArr;
    }

    public int size() {
        return this.nodes.size();
    }

    public TreeReference getRefAt(int i) {
        return this.nodes.elementAt(i);
    }

    public Object getValAt(int i) {
        return XPathPathExpr.getRefValue(this.instance, this.ec, getRefAt(i));
    }

    private String nodeContents() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.nodes.size()) {
                stringBuffer.append(this.nodes.elementAt(i2).toString());
                if (i2 < this.nodes.size() - 1) {
                    stringBuffer.append(";");
                }
                i = i2 + 1;
            } else {
                return stringBuffer.toString();
            }
        }
    }
}
