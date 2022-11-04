package r5;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import t5.g;
import t5.k;
import t5.n;
/* loaded from: classes.dex */
public class a extends Drawable implements n {

    /* renamed from: c */
    private b f20470c;

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        g f20471a;

        /* renamed from: b */
        boolean f20472b;

        public b(b bVar) {
            this.f20471a = (g) bVar.f20471a.getConstantState().newDrawable();
            this.f20472b = bVar.f20472b;
        }

        public b(g gVar) {
            this.f20471a = gVar;
            this.f20472b = false;
        }

        /* renamed from: a */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    private a(b bVar) {
        this.f20470c = bVar;
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* renamed from: a */
    public a mutate() {
        this.f20470c = new b(this.f20470c);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f20470c;
        if (bVar.f20472b) {
            bVar.f20471a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f20470c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f20470c.f20471a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f20470c.f20471a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f20470c.f20471a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e10 = r5.b.e(iArr);
        b bVar = this.f20470c;
        if (bVar.f20472b != e10) {
            bVar.f20472b = e10;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f20470c.f20471a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20470c.f20471a.setColorFilter(colorFilter);
    }

    @Override // t5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f20470c.f20471a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f20470c.f20471a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f20470c.f20471a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f20470c.f20471a.setTintMode(mode);
    }
}
