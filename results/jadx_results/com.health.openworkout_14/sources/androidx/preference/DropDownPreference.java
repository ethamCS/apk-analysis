package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context b0;
    private final ArrayAdapter c0;
    private Spinner d0;
    private final AdapterView.OnItemSelectedListener e0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        a() {
            DropDownPreference.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.P0()[i].toString();
                if (charSequence.equals(DropDownPreference.this.Q0()) || !DropDownPreference.this.b(charSequence)) {
                    return;
                }
                DropDownPreference.this.S0(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.d_res_0x7f04012a);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e0 = new a();
        this.b0 = context;
        this.c0 = T0();
        V0();
    }

    private int U0(String str) {
        CharSequence[] P0 = P0();
        if (str == null || P0 == null) {
            return -1;
        }
        for (int length = P0.length - 1; length >= 0; length--) {
            if (P0[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    private void V0() {
        this.c0.clear();
        if (N0() != null) {
            for (CharSequence charSequence : N0()) {
                this.c0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void L() {
        super.L();
        ArrayAdapter arrayAdapter = this.c0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        Spinner spinner = (Spinner) lVar.f1551a.findViewById(p.e_res_0x7f09019d);
        this.d0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.c0);
        this.d0.setOnItemSelectedListener(this.e0);
        this.d0.setSelection(U0(Q0()));
        super.R(lVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void S() {
        this.d0.performClick();
    }

    protected ArrayAdapter T0() {
        return new ArrayAdapter(this.b0, 17367049);
    }
}
