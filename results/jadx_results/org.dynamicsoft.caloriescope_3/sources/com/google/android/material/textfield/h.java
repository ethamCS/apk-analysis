package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import b.a.a.a.j;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class h extends e {
    private final TextWatcher d = new a();
    private final TextInputLayout.f e = new b();
    private final TextInputLayout.g f = new c(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        a() {
            h.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            h hVar = h.this;
            hVar.f1592c.setChecked(!hVar.c());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements TextInputLayout.f {
        b() {
            h.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            h hVar = h.this;
            hVar.f1592c.setChecked(!hVar.c());
            editText.removeTextChangedListener(h.this.d);
            editText.addTextChangedListener(h.this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements TextInputLayout.g {
        c(h hVar) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
            h.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = h.this.f1590a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(h.this.c() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd < 0) {
                return;
            }
            editText.setSelection(selectionEnd);
        }
    }

    public h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public boolean c() {
        EditText editText = this.f1590a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        this.f1590a.setEndIconDrawable(a.a.k.a.a.c(this.f1591b, b.a.a.a.e.design_password_eye));
        TextInputLayout textInputLayout = this.f1590a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.password_toggle_content_description));
        this.f1590a.setEndIconOnClickListener(new d());
        this.f1590a.a(this.e);
        this.f1590a.a(this.f);
    }
}
