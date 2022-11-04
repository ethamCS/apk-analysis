package org.odk.collect.android.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class SpinnerWidget extends QuestionWidget {
    private static final int BROWN = -7116495;
    String[] choices;
    Vector<SelectChoice> mItems;
    Spinner spinner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinnerWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        boolean z = true;
        this.mItems = prompt.getSelectChoices();
        this.spinner = new Spinner(context);
        this.choices = new String[this.mItems.size() + 1];
        for (int i = 0; i < this.mItems.size(); i++) {
            this.choices[i] = prompt.getSelectChoiceText(this.mItems.get(i));
        }
        this.choices[this.mItems.size()] = getContext().getString(R.string.select_one);
        SpinnerAdapter adapter = new SpinnerAdapter(getContext(), 17367048, this.choices, 1, this.mQuestionFontsize);
        this.spinner.setAdapter((android.widget.SpinnerAdapter) adapter);
        this.spinner.setPrompt(prompt.getQuestionText());
        this.spinner.setEnabled(!prompt.isReadOnly());
        this.spinner.setFocusable(prompt.isReadOnly() ? false : z);
        String s = null;
        s = prompt.getAnswerValue() != null ? ((Selection) prompt.getAnswerValue().getValue()).getValue() : s;
        this.spinner.setSelection(this.mItems.size());
        if (s != null) {
            for (int i2 = 0; i2 < this.mItems.size(); i2++) {
                String sMatch = this.mItems.get(i2).getValue();
                if (sMatch.equals(s)) {
                    this.spinner.setSelection(i2);
                }
            }
        }
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: org.odk.collect.android.widgets.SpinnerWidget.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == SpinnerWidget.this.mItems.size()) {
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onCheckedChanged.clearValue", "", SpinnerWidget.this.mPrompt.getIndex());
                } else {
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onCheckedChanged", SpinnerWidget.this.mItems.get(position).getValue(), SpinnerWidget.this.mPrompt.getIndex());
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
        addView(this.spinner);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        clearFocus();
        int i = this.spinner.getSelectedItemPosition();
        if (i == -1 || i == this.mItems.size()) {
            return null;
        }
        SelectChoice sc = this.mItems.elementAt(i);
        return new SelectOneData(new Selection(sc));
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        this.spinner.setSelection(this.mItems.size());
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class SpinnerAdapter extends ArrayAdapter<String> {
        Context context;
        String[] items;
        float textSize;
        int textUnit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpinnerAdapter(Context context, int textViewResourceId, String[] objects, int textUnit, float textSize) {
            super(context, textViewResourceId, objects);
            SpinnerWidget.this = r2;
            this.items = new String[0];
            this.items = objects;
            this.context = context;
            this.textUnit = textUnit;
            this.textSize = textSize;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            int i = 0;
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(this.context);
                convertView = inflater.inflate(R.layout.custom_spinner_item, parent, false);
            }
            TextView tv = (TextView) convertView.findViewById(16908308);
            tv.setTextSize(this.textUnit, this.textSize);
            tv.setBackgroundColor(-1);
            tv.setPadding(10, 10, 10, 10);
            if (position == this.items.length - 1) {
                tv.setText(parent.getContext().getString(R.string.clear_answer));
                tv.setTextColor(SpinnerWidget.BROWN);
                tv.setTypeface(null, 0);
                if (SpinnerWidget.this.spinner.getSelectedItemPosition() == position) {
                    tv.setBackgroundColor(-3355444);
                }
            } else {
                tv.setText(this.items[position]);
                tv.setTextColor(-16777216);
                if (SpinnerWidget.this.spinner.getSelectedItemPosition() == position) {
                    i = 1;
                }
                tv.setTypeface(null, i);
            }
            return convertView;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(this.context);
                convertView = inflater.inflate(17367048, parent, false);
            }
            TextView tv = (TextView) convertView.findViewById(16908308);
            tv.setText(this.items[position]);
            tv.setTextSize(this.textUnit, this.textSize);
            tv.setTextColor(-16777216);
            tv.setTypeface(null, 1);
            if (position == this.items.length - 1) {
                tv.setTextColor(SpinnerWidget.BROWN);
                tv.setTypeface(null, 0);
            }
            return convertView;
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.spinner.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.spinner.cancelLongPress();
    }
}
