package org.odk.collect.android.widgets;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.views.MediaLayout;
/* loaded from: classes.dex */
public class SelectOneWidget extends QuestionWidget implements CompoundButton.OnCheckedChangeListener {
    ArrayList<RadioButton> buttons = new ArrayList<>();
    Vector<SelectChoice> mItems;

    public SelectOneWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        this.mItems = prompt.getSelectChoices();
        LinearLayout buttonLayout = new LinearLayout(context);
        String s = null;
        s = prompt.getAnswerValue() != null ? ((Selection) prompt.getAnswerValue().getValue()).getValue() : s;
        if (this.mItems != null) {
            for (int i = 0; i < this.mItems.size(); i++) {
                RadioButton r = new RadioButton(getContext());
                r.setText(prompt.getSelectChoiceText(this.mItems.get(i)));
                r.setTextSize(1, this.mAnswerFontsize);
                r.setTag(Integer.valueOf(i));
                r.setId(QuestionWidget.newUniqueId());
                r.setEnabled(!prompt.isReadOnly());
                r.setFocusable(!prompt.isReadOnly());
                this.buttons.add(r);
                if (this.mItems.get(i).getValue().equals(s)) {
                    r.setChecked(true);
                }
                r.setOnCheckedChangeListener(this);
                String audioURI = prompt.getSpecialFormSelectChoiceText(this.mItems.get(i), FormEntryCaption.TEXT_FORM_AUDIO);
                String imageURI = prompt.getSpecialFormSelectChoiceText(this.mItems.get(i), FormEntryCaption.TEXT_FORM_IMAGE);
                String videoURI = prompt.getSpecialFormSelectChoiceText(this.mItems.get(i), FormEntryCaption.TEXT_FORM_VIDEO);
                String bigImageURI = prompt.getSpecialFormSelectChoiceText(this.mItems.get(i), "big-image");
                MediaLayout mediaLayout = new MediaLayout(getContext());
                mediaLayout.setAVT(prompt.getIndex(), "." + Integer.toString(i), r, audioURI, imageURI, videoURI, bigImageURI);
                if (i != this.mItems.size() - 1) {
                    ImageView divider = new ImageView(getContext());
                    divider.setBackgroundResource(17301522);
                    mediaLayout.addDivider(divider);
                }
                buttonLayout.addView(mediaLayout);
            }
        }
        buttonLayout.setOrientation(1);
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(-1, -2);
        addView(buttonLayout, buttonParams);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        Iterator i$ = this.buttons.iterator();
        while (i$.hasNext()) {
            RadioButton button = i$.next();
            if (button.isChecked()) {
                button.setChecked(false);
                return;
            }
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        int i = getCheckedId();
        if (i == -1) {
            return null;
        }
        SelectChoice sc = this.mItems.elementAt(i);
        return new SelectOneData(new Selection(sc));
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int getCheckedId() {
        for (int i = 0; i < this.buttons.size(); i++) {
            RadioButton button = this.buttons.get(i);
            if (button.isChecked()) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            Iterator i$ = this.buttons.iterator();
            while (i$.hasNext()) {
                RadioButton button = i$.next();
                if (button.isChecked() && buttonView != button) {
                    button.setChecked(false);
                }
            }
            Collect.getInstance().getActivityLogger().logInstanceAction(this, "onCheckedChanged", this.mItems.get(((Integer) buttonView.getTag()).intValue()).getValue(), this.mPrompt.getIndex());
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        Iterator i$ = this.buttons.iterator();
        while (i$.hasNext()) {
            RadioButton r = i$.next();
            r.setOnLongClickListener(l);
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        Iterator i$ = this.buttons.iterator();
        while (i$.hasNext()) {
            RadioButton button = i$.next();
            button.cancelLongPress();
        }
    }
}
