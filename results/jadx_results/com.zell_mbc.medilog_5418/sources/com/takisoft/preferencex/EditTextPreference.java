package com.takisoft.preferencex;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.collection.SparseArrayCompat;
import androidx.preference.EditTextPreference;
/* loaded from: classes2.dex */
public class EditTextPreference extends androidx.preference.EditTextPreference {
    private boolean disableMessagePaddingFix;
    private SparseArrayCompat<TypedValue> editTextAttributes;
    private EditTextPreference.OnBindEditTextListener onBindEditTextListener;

    public EditTextPreference(Context context) {
        this(context, null);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextPreferenceStyle);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.editTextAttributes = new SparseArrayCompat<>();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.EditTextPreference, i, i2);
        this.disableMessagePaddingFix = obtainStyledAttributes.getBoolean(R.styleable.EditTextPreference_pref_disableMessagePaddingFix, false);
        obtainStyledAttributes.recycle();
        processAttrs(attributeSet);
        super.setOnBindEditTextListener(new EditTextPreference.OnBindEditTextListener() { // from class: com.takisoft.preferencex.EditTextPreference.1
            @Override // androidx.preference.EditTextPreference.OnBindEditTextListener
            public void onBindEditText(EditText editText) {
                if (!EditTextPreference.this.disableMessagePaddingFix) {
                    EditTextPreference.this.fixMessagePadding(editText);
                }
                int size = EditTextPreference.this.editTextAttributes.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int keyAt = EditTextPreference.this.editTextAttributes.keyAt(i3);
                    int i4 = ((TypedValue) EditTextPreference.this.editTextAttributes.valueAt(i3)).data;
                    switch (keyAt) {
                        case 16843091:
                            editText.setMaxLines(i4);
                            break;
                        case 16843092:
                            editText.setLines(i4);
                            break;
                        case 16843094:
                            editText.setMinLines(i4);
                            break;
                        case 16843095:
                            editText.setMaxEms(i4);
                            break;
                        case 16843096:
                            editText.setEms(i4);
                            break;
                        case 16843098:
                            editText.setMinEms(i4);
                            break;
                        case 16843296:
                            editText.setInputType(i4);
                            break;
                        case 16843660:
                            boolean z = true;
                            if (i4 != 1) {
                                z = false;
                            }
                            editText.setAllCaps(z);
                            break;
                    }
                }
                if (EditTextPreference.this.onBindEditTextListener != null) {
                    EditTextPreference.this.onBindEditTextListener.onBindEditText(editText);
                }
            }
        });
    }

    public void fixMessagePadding(View view) {
        View findViewById;
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || (findViewById = ((ViewGroup) parent).findViewById(16908299)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = 0;
        findViewById.setLayoutParams(marginLayoutParams);
    }

    private void processAttrs(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i);
            int attributeResourceValue = attributeSet.getAttributeResourceValue(i, 0);
            TypedValue typedValue = null;
            switch (attributeNameResource) {
                case 16843091:
                case 16843092:
                case 16843094:
                case 16843095:
                case 16843096:
                case 16843098:
                    typedValue = new TypedValue();
                    typedValue.resourceId = attributeResourceValue;
                    typedValue.data = attributeSet.getAttributeIntValue(i, -1);
                    typedValue.type = 16;
                    break;
                case 16843296:
                    typedValue = new TypedValue();
                    typedValue.resourceId = attributeResourceValue;
                    typedValue.data = attributeSet.getAttributeIntValue(i, 1);
                    typedValue.type = 17;
                    break;
                case 16843660:
                    typedValue = new TypedValue();
                    typedValue.resourceId = attributeResourceValue;
                    typedValue.data = attributeSet.getAttributeBooleanValue(i, false) ? 1 : 0;
                    typedValue.type = 18;
                    break;
            }
            if (typedValue != null) {
                this.editTextAttributes.put(attributeNameResource, typedValue);
            }
        }
    }

    public EditTextPreference.OnBindEditTextListener getOnBindEditTextListener() {
        return this.onBindEditTextListener;
    }

    @Override // androidx.preference.EditTextPreference
    public void setOnBindEditTextListener(EditTextPreference.OnBindEditTextListener onBindEditTextListener) {
        this.onBindEditTextListener = onBindEditTextListener;
    }

    @Deprecated
    public EditText getEditText() {
        throw new UnsupportedOperationException("Use OnBindEditTextListener to modify the EditText");
    }

    @Override // androidx.preference.EditTextPreference
    public void setText(String str) {
        String text = getText();
        super.setText(str);
        if (!TextUtils.equals(str, text)) {
            notifyChanged();
        }
    }
}
