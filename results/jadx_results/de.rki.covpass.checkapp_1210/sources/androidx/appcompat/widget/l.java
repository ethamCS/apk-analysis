package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* loaded from: classes.dex */
class l {

    /* renamed from: a */
    private final EditText f1385a;

    /* renamed from: b */
    private final y0.a f1386b;

    public l(EditText editText) {
        this.f1385a = editText;
        this.f1386b = new y0.a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f1386b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1385a.getContext().obtainStyledAttributes(attributeSet, e.j.f9240g0, i10, 0);
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

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1386b.b(inputConnection, editorInfo);
    }

    public void e(boolean z10) {
        this.f1386b.c(z10);
    }
}
