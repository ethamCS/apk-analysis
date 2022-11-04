package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class d extends f {
    Set<String> t0 = new HashSet();
    boolean u0;
    CharSequence[] v0;
    CharSequence[] w0;

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
            d.this = r1;
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            boolean z2;
            boolean z3;
            d dVar = d.this;
            if (z) {
                z2 = dVar.u0;
                z3 = dVar.t0.add(dVar.w0[i].toString());
            } else {
                z2 = dVar.u0;
                z3 = dVar.t0.remove(dVar.w0[i].toString());
            }
            dVar.u0 = z3 | z2;
        }
    }

    private MultiSelectListPreference Q1() {
        return (MultiSelectListPreference) J1();
    }

    public static d R1(String str) {
        d dVar = new d();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        dVar.o1(bundle);
        return dVar;
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.t0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.u0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.v0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.w0);
    }

    @Override // androidx.preference.f
    public void N1(boolean z) {
        if (z && this.u0) {
            MultiSelectListPreference Q1 = Q1();
            if (Q1.b(this.t0)) {
                Q1.P0(this.t0);
            }
        }
        this.u0 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.f
    public void O1(c.a aVar) {
        super.O1(aVar);
        int length = this.w0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.t0.contains(this.w0[i].toString());
        }
        aVar.h(this.v0, zArr, new a());
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void i0(Bundle bundle) {
        super.i0(bundle);
        if (bundle != null) {
            this.t0.clear();
            this.t0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.u0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.v0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.w0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference Q1 = Q1();
        if (Q1.M0() == null || Q1.N0() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.t0.clear();
        this.t0.addAll(Q1.O0());
        this.u0 = false;
        this.v0 = Q1.M0();
        this.w0 = Q1.N0();
    }
}
