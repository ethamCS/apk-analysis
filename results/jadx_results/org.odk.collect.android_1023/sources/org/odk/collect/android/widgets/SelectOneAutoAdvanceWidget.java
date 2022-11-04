package org.odk.collect.android.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.AdvanceToNextListener;
import org.odk.collect.android.views.MediaLayout;
/* loaded from: classes.dex */
public class SelectOneAutoAdvanceWidget extends QuestionWidget implements CompoundButton.OnCheckedChangeListener {
    ArrayList<RadioButton> buttons = new ArrayList<>();
    AdvanceToNextListener listener;
    Vector<SelectChoice> mItems;

    public SelectOneAutoAdvanceWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        this.mItems = prompt.getSelectChoices();
        this.listener = (AdvanceToNextListener) context;
        String s = null;
        s = prompt.getAnswerValue() != null ? ((Selection) prompt.getAnswerValue().getValue()).getValue() : s;
        Bitmap b = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.expander_ic_right);
        if (this.mItems != null) {
            for (int i = 0; i < this.mItems.size(); i++) {
                RelativeLayout thisParentLayout = (RelativeLayout) inflater.inflate(R.layout.quick_select_layout, (ViewGroup) null);
                LinearLayout questionLayout = (LinearLayout) thisParentLayout.getChildAt(0);
                ImageView rightArrow = (ImageView) thisParentLayout.getChildAt(1);
                RadioButton r = new RadioButton(getContext());
                r.setText(prompt.getSelectChoiceText(this.mItems.get(i)));
                r.setTextSize(1, this.mAnswerFontsize);
                r.setTag(Integer.valueOf(i));
                r.setId(QuestionWidget.newUniqueId());
                r.setEnabled(!prompt.isReadOnly());
                r.setFocusable(!prompt.isReadOnly());
                rightArrow.setImageBitmap(b);
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
                mediaLayout.setAVT(prompt.getIndex(), "", r, audioURI, imageURI, videoURI, bigImageURI);
                if (i != this.mItems.size() - 1) {
                    ImageView divider = new ImageView(getContext());
                    divider.setBackgroundResource(17301522);
                    mediaLayout.addDivider(divider);
                }
                questionLayout.addView(mediaLayout);
                addView(thisParentLayout);
            }
        }
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
        if (buttonView.isPressed() && isChecked) {
            Iterator i$ = this.buttons.iterator();
            while (i$.hasNext()) {
                RadioButton button = i$.next();
                if (button.isChecked() && buttonView != button) {
                    button.setChecked(false);
                }
            }
            Collect.getInstance().getActivityLogger().logInstanceAction(this, "onCheckedChanged", this.mItems.get(((Integer) buttonView.getTag()).intValue()).getValue(), this.mPrompt.getIndex());
            this.listener.advance();
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
            RadioButton r = i$.next();
            r.cancelLongPress();
        }
    }
}
