package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] i = {16842801};
    private static final e j;

    /* renamed from: b */
    private boolean f705b;

    /* renamed from: c */
    private boolean f706c;

    /* renamed from: d */
    int f707d;

    /* renamed from: e */
    int f708e;

    /* renamed from: f */
    final Rect f709f;

    /* renamed from: g */
    final Rect f710g;

    /* renamed from: h */
    private final d f711h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a */
        private Drawable f712a;

        a() {
            CardView.this = r1;
        }

        @Override // androidx.cardview.widget.d
        public void a(int i, int i2, int i3, int i4) {
            CardView.this.f710g.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f709f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public View b() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.d
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public Drawable d() {
            return this.f712a;
        }

        @Override // androidx.cardview.widget.d
        public void e(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f707d) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f708e) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        @Override // androidx.cardview.widget.d
        public void f(Drawable drawable) {
            this.f712a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean g() {
            return CardView.this.getPreventCornerOverlap();
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        j = i2 >= 21 ? new b() : i2 >= 17 ? new androidx.cardview.widget.a() : new c();
        j.n();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.a.a_res_0x7f040083);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources;
        int i3;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f709f = rect;
        this.f710g = new Rect();
        a aVar = new a();
        this.f711h = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.e.f2112a, i2, b.c.d.a_res_0x7f1100e6);
        int i4 = b.c.e.f2115d;
        if (obtainStyledAttributes.hasValue(i4)) {
            valueOf = obtainStyledAttributes.getColorStateList(i4);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i3 = b.c.b.b_res_0x7f06002a;
            } else {
                resources = getResources();
                i3 = b.c.b.a_res_0x7f060029;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i3));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(b.c.e.f2116e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(b.c.e.f2117f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(b.c.e.f2118g, 0.0f);
        this.f705b = obtainStyledAttributes.getBoolean(b.c.e.i, false);
        this.f706c = obtainStyledAttributes.getBoolean(b.c.e.f2119h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b.c.e.j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(b.c.e.l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(b.c.e.n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(b.c.e.m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(b.c.e.k, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f707d = obtainStyledAttributes.getDimensionPixelSize(b.c.e.f2113b, 0);
        this.f708e = obtainStyledAttributes.getDimensionPixelSize(b.c.e.f2114c, 0);
        obtainStyledAttributes.recycle();
        j.h(aVar, context, colorStateList, dimension, dimension2, f2);
    }

    public ColorStateList getCardBackgroundColor() {
        return j.f(this.f711h);
    }

    public float getCardElevation() {
        return j.l(this.f711h);
    }

    public int getContentPaddingBottom() {
        return this.f709f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f709f.left;
    }

    public int getContentPaddingRight() {
        return this.f709f.right;
    }

    public int getContentPaddingTop() {
        return this.f709f.top;
    }

    public float getMaxCardElevation() {
        return j.a(this.f711h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f706c;
    }

    public float getRadius() {
        return j.b(this.f711h);
    }

    public boolean getUseCompatPadding() {
        return this.f705b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        e eVar = j;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.d(this.f711h)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.c(this.f711h)), View.MeasureSpec.getSize(i3)), mode2);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        j.k(this.f711h, ColorStateList.valueOf(i2));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        j.k(this.f711h, colorStateList);
    }

    public void setCardElevation(float f2) {
        j.g(this.f711h, f2);
    }

    public void setMaxCardElevation(float f2) {
        j.m(this.f711h, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.f708e = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f707d = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f706c) {
            this.f706c = z;
            j.j(this.f711h);
        }
    }

    public void setRadius(float f2) {
        j.i(this.f711h, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f705b != z) {
            this.f705b = z;
            j.e(this.f711h);
        }
    }
}
