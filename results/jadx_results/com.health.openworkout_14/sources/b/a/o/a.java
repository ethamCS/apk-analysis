package b.a.o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import b.a.j;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private Context f2045a;

    private a(Context context) {
        this.f2045a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f2045a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f2045a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f2045a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    public int e() {
        return this.f2045a.getResources().getDimensionPixelSize(b.a.d.b_res_0x7f07000a);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f2045a.obtainStyledAttributes(null, j.f1990a, b.a.a.c_res_0x7f040006, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.j, 0);
        Resources resources = this.f2045a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(b.a.d.a_res_0x7f070009));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f2045a.getResources().getBoolean(b.a.b.f1987a);
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f2045a).hasPermanentMenuKey();
    }
}
