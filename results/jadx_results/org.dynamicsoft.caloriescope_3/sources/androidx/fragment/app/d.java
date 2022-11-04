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
import androidx.lifecycle.t;
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
    a.d.h<String> q;
    final f h = f.a(new a());
    final androidx.lifecycle.i i = new androidx.lifecycle.i(this);
    boolean l = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h<d> implements t, androidx.activity.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            d.this = r1;
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public View a(int i) {
            return d.this.findViewById(i);
        }

        @Override // androidx.lifecycle.h
        public androidx.lifecycle.e a() {
            return d.this.i;
        }

        @Override // androidx.fragment.app.h
        public void a(Fragment fragment) {
            d.this.a(fragment);
        }

        @Override // androidx.fragment.app.h
        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher b() {
            return d.this.b();
        }

        @Override // androidx.fragment.app.h
        public boolean b(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public boolean d() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.t
        public androidx.lifecycle.s e() {
            return d.this.e();
        }

        @Override // androidx.fragment.app.h
        public d i() {
            return d.this;
        }

        @Override // androidx.fragment.app.h
        public LayoutInflater j() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public int k() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean l() {
            return d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public void m() {
            d.this.j();
        }
    }

    private static boolean a(i iVar, e.b bVar) {
        boolean z = false;
        for (Fragment fragment : iVar.b()) {
            if (fragment != null) {
                if (fragment.a().a().a(e.b.STARTED)) {
                    fragment.S.b(bVar);
                    z = true;
                }
                if (fragment.s() != null) {
                    z |= a(fragment.l(), bVar);
                }
            }
        }
        return z;
    }

    static void b(int i) {
        if ((i & (-65536)) == 0) {
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }

    private void k() {
        do {
        } while (a(h(), e.b.CREATED));
    }

    final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.h.a(view, str, context, attributeSet);
    }

    @Override // androidx.core.app.a.d
    public final void a(int i) {
        if (this.m || i == -1) {
            return;
        }
        b(i);
    }

    public void a(Fragment fragment) {
    }

    @Deprecated
    protected boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
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
            a.k.a.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.h.j().a(str, fileDescriptor, printWriter, strArr);
    }

    public i h() {
        return this.h.j();
    }

    protected void i() {
        this.i.a(e.a.ON_RESUME);
        this.h.f();
    }

    @Deprecated
    public void j() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.h.k();
        int i3 = i >> 16;
        if (i3 == 0) {
            a.c a2 = androidx.core.app.a.a();
            if (a2 != null && a2.a(this, i, i2, intent)) {
                return;
            }
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i4 = i3 - 1;
        String a3 = this.q.a(i4);
        this.q.c(i4);
        if (a3 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment a4 = this.h.a(a3);
        if (a4 != null) {
            a4.a(i & 65535, i2, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a3);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h.k();
        this.h.a(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.h.a((Fragment) null);
        if (bundle != null) {
            this.h.a(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.p = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.q = new a.d.h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.q.c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.q == null) {
            this.q = new a.d.h<>();
            this.p = 0;
        }
        super.onCreate(bundle);
        this.i.a(e.a.ON_CREATE);
        this.h.b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.h.a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = a(view, str, context, attributeSet);
        return a2 == null ? super.onCreateView(view, str, context, attributeSet) : a2;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a2 = a(null, str, context, attributeSet);
        return a2 == null ? super.onCreateView(str, context, attributeSet) : a2;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.h.c();
        this.i.a(e.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.h.d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.h.b(menuItem);
        }
        if (i == 6) {
            return this.h.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.h.a(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.h.k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.h.a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.k = false;
        this.h.e();
        this.i.a(e.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.h.b(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? a(view, menu) | this.h.b(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.h.k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a2 = this.q.a(i3);
            this.q.c(i3);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a3 = this.h.a(a2);
            if (a3 != null) {
                a3.a(i & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.k = true;
        this.h.k();
        this.h.i();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k();
        this.i.a(e.a.ON_STOP);
        Parcelable l = this.h.l();
        if (l != null) {
            bundle.putParcelable("android:support:fragments", l);
        }
        if (this.q.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.p);
            int[] iArr = new int[this.q.b()];
            String[] strArr = new String[this.q.b()];
            for (int i = 0; i < this.q.b(); i++) {
                iArr[i] = this.q.b(i);
                strArr[i] = this.q.d(i);
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
            this.h.a();
        }
        this.h.k();
        this.h.i();
        this.i.a(e.a.ON_START);
        this.h.g();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.h.k();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.l = true;
        k();
        this.h.h();
        this.i.a(e.a.ON_STOP);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.o && i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.o && i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.n && i != -1) {
            b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.n && i != -1) {
            b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
