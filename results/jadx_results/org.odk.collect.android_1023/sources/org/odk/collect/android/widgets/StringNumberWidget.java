package org.odk.collect.android.widgets;

import android.content.Context;
import android.text.method.DigitsKeyListener;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.form.api.FormEntryPrompt;
/* loaded from: classes.dex */
public class StringNumberWidget extends StringWidget {
    public StringNumberWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt, true);
        this.mAnswer.setTextSize(1, this.mAnswerFontsize);
        this.mAnswer.setInputType(4096);
        this.mAnswer.setHorizontallyScrolling(false);
        this.mAnswer.setSingleLine(false);
        this.mAnswer.setKeyListener(new DigitsKeyListener() { // from class: org.odk.collect.android.widgets.StringNumberWidget.1
            @Override // android.text.method.DigitsKeyListener, android.text.method.NumberKeyListener
            protected char[] getAcceptedChars() {
                char[] accepted = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', '-', '+', ' ', ','};
                return accepted;
            }
        });
        if (prompt.isReadOnly()) {
            setBackgroundDrawable(null);
            setFocusable(false);
            setClickable(false);
        }
        String s = null;
        s = prompt.getAnswerValue() != null ? (String) prompt.getAnswerValue().getValue() : s;
        if (s != null) {
            this.mAnswer.setText(s);
        }
        setupChangeListener();
    }

    @Override // org.odk.collect.android.widgets.StringWidget, org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        clearFocus();
        String s = this.mAnswer.getText().toString();
        if (s == null || s.equals("")) {
            return null;
        }
        try {
            return new StringData(s);
        } catch (Exception e) {
            return null;
        }
    }
}
