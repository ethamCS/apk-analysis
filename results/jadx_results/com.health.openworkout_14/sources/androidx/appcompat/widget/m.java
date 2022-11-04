package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* loaded from: classes.dex */
public class m extends ImageButton implements b.g.l.s, androidx.core.widget.l {

    /* renamed from: b */
    private final e f562b;

    /* renamed from: c */
    private final n f563c;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.D_res_0x7f0401a4);
    }

    public m(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f562b = eVar;
        eVar.e(attributeSet, i);
        n nVar = new n(this);
        this.f563c = nVar;
        nVar.f(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f562b;
        if (eVar != null) {
            eVar.b();
        }
        n nVar = this.f563c;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // b.g.l.s
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f562b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // b.g.l.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f562b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportImageTintList() {
        n nVar = this.f563c;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.f563c;
        if (nVar != null) {
            return nVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f563c.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f562b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f562b;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f563c;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f563c;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f563c.g(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f563c;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // b.g.l.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f562b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // b.g.l.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f562b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f563c;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f563c;
        if (nVar != null) {
            nVar.i(mode);
        }
    }
}
