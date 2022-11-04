package androidx.appcompat.widget;

import a.g.d.c.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a */
    private final Context f767a;

    /* renamed from: b */
    private final TypedArray f768b;

    /* renamed from: c */
    private TypedValue f769c;

    private w0(Context context, TypedArray typedArray) {
        this.f767a = context;
        this.f768b = typedArray;
    }

    public static w0 a(Context context, int i, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i, iArr));
    }

    public static w0 a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public float a(int i, float f) {
        return this.f768b.getDimension(i, f);
    }

    public int a(int i, int i2) {
        return this.f768b.getColor(i, i2);
    }

    public ColorStateList a(int i) {
        int resourceId;
        ColorStateList b2;
        return (!this.f768b.hasValue(i) || (resourceId = this.f768b.getResourceId(i, 0)) == 0 || (b2 = a.a.k.a.a.b(this.f767a, resourceId)) == null) ? this.f768b.getColorStateList(i) : b2;
    }

    public Typeface a(int i, int i2, f.a aVar) {
        int resourceId = this.f768b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f769c == null) {
            this.f769c = new TypedValue();
        }
        return a.g.d.c.f.a(this.f767a, resourceId, this.f769c, i2, aVar);
    }

    public void a() {
        this.f768b.recycle();
    }

    public boolean a(int i, boolean z) {
        return this.f768b.getBoolean(i, z);
    }

    public float b(int i, float f) {
        return this.f768b.getFloat(i, f);
    }

    public int b(int i, int i2) {
        return this.f768b.getDimensionPixelOffset(i, i2);
    }

    public Drawable b(int i) {
        int resourceId;
        return (!this.f768b.hasValue(i) || (resourceId = this.f768b.getResourceId(i, 0)) == 0) ? this.f768b.getDrawable(i) : a.a.k.a.a.c(this.f767a, resourceId);
    }

    public int c(int i, int i2) {
        return this.f768b.getDimensionPixelSize(i, i2);
    }

    public Drawable c(int i) {
        int resourceId;
        if (!this.f768b.hasValue(i) || (resourceId = this.f768b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return j.b().a(this.f767a, resourceId, true);
    }

    public int d(int i, int i2) {
        return this.f768b.getInt(i, i2);
    }

    public String d(int i) {
        return this.f768b.getString(i);
    }

    public int e(int i, int i2) {
        return this.f768b.getInteger(i, i2);
    }

    public CharSequence e(int i) {
        return this.f768b.getText(i);
    }

    public int f(int i, int i2) {
        return this.f768b.getLayoutDimension(i, i2);
    }

    public CharSequence[] f(int i) {
        return this.f768b.getTextArray(i);
    }

    public int g(int i, int i2) {
        return this.f768b.getResourceId(i, i2);
    }

    public boolean g(int i) {
        return this.f768b.hasValue(i);
    }
}
