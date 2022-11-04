package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.y;
import b5.f;
import b5.h;
import b5.l;
import t5.g;
import t5.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends ConstraintLayout {

    /* renamed from: n4 */
    private final Runnable f7777n4;

    /* renamed from: o4 */
    private int f7778o4;

    /* renamed from: p4 */
    private g f7779p4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            b.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(h.h_res_0x7f0c004b, this);
        y.s0(this, B());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f5630n4, i10, 0);
        this.f7778o4 = obtainStyledAttributes.getDimensionPixelSize(l.f5639o4, 0);
        this.f7777n4 = new a();
        obtainStyledAttributes.recycle();
    }

    private Drawable B() {
        g gVar = new g();
        this.f7779p4 = gVar;
        gVar.X(new i(0.5f));
        this.f7779p4.Z(ColorStateList.valueOf(-1));
        return this.f7779p4;
    }

    private static boolean E(View view) {
        return "skip".equals(view.getTag());
    }

    private void G() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f7777n4);
            handler.post(this.f7777n4);
        }
    }

    public int C() {
        return this.f7778o4;
    }

    public void D(int i10) {
        this.f7778o4 = i10;
        F();
    }

    protected void F() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (E(getChildAt(i11))) {
                i10++;
            }
        }
        d dVar = new d();
        dVar.g(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id2 = childAt.getId();
            int i13 = f.b_res_0x7f09009f;
            if (id2 != i13 && !E(childAt)) {
                dVar.i(childAt.getId(), i13, this.f7778o4, f10);
                f10 += 360.0f / (childCount - i10);
            }
        }
        dVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(y.k());
        }
        G();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        G();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f7779p4.Z(ColorStateList.valueOf(i10));
    }
}
