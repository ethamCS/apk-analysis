package org.odk.collect.android.widgets;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.Toast;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class ExStringWidget extends QuestionWidget implements IBinaryWidget {
    protected EditText mAnswer;
    private boolean mHasExApp = true;
    private Button mLaunchIntentButton;
    private Drawable mTextBackground;

    public ExStringWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams();
        params.setMargins(7, 5, 7, 5);
        this.mAnswer = new EditText(context);
        this.mAnswer.setId(QuestionWidget.newUniqueId());
        this.mAnswer.setTextSize(1, this.mAnswerFontsize);
        this.mAnswer.setLayoutParams(params);
        this.mTextBackground = this.mAnswer.getBackground();
        this.mAnswer.setBackgroundDrawable(null);
        this.mAnswer.setKeyListener(new TextKeyListener(TextKeyListener.Capitalize.NONE, false));
        this.mAnswer.setHorizontallyScrolling(false);
        this.mAnswer.setSingleLine(false);
        String s = prompt.getAnswerText();
        if (s != null) {
            this.mAnswer.setText(s);
        }
        if (this.mPrompt.isReadOnly()) {
            this.mAnswer.setBackgroundDrawable(null);
        }
        if (this.mPrompt.isReadOnly() || this.mHasExApp) {
            this.mAnswer.setFocusable(false);
            this.mAnswer.setClickable(false);
        }
        String appearance = prompt.getAppearanceHint();
        String[] attrs = appearance.split(":");
        final String intentName = attrs[1];
        String v = this.mPrompt.getSpecialFormQuestionText("buttonText");
        String buttonText = v != null ? v : context.getString(R.string.launch_app);
        String v2 = this.mPrompt.getSpecialFormQuestionText("noAppErrorString");
        final String errorString = v2 != null ? v2 : context.getString(R.string.no_app);
        this.mLaunchIntentButton = new Button(getContext());
        this.mLaunchIntentButton.setId(QuestionWidget.newUniqueId());
        this.mLaunchIntentButton.setText(buttonText);
        this.mLaunchIntentButton.setTextSize(1, this.mAnswerFontsize);
        this.mLaunchIntentButton.setPadding(20, 20, 20, 20);
        this.mLaunchIntentButton.setEnabled(!this.mPrompt.isReadOnly());
        this.mLaunchIntentButton.setLayoutParams(params);
        this.mLaunchIntentButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.ExStringWidget.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v3) {
                Intent i = new Intent(intentName);
                try {
                    Collect.getInstance().getFormController().setIndexWaitingForData(ExStringWidget.this.mPrompt.getIndex());
                    ExStringWidget.this.fireActivity(i);
                } catch (ActivityNotFoundException e) {
                    ExStringWidget.this.mHasExApp = false;
                    if (!ExStringWidget.this.mPrompt.isReadOnly()) {
                        ExStringWidget.this.mAnswer.setBackgroundDrawable(ExStringWidget.this.mTextBackground);
                        ExStringWidget.this.mAnswer.setFocusable(true);
                        ExStringWidget.this.mAnswer.setFocusableInTouchMode(true);
                        ExStringWidget.this.mAnswer.setClickable(true);
                    }
                    ExStringWidget.this.mLaunchIntentButton.setEnabled(false);
                    ExStringWidget.this.mLaunchIntentButton.setFocusable(false);
                    Collect.getInstance().getFormController().setIndexWaitingForData(null);
                    Toast.makeText(ExStringWidget.this.getContext(), errorString, 0).show();
                    ExStringWidget.this.mAnswer.requestFocus();
                }
            }
        });
        addView(this.mLaunchIntentButton);
        addView(this.mAnswer);
    }

    protected void fireActivity(Intent i) throws ActivityNotFoundException {
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "launchIntent", i.getAction(), this.mPrompt.getIndex());
        ((Activity) getContext()).startActivityForResult(i, 10);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        this.mAnswer.setText((CharSequence) null);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        String s = this.mAnswer.getText().toString();
        if (s == null || s.equals("")) {
            return null;
        }
        return new StringData(s);
    }

    public void setBinaryData(Object answer) {
        this.mAnswer.setText((String) answer);
        Collect.getInstance().getFormController().setIndexWaitingForData(null);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        if (this.mHasExApp) {
            inputManager.hideSoftInputFromWindow(this.mAnswer.getWindowToken(), 0);
            this.mLaunchIntentButton.requestFocus();
        } else if (!this.mPrompt.isReadOnly()) {
            this.mAnswer.requestFocus();
            inputManager.showSoftInput(this.mAnswer, 0);
        } else {
            inputManager.hideSoftInputFromWindow(this.mAnswer.getWindowToken(), 0);
        }
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public boolean isWaitingForBinaryData() {
        return this.mPrompt.getIndex().equals(Collect.getInstance().getFormController().getIndexWaitingForData());
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public void cancelWaitingForBinaryData() {
        Collect.getInstance().getFormController().setIndexWaitingForData(null);
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
        this.mLaunchIntentButton.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mAnswer.cancelLongPress();
        this.mLaunchIntentButton.cancelLongPress();
    }
}
