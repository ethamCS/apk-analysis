package y0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.m;
/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a */
    private static final Object f25730a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f25731b;

    /* renamed from: c */
    private static Class<?> f25732c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f25732c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f25731b == null) {
            synchronized (f25730a) {
                if (f25731b == null) {
                    f25731b = new b();
                }
            }
        }
        return f25731b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f25732c;
        return cls != null ? m.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
