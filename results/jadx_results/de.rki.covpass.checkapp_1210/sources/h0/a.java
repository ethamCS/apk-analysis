package h0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class a extends FrameLayout {
    private static final int[] W3 = {16842801};
    private static final d X3;
    final Rect U3;
    private final c V3;

    /* renamed from: c */
    private boolean f11120c;

    /* renamed from: d */
    private boolean f11121d;

    /* renamed from: q */
    int f11122q;

    /* renamed from: x */
    int f11123x;

    /* renamed from: y */
    final Rect f11124y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.a$a */
    /* loaded from: classes.dex */
    public class C0164a implements c {

        /* renamed from: a */
        private Drawable f11125a;

        C0164a() {
            a.this = r1;
        }

        @Override // h0.c
        public void a(int i10, int i11, int i12, int i13) {
            a.this.U3.set(i10, i11, i12, i13);
            a aVar = a.this;
            Rect rect = aVar.f11124y;
            a.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // h0.c
        public View b() {
            return a.this;
        }

        @Override // h0.c
        public void c(Drawable drawable) {
            this.f11125a = drawable;
            a.this.setBackgroundDrawable(drawable);
        }

        @Override // h0.c
        public boolean d() {
            return a.this.getPreventCornerOverlap();
        }

        @Override // h0.c
        public boolean e() {
            return a.this.getUseCompatPadding();
        }

        @Override // h0.c
        public Drawable f() {
            return this.f11125a;
        }
    }

    static {
        b bVar = new b();
        X3 = bVar;
        bVar.i();
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.a.a_res_0x7f03008a);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources;
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f11124y = rect;
        this.U3 = new Rect();
        C0164a c0164a = new C0164a();
        this.V3 = c0164a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.f10313a, i10, g0.c.f10312a);
        int i12 = g0.d.f10316d;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(W3);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i11 = g0.b.b_res_0x7f050060;
            } else {
                resources = getResources();
                i11 = g0.b.a_res_0x7f05005f;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i11));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(g0.d.f10317e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(g0.d.f10318f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(g0.d.f10319g, 0.0f);
        this.f11120c = obtainStyledAttributes.getBoolean(g0.d.f10321i, false);
        this.f11121d = obtainStyledAttributes.getBoolean(g0.d.f10320h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(g0.d.f10322j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(g0.d.f10324l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(g0.d.f10326n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(g0.d.f10325m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(g0.d.f10323k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f11122q = obtainStyledAttributes.getDimensionPixelSize(g0.d.f10314b, 0);
        this.f11123x = obtainStyledAttributes.getDimensionPixelSize(g0.d.f10315c, 0);
        obtainStyledAttributes.recycle();
        X3.f(c0164a, context, colorStateList, dimension, dimension2, f10);
    }

    public void d(int i10, int i11, int i12, int i13) {
        this.f11124y.set(i10, i11, i12, i13);
        X3.k(this.V3);
    }

    public ColorStateList getCardBackgroundColor() {
        return X3.n(this.V3);
    }

    public float getCardElevation() {
        return X3.o(this.V3);
    }

    public int getContentPaddingBottom() {
        return this.f11124y.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f11124y.left;
    }

    public int getContentPaddingRight() {
        return this.f11124y.right;
    }

    public int getContentPaddingTop() {
        return this.f11124y.top;
    }

    public float getMaxCardElevation() {
        return X3.j(this.V3);
    }

    public boolean getPreventCornerOverlap() {
        return this.f11121d;
    }

    public float getRadius() {
        return X3.c(this.V3);
    }

    public boolean getUseCompatPadding() {
        return this.f11120c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        d dVar = X3;
        if (!(dVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(dVar.e(this.V3)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(dVar.b(this.V3)), View.MeasureSpec.getSize(i11)), mode2);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        X3.l(this.V3, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        X3.l(this.V3, colorStateList);
    }

    public void setCardElevation(float f10) {
        X3.h(this.V3, f10);
    }

    public void setMaxCardElevation(float f10) {
        X3.d(this.V3, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f11123x = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f11122q = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f11121d) {
            this.f11121d = z10;
            X3.m(this.V3);
        }
    }

    public void setRadius(float f10) {
        X3.a(this.V3, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f11120c != z10) {
            this.f11120c = z10;
            X3.g(this.V3);
        }
    }
}
