package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class i<S> extends androidx.fragment.app.c {
    static final Object C0 = "CONFIRM_BUTTON_TAG";
    static final Object D0 = "CANCEL_BUTTON_TAG";
    static final Object E0 = "TOGGLE_BUTTON_TAG";
    private d.a.a.a.a0.g A0;
    private Button B0;
    private final LinkedHashSet<j<? super S>> l0 = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> m0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> n0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> o0 = new LinkedHashSet<>();
    private int p0;
    private com.google.android.material.datepicker.d<S> q0;
    private p<S> r0;
    private com.google.android.material.datepicker.a s0;
    private h<S> t0;
    private int u0;
    private CharSequence v0;
    private boolean w0;
    private int x0;
    private TextView y0;
    private CheckableImageButton z0;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
            i.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.l0.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(i.this.V1());
            }
            i.this.B1();
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
            i.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.m0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            i.this.B1();
        }
    }

    /* loaded from: classes.dex */
    public class c extends o<S> {
        c() {
            i.this = r1;
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s) {
            i.this.b2();
            i.this.B0.setEnabled(i.this.q0.h());
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        d() {
            i.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.B0.setEnabled(i.this.q0.h());
            i.this.z0.toggle();
            i iVar = i.this;
            iVar.c2(iVar.z0);
            i.this.Z1();
        }
    }

    private static Drawable R1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, b.a.k.a.a.d(context, d.a.a.a.e.b_res_0x7f0800a3));
        stateListDrawable.addState(new int[0], b.a.k.a.a.d(context, d.a.a.a.e.c_res_0x7f0800a5));
        return stateListDrawable;
    }

    private static int S1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(d.a.a.a.d.t) + resources.getDimensionPixelOffset(d.a.a.a.d.u) + resources.getDimensionPixelOffset(d.a.a.a.d.s);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(d.a.a.a.d.o);
        int i = m.f3089f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(d.a.a.a.d.m) * i) + ((i - 1) * resources.getDimensionPixelOffset(d.a.a.a.d.r)) + resources.getDimensionPixelOffset(d.a.a.a.d.k_res_0x7f0700cd);
    }

    private static int U1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(d.a.a.a.d.l_res_0x7f0700ce);
        int i = l.m().f3086f;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(d.a.a.a.d.n) * i) + ((i - 1) * resources.getDimensionPixelOffset(d.a.a.a.d.q));
    }

    private int W1(Context context) {
        int i = this.p0;
        return i != 0 ? i : this.q0.e(context);
    }

    private void X1(Context context) {
        this.z0.setTag(E0);
        this.z0.setImageDrawable(R1(context));
        this.z0.setChecked(this.x0 != 0);
        b.g.l.t.i0(this.z0, null);
        c2(this.z0);
        this.z0.setOnClickListener(new d());
    }

    public static boolean Y1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d.a.a.a.x.b.c(context, d.a.a.a.b.s, h.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public void Z1() {
        this.t0 = h.Q1(this.q0, W1(i1()), this.s0);
        this.r0 = this.z0.isChecked() ? k.B1(this.q0, this.s0) : this.t0;
        b2();
        androidx.fragment.app.t i = s().i();
        i.o(d.a.a.a.f.l_res_0x7f090113, this.r0);
        i.j();
        this.r0.z1(new c());
    }

    public static long a2() {
        return l.m().f3088h;
    }

    public void b2() {
        String T1 = T1();
        this.y0.setContentDescription(String.format(N(d.a.a.a.i.h_res_0x7f10009e), T1));
        this.y0.setText(T1);
    }

    public void c2(CheckableImageButton checkableImageButton) {
        this.z0.setContentDescription(checkableImageButton.getContext().getString(this.z0.isChecked() ? d.a.a.a.i.k_res_0x7f1000b7 : d.a.a.a.i.m));
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void E0(Bundle bundle) {
        super.E0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.p0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.q0);
        a.b bVar = new a.b(this.s0);
        if (this.t0.M1() != null) {
            bVar.b(this.t0.M1().f3088h);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.u0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.v0);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void F0() {
        super.F0();
        Window window = G1().getWindow();
        if (this.w0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.A0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = H().getDimensionPixelOffset(d.a.a.a.d.p);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new d.a.a.a.r.a(G1(), rect));
        }
        Z1();
    }

    @Override // androidx.fragment.app.c
    public final Dialog F1(Bundle bundle) {
        Dialog dialog = new Dialog(i1(), W1(i1()));
        Context context = dialog.getContext();
        this.w0 = Y1(context);
        int c2 = d.a.a.a.x.b.c(context, d.a.a.a.b.l_res_0x7f0400c4, i.class.getCanonicalName());
        d.a.a.a.a0.g gVar = new d.a.a.a.a0.g(context, null, d.a.a.a.b.s, d.a.a.a.j.o);
        this.A0 = gVar;
        gVar.M(context);
        this.A0.V(ColorStateList.valueOf(c2));
        this.A0.U(b.g.l.t.t(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void G0() {
        this.r0.A1();
        super.G0();
    }

    public String T1() {
        return this.q0.d(t());
    }

    public final S V1() {
        return this.q0.b();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void i0(Bundle bundle) {
        super.i0(bundle);
        if (bundle == null) {
            bundle = r();
        }
        this.p0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.q0 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.s0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.u0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.v0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.x0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.w0 ? d.a.a.a.h.p_res_0x7f0c0056 : d.a.a.a.h.o_res_0x7f0c0055, viewGroup);
        Context context = inflate.getContext();
        if (this.w0) {
            inflate.findViewById(d.a.a.a.f.l_res_0x7f090113).setLayoutParams(new LinearLayout.LayoutParams(U1(context), -2));
        } else {
            View findViewById = inflate.findViewById(d.a.a.a.f.m_res_0x7f090114);
            View findViewById2 = inflate.findViewById(d.a.a.a.f.l_res_0x7f090113);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(U1(context), -1));
            findViewById2.setMinimumHeight(S1(i1()));
        }
        TextView textView = (TextView) inflate.findViewById(d.a.a.a.f.r_res_0x7f09011f);
        this.y0 = textView;
        b.g.l.t.k0(textView, 1);
        this.z0 = (CheckableImageButton) inflate.findViewById(d.a.a.a.f.s_res_0x7f090121);
        TextView textView2 = (TextView) inflate.findViewById(d.a.a.a.f.t_res_0x7f090125);
        CharSequence charSequence = this.v0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.u0);
        }
        X1(context);
        this.B0 = (Button) inflate.findViewById(d.a.a.a.f.b_res_0x7f090089);
        if (this.q0.h()) {
            this.B0.setEnabled(true);
        } else {
            this.B0.setEnabled(false);
        }
        this.B0.setTag(C0);
        this.B0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(d.a.a.a.f.a_res_0x7f090074);
        button.setTag(D0);
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.n0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.o0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) P();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
