package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class b1 extends Resources {

    /* renamed from: b */
    private static boolean f656b = false;

    /* renamed from: a */
    private final WeakReference<Context> f657a;

    public b1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f657a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f656b;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    public final Drawable a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f657a.get();
        return context != null ? m0.a().a(context, this, i) : super.getDrawable(i);
    }
}
