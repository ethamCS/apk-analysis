package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import d.a.a.a.a0.k;
import d.a.a.a.a0.l;
/* loaded from: classes.dex */
public class a extends Drawable {

    /* renamed from: b */
    private final Paint f3130b;

    /* renamed from: h */
    float f3136h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private k o;
    private ColorStateList p;

    /* renamed from: a */
    private final l f3129a = new l();

    /* renamed from: c */
    private final Path f3131c = new Path();

    /* renamed from: d */
    private final Rect f3132d = new Rect();

    /* renamed from: e */
    private final RectF f3133e = new RectF();

    /* renamed from: f */
    private final RectF f3134f = new RectF();

    /* renamed from: g */
    private final b f3135g = new b();
    private boolean n = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends Drawable.ConstantState {
        private b() {
            a.this = r1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return a.this;
        }
    }

    public a(k kVar) {
        this.o = kVar;
        Paint paint = new Paint(1);
        this.f3130b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        Rect rect = this.f3132d;
        copyBounds(rect);
        float height = this.f3136h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{b.g.e.a.b(this.i, this.m), b.g.e.a.b(this.j, this.m), b.g.e.a.b(b.g.e.a.d(this.j, 0), this.m), b.g.e.a.b(b.g.e.a.d(this.l, 0), this.m), b.g.e.a.b(this.l, this.m), b.g.e.a.b(this.k, this.m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    protected RectF b() {
        this.f3134f.set(getBounds());
        return this.f3134f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.m = colorStateList.getColorForState(getState(), this.m);
        }
        this.p = colorStateList;
        this.n = true;
        invalidateSelf();
    }

    public void d(float f2) {
        if (this.f3136h != f2) {
            this.f3136h = f2;
            this.f3130b.setStrokeWidth(f2 * 1.3333f);
            this.n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.n) {
            this.f3130b.setShader(a());
            this.n = false;
        }
        float strokeWidth = this.f3130b.getStrokeWidth() / 2.0f;
        copyBounds(this.f3132d);
        this.f3133e.set(this.f3132d);
        float min = Math.min(this.o.r().a(b()), this.f3133e.width() / 2.0f);
        if (this.o.u(b())) {
            this.f3133e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f3133e, min, min, this.f3130b);
        }
    }

    public void e(int i, int i2, int i3, int i4) {
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
    }

    public void f(k kVar) {
        this.o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3135g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f3136h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.o.u(b())) {
            outline.setRoundRect(getBounds(), this.o.r().a(b()));
            return;
        }
        copyBounds(this.f3132d);
        this.f3133e.set(this.f3132d);
        this.f3129a.d(this.o, 1.0f, this.f3133e, this.f3131c);
        if (!this.f3131c.isConvex()) {
            return;
        }
        outline.setConvexPath(this.f3131c);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.o.u(b())) {
            int round = Math.round(this.f3136h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.m)) != this.m) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3130b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3130b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
