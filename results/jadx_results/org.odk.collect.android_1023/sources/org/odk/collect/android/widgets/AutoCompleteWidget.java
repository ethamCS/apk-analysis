package org.odk.collect.android.widgets;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.form.api.FormEntryPrompt;
/* loaded from: classes.dex */
public class AutoCompleteWidget extends QuestionWidget {
    String filterType;
    Vector<SelectChoice> mItems;
    String match_substring = "substring";
    String match_prefix = "prefix";
    String match_chars = "chars";
    AutoCompleteAdapter choices = new AutoCompleteAdapter(getContext(), 17367043);
    AutoCompleteTextView autocomplete = new AutoCompleteTextView(getContext());

    public AutoCompleteWidget(Context context, FormEntryPrompt prompt, String filterType) {
        super(context, prompt);
        this.mItems = prompt.getSelectChoices();
        this.mPrompt = prompt;
        if (filterType != null) {
            this.filterType = filterType;
        } else {
            this.filterType = this.match_substring;
        }
        Iterator i$ = this.mItems.iterator();
        while (i$.hasNext()) {
            SelectChoice sc = i$.next();
            this.choices.add(prompt.getSelectChoiceText(sc));
        }
        this.choices.setDropDownViewResource(17367050);
        this.autocomplete.setAdapter(this.choices);
        this.autocomplete.setTextColor(-16777216);
        setGravity(3);
        String s = null;
        s = this.mPrompt.getAnswerValue() != null ? ((Selection) this.mPrompt.getAnswerValue().getValue()).getValue() : s;
        for (int i = 0; i < this.mItems.size(); i++) {
            String sMatch = this.mItems.get(i).getValue();
            if (sMatch.equals(s)) {
                this.autocomplete.setText(this.mItems.get(i).getLabelInnerText());
            }
        }
        addView(this.autocomplete);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        clearFocus();
        String response = this.autocomplete.getText().toString();
        Iterator i$ = this.mItems.iterator();
        while (i$.hasNext()) {
            SelectChoice sc = i$.next();
            if (response.equals(this.mPrompt.getSelectChoiceText(sc))) {
                return new SelectOneData(new Selection(sc));
            }
        }
        if (!response.equals("")) {
            Toast.makeText(getContext(), "Warning: \"" + response + "\" does not match any answers. No answer recorded.", 1).show();
        }
        return null;
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        this.autocomplete.setText("");
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class AutoCompleteAdapter extends ArrayAdapter<String> implements Filterable {
        private ItemsFilter mFilter;
        public ArrayList<String> mItems = new ArrayList<>();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoCompleteAdapter(Context context, int textViewResourceId) {
            super(context, textViewResourceId);
            AutoCompleteWidget.this = r2;
        }

        public void add(String toAdd) {
            super.add((AutoCompleteAdapter) toAdd);
            this.mItems.add(toAdd);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public int getCount() {
            return this.mItems.size();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public String getItem(int position) {
            return this.mItems.get(position);
        }

        public int getPosition(String item) {
            return this.mItems.indexOf(item);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Filterable
        public Filter getFilter() {
            if (this.mFilter == null) {
                this.mFilter = new ItemsFilter(this.mItems);
            }
            return this.mFilter;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        /* loaded from: classes.dex */
        private class ItemsFilter extends Filter {
            final ArrayList<String> mItemsArray;

            public ItemsFilter(ArrayList<String> list) {
                AutoCompleteAdapter.this = r2;
                if (list == null) {
                    this.mItemsArray = new ArrayList<>();
                } else {
                    this.mItemsArray = new ArrayList<>(list);
                }
            }

            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence prefix) {
                Filter.FilterResults results = new Filter.FilterResults();
                if (AutoCompleteAdapter.this.mItems == null) {
                    AutoCompleteAdapter.this.mItems = new ArrayList<>(this.mItemsArray);
                }
                if (prefix == null || prefix.length() == 0) {
                    results.values = this.mItemsArray;
                    results.count = this.mItemsArray.size();
                } else {
                    String prefixString = prefix.toString().toLowerCase(Locale.getDefault());
                    ArrayList<String> items = AutoCompleteAdapter.this.mItems;
                    int count = items.size();
                    ArrayList<String> newItems = new ArrayList<>(count);
                    for (int i = 0; i < count; i++) {
                        String item = items.get(i);
                        String item_compare = item.toLowerCase(Locale.getDefault());
                        if (AutoCompleteWidget.this.filterType.equals(AutoCompleteWidget.this.match_substring) && (item_compare.startsWith(prefixString) || item_compare.contains(prefixString))) {
                            newItems.add(item);
                        } else if (AutoCompleteWidget.this.filterType.equals(AutoCompleteWidget.this.match_prefix) && item_compare.startsWith(prefixString)) {
                            newItems.add(item);
                        } else if (AutoCompleteWidget.this.filterType.equals(AutoCompleteWidget.this.match_chars)) {
                            char[] toMatch = prefixString.toCharArray();
                            boolean matches = true;
                            int j = 0;
                            while (true) {
                                if (j >= toMatch.length) {
                                    break;
                                }
                                int index = item_compare.indexOf(toMatch[j]);
                                if (index > -1) {
                                    item_compare = item_compare.substring(0, index) + item_compare.substring(index + 1);
                                    j++;
                                } else {
                                    matches = false;
                                    break;
                                }
                            }
                            if (matches) {
                                newItems.add(item);
                            }
                        } else if (item_compare.startsWith(prefixString) || item_compare.contains(prefixString)) {
                            newItems.add(item);
                        }
                    }
                    results.values = newItems;
                    results.count = newItems.size();
                }
                return results;
            }

            @Override // android.widget.Filter
            protected void publishResults(CharSequence constraint, Filter.FilterResults results) {
                AutoCompleteAdapter.this.mItems = (ArrayList) results.values;
                if (results.count > 0) {
                    AutoCompleteAdapter.this.notifyDataSetChanged();
                } else {
                    AutoCompleteAdapter.this.notifyDataSetInvalidated();
                }
            }
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.autocomplete.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.autocomplete.cancelLongPress();
    }
}
