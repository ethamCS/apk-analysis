package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import b.g.d.c.f;
/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a */
    private final Context f662a;

    /* renamed from: b */
    private final TypedArray f663b;

    /* renamed from: c */
    private TypedValue f664c;

    private w0(Context context, TypedArray typedArray) {
        this.f662a = context;
        this.f663b = typedArray;
    }

    public static w0 t(Context context, int i, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i, iArr));
    }

    public static w0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.f663b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f663b.getColor(i, i2);
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList c2;
        return (!this.f663b.hasValue(i) || (resourceId = this.f663b.getResourceId(i, 0)) == 0 || (c2 = b.a.k.a.a.c(this.f662a, resourceId)) == null) ? this.f663b.getColorStateList(i) : c2;
    }

    public float d(int i, float f2) {
        return this.f663b.getDimension(i, f2);
    }

    public int e(int i, int i2) {
        return this.f663b.getDimensionPixelOffset(i, i2);
    }

    public int f(int i, int i2) {
        return this.f663b.getDimensionPixelSize(i, i2);
    }

    public Drawable g(int i) {
        int resourceId;
        return (!this.f663b.hasValue(i) || (resourceId = this.f663b.getResourceId(i, 0)) == 0) ? this.f663b.getDrawable(i) : b.a.k.a.a.d(this.f662a, resourceId);
    }

    public Drawable h(int i) {
        int resourceId;
        if (!this.f663b.hasValue(i) || (resourceId = this.f663b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f662a, resourceId, true);
    }

    public float i(int i, float f2) {
        return this.f663b.getFloat(i, f2);
    }

    public Typeface j(int i, int i2, f.a aVar) {
        int resourceId = this.f663b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f664c == null) {
            this.f664c = new TypedValue();
        }
        return b.g.d.c.f.c(this.f662a, resourceId, this.f664c, i2, aVar);
    }

    public int k(int i, int i2) {
        return this.f663b.getInt(i, i2);
    }

    public int l(int i, int i2) {
        return this.f663b.getInteger(i, i2);
    }

    public int m(int i, int i2) {
        return this.f663b.getLayoutDimension(i, i2);
    }

    public int n(int i, int i2) {
        return this.f663b.getResourceId(i, i2);
    }

    public String o(int i) {
        return this.f663b.getString(i);
    }

    public CharSequence p(int i) {
        return this.f663b.getText(i);
    }

    public CharSequence[] q(int i) {
        return this.f663b.getTextArray(i);
    }

    public TypedArray r() {
        return this.f663b;
    }

    public boolean s(int i) {
        return this.f663b.hasValue(i);
    }

    public void w() {
        this.f663b.recycle();
    }
}
