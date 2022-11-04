package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class f extends ViewGroup {

    /* renamed from: b */
    e f831b;

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float o0;
        public boolean p0;
        public float q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public a(int i, int i2) {
            super(i, i2);
            this.o0 = 1.0f;
            this.p0 = false;
            this.q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 0.0f;
            this.t0 = 0.0f;
            this.u0 = 1.0f;
            this.v0 = 1.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i = Build.VERSION.SDK_INT;
            this.o0 = 1.0f;
            this.p0 = false;
            this.q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 0.0f;
            this.t0 = 0.0f;
            this.u0 = 1.0f;
            this.v0 = 1.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.X1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == j.Y1) {
                    this.o0 = obtainStyledAttributes.getFloat(index, this.o0);
                } else if (index == j.j2) {
                    if (i >= 21) {
                        this.q0 = obtainStyledAttributes.getFloat(index, this.q0);
                        this.p0 = true;
                    }
                } else if (index == j.g2) {
                    this.s0 = obtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == j.h2) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                } else if (index == j.f2) {
                    this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == j.d2) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == j.e2) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == j.Z1) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == j.a2) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == j.b2) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == j.c2) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == j.i2 && i >= 21) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public e getConstraintSet() {
        if (this.f831b == null) {
            this.f831b = new e();
        }
        this.f831b.g(this);
        return this.f831b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
