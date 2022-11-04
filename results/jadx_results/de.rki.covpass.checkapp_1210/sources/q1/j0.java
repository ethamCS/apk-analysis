package q1;

import android.view.View;
/* loaded from: classes.dex */
public abstract class j0 extends q {

    /* renamed from: a */
    private static final String[] f19410a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(t tVar, int i10) {
        int[] iArr;
        if (tVar == null || (iArr = (int[]) tVar.f19468a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // q1.q
    public void a(t tVar) {
        View view = tVar.f19469b;
        Integer num = (Integer) tVar.f19468a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        tVar.f19468a.put("android:visibilityPropagation:visibility", num);
        view.getLocationOnScreen(r2);
        int[] iArr = {iArr[0] + Math.round(view.getTranslationX())};
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        tVar.f19468a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // q1.q
    public String[] b() {
        return f19410a;
    }

    public int e(t tVar) {
        Integer num;
        if (tVar == null || (num = (Integer) tVar.f19468a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(t tVar) {
        return d(tVar, 0);
    }

    public int g(t tVar) {
        return d(tVar, 1);
    }
}
