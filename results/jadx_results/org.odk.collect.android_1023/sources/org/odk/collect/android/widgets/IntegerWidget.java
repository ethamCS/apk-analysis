package org.odk.collect.android.widgets;

import android.content.Context;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.IntegerData;
import org.javarosa.form.api.FormEntryPrompt;
/* loaded from: classes.dex */
public class IntegerWidget extends StringWidget {
    private Integer getIntegerAnswerValue() {
        Object dataValue;
        IAnswerData dataHolder = this.mPrompt.getAnswerValue();
        if (dataHolder == null || (dataValue = dataHolder.getValue()) == null) {
            return null;
        }
        if (dataValue instanceof Double) {
            Integer d = Integer.valueOf(((Double) dataValue).intValue());
            return d;
        }
        Integer d2 = (Integer) dataValue;
        return d2;
    }

    public IntegerWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt, true);
        this.mAnswer.setTextSize(1, this.mAnswerFontsize);
        this.mAnswer.setInputType(4096);
        this.mAnswer.setHorizontallyScrolling(false);
        this.mAnswer.setSingleLine(false);
        this.mAnswer.setKeyListener(new DigitsKeyListener(true, false));
        InputFilter[] fa = {new InputFilter.LengthFilter(9)};
        this.mAnswer.setFilters(fa);
        if (prompt.isReadOnly()) {
            setBackgroundDrawable(null);
            setFocusable(false);
            setClickable(false);
        }
        Integer i = getIntegerAnswerValue();
        if (i != null) {
            this.mAnswer.setText(i.toString());
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
            return new IntegerData(Integer.parseInt(s));
        } catch (Exception e) {
            return null;
        }
    }
}
