package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.a;
import androidx.lifecycle.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class d extends ComponentActivity implements a.b, a.d {
    boolean j;
    boolean k;
    boolean m;
    boolean n;
    boolean o;
    int p;
    b.d.h<String> q;

    /* renamed from: h */
    final h f1040h = h.b(new a());
    final androidx.lifecycle.j i = new androidx.lifecycle.j(this);
    boolean l = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends j<d> implements androidx.lifecycle.w, androidx.activity.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            d.this = r1;
        }

        @Override // androidx.lifecycle.i
        public androidx.lifecycle.e a() {
            return d.this.i;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher c() {
            return d.this.c();
        }

        @Override // androidx.fragment.app.j, androidx.fragment.app.f
        public View e(int i) {
            return d.this.findViewById(i);
        }

        @Override // androidx.fragment.app.j, androidx.fragment.app.f
        public boolean f() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.w
        public androidx.lifecycle.v h() {
            return d.this.h();
        }

        @Override // androidx.fragment.app.j
        public void k(Fragment fragment) {
            d.this.s(fragment);
        }

        @Override // androidx.fragment.app.j
        public LayoutInflater m() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.j
        public void n(Fragment fragment, String[] strArr, int i) {
            d.this.v(fragment, strArr, i);
        }

        @Override // androidx.fragment.app.j
        public boolean o(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.j
        public void p(Fragment fragment, Intent intent, int i, Bundle bundle) {
            d.this.w(fragment, intent, i, bundle);
        }

        @Override // androidx.fragment.app.j
        public void q() {
            d.this.x();
        }

        /* renamed from: r */
        public d l() {
            return d.this;
        }
    }

    private int m(Fragment fragment) {
        if (this.q.p() < 65534) {
            while (this.q.i(this.p) >= 0) {
                this.p = (this.p + 1) % 65534;
            }
            int i = this.p;
            this.q.m(i, fragment.f1016f);
            this.p = (this.p + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void n(int i) {
        if ((i & (-65536)) == 0) {
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }

    private void q() {
        do {
        } while (r(p(), e.b.CREATED));
    }

    private static boolean r(m mVar, e.b bVar) {
        boolean z = false;
        for (Fragment fragment : mVar.f0()) {
            if (fragment != null) {
                if (fragment.y() != null) {
                    z |= r(fragment.s(), bVar);
                }
                if (fragment.a().b().a(e.b.STARTED)) {
                    fragment.R.p(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // androidx.core.app.a.d
    public final void b(int i) {
        if (this.m || i == -1) {
            return;
        }
        n(i);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.j);
        printWriter.print(" mResumed=");
        printWriter.print(this.k);
        printWriter.print(" mStopped=");
        printWriter.print(this.l);
        if (getApplication() != null) {
            b.m.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1040h.u().M(str, fileDescriptor, printWriter, strArr);
    }

    final View o(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1040h.w(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f1040h.v();
        int i3 = i >> 16;
        if (i3 == 0) {
            a.c g2 = androidx.core.app.a.g();
            if (g2 != null && g2.b(this, i, i2, intent)) {
                return;
            }
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i4 = i3 - 1;
        String g3 = this.q.g(i4);
        this.q.n(i4);
        if (g3 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment t = this.f1040h.t(g3);
        if (t != null) {
            t.d0(i & 65535, i2, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + g3);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1040h.v();
        this.f1040h.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1040h.a(null);
        if (bundle != null) {
            this.f1040h.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.p = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.q = new b.d.h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.q.m(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.q == null) {
            this.q = new b.d.h<>();
            this.p = 0;
        }
        super.onCreate(bundle);
        this.i.i(e.a.ON_CREATE);
        this.f1040h.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f1040h.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View o = o(view, str, context, attributeSet);
        return o == null ? super.onCreateView(view, str, context, attributeSet) : o;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View o = o(null, str, context, attributeSet);
        return o == null ? super.onCreateView(str, context, attributeSet) : o;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f1040h.h();
        this.i.i(e.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f1040h.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f1040h.k(menuItem);
        }
        if (i == 6) {
            return this.f1040h.e(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f1040h.j(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1040h.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f1040h.l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.k = false;
        this.f1040h.m();
        this.i.i(e.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f1040h.n(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? t(view, menu) | this.f1040h.o(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1040h.v();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String g2 = this.q.g(i3);
            this.q.n(i3);
            if (g2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f1040h.t(g2);
            if (t != null) {
                t.C0(i & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + g2);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.k = true;
        this.f1040h.v();
        this.f1040h.s();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        q();
        this.i.i(e.a.ON_STOP);
        Parcelable y = this.f1040h.y();
        if (y != null) {
            bundle.putParcelable("android:support:fragments", y);
        }
        if (this.q.p() > 0) {
            bundle.putInt("android:support:next_request_index", this.p);
            int[] iArr = new int[this.q.p()];
            String[] strArr = new String[this.q.p()];
            for (int i = 0; i < this.q.p(); i++) {
                iArr[i] = this.q.l(i);
                strArr[i] = this.q.q(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.l = false;
        if (!this.j) {
            this.j = true;
            this.f1040h.c();
        }
        this.f1040h.v();
        this.f1040h.s();
        this.i.i(e.a.ON_START);
        this.f1040h.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f1040h.v();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.l = true;
        q();
        this.f1040h.r();
        this.i.i(e.a.ON_STOP);
    }

    public m p() {
        return this.f1040h.u();
    }

    public void s(Fragment fragment) {
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.o && i != -1) {
            n(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.o && i != -1) {
            n(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.n && i != -1) {
            n(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.n && i != -1) {
            n(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Deprecated
    protected boolean t(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void u() {
        this.i.i(e.a.ON_RESUME);
        this.f1040h.p();
    }

    void v(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            androidx.core.app.a.i(this, strArr, i);
            return;
        }
        n(i);
        try {
            this.m = true;
            androidx.core.app.a.i(this, strArr, ((m(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.m = false;
        }
    }

    public void w(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.o = true;
        try {
            if (i == -1) {
                androidx.core.app.a.k(this, intent, -1, bundle);
                return;
            }
            n(i);
            androidx.core.app.a.k(this, intent, ((m(fragment) + 1) << 16) + (i & 65535), bundle);
        } finally {
            this.o = false;
        }
    }

    @Deprecated
    public void x() {
        invalidateOptionsMenu();
    }
}
