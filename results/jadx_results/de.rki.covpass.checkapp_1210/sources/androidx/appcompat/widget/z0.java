package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
class z0 extends q0 {

    /* renamed from: b */
    private final WeakReference<Context> f1594b;

    public z0(Context context, Resources resources) {
        super(resources);
        this.f1594b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable a10 = a(i10);
        Context context = this.f1594b.get();
        if (a10 != null && context != null) {
            p0.h().x(context, i10, a10);
        }
        return a10;
    }
}
