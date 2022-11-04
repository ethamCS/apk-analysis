package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
/* loaded from: classes.dex */
class m {

    /* renamed from: a */
    private final TextView f1396a;

    /* renamed from: b */
    private final y0.f f1397b;

    public m(TextView textView) {
        this.f1396a = textView;
        this.f1397b = new y0.f(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1397b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1397b.b();
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1396a.getContext().obtainStyledAttributes(attributeSet, e.j.f9240g0, i10, 0);
        try {
            int i11 = e.j.f9310u0;
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(i11)) {
                z10 = obtainStyledAttributes.getBoolean(i11, true);
            }
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void d(boolean z10) {
        this.f1397b.c(z10);
    }

    public void e(boolean z10) {
        this.f1397b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f1397b.e(transformationMethod);
    }
}
