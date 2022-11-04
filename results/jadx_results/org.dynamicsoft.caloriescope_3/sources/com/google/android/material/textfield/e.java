package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a */
    TextInputLayout f1590a;

    /* renamed from: b */
    Context f1591b;

    /* renamed from: c */
    CheckableImageButton f1592c;

    public e(TextInputLayout textInputLayout) {
        this.f1590a = textInputLayout;
        this.f1591b = textInputLayout.getContext();
        this.f1592c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean a(int i) {
        return true;
    }

    public boolean b() {
        return false;
    }
}
