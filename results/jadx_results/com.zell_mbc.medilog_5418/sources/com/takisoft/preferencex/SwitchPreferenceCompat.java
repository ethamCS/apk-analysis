package com.takisoft.preferencex;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.preference.PreferenceViewHolder;
/* loaded from: classes2.dex */
public class SwitchPreferenceCompat extends androidx.preference.SwitchPreferenceCompat {
    private static final int[] ATTRS = {androidx.appcompat.R.attr.controlBackground, R.attr.colorControlNormal};
    private final View.OnClickListener contentClickListener = new View.OnClickListener() { // from class: com.takisoft.preferencex.SwitchPreferenceCompat.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SwitchPreferenceCompat.this.performClick((View) view.getParent());
        }
    };
    private final View.OnClickListener widgetClickListener = new View.OnClickListener() { // from class: com.takisoft.preferencex.SwitchPreferenceCompat.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = !SwitchPreferenceCompat.this.isChecked();
            if (SwitchPreferenceCompat.this.callChangeListener(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.setChecked(z);
            }
        }
    };
    private boolean withSeparator = false;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        refreshWithSeparator(false);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        refreshWithSeparator(false);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        refreshWithSeparator(false);
    }

    public SwitchPreferenceCompat(Context context) {
        super(context);
        refreshWithSeparator(false);
    }

    public void refresh() {
        if (!this.withSeparator) {
            return;
        }
        boolean persistedBoolean = getPersistedBoolean(false);
        boolean isPersistent = isPersistent();
        setPersistent(false);
        setChecked(persistedBoolean);
        setPersistent(isPersistent);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public void onClick() {
        if (!this.withSeparator) {
            super.onClick();
        }
    }

    private void refreshWithSeparator(boolean z) {
        if (!setWithSeparator(getFragment() != null) || !z) {
            return;
        }
        notifyHierarchyChanged();
    }

    private boolean setWithSeparator(boolean z) {
        if (this.withSeparator == z) {
            return false;
        }
        this.withSeparator = z;
        if (z) {
            setLayoutResource(R.layout.preference_material_ext);
            return true;
        }
        setLayoutResource(androidx.preference.R.layout.preference_material);
        return true;
    }

    @Override // androidx.preference.Preference
    public void setFragment(String str) {
        super.setFragment(str);
        refreshWithSeparator(true);
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        if (this.withSeparator) {
            preferenceViewHolder.findViewById(16908312).setOnClickListener(this.widgetClickListener);
            preferenceViewHolder.findViewById(R.id.pref_content_frame).setOnClickListener(this.contentClickListener);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(ATTRS);
            if (obtainStyledAttributes.length() > 0 && obtainStyledAttributes.getIndexCount() > 0) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    preferenceViewHolder.findViewById(androidx.preference.R.id.switchWidget).setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), resourceId));
                }
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
                if (colorStateList != null) {
                    preferenceViewHolder.findViewById(R.id.pref_separator).setBackgroundColor(colorStateList.getColorForState(isEnabled() ? new int[]{16842910} : new int[]{-16842910}, colorStateList.getDefaultColor()));
                }
            }
            obtainStyledAttributes.recycle();
        }
        preferenceViewHolder.itemView.setClickable(!this.withSeparator);
        preferenceViewHolder.itemView.setFocusable(!this.withSeparator);
    }
}
