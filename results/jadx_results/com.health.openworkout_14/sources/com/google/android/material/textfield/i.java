package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class i extends e {

    /* renamed from: d */
    private final TextWatcher f3334d = new a();

    /* renamed from: e */
    private final TextInputLayout.f f3335e = new b();

    /* renamed from: f */
    private final TextInputLayout.g f3336f = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        a() {
            i.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            i iVar = i.this;
            iVar.f3316c.setChecked(!iVar.g());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements TextInputLayout.f {
        b() {
            i.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            i iVar = i.this;
            iVar.f3316c.setChecked(!iVar.g());
            editText.removeTextChangedListener(i.this.f3334d);
            editText.addTextChangedListener(i.this.f3334d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements TextInputLayout.g {
        c() {
            i.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.removeTextChangedListener(i.this.f3334d);
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
            i.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = i.this.f3314a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(i.this.g() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd < 0) {
                return;
            }
            editText.setSelection(selectionEnd);
        }
    }

    public i(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public boolean g() {
        EditText editText = this.f3314a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        this.f3314a.setEndIconDrawable(b.a.k.a.a.d(this.f3315b, d.a.a.a.e.a_res_0x7f08006c));
        TextInputLayout textInputLayout = this.f3314a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(d.a.a.a.i.o));
        this.f3314a.setEndIconOnClickListener(new d());
        this.f3314a.e(this.f3335e);
        this.f3314a.f(this.f3336f);
        EditText editText = this.f3314a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
