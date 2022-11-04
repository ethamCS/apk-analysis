package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.u0;
import b5.b;
import b5.d;
import b5.k;
import com.google.android.material.internal.o;
import l5.a;
/* loaded from: classes.dex */
public class SwitchMaterial extends u0 {
    private static final int M4 = k.f5502u;
    private static final int[][] N4 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private final a I4;
    private ColorStateList J4;
    private ColorStateList K4;
    private boolean L4;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.J);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.M4
            android.content.Context r7 = v5.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            l5.a r7 = new l5.a
            r7.<init>(r0)
            r6.I4 = r7
            int[] r2 = b5.l.Z4
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r9 = b5.l.f5514a5
            boolean r7 = r8.getBoolean(r9, r7)
            r6.L4 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.J4 == null) {
            int d10 = i5.a.d(this, b.m_res_0x7f0300fb);
            int d11 = i5.a.d(this, b.f5459h);
            float dimension = getResources().getDimension(d.f5466a0);
            if (this.I4.d()) {
                dimension += o.d(this);
            }
            int c10 = this.I4.c(d10, dimension);
            int[][] iArr = N4;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = i5.a.h(d10, d11, 1.0f);
            iArr2[1] = c10;
            iArr2[2] = i5.a.h(d10, d11, 0.38f);
            iArr2[3] = c10;
            this.J4 = new ColorStateList(iArr, iArr2);
        }
        return this.J4;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.K4 == null) {
            int[][] iArr = N4;
            int[] iArr2 = new int[iArr.length];
            int d10 = i5.a.d(this, b.m_res_0x7f0300fb);
            int d11 = i5.a.d(this, b.f5459h);
            int d12 = i5.a.d(this, b.j_res_0x7f0300ec);
            iArr2[0] = i5.a.h(d10, d11, 0.54f);
            iArr2[1] = i5.a.h(d10, d12, 0.32f);
            iArr2[2] = i5.a.h(d10, d11, 0.12f);
            iArr2[3] = i5.a.h(d10, d12, 0.12f);
            this.K4 = new ColorStateList(iArr, iArr2);
        }
        return this.K4;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.L4 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (!this.L4 || getTrackTintList() != null) {
            return;
        }
        setTrackTintList(getMaterialThemeColorsTrackTintList());
    }

    public void setUseMaterialThemeColors(boolean z10) {
        ColorStateList colorStateList;
        this.L4 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            colorStateList = getMaterialThemeColorsTrackTintList();
        } else {
            colorStateList = null;
            setThumbTintList(null);
        }
        setTrackTintList(colorStateList);
    }
}
