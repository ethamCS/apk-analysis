package b.a.a.a.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;
import b.a.a.a.b;
import b.a.a.a.k;
import b.a.a.a.l;
import com.google.android.material.internal.m;
/* loaded from: classes.dex */
public class a extends g {
    private static final int g = k.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[][] h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList e;
    private boolean f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.checkboxStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(m.b(context, attributeSet, i, g), attributeSet, i);
        Context context2 = getContext();
        TypedArray c2 = m.c(context2, attributeSet, l.MaterialCheckBox, i, g, new int[0]);
        if (c2.hasValue(l.MaterialCheckBox_buttonTint)) {
            c.a(this, b.a.a.a.y.c.a(context2, c2, l.MaterialCheckBox_buttonTint));
        }
        this.f = c2.getBoolean(l.MaterialCheckBox_useMaterialThemeColors, false);
        c2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int[] iArr = new int[h.length];
            int a2 = b.a.a.a.s.a.a(this, b.colorControlActivated);
            int a3 = b.a.a.a.s.a.a(this, b.colorSurface);
            int a4 = b.a.a.a.s.a.a(this, b.colorOnSurface);
            iArr[0] = b.a.a.a.s.a.a(a3, a2, 1.0f);
            iArr[1] = b.a.a.a.s.a.a(a3, a4, 0.54f);
            iArr[2] = b.a.a.a.s.a.a(a3, a4, 0.38f);
            iArr[3] = b.a.a.a.s.a.a(a3, a4, 0.38f);
            this.e = new ColorStateList(h, iArr);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f || c.b(this) != null) {
            return;
        }
        setUseMaterialThemeColors(true);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        c.a(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
