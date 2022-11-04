package y0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: c */
    private final EditText f25746c;

    /* renamed from: d */
    private final boolean f25747d;

    /* renamed from: q */
    private d.e f25748q;

    /* renamed from: x */
    private int f25749x = Integer.MAX_VALUE;

    /* renamed from: y */
    private int f25750y = 0;
    private boolean U3 = true;

    /* loaded from: classes.dex */
    public static class a extends d.e {

        /* renamed from: a */
        private final Reference<EditText> f25751a;

        a(EditText editText) {
            this.f25751a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            super.b();
            g.b(this.f25751a.get(), 1);
        }
    }

    public g(EditText editText, boolean z10) {
        this.f25746c = editText;
        this.f25747d = z10;
    }

    private d.e a() {
        if (this.f25748q == null) {
            this.f25748q = new a(this.f25746c);
        }
        return this.f25748q;
    }

    static void b(EditText editText, int i10) {
        if (i10 != 1 || editText == null || !editText.isAttachedToWindow()) {
            return;
        }
        Editable editableText = editText.getEditableText();
        int selectionStart = Selection.getSelectionStart(editableText);
        int selectionEnd = Selection.getSelectionEnd(editableText);
        androidx.emoji2.text.d.b().o(editableText);
        d.b(editableText, selectionStart, selectionEnd);
    }

    private boolean d() {
        return !this.U3 || (!this.f25747d && !androidx.emoji2.text.d.h());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.U3 != z10) {
            if (this.f25748q != null) {
                androidx.emoji2.text.d.b().t(this.f25748q);
            }
            this.U3 = z10;
            if (!z10) {
                return;
            }
            b(this.f25746c, androidx.emoji2.text.d.b().d());
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f25746c.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int d10 = androidx.emoji2.text.d.b().d();
        if (d10 != 0) {
            if (d10 == 1) {
                androidx.emoji2.text.d.b().r((Spannable) charSequence, i10, i10 + i12, this.f25749x, this.f25750y);
                return;
            } else if (d10 != 3) {
                return;
            }
        }
        androidx.emoji2.text.d.b().s(a());
    }
}
