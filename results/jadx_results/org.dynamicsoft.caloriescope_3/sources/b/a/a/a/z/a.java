package b.a.a.a.z;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b.a.a.a.b0.g;
import b.a.a.a.b0.k;
import b.a.a.a.b0.n;
/* loaded from: classes.dex */
public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* renamed from: b */
    private b f1257b;

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        g f1258a;

        /* renamed from: b */
        boolean f1259b;

        public b(g gVar) {
            this.f1258a = gVar;
            this.f1259b = false;
        }

        public b(b bVar) {
            this.f1258a = (g) bVar.f1258a.getConstantState().newDrawable();
            this.f1259b = bVar.f1259b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public a newDrawable() {
            return new a(new b(this));
        }
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    private a(b bVar) {
        this.f1257b = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f1257b;
        if (bVar.f1259b) {
            bVar.f1258a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f1257b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1257b.f1258a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public a mutate() {
        this.f1257b = new b(this.f1257b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1257b.f1258a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f1257b.f1258a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a2 = b.a.a.a.z.b.a(iArr);
        b bVar = this.f1257b;
        if (bVar.f1259b != a2) {
            bVar.f1259b = a2;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1257b.f1258a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1257b.f1258a.setColorFilter(colorFilter);
    }

    @Override // b.a.a.a.b0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f1257b.f1258a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        this.f1257b.f1258a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f1257b.f1258a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1257b.f1258a.setTintMode(mode);
    }
}
