package org.odk.collect.android.activities;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.javarosa.core.model.FormIndex;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryPrompt;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.odk.collect.android.R;
import org.odk.collect.android.adapters.HierarchyListAdapter;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.logic.FormController;
import org.odk.collect.android.logic.HierarchyElement;
/* loaded from: classes.dex */
public class FormHierarchyActivity extends ListActivity {
    private static final int CHILD = 1;
    private static final int COLLAPSED = 3;
    private static final int EXPANDED = 2;
    private static final int QUESTION = 4;
    private static final String mIndent = "     ";
    private static final String t = "FormHierarchyActivity";
    List<HierarchyElement> formList;
    private Button jumpPreviousButton;
    TextView mPath;
    FormIndex mStartIndex;

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hierarchy_layout);
        FormController formController = Collect.getInstance().getFormController();
        this.mStartIndex = formController.getFormIndex();
        setTitle(getString(R.string.app_name) + " > " + formController.getFormTitle());
        this.mPath = (TextView) findViewById(R.id.pathtext);
        this.jumpPreviousButton = (Button) findViewById(R.id.jumpPreviousButton);
        this.jumpPreviousButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.FormHierarchyActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "goUpLevelButton", "click");
                FormHierarchyActivity.this.goUpLevel();
            }
        });
        Button jumpBeginningButton = (Button) findViewById(R.id.jumpBeginningButton);
        jumpBeginningButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.FormHierarchyActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "jumpToBeginning", "click");
                Collect.getInstance().getFormController().jumpToIndex(FormIndex.createBeginningOfFormIndex());
                FormHierarchyActivity.this.setResult(-1);
                FormHierarchyActivity.this.finish();
            }
        });
        Button jumpEndButton = (Button) findViewById(R.id.jumpEndButton);
        jumpEndButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.FormHierarchyActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "jumpToEnd", "click");
                Collect.getInstance().getFormController().jumpToIndex(FormIndex.createEndOfFormIndex());
                FormHierarchyActivity.this.setResult(-1);
                FormHierarchyActivity.this.finish();
            }
        });
        getListView().post(new Runnable() { // from class: org.odk.collect.android.activities.FormHierarchyActivity.4
            @Override // java.lang.Runnable
            public void run() {
                int position = 0;
                int i = 0;
                while (true) {
                    if (i >= FormHierarchyActivity.this.getListAdapter().getCount()) {
                        break;
                    }
                    HierarchyElement he = (HierarchyElement) FormHierarchyActivity.this.getListAdapter().getItem(i);
                    if (!FormHierarchyActivity.this.mStartIndex.equals(he.getFormIndex())) {
                        i++;
                    } else {
                        position = i;
                        break;
                    }
                }
                FormHierarchyActivity.this.getListView().setSelection(position);
            }
        });
        refreshView();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Collect.getInstance().getActivityLogger().logOnStart(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        Collect.getInstance().getActivityLogger().logOnStop(this);
        super.onStop();
    }

    public void goUpLevel() {
        Collect.getInstance().getFormController().stepToOuterScreenEvent();
        refreshView();
    }

    private String getCurrentPath() {
        FormController formController = Collect.getInstance().getFormController();
        FormIndex index = formController.getFormIndex();
        String path = "";
        for (FormIndex index2 = formController.stepIndexOut(index); index2 != null; index2 = formController.stepIndexOut(index2)) {
            path = formController.getCaptionPrompt(index2).getLongText() + " (" + (formController.getCaptionPrompt(index2).getMultiplicity() + 1) + ") > " + path;
        }
        return path.substring(0, path.length() - 2);
    }

    public void refreshView() {
        FormController formController = Collect.getInstance().getFormController();
        FormIndex currentIndex = formController.getFormIndex();
        String enclosingGroupRef = "";
        this.formList = new ArrayList();
        if (formController.getEvent() == 16) {
            enclosingGroupRef = formController.getFormIndex().getReference().toString(false);
            formController.stepToNextEvent(true);
        } else {
            FormIndex startTest = formController.stepIndexOut(currentIndex);
            while (startTest != null && formController.getEvent(startTest) == 8) {
                startTest = formController.stepIndexOut(startTest);
            }
            if (startTest == null) {
                formController.jumpToIndex(FormIndex.createBeginningOfFormIndex());
            } else {
                formController.jumpToIndex(startTest);
            }
            if (formController.getEvent() == 16) {
                enclosingGroupRef = formController.getFormIndex().getReference().toString(false);
                formController.stepToNextEvent(true);
            }
        }
        int event = formController.getEvent();
        if (event == 0) {
            formController.stepToNextEvent(true);
            this.mPath.setVisibility(8);
            this.jumpPreviousButton.setEnabled(false);
        } else {
            this.mPath.setVisibility(0);
            this.mPath.setText(getCurrentPath());
            this.jumpPreviousButton.setEnabled(true);
        }
        int event2 = formController.getEvent();
        String repeatedGroupRef = "";
        while (event2 != 1) {
            switch (event2) {
                case 2:
                    if (enclosingGroupRef.compareTo(formController.getFormIndex().getReference().toString(false)) != 0) {
                        if (repeatedGroupRef.compareTo(formController.getFormIndex().getReference().toString(false)) != 0) {
                            event2 = formController.stepToNextEvent(true);
                            continue;
                        } else {
                            if (repeatedGroupRef.compareTo(formController.getFormIndex().getReference().toString(false)) == 0) {
                                repeatedGroupRef = "";
                                break;
                            }
                        }
                    } else {
                        HierarchyListAdapter itla = new HierarchyListAdapter(this);
                        itla.setListItems(this.formList);
                        setListAdapter(itla);
                        formController.jumpToIndex(currentIndex);
                    }
                    break;
                case 4:
                    if (!repeatedGroupRef.equalsIgnoreCase("")) {
                        event2 = formController.stepToNextEvent(true);
                        continue;
                    } else {
                        FormEntryPrompt fp = formController.getQuestionPrompt();
                        String label = fp.getLongText();
                        if (!fp.isReadOnly() || (label != null && label.length() > 0)) {
                            this.formList.add(new HierarchyElement(fp.getLongText(), fp.getAnswerText(), null, -1, 4, fp.getIndex()));
                            break;
                        }
                    }
                case 16:
                    FormEntryCaption fc = formController.getCaptionPrompt();
                    if (enclosingGroupRef.compareTo(formController.getFormIndex().getReference().toString(false)) != 0) {
                        if (repeatedGroupRef.equalsIgnoreCase("") && fc.getMultiplicity() == 0) {
                            HierarchyElement group = new HierarchyElement(fc.getLongText(), null, getResources().getDrawable(R.drawable.expander_ic_minimized), -1, 3, fc.getIndex());
                            repeatedGroupRef = formController.getFormIndex().getReference().toString(false);
                            this.formList.add(group);
                        }
                        if (repeatedGroupRef.compareTo(formController.getFormIndex().getReference().toString(false)) == 0) {
                            HierarchyElement h = this.formList.get(this.formList.size() - 1);
                            h.addChild(new HierarchyElement(mIndent + fc.getLongText() + XFormAnswerDataSerializer.DELIMITER + (fc.getMultiplicity() + 1), null, null, -1, 1, fc.getIndex()));
                            break;
                        }
                    } else {
                        HierarchyListAdapter itla2 = new HierarchyListAdapter(this);
                        itla2.setListItems(this.formList);
                        setListAdapter(itla2);
                        formController.jumpToIndex(currentIndex);
                    }
                    break;
            }
            event2 = formController.stepToNextEvent(true);
        }
        HierarchyListAdapter itla22 = new HierarchyListAdapter(this);
        itla22.setListItems(this.formList);
        setListAdapter(itla22);
        formController.jumpToIndex(currentIndex);
    }

    @Override // android.app.ListActivity
    protected void onListItemClick(ListView l, View v, int position, long id) {
        HierarchyElement h = (HierarchyElement) l.getItemAtPosition(position);
        FormIndex index = h.getFormIndex();
        if (index == null) {
            goUpLevel();
            return;
        }
        switch (h.getType()) {
            case 1:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onListItemClick", "REPEAT-JUMP", h.getFormIndex());
                Collect.getInstance().getFormController().jumpToIndex(h.getFormIndex());
                setResult(-1);
                refreshView();
                return;
            case 2:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onListItemClick", "COLLAPSED", h.getFormIndex());
                h.setType(3);
                ArrayList<HierarchyElement> children = h.getChildren();
                for (int i = 0; i < children.size(); i++) {
                    this.formList.remove(position + 1);
                }
                h.setIcon(getResources().getDrawable(R.drawable.expander_ic_minimized));
                h.setColor(-1);
                break;
            case 3:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onListItemClick", "EXPANDED", h.getFormIndex());
                h.setType(2);
                ArrayList<HierarchyElement> children1 = h.getChildren();
                for (int i2 = 0; i2 < children1.size(); i2++) {
                    Log.i(t, "adding child: " + children1.get(i2).getFormIndex());
                    this.formList.add(position + 1 + i2, children1.get(i2));
                }
                h.setIcon(getResources().getDrawable(R.drawable.expander_ic_maximized));
                h.setColor(-1);
                break;
            case 4:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onListItemClick", "QUESTION-JUMP", index);
                Collect.getInstance().getFormController().jumpToIndex(index);
                if (Collect.getInstance().getFormController().indexIsInFieldList()) {
                    Collect.getInstance().getFormController().stepToPreviousScreenEvent();
                }
                setResult(-1);
                finish();
                return;
        }
        HierarchyListAdapter itla = new HierarchyListAdapter(this);
        itla.setListItems(this.formList);
        setListAdapter(itla);
        getListView().setSelection(position);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case 4:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onKeyDown", "KEYCODE_BACK.JUMP", this.mStartIndex);
                Collect.getInstance().getFormController().jumpToIndex(this.mStartIndex);
                break;
        }
        return super.onKeyDown(keyCode, event);
    }
}
