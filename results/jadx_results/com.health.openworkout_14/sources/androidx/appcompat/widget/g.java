package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
/* loaded from: classes.dex */
public class g extends CheckBox implements androidx.core.widget.j, b.g.l.s {

    /* renamed from: b */
    private final i f508b;

    /* renamed from: c */
    private final e f509c;

    /* renamed from: d */
    private final y f510d;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.r);
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        r0.a(this, getContext());
        i iVar = new i(this);
        this.f508b = iVar;
        iVar.e(attributeSet, i);
        e eVar = new e(this);
        this.f509c = eVar;
        eVar.e(attributeSet, i);
        y yVar = new y(this);
        this.f510d = yVar;
        yVar.m(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f509c;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f510d;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f508b;
        return iVar != null ? iVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // b.g.l.s
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f509c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // b.g.l.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f509c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f508b;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f508b;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f509c;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f509c;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(b.a.k.a.a.d(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f508b;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // b.g.l.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f509c;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // b.g.l.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f509c;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f508b;
        if (iVar != null) {
            iVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f508b;
        if (iVar != null) {
            iVar.h(mode);
        }
    }
}
