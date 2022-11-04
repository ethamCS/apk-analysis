package org.javarosa.form.api;

import java.util.Hashtable;
import java.util.Vector;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.FormElementStateListener;
import org.javarosa.core.model.FormIndex;
import org.javarosa.core.model.GroupDef;
import org.javarosa.core.model.IFormElement;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.services.locale.Localizer;
import org.javarosa.formmanager.view.IQuestionWidget;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
/* loaded from: classes.dex */
public class FormEntryCaption implements FormElementStateListener {
    public static final String TEXT_FORM_AUDIO = "audio";
    public static final String TEXT_FORM_IMAGE = "image";
    public static final String TEXT_FORM_LONG = "long";
    public static final String TEXT_FORM_SHORT = "short";
    public static final String TEXT_FORM_VIDEO = "video";
    protected IFormElement element;
    FormDef form;
    FormIndex index;
    private String textID;
    protected IQuestionWidget viewWidget;

    public FormEntryCaption() {
    }

    public FormEntryCaption(FormDef formDef, FormIndex formIndex) {
        this.form = formDef;
        this.index = formIndex;
        this.element = formDef.getChild(formIndex);
        this.viewWidget = null;
        this.textID = this.element.getTextID();
    }

    public String getLongText() {
        return getQuestionText(getTextID());
    }

    public String getShortText() {
        String specialFormQuestionText = getSpecialFormQuestionText(getTextID(), TEXT_FORM_SHORT);
        return specialFormQuestionText == null ? getLongText() : specialFormQuestionText;
    }

    public String getAudioText() {
        return getSpecialFormQuestionText(getTextID(), TEXT_FORM_AUDIO);
    }

    public String getImageText() {
        return getSpecialFormQuestionText(getTextID(), TEXT_FORM_IMAGE);
    }

    public String getQuestionText(String str) {
        if (str == "") {
            str = null;
        }
        if (str == null) {
            return substituteStringArgs(this.element.getLabelInnerText());
        }
        String iText = getIText(str, TEXT_FORM_LONG);
        if (iText == null) {
            iText = getIText(str, null);
        }
        return substituteStringArgs(iText);
    }

    public String getQuestionText() {
        return getQuestionText(getTextID());
    }

    public String getSpecialFormQuestionText(String str, String str2) {
        if (str == null || str.equals("")) {
            return null;
        }
        return substituteStringArgs(getIText(str, str2));
    }

    public String getSpecialFormQuestionText(String str) {
        return getSpecialFormQuestionText(getTextID(), str);
    }

    public String getIText(String str, String str2) {
        if (str == null || str.equals("")) {
            return null;
        }
        if (str2 != null && !str2.equals("")) {
            try {
                return localizer().getRawText(localizer().getLocale(), str + ";" + str2);
            } catch (NullPointerException e) {
                return null;
            }
        }
        try {
            return localizer().getRawText(localizer().getLocale(), str);
        } catch (NullPointerException e2) {
            return null;
        }
    }

    public String getRepeatText(String str) {
        String str2;
        GroupDef groupDef = (GroupDef) this.element;
        if (!groupDef.getRepeat()) {
            throw new RuntimeException("not a repeat");
        }
        String longText = getLongText();
        int numRepetitions = getNumRepetitions();
        if ("mainheader".equals(str)) {
            str2 = groupDef.mainHeader;
            if (str2 == null) {
                return longText;
            }
        } else if ("add".equals(str)) {
            str2 = groupDef.addCaption;
            if (str2 == null) {
                return "Add another " + longText;
            }
        } else if ("add-empty".equals(str)) {
            String str3 = groupDef.addEmptyCaption;
            str2 = str3 == null ? groupDef.addCaption : str3;
            if (str2 == null) {
                return "None - Add " + longText;
            }
        } else if ("del".equals(str)) {
            str2 = groupDef.delCaption;
            if (str2 == null) {
                return "Delete " + longText;
            }
        } else if ("done".equals(str)) {
            str2 = groupDef.doneCaption;
            if (str2 == null) {
                return "Done";
            }
        } else if ("done-empty".equals(str)) {
            String str4 = groupDef.doneEmptyCaption;
            str2 = str4 == null ? groupDef.doneCaption : str4;
            if (str2 == null) {
                return "Skip";
            }
        } else if (!"delheader".equals(str)) {
            str2 = null;
        } else {
            str2 = groupDef.delHeader;
            if (str2 == null) {
                return "Delete which " + longText + "?";
            }
        }
        Hashtable<String, ?> hashtable = new Hashtable<>();
        hashtable.put("name", longText);
        hashtable.put("n", new Integer(numRepetitions));
        return this.form.fillTemplateString(str2, this.index.getReference(), hashtable);
    }

    public int getNumRepetitions() {
        return this.form.getNumRepetitions(this.index);
    }

    public String getRepetitionText(boolean z) {
        return getRepetitionText("header", this.index, z);
    }

    private String getRepetitionText(String str, FormIndex formIndex, boolean z) {
        String str2 = null;
        if (!(this.element instanceof GroupDef) || !((GroupDef) this.element).getRepeat() || formIndex.getElementMultiplicity() < 0) {
            return null;
        }
        GroupDef groupDef = (GroupDef) this.element;
        String longText = getLongText();
        int elementMultiplicity = formIndex.getElementMultiplicity() + 1;
        int numRepetitions = getNumRepetitions();
        if ("header".equals(str)) {
            str2 = groupDef.entryHeader;
        } else if ("choose".equals(str) && (str2 = groupDef.chooseCaption) == null) {
            str2 = groupDef.entryHeader;
        }
        if (str2 == null) {
            return longText + XFormAnswerDataSerializer.DELIMITER + elementMultiplicity + "/" + numRepetitions;
        }
        Hashtable<String, ?> hashtable = new Hashtable<>();
        hashtable.put("name", longText);
        hashtable.put("i", new Integer(elementMultiplicity));
        hashtable.put("n", new Integer(numRepetitions));
        hashtable.put("new", new Boolean(z));
        return this.form.fillTemplateString(str2, formIndex.getReference(), hashtable);
    }

    public Vector<String> getRepetitionsText() {
        if (!((GroupDef) this.element).getRepeat()) {
            throw new RuntimeException("not a repeat");
        }
        int numRepetitions = getNumRepetitions();
        Vector<String> vector = new Vector<>();
        for (int i = 0; i < numRepetitions; i++) {
            vector.addElement(getRepetitionText("choose", this.form.descendIntoRepeat(this.index, i), false));
        }
        return vector;
    }

    /* loaded from: classes.dex */
    public class RepeatOptions {
        public String add;
        public String delete;
        public String delete_header;
        public String done;
        public String header;

        public RepeatOptions() {
            FormEntryCaption.this = r1;
        }
    }

    public RepeatOptions getRepeatOptions() {
        RepeatOptions repeatOptions = new RepeatOptions();
        boolean z = getNumRepetitions() > 0;
        repeatOptions.header = getRepeatText("mainheader");
        repeatOptions.add = null;
        if (this.form.canCreateRepeat(this.form.getChildInstanceRef(this.index), this.index)) {
            repeatOptions.add = getRepeatText(z ? "add" : "add-empty");
        }
        repeatOptions.delete = null;
        repeatOptions.delete_header = null;
        if (z) {
            repeatOptions.delete = getRepeatText("del");
            repeatOptions.delete_header = getRepeatText("delheader");
        }
        repeatOptions.done = getRepeatText(z ? "done" : "done-empty");
        return repeatOptions;
    }

    public String getAppearanceHint() {
        return this.element.getAppearanceAttr();
    }

    public String substituteStringArgs(String str) {
        if (str == null) {
            return null;
        }
        return this.form.fillTemplateString(str, this.index.getReference());
    }

    public int getMultiplicity() {
        return this.index.getElementMultiplicity();
    }

    public IFormElement getFormElement() {
        return this.element;
    }

    public boolean repeats() {
        if (this.element instanceof GroupDef) {
            return ((GroupDef) this.element).getRepeat();
        }
        return false;
    }

    public FormIndex getIndex() {
        return this.index;
    }

    public Localizer localizer() {
        return this.form.getLocalizer();
    }

    public void register(IQuestionWidget iQuestionWidget) {
        this.viewWidget = iQuestionWidget;
        this.element.registerStateObserver(this);
    }

    public void unregister() {
        this.viewWidget = null;
        this.element.unregisterStateObserver(this);
    }

    @Override // org.javarosa.core.model.FormElementStateListener
    public void formElementStateChanged(IFormElement iFormElement, int i) {
        if (this.element != iFormElement) {
            throw new IllegalStateException("Widget received event from foreign question");
        }
        if (this.viewWidget != null) {
            this.viewWidget.refreshWidget(i);
        }
    }

    @Override // org.javarosa.core.model.FormElementStateListener
    public void formElementStateChanged(TreeElement treeElement, int i) {
        throw new RuntimeException("cannot happen");
    }

    protected String getTextID() {
        return this.textID;
    }
}
