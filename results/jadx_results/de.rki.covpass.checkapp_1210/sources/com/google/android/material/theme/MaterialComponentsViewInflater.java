package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.f;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.h;
import com.google.android.material.textview.MaterialTextView;
import f5.a;
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends f {
    @Override // androidx.appcompat.app.f
    protected d c(Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    protected androidx.appcompat.widget.f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    protected u k(Context context, AttributeSet attributeSet) {
        return new p5.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    protected c0 o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
