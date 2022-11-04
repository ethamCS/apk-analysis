package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import b5.f;
import b5.h;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: c */
    private final Chip f7731c;

    /* renamed from: d */
    private final TextInputLayout f7732d;

    /* renamed from: q */
    private final EditText f7733q;

    /* renamed from: x */
    private TextWatcher f7734x;

    /* renamed from: y */
    private TextView f7735y;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends l {
        private b() {
            ChipTextInputComboView.this = r1;
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f7731c.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f7731c.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(h.i_res_0x7f0c004d, (ViewGroup) this, false);
        this.f7731c = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(h.j_res_0x7f0c004e, (ViewGroup) this, false);
        this.f7732d = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f7733q = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f7734x = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f7735y = (TextView) findViewById(f.m_res_0x7f09016a);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public String c(CharSequence charSequence) {
        return c.a(getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7733q.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7731c.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f7731c.setChecked(z10);
        int i10 = 0;
        this.f7733q.setVisibility(z10 ? 0 : 4);
        Chip chip = this.f7731c;
        if (z10) {
            i10 = 8;
        }
        chip.setVisibility(i10);
        if (isChecked()) {
            o.h(this.f7733q);
            if (TextUtils.isEmpty(this.f7733q.getText())) {
                return;
            }
            EditText editText = this.f7733q;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7731c.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f7731c.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f7731c.toggle();
    }
}
