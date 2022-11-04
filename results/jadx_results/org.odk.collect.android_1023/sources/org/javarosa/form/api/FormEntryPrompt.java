package org.javarosa.form.api;

import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.FormIndex;
import org.javarosa.core.model.ItemsetBinding;
import org.javarosa.core.model.QuestionDef;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.condition.Constraint;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.pivot.ConstraintHint;
import org.javarosa.core.model.condition.pivot.UnpivotableExpressionException;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.services.Logger;
import org.javarosa.core.util.NoLocalizedTextException;
import org.javarosa.core.util.UnregisteredLocaleException;
import org.javarosa.formmanager.view.IQuestionWidget;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
/* loaded from: classes.dex */
public class FormEntryPrompt extends FormEntryCaption {
    boolean dynamicChoicesPopulated = false;
    TreeElement mTreeElement;

    protected FormEntryPrompt() {
    }

    public FormEntryPrompt(FormDef formDef, FormIndex formIndex) {
        super(formDef, formIndex);
        if (!(this.element instanceof QuestionDef)) {
            throw new IllegalArgumentException("FormEntryPrompt can only be created for QuestionDef elements");
        }
        this.mTreeElement = formDef.getMainInstance().resolveReference(formIndex.getReference());
    }

    public int getControlType() {
        return getQuestion().getControlType();
    }

    public int getDataType() {
        return this.mTreeElement.dataType;
    }

    public String getPromptAttributes() {
        return null;
    }

    public IAnswerData getAnswerValue() {
        SelectChoice selectChoice;
        Vector vector;
        QuestionDef question = getQuestion();
        ItemsetBinding dynamicChoices = question.getDynamicChoices();
        if (dynamicChoices != null) {
            if (dynamicChoices.valueRef == null) {
                return null;
            }
            Vector<SelectChoice> selectChoices = getSelectChoices();
            Vector vector2 = new Vector();
            if (dynamicChoices.copyMode) {
                Vector<TreeReference> expandReference = this.form.getEvaluationContext().expandReference(dynamicChoices.getDestRef().contextualize(this.mTreeElement.getRef()));
                for (int i = 0; i < expandReference.size(); i++) {
                    vector2.addElement(dynamicChoices.getRelativeValue().evalReadable(this.form.getMainInstance(), new EvaluationContext(this.form.getEvaluationContext(), this.form.getMainInstance().resolveReference(expandReference.elementAt(i)).getRef())));
                }
            } else {
                Vector vector3 = new Vector();
                IAnswerData value = this.mTreeElement.getValue();
                if (value instanceof SelectMultiData) {
                    vector = (Vector) value.getValue();
                } else if (value instanceof SelectOneData) {
                    vector = new Vector();
                    vector.addElement((Selection) value.getValue());
                } else {
                    vector = vector3;
                }
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    vector2.addElement(((Selection) vector.elementAt(i2)).xmlValue);
                }
            }
            Vector vector4 = new Vector();
            for (int i3 = 0; i3 < vector2.size(); i3++) {
                String str = (String) vector2.elementAt(i3);
                int i4 = 0;
                while (true) {
                    if (i4 >= selectChoices.size()) {
                        selectChoice = null;
                        break;
                    }
                    selectChoice = selectChoices.elementAt(i4);
                    if (str.equals(selectChoice.getValue())) {
                        break;
                    }
                    i4++;
                }
                if (selectChoice != null) {
                    vector4.addElement(selectChoice.selection());
                }
            }
            if (vector4.size() == 0) {
                return null;
            }
            if (question.getControlType() == 3) {
                return new SelectMultiData(vector4);
            }
            if (question.getControlType() == 2) {
                return new SelectOneData((Selection) vector4.elementAt(0));
            }
            throw new RuntimeException("can't happen");
        }
        return this.mTreeElement.getValue();
    }

    public String getAnswerText() {
        String displayText;
        Iterator it;
        IAnswerData answerValue = getAnswerValue();
        if (answerValue == null) {
            return null;
        }
        if (answerValue instanceof SelectOneData) {
            displayText = getSelectItemText((Selection) answerValue.getValue());
        } else if (answerValue instanceof SelectMultiData) {
            displayText = "";
            while (((Vector) answerValue.getValue()).iterator().hasNext()) {
                displayText = displayText + getSelectItemText((Selection) it.next()) + XFormAnswerDataSerializer.DELIMITER;
            }
        } else {
            displayText = answerValue.getDisplayText();
        }
        if (getControlType() != 5) {
            return displayText;
        }
        String str = "";
        for (int i = 0; i < displayText.length(); i++) {
            str = str + TreeReference.NAME_WILDCARD;
        }
        return str;
    }

    public String getConstraintText() {
        return getConstraintText(null);
    }

    public String getConstraintText(IAnswerData iAnswerData) {
        return getConstraintText(null, iAnswerData);
    }

    public String getConstraintText(String str, IAnswerData iAnswerData) {
        if (this.mTreeElement.getConstraint() == null) {
            return null;
        }
        EvaluationContext evaluationContext = new EvaluationContext(this.form.exprEvalContext, this.mTreeElement.getRef());
        if (str != null) {
            evaluationContext.setOutputTextForm(str);
        }
        if (iAnswerData != null) {
            evaluationContext.isConstraint = true;
            evaluationContext.candidateValue = iAnswerData;
        }
        return this.mTreeElement.getConstraint().getConstraintMessage(evaluationContext, this.form.getMainInstance(), str);
    }

    public Vector<TreeElement> getBindAttributes() {
        return this.mTreeElement.getBindAttributes();
    }

    public Vector<SelectChoice> getSelectChoices() {
        QuestionDef question = getQuestion();
        ItemsetBinding dynamicChoices = question.getDynamicChoices();
        if (dynamicChoices != null) {
            if (!this.dynamicChoicesPopulated) {
                this.form.populateDynamicChoices(dynamicChoices, this.mTreeElement.getRef());
                this.dynamicChoicesPopulated = true;
            }
            return dynamicChoices.getChoices();
        }
        return question.getChoices();
    }

    public void expireDynamicChoices() {
        this.dynamicChoicesPopulated = false;
        ItemsetBinding dynamicChoices = getQuestion().getDynamicChoices();
        if (dynamicChoices != null) {
            dynamicChoices.clearChoices();
        }
    }

    public boolean isRequired() {
        return this.mTreeElement.required;
    }

    public boolean isReadOnly() {
        return !this.mTreeElement.isEnabled();
    }

    public QuestionDef getQuestion() {
        return (QuestionDef) this.element;
    }

    @Override // org.javarosa.form.api.FormEntryCaption
    public void register(IQuestionWidget iQuestionWidget) {
        super.register(iQuestionWidget);
        this.mTreeElement.registerStateObserver(this);
    }

    @Override // org.javarosa.form.api.FormEntryCaption
    public void unregister() {
        this.mTreeElement.unregisterStateObserver(this);
        super.unregister();
    }

    @Override // org.javarosa.form.api.FormEntryCaption, org.javarosa.core.model.FormElementStateListener
    public void formElementStateChanged(TreeElement treeElement, int i) {
        if (this.mTreeElement != treeElement) {
            throw new IllegalStateException("Widget received event from foreign question");
        }
        if (this.viewWidget != null) {
            this.viewWidget.refreshWidget(i);
        }
    }

    public String getHelpText() {
        String str;
        if (!(this.element instanceof QuestionDef)) {
            throw new RuntimeException("Can't get HelpText for Elements that are not Questions!");
        }
        String helpTextID = ((QuestionDef) this.element).getHelpTextID();
        String helpText = ((QuestionDef) this.element).getHelpText();
        ((QuestionDef) this.element).getHelpInnerText();
        try {
            if (helpTextID != null) {
                str = localizer().getLocalizedText(helpTextID);
            } else {
                str = substituteStringArgs(((QuestionDef) this.element).getHelpInnerText());
            }
            return str;
        } catch (NoLocalizedTextException e) {
            return helpText;
        } catch (UnregisteredLocaleException e2) {
            System.err.println("Warning: No Locale set yet (while attempting to getHelpText())");
            return helpText;
        } catch (Exception e3) {
            Logger.exception("FormEntryPrompt.getHelpText", e3);
            e3.printStackTrace();
            return helpText;
        }
    }

    public String getSelectItemText(Selection selection) {
        if (!(getFormElement() instanceof QuestionDef)) {
            throw new RuntimeException("Can't retrieve question text for non-QuestionDef form elements!");
        }
        if (selection == null) {
            throw new IllegalArgumentException("Cannot use null as an argument!");
        }
        if (selection.index == -1) {
            selection.attachChoice(getQuestion());
        }
        String textID = selection.choice.getTextID();
        if (textID == null || textID == "") {
            return substituteStringArgs(selection.choice.getLabelInnerText());
        }
        String iText = getIText(textID, FormEntryCaption.TEXT_FORM_LONG);
        if (iText == null) {
            iText = getIText(textID, null);
        }
        return substituteStringArgs(iText);
    }

    public String getSelectChoiceText(SelectChoice selectChoice) {
        return getSelectItemText(selectChoice.selection());
    }

    public String getSpecialFormSelectItemText(Selection selection, String str) {
        if (selection == null) {
            throw new IllegalArgumentException("Cannot use null as an argument for Selection!");
        }
        if (selection.index == -1) {
            selection.attachChoice(getQuestion());
        }
        String textID = selection.choice.getTextID();
        if (textID != null && !textID.equals("")) {
            return substituteStringArgs(getIText(textID, str));
        }
        return null;
    }

    public String getSpecialFormSelectChoiceText(SelectChoice selectChoice, String str) {
        return getSpecialFormSelectItemText(selectChoice.selection(), str);
    }

    public void requestConstraintHint(ConstraintHint constraintHint) throws UnpivotableExpressionException {
        Constraint constraint = this.mTreeElement.getConstraint();
        if (constraint != null) {
            constraintHint.init(new EvaluationContext(this.form.exprEvalContext, this.mTreeElement.getRef()), constraint.constraint, this.form.getMainInstance());
            return;
        }
        throw new UnpivotableExpressionException();
    }
}
