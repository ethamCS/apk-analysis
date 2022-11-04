package m7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import de.rki.covpass.logging.Lumber;
import kotlin.Metadata;
import m7.b;
import org.conscrypt.BuildConfig;
import timber.log.a;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lm7/l;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", BuildConfig.FLAVOR, "initialized", "Z", "a", "()Z", "b", "(Z)V", "<init>", "()V", "navigation_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static final l f16405a = new l();

    /* renamed from: b */
    private static boolean f16406b;

    private l() {
    }

    public final boolean a() {
        return f16406b;
    }

    public final void b(boolean z10) {
        f16406b = z10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        androidx.fragment.app.w m02;
        b.a aVar;
        hc.t.e(activity, "activity");
        androidx.fragment.app.j jVar = null;
        if (Lumber.Companion.getEnabled()) {
            a.b bVar = timber.log.a.f22457a;
            String name = activity.getClass().getName();
            bVar.d(null, "onActivityCreated, " + name, new Object[0]);
        }
        b.j(activity);
        if (activity instanceof androidx.fragment.app.j) {
            jVar = (androidx.fragment.app.j) activity;
        }
        if (jVar == null || (m02 = jVar.m0()) == null) {
            return;
        }
        aVar = b.f16398c;
        m02.k1(aVar, b.i());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        hc.t.e(activity, "activity");
        if (Lumber.Companion.getEnabled()) {
            a.b bVar = timber.log.a.f22457a;
            String name = activity.getClass().getName();
            bVar.d(null, "onActivityDestroyed, " + name, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        hc.t.e(activity, "activity");
        if (Lumber.Companion.getEnabled()) {
            a.b bVar = timber.log.a.f22457a;
            String name = activity.getClass().getName();
            bVar.d(null, "onActivityPaused, " + name, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        hc.t.e(activity, "activity");
        if (Lumber.Companion.getEnabled()) {
            a.b bVar = timber.log.a.f22457a;
            String name = activity.getClass().getName();
            bVar.d(null, "onActivityResumed, " + name, new Object[0]);
        }
        b.j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        hc.t.e(activity, "activity");
        hc.t.e(bundle, "outState");
        if (Lumber.Companion.getEnabled()) {
            a.b bVar = timber.log.a.f22457a;
            String name = activity.getClass().getName();
            bVar.d(null, "onActivitySaveInstanceState, " + name, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        hc.t.e(activity, "activity");
        if (Lumber.Companion.getEnabled()) {
            a.b bVar = timber.log.a.f22457a;
            String name = activity.getClass().getName();
            bVar.d(null, "onActivityStarted, " + name, new Object[0]);
        }
        b.j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        hc.t.e(activity, "activity");
        if (Lumber.Companion.getEnabled()) {
            a.b bVar = timber.log.a.f22457a;
            String name = activity.getClass().getName();
            bVar.d(null, "onActivityStopped, " + name, new Object[0]);
        }
    }
}
