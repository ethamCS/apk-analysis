package d.a.a.a.y;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d.a.a.a.a0.g;
import d.a.a.a.a0.k;
import d.a.a.a.a0.n;
/* loaded from: classes.dex */
public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* renamed from: b */
    private b f3709b;

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        g f3710a;

        /* renamed from: b */
        boolean f3711b;

        public b(g gVar) {
            this.f3710a = gVar;
            this.f3711b = false;
        }

        public b(b bVar) {
            this.f3710a = (g) bVar.f3710a.getConstantState().newDrawable();
            this.f3711b = bVar.f3711b;
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

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    private a(b bVar) {
        this.f3709b = bVar;
    }

    public a a() {
        this.f3709b = new b(this.f3709b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f3709b;
        if (bVar.f3711b) {
            bVar.f3710a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3709b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f3709b.f3710a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable mutate() {
        a();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3709b.f3710a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f3709b.f3710a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b2 = d.a.a.a.y.b.b(iArr);
        b bVar = this.f3709b;
        if (bVar.f3711b != b2) {
            bVar.f3711b = b2;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3709b.f3710a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3709b.f3710a.setColorFilter(colorFilter);
    }

    @Override // d.a.a.a.a0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f3709b.f3710a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        this.f3709b.f3710a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f3709b.f3710a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3709b.f3710a.setTintMode(mode);
    }
}
