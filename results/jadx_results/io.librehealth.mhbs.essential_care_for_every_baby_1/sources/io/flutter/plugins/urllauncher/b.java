package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes.dex */
class b {

    /* renamed from: a */
    private final Context f1249a;

    /* renamed from: b */
    private Activity f1250b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum a {
        OK,
        NO_ACTIVITY,
        ACTIVITY_NOT_FOUND
    }

    public b(Context context, Activity activity) {
        this.f1249a = context;
        this.f1250b = activity;
    }

    public boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(this.f1249a.getPackageManager());
        return resolveActivity != null && !"{com.android.fallback/com.android.fallback.Fallback}".equals(resolveActivity.toShortString());
    }

    public void b() {
        this.f1249a.sendBroadcast(new Intent(WebViewActivity.f1239e));
    }

    public a c(String str, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Activity activity = this.f1250b;
        if (activity == null) {
            return a.NO_ACTIVITY;
        }
        try {
            this.f1250b.startActivity(z ? WebViewActivity.b(activity, str, z2, z3, bundle) : new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", bundle));
            return a.OK;
        } catch (ActivityNotFoundException unused) {
            return a.ACTIVITY_NOT_FOUND;
        }
    }

    public void d(Activity activity) {
        this.f1250b = activity;
    }
}
