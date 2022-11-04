package p5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.u;
import androidx.core.widget.d;
import b5.b;
import b5.k;
/* loaded from: classes.dex */
public class a extends u {
    private static final int V3 = k.f5501t;
    private static final int[][] W3 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private boolean U3;

    /* renamed from: y */
    private ColorStateList f18904y;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = p5.a.V3
            android.content.Context r8 = v5.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = b5.l.A3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r10 = b5.l.B3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = q5.c.a(r8, r9, r10)
            androidx.core.widget.d.c(r7, r8)
        L28:
            int r8 = b5.l.C3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.U3 = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f18904y == null) {
            int d10 = i5.a.d(this, b.f5459h);
            int d11 = i5.a.d(this, b.j_res_0x7f0300ec);
            int d12 = i5.a.d(this, b.m_res_0x7f0300fb);
            int[][] iArr = W3;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = i5.a.h(d12, d10, 1.0f);
            iArr2[1] = i5.a.h(d12, d11, 0.54f);
            iArr2[2] = i5.a.h(d12, d11, 0.38f);
            iArr2[3] = i5.a.h(d12, d11, 0.38f);
            this.f18904y = new ColorStateList(iArr, iArr2);
        }
        return this.f18904y;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.U3 || d.b(this) != null) {
            return;
        }
        setUseMaterialThemeColors(true);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.U3 = z10;
        d.c(this, z10 ? getMaterialThemeColorsTintList() : null);
    }
}
