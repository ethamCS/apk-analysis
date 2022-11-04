package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
/* loaded from: classes.dex */
class m {

    /* renamed from: d */
    private static m f218d;

    /* renamed from: a */
    private final Context f219a;

    /* renamed from: b */
    private final LocationManager f220b;

    /* renamed from: c */
    private final a f221c = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        boolean f222a;

        /* renamed from: b */
        long f223b;

        /* renamed from: c */
        long f224c;

        /* renamed from: d */
        long f225d;

        /* renamed from: e */
        long f226e;

        /* renamed from: f */
        long f227f;

        a() {
        }
    }

    m(Context context, LocationManager locationManager) {
        this.f219a = context;
        this.f220b = locationManager;
    }

    public static m a(Context context) {
        if (f218d == null) {
            Context applicationContext = context.getApplicationContext();
            f218d = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f218d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c2 = b.g.d.b.b(this.f219a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (b.g.d.b.b(this.f219a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c2 == null) ? location != null ? location : c2 : location.getTime() > c2.getTime() ? location : c2;
    }

    private Location c(String str) {
        try {
            if (!this.f220b.isProviderEnabled(str)) {
                return null;
            }
            return this.f220b.getLastKnownLocation(str);
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f221c.f227f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        a aVar = this.f221c;
        long currentTimeMillis = System.currentTimeMillis();
        l b2 = l.b();
        b2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b2.f215a;
        b2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b2.f217c == 1;
        long j3 = b2.f216b;
        long j4 = b2.f215a;
        boolean z2 = z;
        b2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = b2.f216b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f222a = z2;
        aVar.f223b = j2;
        aVar.f224c = j3;
        aVar.f225d = j4;
        aVar.f226e = j5;
        aVar.f227f = j;
    }

    public boolean d() {
        a aVar = this.f221c;
        if (e()) {
            return aVar.f222a;
        }
        Location b2 = b();
        if (b2 != null) {
            f(b2);
            return aVar.f222a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
