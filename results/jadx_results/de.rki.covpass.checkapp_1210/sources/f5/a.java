package f5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.d;
import b5.b;
import b5.k;
import com.google.android.material.internal.o;
/* loaded from: classes.dex */
public class a extends AppCompatCheckBox {
    private static final int W3 = k.f5500s;
    private static final int[][] X3 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private boolean U3;
    private boolean V3;

    /* renamed from: y */
    private ColorStateList f9803y;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f5458e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f5.a.W3
            android.content.Context r8 = v5.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = b5.l.f5701v3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r10 = b5.l.f5710w3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = q5.c.a(r8, r9, r10)
            androidx.core.widget.d.c(r7, r8)
        L28:
            int r8 = b5.l.f5727y3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.U3 = r8
            int r8 = b5.l.f5719x3
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.V3 = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9803y == null) {
            int[][] iArr = X3;
            int[] iArr2 = new int[iArr.length];
            int d10 = i5.a.d(this, b.f5459h);
            int d11 = i5.a.d(this, b.m_res_0x7f0300fb);
            int d12 = i5.a.d(this, b.j_res_0x7f0300ec);
            iArr2[0] = i5.a.h(d11, d10, 1.0f);
            iArr2[1] = i5.a.h(d11, d12, 0.54f);
            iArr2[2] = i5.a.h(d11, d12, 0.38f);
            iArr2[3] = i5.a.h(d11, d12, 0.38f);
            this.f9803y = new ColorStateList(iArr, iArr2);
        }
        return this.f9803y;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.U3 || d.b(this) != null) {
            return;
        }
        setUseMaterialThemeColors(true);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a10;
        if (!this.V3 || !TextUtils.isEmpty(getText()) || (a10 = d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * (o.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() == null) {
            return;
        }
        Rect bounds = a10.getBounds();
        androidx.core.graphics.drawable.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.V3 = z10;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.U3 = z10;
        d.c(this, z10 ? getMaterialThemeColorsTintList() : null);
    }
}
