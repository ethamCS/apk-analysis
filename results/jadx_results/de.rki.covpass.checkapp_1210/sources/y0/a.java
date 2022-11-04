package y0;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final b f25725a;

    /* renamed from: b */
    private int f25726b = Integer.MAX_VALUE;

    /* renamed from: c */
    private int f25727c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0.a$a */
    /* loaded from: classes.dex */
    public static class C0454a extends b {

        /* renamed from: a */
        private final EditText f25728a;

        /* renamed from: b */
        private final g f25729b;

        C0454a(EditText editText, boolean z10) {
            this.f25728a = editText;
            g gVar = new g(editText, z10);
            this.f25729b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(y0.b.getInstance());
        }

        @Override // y0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener != null) {
                return new e(keyListener);
            }
            return null;
        }

        @Override // y0.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f25728a, inputConnection, editorInfo);
        }

        @Override // y0.a.b
        void c(boolean z10) {
            this.f25729b.c(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            throw null;
        }

        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }
    }

    public a(EditText editText, boolean z10) {
        androidx.core.util.h.h(editText, "editText cannot be null");
        this.f25725a = new C0454a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f25725a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f25725a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f25725a.c(z10);
    }
}
