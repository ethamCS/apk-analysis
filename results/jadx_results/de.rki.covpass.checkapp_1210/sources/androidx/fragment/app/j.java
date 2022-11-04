package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.b;
import androidx.lifecycle.m;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k1.c;
/* loaded from: classes.dex */
public class j extends ComponentActivity implements b.d {

    /* renamed from: h4 */
    boolean f4127h4;

    /* renamed from: i4 */
    boolean f4128i4;

    /* renamed from: f4 */
    final m f4125f4 = m.b(new a());

    /* renamed from: g4 */
    final androidx.lifecycle.x f4126g4 = new androidx.lifecycle.x(this);

    /* renamed from: j4 */
    boolean f4129j4 = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends o<j> implements androidx.core.content.b, androidx.core.content.c, androidx.core.app.i, androidx.core.app.j, z0, androidx.activity.h, androidx.activity.result.d, k1.e, a0, androidx.core.view.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            j.this = r1;
        }

        @Override // androidx.core.view.i
        public void C(androidx.core.view.l lVar) {
            j.this.C(lVar);
        }

        @Override // androidx.activity.result.d
        public ActivityResultRegistry D() {
            return j.this.D();
        }

        @Override // androidx.core.app.i
        public void E(androidx.core.util.a<androidx.core.app.g> aVar) {
            j.this.E(aVar);
        }

        @Override // androidx.lifecycle.z0
        public y0 I() {
            return j.this.I();
        }

        @Override // androidx.core.app.i
        public void M(androidx.core.util.a<androidx.core.app.g> aVar) {
            j.this.M(aVar);
        }

        @Override // androidx.core.content.b
        public void Q(androidx.core.util.a<Configuration> aVar) {
            j.this.Q(aVar);
        }

        @Override // androidx.fragment.app.a0
        public void a(w wVar, Fragment fragment) {
            j.this.u0(fragment);
        }

        @Override // androidx.lifecycle.v
        public androidx.lifecycle.m c() {
            return j.this.f4126g4;
        }

        @Override // androidx.fragment.app.o, androidx.fragment.app.l
        public View d(int i10) {
            return j.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.o, androidx.fragment.app.l
        public boolean e() {
            Window window = j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.h
        public OnBackPressedDispatcher f() {
            return j.this.f();
        }

        @Override // k1.e
        public k1.c g() {
            return j.this.g();
        }

        @Override // androidx.core.view.i
        public void j(androidx.core.view.l lVar) {
            j.this.j(lVar);
        }

        @Override // androidx.fragment.app.o
        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.content.b
        public void m(androidx.core.util.a<Configuration> aVar) {
            j.this.m(aVar);
        }

        @Override // androidx.fragment.app.o
        public LayoutInflater o() {
            return j.this.getLayoutInflater().cloneInContext(j.this);
        }

        @Override // androidx.fragment.app.o
        public void q() {
            s();
        }

        @Override // androidx.core.app.j
        public void r(androidx.core.util.a<androidx.core.app.k> aVar) {
            j.this.r(aVar);
        }

        public void s() {
            j.this.invalidateOptionsMenu();
        }

        /* renamed from: t */
        public j n() {
            return j.this;
        }

        @Override // androidx.core.content.c
        public void u(androidx.core.util.a<Integer> aVar) {
            j.this.u(aVar);
        }

        @Override // androidx.core.content.c
        public void v(androidx.core.util.a<Integer> aVar) {
            j.this.v(aVar);
        }

        @Override // androidx.core.app.j
        public void y(androidx.core.util.a<androidx.core.app.k> aVar) {
            j.this.y(aVar);
        }
    }

    public j() {
        n0();
    }

    public j(int i10) {
        super(i10);
        n0();
    }

    private void n0() {
        g().h("android:support:lifecycle", new c.AbstractC0210c() { // from class: androidx.fragment.app.i
            @Override // k1.c.AbstractC0210c
            public final Bundle a() {
                Bundle o02;
                o02 = j.this.o0();
                return o02;
            }
        });
        m(new androidx.core.util.a() { // from class: androidx.fragment.app.g
            @Override // androidx.core.util.a
            public final void a(Object obj) {
                j.this.p0((Configuration) obj);
            }
        });
        Y(new androidx.core.util.a() { // from class: androidx.fragment.app.f
            @Override // androidx.core.util.a
            public final void a(Object obj) {
                j.this.q0((Intent) obj);
            }
        });
        X(new c.b() { // from class: androidx.fragment.app.h
            @Override // c.b
            public final void a(Context context) {
                j.this.r0(context);
            }
        });
    }

    public /* synthetic */ Bundle o0() {
        s0();
        this.f4126g4.h(m.b.ON_STOP);
        return new Bundle();
    }

    public /* synthetic */ void p0(Configuration configuration) {
        this.f4125f4.m();
    }

    public /* synthetic */ void q0(Intent intent) {
        this.f4125f4.m();
    }

    public /* synthetic */ void r0(Context context) {
        this.f4125f4.a(null);
    }

    private static boolean t0(w wVar, m.c cVar) {
        boolean z10 = false;
        for (Fragment fragment : wVar.x0()) {
            if (fragment != null) {
                if (fragment.c0() != null) {
                    z10 |= t0(fragment.S(), cVar);
                }
                j0 j0Var = fragment.I4;
                if (j0Var != null && j0Var.c().b().b(m.c.STARTED)) {
                    fragment.I4.i(cVar);
                    z10 = true;
                }
                if (fragment.H4.b().b(m.c.STARTED)) {
                    fragment.H4.o(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.app.b.d
    @Deprecated
    public final void d(int i10) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!S(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f4127h4);
        printWriter.print(" mResumed=");
        printWriter.print(this.f4128i4);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4129j4);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f4125f4.l().Y(str, fileDescriptor, printWriter, strArr);
    }

    final View l0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4125f4.n(view, str, context, attributeSet);
    }

    public w m0() {
        return this.f4125f4.l();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f4125f4.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4126g4.h(m.b.ON_CREATE);
        this.f4125f4.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View l02 = l0(view, str, context, attributeSet);
        return l02 == null ? super.onCreateView(view, str, context, attributeSet) : l02;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View l02 = l0(null, str, context, attributeSet);
        return l02 == null ? super.onCreateView(str, context, attributeSet) : l02;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f4125f4.f();
        this.f4126g4.h(m.b.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 6) {
            return false;
        }
        return this.f4125f4.d(menuItem);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f4128i4 = false;
        this.f4125f4.g();
        this.f4126g4.h(m.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        v0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f4125f4.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f4125f4.m();
        super.onResume();
        this.f4128i4 = true;
        this.f4125f4.k();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f4125f4.m();
        super.onStart();
        this.f4129j4 = false;
        if (!this.f4127h4) {
            this.f4127h4 = true;
            this.f4125f4.c();
        }
        this.f4125f4.k();
        this.f4126g4.h(m.b.ON_START);
        this.f4125f4.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f4125f4.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f4129j4 = true;
        s0();
        this.f4125f4.j();
        this.f4126g4.h(m.b.ON_STOP);
    }

    void s0() {
        do {
        } while (t0(m0(), m.c.CREATED));
    }

    @Deprecated
    public void u0(Fragment fragment) {
    }

    protected void v0() {
        this.f4126g4.h(m.b.ON_RESUME);
        this.f4125f4.h();
    }
}
