package com.takisoft.preferencex;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
@Deprecated
/* loaded from: classes2.dex */
public class AutoSummaryEditTextPreference extends EditTextPreference {
    private int inputType;
    private String passwordSubstitute;
    private int passwordSubstituteLength;
    private CharSequence summary;
    private CharSequence summaryHasText;

    public AutoSummaryEditTextPreference(Context context) {
        this(context, null);
    }

    public AutoSummaryEditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextPreferenceStyle);
    }

    public AutoSummaryEditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AutoSummaryEditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.inputType = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AutoSummaryEditTextPreference, i, 0);
        this.summaryHasText = obtainStyledAttributes.getText(R.styleable.AutoSummaryEditTextPreference_pref_summaryHasText);
        this.passwordSubstitute = obtainStyledAttributes.getString(R.styleable.AutoSummaryEditTextPreference_pref_summaryPasswordSubstitute);
        this.passwordSubstituteLength = obtainStyledAttributes.getInt(R.styleable.AutoSummaryEditTextPreference_pref_summaryPasswordSubstituteLength, 5);
        if (this.passwordSubstitute == null) {
            this.passwordSubstitute = "•";
        }
        obtainStyledAttributes.recycle();
        this.summary = super.getSummary();
        for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
            if (16843296 == attributeSet.getAttributeNameResource(i3)) {
                this.inputType = attributeSet.getAttributeIntValue(i3, 1);
                return;
            }
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence getSummary() {
        String text = getText();
        if (!(!TextUtils.isEmpty(text))) {
            return this.summary;
        }
        int i = this.inputType;
        if ((i & 16) == 16 || (i & 128) == 128 || (i & 224) == 224) {
            int i2 = this.passwordSubstituteLength;
            if (i2 <= 0) {
                i2 = text.length();
            }
            text = new String(new char[i2]).replaceAll("\u0000", this.passwordSubstitute);
        }
        CharSequence charSequence = this.summaryHasText;
        return charSequence != null ? String.format(charSequence.toString(), text) : text;
    }

    @Override // androidx.preference.Preference
    public void setSummary(CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null && this.summary != null) {
            this.summary = null;
        } else if (charSequence == null || charSequence.equals(this.summary)) {
        } else {
            this.summary = charSequence.toString();
        }
    }

    public CharSequence getSummaryHasText() {
        return this.summaryHasText;
    }

    public void setSummaryHasText(int i) {
        setSummaryHasText(getContext().getString(i));
    }

    public void setSummaryHasText(CharSequence charSequence) {
        if (charSequence == null && this.summaryHasText != null) {
            this.summaryHasText = null;
        } else if (charSequence != null && !charSequence.equals(this.summaryHasText)) {
            this.summaryHasText = charSequence.toString();
        }
        notifyChanged();
    }

    public CharSequence getPasswordSubstitute() {
        return this.passwordSubstitute;
    }

    public void setPasswordSubstitute(int i) {
        setPasswordSubstitute(getContext().getString(i));
    }

    public void setPasswordSubstitute(String str) {
        this.passwordSubstitute = str;
    }

    public int getPasswordSubstituteLength() {
        return this.passwordSubstituteLength;
    }

    public void setPasswordSubstituteLength(int i) {
        this.passwordSubstituteLength = i;
    }
}
