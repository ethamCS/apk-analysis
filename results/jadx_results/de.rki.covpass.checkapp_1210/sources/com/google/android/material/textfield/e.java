package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a */
    TextInputLayout f7684a;

    /* renamed from: b */
    Context f7685b;

    /* renamed from: c */
    CheckableImageButton f7686c;

    /* renamed from: d */
    final int f7687d;

    public e(TextInputLayout textInputLayout, int i10) {
        this.f7684a = textInputLayout;
        this.f7685b = textInputLayout.getContext();
        this.f7686c = textInputLayout.getEndIconView();
        this.f7687d = i10;
    }

    public abstract void a();

    public boolean b(int i10) {
        return true;
    }

    public void c(boolean z10) {
    }

    public boolean d() {
        return false;
    }
}
