package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.l.t;
import com.google.android.material.transformation.FabTransformationBehavior;
import d.a.a.a.l.h;
import d.a.a.a.l.j;
import java.util.HashMap;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void g0(View view, boolean z) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (i2 >= 16 && z) {
            this.i = new HashMap(childCount);
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = coordinatorLayout.getChildAt(i3);
            boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
            if (childAt != view && !z2) {
                if (!z) {
                    Map<View, Integer> map = this.i;
                    if (map != null && map.containsKey(childAt)) {
                        i = this.i.get(childAt).intValue();
                    }
                } else {
                    if (i2 >= 16) {
                        this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    i = 4;
                }
                t.r0(childAt, i);
            }
        }
        if (z) {
            return;
        }
        this.i = null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean H(View view, View view2, boolean z, boolean z2) {
        g0(view2, z);
        return super.H(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e e0(Context context, boolean z) {
        int i = z ? d.a.a.a.a.d_res_0x7f02000e : d.a.a.a.a.c_res_0x7f02000d;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f3363a = h.c(context, i);
        eVar.f3364b = new j(17, 0.0f, 0.0f);
        return eVar;
    }
}
