package org.javarosa.xpath;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.log.FatalException;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.IConditionExpr;
import org.javarosa.core.model.condition.pivot.UnpivotableExpressionException;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xpath.expr.XPathBinaryOpExpr;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.expr.XPathFuncExpr;
import org.javarosa.xpath.expr.XPathPathExpr;
import org.javarosa.xpath.expr.XPathUnaryOpExpr;
import org.javarosa.xpath.parser.XPathSyntaxException;
/* loaded from: classes.dex */
public class XPathConditional implements IConditionExpr {
    private XPathExpression expr;
    public boolean hasNow;
    public String xpath;

    public XPathConditional(String str) throws XPathSyntaxException {
        this.hasNow = false;
        if (str.indexOf("now()") > -1) {
            this.hasNow = true;
        }
        this.expr = XPathParseTool.parseXPath(str);
        this.xpath = str;
    }

    public XPathConditional(XPathExpression xPathExpression) {
        this.expr = xPathExpression;
    }

    public XPathConditional() {
    }

    public XPathExpression getExpr() {
        return this.expr;
    }

    @Override // org.javarosa.core.model.condition.IConditionExpr
    public Object evalRaw(FormInstance formInstance, EvaluationContext evaluationContext) {
        return XPathFuncExpr.unpack(this.expr.eval(formInstance, evaluationContext));
    }

    @Override // org.javarosa.core.model.condition.IConditionExpr
    public boolean eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        return XPathFuncExpr.toBoolean(evalRaw(formInstance, evaluationContext)).booleanValue();
    }

    @Override // org.javarosa.core.model.condition.IConditionExpr
    public String evalReadable(FormInstance formInstance, EvaluationContext evaluationContext) {
        return XPathFuncExpr.toString(evalRaw(formInstance, evaluationContext));
    }

    @Override // org.javarosa.core.model.condition.IConditionExpr
    public Vector<TreeReference> evalNodeset(FormInstance formInstance, EvaluationContext evaluationContext) {
        if (this.expr instanceof XPathPathExpr) {
            return ((XPathPathExpr) this.expr).eval(formInstance, evaluationContext).nodes;
        }
        throw new FatalException("evalNodeset: must be path expression");
    }

    @Override // org.javarosa.core.model.condition.IConditionExpr
    public Vector<TreeReference> getTriggers() {
        Vector<TreeReference> vector = new Vector<>();
        getTriggers(this.expr, vector, null);
        return vector;
    }

    private static void getTriggers(XPathExpression xPathExpression, Vector<TreeReference> vector, TreeReference treeReference) {
        int i = 0;
        if (xPathExpression instanceof XPathPathExpr) {
            TreeReference reference = ((XPathPathExpr) xPathExpression).getReference();
            TreeReference contextualize = treeReference != null ? reference.contextualize(treeReference) : reference;
            if (!vector.contains(contextualize)) {
                vector.addElement(contextualize);
            }
            while (i < reference.size()) {
                Vector<XPathExpression> predicate = reference.getPredicate(i);
                if (predicate != null) {
                    if (!reference.isAbsolute()) {
                        throw new IllegalArgumentException("can't get triggers for relative references");
                    }
                    TreeReference subReference = reference.getSubReference(i);
                    Iterator<XPathExpression> it = predicate.iterator();
                    while (it.hasNext()) {
                        getTriggers(it.next(), vector, subReference);
                    }
                }
                i++;
            }
        } else if (xPathExpression instanceof XPathBinaryOpExpr) {
            getTriggers(((XPathBinaryOpExpr) xPathExpression).a, vector, treeReference);
            getTriggers(((XPathBinaryOpExpr) xPathExpression).b, vector, treeReference);
        } else if (xPathExpression instanceof XPathUnaryOpExpr) {
            getTriggers(((XPathUnaryOpExpr) xPathExpression).a, vector, treeReference);
        } else if (xPathExpression instanceof XPathFuncExpr) {
            XPathFuncExpr xPathFuncExpr = (XPathFuncExpr) xPathExpression;
            while (i < xPathFuncExpr.args.length) {
                getTriggers(xPathFuncExpr.args[i], vector, treeReference);
                i++;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathConditional) {
            return this.expr.equals(((XPathConditional) obj).expr);
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.expr = (XPathExpression) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
        this.hasNow = ExtUtil.readBool(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.expr));
        ExtUtil.writeBool(dataOutputStream, this.hasNow);
    }

    public String toString() {
        return "xpath[" + this.expr.toString() + "]";
    }

    @Override // org.javarosa.core.model.condition.IConditionExpr
    public Vector<Object> pivot(FormInstance formInstance, EvaluationContext evaluationContext) throws UnpivotableExpressionException {
        return this.expr.pivot(formInstance, evaluationContext);
    }
}
