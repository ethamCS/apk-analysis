package d.a.a.a.w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import d.a.a.a.b;
import d.a.a.a.j;
/* loaded from: classes.dex */
public class a extends s {

    /* renamed from: g */
    private static final int f3688g = j.n;

    /* renamed from: h */
    private static final int[][] f3689h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    private ColorStateList f3690e;

    /* renamed from: f */
    private boolean f3691f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.v);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = d.a.a.a.w.a.f3688g
            android.content.Context r8 = com.google.android.material.theme.a.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = d.a.a.a.k.R1
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.o.h(r0, r1, r2, r3, r4, r5)
            int r10 = d.a.a.a.k.S1
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = d.a.a.a.x.c.a(r8, r9, r10)
            androidx.core.widget.c.c(r7, r8)
        L28:
            int r8 = d.a.a.a.k.T1
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f3691f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.w.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3690e == null) {
            int c2 = d.a.a.a.q.a.c(this, b.f3624g);
            int c3 = d.a.a.a.q.a.c(this, b.i_res_0x7f0400bd);
            int c4 = d.a.a.a.q.a.c(this, b.l_res_0x7f0400c4);
            int[][] iArr = f3689h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = d.a.a.a.q.a.f(c4, c2, 1.0f);
            iArr2[1] = d.a.a.a.q.a.f(c4, c3, 0.54f);
            iArr2[2] = d.a.a.a.q.a.f(c4, c3, 0.38f);
            iArr2[3] = d.a.a.a.q.a.f(c4, c3, 0.38f);
            this.f3690e = new ColorStateList(iArr, iArr2);
        }
        return this.f3690e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f3691f || c.b(this) != null) {
            return;
        }
        setUseMaterialThemeColors(true);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3691f = z;
        c.c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
