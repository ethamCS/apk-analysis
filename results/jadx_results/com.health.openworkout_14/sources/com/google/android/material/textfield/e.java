package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a */
    TextInputLayout f3314a;

    /* renamed from: b */
    Context f3315b;

    /* renamed from: c */
    CheckableImageButton f3316c;

    public e(TextInputLayout textInputLayout) {
        this.f3314a = textInputLayout;
        this.f3315b = textInputLayout.getContext();
        this.f3316c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i) {
        return true;
    }

    public void c(boolean z) {
    }

    public boolean d() {
        return false;
    }
}
