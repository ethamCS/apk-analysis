package org.javarosa.core.model.condition;

import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.xpath.IExprDataType;
import org.javarosa.xpath.expr.XPathExpression;
/* loaded from: classes.dex */
public class EvaluationContext {
    public IAnswerData candidateValue;
    private TreeReference contextNode;
    private int currentContextPosition;
    private Hashtable<String, FormInstance> formInstances;
    private Hashtable functionHandlers;
    FormInstance instance;
    public boolean isCheckAddChild;
    public boolean isConstraint;
    private TreeReference original;
    private String outputTextForm;
    int[] predicateEvaluationProgress;
    private Hashtable variables;

    private EvaluationContext(EvaluationContext evaluationContext) {
        this.outputTextForm = null;
        this.currentContextPosition = -1;
        this.functionHandlers = evaluationContext.functionHandlers;
        this.formInstances = evaluationContext.formInstances;
        this.variables = evaluationContext.variables;
        this.contextNode = evaluationContext.contextNode;
        this.instance = evaluationContext.instance;
        this.isConstraint = evaluationContext.isConstraint;
        this.candidateValue = evaluationContext.candidateValue;
        this.isCheckAddChild = evaluationContext.isCheckAddChild;
        this.outputTextForm = evaluationContext.outputTextForm;
        this.original = evaluationContext.original;
        this.currentContextPosition = evaluationContext.currentContextPosition;
    }

    public EvaluationContext(EvaluationContext evaluationContext, TreeReference treeReference) {
        this(evaluationContext);
        this.contextNode = treeReference;
    }

    public EvaluationContext(EvaluationContext evaluationContext, Hashtable<String, FormInstance> hashtable, TreeReference treeReference) {
        this(evaluationContext, treeReference);
        this.formInstances = hashtable;
    }

    public EvaluationContext(FormInstance formInstance, Hashtable<String, FormInstance> hashtable, EvaluationContext evaluationContext) {
        this(evaluationContext);
        this.formInstances = hashtable;
        this.instance = formInstance;
    }

    public EvaluationContext(FormInstance formInstance) {
        this(formInstance, new Hashtable());
    }

    public EvaluationContext(FormInstance formInstance, Hashtable<String, FormInstance> hashtable) {
        this.outputTextForm = null;
        this.currentContextPosition = -1;
        this.formInstances = hashtable;
        this.instance = formInstance;
        this.contextNode = TreeReference.rootRef();
        this.functionHandlers = new Hashtable();
        this.variables = new Hashtable();
    }

    public FormInstance getInstance(String str) {
        if (this.formInstances.containsKey(str)) {
            return this.formInstances.get(str);
        }
        if (this.instance != null && str.equals(this.instance.getName())) {
            return this.instance;
        }
        return null;
    }

    public TreeReference getContextRef() {
        return this.contextNode;
    }

    public void setOriginalContext(TreeReference treeReference) {
        this.original = treeReference;
    }

    public TreeReference getOriginalContext() {
        return this.original == null ? this.contextNode : this.original;
    }

    public void addFunctionHandler(IFunctionHandler iFunctionHandler) {
        this.functionHandlers.put(iFunctionHandler.getName(), iFunctionHandler);
    }

    public Hashtable getFunctionHandlers() {
        return this.functionHandlers;
    }

    public void setOutputTextForm(String str) {
        this.outputTextForm = str;
    }

    public String getOutputTextForm() {
        return this.outputTextForm;
    }

    public void setVariables(Hashtable<String, ?> hashtable) {
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            setVariable(nextElement, hashtable.get(nextElement));
        }
    }

    public void setVariable(String str, Object obj) {
        if (obj == null) {
            this.variables.put(str, "");
        } else if ((obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Date) || (obj instanceof IExprDataType)) {
            this.variables.put(str, obj);
        } else if (obj instanceof Integer) {
            this.variables.put(str, new Double(((Integer) obj).doubleValue()));
        } else if (obj instanceof Float) {
            this.variables.put(str, new Double(((Float) obj).doubleValue()));
        } else {
            this.variables.put(str, obj);
        }
    }

    public Object getVariable(String str) {
        return this.variables.get(str);
    }

    public Vector<TreeReference> expandReference(TreeReference treeReference) {
        return expandReference(treeReference, false);
    }

    public Vector<TreeReference> expandReference(TreeReference treeReference, boolean z) {
        FormInstance formInstance;
        if (!treeReference.isAbsolute()) {
            return null;
        }
        if (treeReference.getInstanceName() != null) {
            formInstance = getInstance(treeReference.getInstanceName());
        } else {
            formInstance = this.instance;
        }
        if (formInstance == null) {
            throw new RuntimeException("Unable to expand reference " + treeReference.toString(true) + ", no appropriate instance in evaluation context");
        }
        Vector<TreeReference> vector = new Vector<>();
        expandReference(treeReference, formInstance, formInstance.getRoot().getRef(), vector, z);
        return vector;
    }

    private void expandReference(TreeReference treeReference, FormInstance formInstance, TreeReference treeReference2, Vector<TreeReference> vector, boolean z) {
        TreeElement child;
        TreeElement child2;
        int size = treeReference2.size();
        if (size == treeReference.size()) {
            vector.addElement(treeReference2);
            return;
        }
        String name = treeReference.getName(size);
        Vector<XPathExpression> predicate = treeReference.getPredicate(size);
        if (predicate != null) {
            Vector<XPathExpression> vector2 = new Vector<>();
            Iterator<XPathExpression> it = predicate.iterator();
            while (it.hasNext()) {
                vector2.addElement(it.next());
            }
            predicate = vector2;
        }
        int multiplicity = treeReference.getMultiplicity(size);
        Vector vector3 = new Vector();
        TreeElement resolveReference = formInstance.resolveReference(treeReference2);
        if (resolveReference.getNumChildren() > 0) {
            if (multiplicity == -1) {
                int childMultiplicity = resolveReference.getChildMultiplicity(name);
                for (int i = 0; i < childMultiplicity; i++) {
                    TreeElement child3 = resolveReference.getChild(name, i);
                    if (child3 != null) {
                        vector3.addElement(child3.getRef());
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (z && (child2 = resolveReference.getChild(name, -2)) != null) {
                    vector3.addElement(child2.getRef());
                }
            } else if (multiplicity != -4 && (child = resolveReference.getChild(name, multiplicity)) != null) {
                vector3.addElement(child.getRef());
            }
        }
        if (multiplicity == -4) {
            vector3.addElement(resolveReference.getAttribute(null, name).getRef());
        }
        if (predicate != null && this.predicateEvaluationProgress != null) {
            int[] iArr = this.predicateEvaluationProgress;
            iArr[1] = iArr[1] + vector3.size();
        }
        if (predicate != null) {
            Vector vector4 = new Vector();
            Iterator<XPathExpression> it2 = predicate.iterator();
            boolean z2 = true;
            while (it2.hasNext()) {
                XPathExpression next = it2.next();
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= vector3.size()) {
                        break;
                    }
                    TreeReference treeReference3 = (TreeReference) vector3.elementAt(i3);
                    Object eval = next.eval(formInstance, rescope(treeReference3, z2 ? treeReference3.getMultLast() : i3));
                    if ((eval instanceof Boolean) && ((Boolean) eval).booleanValue()) {
                        vector4.addElement(treeReference3);
                    }
                    i2 = i3 + 1;
                }
                vector3.clear();
                vector3.addAll(vector4);
                vector4.clear();
                if (this.predicateEvaluationProgress != null) {
                    int[] iArr2 = this.predicateEvaluationProgress;
                    iArr2[0] = iArr2[0] + 1;
                }
                z2 = false;
            }
        }
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 < vector3.size()) {
                expandReference(treeReference, formInstance, (TreeReference) vector3.elementAt(i5), vector, z);
                i4 = i5 + 1;
            } else {
                return;
            }
        }
    }

    private EvaluationContext rescope(TreeReference treeReference, int i) {
        EvaluationContext evaluationContext = new EvaluationContext(this, treeReference);
        evaluationContext.currentContextPosition = i;
        if (this.original != null) {
            evaluationContext.setOriginalContext(getOriginalContext());
        } else if (TreeReference.rootRef().equals(getContextRef())) {
            evaluationContext.setOriginalContext(treeReference);
        } else {
            evaluationContext.setOriginalContext(getContextRef());
        }
        return evaluationContext;
    }

    public FormInstance getMainInstance() {
        return this.instance;
    }

    public TreeElement resolveReference(TreeReference treeReference) {
        FormInstance mainInstance = getMainInstance();
        if (treeReference.getInstanceName() != null) {
            mainInstance = getInstance(treeReference.getInstanceName());
        }
        return mainInstance.resolveReference(treeReference);
    }

    public int getContextPosition() {
        return this.currentContextPosition;
    }

    public void setPredicateProcessSet(int[] iArr) {
        if (iArr != null && iArr.length == 2) {
            this.predicateEvaluationProgress = iArr;
        }
    }
}
