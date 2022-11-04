package org.javarosa.form.api;

import java.util.Enumeration;
import java.util.Vector;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.FormIndex;
import org.javarosa.core.model.GroupDef;
import org.javarosa.core.model.IFormElement;
import org.javarosa.core.model.QuestionDef;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.InvalidReferenceException;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
/* loaded from: classes.dex */
public class FormEntryModel {
    public static final int REPEAT_STRUCTURE_LINEAR = 1;
    public static final int REPEAT_STRUCTURE_NON_LINEAR = 2;
    private FormIndex currentFormIndex;
    private FormDef form;
    private int repeatStructure;

    public FormEntryModel(FormDef formDef) {
        this(formDef, 1);
    }

    public FormEntryModel(FormDef formDef, int i) {
        this.repeatStructure = -1;
        this.form = formDef;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(i + ": does not correspond to a valid repeat structure");
        }
        if (i == 2 && containsRepeatGuesses(formDef)) {
            i = 1;
        }
        this.repeatStructure = i;
        this.currentFormIndex = FormIndex.createBeginningOfFormIndex();
    }

    public int getEvent(FormIndex formIndex) {
        if (formIndex.isBeginningOfFormIndex()) {
            return 0;
        }
        if (formIndex.isEndOfFormIndex()) {
            return 1;
        }
        IFormElement child = this.form.getChild(formIndex);
        if (child instanceof GroupDef) {
            if (((GroupDef) child).getRepeat()) {
                if (this.repeatStructure != 2 && this.form.getMainInstance().resolveReference(this.form.getChildInstanceRef(formIndex)) == null) {
                    return 2;
                }
                if (this.repeatStructure == 2 && formIndex.getElementMultiplicity() == -10) {
                    return 32;
                }
                return 16;
            }
            return 8;
        }
        return 4;
    }

    public TreeElement getTreeElement(FormIndex formIndex) {
        return this.form.getMainInstance().resolveReference(formIndex.getReference());
    }

    public int getEvent() {
        return getEvent(this.currentFormIndex);
    }

    public String getFormTitle() {
        return this.form.getTitle();
    }

    public FormEntryPrompt getQuestionPrompt(FormIndex formIndex) {
        if (this.form.getChild(formIndex) instanceof QuestionDef) {
            return new FormEntryPrompt(this.form, formIndex);
        }
        throw new RuntimeException("Invalid query for Question prompt. Non-Question object at the form index");
    }

    public FormEntryPrompt getQuestionPrompt() {
        return getQuestionPrompt(this.currentFormIndex);
    }

    public FormEntryCaption getCaptionPrompt(FormIndex formIndex) {
        return new FormEntryCaption(this.form, formIndex);
    }

    public FormEntryCaption getCaptionPrompt() {
        return getCaptionPrompt(this.currentFormIndex);
    }

    public String[] getLanguages() {
        if (this.form.getLocalizer() != null) {
            return this.form.getLocalizer().getAvailableLocales();
        }
        return null;
    }

    public int getCompletedRelevantQuestionCount() {
        return 0;
    }

    public int getTotalRelevantQuestionCount() {
        return 0;
    }

    public int getNumQuestions() {
        return this.form.getDeepChildCount();
    }

    public FormIndex getFormIndex() {
        return this.currentFormIndex;
    }

    public void setLanguage(String str) {
        if (this.form.getLocalizer() != null) {
            this.form.getLocalizer().setLocale(str);
        }
    }

    public String getLanguage() {
        return this.form.getLocalizer().getLocale();
    }

    public void setQuestionIndex(FormIndex formIndex) {
        if (!this.currentFormIndex.equals(formIndex)) {
            createModelIfNecessary(formIndex);
            this.currentFormIndex = formIndex;
        }
    }

    public FormDef getForm() {
        return this.form;
    }

    public FormEntryCaption[] getCaptionHierarchy(FormIndex formIndex) {
        Vector vector = new Vector();
        FormIndex formIndex2 = formIndex;
        while (formIndex2 != null) {
            FormIndex nextLevel = formIndex2.getNextLevel();
            FormIndex diff = formIndex.diff(nextLevel);
            IFormElement child = this.form.getChild(diff);
            if (child != null) {
                Object obj = null;
                if (child instanceof GroupDef) {
                    obj = new FormEntryCaption(getForm(), diff);
                } else if (child instanceof QuestionDef) {
                    obj = new FormEntryPrompt(getForm(), diff);
                }
                if (obj != null) {
                    vector.addElement(obj);
                }
            }
            formIndex2 = nextLevel;
        }
        FormEntryCaption[] formEntryCaptionArr = new FormEntryCaption[vector.size()];
        vector.copyInto(formEntryCaptionArr);
        return formEntryCaptionArr;
    }

    public FormEntryCaption[] getCaptionHierarchy() {
        return getCaptionHierarchy(this.currentFormIndex);
    }

    public boolean isIndexReadonly(FormIndex formIndex) {
        if (formIndex.isBeginningOfFormIndex() || formIndex.isEndOfFormIndex()) {
            return true;
        }
        return !(getEvent(formIndex) == 2 || getEvent(formIndex) == 32) && !this.form.getMainInstance().resolveReference(this.form.getChildInstanceRef(formIndex)).isEnabled();
    }

    public boolean isIndexReadonly() {
        return isIndexReadonly(this.currentFormIndex);
    }

    public boolean isIndexRelevant(FormIndex formIndex) {
        boolean isRelevant;
        boolean z = true;
        TreeReference childInstanceRef = this.form.getChildInstanceRef(formIndex);
        boolean z2 = getEvent(formIndex) == 2;
        boolean z3 = getEvent(formIndex) == 32;
        if (z2) {
            if (!this.form.isRepeatRelevant(childInstanceRef) || !this.form.canCreateRepeat(childInstanceRef, formIndex)) {
                z = false;
            }
            isRelevant = z;
        } else if (z3) {
            isRelevant = this.form.isRepeatRelevant(childInstanceRef);
        } else {
            isRelevant = this.form.getMainInstance().resolveReference(childInstanceRef).isRelevant();
        }
        if (isRelevant) {
            while (!formIndex.isTerminal()) {
                if (!this.form.getMainInstance().resolveReference(formIndex.getLocalReference()).isRelevant()) {
                    return false;
                }
                formIndex = formIndex.getNextLevel();
            }
        }
        return isRelevant;
    }

    public boolean isIndexRelevant() {
        return isIndexRelevant(this.currentFormIndex);
    }

    private void createModelIfNecessary(FormIndex formIndex) {
        if (formIndex.isInForm()) {
            IFormElement child = getForm().getChild(formIndex);
            if (child instanceof GroupDef) {
                GroupDef groupDef = (GroupDef) child;
                if (groupDef.getRepeat() && groupDef.getCountReference() != null) {
                    IAnswerData value = getForm().getMainInstance().resolveReference(FormInstance.unpackReference(groupDef.getCountReference()).contextualize(formIndex.getReference())).getValue();
                    if (value != null) {
                        long intValue = ((Integer) value.getValue()).intValue();
                        if (getForm().getMainInstance().resolveReference(getForm().getChildInstanceRef(formIndex)) == null && formIndex.getInstanceIndex() < intValue) {
                            try {
                                getForm().createNewRepeat(formIndex);
                            } catch (InvalidReferenceException e) {
                                e.printStackTrace();
                                throw new RuntimeException("Invalid Reference while creting new repeat!" + e.getMessage());
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean isIndexCompoundContainer() {
        return isIndexCompoundContainer(getFormIndex());
    }

    public boolean isIndexCompoundContainer(FormIndex formIndex) {
        FormEntryCaption captionPrompt = getCaptionPrompt(formIndex);
        return getEvent(formIndex) == 8 && captionPrompt.getAppearanceHint() != null && captionPrompt.getAppearanceHint().toLowerCase().equals("full");
    }

    public boolean isIndexCompoundElement() {
        return isIndexCompoundElement(getFormIndex());
    }

    public boolean isIndexCompoundElement(FormIndex formIndex) {
        if (getEvent(formIndex) != 4) {
            return false;
        }
        for (FormEntryCaption formEntryCaption : getCaptionHierarchy(formIndex)) {
            if (isIndexCompoundContainer(formEntryCaption.getIndex())) {
                return true;
            }
        }
        return false;
    }

    public FormIndex[] getCompoundIndices() {
        return getCompoundIndices(getFormIndex());
    }

    public FormIndex[] getCompoundIndices(FormIndex formIndex) {
        Vector vector = new Vector();
        FormIndex incrementIndex = incrementIndex(formIndex);
        while (FormIndex.isSubElement(formIndex, incrementIndex)) {
            if (isIndexRelevant(incrementIndex)) {
                vector.addElement(incrementIndex);
            }
            incrementIndex = incrementIndex(incrementIndex);
        }
        FormIndex[] formIndexArr = new FormIndex[vector.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < vector.size()) {
                formIndexArr[i2] = (FormIndex) vector.elementAt(i2);
                i = i2 + 1;
            } else {
                return formIndexArr;
            }
        }
    }

    public int getRepeatStructure() {
        return this.repeatStructure;
    }

    public FormIndex incrementIndex(FormIndex formIndex) {
        return incrementIndex(formIndex, true);
    }

    public FormIndex incrementIndex(FormIndex formIndex, boolean z) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        if (!formIndex.isEndOfFormIndex()) {
            if (formIndex.isBeginningOfFormIndex()) {
                if (this.form.getChildren() == null || this.form.getChildren().size() == 0) {
                    return FormIndex.createEndOfFormIndex();
                }
            } else {
                this.form.collapseIndex(formIndex, vector, vector2, vector3);
            }
            incrementHelper(vector, vector2, vector3, z);
            if (vector.size() == 0) {
                return FormIndex.createEndOfFormIndex();
            }
            return this.form.buildIndex(vector, vector2, vector3);
        }
        return formIndex;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void incrementHelper(java.util.Vector r9, java.util.Vector r10, java.util.Vector r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.javarosa.form.api.FormEntryModel.incrementHelper(java.util.Vector, java.util.Vector, java.util.Vector, boolean):void");
    }

    public FormIndex decrementIndex(FormIndex formIndex) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        if (!formIndex.isBeginningOfFormIndex()) {
            if (formIndex.isEndOfFormIndex()) {
                if (this.form.getChildren() == null || this.form.getChildren().size() == 0) {
                    return FormIndex.createBeginningOfFormIndex();
                }
            } else {
                this.form.collapseIndex(formIndex, vector, vector2, vector3);
            }
            decrementHelper(vector, vector2, vector3);
            if (vector.size() == 0) {
                return FormIndex.createBeginningOfFormIndex();
            }
            return this.form.buildIndex(vector, vector2, vector3);
        }
        return formIndex;
    }

    private void decrementHelper(Vector vector, Vector vector2, Vector vector3) {
        int size = vector.size() - 1;
        if (size != -1) {
            int intValue = ((Integer) vector.elementAt(size)).intValue();
            int intValue2 = ((Integer) vector2.elementAt(size)).intValue();
            if (this.repeatStructure == 2 && (vector3.lastElement() instanceof GroupDef) && ((GroupDef) vector3.lastElement()).getRepeat() && ((Integer) vector2.lastElement()).intValue() != -10) {
                vector2.setElementAt(new Integer(-10), size);
                return;
            } else if (this.repeatStructure != 2 && intValue2 > 0) {
                vector2.setElementAt(new Integer(intValue2 - 1), size);
            } else if (intValue > 0) {
                vector.setElementAt(new Integer(intValue - 1), size);
                vector2.setElementAt(new Integer(0), size);
                vector3.setElementAt((size == 0 ? this.form : (IFormElement) vector3.elementAt(size - 1)).getChild(intValue - 1), size);
                if (setRepeatNextMultiplicity(vector3, vector2)) {
                    return;
                }
            } else {
                vector.removeElementAt(size);
                vector2.removeElementAt(size);
                vector3.removeElementAt(size);
                return;
            }
        }
        IFormElement iFormElement = size < 0 ? this.form : (IFormElement) vector3.elementAt(size);
        while (!(iFormElement instanceof QuestionDef)) {
            int size2 = iFormElement.getChildren().size() - 1;
            iFormElement = iFormElement.getChild(size2);
            vector.addElement(new Integer(size2));
            vector2.addElement(new Integer(0));
            vector3.addElement(iFormElement);
            if (setRepeatNextMultiplicity(vector3, vector2)) {
                return;
            }
        }
    }

    private boolean setRepeatNextMultiplicity(Vector vector, Vector vector2) {
        int i = 0;
        TreeReference childInstanceRef = this.form.getChildInstanceRef(vector, vector2);
        TreeElement resolveReference = this.form.getMainInstance().resolveReference(childInstanceRef);
        if (resolveReference == null || resolveReference.repeatable) {
            if (resolveReference != null) {
                i = this.form.getMainInstance().resolveReference(childInstanceRef.getParentRef()).getChildMultiplicity(resolveReference.getName());
            }
            if (this.repeatStructure == 2) {
                i = -10;
            }
            vector2.setElementAt(new Integer(i), vector2.size() - 1);
            return true;
        }
        return false;
    }

    private boolean containsRepeatGuesses(IFormElement iFormElement) {
        if (iFormElement instanceof GroupDef) {
            GroupDef groupDef = (GroupDef) iFormElement;
            if (groupDef.getRepeat() && groupDef.getCountReference() != null) {
                return true;
            }
        }
        Vector<IFormElement> children = iFormElement.getChildren();
        if (children == null) {
            return false;
        }
        Enumeration<IFormElement> elements = children.elements();
        while (elements.hasMoreElements()) {
            if (containsRepeatGuesses(elements.nextElement())) {
                return true;
            }
        }
        return false;
    }
}
