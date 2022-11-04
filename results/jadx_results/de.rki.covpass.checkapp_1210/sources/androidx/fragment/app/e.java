package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
/* loaded from: classes.dex */
public class e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler R4;

    /* renamed from: a5 */
    private boolean f4053a5;

    /* renamed from: c5 */
    private Dialog f4055c5;

    /* renamed from: d5 */
    private boolean f4056d5;

    /* renamed from: e5 */
    private boolean f4057e5;

    /* renamed from: f5 */
    private boolean f4058f5;
    private Runnable S4 = new a();
    private DialogInterface.OnCancelListener T4 = new b();
    private DialogInterface.OnDismissListener U4 = new c();
    private int V4 = 0;
    private int W4 = 0;
    private boolean X4 = true;
    private boolean Y4 = true;
    private int Z4 = -1;

    /* renamed from: b5 */
    private androidx.lifecycle.e0<androidx.lifecycle.v> f4054b5 = new d();

    /* renamed from: g5 */
    private boolean f4059g5 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            e.this.U4.onDismiss(e.this.f4055c5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        b() {
            e.this = r1;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (e.this.f4055c5 != null) {
                e eVar = e.this;
                eVar.onCancel(eVar.f4055c5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        c() {
            e.this = r1;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (e.this.f4055c5 != null) {
                e eVar = e.this;
                eVar.onDismiss(eVar.f4055c5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements androidx.lifecycle.e0<androidx.lifecycle.v> {
        d() {
            e.this = r1;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(androidx.lifecycle.v vVar) {
            if (vVar == null || !e.this.Y4) {
                return;
            }
            View T1 = e.this.T1();
            if (T1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (e.this.f4055c5 == null) {
                return;
            }
            if (w.L0(3)) {
                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + e.this.f4055c5);
            }
            e.this.f4055c5.setContentView(T1);
        }
    }

    /* renamed from: androidx.fragment.app.e$e */
    /* loaded from: classes.dex */
    class C0049e extends l {

        /* renamed from: a */
        final /* synthetic */ l f4064a;

        C0049e(l lVar) {
            e.this = r1;
            this.f4064a = lVar;
        }

        @Override // androidx.fragment.app.l
        public View d(int i10) {
            return this.f4064a.e() ? this.f4064a.d(i10) : e.this.v2(i10);
        }

        @Override // androidx.fragment.app.l
        public boolean e() {
            return this.f4064a.e() || e.this.w2();
        }
    }

    private void r2(boolean z10, boolean z11, boolean z12) {
        if (this.f4057e5) {
            return;
        }
        this.f4057e5 = true;
        this.f4058f5 = false;
        Dialog dialog = this.f4055c5;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4055c5.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.R4.getLooper()) {
                    onDismiss(this.f4055c5);
                } else {
                    this.R4.post(this.S4);
                }
            }
        }
        this.f4056d5 = true;
        if (this.Z4 >= 0) {
            if (z12) {
                i0().f1(this.Z4, 1);
            } else {
                i0().c1(this.Z4, 1, z10);
            }
            this.Z4 = -1;
            return;
        }
        f0 p10 = i0().p();
        p10.t(true);
        p10.p(this);
        if (z12) {
            p10.j();
        } else if (z10) {
            p10.i();
        } else {
            p10.h();
        }
    }

    private void x2(Bundle bundle) {
        if (this.Y4 && !this.f4059g5) {
            try {
                this.f4053a5 = true;
                Dialog u22 = u2(bundle);
                this.f4055c5 = u22;
                if (this.Y4) {
                    z2(u22, this.V4);
                    Context T = T();
                    if (T instanceof Activity) {
                        this.f4055c5.setOwnerActivity((Activity) T);
                    }
                    this.f4055c5.setCancelable(this.X4);
                    this.f4055c5.setOnCancelListener(this.T4);
                    this.f4055c5.setOnDismissListener(this.U4);
                    this.f4059g5 = true;
                } else {
                    this.f4055c5 = null;
                }
            } finally {
                this.f4053a5 = false;
            }
        }
    }

    public int A2(f0 f0Var, String str) {
        this.f4057e5 = false;
        this.f4058f5 = true;
        f0Var.e(this, str);
        this.f4056d5 = false;
        int h10 = f0Var.h();
        this.Z4 = h10;
        return h10;
    }

    public void B2(w wVar, String str) {
        this.f4057e5 = false;
        this.f4058f5 = true;
        f0 p10 = wVar.p();
        p10.t(true);
        p10.e(this, str);
        p10.h();
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void J0(Bundle bundle) {
        super.J0(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void M0(Context context) {
        super.M0(context);
        y0().h(this.f4054b5);
        if (!this.f4058f5) {
            this.f4057e5 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P0(Bundle bundle) {
        super.P0(bundle);
        this.R4 = new Handler();
        this.Y4 = this.f3916n4 == 0;
        if (bundle != null) {
            this.V4 = bundle.getInt("android:style", 0);
            this.W4 = bundle.getInt("android:theme", 0);
            this.X4 = bundle.getBoolean("android:cancelable", true);
            this.Y4 = bundle.getBoolean("android:showsDialog", this.Y4);
            this.Z4 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void W0() {
        super.W0();
        Dialog dialog = this.f4055c5;
        if (dialog != null) {
            this.f4056d5 = true;
            dialog.setOnDismissListener(null);
            this.f4055c5.dismiss();
            if (!this.f4057e5) {
                onDismiss(this.f4055c5);
            }
            this.f4055c5 = null;
            this.f4059g5 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void X0() {
        super.X0();
        if (!this.f4058f5 && !this.f4057e5) {
            this.f4057e5 = true;
        }
        y0().l(this.f4054b5);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater Y0(Bundle bundle) {
        String str;
        StringBuilder sb2;
        LayoutInflater Y0 = super.Y0(bundle);
        if (this.Y4 && !this.f4053a5) {
            x2(bundle);
            if (w.L0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4055c5;
            return dialog != null ? Y0.cloneInContext(dialog.getContext()) : Y0;
        }
        if (w.L0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (!this.Y4) {
                sb2 = new StringBuilder();
                str = "mShowsDialog = false: ";
            } else {
                sb2 = new StringBuilder();
                str = "mCreatingDialog = true: ";
            }
            sb2.append(str);
            sb2.append(str2);
            Log.d("FragmentManager", sb2.toString());
        }
        return Y0;
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        Dialog dialog = this.f4055c5;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.V4;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.W4;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.X4;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.Y4;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.Z4;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void m1() {
        super.m1();
        Dialog dialog = this.f4055c5;
        if (dialog != null) {
            this.f4056d5 = false;
            dialog.show();
            View decorView = this.f4055c5.getWindow().getDecorView();
            a1.a(decorView, this);
            b1.a(decorView, this);
            k1.f.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void n1() {
        super.n1();
        Dialog dialog = this.f4055c5;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f4056d5) {
            if (w.L0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            r2(true, true, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p1(Bundle bundle) {
        Bundle bundle2;
        super.p1(bundle);
        if (this.f4055c5 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4055c5.onRestoreInstanceState(bundle2);
    }

    public void q2() {
        r2(false, false, false);
    }

    public Dialog s2() {
        return this.f4055c5;
    }

    public int t2() {
        return this.W4;
    }

    public Dialog u2(Bundle bundle) {
        if (w.L0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.f(S1(), t2());
    }

    View v2(int i10) {
        Dialog dialog = this.f4055c5;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void w1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.w1(layoutInflater, viewGroup, bundle);
        if (this.f3928x4 != null || this.f4055c5 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4055c5.onRestoreInstanceState(bundle2);
    }

    boolean w2() {
        return this.f4059g5;
    }

    @Override // androidx.fragment.app.Fragment
    public l y() {
        return new C0049e(super.y());
    }

    public final Dialog y2() {
        Dialog s22 = s2();
        if (s22 != null) {
            return s22;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void z2(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }
}
