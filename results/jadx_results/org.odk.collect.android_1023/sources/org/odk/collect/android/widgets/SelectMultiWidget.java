package org.odk.collect.android.widgets;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.views.MediaLayout;
/* loaded from: classes.dex */
public class SelectMultiWidget extends QuestionWidget {
    private boolean mCheckboxInit;
    private ArrayList<CheckBox> mCheckboxes = new ArrayList<>();
    Vector<SelectChoice> mItems;

    public SelectMultiWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        this.mCheckboxInit = true;
        this.mPrompt = prompt;
        this.mItems = prompt.getSelectChoices();
        setOrientation(1);
        Vector<Selection> ve = new Vector<>();
        ve = prompt.getAnswerValue() != null ? (Vector) prompt.getAnswerValue().getValue() : ve;
        if (this.mItems != null) {
            for (int i = 0; i < this.mItems.size(); i++) {
                CheckBox c = new CheckBox(getContext());
                c.setTag(Integer.valueOf(i));
                c.setId(QuestionWidget.newUniqueId());
                c.setText(prompt.getSelectChoiceText(this.mItems.get(i)));
                c.setTextSize(1, this.mAnswerFontsize);
                c.setFocusable(!prompt.isReadOnly());
                c.setEnabled(!prompt.isReadOnly());
                int vi = 0;
                while (true) {
                    if (vi < ve.size()) {
                        if (!this.mItems.get(i).getValue().equals(ve.elementAt(vi).getValue())) {
                            vi++;
                        } else {
                            c.setChecked(true);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.mCheckboxes.add(c);
                c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: org.odk.collect.android.widgets.SelectMultiWidget.1
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!SelectMultiWidget.this.mCheckboxInit && SelectMultiWidget.this.mPrompt.isReadOnly()) {
                            if (buttonView.isChecked()) {
                                buttonView.setChecked(false);
                                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onItemClick.deselect", SelectMultiWidget.this.mItems.get(((Integer) buttonView.getTag()).intValue()).getValue(), SelectMultiWidget.this.mPrompt.getIndex());
                                return;
                            }
                            buttonView.setChecked(true);
                            Collect.getInstance().getActivityLogger().logInstanceAction(this, "onItemClick.select", SelectMultiWidget.this.mItems.get(((Integer) buttonView.getTag()).intValue()).getValue(), SelectMultiWidget.this.mPrompt.getIndex());
                        }
                    }
                });
                String audioURI = prompt.getSpecialFormSelectChoiceText(this.mItems.get(i), FormEntryCaption.TEXT_FORM_AUDIO);
                String imageURI = prompt.getSpecialFormSelectChoiceText(this.mItems.get(i), FormEntryCaption.TEXT_FORM_IMAGE);
                String videoURI = prompt.getSpecialFormSelectChoiceText(this.mItems.get(i), FormEntryCaption.TEXT_FORM_VIDEO);
                String bigImageURI = prompt.getSpecialFormSelectChoiceText(this.mItems.get(i), "big-image");
                MediaLayout mediaLayout = new MediaLayout(getContext());
                mediaLayout.setAVT(prompt.getIndex(), "." + Integer.toString(i), c, audioURI, imageURI, videoURI, bigImageURI);
                addView(mediaLayout);
                ImageView divider = new ImageView(getContext());
                divider.setBackgroundResource(17301522);
                if (i != this.mItems.size() - 1) {
                    addView(divider);
                }
            }
        }
        this.mCheckboxInit = false;
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        Iterator i$ = this.mCheckboxes.iterator();
        while (i$.hasNext()) {
            CheckBox c = i$.next();
            if (c.isChecked()) {
                c.setChecked(false);
            }
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        Vector<Selection> vc = new Vector<>();
        for (int i = 0; i < this.mCheckboxes.size(); i++) {
            CheckBox c = this.mCheckboxes.get(i);
            if (c.isChecked()) {
                vc.add(new Selection(this.mItems.get(i)));
            }
        }
        if (vc.size() == 0) {
            return null;
        }
        return new SelectMultiData(vc);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        Iterator i$ = this.mCheckboxes.iterator();
        while (i$.hasNext()) {
            CheckBox c = i$.next();
            c.setOnLongClickListener(l);
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        Iterator i$ = this.mCheckboxes.iterator();
        while (i$.hasNext()) {
            CheckBox c = i$.next();
            c.cancelLongPress();
        }
    }
}
