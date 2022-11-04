package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class x0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1560c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<x0>> f1561d;

    /* renamed from: a */
    private final Resources f1562a;

    /* renamed from: b */
    private final Resources.Theme f1563b;

    private x0(Context context) {
        super(context);
        if (!g1.c()) {
            this.f1562a = new z0(this, context.getResources());
            this.f1563b = null;
            return;
        }
        g1 g1Var = new g1(this, context.getResources());
        this.f1562a = g1Var;
        Resources.Theme newTheme = g1Var.newTheme();
        this.f1563b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return !(context instanceof x0) && !(context.getResources() instanceof z0) && !(context.getResources() instanceof g1) && g1.c();
    }

    public static Context b(Context context) {
        if (a(context)) {
            synchronized (f1560c) {
                ArrayList<WeakReference<x0>> arrayList = f1561d;
                if (arrayList == null) {
                    f1561d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<x0> weakReference = f1561d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1561d.remove(size);
                        }
                    }
                    for (int size2 = f1561d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<x0> weakReference2 = f1561d.get(size2);
                        x0 x0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (x0Var != null && x0Var.getBaseContext() == context) {
                            return x0Var;
                        }
                    }
                }
                x0 x0Var2 = new x0(context);
                f1561d.add(new WeakReference<>(x0Var2));
                return x0Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1562a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1562a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1563b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1563b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
