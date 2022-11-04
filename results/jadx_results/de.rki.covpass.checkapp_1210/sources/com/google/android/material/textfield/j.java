package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.l;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class j extends e {

    /* renamed from: e */
    private final TextWatcher f7717e = new a();

    /* renamed from: f */
    private final TextInputLayout.f f7718f = new b();

    /* renamed from: g */
    private final TextInputLayout.g f7719g = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends l {
        a() {
            j.this = r1;
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            j jVar = j.this;
            jVar.f7686c.setChecked(!jVar.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements TextInputLayout.f {
        b() {
            j.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            j jVar = j.this;
            jVar.f7686c.setChecked(!jVar.g());
            editText.removeTextChangedListener(j.this.f7717e);
            editText.addTextChangedListener(j.this.f7717e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements TextInputLayout.g {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ EditText f7723c;

            a(EditText editText) {
                c.this = r1;
                this.f7723c = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f7723c.removeTextChangedListener(j.this.f7717e);
            }
        }

        c() {
            j.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
            j.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = j.this.f7684a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(j.this.g() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            j.this.f7684a.U();
        }
    }

    public j(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    public boolean g() {
        EditText editText = this.f7684a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        TextInputLayout textInputLayout = this.f7684a;
        int i10 = this.f7687d;
        if (i10 == 0) {
            i10 = b5.e.a_res_0x7f07008e;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f7684a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(b5.j.t_res_0x7f10017e));
        this.f7684a.setEndIconVisible(true);
        this.f7684a.setEndIconCheckable(true);
        this.f7684a.setEndIconOnClickListener(new d());
        this.f7684a.g(this.f7718f);
        this.f7684a.h(this.f7719g);
        EditText editText = this.f7684a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
