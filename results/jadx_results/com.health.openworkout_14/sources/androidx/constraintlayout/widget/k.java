package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public abstract class k extends c {
    private boolean j;
    private boolean k;

    @Override // androidx.constraintlayout.widget.c
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.J0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.L0) {
                    this.j = true;
                } else if (index == j.Q0) {
                    this.k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o(b.e.b.k.k kVar, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        int i = Build.VERSION.SDK_INT;
        super.onAttachedToWindow();
        if ((this.j || this.k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = i >= 21 ? getElevation() : 0.0f;
            for (int i2 = 0; i2 < this.f773c; i2++) {
                View h2 = constraintLayout.h(this.f772b[i2]);
                if (h2 != null) {
                    if (this.j) {
                        h2.setVisibility(visibility);
                    }
                    if (this.k && elevation > 0.0f && i >= 21) {
                        h2.setTranslationZ(h2.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
