package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.y;
import b5.f;
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: c */
    private TextView f7476c;

    /* renamed from: d */
    private Button f7477d;

    /* renamed from: q */
    private int f7478q;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void c(View view, int i10, int i11) {
        if (y.U(view)) {
            y.B0(view, y.G(view), i10, y.F(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean d(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f7476c.getPaddingTop() == i11 && this.f7476c.getPaddingBottom() == i12) {
            return z10;
        }
        c(this.f7476c, i11, i12);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i10, int i11) {
        this.f7476c.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f7476c.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
        if (this.f7477d.getVisibility() == 0) {
            this.f7477d.setAlpha(0.0f);
            this.f7477d.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i10, int i11) {
        this.f7476c.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f7476c.animate().alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        if (this.f7477d.getVisibility() == 0) {
            this.f7477d.setAlpha(1.0f);
            this.f7477d.animate().alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }

    public Button getActionView() {
        return this.f7477d;
    }

    public TextView getMessageView() {
        return this.f7476c;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f7476c = (TextView) findViewById(f.K_res_0x7f090235);
        this.f7477d = (Button) findViewById(f.J_res_0x7f090234);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (d(1, r0, r0 - r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (d(0, r0, r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r1 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        return;
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
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = b5.d.g_res_0x7f06008f
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = b5.d.f_res_0x7f06008e
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f7476c
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L2e
            r3 = r1
            goto L2f
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L48
            int r5 = r7.f7478q
            if (r5 <= 0) goto L48
            android.widget.Button r5 = r7.f7477d
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f7478q
            if (r5 <= r6) goto L48
            int r2 = r0 - r2
            boolean r0 = r7.d(r1, r0, r2)
            if (r0 == 0) goto L53
            goto L54
        L48:
            if (r3 == 0) goto L4b
            goto L4c
        L4b:
            r0 = r2
        L4c:
            boolean r0 = r7.d(r4, r0, r0)
            if (r0 == 0) goto L53
            goto L54
        L53:
            r1 = r4
        L54:
            if (r1 == 0) goto L59
            super.onMeasure(r8, r9)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f7478q = i10;
    }
}
