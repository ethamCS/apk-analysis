package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a V;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
            CheckBoxPreference.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.b(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.H0(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.g.d.c.g.a(context, m.a_res_0x7f040085, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.V = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f1494c, i, i2);
        K0(b.g.d.c.g.o(obtainStyledAttributes, t.i, t.f1495d));
        J0(b.g.d.c.g.o(obtainStyledAttributes, t.f1499h, t.f1496e));
        I0(b.g.d.c.g.b(obtainStyledAttributes, t.f1498g, t.f1497f, false));
        obtainStyledAttributes.recycle();
    }

    private void N0(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.V);
        }
    }

    private void O0(View view) {
        if (!((AccessibilityManager) i().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        N0(view.findViewById(16908289));
        L0(view.findViewById(16908304));
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        super.R(lVar);
        N0(lVar.M(16908289));
        M0(lVar);
    }

    @Override // androidx.preference.Preference
    public void d0(View view) {
        super.d0(view);
        O0(view);
    }
}
