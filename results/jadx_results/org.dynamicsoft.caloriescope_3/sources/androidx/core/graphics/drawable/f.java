package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a */
    int f853a;

    /* renamed from: b */
    Drawable.ConstantState f854b;

    /* renamed from: c */
    ColorStateList f855c;
    PorterDuff.Mode d;

    public f(f fVar) {
        this.f855c = null;
        this.d = d.h;
        if (fVar != null) {
            this.f853a = fVar.f853a;
            this.f854b = fVar.f854b;
            this.f855c = fVar.f855c;
            this.d = fVar.d;
        }
    }

    public boolean a() {
        return this.f854b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f853a;
        Drawable.ConstantState constantState = this.f854b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
