package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.j;
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean X = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b.g.d.c.g.a(context, m.h_res_0x7f040296, 16842891));
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean N0() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void S() {
        j.b g2;
        if (o() != null || l() != null || M0() == 0 || (g2 = z().g()) == null) {
            return;
        }
        g2.e(this);
    }

    public boolean S0() {
        return this.X;
    }
}
