package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
final class b extends Preference {
    private long Q;

    public b(Context context, List<Preference> list, long j) {
        super(context);
        G0();
        H0(list);
        this.Q = j + 1000000;
    }

    private void G0() {
        r0(q.a_res_0x7f0c0030);
        o0(o.a_res_0x7f08006f);
        y0(r.b_res_0x7f10003f);
        v0(999);
    }

    private void H0(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference preference : list) {
            CharSequence D = preference.D();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(D)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.s())) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(D)) {
                charSequence = charSequence == null ? D : i().getString(r.e_res_0x7f1000de, charSequence, D);
            }
        }
        w0(charSequence);
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        super.R(lVar);
        lVar.P(false);
    }

    @Override // androidx.preference.Preference
    public long n() {
        return this.Q;
    }
}
