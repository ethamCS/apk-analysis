package com.google.android.material.transformation;

import a.g.l.u;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.a.a.a.m.h;
import b.a.a.a.m.j;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(View view, boolean z) {
        int i;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (Build.VERSION.SDK_INT >= 16 && z) {
            this.i = new HashMap(childCount);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = coordinatorLayout.getChildAt(i2);
            boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).d() instanceof FabTransformationScrimBehavior);
            if (childAt != view && !z2) {
                if (!z) {
                    Map<View, Integer> map = this.i;
                    if (map != null && map.containsKey(childAt)) {
                        i = this.i.get(childAt).intValue();
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 16) {
                        this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    i = 4;
                }
                u.h(childAt, i);
            }
        }
        if (z) {
            return;
        }
        this.i = null;
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e a(Context context, boolean z) {
        int i = z ? b.a.a.a.a.mtrl_fab_transformation_sheet_expand_spec : b.a.a.a.a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f1615a = h.a(context, i);
        eVar.f1616b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean a(View view, View view2, boolean z, boolean z2) {
        a(view2, z);
        return super.a(view, view2, z, z2);
    }
}
