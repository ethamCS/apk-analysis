package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
public class k implements j {

    /* renamed from: a */
    static final j f1791a = new k();

    k() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float t = b.g.l.t.t(childAt);
                if (t > f2) {
                    f2 = t;
                }
            }
        }
        return f2;
    }

    @Override // androidx.recyclerview.widget.j
    public void a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            int i = b.n.c.a_res_0x7f0900f2;
            Object tag = view.getTag(i);
            if (tag instanceof Float) {
                b.g.l.t.p0(view, ((Float) tag).floatValue());
            }
            view.setTag(i, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.j
    public void b(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i, boolean z) {
    }

    @Override // androidx.recyclerview.widget.j
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z) {
            int i2 = b.n.c.a_res_0x7f0900f2;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(b.g.l.t.t(view));
                b.g.l.t.p0(view, e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }

    @Override // androidx.recyclerview.widget.j
    public void d(View view) {
    }
}
