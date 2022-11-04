package org.javarosa.form.api;

import org.javarosa.core.model.FormIndex;
import org.javarosa.core.model.QuestionDef;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.instance.InvalidReferenceException;
import org.javarosa.core.model.instance.TreeElement;
/* loaded from: classes.dex */
public class FormEntryController {
    public static final int ANSWER_CONSTRAINT_VIOLATED = 2;
    public static final int ANSWER_OK = 0;
    public static final int ANSWER_REQUIRED_BUT_EMPTY = 1;
    public static final int EVENT_BEGINNING_OF_FORM = 0;
    public static final int EVENT_END_OF_FORM = 1;
    public static final int EVENT_GROUP = 8;
    public static final int EVENT_PROMPT_NEW_REPEAT = 2;
    public static final int EVENT_QUESTION = 4;
    public static final int EVENT_REPEAT = 16;
    public static final int EVENT_REPEAT_JUNCTURE = 32;
    FormEntryModel model;

    public FormEntryController(FormEntryModel formEntryModel) {
        this.model = formEntryModel;
    }

    public FormEntryModel getModel() {
        return this.model;
    }

    public int answerQuestion(IAnswerData iAnswerData) {
        return answerQuestion(this.model.getFormIndex(), iAnswerData);
    }

    public int answerQuestion(FormIndex formIndex, IAnswerData iAnswerData) {
        QuestionDef question = this.model.getQuestionPrompt(formIndex).getQuestion();
        if (this.model.getEvent(formIndex) != 4) {
            throw new RuntimeException("Non-Question object at the form index.");
        }
        TreeElement treeElement = this.model.getTreeElement(formIndex);
        boolean isComplex = question.isComplex();
        if (treeElement.required && iAnswerData == null) {
            return 1;
        }
        if (!isComplex && !this.model.getForm().evaluateConstraint(formIndex.getReference(), iAnswerData)) {
            return 2;
        }
        if (!isComplex) {
            commitAnswer(treeElement, formIndex, iAnswerData);
            return 0;
        }
        if (isComplex) {
        }
        try {
            this.model.getForm().copyItemsetAnswer(question, treeElement, iAnswerData);
            return 0;
        } catch (InvalidReferenceException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid reference while copying itemset answer: " + e.getMessage());
        }
    }

    public boolean saveAnswer(FormIndex formIndex, IAnswerData iAnswerData) {
        if (this.model.getEvent(formIndex) != 4) {
            throw new RuntimeException("Non-Question object at the form index.");
        }
        return commitAnswer(this.model.getTreeElement(formIndex), formIndex, iAnswerData);
    }

    public boolean saveAnswer(IAnswerData iAnswerData) {
        return saveAnswer(this.model.getFormIndex(), iAnswerData);
    }

    private boolean commitAnswer(TreeElement treeElement, FormIndex formIndex, IAnswerData iAnswerData) {
        if (iAnswerData == null && treeElement.getValue() == null) {
            return false;
        }
        this.model.getForm().setValue(iAnswerData, formIndex.getReference(), treeElement);
        return true;
    }

    public int stepToNextEvent() {
        return stepEvent(true);
    }

    public int stepToPreviousEvent() {
        return stepEvent(false);
    }

    private int stepEvent(boolean z) {
        FormIndex formIndex = this.model.getFormIndex();
        do {
            if (z) {
                formIndex = this.model.incrementIndex(formIndex);
            } else {
                formIndex = this.model.decrementIndex(formIndex);
            }
            if (!formIndex.isInForm()) {
                break;
            }
        } while (!this.model.isIndexRelevant(formIndex));
        return jumpToIndex(formIndex);
    }

    public int jumpToIndex(FormIndex formIndex) {
        this.model.setQuestionIndex(formIndex);
        return this.model.getEvent(formIndex);
    }

    public FormIndex descendIntoRepeat(int i) {
        jumpToIndex(this.model.getForm().descendIntoRepeat(this.model.getFormIndex(), i));
        return this.model.getFormIndex();
    }

    public FormIndex descendIntoNewRepeat() {
        jumpToIndex(this.model.getForm().descendIntoRepeat(this.model.getFormIndex(), -1));
        newRepeat(this.model.getFormIndex());
        return this.model.getFormIndex();
    }

    public void newRepeat(FormIndex formIndex) {
        try {
            this.model.getForm().createNewRepeat(formIndex);
        } catch (InvalidReferenceException e) {
            throw new RuntimeException("Invalid reference while copying itemset answer: " + e.getMessage());
        }
    }

    public void newRepeat() {
        newRepeat(this.model.getFormIndex());
    }

    public FormIndex deleteRepeat(FormIndex formIndex) {
        return this.model.getForm().deleteRepeat(formIndex);
    }

    public FormIndex deleteRepeat() {
        return deleteRepeat(this.model.getFormIndex());
    }

    public void deleteRepeat(int i) {
        deleteRepeat(this.model.getForm().descendIntoRepeat(this.model.getFormIndex(), i));
    }

    public void setLanguage(String str) {
        this.model.setLanguage(str);
    }
}
