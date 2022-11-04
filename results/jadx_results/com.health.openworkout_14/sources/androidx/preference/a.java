package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/* loaded from: classes.dex */
public class a extends f {
    private EditText t0;
    private CharSequence u0;

    private EditTextPreference Q1() {
        return (EditTextPreference) J1();
    }

    public static a R1(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        aVar.o1(bundle);
        return aVar;
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.u0);
    }

    @Override // androidx.preference.f
    protected boolean K1() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.f
    public void L1(View view) {
        super.L1(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.t0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.t0.setText(this.u0);
            EditText editText2 = this.t0;
            editText2.setSelection(editText2.getText().length());
            if (Q1().M0() == null) {
                return;
            }
            Q1().M0().a(this.t0);
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.f
    public void N1(boolean z) {
        if (z) {
            String obj = this.t0.getText().toString();
            EditTextPreference Q1 = Q1();
            if (!Q1.b(obj)) {
                return;
            }
            Q1.O0(obj);
        }
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void i0(Bundle bundle) {
        super.i0(bundle);
        this.u0 = bundle == null ? Q1().N0() : bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }
}
