package org.javarosa.core.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.javarosa.core.log.WrappedException;
import org.javarosa.core.model.condition.Condition;
import org.javarosa.core.model.condition.Constraint;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.IConditionExpr;
import org.javarosa.core.model.condition.IFunctionHandler;
import org.javarosa.core.model.condition.Recalculate;
import org.javarosa.core.model.condition.Triggerable;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.InvalidReferenceException;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.model.util.restorable.RestoreUtils;
import org.javarosa.core.model.utils.QuestionPreloader;
import org.javarosa.core.services.locale.Localizable;
import org.javarosa.core.services.locale.Localizer;
import org.javarosa.core.services.storage.IMetaData;
import org.javarosa.core.services.storage.Persistable;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapList;
import org.javarosa.core.util.externalizable.ExtWrapListPoly;
import org.javarosa.core.util.externalizable.ExtWrapMap;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.model.xform.XPathReference;
/* loaded from: classes.dex */
public class FormDef implements IFormElement, Localizable, Persistable, IMetaData {
    private static String DEFAULT_SUBMISSION_PROFILE = "1";
    public static final String STORAGE_KEY = "FORMDEF";
    public static final int TEMPLATING_RECURSION_LIMIT = 10;
    private Vector children;
    private Hashtable conditionRepeatTargetIndex;
    public EvaluationContext exprEvalContext;
    private int id;
    private Localizer localizer;
    private String name;
    private String title;
    private QuestionPreloader preloader = new QuestionPreloader();
    private FormInstance mainInstance = null;
    public Vector triggerables = new Vector();
    private boolean triggerablesInOrder = true;
    public Hashtable triggerIndex = new Hashtable();
    private Vector outputFragments = new Vector();
    private Hashtable<String, SubmissionProfile> submissionProfiles = new Hashtable<>();
    private Hashtable<String, FormInstance> formInstances = new Hashtable<>();

    public FormDef() {
        setID(-1);
        setChildren(null);
        setEvaluationContext(new EvaluationContext((FormInstance) null));
    }

    public void addNonMainInstance(FormInstance formInstance) {
        this.formInstances.put(formInstance.getName(), formInstance);
        setEvaluationContext(new EvaluationContext((FormInstance) null));
    }

    public FormInstance getNonMainInstance(String str) {
        if (!this.formInstances.containsKey(str)) {
            return null;
        }
        return this.formInstances.get(str);
    }

    public Enumeration getNonMainInstances() {
        return this.formInstances.elements();
    }

    public void setInstance(FormInstance formInstance) {
        this.mainInstance = formInstance;
        formInstance.setFormId(getID());
        setEvaluationContext(new EvaluationContext((FormInstance) null));
        attachControlsToInstanceData();
    }

    public FormInstance getMainInstance() {
        return this.mainInstance;
    }

    public FormInstance getInstance() {
        return getMainInstance();
    }

    @Override // org.javarosa.core.model.IFormElement
    public void addChild(IFormElement iFormElement) {
        this.children.addElement(iFormElement);
    }

    @Override // org.javarosa.core.model.IFormElement
    public IFormElement getChild(int i) {
        if (i < this.children.size()) {
            return (IFormElement) this.children.elementAt(i);
        }
        throw new ArrayIndexOutOfBoundsException("FormDef: invalid child index: " + i + " only " + this.children.size() + " children");
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.javarosa.core.model.IFormElement] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.javarosa.core.model.IFormElement getChild(org.javarosa.core.model.FormIndex r2) {
        /*
            r1 = this;
        L0:
            if (r2 == 0) goto L15
            boolean r0 = r2.isInForm()
            if (r0 == 0) goto L15
            int r0 = r2.getLocalIndex()
            org.javarosa.core.model.IFormElement r1 = r1.getChild(r0)
            org.javarosa.core.model.FormIndex r2 = r2.getNextLevel()
            goto L0
        L15:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.javarosa.core.model.FormDef.getChild(org.javarosa.core.model.FormIndex):org.javarosa.core.model.IFormElement");
    }

    public Vector explodeIndex(FormIndex formIndex) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        collapseIndex(formIndex, vector, vector2, vector3);
        return vector3;
    }

    public TreeReference getChildInstanceRef(FormIndex formIndex) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        collapseIndex(formIndex, vector, vector2, vector3);
        return getChildInstanceRef(vector3, vector2);
    }

    public TreeReference getChildInstanceRef(Vector vector, Vector vector2) {
        TreeReference unpackReference;
        if (vector.size() == 0) {
            return null;
        }
        TreeReference clone = FormInstance.unpackReference(((IFormElement) vector.lastElement()).getBind()).clone();
        for (int i = 0; i < clone.size(); i++) {
            if (clone.getMultiplicity(i) != -4) {
                clone.setMultiplicity(i, 0);
            }
        }
        for (int i2 = 0; i2 < vector.size(); i2++) {
            IFormElement iFormElement = (IFormElement) vector.elementAt(i2);
            if ((iFormElement instanceof GroupDef) && ((GroupDef) iFormElement).getRepeat()) {
                if (!FormInstance.unpackReference(iFormElement.getBind()).isParentOf(clone, false)) {
                    return null;
                }
                clone.setMultiplicity(unpackReference.size() - 1, ((Integer) vector2.elementAt(i2)).intValue());
            }
        }
        return clone;
    }

    public void setLocalizer(Localizer localizer) {
        if (this.localizer != null) {
            this.localizer.unregisterLocalizable(this);
        }
        this.localizer = localizer;
        if (this.localizer != null) {
            this.localizer.registerLocalizable(this);
        }
    }

    @Override // org.javarosa.core.model.IFormElement
    public IDataReference getBind() {
        throw new RuntimeException("method not implemented");
    }

    public void setValue(IAnswerData iAnswerData, TreeReference treeReference) {
        setValue(iAnswerData, treeReference, this.mainInstance.resolveReference(treeReference));
    }

    public void setValue(IAnswerData iAnswerData, TreeReference treeReference, TreeElement treeElement) {
        setAnswer(iAnswerData, treeElement);
        triggerTriggerables(treeReference);
    }

    public void setAnswer(IAnswerData iAnswerData, TreeReference treeReference) {
        setAnswer(iAnswerData, this.mainInstance.resolveReference(treeReference));
    }

    public void setAnswer(IAnswerData iAnswerData, TreeElement treeElement) {
        treeElement.setAnswer(iAnswerData);
    }

    public FormIndex deleteRepeat(FormIndex formIndex) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        collapseIndex(formIndex, vector, vector2, vector3);
        for (int size = vector3.size() - 1; size >= 0; size--) {
            IFormElement iFormElement = (IFormElement) vector3.elementAt(size);
            if ((iFormElement instanceof GroupDef) && ((GroupDef) iFormElement).getRepeat()) {
                break;
            }
            vector.removeElementAt(size);
            vector2.removeElementAt(size);
            vector3.removeElementAt(size);
        }
        FormIndex buildIndex = buildIndex(vector, vector2, vector3);
        TreeReference childInstanceRef = getChildInstanceRef(buildIndex);
        TreeElement resolveReference = this.mainInstance.resolveReference(childInstanceRef);
        TreeElement resolveReference2 = this.mainInstance.resolveReference(childInstanceRef.getParentRef());
        int mult = resolveReference.getMult();
        resolveReference2.removeChild(resolveReference);
        for (int i = 0; i < resolveReference2.getNumChildren(); i++) {
            TreeElement childAt = resolveReference2.getChildAt(i);
            if (childAt.getName().equals(resolveReference.getName()) && childAt.getMult() > mult) {
                childAt.setMult(childAt.getMult() - 1);
            }
        }
        triggerTriggerables(childInstanceRef);
        return buildIndex;
    }

    public void createNewRepeat(FormIndex formIndex) throws InvalidReferenceException {
        TreeReference childInstanceRef = getChildInstanceRef(formIndex);
        this.mainInstance.copyNode(this.mainInstance.getTemplate(childInstanceRef), childInstanceRef);
        preloadInstance(this.mainInstance.resolveReference(childInstanceRef));
        triggerTriggerables(childInstanceRef);
        initializeTriggerables(childInstanceRef);
    }

    public boolean isRepeatRelevant(TreeReference treeReference) {
        boolean z;
        Condition condition = (Condition) this.conditionRepeatTargetIndex.get(treeReference.genericize());
        if (condition == null) {
            z = true;
        } else {
            z = condition.evalBool(this.mainInstance, new EvaluationContext(this.exprEvalContext, treeReference));
        }
        if (z) {
            return this.mainInstance.resolveReference(this.mainInstance.getTemplate(treeReference).getParent().getRef().genericize().contextualize(treeReference)).isRelevant();
        }
        return z;
    }

    public boolean canCreateRepeat(TreeReference treeReference, FormIndex formIndex) {
        GroupDef groupDef = (GroupDef) getChild(formIndex);
        if (groupDef.noAddRemove) {
            if (groupDef.getCountReference() == null) {
                return false;
            }
            int elementMultiplicity = formIndex.getElementMultiplicity();
            TreeElement resolveReference = getMainInstance().resolveReference(FormInstance.unpackReference(groupDef.getCountReference()).contextualize(treeReference));
            if (resolveReference == null) {
                throw new RuntimeException("Could not locate the repeat count value expected at " + groupDef.getCountReference().getReference().toString());
            }
            IAnswerData value = resolveReference.getValue();
            if ((value == null ? 0L : ((Integer) value.getValue()).intValue()) <= elementMultiplicity) {
                return false;
            }
        }
        return true;
    }

    public void copyItemsetAnswer(QuestionDef questionDef, TreeElement treeElement, IAnswerData iAnswerData) throws InvalidReferenceException {
        Vector vector;
        ItemsetBinding dynamicChoices = questionDef.getDynamicChoices();
        TreeReference contextualize = dynamicChoices.getDestRef().contextualize(treeElement.getRef());
        Vector vector2 = new Vector();
        if (iAnswerData instanceof SelectMultiData) {
            vector = (Vector) iAnswerData.getValue();
        } else if (!(iAnswerData instanceof SelectOneData)) {
            vector = null;
        } else {
            vector = new Vector();
            vector.addElement((Selection) iAnswerData.getValue());
        }
        if (dynamicChoices.valueRef != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= vector.size()) {
                    break;
                }
                vector2.addElement(((Selection) vector.elementAt(i2)).choice.getValue());
                i = i2 + 1;
            }
        }
        Hashtable hashtable = new Hashtable();
        Vector<TreeReference> expandReference = this.exprEvalContext.expandReference(contextualize);
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= expandReference.size()) {
                break;
            }
            TreeElement resolveReference = getMainInstance().resolveReference(expandReference.elementAt(i4));
            if (dynamicChoices.valueRef != null) {
                String evalReadable = dynamicChoices.getRelativeValue().evalReadable(getMainInstance(), new EvaluationContext(this.exprEvalContext, resolveReference.getRef()));
                if (vector2.contains(evalReadable)) {
                    hashtable.put(evalReadable, resolveReference);
                }
            }
            treeElement.removeChild(resolveReference);
            i3 = i4 + 1;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 < vector.size()) {
                SelectChoice selectChoice = ((Selection) vector.elementAt(i6)).choice;
                TreeElement treeElement2 = null;
                if (dynamicChoices.valueRef != null) {
                    String value = selectChoice.getValue();
                    if (hashtable.containsKey(value)) {
                        treeElement2 = (TreeElement) hashtable.get(value);
                    }
                }
                if (treeElement2 != null) {
                    treeElement2.setMult(i6);
                    treeElement.addChild(treeElement2);
                } else {
                    getMainInstance().copyItemsetNode(selectChoice.copyNode, contextualize, this);
                }
                i5 = i6 + 1;
            } else {
                triggerTriggerables(contextualize);
                initializeTriggerables(contextualize);
                return;
            }
        }
    }

    public Triggerable addTriggerable(Triggerable triggerable) {
        int i = 0;
        int indexOf = this.triggerables.indexOf(triggerable);
        if (indexOf >= 0) {
            Triggerable triggerable2 = (Triggerable) this.triggerables.elementAt(indexOf);
            triggerable2.contextRef = triggerable2.contextRef.intersect(triggerable.contextRef);
            return triggerable2;
        }
        this.triggerables.addElement(triggerable);
        this.triggerablesInOrder = false;
        Vector<TreeReference> triggers = triggerable.getTriggers();
        while (true) {
            int i2 = i;
            if (i2 >= triggers.size()) {
                return triggerable;
            }
            TreeReference elementAt = triggers.elementAt(i2);
            if (!this.triggerIndex.containsKey(elementAt)) {
                this.triggerIndex.put(elementAt.clone(), new Vector());
            }
            Vector vector = (Vector) this.triggerIndex.get(elementAt);
            if (!vector.contains(triggerable)) {
                vector.addElement(triggerable);
            }
            i = i2 + 1;
        }
    }

    public void finalizeTriggerables() {
        Vector vector = new Vector();
        for (int i = 0; i < this.triggerables.size(); i++) {
            Triggerable triggerable = (Triggerable) this.triggerables.elementAt(i);
            Vector vector2 = new Vector();
            if (triggerable.canCascade()) {
                for (int i2 = 0; i2 < triggerable.getTargets().size(); i2++) {
                    Vector vector3 = (Vector) this.triggerIndex.get(triggerable.getTargets().elementAt(i2));
                    if (vector3 != null) {
                        for (int i3 = 0; i3 < vector3.size(); i3++) {
                            Triggerable triggerable2 = (Triggerable) vector3.elementAt(i3);
                            if (!vector2.contains(triggerable2)) {
                                vector2.addElement(triggerable2);
                            }
                        }
                    }
                }
            }
            for (int i4 = 0; i4 < vector2.size(); i4++) {
                vector.addElement(new Triggerable[]{triggerable, (Triggerable) vector2.elementAt(i4)});
            }
        }
        Vector vector4 = new Vector();
        for (int i5 = 0; i5 < this.triggerables.size(); i5++) {
            vector4.addElement(this.triggerables.elementAt(i5));
        }
        this.triggerables.removeAllElements();
        while (vector4.size() > 0) {
            Vector vector5 = new Vector();
            for (int i6 = 0; i6 < vector4.size(); i6++) {
                vector5.addElement(vector4.elementAt(i6));
            }
            for (int i7 = 0; i7 < vector.size(); i7++) {
                vector5.removeElement(((Triggerable[]) vector.elementAt(i7))[1]);
            }
            if (vector5.size() == 0) {
                throw new RuntimeException("Cannot create partial ordering of triggerables due to dependency cycle. Why wasn't this caught during parsing?");
            }
            for (int i8 = 0; i8 < vector5.size(); i8++) {
                Triggerable triggerable3 = (Triggerable) vector5.elementAt(i8);
                this.triggerables.addElement(triggerable3);
                vector4.removeElement(triggerable3);
            }
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (vector5.contains(((Triggerable[]) vector.elementAt(size))[0])) {
                    vector.removeElementAt(size);
                }
            }
        }
        this.triggerablesInOrder = true;
        this.conditionRepeatTargetIndex = new Hashtable();
        for (int i9 = 0; i9 < this.triggerables.size(); i9++) {
            Triggerable triggerable4 = (Triggerable) this.triggerables.elementAt(i9);
            if (triggerable4 instanceof Condition) {
                Vector<TreeReference> targets = triggerable4.getTargets();
                for (int i10 = 0; i10 < targets.size(); i10++) {
                    TreeReference elementAt = targets.elementAt(i10);
                    if (this.mainInstance.getTemplate(elementAt) != null) {
                        this.conditionRepeatTargetIndex.put(elementAt, (Condition) triggerable4);
                    }
                }
            }
        }
    }

    public void initializeTriggerables() {
        initializeTriggerables(TreeReference.rootRef());
    }

    private void initializeTriggerables(TreeReference treeReference) {
        TreeReference genericize = treeReference.genericize();
        Vector vector = new Vector();
        for (int i = 0; i < this.triggerables.size(); i++) {
            Triggerable triggerable = (Triggerable) this.triggerables.elementAt(i);
            int i2 = 0;
            while (true) {
                if (i2 < triggerable.getTargets().size()) {
                    if (!genericize.isParentOf(triggerable.getTargets().elementAt(i2), false)) {
                        i2++;
                    } else {
                        vector.addElement(triggerable);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        evaluateTriggerables(vector, treeReference);
    }

    public void triggerTriggerables(TreeReference treeReference) {
        Vector vector = (Vector) this.triggerIndex.get(treeReference.genericize());
        if (vector != null) {
            Vector vector2 = new Vector();
            for (int i = 0; i < vector.size(); i++) {
                vector2.addElement(vector.elementAt(i));
            }
            evaluateTriggerables(vector2, treeReference);
        }
    }

    private void evaluateTriggerables(Vector vector, TreeReference treeReference) {
        for (int i = 0; i < vector.size(); i++) {
            Triggerable triggerable = (Triggerable) vector.elementAt(i);
            if (triggerable.canCascade()) {
                for (int i2 = 0; i2 < triggerable.getTargets().size(); i2++) {
                    Vector vector2 = (Vector) this.triggerIndex.get(triggerable.getTargets().elementAt(i2));
                    if (vector2 != null) {
                        for (int i3 = 0; i3 < vector2.size(); i3++) {
                            Triggerable triggerable2 = (Triggerable) vector2.elementAt(i3);
                            if (!vector.contains(triggerable2)) {
                                vector.addElement(triggerable2);
                            }
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < this.triggerables.size(); i4++) {
            Triggerable triggerable3 = (Triggerable) this.triggerables.elementAt(i4);
            if (vector.contains(triggerable3)) {
                evaluateTriggerable(triggerable3, treeReference);
            }
        }
    }

    private void evaluateTriggerable(Triggerable triggerable, TreeReference treeReference) {
        Vector<TreeReference> expandReference = this.exprEvalContext.expandReference(triggerable.contextRef.contextualize(treeReference));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < expandReference.size()) {
                triggerable.apply(this.mainInstance, new EvaluationContext(this.exprEvalContext, expandReference.elementAt(i2)), expandReference.elementAt(i2), this);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public boolean evaluateConstraint(TreeReference treeReference, IAnswerData iAnswerData) {
        Constraint constraint;
        if (iAnswerData == null || (constraint = this.mainInstance.resolveReference(treeReference).getConstraint()) == null) {
            return true;
        }
        EvaluationContext evaluationContext = new EvaluationContext(this.exprEvalContext, treeReference);
        evaluationContext.isConstraint = true;
        evaluationContext.candidateValue = iAnswerData;
        return constraint.constraint.eval(this.mainInstance, evaluationContext);
    }

    public void setEvaluationContext(EvaluationContext evaluationContext) {
        EvaluationContext evaluationContext2 = new EvaluationContext(this.mainInstance, this.formInstances, evaluationContext);
        initEvalContext(evaluationContext2);
        this.exprEvalContext = evaluationContext2;
    }

    public EvaluationContext getEvaluationContext() {
        return this.exprEvalContext;
    }

    private void initEvalContext(EvaluationContext evaluationContext) {
        if (!evaluationContext.getFunctionHandlers().containsKey("jr:itext")) {
            evaluationContext.addFunctionHandler(new IFunctionHandler() { // from class: org.javarosa.core.model.FormDef.1
                @Override // org.javarosa.core.model.condition.IFunctionHandler
                public String getName() {
                    return "jr:itext";
                }

                @Override // org.javarosa.core.model.condition.IFunctionHandler
                public Object eval(Object[] objArr, EvaluationContext evaluationContext2) {
                    String str;
                    String str2 = (String) objArr[0];
                    try {
                        String outputTextForm = evaluationContext2.getOutputTextForm();
                        if (outputTextForm != null) {
                            str = this.getLocalizer().getRawText(this.getLocalizer().getLocale(), str2 + ";" + outputTextForm);
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            String text = this.getLocalizer().getText(str2);
                            str = text == null ? "[itext:" + str2 + "]" : text;
                        }
                        return str;
                    } catch (NoSuchElementException e) {
                        return "[nolocale]";
                    }
                }

                @Override // org.javarosa.core.model.condition.IFunctionHandler
                public Vector getPrototypes() {
                    Vector vector = new Vector();
                    vector.addElement(new Class[]{String.class});
                    return vector;
                }

                @Override // org.javarosa.core.model.condition.IFunctionHandler
                public boolean rawArgs() {
                    return false;
                }

                @Override // org.javarosa.core.model.condition.IFunctionHandler
                public boolean realTime() {
                    return false;
                }
            });
        }
        if (!evaluationContext.getFunctionHandlers().containsKey("jr:choice-name")) {
            evaluationContext.addFunctionHandler(new IFunctionHandler() { // from class: org.javarosa.core.model.FormDef.2
                @Override // org.javarosa.core.model.condition.IFunctionHandler
                public String getName() {
                    return "jr:choice-name";
                }

                @Override // org.javarosa.core.model.condition.IFunctionHandler
                public Object eval(Object[] objArr, EvaluationContext evaluationContext2) {
                    try {
                        String str = (String) objArr[0];
                        TreeReference ref = RestoreUtils.xfFact.ref((String) objArr[1]);
                        FormDef formDef = this;
                        QuestionDef findQuestionByRef = FormDef.findQuestionByRef(ref, this);
                        if (findQuestionByRef == null || (findQuestionByRef.getControlType() != 2 && findQuestionByRef.getControlType() != 3)) {
                            return "";
                        }
                        System.out.println("here!!");
                        Iterator<SelectChoice> it = findQuestionByRef.getChoices().iterator();
                        while (it.hasNext()) {
                            SelectChoice next = it.next();
                            if (next.getValue().equals(str)) {
                                String textID = next.getTextID();
                                if (textID != null) {
                                    return this.getLocalizer().getText(textID);
                                }
                                return next.getLabelInnerText();
                            }
                        }
                        return "";
                    } catch (Exception e) {
                        throw new WrappedException("error in evaluation of xpath function [choice-name]", e);
                    }
                }

                @Override // org.javarosa.core.model.condition.IFunctionHandler
                public Vector getPrototypes() {
                    Vector vector = new Vector();
                    vector.addElement(new Class[]{String.class, String.class});
                    return vector;
                }

                @Override // org.javarosa.core.model.condition.IFunctionHandler
                public boolean rawArgs() {
                    return false;
                }

                @Override // org.javarosa.core.model.condition.IFunctionHandler
                public boolean realTime() {
                    return false;
                }
            });
        }
    }

    public String fillTemplateString(String str, TreeReference treeReference) {
        return fillTemplateString(str, treeReference, new Hashtable<>());
    }

    public String fillTemplateString(String str, TreeReference treeReference, Hashtable<String, ?> hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Vector args = Localizer.getArgs(str);
        int i = 0;
        while (args.size() > 0) {
            for (int i2 = 0; i2 < args.size(); i2++) {
                String str2 = (String) args.elementAt(i2);
                if (!hashtable2.containsKey(str2)) {
                    int i3 = -1;
                    try {
                        i3 = Integer.parseInt(str2);
                    } catch (NumberFormatException e) {
                        System.err.println("Warning: expect arguments to be numeric [" + str2 + "]");
                    }
                    if (i3 >= 0 && i3 < this.outputFragments.size()) {
                        EvaluationContext evaluationContext = new EvaluationContext(this.exprEvalContext, treeReference);
                        evaluationContext.setOriginalContext(treeReference);
                        evaluationContext.setVariables(hashtable);
                        hashtable2.put(str2, ((IConditionExpr) this.outputFragments.elementAt(i3)).evalReadable(getMainInstance(), evaluationContext));
                    }
                }
            }
            str = Localizer.processArguments(str, hashtable2);
            Vector args2 = Localizer.getArgs(str);
            int i4 = i + 1;
            if (i4 >= 10) {
                throw new RuntimeException("Dependency cycle in <output>s; recursion limit exceeded!!");
            }
            args = args2;
            i = i4;
        }
        return str;
    }

    public void populateDynamicChoices(ItemsetBinding itemsetBinding, TreeReference treeReference) {
        FormInstance mainInstance;
        Vector<SelectChoice> vector = new Vector<>();
        Vector<TreeReference> evalNodeset = itemsetBinding.nodesetExpr.evalNodeset(getMainInstance(), new EvaluationContext(this.exprEvalContext, itemsetBinding.contextRef.contextualize(treeReference)));
        if (itemsetBinding.nodesetRef.getInstanceName() != null) {
            FormInstance nonMainInstance = getNonMainInstance(itemsetBinding.nodesetRef.getInstanceName());
            if (nonMainInstance == null) {
                System.out.println("Instance " + itemsetBinding.nodesetRef.getInstanceName() + " not found");
                mainInstance = nonMainInstance;
            } else {
                mainInstance = nonMainInstance;
            }
        } else {
            mainInstance = getMainInstance();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= evalNodeset.size()) {
                break;
            }
            TreeReference elementAt = evalNodeset.elementAt(i2);
            String evalReadable = itemsetBinding.labelExpr.evalReadable(mainInstance, new EvaluationContext(this.exprEvalContext, elementAt));
            TreeElement resolveReference = itemsetBinding.copyMode ? getMainInstance().resolveReference(itemsetBinding.copyRef.contextualize(elementAt)) : null;
            String evalReadable2 = itemsetBinding.valueRef != null ? itemsetBinding.valueExpr.evalReadable(mainInstance, new EvaluationContext(this.exprEvalContext, elementAt)) : null;
            if (evalReadable2 == null) {
                evalReadable2 = "dynamic:" + i2;
            }
            SelectChoice selectChoice = new SelectChoice(evalReadable, evalReadable2, itemsetBinding.labelIsItext);
            selectChoice.setIndex(i2);
            if (itemsetBinding.copyMode) {
                selectChoice.copyNode = resolveReference;
            }
            vector.addElement(selectChoice);
            i = i2 + 1;
        }
        if (vector.size() == 0) {
            System.out.println("Dynamic select question has no choices! [" + itemsetBinding.nodesetRef + "]. If this occurs while filling out a form (and not while saving an incomplete form), the filter condition may have eliminated all the choices. Is that what you intended?\n");
        }
        itemsetBinding.setChoices(vector, getLocalizer());
    }

    public QuestionPreloader getPreloader() {
        return this.preloader;
    }

    public void setPreloader(QuestionPreloader questionPreloader) {
        this.preloader = questionPreloader;
    }

    @Override // org.javarosa.core.services.locale.Localizable
    public void localeChanged(String str, Localizer localizer) {
        Enumeration elements = this.children.elements();
        while (elements.hasMoreElements()) {
            ((IFormElement) elements.nextElement()).localeChanged(str, localizer);
        }
    }

    public String toString() {
        return getTitle();
    }

    public void preloadInstance(TreeElement treeElement) {
        IAnswerData iAnswerData = null;
        if (treeElement.getPreloadHandler() != null) {
            iAnswerData = this.preloader.getQuestionPreload(treeElement.getPreloadHandler(), treeElement.getPreloadParams());
        }
        if (iAnswerData != null) {
            treeElement.setAnswer(iAnswerData);
        }
        if (!treeElement.isLeaf()) {
            for (int i = 0; i < treeElement.getNumChildren(); i++) {
                TreeElement childAt = treeElement.getChildAt(i);
                if (childAt.getMult() != -2) {
                    preloadInstance(childAt);
                }
            }
        }
    }

    public boolean postProcessInstance() {
        return postProcessInstance(this.mainInstance.getRoot());
    }

    private boolean postProcessInstance(TreeElement treeElement) {
        if (treeElement.isLeaf()) {
            if (treeElement.getPreloadHandler() == null) {
                return false;
            }
            return this.preloader.questionPostProcess(treeElement, treeElement.getPreloadHandler(), treeElement.getPreloadParams());
        }
        boolean z = false;
        for (int i = 0; i < treeElement.getNumChildren(); i++) {
            TreeElement childAt = treeElement.getChildAt(i);
            if (childAt.getMult() != -2) {
                z |= postProcessInstance(childAt);
            }
        }
        return z;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        setID(ExtUtil.readInt(dataInputStream));
        setName(ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream)));
        setTitle((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setChildren((Vector) ExtUtil.read(dataInputStream, new ExtWrapListPoly(), prototypeFactory));
        setInstance((FormInstance) ExtUtil.read(dataInputStream, FormInstance.class, prototypeFactory));
        setLocalizer((Localizer) ExtUtil.read(dataInputStream, new ExtWrapNullable(Localizer.class), prototypeFactory));
        Enumeration elements = ((Vector) ExtUtil.read(dataInputStream, new ExtWrapList(Condition.class), prototypeFactory)).elements();
        while (elements.hasMoreElements()) {
            addTriggerable((Condition) elements.nextElement());
        }
        Enumeration elements2 = ((Vector) ExtUtil.read(dataInputStream, new ExtWrapList(Recalculate.class), prototypeFactory)).elements();
        while (elements2.hasMoreElements()) {
            addTriggerable((Recalculate) elements2.nextElement());
        }
        finalizeTriggerables();
        this.outputFragments = (Vector) ExtUtil.read(dataInputStream, new ExtWrapListPoly(), prototypeFactory);
        this.submissionProfiles = (Hashtable) ExtUtil.read(dataInputStream, new ExtWrapMap(String.class, SubmissionProfile.class));
        this.formInstances = (Hashtable) ExtUtil.read(dataInputStream, new ExtWrapMap(String.class, FormInstance.class));
        setEvaluationContext(new EvaluationContext((FormInstance) null));
    }

    public void initialize(boolean z) {
        if (z) {
            preloadInstance(this.mainInstance.getRoot());
        }
        if (getLocalizer() != null && getLocalizer().getLocale() == null) {
            getLocalizer().setToDefault();
        }
        initializeTriggerables();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, getID());
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(getName()));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getTitle()));
        ExtUtil.write(dataOutputStream, new ExtWrapListPoly(getChildren()));
        ExtUtil.write(dataOutputStream, getMainInstance());
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.localizer));
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.triggerables.size()) {
                Triggerable triggerable = (Triggerable) this.triggerables.elementAt(i2);
                if (triggerable instanceof Condition) {
                    vector.addElement(triggerable);
                } else if (triggerable instanceof Recalculate) {
                    vector2.addElement(triggerable);
                }
                i = i2 + 1;
            } else {
                ExtUtil.write(dataOutputStream, new ExtWrapList(vector));
                ExtUtil.write(dataOutputStream, new ExtWrapList(vector2));
                ExtUtil.write(dataOutputStream, new ExtWrapListPoly(this.outputFragments));
                ExtUtil.write(dataOutputStream, new ExtWrapMap(this.submissionProfiles));
                ExtUtil.write(dataOutputStream, new ExtWrapMap(this.formInstances));
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [org.javarosa.core.model.IFormElement] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public void collapseIndex(FormIndex formIndex, Vector vector, Vector vector2, Vector vector3) {
        ?? r3 = this;
        if (formIndex.isInForm()) {
            while (formIndex != null) {
                int localIndex = formIndex.getLocalIndex();
                IFormElement child = r3.getChild(localIndex);
                vector.addElement(new Integer(localIndex));
                vector2.addElement(new Integer(formIndex.getInstanceIndex() == -1 ? 0 : formIndex.getInstanceIndex()));
                vector3.addElement(child);
                formIndex = formIndex.getNextLevel();
                r3 = child;
            }
        }
    }

    public FormIndex buildIndex(Vector vector, Vector vector2, Vector vector3) {
        Vector vector4 = new Vector();
        for (int i = 0; i < vector2.size(); i++) {
            vector4.addElement(vector2.elementAt(i));
        }
        Vector vector5 = new Vector();
        for (int i2 = 0; i2 < vector3.size(); i2++) {
            vector5.addElement(vector3.elementAt(i2));
        }
        int size = vector.size() - 1;
        FormIndex formIndex = null;
        while (size >= 0) {
            int intValue = ((Integer) vector.elementAt(size)).intValue();
            int intValue2 = ((Integer) vector2.elementAt(size)).intValue();
            IFormElement iFormElement = (IFormElement) vector3.elementAt(size);
            XPathReference xPathReference = iFormElement != null ? (XPathReference) iFormElement.getBind() : null;
            if (xPathReference != null) {
                TreeReference treeReference = (TreeReference) xPathReference.getReference();
            }
            FormIndex formIndex2 = new FormIndex(formIndex, intValue, (!(vector3.elementAt(size) instanceof GroupDef) || !((GroupDef) vector3.elementAt(size)).getRepeat()) ? -1 : intValue2, getChildInstanceRef(vector5, vector4));
            vector4.removeElementAt(vector4.size() - 1);
            vector5.removeElementAt(vector5.size() - 1);
            size--;
            formIndex = formIndex2;
        }
        return formIndex;
    }

    public int getNumRepetitions(FormIndex formIndex) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        if (!formIndex.isInForm()) {
            throw new RuntimeException("not an in-form index");
        }
        collapseIndex(formIndex, vector, vector2, vector3);
        if (!(vector3.lastElement() instanceof GroupDef) || !((GroupDef) vector3.lastElement()).getRepeat()) {
            throw new RuntimeException("current element not a repeat");
        }
        TreeElement template = this.mainInstance.getTemplate(formIndex.getReference());
        return this.mainInstance.resolveReference(template.getParent().getRef().genericize().contextualize(formIndex.getReference())).getChildMultiplicity(template.getName());
    }

    public FormIndex descendIntoRepeat(FormIndex formIndex, int i) {
        int numRepetitions = getNumRepetitions(formIndex);
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        collapseIndex(formIndex, vector, vector2, vector3);
        if (i == -1) {
            i = numRepetitions;
        } else if (i < 0 || i >= numRepetitions) {
            throw new RuntimeException("selection exceeds current number of repetitions");
        }
        vector2.setElementAt(new Integer(i), vector2.size() - 1);
        return buildIndex(vector, vector2, vector3);
    }

    @Override // org.javarosa.core.model.IFormElement
    public int getDeepChildCount() {
        int i = 0;
        Enumeration elements = this.children.elements();
        while (true) {
            int i2 = i;
            if (elements.hasMoreElements()) {
                i = ((IFormElement) elements.nextElement()).getDeepChildCount() + i2;
            } else {
                return i2;
            }
        }
    }

    @Override // org.javarosa.core.model.IFormElement
    public void registerStateObserver(FormElementStateListener formElementStateListener) {
    }

    @Override // org.javarosa.core.model.IFormElement
    public void unregisterStateObserver(FormElementStateListener formElementStateListener) {
    }

    @Override // org.javarosa.core.model.IFormElement
    public Vector getChildren() {
        return this.children;
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setChildren(Vector<IFormElement> vector) {
        if (vector == null) {
            vector = new Vector<>();
        }
        this.children = vector;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // org.javarosa.core.model.IFormElement, org.javarosa.core.services.storage.Persistable
    public int getID() {
        return this.id;
    }

    @Override // org.javarosa.core.model.IFormElement, org.javarosa.core.services.storage.Persistable
    public void setID(int i) {
        this.id = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Localizer getLocalizer() {
        return this.localizer;
    }

    public Vector getOutputFragments() {
        return this.outputFragments;
    }

    public void setOutputFragments(Vector vector) {
        this.outputFragments = vector;
    }

    @Override // org.javarosa.core.services.storage.IMetaData
    public Hashtable getMetaData() {
        Hashtable hashtable = new Hashtable();
        String[] metaDataFields = getMetaDataFields();
        for (int i = 0; i < metaDataFields.length; i++) {
            try {
                hashtable.put(metaDataFields[i], getMetaData(metaDataFields[i]));
            } catch (NullPointerException e) {
                if (getMetaData(metaDataFields[i]) == null) {
                    System.out.println("ERROR! XFORM MUST HAVE A NAME!");
                    e.printStackTrace();
                }
            }
        }
        return hashtable;
    }

    @Override // org.javarosa.core.services.storage.IMetaData
    public Object getMetaData(String str) {
        if (str.equals("DESCRIPTOR")) {
            return this.name;
        }
        if (str.equals("XMLNS")) {
            return ExtUtil.emptyIfNull(this.mainInstance.schema);
        }
        throw new IllegalArgumentException();
    }

    @Override // org.javarosa.core.services.storage.IMetaData
    public String[] getMetaDataFields() {
        return new String[]{"DESCRIPTOR", "XMLNS"};
    }

    public void attachControlsToInstanceData() {
        attachControlsToInstanceData(getMainInstance().getRoot());
    }

    private void attachControlsToInstanceData(TreeElement treeElement) {
        Vector vector;
        for (int i = 0; i < treeElement.getNumChildren(); i++) {
            attachControlsToInstanceData(treeElement.getChildAt(i));
        }
        IAnswerData value = treeElement.getValue();
        if (value instanceof SelectOneData) {
            Vector vector2 = new Vector();
            vector2.addElement(value.getValue());
            vector = vector2;
        } else if (!(value instanceof SelectMultiData)) {
            vector = null;
        } else {
            vector = (Vector) value.getValue();
        }
        if (vector != null) {
            QuestionDef findQuestionByRef = findQuestionByRef(treeElement.getRef(), this);
            if (findQuestionByRef == null) {
                throw new RuntimeException("FormDef.attachControlsToInstanceData: can't find question to link");
            }
            if (findQuestionByRef.getDynamicChoices() != null) {
            }
            for (int i2 = 0; i2 < vector.size(); i2++) {
                ((Selection) vector.elementAt(i2)).attachChoice(findQuestionByRef);
            }
        }
    }

    public static QuestionDef findQuestionByRef(TreeReference treeReference, IFormElement iFormElement) {
        if (iFormElement instanceof FormDef) {
            treeReference = treeReference.genericize();
        }
        if (iFormElement instanceof QuestionDef) {
            QuestionDef questionDef = (QuestionDef) iFormElement;
            if (!treeReference.equals(FormInstance.unpackReference(questionDef.getBind()))) {
                return null;
            }
            return questionDef;
        }
        for (int i = 0; i < iFormElement.getChildren().size(); i++) {
            QuestionDef findQuestionByRef = findQuestionByRef(treeReference, iFormElement.getChild(i));
            if (findQuestionByRef != null) {
                return findQuestionByRef;
            }
        }
        return null;
    }

    @Override // org.javarosa.core.model.IFormElement
    public String getAppearanceAttr() {
        throw new RuntimeException("This method call is not relevant for FormDefs getAppearanceAttr ()");
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setAppearanceAttr(String str) {
        throw new RuntimeException("This method call is not relevant for FormDefs setAppearanceAttr()");
    }

    @Override // org.javarosa.core.model.IFormElement
    public String getLabelInnerText() {
        return null;
    }

    @Override // org.javarosa.core.model.IFormElement
    public String getTextID() {
        return null;
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setTextID(String str) {
        throw new RuntimeException("This method call is not relevant for FormDefs [setTextID()]");
    }

    public void setDefaultSubmission(SubmissionProfile submissionProfile) {
        this.submissionProfiles.put(DEFAULT_SUBMISSION_PROFILE, submissionProfile);
    }

    public void addSubmissionProfile(String str, SubmissionProfile submissionProfile) {
        this.submissionProfiles.put(str, submissionProfile);
    }

    public SubmissionProfile getSubmissionProfile() {
        return this.submissionProfiles.get(DEFAULT_SUBMISSION_PROFILE);
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setAdditionalAttribute(String str, String str2, String str3) {
    }

    @Override // org.javarosa.core.model.IFormElement
    public String getAdditionalAttribute(String str, String str2) {
        return null;
    }

    @Override // org.javarosa.core.model.IFormElement
    public Vector<TreeElement> getAdditionalAttributes() {
        return new Vector<>();
    }
}
