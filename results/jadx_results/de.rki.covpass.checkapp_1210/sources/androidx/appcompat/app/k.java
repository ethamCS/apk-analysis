package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
/* loaded from: classes.dex */
class k {

    /* renamed from: d */
    private static k f824d;

    /* renamed from: a */
    private final Context f825a;

    /* renamed from: b */
    private final LocationManager f826b;

    /* renamed from: c */
    private final a f827c = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        boolean f828a;

        /* renamed from: b */
        long f829b;

        /* renamed from: c */
        long f830c;

        /* renamed from: d */
        long f831d;

        /* renamed from: e */
        long f832e;

        /* renamed from: f */
        long f833f;

        a() {
        }
    }

    k(Context context, LocationManager locationManager) {
        this.f825a = context;
        this.f826b = locationManager;
    }

    public static k a(Context context) {
        if (f824d == null) {
            Context applicationContext = context.getApplicationContext();
            f824d = new k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f824d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c10 = androidx.core.content.d.b(this.f825a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (androidx.core.content.d.b(this.f825a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c10 == null) ? location != null ? location : c10 : location.getTime() > c10.getTime() ? location : c10;
    }

    private Location c(String str) {
        try {
            if (!this.f826b.isProviderEnabled(str)) {
                return null;
            }
            return this.f826b.getLastKnownLocation(str);
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f827c.f833f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f827c;
        long currentTimeMillis = System.currentTimeMillis();
        j b10 = j.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b10.f821a;
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = true;
        if (b10.f823c != 1) {
            z10 = false;
        }
        boolean z11 = z10;
        long j12 = b10.f822b;
        long j13 = b10.f821a;
        b10.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j14 = b10.f822b;
        if (j12 == -1 || j13 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j13 ? 0 + j14 : currentTimeMillis > j12 ? 0 + j13 : 0 + j12) + 60000;
        }
        aVar.f828a = z11;
        aVar.f829b = j11;
        aVar.f830c = j12;
        aVar.f831d = j13;
        aVar.f832e = j14;
        aVar.f833f = j10;
    }

    public boolean d() {
        a aVar = this.f827c;
        if (e()) {
            return aVar.f828a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f828a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
