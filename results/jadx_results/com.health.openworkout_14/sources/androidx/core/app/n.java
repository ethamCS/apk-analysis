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
public final class n implements Iterable<Intent> {

    /* renamed from: b */
    private final ArrayList<Intent> f926b = new ArrayList<>();

    /* renamed from: c */
    private final Context f927c;

    /* loaded from: classes.dex */
    public interface a {
        Intent f();
    }

    private n(Context context) {
        this.f927c = context;
    }

    public static n e(Context context) {
        return new n(context);
    }

    public n a(Intent intent) {
        this.f926b.add(intent);
        return this;
    }

    public n b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f927c.getPackageManager());
        }
        if (component != null) {
            d(component);
        }
        a(intent);
        return this;
    }

    public n c(Activity activity) {
        Intent f2 = activity instanceof a ? ((a) activity).f() : null;
        if (f2 == null) {
            f2 = g.a(activity);
        }
        if (f2 != null) {
            ComponentName component = f2.getComponent();
            if (component == null) {
                component = f2.resolveActivity(this.f927c.getPackageManager());
            }
            d(component);
            a(f2);
        }
        return this;
    }

    public n d(ComponentName componentName) {
        int size = this.f926b.size();
        try {
            Context context = this.f927c;
            while (true) {
                Intent b2 = g.b(context, componentName);
                if (b2 == null) {
                    return this;
                }
                this.f926b.add(size, b2);
                context = this.f927c;
                componentName = b2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public Intent f(int i) {
        return this.f926b.get(i);
    }

    public int g() {
        return this.f926b.size();
    }

    public void h() {
        i(null);
    }

    public void i(Bundle bundle) {
        if (!this.f926b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f926b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (b.g.d.a.e(this.f927c, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f927c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f926b.iterator();
    }
}
