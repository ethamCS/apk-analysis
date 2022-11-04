package org.odk.collect.android.widgets;

import android.content.Context;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import java.text.NumberFormat;
import org.javarosa.core.model.data.DecimalData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.form.api.FormEntryPrompt;
import org.opendatakit.httpclientandroidlib.impl.client.cache.CacheConfig;
/* loaded from: classes.dex */
public class DecimalWidget extends StringWidget {
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

    public DecimalWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt, true);
        this.mAnswer.setTextSize(1, this.mAnswerFontsize);
        this.mAnswer.setInputType(CacheConfig.DEFAULT_MAX_OBJECT_SIZE_BYTES);
        this.mAnswer.setHorizontallyScrolling(false);
        this.mAnswer.setSingleLine(false);
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
        if (prompt.isReadOnly()) {
            setBackgroundDrawable(null);
            setFocusable(false);
            setClickable(false);
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
            return new DecimalData(Double.valueOf(s).doubleValue());
        } catch (Exception e) {
            return null;
        }
    }
}
