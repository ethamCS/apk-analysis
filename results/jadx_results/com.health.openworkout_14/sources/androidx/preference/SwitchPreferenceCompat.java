package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a V;
    private CharSequence W;
    private CharSequence X;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
            SwitchPreferenceCompat.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.b(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.H0(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.l_res_0x7f0402fd);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.V = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.X0, i, i2);
        K0(b.g.d.c.g.o(obtainStyledAttributes, t.f1, t.Y0));
        J0(b.g.d.c.g.o(obtainStyledAttributes, t.e1, t.Z0));
        O0(b.g.d.c.g.o(obtainStyledAttributes, t.h1, t.b1));
        N0(b.g.d.c.g.o(obtainStyledAttributes, t.g1, t.c1));
        I0(b.g.d.c.g.b(obtainStyledAttributes, t.d1, t.a1, false));
        obtainStyledAttributes.recycle();
    }

    private void P0(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.W);
            switchCompat.setTextOff(this.X);
            switchCompat.setOnCheckedChangeListener(this.V);
        }
    }

    private void Q0(View view) {
        if (!((AccessibilityManager) i().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        P0(view.findViewById(p.f_res_0x7f0901b5));
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
        P0(lVar.M(p.f_res_0x7f0901b5));
        M0(lVar);
    }

    @Override // androidx.preference.Preference
    public void d0(View view) {
        super.d0(view);
        Q0(view);
    }
}
