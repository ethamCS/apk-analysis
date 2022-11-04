package org.odk.collect.android.widgets;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class BarcodeWidget extends QuestionWidget implements IBinaryWidget {
    private Button mGetBarcodeButton = new Button(getContext());
    private TextView mStringAnswer;

    public BarcodeWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        setOrientation(1);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams();
        params.setMargins(7, 5, 7, 5);
        this.mGetBarcodeButton.setId(QuestionWidget.newUniqueId());
        this.mGetBarcodeButton.setText(getContext().getString(R.string.get_barcode));
        this.mGetBarcodeButton.setTextSize(1, this.mAnswerFontsize);
        this.mGetBarcodeButton.setPadding(20, 20, 20, 20);
        this.mGetBarcodeButton.setEnabled(!prompt.isReadOnly());
        this.mGetBarcodeButton.setLayoutParams(params);
        this.mGetBarcodeButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.BarcodeWidget.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "recordBarcode", "click", BarcodeWidget.this.mPrompt.getIndex());
                Intent i = new Intent("com.google.zxing.client.android.SCAN");
                try {
                    Collect.getInstance().getFormController().setIndexWaitingForData(BarcodeWidget.this.mPrompt.getIndex());
                    ((Activity) BarcodeWidget.this.getContext()).startActivityForResult(i, 2);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(BarcodeWidget.this.getContext(), BarcodeWidget.this.getContext().getString(R.string.barcode_scanner_error), 0).show();
                    Collect.getInstance().getFormController().setIndexWaitingForData(null);
                }
            }
        });
        this.mStringAnswer = new TextView(getContext());
        this.mStringAnswer.setId(QuestionWidget.newUniqueId());
        this.mStringAnswer.setTextSize(1, this.mAnswerFontsize);
        this.mStringAnswer.setGravity(17);
        String s = prompt.getAnswerText();
        if (s != null) {
            this.mGetBarcodeButton.setText(getContext().getString(R.string.replace_barcode));
            this.mStringAnswer.setText(s);
        }
        addView(this.mGetBarcodeButton);
        addView(this.mStringAnswer);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        this.mStringAnswer.setText((CharSequence) null);
        this.mGetBarcodeButton.setText(getContext().getString(R.string.get_barcode));
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        String s = this.mStringAnswer.getText().toString();
        if (s == null || s.equals("")) {
            return null;
        }
        return new StringData(s);
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public void setBinaryData(Object answer) {
        this.mStringAnswer.setText((String) answer);
        Collect.getInstance().getFormController().setIndexWaitingForData(null);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public boolean isWaitingForBinaryData() {
        return this.mPrompt.getIndex().equals(Collect.getInstance().getFormController().getIndexWaitingForData());
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public void cancelWaitingForBinaryData() {
        Collect.getInstance().getFormController().setIndexWaitingForData(null);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.mStringAnswer.setOnLongClickListener(l);
        this.mGetBarcodeButton.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mGetBarcodeButton.cancelLongPress();
        this.mStringAnswer.cancelLongPress();
    }
}
