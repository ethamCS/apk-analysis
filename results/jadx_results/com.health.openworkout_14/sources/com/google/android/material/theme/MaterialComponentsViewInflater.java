package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.i;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.g;
import com.google.android.material.textview.MaterialTextView;
import d.a.a.a.o.a;
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends i {
    @Override // androidx.appcompat.app.i
    protected d b(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    @Override // androidx.appcompat.app.i
    protected f c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.i
    protected androidx.appcompat.widget.g d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.i
    protected s j(Context context, AttributeSet attributeSet) {
        return new d.a.a.a.w.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.i
    protected z n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
