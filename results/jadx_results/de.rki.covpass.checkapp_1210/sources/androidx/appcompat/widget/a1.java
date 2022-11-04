package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;
/* loaded from: classes.dex */
public class a1 {

    /* renamed from: a */
    private final Context f1203a;

    /* renamed from: b */
    private final TypedArray f1204b;

    /* renamed from: c */
    private TypedValue f1205c;

    private a1(Context context, TypedArray typedArray) {
        this.f1203a = context;
        this.f1204b = typedArray;
    }

    public static a1 t(Context context, int i10, int[] iArr) {
        return new a1(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static a1 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static a1 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1204b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1204b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        return (!this.f1204b.hasValue(i10) || (resourceId = this.f1204b.getResourceId(i10, 0)) == 0 || (a10 = g.a.a(this.f1203a, resourceId)) == null) ? this.f1204b.getColorStateList(i10) : a10;
    }

    public float d(int i10, float f10) {
        return this.f1204b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f1204b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1204b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f1204b.hasValue(i10) || (resourceId = this.f1204b.getResourceId(i10, 0)) == 0) ? this.f1204b.getDrawable(i10) : g.a.b(this.f1203a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f1204b.hasValue(i10) || (resourceId = this.f1204b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f1203a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f1204b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, h.e eVar) {
        int resourceId = this.f1204b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1205c == null) {
            this.f1205c = new TypedValue();
        }
        return androidx.core.content.res.h.h(this.f1203a, resourceId, this.f1205c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f1204b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1204b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1204b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f1204b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f1204b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f1204b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f1204b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f1204b;
    }

    public boolean s(int i10) {
        return this.f1204b.hasValue(i10);
    }

    public void w() {
        this.f1204b.recycle();
    }
}
