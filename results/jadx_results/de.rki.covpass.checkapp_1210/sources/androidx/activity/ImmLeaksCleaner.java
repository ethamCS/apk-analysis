package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements s {

    /* renamed from: d */
    private static int f585d;

    /* renamed from: q */
    private static Field f586q;

    /* renamed from: x */
    private static Field f587x;

    /* renamed from: y */
    private static Field f588y;

    /* renamed from: c */
    private Activity f589c;

    public ImmLeaksCleaner(Activity activity) {
        this.f589c = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void a() {
        try {
            f585d = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f587x = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f588y = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f586q = declaredField3;
            declaredField3.setAccessible(true);
            f585d = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.s
    public void f(v vVar, m.b bVar) {
        if (bVar != m.b.ON_DESTROY) {
            return;
        }
        if (f585d == 0) {
            a();
        }
        if (f585d != 1) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.f589c.getSystemService("input_method");
        try {
            Object obj = f586q.get(inputMethodManager);
            if (obj == null) {
                return;
            }
            synchronized (obj) {
                try {
                    try {
                        View view = (View) f587x.get(inputMethodManager);
                        if (view == null) {
                            return;
                        }
                        if (view.isAttachedToWindow()) {
                            return;
                        }
                        try {
                            f588y.set(inputMethodManager, null);
                            inputMethodManager.isActive();
                        } catch (IllegalAccessException unused) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (ClassCastException unused2) {
                } catch (IllegalAccessException unused3) {
                }
            }
        } catch (IllegalAccessException unused4) {
        }
    }
}
