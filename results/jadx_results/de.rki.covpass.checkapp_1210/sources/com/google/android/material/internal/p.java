package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class p extends ImageButton {

    /* renamed from: c */
    private int f7433c;

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f7433c = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f7433c;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
