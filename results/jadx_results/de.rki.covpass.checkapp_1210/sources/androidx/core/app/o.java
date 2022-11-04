package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class o implements Iterable<Intent> {

    /* renamed from: c */
    private final ArrayList<Intent> f3383c = new ArrayList<>();

    /* renamed from: d */
    private final Context f3384d;

    /* loaded from: classes.dex */
    public interface a {
        Intent F();
    }

    private o(Context context) {
        this.f3384d = context;
    }

    public static o d(Context context) {
        return new o(context);
    }

    public o a(Intent intent) {
        this.f3383c.add(intent);
        return this;
    }

    public o b(Activity activity) {
        Intent F = activity instanceof a ? ((a) activity).F() : null;
        if (F == null) {
            F = h.a(activity);
        }
        if (F != null) {
            ComponentName component = F.getComponent();
            if (component == null) {
                component = F.resolveActivity(this.f3384d.getPackageManager());
            }
            c(component);
            a(F);
        }
        return this;
    }

    public o c(ComponentName componentName) {
        int size = this.f3383c.size();
        try {
            Context context = this.f3384d;
            while (true) {
                Intent b10 = h.b(context, componentName);
                if (b10 == null) {
                    return this;
                }
                this.f3383c.add(size, b10);
                context = this.f3384d;
                componentName = b10.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (!this.f3383c.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f3383c.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (androidx.core.content.a.h(this.f3384d, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f3384d.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3383c.iterator();
    }
}
