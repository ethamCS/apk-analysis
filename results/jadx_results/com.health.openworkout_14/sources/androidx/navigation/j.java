package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private final Context f1341a;

    /* renamed from: b */
    private final Intent f1342b;

    /* renamed from: c */
    private n f1343c;

    /* renamed from: d */
    private int f1344d;

    public j(Context context) {
        this.f1341a = context;
        if (context instanceof Activity) {
            this.f1342b = new Intent(context, context.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            this.f1342b = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        this.f1342b.addFlags(268468224);
    }

    public j(NavController navController) {
        this(navController.f());
        this.f1343c = navController.j();
    }

    private void b() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.f1343c);
        l lVar = null;
        while (!arrayDeque.isEmpty() && lVar == null) {
            l lVar2 = (l) arrayDeque.poll();
            if (lVar2.i() == this.f1344d) {
                lVar = lVar2;
            } else if (lVar2 instanceof n) {
                Iterator<l> it = ((n) lVar2).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        if (lVar != null) {
            this.f1342b.putExtra("android-support-nav:controller:deepLinkIds", lVar.d());
            return;
        }
        String h2 = l.h(this.f1341a, this.f1344d);
        throw new IllegalArgumentException("Navigation destination " + h2 + " cannot be found in the navigation graph " + this.f1343c);
    }

    public androidx.core.app.n a() {
        if (this.f1342b.getIntArrayExtra("android-support-nav:controller:deepLinkIds") == null) {
            if (this.f1343c != null) {
                throw new IllegalStateException("You must call setDestination() before constructing the deep link");
            }
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        androidx.core.app.n e2 = androidx.core.app.n.e(this.f1341a);
        e2.b(new Intent(this.f1342b));
        for (int i = 0; i < e2.g(); i++) {
            e2.f(i).putExtra("android-support-nav:controller:deepLinkIntent", this.f1342b);
        }
        return e2;
    }

    public j c(Bundle bundle) {
        this.f1342b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public j d(int i) {
        this.f1344d = i;
        if (this.f1343c != null) {
            b();
        }
        return this;
    }
}
