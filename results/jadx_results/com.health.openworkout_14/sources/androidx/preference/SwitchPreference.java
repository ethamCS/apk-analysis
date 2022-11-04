package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a V;
    private CharSequence W;
    private CharSequence X;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
            SwitchPreference.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.b(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.H0(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.g.d.c.g.a(context, m.m_res_0x7f0402fe, 16843629));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.V = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.M0, i, i2);
        K0(b.g.d.c.g.o(obtainStyledAttributes, t.U0, t.N0));
        J0(b.g.d.c.g.o(obtainStyledAttributes, t.T0, t.O0));
        O0(b.g.d.c.g.o(obtainStyledAttributes, t.W0, t.Q0));
        N0(b.g.d.c.g.o(obtainStyledAttributes, t.V0, t.R0));
        I0(b.g.d.c.g.b(obtainStyledAttributes, t.S0, t.P0, false));
        obtainStyledAttributes.recycle();
    }

    private void P0(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.W);
            r4.setTextOff(this.X);
            r4.setOnCheckedChangeListener(this.V);
        }
    }

    private void Q0(View view) {
        if (!((AccessibilityManager) i().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        P0(view.findViewById(16908352));
        L0(view.findViewById(16908304));
    }

    public void N0(CharSequence charSequence) {
        this.X = charSequence;
        L();
    }

    public void O0(CharSequence charSequence) {
        this.W = charSequence;
        L();
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        super.R(lVar);
        P0(lVar.M(16908352));
        M0(lVar);
    }

    @Override // androidx.preference.Preference
    public void d0(View view) {
        super.d0(view);
        Q0(view);
    }
}
