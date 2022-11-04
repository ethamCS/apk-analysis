package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import e.j;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private Context f14474a;

    private a(Context context) {
        this.f14474a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f14474a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f14474a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f14474a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 > 480 && i11 > 640) {
            return 4;
        }
        return i10 >= 360 ? 3 : 2;
    }

    public int e() {
        return this.f14474a.getResources().getDimensionPixelSize(e.d.b_res_0x7f06000a);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f14474a.obtainStyledAttributes(null, j.f9209a, e.a.c_res_0x7f030007, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f9254j, 0);
        Resources resources = this.f14474a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(e.d.a_res_0x7f060009));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f14474a.getResources().getBoolean(e.b.a_res_0x7f040000);
    }

    public boolean h() {
        return true;
    }
}
