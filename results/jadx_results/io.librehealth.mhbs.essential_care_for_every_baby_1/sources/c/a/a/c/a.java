package c.a.a.c;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    protected Context f373a;

    public a(Context context) {
        this.f373a = context;
    }

    public String a() {
        return this.f373a.getPackageManager().getLaunchIntentForPackage(b()).getComponent().getClassName();
    }

    public String b() {
        return this.f373a.getPackageName();
    }

    public abstract void c(int i);
}
