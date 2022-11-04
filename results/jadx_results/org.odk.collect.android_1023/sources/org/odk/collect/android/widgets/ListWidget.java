package org.odk.collect.android.widgets;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class ListWidget extends QuestionWidget implements CompoundButton.OnCheckedChangeListener {
    private static final String t = "ListWidget";
    ArrayList<RadioButton> buttons = new ArrayList<>();
    Vector<SelectChoice> mItems;
    LinearLayout questionLayout;

    /* JADX WARN: Removed duplicated region for block: B:36:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0251 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ListWidget(android.content.Context r33, org.javarosa.form.api.FormEntryPrompt r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.odk.collect.android.widgets.ListWidget.<init>(android.content.Context, org.javarosa.form.api.FormEntryPrompt, boolean):void");
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
        if (isChecked) {
            Iterator i$ = this.buttons.iterator();
            while (i$.hasNext()) {
                RadioButton button = i$.next();
                if (button.isChecked() && buttonView != button) {
                    button.setChecked(false);
                }
            }
            Collect.getInstance().getActivityLogger().logInstanceAction(this, "onCheckedChanged", this.mItems.get(((Integer) buttonView.getTag()).intValue()).getValue(), this.mPrompt.getIndex());
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    protected void addQuestionText(FormEntryPrompt p) {
        TextView questionText = new TextView(getContext());
        questionText.setText(p.getLongText());
        questionText.setTextSize(1, this.mQuestionFontsize);
        questionText.setTypeface(null, 1);
        questionText.setPadding(0, 0, 0, 7);
        questionText.setId(QuestionWidget.newUniqueId());
        questionText.setHorizontallyScrolling(false);
        if (p.getLongText() == null) {
            questionText.setVisibility(8);
        }
        LinearLayout.LayoutParams labelParams = new LinearLayout.LayoutParams(-1, -2);
        labelParams.weight = 1.0f;
        this.questionLayout = new LinearLayout(getContext());
        this.questionLayout.setOrientation(0);
        this.questionLayout.addView(questionText, labelParams);
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
