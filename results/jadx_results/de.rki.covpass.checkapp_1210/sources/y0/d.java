package y0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a */
    private final TextView f25735a;

    /* renamed from: b */
    private d.e f25736b;

    /* loaded from: classes.dex */
    public static class a extends d.e {

        /* renamed from: a */
        private final Reference<TextView> f25737a;

        /* renamed from: b */
        private final Reference<d> f25738b;

        a(TextView textView, d dVar) {
            this.f25737a = new WeakReference(textView);
            this.f25738b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            super.b();
            TextView textView = this.f25737a.get();
            if (c(textView, this.f25738b.get()) && textView.isAttachedToWindow()) {
                CharSequence o10 = androidx.emoji2.text.d.b().o(textView.getText());
                int selectionStart = Selection.getSelectionStart(o10);
                int selectionEnd = Selection.getSelectionEnd(o10);
                textView.setText(o10);
                if (!(o10 instanceof Spannable)) {
                    return;
                }
                d.b((Spannable) o10, selectionStart, selectionEnd);
            }
        }
    }

    public d(TextView textView) {
        this.f25735a = textView;
    }

    private d.e a() {
        if (this.f25736b == null) {
            this.f25736b = new a(this.f25735a, this);
        }
        return this.f25736b;
    }

    public static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 < 0) {
        } else {
            Selection.setSelection(spannable, i11);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f25735a.isInEditMode()) {
            return charSequence;
        }
        int d10 = androidx.emoji2.text.d.b().d();
        if (d10 != 0) {
            boolean z10 = true;
            if (d10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f25735a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.d.b().p(charSequence, 0, charSequence.length());
            } else if (d10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d.b().s(a());
        return charSequence;
    }
}
