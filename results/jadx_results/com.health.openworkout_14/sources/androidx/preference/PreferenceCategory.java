package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import b.g.l.c0.c;
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.g.d.c.g.a(context, m.f_res_0x7f040290, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public boolean B0() {
        return !super.H();
    }

    @Override // androidx.preference.Preference
    public boolean H() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        TextView textView;
        super.R(lVar);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            lVar.f1551a.setAccessibilityHeading(true);
        } else if (i >= 21) {
        } else {
            TypedValue typedValue = new TypedValue();
            if (!i().getTheme().resolveAttribute(m.f1491b, typedValue, true) || (textView = (TextView) lVar.M(16908310)) == null) {
                return;
            }
            if (textView.getCurrentTextColor() != b.g.d.a.b(i(), n.a_res_0x7f0600b7)) {
                return;
            }
            textView.setTextColor(typedValue.data);
        }
    }

    @Override // androidx.preference.Preference
    @Deprecated
    public void W(b.g.l.c0.c cVar) {
        c.C0053c r;
        super.W(cVar);
        if (Build.VERSION.SDK_INT >= 28 || (r = cVar.r()) == null) {
            return;
        }
        cVar.e0(c.C0053c.f(r.c(), r.d(), r.a(), r.b(), true, r.e()));
    }
}
