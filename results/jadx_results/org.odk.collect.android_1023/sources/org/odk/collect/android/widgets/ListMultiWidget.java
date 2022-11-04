package org.odk.collect.android.widgets;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.form.api.FormEntryPrompt;
/* loaded from: classes.dex */
public class ListMultiWidget extends QuestionWidget {
    private static final String t = "ListMultiWidget";
    private boolean mCheckboxInit = true;
    private ArrayList<CheckBox> mCheckboxes = new ArrayList<>();
    private Vector<SelectChoice> mItems;
    LinearLayout questionLayout;

    /* JADX WARN: Removed duplicated region for block: B:39:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ListMultiWidget(android.content.Context r34, org.javarosa.form.api.FormEntryPrompt r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.odk.collect.android.widgets.ListMultiWidget.<init>(android.content.Context, org.javarosa.form.api.FormEntryPrompt, boolean):void");
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        for (int i = 0; i < this.mCheckboxes.size(); i++) {
            CheckBox c = this.mCheckboxes.get(i);
            if (c.isChecked()) {
                c.setChecked(false);
            }
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        Vector<Selection> vc = new Vector<>();
        for (int i = 0; i < this.mCheckboxes.size(); i++) {
            CheckBox c = this.mCheckboxes.get(i);
            if (c.isChecked()) {
                vc.add(new Selection(this.mItems.get(i)));
            }
        }
        if (vc.size() == 0) {
            return null;
        }
        return new SelectMultiData(vc);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
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
        Iterator i$ = this.mCheckboxes.iterator();
        while (i$.hasNext()) {
            CheckBox c = i$.next();
            c.setOnLongClickListener(l);
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        Iterator i$ = this.mCheckboxes.iterator();
        while (i$.hasNext()) {
            CheckBox c = i$.next();
            c.cancelLongPress();
        }
    }
}
