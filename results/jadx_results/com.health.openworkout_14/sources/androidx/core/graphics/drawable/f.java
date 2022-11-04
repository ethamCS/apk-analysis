package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a */
    int f947a;

    /* renamed from: b */
    Drawable.ConstantState f948b;

    /* renamed from: c */
    ColorStateList f949c;

    /* renamed from: d */
    PorterDuff.Mode f950d;

    public f(f fVar) {
        this.f949c = null;
        this.f950d = d.f940h;
        if (fVar != null) {
            this.f947a = fVar.f947a;
            this.f948b = fVar.f948b;
            this.f949c = fVar.f949c;
            this.f950d = fVar.f950d;
        }
    }

    public boolean a() {
        return this.f948b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f947a;
        Drawable.ConstantState constantState = this.f948b;
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
