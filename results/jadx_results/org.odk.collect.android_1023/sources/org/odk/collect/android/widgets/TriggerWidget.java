package org.odk.collect.android.widgets;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.TextView;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class TriggerWidget extends QuestionWidget {
    private static final String mOK = "OK";
    private FormEntryPrompt mPrompt;
    private TextView mStringAnswer;
    private CheckBox mTriggerButton = new CheckBox(getContext());

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public FormEntryPrompt getPrompt() {
        return this.mPrompt;
    }

    public TriggerWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        this.mPrompt = prompt;
        setOrientation(1);
        this.mTriggerButton.setId(QuestionWidget.newUniqueId());
        this.mTriggerButton.setText(getContext().getString(R.string.trigger));
        this.mTriggerButton.setTextSize(1, this.mAnswerFontsize);
        this.mTriggerButton.setEnabled(!prompt.isReadOnly());
        this.mTriggerButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.TriggerWidget.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (TriggerWidget.this.mTriggerButton.isChecked()) {
                    TriggerWidget.this.mStringAnswer.setText(TriggerWidget.mOK);
                    Collect.getInstance().getActivityLogger().logInstanceAction(TriggerWidget.this, "triggerButton", TriggerWidget.mOK, TriggerWidget.this.mPrompt.getIndex());
                    return;
                }
                TriggerWidget.this.mStringAnswer.setText((CharSequence) null);
                Collect.getInstance().getActivityLogger().logInstanceAction(TriggerWidget.this, "triggerButton", "null", TriggerWidget.this.mPrompt.getIndex());
            }
        });
        this.mStringAnswer = new TextView(getContext());
        this.mStringAnswer.setId(QuestionWidget.newUniqueId());
        this.mStringAnswer.setTextSize(1, this.mAnswerFontsize);
        this.mStringAnswer.setGravity(17);
        String s = prompt.getAnswerText();
        if (s != null) {
            if (s.equals(mOK)) {
                this.mTriggerButton.setChecked(true);
            } else {
                this.mTriggerButton.setChecked(false);
            }
            this.mStringAnswer.setText(s);
        }
        addView(this.mTriggerButton);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        this.mStringAnswer.setText((CharSequence) null);
        this.mTriggerButton.setChecked(false);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        String s = this.mStringAnswer.getText().toString();
        if (s == null || s.equals("")) {
            return null;
        }
        return new StringData(s);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.mTriggerButton.setOnLongClickListener(l);
        this.mStringAnswer.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mTriggerButton.cancelLongPress();
        this.mStringAnswer.cancelLongPress();
    }
}
