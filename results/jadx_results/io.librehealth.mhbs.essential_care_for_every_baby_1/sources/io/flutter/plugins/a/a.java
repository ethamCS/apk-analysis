package io.flutter.plugins.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import d.a.c.a.b;
import d.a.c.a.h;
import d.a.c.a.i;
import io.flutter.embedding.engine.h.a;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a implements i.c, io.flutter.embedding.engine.h.a {

    /* renamed from: a */
    private Context f1216a;

    /* renamed from: b */
    private i f1217b;

    private static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    private void b(Context context, b bVar) {
        this.f1216a = context;
        i iVar = new i(bVar, "plugins.flutter.io/package_info");
        this.f1217b = iVar;
        iVar.e(this);
    }

    @Override // io.flutter.embedding.engine.h.a
    public void e(a.b bVar) {
        this.f1216a = null;
        this.f1217b.e(null);
        this.f1217b = null;
    }

    @Override // d.a.c.a.i.c
    public void g(h hVar, i.d dVar) {
        try {
            if (hVar.f695a.equals("getAll")) {
                PackageManager packageManager = this.f1216a.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(this.f1216a.getPackageName(), 0);
                HashMap hashMap = new HashMap();
                hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
                hashMap.put("packageName", this.f1216a.getPackageName());
                hashMap.put("version", packageInfo.versionName);
                hashMap.put("buildNumber", String.valueOf(a(packageInfo)));
                dVar.b(hashMap);
            } else {
                dVar.c();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            dVar.a("Name not found", e2.getMessage(), null);
        }
    }

    @Override // io.flutter.embedding.engine.h.a
    public void h(a.b bVar) {
        b(bVar.a(), bVar.b());
    }
}
