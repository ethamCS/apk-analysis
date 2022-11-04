package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
/* loaded from: classes.dex */
class m {
    private static m d;

    /* renamed from: a */
    private final Context f536a;

    /* renamed from: b */
    private final LocationManager f537b;

    /* renamed from: c */
    private final a f538c = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        boolean f539a;

        /* renamed from: b */
        long f540b;

        /* renamed from: c */
        long f541c;
        long d;
        long e;
        long f;

        a() {
        }
    }

    m(Context context, LocationManager locationManager) {
        this.f536a = context;
        this.f537b = locationManager;
    }

    private Location a(String str) {
        try {
            if (!this.f537b.isProviderEnabled(str)) {
                return null;
            }
            return this.f537b.getLastKnownLocation(str);
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    public static m a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    private void a(Location location) {
        long j;
        a aVar = this.f538c;
        long currentTimeMillis = System.currentTimeMillis();
        l a2 = l.a();
        a2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a2.f533a;
        a2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a2.f535c == 1;
        long j3 = a2.f534b;
        long j4 = a2.f533a;
        boolean z2 = z;
        a2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = a2.f534b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f539a = z2;
        aVar.f540b = j2;
        aVar.f541c = j3;
        aVar.d = j4;
        aVar.e = j5;
        aVar.f = j;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location a2 = a.g.d.b.a(this.f536a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        if (a.g.d.b.a(this.f536a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = a("gps");
        }
        return (location == null || a2 == null) ? location != null ? location : a2 : location.getTime() > a2.getTime() ? location : a2;
    }

    private boolean c() {
        return this.f538c.f > System.currentTimeMillis();
    }

    public boolean a() {
        a aVar = this.f538c;
        if (c()) {
            return aVar.f539a;
        }
        Location b2 = b();
        if (b2 != null) {
            a(b2);
            return aVar.f539a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
