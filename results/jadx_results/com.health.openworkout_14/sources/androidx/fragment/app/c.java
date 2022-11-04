package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
/* loaded from: classes.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler X;
    private Runnable Y = new a();
    private DialogInterface.OnCancelListener Z = new b();
    private DialogInterface.OnDismissListener a0 = new DialogInterface$OnDismissListenerC0017c();
    private int b0 = 0;
    private int c0 = 0;
    private boolean d0 = true;
    private boolean e0 = true;
    private int f0 = -1;
    private boolean g0;
    private Dialog h0;
    private boolean i0;
    private boolean j0;
    private boolean k0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            c.this = r1;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            c.this.a0.onDismiss(c.this.h0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        b() {
            c.this = r1;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (c.this.h0 != null) {
                c cVar = c.this;
                cVar.onCancel(cVar.h0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$c */
    /* loaded from: classes.dex */
    public class DialogInterface$OnDismissListenerC0017c implements DialogInterface.OnDismissListener {
        DialogInterface$OnDismissListenerC0017c() {
            c.this = r1;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (c.this.h0 != null) {
                c cVar = c.this;
                cVar.onDismiss(cVar.h0);
            }
        }
    }

    private void C1(boolean z, boolean z2) {
        if (this.j0) {
            return;
        }
        this.j0 = true;
        this.k0 = false;
        Dialog dialog = this.h0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.h0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.X.getLooper()) {
                    onDismiss(this.h0);
                } else {
                    this.X.post(this.Y);
                }
            }
        }
        this.i0 = true;
        if (this.f0 >= 0) {
            F().D0(this.f0, 1);
            this.f0 = -1;
            return;
        }
        t i = F().i();
        i.n(this);
        if (z) {
            i.i();
        } else {
            i.h();
        }
    }

    public void B1() {
        C1(false, false);
    }

    public Dialog D1() {
        return this.h0;
    }

    @Override // androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        Dialog dialog = this.h0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.b0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.c0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.d0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.e0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public int E1() {
        return this.c0;
    }

    @Override // androidx.fragment.app.Fragment
    public void F0() {
        super.F0();
        Dialog dialog = this.h0;
        if (dialog != null) {
            this.i0 = false;
            dialog.show();
        }
    }

    public Dialog F1(Bundle bundle) {
        return new Dialog(i1(), E1());
    }

    @Override // androidx.fragment.app.Fragment
    public void G0() {
        super.G0();
        Dialog dialog = this.h0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final Dialog G1() {
        Dialog D1 = D1();
        if (D1 != null) {
            return D1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void H1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void I1(m mVar, String str) {
        this.j0 = false;
        this.k0 = true;
        t i = mVar.i();
        i.d(this, str);
        i.h();
    }

    @Override // androidx.fragment.app.Fragment
    public void c0(Bundle bundle) {
        Bundle bundle2;
        super.c0(bundle);
        if (!this.e0) {
            return;
        }
        View P = P();
        if (this.h0 == null) {
            return;
        }
        if (P != null) {
            if (P.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            this.h0.setContentView(P);
        }
        d m = m();
        if (m != null) {
            this.h0.setOwnerActivity(m);
        }
        this.h0.setCancelable(this.d0);
        this.h0.setOnCancelListener(this.Z);
        this.h0.setOnDismissListener(this.a0);
        if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.h0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void f0(Context context) {
        super.f0(context);
        if (!this.k0) {
            this.j0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(Bundle bundle) {
        super.i0(bundle);
        this.X = new Handler();
        this.e0 = this.x == 0;
        if (bundle != null) {
            this.b0 = bundle.getInt("android:style", 0);
            this.c0 = bundle.getInt("android:theme", 0);
            this.d0 = bundle.getBoolean("android:cancelable", true);
            this.e0 = bundle.getBoolean("android:showsDialog", this.e0);
            this.f0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.i0) {
            C1(true, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p0() {
        super.p0();
        Dialog dialog = this.h0;
        if (dialog != null) {
            this.i0 = true;
            dialog.setOnDismissListener(null);
            this.h0.dismiss();
            if (!this.j0) {
                onDismiss(this.h0);
            }
            this.h0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void q0() {
        super.q0();
        if (this.k0 || this.j0) {
            return;
        }
        this.j0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater r0(Bundle bundle) {
        LayoutInflater r0 = super.r0(bundle);
        if (!this.e0 || this.g0) {
            return r0;
        }
        try {
            this.g0 = true;
            Dialog F1 = F1(bundle);
            this.h0 = F1;
            H1(F1, this.b0);
            this.g0 = false;
            return r0.cloneInContext(G1().getContext());
        } catch (Throwable th) {
            this.g0 = false;
            throw th;
        }
    }
}
