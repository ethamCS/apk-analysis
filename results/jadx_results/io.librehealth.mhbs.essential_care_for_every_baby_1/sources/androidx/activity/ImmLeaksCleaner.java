package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements g {

    /* renamed from: b */
    private static int f146b;

    /* renamed from: c */
    private static Field f147c;

    /* renamed from: d */
    private static Field f148d;

    /* renamed from: e */
    private static Field f149e;

    /* renamed from: a */
    private Activity f150a;

    private static void h() {
        try {
            f146b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f148d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f149e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f147c = declaredField3;
            declaredField3.setAccessible(true);
            f146b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.g
    public void g(i iVar, e.a aVar) {
        if (aVar != e.a.ON_DESTROY) {
            return;
        }
        if (f146b == 0) {
            h();
        }
        if (f146b != 1) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.f150a.getSystemService("input_method");
        try {
            Object obj = f147c.get(inputMethodManager);
            if (obj == null) {
                return;
            }
            synchronized (obj) {
                try {
                    try {
                        View view = (View) f148d.get(inputMethodManager);
                        if (view == null) {
                            return;
                        }
                        if (view.isAttachedToWindow()) {
                            return;
                        }
                        try {
                            f149e.set(inputMethodManager, null);
                            inputMethodManager.isActive();
                        } catch (IllegalAccessException unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (ClassCastException unused2) {
                } catch (IllegalAccessException unused3) {
                }
            }
        } catch (IllegalAccessException unused4) {
        }
    }
}
