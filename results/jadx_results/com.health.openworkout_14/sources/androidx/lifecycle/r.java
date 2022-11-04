package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class r extends Fragment {

    /* renamed from: b */
    private a f1258b;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            r.a(activity, e.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            r.a(activity, e.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            r.a(activity, e.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            r.a(activity, e.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            r.a(activity, e.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            r.a(activity, e.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Activity activity, e.a aVar) {
        if (activity instanceof k) {
            ((k) activity).a().i(aVar);
        } else if (!(activity instanceof i)) {
        } else {
            e a2 = ((i) activity).a();
            if (!(a2 instanceof j)) {
                return;
            }
            ((j) a2).i(aVar);
        }
    }

    private void b(e.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), aVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    private void e(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    public static r f(Activity activity) {
        return (r) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new r(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void h(a aVar) {
        this.f1258b = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f1258b);
        b(e.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(e.a.ON_DESTROY);
        this.f1258b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(e.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.f1258b);
        b(e.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.f1258b);
        b(e.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(e.a.ON_STOP);
    }
}