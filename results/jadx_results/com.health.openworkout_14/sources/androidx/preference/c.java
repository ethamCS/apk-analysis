package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.c;
/* loaded from: classes.dex */
public class c extends f {
    int t0;
    private CharSequence[] u0;
    private CharSequence[] v0;

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnClickListener {
        a() {
            c.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            c cVar = c.this;
            cVar.t0 = i;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference Q1() {
        return (ListPreference) J1();
    }

    public static c R1(String str) {
        c cVar = new c();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        cVar.o1(bundle);
        return cVar;
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.t0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.u0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.v0);
    }

    @Override // androidx.preference.f
    public void N1(boolean z) {
        int i;
        if (!z || (i = this.t0) < 0) {
            return;
        }
        String charSequence = this.v0[i].toString();
        ListPreference Q1 = Q1();
        if (!Q1.b(charSequence)) {
            return;
        }
        Q1.S0(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.f
    public void O1(c.a aVar) {
        super.O1(aVar);
        aVar.o(this.u0, this.t0, new a());
        aVar.m(null, null);
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void i0(Bundle bundle) {
        super.i0(bundle);
        if (bundle != null) {
            this.t0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.u0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.v0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference Q1 = Q1();
        if (Q1.N0() == null || Q1.P0() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.t0 = Q1.M0(Q1.Q0());
        this.u0 = Q1.N0();
        this.v0 = Q1.P0();
    }
}
