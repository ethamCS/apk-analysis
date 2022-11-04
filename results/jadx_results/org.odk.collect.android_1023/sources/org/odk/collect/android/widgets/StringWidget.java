package org.odk.collect.android.widgets;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TableLayout;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class StringWidget extends QuestionWidget {
    protected EditText mAnswer;
    boolean mReadOnly;

    public StringWidget(Context context, FormEntryPrompt prompt) {
        this(context, prompt, true);
        setupChangeListener();
    }

    public StringWidget(Context context, FormEntryPrompt prompt, boolean derived) {
        super(context, prompt);
        this.mReadOnly = false;
        this.mAnswer = new EditText(context);
        this.mAnswer.setId(QuestionWidget.newUniqueId());
        this.mReadOnly = prompt.isReadOnly();
        this.mAnswer.setTextSize(1, this.mAnswerFontsize);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams();
        params.setMargins(7, 5, 7, 5);
        this.mAnswer.setLayoutParams(params);
        this.mAnswer.setKeyListener(new TextKeyListener(TextKeyListener.Capitalize.SENTENCES, false));
        this.mAnswer.setHorizontallyScrolling(false);
        this.mAnswer.setSingleLine(false);
        String s = prompt.getAnswerText();
        if (s != null) {
            this.mAnswer.setText(s);
        }
        if (this.mReadOnly) {
            this.mAnswer.setBackgroundDrawable(null);
            this.mAnswer.setFocusable(false);
            this.mAnswer.setClickable(false);
        }
        addView(this.mAnswer);
    }

    public void setupChangeListener() {
        this.mAnswer.addTextChangedListener(new TextWatcher() { // from class: org.odk.collect.android.widgets.StringWidget.1
            private String oldText = "";

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals(this.oldText)) {
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "answerTextChanged", s.toString(), StringWidget.this.getPrompt().getIndex());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                this.oldText = s.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        this.mAnswer.setText((CharSequence) null);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        clearFocus();
        String s = this.mAnswer.getText().toString();
        if (s == null || s.equals("")) {
            return null;
        }
        return new StringData(s);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        this.mAnswer.requestFocus();
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        if (!this.mReadOnly) {
            inputManager.showSoftInput(this.mAnswer, 0);
        } else {
            inputManager.hideSoftInputFromWindow(this.mAnswer.getWindowToken(), 0);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.isAltPressed()) {
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.mAnswer.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mAnswer.cancelLongPress();
    }
}
