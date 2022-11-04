package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
/* loaded from: classes.dex */
public abstract class f extends androidx.fragment.app.c implements DialogInterface.OnClickListener {
    private DialogPreference l0;
    private CharSequence m0;
    private CharSequence n0;
    private CharSequence o0;
    private CharSequence p0;
    private int q0;
    private BitmapDrawable r0;
    private int s0;

    private void P1(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.m0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.n0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.o0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.p0);
        bundle.putInt("PreferenceDialogFragment.layout", this.q0);
        BitmapDrawable bitmapDrawable = this.r0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog F1(Bundle bundle) {
        androidx.fragment.app.d m = m();
        this.s0 = -2;
        c.a aVar = new c.a(m);
        aVar.q(this.m0);
        aVar.f(this.r0);
        aVar.m(this.n0, this);
        aVar.i(this.o0, this);
        View M1 = M1(m);
        if (M1 != null) {
            L1(M1);
            aVar.r(M1);
        } else {
            aVar.g(this.p0);
        }
        O1(aVar);
        androidx.appcompat.app.c a2 = aVar.a();
        if (K1()) {
            P1(a2);
        }
        return a2;
    }

    public DialogPreference J1() {
        if (this.l0 == null) {
            this.l0 = (DialogPreference) ((DialogPreference.a) O()).g(r().getString("key"));
        }
        return this.l0;
    }

    protected boolean K1() {
        return false;
    }

    public void L1(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.p0;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() == i) {
                return;
            }
            findViewById.setVisibility(i);
        }
    }

    protected View M1(Context context) {
        int i = this.q0;
        if (i == 0) {
            return null;
        }
        return A().inflate(i, (ViewGroup) null);
    }

    public abstract void N1(boolean z);

    public void O1(c.a aVar) {
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void i0(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.i0(bundle);
        Fragment O = O();
        if (O instanceof DialogPreference.a) {
            DialogPreference.a aVar = (DialogPreference.a) O;
            String string = r().getString("key");
            if (bundle != null) {
                this.m0 = bundle.getCharSequence("PreferenceDialogFragment.title");
                this.n0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
                this.o0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
                this.p0 = bundle.getCharSequence("PreferenceDialogFragment.message");
                this.q0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
                Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
                if (bitmap == null) {
                    return;
                }
                this.r0 = new BitmapDrawable(H(), bitmap);
                return;
            }
            DialogPreference dialogPreference = (DialogPreference) aVar.g(string);
            this.l0 = dialogPreference;
            this.m0 = dialogPreference.J0();
            this.n0 = this.l0.L0();
            this.o0 = this.l0.K0();
            this.p0 = this.l0.I0();
            this.q0 = this.l0.H0();
            Drawable G0 = this.l0.G0();
            if (G0 == null || (G0 instanceof BitmapDrawable)) {
                bitmapDrawable = (BitmapDrawable) G0;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(G0.getIntrinsicWidth(), G0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                G0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                G0.draw(canvas);
                bitmapDrawable = new BitmapDrawable(H(), createBitmap);
            }
            this.r0 = bitmapDrawable;
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.s0 = i;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        N1(this.s0 == -1);
    }
}
