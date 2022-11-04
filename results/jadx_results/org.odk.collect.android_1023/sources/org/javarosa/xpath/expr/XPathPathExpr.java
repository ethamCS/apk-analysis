package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.pivot.UnpivotableExpressionException;
import org.javarosa.core.model.data.BooleanData;
import org.javarosa.core.model.data.DateData;
import org.javarosa.core.model.data.DecimalData;
import org.javarosa.core.model.data.GeoPointData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.IntegerData;
import org.javarosa.core.model.data.LongData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.core.model.data.UncastData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapList;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.javarosa.xpath.XPathNodeset;
import org.javarosa.xpath.XPathTypeMismatchException;
import org.javarosa.xpath.XPathUnsupportedException;
/* loaded from: classes.dex */
public class XPathPathExpr extends XPathExpression {
    public static final int INIT_CONTEXT_EXPR = 2;
    public static final int INIT_CONTEXT_RELATIVE = 1;
    public static final int INIT_CONTEXT_ROOT = 0;
    public XPathFilterExpr filtExpr;
    public int init_context;
    public XPathStep[] steps;

    public XPathPathExpr() {
    }

    public XPathPathExpr(int i, XPathStep[] xPathStepArr) {
        this.init_context = i;
        this.steps = xPathStepArr;
    }

    public XPathPathExpr(XPathFilterExpr xPathFilterExpr, XPathStep[] xPathStepArr) {
        this(2, xPathStepArr);
        this.filtExpr = xPathFilterExpr;
    }

    public TreeReference getReference() throws XPathUnsupportedException {
        return getReference(false);
    }

    public TreeReference getReference(boolean z) throws XPathUnsupportedException {
        boolean z2;
        TreeReference treeReference = new TreeReference();
        switch (this.init_context) {
            case 0:
                treeReference.setRefLevel(-1);
                z2 = false;
                break;
            case 1:
                treeReference.setRefLevel(0);
                z2 = true;
                break;
            case 2:
                if (this.filtExpr.x != null && (this.filtExpr.x instanceof XPathFuncExpr)) {
                    XPathFuncExpr xPathFuncExpr = (XPathFuncExpr) this.filtExpr.x;
                    if (xPathFuncExpr.id.toString().equals("instance")) {
                        treeReference.setRefLevel(-1);
                        if (xPathFuncExpr.args.length != 1) {
                            throw new XPathUnsupportedException("instance() function used with " + xPathFuncExpr.args.length + " arguements. Expecting 1 arguement");
                        }
                        if (!(xPathFuncExpr.args[0] instanceof XPathStringLiteral)) {
                            throw new XPathUnsupportedException("instance() function expecting 1 string literal arguement arguement");
                        }
                        treeReference.setInstanceName(((XPathStringLiteral) xPathFuncExpr.args[0]).s);
                        z2 = false;
                        break;
                    } else {
                        throw new XPathUnsupportedException("filter expression");
                    }
                } else {
                    throw new XPathUnsupportedException("filter expression");
                }
                break;
            default:
                throw new XPathUnsupportedException("filter expression");
        }
        boolean z3 = z2;
        for (int i = 0; i < this.steps.length; i++) {
            XPathStep xPathStep = this.steps[i];
            if (xPathStep.axis == 10) {
                if (xPathStep.test != 3) {
                    throw new XPathUnsupportedException("step other than 'child::name', '.', '..'");
                }
            } else if (xPathStep.axis == 2) {
                if (!z3 || xPathStep.test != 3) {
                    throw new XPathUnsupportedException("step other than 'child::name', '.', '..'");
                }
                treeReference.incrementRefLevel();
            } else if (xPathStep.axis == 8) {
                if (xPathStep.test == 0) {
                    treeReference.add(xPathStep.name.toString(), -4);
                    z3 = false;
                } else {
                    throw new XPathUnsupportedException("attribute step other than 'attribute::name");
                }
            } else if (xPathStep.axis == 0) {
                if (xPathStep.test == 0) {
                    treeReference.add(xPathStep.name.toString(), -1);
                    z3 = true;
                } else if (xPathStep.test == 1) {
                    treeReference.add(TreeReference.NAME_WILDCARD, -1);
                    z3 = true;
                } else {
                    throw new XPathUnsupportedException("step other than 'child::name', '.', '..'");
                }
            } else {
                throw new XPathUnsupportedException("step other than 'child::name', '.', '..'");
            }
            if (xPathStep.predicates.length > 0) {
                treeReference.getRefLevel();
                Vector<XPathExpression> vector = new Vector<>();
                for (int i2 = 0; i2 < xPathStep.predicates.length; i2++) {
                    vector.addElement(xPathStep.predicates[i2]);
                }
                treeReference.addPredicate(i, vector);
            }
        }
        return treeReference;
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public XPathNodeset eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        FormInstance formInstance2;
        TreeReference reference = getReference();
        TreeReference contextualize = reference.contextualize(evaluationContext.getContextRef());
        if (contextualize.getInstanceName() != null && contextualize.isAbsolute()) {
            FormInstance evaluationContext2 = evaluationContext.getInstance(contextualize.getInstanceName());
            if (evaluationContext2 == null) {
                throw new XPathTypeMismatchException("Instance referenced by " + reference + " does not exists");
            }
            formInstance2 = evaluationContext2;
        } else {
            FormInstance mainInstance = evaluationContext.getMainInstance();
            if (mainInstance == null) {
                throw new XPathTypeMismatchException("Cannot evaluate the reference [" + (contextualize == null ? "" : contextualize.toString(true)) + "] in the current evaluation context. No default instance has been declared!");
            }
            formInstance2 = mainInstance;
        }
        Vector<TreeReference> expandReference = evaluationContext.expandReference(contextualize);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < expandReference.size()) {
                if (!formInstance2.resolveReference(expandReference.elementAt(i2)).isRelevant()) {
                    expandReference.removeElementAt(i2);
                    i2--;
                }
                i = i2 + 1;
            } else {
                return new XPathNodeset(expandReference, formInstance2, evaluationContext);
            }
        }
    }

    public static Object getRefValue(FormInstance formInstance, EvaluationContext evaluationContext, TreeReference treeReference) {
        if (evaluationContext.isConstraint && treeReference.equals(evaluationContext.getContextRef())) {
            return unpackValue(evaluationContext.candidateValue);
        }
        TreeElement resolveReference = formInstance.resolveReference(treeReference);
        if (resolveReference == null) {
            throw new XPathTypeMismatchException("Node " + treeReference.toString() + " does not exist!");
        }
        return unpackValue(resolveReference.isRelevant() ? resolveReference.getValue() : null);
    }

    public static Object unpackValue(IAnswerData iAnswerData) {
        if (iAnswerData == null) {
            return "";
        }
        if (iAnswerData instanceof UncastData) {
            return iAnswerData.getValue();
        }
        if (iAnswerData instanceof IntegerData) {
            return new Double(((Integer) iAnswerData.getValue()).doubleValue());
        }
        if (iAnswerData instanceof LongData) {
            return new Double(((Long) iAnswerData.getValue()).doubleValue());
        }
        if (iAnswerData instanceof DecimalData) {
            return iAnswerData.getValue();
        }
        if (iAnswerData instanceof StringData) {
            return iAnswerData.getValue();
        }
        if (iAnswerData instanceof SelectOneData) {
            return ((Selection) iAnswerData.getValue()).getValue();
        }
        if (iAnswerData instanceof SelectMultiData) {
            return new XFormAnswerDataSerializer().serializeAnswerData(iAnswerData);
        }
        if (iAnswerData instanceof DateData) {
            return iAnswerData.getValue();
        }
        if (iAnswerData instanceof BooleanData) {
            return iAnswerData.getValue();
        }
        if (iAnswerData instanceof GeoPointData) {
            return iAnswerData.uncast().getString();
        }
        System.out.println("warning: unrecognized data type in xpath expr: " + iAnswerData.getClass().getName());
        return iAnswerData.getValue();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{path-expr:");
        switch (this.init_context) {
            case 0:
                stringBuffer.append("abs");
                break;
            case 1:
                stringBuffer.append("rel");
                break;
            case 2:
                stringBuffer.append(this.filtExpr.toString());
                break;
        }
        stringBuffer.append(",{");
        for (int i = 0; i < this.steps.length; i++) {
            stringBuffer.append(this.steps[i].toString());
            if (i < this.steps.length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append("}}");
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathPathExpr) {
            XPathPathExpr xPathPathExpr = (XPathPathExpr) obj;
            if (this.init_context != xPathPathExpr.init_context || this.steps.length != xPathPathExpr.steps.length || !ExtUtil.arrayEquals(this.steps, xPathPathExpr.steps)) {
                return false;
            }
            return this.init_context != 2 || this.filtExpr.equals(xPathPathExpr.filtExpr);
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.init_context = ExtUtil.readInt(dataInputStream);
        if (this.init_context == 2) {
            this.filtExpr = (XPathFilterExpr) ExtUtil.read(dataInputStream, XPathFilterExpr.class, prototypeFactory);
        }
        Vector vector = (Vector) ExtUtil.read(dataInputStream, new ExtWrapList(XPathStep.class), prototypeFactory);
        this.steps = new XPathStep[vector.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.steps.length) {
                this.steps[i2] = (XPathStep) vector.elementAt(i2);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, this.init_context);
        if (this.init_context == 2) {
            ExtUtil.write(dataOutputStream, this.filtExpr);
        }
        Vector vector = new Vector();
        for (int i = 0; i < this.steps.length; i++) {
            vector.addElement(this.steps[i]);
        }
        ExtUtil.write(dataOutputStream, new ExtWrapList(vector));
    }

    public static XPathPathExpr fromRef(TreeReference treeReference) {
        XPathPathExpr xPathPathExpr = new XPathPathExpr();
        xPathPathExpr.init_context = treeReference.isAbsolute() ? 0 : 1;
        xPathPathExpr.steps = new XPathStep[treeReference.size()];
        for (int i = 0; i < xPathPathExpr.steps.length; i++) {
            if (treeReference.getName(i).equals(TreeReference.NAME_WILDCARD)) {
                xPathPathExpr.steps[i] = new XPathStep(0, 1);
            } else {
                xPathPathExpr.steps[i] = new XPathStep(0, new XPathQName(treeReference.getName(i)));
            }
        }
        return xPathPathExpr;
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object pivot(FormInstance formInstance, EvaluationContext evaluationContext, Vector<Object> vector, Object obj) throws UnpivotableExpressionException {
        TreeReference reference = getReference();
        return (reference.equals(obj) || reference.getRefLevel() == 0) ? obj : eval(formInstance, evaluationContext);
    }
}
