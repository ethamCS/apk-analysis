package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public abstract class k extends b {
    private boolean Y3;
    private boolean Z3;

    @Override // androidx.constraintlayout.widget.b
    public void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f3180n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f3198p1) {
                    this.Y3 = true;
                } else if (index == i.f3243u1) {
                    this.Z3 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Y3 || this.Z3) {
            ViewParent parent = getParent();
            if (!(parent instanceof ConstraintLayout)) {
                return;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f2927d; i10++) {
                View l10 = constraintLayout.l(this.f2926c[i10]);
                if (l10 != null) {
                    if (this.Y3) {
                        l10.setVisibility(visibility);
                    }
                    if (this.Z3 && elevation > 0.0f) {
                        l10.setTranslationZ(l10.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        g();
    }

    public void t(m0.k kVar, int i10, int i11) {
    }
}
