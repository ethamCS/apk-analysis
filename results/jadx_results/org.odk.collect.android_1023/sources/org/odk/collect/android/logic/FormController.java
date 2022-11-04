package org.odk.collect.android.logic;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Vector;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.FormIndex;
import org.javarosa.core.model.GroupDef;
import org.javarosa.core.model.IDataReference;
import org.javarosa.core.model.IFormElement;
import org.javarosa.core.model.SubmissionProfile;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.services.transport.payload.ByteArrayPayload;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryController;
import org.javarosa.form.api.FormEntryPrompt;
import org.javarosa.model.xform.XFormSerializingVisitor;
import org.javarosa.model.xform.XPathReference;
import org.odk.collect.android.views.ODKView;
/* loaded from: classes.dex */
public class FormController {
    private static final String INSTANCE_ID = "instanceID";
    public static final boolean STEP_INTO_GROUP = true;
    public static final boolean STEP_OVER_GROUP = false;
    private static final String t = "FormController";
    private FormEntryController mFormEntryController;
    private FormIndex mIndexWaitingForData = null;
    private File mInstancePath;
    private File mMediaFolder;

    /* loaded from: classes.dex */
    public static final class InstanceMetadata {
        public final String instanceId;

        InstanceMetadata(String instanceId) {
            this.instanceId = instanceId;
        }
    }

    public FormController(File mediaFolder, FormEntryController fec, File instancePath) {
        this.mMediaFolder = mediaFolder;
        this.mFormEntryController = fec;
        this.mInstancePath = instancePath;
    }

    public File getMediaFolder() {
        return this.mMediaFolder;
    }

    public File getInstancePath() {
        return this.mInstancePath;
    }

    public void setInstancePath(File instancePath) {
        this.mInstancePath = instancePath;
    }

    public void setIndexWaitingForData(FormIndex index) {
        this.mIndexWaitingForData = index;
    }

    public FormIndex getIndexWaitingForData() {
        return this.mIndexWaitingForData;
    }

    public String getXPath(FormIndex index) {
        switch (getEvent()) {
            case 0:
                return "beginningOfForm";
            case 1:
                return "endOfForm";
            case 2:
                String value = "promptNewRepeat." + index.getReference().toString();
                return value;
            case 4:
                String value2 = "question." + index.getReference().toString();
                return value2;
            case 8:
                String value3 = "group." + index.getReference().toString();
                return value3;
            case 16:
                String value4 = "repeat." + index.getReference().toString();
                return value4;
            case 32:
                String value5 = "repeatJuncture." + index.getReference().toString();
                return value5;
            default:
                return "unexpected";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        r2 = getFormIndex();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.javarosa.core.model.FormIndex getIndexFromXPath(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 1
            java.lang.String r4 = "beginningOfForm"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto Le
            org.javarosa.core.model.FormIndex r2 = org.javarosa.core.model.FormIndex.createBeginningOfFormIndex()
        Ld:
            return r2
        Le:
            java.lang.String r4 = "endOfForm"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L1b
            org.javarosa.core.model.FormIndex r2 = org.javarosa.core.model.FormIndex.createEndOfFormIndex()
            goto Ld
        L1b:
            java.lang.String r4 = "unexpected"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L32
            java.lang.String r4 = "FormController"
            java.lang.String r5 = "Unexpected string from XPath"
            android.util.Log.e(r4, r5)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "unexpected string from XPath"
            r4.<init>(r5)
            throw r4
        L32:
            r2 = 0
            org.javarosa.core.model.FormIndex r3 = r6.getFormIndex()
            org.javarosa.core.model.FormIndex r4 = org.javarosa.core.model.FormIndex.createBeginningOfFormIndex()     // Catch: java.lang.Throwable -> L61
            r6.jumpToIndex(r4)     // Catch: java.lang.Throwable -> L61
            r4 = 1
            int r1 = r6.stepToNextEvent(r4)     // Catch: java.lang.Throwable -> L61
        L43:
            if (r1 == r5) goto L57
            org.javarosa.core.model.FormIndex r4 = r6.getFormIndex()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r6.getXPath(r4)     // Catch: java.lang.Throwable -> L61
            boolean r4 = r0.equals(r7)     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L5b
            org.javarosa.core.model.FormIndex r2 = r6.getFormIndex()     // Catch: java.lang.Throwable -> L61
        L57:
            r6.jumpToIndex(r3)
            goto Ld
        L5b:
            r4 = 1
            int r1 = r6.stepToNextEvent(r4)     // Catch: java.lang.Throwable -> L61
            goto L43
        L61:
            r4 = move-exception
            r6.jumpToIndex(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.odk.collect.android.logic.FormController.getIndexFromXPath(java.lang.String):org.javarosa.core.model.FormIndex");
    }

    public int getEvent() {
        return this.mFormEntryController.getModel().getEvent();
    }

    public int getEvent(FormIndex index) {
        return this.mFormEntryController.getModel().getEvent(index);
    }

    public FormIndex getFormIndex() {
        return this.mFormEntryController.getModel().getFormIndex();
    }

    public String[] getLanguages() {
        return this.mFormEntryController.getModel().getLanguages();
    }

    public String getFormTitle() {
        return this.mFormEntryController.getModel().getFormTitle();
    }

    public String getLanguage() {
        return this.mFormEntryController.getModel().getLanguage();
    }

    public String getBindAttribute(String attributeNamespace, String attributeName) {
        return getBindAttribute(getFormIndex(), attributeNamespace, attributeName);
    }

    public String getBindAttribute(FormIndex idx, String attributeNamespace, String attributeName) {
        return this.mFormEntryController.getModel().getForm().getMainInstance().resolveReference(idx.getReference()).getBindAttributeValue(attributeNamespace, attributeName);
    }

    private FormEntryCaption[] getCaptionHierarchy() {
        return this.mFormEntryController.getModel().getCaptionHierarchy();
    }

    private FormEntryCaption[] getCaptionHierarchy(FormIndex index) {
        return this.mFormEntryController.getModel().getCaptionHierarchy(index);
    }

    public FormEntryCaption getCaptionPrompt(FormIndex index) {
        return this.mFormEntryController.getModel().getCaptionPrompt(index);
    }

    public FormEntryCaption getCaptionPrompt() {
        return this.mFormEntryController.getModel().getCaptionPrompt();
    }

    public boolean postProcessInstance() {
        return this.mFormEntryController.getModel().getForm().postProcessInstance();
    }

    private FormInstance getInstance() {
        return this.mFormEntryController.getModel().getForm().getInstance();
    }

    private boolean groupIsFieldList(FormIndex index) {
        IFormElement element = this.mFormEntryController.getModel().getForm().getChild(index);
        if (!(element instanceof GroupDef)) {
            return false;
        }
        GroupDef gd = (GroupDef) element;
        return ODKView.FIELD_LIST.equalsIgnoreCase(gd.getAppearanceAttr());
    }

    private boolean repeatIsFieldList(FormIndex index) {
        IFormElement element = this.mFormEntryController.getModel().getForm().getChild(index);
        if (!(element instanceof GroupDef)) {
            return false;
        }
        GroupDef gd = (GroupDef) element;
        return ODKView.FIELD_LIST.equalsIgnoreCase(gd.getAppearanceAttr());
    }

    private boolean indexIsInFieldList(FormIndex index) {
        int event = getEvent(index);
        if (event == 4) {
            FormEntryCaption[] captions = getCaptionHierarchy(index);
            if (captions.length < 2) {
                return false;
            }
            FormEntryCaption grp = captions[captions.length - 2];
            return groupIsFieldList(grp.getIndex());
        } else if (event == 8) {
            return groupIsFieldList(index);
        } else {
            if (event != 16) {
                return false;
            }
            return repeatIsFieldList(index);
        }
    }

    public boolean currentPromptIsQuestion() {
        return getEvent() == 4 || ((getEvent() == 8 || getEvent() == 16) && indexIsInFieldList());
    }

    public boolean indexIsInFieldList() {
        return indexIsInFieldList(getFormIndex());
    }

    private int answerQuestion(IAnswerData data) {
        return this.mFormEntryController.answerQuestion(data);
    }

    public int answerQuestion(FormIndex index, IAnswerData data) {
        return this.mFormEntryController.answerQuestion(index, data);
    }

    public int validateAnswers(Boolean markCompleted) {
        FormIndex i = getFormIndex();
        jumpToIndex(FormIndex.createBeginningOfFormIndex());
        while (true) {
            int event = stepToNextEvent(true);
            if (event != 1) {
                if (event == 4) {
                    int saveStatus = answerQuestion(getQuestionPrompt().getAnswerValue());
                    if (markCompleted.booleanValue() && saveStatus != 0) {
                        return saveStatus;
                    }
                }
            } else {
                jumpToIndex(i);
                return 0;
            }
        }
    }

    public boolean saveAnswer(FormIndex index, IAnswerData data) {
        return this.mFormEntryController.saveAnswer(index, data);
    }

    public boolean saveAnswer(IAnswerData data) {
        return this.mFormEntryController.saveAnswer(data);
    }

    public int stepToNextEvent(boolean stepIntoGroup) {
        return ((getEvent() == 8 || getEvent() == 16) && indexIsInFieldList() && !stepIntoGroup) ? stepOverGroup() : this.mFormEntryController.stepToNextEvent();
    }

    private int stepOverGroup() {
        ArrayList<FormIndex> indicies = new ArrayList<>();
        GroupDef gd = (GroupDef) this.mFormEntryController.getModel().getForm().getChild(getFormIndex());
        FormIndex idxChild = this.mFormEntryController.getModel().incrementIndex(getFormIndex(), true);
        for (int i = 0; i < gd.getChildren().size(); i++) {
            indicies.add(idxChild);
            idxChild = this.mFormEntryController.getModel().incrementIndex(idxChild, false);
        }
        this.mFormEntryController.jumpToIndex(indicies.get(indicies.size() - 1));
        return stepToNextEvent(false);
    }

    public FormIndex stepIndexOut(FormIndex index) {
        if (index.isTerminal()) {
            return null;
        }
        return new FormIndex(stepIndexOut(index.getNextLevel()), index);
    }

    public int stepToPreviousScreenEvent() {
        if (getEvent() != 0) {
            int event = stepToPreviousEvent();
            while (true) {
                if (event == 32 || event == 2 || ((event == 4 && indexIsInFieldList()) || ((event == 8 || event == 16) && !indexIsInFieldList()))) {
                    event = stepToPreviousEvent();
                }
            }
            if (getEvent() == 8) {
                FormIndex currentIndex = getFormIndex();
                IFormElement element = this.mFormEntryController.getModel().getForm().getChild(currentIndex);
                if (element instanceof GroupDef) {
                    GroupDef gd = (GroupDef) element;
                    if (ODKView.FIELD_LIST.equalsIgnoreCase(gd.getAppearanceAttr())) {
                        FormEntryCaption[] fclist = getCaptionHierarchy(currentIndex);
                        if (fclist.length > 1) {
                            FormEntryCaption fc = fclist[fclist.length - 2];
                            GroupDef pd = (GroupDef) fc.getFormElement();
                            if (pd.getChildren().size() == 1 && ODKView.FIELD_LIST.equalsIgnoreCase(pd.getAppearanceAttr())) {
                                this.mFormEntryController.jumpToIndex(fc.getIndex());
                            }
                        }
                    }
                }
            }
        }
        return getEvent();
    }

    public int stepToNextScreenEvent() {
        int event;
        if (getEvent() != 1) {
            do {
                event = stepToNextEvent(false);
                switch (event) {
                    case 1:
                    case 2:
                    case 4:
                        break;
                    case 8:
                    case 16:
                        if (indexIsInFieldList() && getQuestionPrompts().length != 0) {
                            break;
                        }
                        break;
                    case 32:
                        Log.i(t, "repeat juncture: " + getFormIndex().getReference());
                        continue;
                    default:
                        Log.w(t, "JavaRosa added a new EVENT type and didn't tell us... shame on them.");
                        continue;
                }
            } while (event != 1);
        }
        return getEvent();
    }

    public int stepToOuterScreenEvent() {
        FormIndex index = stepIndexOut(getFormIndex());
        int currentEvent = getEvent();
        while (index != null && getEvent(index) == 8) {
            index = stepIndexOut(index);
        }
        if (index == null) {
            jumpToIndex(FormIndex.createBeginningOfFormIndex());
        } else if (currentEvent == 16) {
            jumpToIndex(index);
        } else {
            FormIndex index2 = stepIndexOut(index);
            if (index2 == null) {
                jumpToIndex(FormIndex.createBeginningOfFormIndex());
            } else {
                jumpToIndex(index2);
            }
        }
        return getEvent();
    }

    /* loaded from: classes.dex */
    public static class FailedConstraint {
        public final FormIndex index;
        public final int status;

        FailedConstraint(FormIndex index, int status) {
            this.index = index;
            this.status = status;
        }
    }

    public FailedConstraint saveAllScreenAnswers(LinkedHashMap<FormIndex, IAnswerData> answers, boolean evaluateConstraints) {
        if (currentPromptIsQuestion()) {
            for (FormIndex index : answers.keySet()) {
                if (getEvent(index) == 4) {
                    IAnswerData answer = answers.get(index);
                    if (evaluateConstraints) {
                        int saveStatus = answerQuestion(index, answer);
                        if (saveStatus != 0) {
                            return new FailedConstraint(index, saveStatus);
                        }
                    } else {
                        saveAnswer(index, answer);
                    }
                } else {
                    Log.w(t, "Attempted to save an index referencing something other than a question: " + index.getReference());
                }
            }
        }
        return null;
    }

    public int stepToPreviousEvent() {
        this.mFormEntryController.stepToPreviousEvent();
        if (indexIsInFieldList() && getEvent() == 4) {
            FormEntryCaption[] captions = getCaptionHierarchy();
            FormEntryCaption grp = captions[captions.length - 2];
            int event = this.mFormEntryController.jumpToIndex(grp.getIndex());
            FormIndex idx = grp.getIndex();
            if (!this.mFormEntryController.getModel().isIndexRelevant(idx)) {
                int event2 = stepToPreviousEvent();
                return event2;
            }
            FormIndex idx2 = this.mFormEntryController.getModel().incrementIndex(idx, true);
            while (FormIndex.isSubElement(grp.getIndex(), idx2)) {
                if (!this.mFormEntryController.getModel().isIndexRelevant(idx2)) {
                    idx2 = this.mFormEntryController.getModel().incrementIndex(idx2, true);
                } else {
                    return event;
                }
            }
            int event3 = stepToPreviousEvent();
            return event3;
        } else if (indexIsInFieldList() && getEvent() == 8) {
            FormIndex grpidx = this.mFormEntryController.getModel().getFormIndex();
            int event4 = this.mFormEntryController.getModel().getEvent();
            if (!this.mFormEntryController.getModel().isIndexRelevant(grpidx)) {
                int event5 = stepToPreviousEvent();
                return event5;
            }
            FormIndex idx3 = this.mFormEntryController.getModel().incrementIndex(grpidx, true);
            while (FormIndex.isSubElement(grpidx, idx3)) {
                if (!this.mFormEntryController.getModel().isIndexRelevant(idx3)) {
                    idx3 = this.mFormEntryController.getModel().incrementIndex(idx3, true);
                } else {
                    return event4;
                }
            }
            int event6 = stepToPreviousEvent();
            return event6;
        } else {
            int event7 = getEvent();
            return event7;
        }
    }

    public int jumpToIndex(FormIndex index) {
        return this.mFormEntryController.jumpToIndex(index);
    }

    public void newRepeat() {
        this.mFormEntryController.newRepeat();
    }

    public void deleteRepeat() {
        FormIndex fi = this.mFormEntryController.deleteRepeat();
        this.mFormEntryController.jumpToIndex(fi);
    }

    public void setLanguage(String language) {
        this.mFormEntryController.setLanguage(language);
    }

    public FormEntryPrompt[] getQuestionPrompts() throws RuntimeException {
        ArrayList<FormIndex> indicies = new ArrayList<>();
        FormIndex currentIndex = getFormIndex();
        FormEntryPrompt[] questions = new FormEntryPrompt[1];
        IFormElement element = this.mFormEntryController.getModel().getForm().getChild(currentIndex);
        if (element instanceof GroupDef) {
            GroupDef gd = (GroupDef) element;
            FormIndex idxChild = this.mFormEntryController.getModel().incrementIndex(currentIndex, true);
            if (gd.getChildren().size() == 1 && getEvent(idxChild) == 8) {
                IFormElement nestedElement = this.mFormEntryController.getModel().getForm().getChild(idxChild);
                if (nestedElement instanceof GroupDef) {
                    GroupDef nestedGd = (GroupDef) nestedElement;
                    if (ODKView.FIELD_LIST.equalsIgnoreCase(nestedGd.getAppearanceAttr())) {
                        gd = nestedGd;
                        idxChild = this.mFormEntryController.getModel().incrementIndex(idxChild, true);
                    }
                }
            }
            for (int i = 0; i < gd.getChildren().size(); i++) {
                indicies.add(idxChild);
                idxChild = this.mFormEntryController.getModel().incrementIndex(idxChild, false);
            }
            ArrayList<FormEntryPrompt> questionList = new ArrayList<>();
            for (int i2 = 0; i2 < indicies.size(); i2++) {
                FormIndex index = indicies.get(i2);
                if (getEvent(index) != 4) {
                    String errorMsg = "Only questions are allowed in 'field-list'.  Bad node is: " + index.getReference().toString(false);
                    RuntimeException e = new RuntimeException(errorMsg);
                    Log.e(t, errorMsg);
                    throw e;
                }
                if (this.mFormEntryController.getModel().isIndexRelevant(index)) {
                    questionList.add(getQuestionPrompt(index));
                }
                questions = new FormEntryPrompt[questionList.size()];
                questionList.toArray(questions);
            }
        } else {
            questions[0] = getQuestionPrompt();
        }
        return questions;
    }

    public FormEntryPrompt getQuestionPrompt(FormIndex index) {
        return this.mFormEntryController.getModel().getQuestionPrompt(index);
    }

    public FormEntryPrompt getQuestionPrompt() {
        return this.mFormEntryController.getModel().getQuestionPrompt();
    }

    public FormEntryCaption[] getGroupsForCurrentIndex() {
        if (getEvent() != 4 && getEvent() != 2 && getEvent() != 8 && getEvent() != 16) {
            return new FormEntryCaption[0];
        }
        int lastquestion = 1;
        if (getEvent() == 2 || getEvent() == 8 || getEvent() == 16) {
            lastquestion = 0;
        }
        FormEntryCaption[] v = getCaptionHierarchy();
        FormEntryCaption[] groups = new FormEntryCaption[v.length - lastquestion];
        for (int i = 0; i < v.length - lastquestion; i++) {
            groups[i] = v[i];
        }
        return groups;
    }

    public boolean indexContainsRepeatableGroup() {
        FormEntryCaption[] groups = getCaptionHierarchy();
        if (groups.length == 0) {
            return false;
        }
        for (FormEntryCaption formEntryCaption : groups) {
            if (formEntryCaption.repeats()) {
                return true;
            }
        }
        return false;
    }

    public int getLastRepeatedGroupRepeatCount() {
        FormEntryCaption[] groups = getCaptionHierarchy();
        if (groups.length > 0) {
            for (int i = groups.length - 1; i > -1; i--) {
                if (groups[i].repeats()) {
                    return groups[i].getMultiplicity();
                }
            }
            return -1;
        }
        return -1;
    }

    public String getLastRepeatedGroupName() {
        FormEntryCaption[] groups = getCaptionHierarchy();
        if (groups.length > 0) {
            for (int i = groups.length - 1; i > -1; i--) {
                if (groups[i].repeats()) {
                    return groups[i].getLongText();
                }
            }
        }
        return null;
    }

    private FormEntryCaption getLastGroup() {
        FormEntryCaption[] groups = getCaptionHierarchy();
        if (groups == null || groups.length == 0) {
            return null;
        }
        return groups[groups.length - 1];
    }

    public int getLastRepeatCount() {
        if (getLastGroup() != null) {
            return getLastGroup().getMultiplicity();
        }
        return -1;
    }

    public String getLastGroupText() {
        if (getLastGroup() != null) {
            return getLastGroup().getLongText();
        }
        return null;
    }

    private IDataReference getSubmissionDataReference() {
        FormDef formDef = this.mFormEntryController.getModel().getForm();
        SubmissionProfile p = formDef.getSubmissionProfile();
        return (p == null || p.getRef() == null) ? new XPathReference("/") : p.getRef();
    }

    public boolean isSubmissionEntireForm() {
        IDataReference sub = getSubmissionDataReference();
        return getInstance().resolveReference(sub) == null;
    }

    public ByteArrayPayload getFilledInFormXml() throws IOException {
        FormInstance datamodel = getInstance();
        XFormSerializingVisitor serializer = new XFormSerializingVisitor();
        ByteArrayPayload payload = (ByteArrayPayload) serializer.createSerializedPayload(datamodel);
        return payload;
    }

    public ByteArrayPayload getSubmissionXml() throws IOException {
        FormInstance instance = getInstance();
        XFormSerializingVisitor serializer = new XFormSerializingVisitor();
        ByteArrayPayload payload = (ByteArrayPayload) serializer.createSerializedPayload(instance, getSubmissionDataReference());
        return payload;
    }

    private TreeElement findDepthFirst(TreeElement parent, String name) {
        TreeElement v;
        int len = parent.getNumChildren();
        for (int i = 0; i < len; i++) {
            TreeElement e = parent.getChildAt(i);
            if (!name.equals(e.getName())) {
                if (e.getNumChildren() != 0 && (v = findDepthFirst(e, name)) != null) {
                    return v;
                }
            } else {
                return e;
            }
        }
        return null;
    }

    public InstanceMetadata getSubmissionMetadata() {
        TreeElement trueSubmissionElement;
        FormDef formDef = this.mFormEntryController.getModel().getForm();
        TreeElement rootElement = formDef.getInstance().getRoot();
        SubmissionProfile p = formDef.getSubmissionProfile();
        if (p == null || p.getRef() == null) {
            trueSubmissionElement = rootElement;
        } else {
            IDataReference ref = p.getRef();
            trueSubmissionElement = formDef.getInstance().resolveReference(ref);
            if (trueSubmissionElement == null) {
                trueSubmissionElement = rootElement;
            }
        }
        TreeElement e = findDepthFirst(trueSubmissionElement, "meta");
        String instanceId = null;
        if (e != null) {
            Vector<TreeElement> v = e.getChildrenWithName(INSTANCE_ID);
            if (v.size() == 1) {
                StringData sa = (StringData) v.get(0).getValue();
                instanceId = (String) sa.getValue();
            }
        }
        return new InstanceMetadata(instanceId);
    }
}
