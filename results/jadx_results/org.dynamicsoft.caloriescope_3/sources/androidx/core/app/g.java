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
public final class g implements Iterable<Intent> {

    /* renamed from: b */
    private final ArrayList<Intent> f843b = new ArrayList<>();

    /* renamed from: c */
    private final Context f844c;

    /* loaded from: classes.dex */
    public interface a {
        Intent f();
    }

    private g(Context context) {
        this.f844c = context;
    }

    public static g a(Context context) {
        return new g(context);
    }

    public g a(Activity activity) {
        Intent f = activity instanceof a ? ((a) activity).f() : null;
        if (f == null) {
            f = e.a(activity);
        }
        if (f != null) {
            ComponentName component = f.getComponent();
            if (component == null) {
                component = f.resolveActivity(this.f844c.getPackageManager());
            }
            a(component);
            a(f);
        }
        return this;
    }

    public g a(ComponentName componentName) {
        int size = this.f843b.size();
        try {
            Context context = this.f844c;
            while (true) {
                Intent a2 = e.a(context, componentName);
                if (a2 == null) {
                    return this;
                }
                this.f843b.add(size, a2);
                context = this.f844c;
                componentName = a2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public g a(Intent intent) {
        this.f843b.add(intent);
        return this;
    }

    public void a() {
        a((Bundle) null);
    }

    public void a(Bundle bundle) {
        if (!this.f843b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f843b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (a.g.d.a.a(this.f844c, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f844c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f843b.iterator();
    }
}
