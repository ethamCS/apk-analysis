package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.widget.b implements j.d {
    private boolean Y3;
    private boolean Z3;

    /* renamed from: a4 */
    private float f2782a4;

    /* renamed from: b4 */
    protected View[] f2783b4;

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void a(j jVar, int i10, int i11, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void b(j jVar, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void c(j jVar, int i10) {
    }

    public float getProgress() {
        return this.f2782a4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.B6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.i.D6) {
                    this.Y3 = obtainStyledAttributes.getBoolean(index, this.Y3);
                } else if (index == androidx.constraintlayout.widget.i.C6) {
                    this.Z3 = obtainStyledAttributes.getBoolean(index, this.Z3);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f2782a4 = f10;
        int i10 = 0;
        if (this.f2927d > 0) {
            this.f2783b4 = l((ConstraintLayout) getParent());
            while (i10 < this.f2927d) {
                x(this.f2783b4[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof h)) {
                x(childAt, f10);
            }
            i10++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.Z3;
    }

    public boolean v() {
        return this.Y3;
    }

    public void w(Canvas canvas) {
    }

    public void x(View view, float f10) {
    }
}
