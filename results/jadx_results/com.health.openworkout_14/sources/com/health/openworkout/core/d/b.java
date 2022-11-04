package com.health.openworkout.core.d;

import android.app.Activity;
import android.content.Context;
import android.view.View;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private static b f3397a;

    private b(Context context) {
    }

    public static void a(Context context) {
        if (f3397a != null) {
            return;
        }
        f3397a = new b(context);
    }

    public static b c() {
        b bVar = f3397a;
        if (bVar != null) {
            return bVar;
        }
        throw new RuntimeException("No PlayStoreUtils instance created");
    }

    public View b(Context context) {
        return null;
    }

    public void d(Activity activity) {
    }

    public boolean e() {
        return true;
    }
}
