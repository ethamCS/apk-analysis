package org.odk.collect.android.widgets;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.IntegerData;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class ExIntegerWidget extends ExStringWidget {
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

    public ExIntegerWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        this.mAnswer.setInputType(4096);
        this.mAnswer.setKeyListener(new DigitsKeyListener(true, false));
        InputFilter[] fa = {new InputFilter.LengthFilter(9)};
        this.mAnswer.setFilters(fa);
        Integer i = getIntegerAnswerValue();
        if (i != null) {
            this.mAnswer.setText(i.toString());
        }
    }

    @Override // org.odk.collect.android.widgets.ExStringWidget
    protected void fireActivity(Intent i) throws ActivityNotFoundException {
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "launchIntent", i.getAction(), this.mPrompt.getIndex());
        ((Activity) getContext()).startActivityForResult(i, 11);
    }

    @Override // org.odk.collect.android.widgets.ExStringWidget, org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
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

    @Override // org.odk.collect.android.widgets.ExStringWidget, org.odk.collect.android.widgets.IBinaryWidget
    public void setBinaryData(Object answer) {
        this.mAnswer.setText(answer == null ? null : ((Integer) answer).toString());
        Collect.getInstance().getFormController().setIndexWaitingForData(null);
    }
}
