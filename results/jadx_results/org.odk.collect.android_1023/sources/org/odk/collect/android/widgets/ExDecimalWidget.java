package org.odk.collect.android.widgets;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import java.text.NumberFormat;
import org.javarosa.core.model.data.DecimalData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.application.Collect;
import org.opendatakit.httpclientandroidlib.impl.client.cache.CacheConfig;
/* loaded from: classes.dex */
public class ExDecimalWidget extends ExStringWidget {
    private Double getDoubleAnswerValue() {
        Object dataValue;
        IAnswerData dataHolder = this.mPrompt.getAnswerValue();
        if (dataHolder == null || (dataValue = dataHolder.getValue()) == null) {
            return null;
        }
        if (dataValue instanceof Integer) {
            Double d = Double.valueOf(((Integer) dataValue).intValue());
            return d;
        }
        Double d2 = (Double) dataValue;
        return d2;
    }

    public ExDecimalWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        this.mAnswer.setInputType(CacheConfig.DEFAULT_MAX_OBJECT_SIZE_BYTES);
        this.mAnswer.setKeyListener(new DigitsKeyListener(true, true));
        InputFilter[] fa = {new InputFilter.LengthFilter(15)};
        this.mAnswer.setFilters(fa);
        Double d = getDoubleAnswerValue();
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(15);
        nf.setMaximumIntegerDigits(15);
        nf.setGroupingUsed(false);
        if (d != null) {
            String dString = nf.format(d);
            this.mAnswer.setText(Double.valueOf(Double.parseDouble(dString.replace(',', '.'))).toString());
        }
    }

    @Override // org.odk.collect.android.widgets.ExStringWidget
    protected void fireActivity(Intent i) throws ActivityNotFoundException {
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "launchIntent", i.getAction(), this.mPrompt.getIndex());
        ((Activity) getContext()).startActivityForResult(i, 12);
    }

    @Override // org.odk.collect.android.widgets.ExStringWidget, org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        String s = this.mAnswer.getText().toString();
        if (s == null || s.equals("")) {
            return null;
        }
        try {
            return new DecimalData(Double.valueOf(s).doubleValue());
        } catch (Exception e) {
            return null;
        }
    }

    @Override // org.odk.collect.android.widgets.ExStringWidget, org.odk.collect.android.widgets.IBinaryWidget
    public void setBinaryData(Object answer) {
        this.mAnswer.setText(answer == null ? null : ((Double) answer).toString());
        Collect.getInstance().getFormController().setIndexWaitingForData(null);
    }
}
