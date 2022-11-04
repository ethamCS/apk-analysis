package b.a.a.a.x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import b.a.a.a.b;
import b.a.a.a.k;
import b.a.a.a.l;
import com.google.android.material.internal.m;
/* loaded from: classes.dex */
public class a extends s {
    private static final int g = k.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList e;
    private boolean f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.radioButtonStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(m.b(context, attributeSet, i, g), attributeSet, i);
        TypedArray c2 = m.c(getContext(), attributeSet, l.MaterialRadioButton, i, g, new int[0]);
        this.f = c2.getBoolean(l.MaterialRadioButton_useMaterialThemeColors, false);
        c2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int a2 = b.a.a.a.s.a.a(this, b.colorControlActivated);
            int a3 = b.a.a.a.s.a.a(this, b.colorOnSurface);
            int a4 = b.a.a.a.s.a.a(this, b.colorSurface);
            int[] iArr = new int[h.length];
            iArr[0] = b.a.a.a.s.a.a(a4, a2, 1.0f);
            iArr[1] = b.a.a.a.s.a.a(a4, a3, 0.54f);
            iArr[2] = b.a.a.a.s.a.a(a4, a3, 0.38f);
            iArr[3] = b.a.a.a.s.a.a(a4, a3, 0.38f);
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
