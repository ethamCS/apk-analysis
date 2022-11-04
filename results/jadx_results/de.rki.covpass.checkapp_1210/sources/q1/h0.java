package q1;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
class h0 {

    /* renamed from: a */
    private static Field f19390a;

    /* renamed from: b */
    private static boolean f19391b;

    public void a(View view) {
        throw null;
    }

    public float b(View view) {
        throw null;
    }

    public void c(View view) {
        throw null;
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        throw null;
    }

    public void e(View view, float f10) {
        throw null;
    }

    public void f(View view, int i10) {
        if (!f19391b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f19390a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f19391b = true;
        }
        Field field = f19390a;
        if (field != null) {
            try {
                f19390a.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }
}
