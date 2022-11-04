package org.odk.collect.android.widgets;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.R;
/* loaded from: classes.dex */
public class SpinnerMultiWidget extends QuestionWidget {
    AlertDialog.Builder alert_builder;
    CharSequence[] answer_items;
    Button button;
    Vector<SelectChoice> mItems;
    TextView selectionText = new TextView(getContext());
    boolean[] selections;

    public SpinnerMultiWidget(final Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        this.mItems = prompt.getSelectChoices();
        this.mPrompt = prompt;
        this.selections = new boolean[this.mItems.size()];
        this.answer_items = new CharSequence[this.mItems.size()];
        this.alert_builder = new AlertDialog.Builder(context);
        this.button = new Button(context);
        for (int i = 0; i < this.mItems.size(); i++) {
            this.answer_items[i] = prompt.getSelectChoiceText(this.mItems.get(i));
        }
        this.selectionText.setText(context.getString(R.string.selected));
        this.selectionText.setTextSize(1, this.mQuestionFontsize);
        this.selectionText.setVisibility(8);
        this.button.setText(context.getString(R.string.select_answer));
        this.button.setTextSize(1, this.mQuestionFontsize);
        this.button.setPadding(0, 0, 0, 7);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.SpinnerMultiWidget.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                SpinnerMultiWidget.this.alert_builder.setTitle(SpinnerMultiWidget.this.mPrompt.getQuestionText()).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.widgets.SpinnerMultiWidget.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int id) {
                        boolean first = true;
                        SpinnerMultiWidget.this.selectionText.setText("");
                        for (int i2 = 0; i2 < SpinnerMultiWidget.this.selections.length; i2++) {
                            if (SpinnerMultiWidget.this.selections[i2]) {
                                if (first) {
                                    first = false;
                                    SpinnerMultiWidget.this.selectionText.setText(context.getString(R.string.selected) + SpinnerMultiWidget.this.answer_items[i2].toString());
                                    SpinnerMultiWidget.this.selectionText.setVisibility(0);
                                } else {
                                    SpinnerMultiWidget.this.selectionText.setText(((Object) SpinnerMultiWidget.this.selectionText.getText()) + ", " + SpinnerMultiWidget.this.answer_items[i2].toString());
                                }
                            }
                        }
                    }
                });
                SpinnerMultiWidget.this.alert_builder.setMultiChoiceItems(SpinnerMultiWidget.this.answer_items, SpinnerMultiWidget.this.selections, new DialogInterface.OnMultiChoiceClickListener() { // from class: org.odk.collect.android.widgets.SpinnerMultiWidget.1.2
                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        SpinnerMultiWidget.this.selections[which] = isChecked;
                    }
                });
                AlertDialog alert = SpinnerMultiWidget.this.alert_builder.create();
                alert.show();
            }
        });
        Vector<Selection> ve = new Vector<>();
        ve = prompt.getAnswerValue() != null ? (Vector) prompt.getAnswerValue().getValue() : ve;
        if (ve != null) {
            boolean first = true;
            for (int i2 = 0; i2 < this.selections.length; i2++) {
                String value = this.mItems.get(i2).getValue();
                boolean found = false;
                Iterator i$ = ve.iterator();
                while (true) {
                    if (!i$.hasNext()) {
                        break;
                    }
                    Selection s = i$.next();
                    if (value.equals(s.getValue())) {
                        found = true;
                        break;
                    }
                }
                this.selections[i2] = found;
                if (found) {
                    if (first) {
                        first = false;
                        this.selectionText.setText(context.getString(R.string.selected) + this.answer_items[i2].toString());
                        this.selectionText.setVisibility(0);
                    } else {
                        this.selectionText.setText(((Object) this.selectionText.getText()) + ", " + this.answer_items[i2].toString());
                    }
                }
            }
        }
        addView(this.button);
        addView(this.selectionText);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        clearFocus();
        Vector<Selection> vc = new Vector<>();
        for (int i = 0; i < this.mItems.size(); i++) {
            if (this.selections[i]) {
                SelectChoice sc = this.mItems.get(i);
                vc.add(new Selection(sc));
            }
        }
        if (vc.size() == 0) {
            return null;
        }
        return new SelectMultiData(vc);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        this.selectionText.setText(R.string.selected);
        this.selectionText.setVisibility(8);
        for (int i = 0; i < this.selections.length; i++) {
            this.selections[i] = false;
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.button.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.button.cancelLongPress();
    }
}
