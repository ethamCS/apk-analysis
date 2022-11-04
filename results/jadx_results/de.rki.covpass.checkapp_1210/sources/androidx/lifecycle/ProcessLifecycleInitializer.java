package androidx.lifecycle;

import android.content.Context;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements o1.a<v> {
    @Override // o1.a
    public List<Class<? extends o1.a<?>>> a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public v b(Context context) {
        if (androidx.startup.a.e(context).g(ProcessLifecycleInitializer.class)) {
            r.a(context);
            i0.l(context);
            return i0.k();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
