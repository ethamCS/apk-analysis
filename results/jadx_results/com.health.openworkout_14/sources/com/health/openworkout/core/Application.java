package com.health.openworkout.core;

import androidx.appcompat.app.f;
import androidx.preference.j;
import h.a.a;
/* loaded from: classes.dex */
public class Application extends android.app.Application {

    /* loaded from: classes.dex */
    private class b extends a.b {
        private b(Application application) {
        }

        @Override // h.a.a.c
        public boolean i(String str, int i) {
            if (com.health.openworkout.core.a.f3372e) {
                return super.i(str, i);
            }
            return false;
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        h.a.a.f(new b());
        if (j.b(this).getBoolean("darkTheme", false)) {
            f.G(2);
        }
        com.health.openworkout.core.a.a(getApplicationContext());
        com.health.openworkout.core.d.b.a(getApplicationContext());
        com.health.openworkout.core.a.h();
    }
}
