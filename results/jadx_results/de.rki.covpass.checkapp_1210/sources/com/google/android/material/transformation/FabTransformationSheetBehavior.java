package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.y;
import b5.a;
import c5.h;
import c5.j;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f7817i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void g0(View view, boolean z10) {
        int i10;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            this.f7817i = new HashMap(childCount);
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = coordinatorLayout.getChildAt(i11);
            boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
            if (childAt != view && !z11) {
                Map<View, Integer> map = this.f7817i;
                if (z10) {
                    map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    i10 = 4;
                } else if (map != null && map.containsKey(childAt)) {
                    i10 = this.f7817i.get(childAt).intValue();
                }
                y.y0(childAt, i10);
            }
        }
        if (z10) {
            return;
        }
        this.f7817i = null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean H(View view, View view2, boolean z10, boolean z11) {
        g0(view2, z10);
        return super.H(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e e0(Context context, boolean z10) {
        int i10 = z10 ? a.d_res_0x7f02001f : a.c_res_0x7f02001e;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f7810a = h.c(context, i10);
        eVar.f7811b = new j(17, 0.0f, 0.0f);
        return eVar;
    }
}
