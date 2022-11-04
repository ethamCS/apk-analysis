package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.g.l.t;
import d.a.a.a.f;
import d.a.a.a.k;
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b */
    private TextView f3245b;

    /* renamed from: c */
    private Button f3246c;

    /* renamed from: d */
    private int f3247d;

    /* renamed from: e */
    private int f3248e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.P2);
        this.f3247d = obtainStyledAttributes.getDimensionPixelSize(k.Q2, -1);
        this.f3248e = obtainStyledAttributes.getDimensionPixelSize(k.X2, -1);
        obtainStyledAttributes.recycle();
    }

    private static void a(View view, int i, int i2) {
        if (t.Q(view)) {
            t.u0(view, t.D(view), i, t.C(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean b(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f3245b.getPaddingTop() == i2 && this.f3245b.getPaddingBottom() == i3) {
            return z;
        }
        a(this.f3245b, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f3246c;
    }

    public TextView getMessageView() {
        return this.f3245b;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3245b = (TextView) findViewById(f.w_res_0x7f090199);
        this.f3246c = (Button) findViewById(f.v_res_0x7f090198);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (b(1, r0, r0 - r1) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (b(0, r0, r0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f3247d
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f3247d
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = d.a.a.a.d.h_res_0x7f070088
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = d.a.a.a.d.g_res_0x7f070087
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f3245b
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f3248e
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f3246c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f3248e
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.b(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.b(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f3248e = i;
    }
}
